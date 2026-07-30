package com.crrepa.band.my.health.bodytemperature;

import com.crrepa.band.my.ble.band.cmd.d;
import com.crrepa.band.my.health.bodytemperature.model.BandOnceTempChangeEvent;
import com.crrepa.band.my.health.bodytemperature.model.BandTimingTempChangeEvent;
import com.crrepa.band.my.model.db.OnceTemp;
import com.crrepa.band.my.model.db.TimingTemp;
import com.crrepa.band.my.model.db.helper.TimingTempSaveHelper;
import com.crrepa.band.my.model.db.proxy.OnceTempDaoProxy;
import com.crrepa.ble.conn.bean.CRPTempInfo;
import com.crrepa.ble.conn.listener.CRPTempChangeListener;
import com.crrepa.ble.conn.type.CRPTempTimeType;
import com.orhanobut.logger.f;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class a implements CRPTempChangeListener {
    private static final float DEFAULT_TEMP = 0.0f;
    private TimingTempSaveHelper timingTempSaveHelper = new TimingTempSaveHelper();
    private OnceTempDaoProxy onceTempDaoProxy = new OnceTempDaoProxy();
    private float lastTemp = 0.0f;

    /* renamed from: com.crrepa.band.my.health.bodytemperature.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0198a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$conn$type$CRPTempTimeType;

        static {
            int[] iArr = new int[CRPTempTimeType.values().length];
            $SwitchMap$com$crrepa$ble$conn$type$CRPTempTimeType = iArr;
            try {
                iArr[CRPTempTimeType.TODAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPTempTimeType[CRPTempTimeType.YESTERDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPTempChangeListener
    public void onContinueState(boolean z7) {
    }

    @Override // com.crrepa.ble.conn.listener.CRPTempChangeListener
    public void onContinueTemp(CRPTempInfo cRPTempInfo) {
        List<Float> tempList = cRPTempInfo.getTempList();
        f.d("onTimingMeasureTemp: " + cRPTempInfo.getType());
        f.d("onTimingMeasureTemp: " + tempList.toString());
        TimingTemp convertTimingTemp = l2.a.convertTimingTemp(tempList);
        int i8 = C0198a.$SwitchMap$com$crrepa$ble$conn$type$CRPTempTimeType[cRPTempInfo.getType().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                return;
            }
            this.timingTempSaveHelper.saveHistoryTemp(-1, convertTimingTemp);
        } else {
            this.timingTempSaveHelper.saveTodayTemp(convertTimingTemp);
            c.getDefault().post(new BandTimingTempChangeEvent(convertTimingTemp));
            d.getInstance().syncYesterdayTemp();
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPTempChangeListener
    public void onMeasureState(boolean z7) {
        f.d("onMeasureTempState: " + z7);
        if (z7) {
            return;
        }
        OnceTemp onceTemp = new OnceTemp();
        if (l2.a.isValidTemp(this.lastTemp)) {
            onceTemp.setDate(new Date());
            onceTemp.setTemp(Float.valueOf(this.lastTemp));
            this.onceTempDaoProxy.insert(onceTemp);
        }
        c.getDefault().post(new BandOnceTempChangeEvent(onceTemp));
        this.lastTemp = 0.0f;
    }

    @Override // com.crrepa.ble.conn.listener.CRPTempChangeListener
    public void onMeasureTemp(float f8) {
        f.d("onMeasureTemp: " + f8);
        this.lastTemp = f8;
    }
}
