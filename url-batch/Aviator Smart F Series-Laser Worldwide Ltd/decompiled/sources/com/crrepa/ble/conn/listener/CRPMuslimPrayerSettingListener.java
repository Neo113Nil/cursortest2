package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPMuslimPrayerCalculationInfo;
import com.crrepa.ble.conn.type.CRPMuslimPrayerNotifcationType;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface CRPMuslimPrayerSettingListener {
    void onNotificationChange(boolean z7, Map<CRPMuslimPrayerNotifcationType, Boolean> map);

    void onPrayerCalculationTypeChange(CRPMuslimPrayerCalculationInfo cRPMuslimPrayerCalculationInfo);

    void onPrayersStateChange(boolean z7, List<Integer> list);

    void onSavedPrayersChange(List<Integer> list);

    void updateLocation();
}
