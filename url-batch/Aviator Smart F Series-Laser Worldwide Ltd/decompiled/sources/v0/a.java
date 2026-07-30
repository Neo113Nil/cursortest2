package v0;

import com.crrepa.band.my.model.db.Alarm;
import com.crrepa.ble.conn.bean.CRPAlarmInfo;

/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static CRPAlarmInfo convert(Alarm alarm) {
        CRPAlarmInfo cRPAlarmInfo = new CRPAlarmInfo();
        cRPAlarmInfo.setId(alarm.getAlarm_id());
        cRPAlarmInfo.setHour(alarm.getHour().intValue());
        cRPAlarmInfo.setMinute(alarm.getMinute().intValue());
        cRPAlarmInfo.setRepeatMode(alarm.getRepeat().intValue());
        cRPAlarmInfo.setEnable(alarm.getSwitchOn().booleanValue());
        return cRPAlarmInfo;
    }

    public static Alarm convertAlarm(CRPAlarmInfo cRPAlarmInfo) {
        Alarm alarm = new Alarm();
        alarm.setHour(Integer.valueOf(cRPAlarmInfo.getHour()));
        alarm.setMinute(Integer.valueOf(cRPAlarmInfo.getMinute()));
        alarm.setAlarm_id(cRPAlarmInfo.getId());
        alarm.setRepeat(Integer.valueOf(cRPAlarmInfo.getRepeatMode()));
        alarm.setSwitchOn(Boolean.valueOf(cRPAlarmInfo.isEnable()));
        return alarm;
    }
}
