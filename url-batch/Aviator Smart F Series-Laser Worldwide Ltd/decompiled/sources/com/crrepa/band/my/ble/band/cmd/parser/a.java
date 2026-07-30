package com.crrepa.band.my.ble.band.cmd.parser;

import com.crrepa.band.my.health.bloodoxygen.model.BandHeartRateResultEvent;
import com.crrepa.band.my.home.training.model.HomeTrainingEvent;
import com.crrepa.band.my.model.db.ActiveHeartRate;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.crrepa.band.my.model.db.proxy.ActiveHeartRateDaoProxy;
import com.crrepa.band.my.model.db.proxy.MovementHeartRateDaoProxy;
import com.crrepa.band.my.training.model.BandMovementHeartRateChangeEvent;
import com.crrepa.ble.conn.bean.CRPHeartRateInfo;
import com.crrepa.ble.conn.bean.CRPMovementHeartRateInfo;
import com.crrepa.ble.conn.type.CRPHistoryDynamicRateType;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class a {
    private static final long REASONABLE_ACTIVE_TIME = 18000000;
    private CRPHistoryDynamicRateType currentDynamicRateType;
    private ActiveHeartRate lastActiveHeartRate;

    /* renamed from: com.crrepa.band.my.ble.band.cmd.parser.a$a, reason: collision with other inner class name */
    class C0153a implements Consumer {
        C0153a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            f.d("syncMovementHeartRate");
            com.crrepa.band.my.ble.band.cmd.d.getInstance().syncMovementHeartRate();
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$conn$type$CRPHistoryDynamicRateType;

        static {
            int[] iArr = new int[CRPHistoryDynamicRateType.values().length];
            $SwitchMap$com$crrepa$ble$conn$type$CRPHistoryDynamicRateType = iArr;
            try {
                iArr[CRPHistoryDynamicRateType.FIRST_HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPHistoryDynamicRateType[CRPHistoryDynamicRateType.SECOND_HEART_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private boolean isReasonableActiveTime(long j8, long j9) {
        return j9 - j8 <= REASONABLE_ACTIVE_TIME;
    }

    private void queryNextActiveHeartRate(CRPHistoryDynamicRateType cRPHistoryDynamicRateType) {
        CRPHistoryDynamicRateType cRPHistoryDynamicRateType2;
        if (cRPHistoryDynamicRateType == null) {
            return;
        }
        int i8 = b.$SwitchMap$com$crrepa$ble$conn$type$CRPHistoryDynamicRateType[cRPHistoryDynamicRateType.ordinal()];
        if (i8 == 1) {
            cRPHistoryDynamicRateType2 = CRPHistoryDynamicRateType.SECOND_HEART_RATE;
        } else if (i8 != 2) {
            return;
        } else {
            cRPHistoryDynamicRateType2 = CRPHistoryDynamicRateType.THIRD_HEART_RATE;
        }
        com.crrepa.band.my.ble.band.cmd.d.getInstance().syncLastDynamicHeartRate(cRPHistoryDynamicRateType2);
    }

    private void saveActiveHeartRate(ActiveHeartRate activeHeartRate) {
        if (isReasonableActiveTime(activeHeartRate.getStartDate().getTime(), activeHeartRate.getEndDate().getTime())) {
            new ActiveHeartRateDaoProxy().insert(activeHeartRate);
            org.greenrobot.eventbus.c.getDefault().post(new BandHeartRateResultEvent(activeHeartRate));
        }
    }

    private void saveMovementHeartRate(CRPMovementHeartRateInfo cRPMovementHeartRateInfo, ActiveHeartRate activeHeartRate) {
        MovementHeartRate movementHeartRate = k0.c.toMovementHeartRate(cRPMovementHeartRateInfo, activeHeartRate);
        if (movementHeartRate == null) {
            f.e("movementHeartRate is null!", new Object[0]);
        } else if (isReasonableActiveTime(movementHeartRate.getStartTime().longValue(), movementHeartRate.getEndTime().longValue())) {
            new MovementHeartRateDaoProxy().save(movementHeartRate);
            org.greenrobot.eventbus.c.getDefault().post(new BandMovementHeartRateChangeEvent());
            org.greenrobot.eventbus.c.getDefault().post(new HomeTrainingEvent());
        }
    }

    private void syncMovementHeartRate() {
        Observable.timer(1L, TimeUnit.SECONDS).subscribe(new C0153a());
    }

    public void parseDynamicHeartRate(CRPHistoryDynamicRateType cRPHistoryDynamicRateType, CRPHeartRateInfo cRPHeartRateInfo) {
        f.d("parseDynamicHeartRate: " + cRPHeartRateInfo);
        ActiveHeartRate activeHeartRate = k0.c.toActiveHeartRate(cRPHeartRateInfo);
        if (!com.crrepa.band.my.ble.band.utils.a.getInstance().hasMovementHeartRate()) {
            saveActiveHeartRate(activeHeartRate);
            return;
        }
        this.lastActiveHeartRate = activeHeartRate;
        this.currentDynamicRateType = cRPHistoryDynamicRateType;
        syncMovementHeartRate();
    }

    public void parseMovementHeartRate(List<CRPMovementHeartRateInfo> list) {
        CRPMovementHeartRateInfo cRPMovementHeartRateInfo = null;
        long j8 = 0;
        for (CRPMovementHeartRateInfo cRPMovementHeartRateInfo2 : list) {
            if (cRPMovementHeartRateInfo2 != null) {
                if (com.crrepa.band.my.ble.band.utils.a.getInstance().hasTimingHeartRate() || this.lastActiveHeartRate != null) {
                    if (this.lastActiveHeartRate == null) {
                        return;
                    }
                    f.d("lastActiveHeartRate start time: " + this.lastActiveHeartRate.getStartDate().getTime());
                    f.d("movement measure start time: " + cRPMovementHeartRateInfo2.getStartTime());
                    long abs = Math.abs(this.lastActiveHeartRate.getStartDate().getTime() - cRPMovementHeartRateInfo2.getStartTime());
                    f.d("start time offset: " + abs);
                    if (j8 == 0 || abs < j8) {
                        cRPMovementHeartRateInfo = cRPMovementHeartRateInfo2;
                        j8 = abs;
                    }
                } else if (com.crrepa.band.my.ble.band.utils.a.getInstance().has24HourHeartRate()) {
                    if (new MovementHeartRateDaoProxy().save(k0.c.toMovementHeartRate(cRPMovementHeartRateInfo2))) {
                        org.greenrobot.eventbus.c.getDefault().post(new BandMovementHeartRateChangeEvent());
                        org.greenrobot.eventbus.c.getDefault().post(new HomeTrainingEvent());
                    }
                }
            }
        }
        if (cRPMovementHeartRateInfo != null) {
            saveMovementHeartRate(cRPMovementHeartRateInfo, this.lastActiveHeartRate);
        }
        queryNextActiveHeartRate(this.currentDynamicRateType);
    }
}
