package com.crrepa.band.my.ble.band.cmd.listener;

import com.crrepa.band.my.health.bloodoxygen.model.BandHeartRateChangeEvent;
import com.crrepa.band.my.health.heartrate.model.Band24HoursHeartRateChangeEvent;
import com.crrepa.band.my.health.heartrate.model.BandOnceHeartRateChangeEvent;
import com.crrepa.band.my.model.db.HeartRate;
import com.crrepa.band.my.model.db.OnceHeartRate;
import com.crrepa.band.my.model.db.helper.HeartRateSaveHelper;
import com.crrepa.band.my.model.db.proxy.OnceHeartRateDaoProxy;
import com.crrepa.ble.conn.bean.CRPHeartRateInfo;
import com.crrepa.ble.conn.bean.CRPHistoryHeartRateInfo;
import com.crrepa.ble.conn.bean.CRPMovementHeartRateInfo;
import com.crrepa.ble.conn.listener.CRPHeartRateChangeListener;
import com.crrepa.ble.conn.type.CRPHistoryDay;
import com.crrepa.ble.conn.type.CRPHistoryDynamicRateType;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class i implements CRPHeartRateChangeListener {
    private static final long MEASURE_PERIOD = 30000;
    private static final int ONCE_HEART_RATE_MEASURE_COUNT = 12;
    private int heartRateMeasureCount = 0;
    private com.crrepa.band.my.ble.band.cmd.parser.a movementHeartRateParser = new com.crrepa.band.my.ble.band.cmd.parser.a();
    private Disposable subscribe;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            i.this.resetHeartRateMeasureCount();
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$conn$type$CRPHistoryDay;

        static {
            int[] iArr = new int[CRPHistoryDay.values().length];
            $SwitchMap$com$crrepa$ble$conn$type$CRPHistoryDay = iArr;
            try {
                iArr[CRPHistoryDay.TODAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private void cancleReset() {
        Disposable disposable = this.subscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        com.orhanobut.logger.f.d("cancleReset");
        this.subscribe.dispose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetHeartRateMeasureCount() {
        com.orhanobut.logger.f.d("resetHeartRateMeasureCount");
        this.heartRateMeasureCount = 0;
    }

    private void resetMeasureStatus() {
        Disposable disposable = this.subscribe;
        if (disposable == null || disposable.isDisposed()) {
            this.subscribe = Observable.timer(30000L, TimeUnit.MILLISECONDS).subscribe(new a());
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPHeartRateChangeListener
    public void on24HourMeasureResult(CRPHeartRateInfo cRPHeartRateInfo) {
        HeartRate convert24HoursHeartRate = k0.c.convert24HoursHeartRate(cRPHeartRateInfo);
        if (convert24HoursHeartRate == null) {
            return;
        }
        com.crrepa.band.my.ble.band.cmd.d.getInstance().queryHistoryTimingHeartRate(cRPHeartRateInfo.getHistoryDay().nextDay());
        com.orhanobut.logger.f.d("on24HourMeasureResult: " + cRPHeartRateInfo.toString());
        if (b.$SwitchMap$com$crrepa$ble$conn$type$CRPHistoryDay[cRPHeartRateInfo.getHistoryDay().ordinal()] == 1) {
            convert24HoursHeartRate.setDate(new Date());
            org.greenrobot.eventbus.c.getDefault().post(new Band24HoursHeartRateChangeEvent(convert24HoursHeartRate));
            com.crrepa.band.my.ble.band.cmd.d.getInstance().syncMovementHeartRate();
        } else if (convert24HoursHeartRate.getAverage().intValue() == 0) {
            return;
        }
        HeartRateSaveHelper.save24HourHeartRate(convert24HoursHeartRate);
    }

    @Override // com.crrepa.ble.conn.listener.CRPHeartRateChangeListener
    public void onHistoryHeartRate(List<CRPHistoryHeartRateInfo> list) {
        new OnceHeartRateDaoProxy().saveHistoryList(list);
        org.greenrobot.eventbus.c.getDefault().post(new BandOnceHeartRateChangeEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPHeartRateChangeListener
    public void onMeasureComplete(CRPHistoryDynamicRateType cRPHistoryDynamicRateType, CRPHeartRateInfo cRPHeartRateInfo) {
        this.movementHeartRateParser.parseDynamicHeartRate(cRPHistoryDynamicRateType, cRPHeartRateInfo);
    }

    @Override // com.crrepa.ble.conn.listener.CRPHeartRateChangeListener
    public void onMeasuring(int i8) {
        com.orhanobut.logger.f.d("heartRate: " + i8);
        int i9 = this.heartRateMeasureCount;
        if (12 < i9) {
            org.greenrobot.eventbus.c.getDefault().post(new BandHeartRateChangeEvent(i8));
            cancleReset();
        } else {
            this.heartRateMeasureCount = i9 + 1;
            resetMeasureStatus();
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPHeartRateChangeListener
    public void onMovementMeasureResult(List<CRPMovementHeartRateInfo> list) {
        this.movementHeartRateParser.parseMovementHeartRate(list);
    }

    @Override // com.crrepa.ble.conn.listener.CRPHeartRateChangeListener
    public void onOnceMeasureComplete(int i8) {
        com.orhanobut.logger.f.d("onOnceMeasureComplete: " + i8);
        OnceHeartRate parseOnceHeartRate = com.crrepa.band.my.ble.band.cmd.parser.b.parseOnceHeartRate(i8);
        org.greenrobot.eventbus.c.getDefault().post(new BandOnceHeartRateChangeEvent(parseOnceHeartRate));
        if (parseOnceHeartRate != null) {
            new OnceHeartRateDaoProxy().insert(parseOnceHeartRate);
            com.crrepa.band.my.health.base.c.getInstance().uploadBandHeartRate(i8);
        }
    }
}
