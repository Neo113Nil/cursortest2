package i1;

import com.crrepa.band.my.device.muslim.model.BandMuslimPrayMethodChangeEvent;
import com.crrepa.band.my.device.muslim.model.BandMuslimPrayReminderStateChangeEvent;
import com.crrepa.band.my.device.muslim.model.BandMuslimUpdateLocationEvent;
import com.crrepa.ble.conn.bean.CRPMuslimPrayerCalculationInfo;
import com.crrepa.ble.conn.listener.CRPMuslimPrayerSettingListener;
import com.crrepa.ble.conn.type.CRPMuslimPrayerCalculationType;
import com.crrepa.ble.conn.type.CRPMuslimPrayerNotifcationType;
import com.moyoung.dafit.module.common.utils.x0;
import com.orhanobut.logger.f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class c implements CRPMuslimPrayerSettingListener {
    @Override // com.crrepa.ble.conn.listener.CRPMuslimPrayerSettingListener
    public void onNotificationChange(boolean z7, Map<CRPMuslimPrayerNotifcationType, Boolean> map) {
        com.crrepa.band.my.device.muslim.utils.c.savePraySwitchState(z7);
        boolean[] prayTypeStatusArray = com.crrepa.band.my.device.muslim.utils.b.getInstance().getPrayTypeStatusArray(map);
        f.d("watch-muslim ==> praySwitchChange-isOpen : " + z7 + "; switchStatusArray : " + Arrays.toString(prayTypeStatusArray));
        StringBuilder sb = new StringBuilder();
        sb.append("watch-muslim ==> praySwitchChange-statusMap : ");
        sb.append(map);
        f.d(sb.toString());
        com.crrepa.band.my.device.muslim.utils.c.savePrayTimeSwitchArray(prayTypeStatusArray);
        org.greenrobot.eventbus.c.getDefault().post(new BandMuslimPrayReminderStateChangeEvent(true));
    }

    @Override // com.crrepa.ble.conn.listener.CRPMuslimPrayerSettingListener
    public void onPrayerCalculationTypeChange(CRPMuslimPrayerCalculationInfo cRPMuslimPrayerCalculationInfo) {
        f.d("watch-muslim ==> calculationTypeChange-calculationType : " + cRPMuslimPrayerCalculationInfo.getType());
        f.d("watch-muslim ==> calculationTypeChange-asrCalculationType : " + cRPMuslimPrayerCalculationInfo.getAsrType());
        com.crrepa.band.my.device.muslim.utils.c.savePrayMethod(com.crrepa.band.my.device.muslim.utils.b.getInstance().getMethodType(cRPMuslimPrayerCalculationInfo.getType()));
        if (cRPMuslimPrayerCalculationInfo.getAsrType() != null) {
            com.crrepa.band.my.device.muslim.utils.c.saveAsrJuristicMethod(com.crrepa.band.my.device.muslim.utils.b.getInstance().getAsrMethodType(cRPMuslimPrayerCalculationInfo.getAsrType()));
        }
        org.greenrobot.eventbus.c.getDefault().post(new BandMuslimPrayMethodChangeEvent());
        List<CRPMuslimPrayerCalculationType> supportedCalculationTypeList = cRPMuslimPrayerCalculationInfo.getSupportedCalculationTypeList();
        if (x0.isNotEmpty(supportedCalculationTypeList) && supportedCalculationTypeList.contains(CRPMuslimPrayerCalculationType.SIHAT)) {
            com.crrepa.band.my.device.muslim.utils.c.setSupportSIHATKEMENAG(true);
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPMuslimPrayerSettingListener
    public void onPrayersStateChange(boolean z7, List<Integer> list) {
        f.d("watch-muslim ==> duasChange-isFavorite : " + z7 + "; indexList : " + list);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            System.out.println("watch-muslim ===> duasChange ===" + intValue);
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPMuslimPrayerSettingListener
    public void onSavedPrayersChange(List<Integer> list) {
        f.d("watch-muslim ==> queryDuas-indexList : " + list);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            System.out.println("watch-muslim ===> queryDuas ===" + intValue);
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPMuslimPrayerSettingListener
    public void updateLocation() {
        f.d("watch-muslim ==> updateLocation...");
        org.greenrobot.eventbus.c.getDefault().post(new BandMuslimUpdateLocationEvent());
    }
}
