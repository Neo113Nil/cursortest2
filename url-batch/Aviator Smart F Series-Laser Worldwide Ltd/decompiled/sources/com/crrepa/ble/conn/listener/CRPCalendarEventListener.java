package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPCalendarEventInfo;
import com.crrepa.ble.conn.bean.CRPSavedCalendarEventInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPCalendarEventListener {
    void onEvent(CRPCalendarEventInfo cRPCalendarEventInfo);

    void onEventReminderTime(boolean z7, int i8);

    void onSupportEvent(int i8, List<CRPSavedCalendarEventInfo> list);
}
