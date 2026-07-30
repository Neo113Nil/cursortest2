package h1;

import com.crrepa.band.my.device.muslim.model.BandMuslimSupportEvent;
import com.crrepa.band.my.device.muslim.model.BandMuslimTasbihChangeEvent;
import com.crrepa.band.my.device.muslim.utils.b;
import com.crrepa.band.my.device.muslim.utils.c;
import com.crrepa.ble.conn.bean.CRPMuslimTasbihSettingInfo;
import com.crrepa.ble.conn.callback.CRPMuslimTasbihSettingCallback;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class a implements CRPMuslimTasbihSettingCallback {
    @Override // com.crrepa.ble.conn.callback.CRPMuslimTasbihSettingCallback
    public void onTasbihSetting(CRPMuslimTasbihSettingInfo cRPMuslimTasbihSettingInfo) {
        f.d("watch-muslim ==> queryTasbihSetting : " + cRPMuslimTasbihSettingInfo.toString());
        if (!c.isSupportMuslim()) {
            c.saveSupportMuslim(true);
            org.greenrobot.eventbus.c.getDefault().post(new BandMuslimSupportEvent());
        }
        c.saveTasbihSwitchState(cRPMuslimTasbihSettingInfo.isEnable());
        c.saveTasbihStartTime(cRPMuslimTasbihSettingInfo.getStartHour(), cRPMuslimTasbihSettingInfo.getStartMinutes());
        c.saveTasbihEndTime(cRPMuslimTasbihSettingInfo.getEndHour(), cRPMuslimTasbihSettingInfo.getEndMinutes());
        c.saveTasbihIntervalTime(cRPMuslimTasbihSettingInfo.getInterval());
        c.saveTasbihWeekDateStateArray(b.getInstance().getWeekDateStateArray(cRPMuslimTasbihSettingInfo.getRepeatMode()));
        org.greenrobot.eventbus.c.getDefault().post(new BandMuslimTasbihChangeEvent());
    }
}
