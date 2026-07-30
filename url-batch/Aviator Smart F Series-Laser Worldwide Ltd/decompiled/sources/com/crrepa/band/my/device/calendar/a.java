package com.crrepa.band.my.device.calendar;

import com.crrepa.band.my.device.calendar.model.BandCalendarEventChangeEvent;
import com.crrepa.band.my.device.calendar.model.BandCalendarEventRemindDetailEvent;
import com.crrepa.band.my.model.band.provider.BandCalendarEventProvider;
import com.crrepa.ble.conn.bean.CRPCalendarEventInfo;
import com.crrepa.ble.conn.bean.CRPSavedCalendarEventInfo;
import com.crrepa.ble.conn.listener.CRPCalendarEventListener;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements CRPCalendarEventListener {
    @Override // com.crrepa.ble.conn.listener.CRPCalendarEventListener
    public void onEvent(CRPCalendarEventInfo cRPCalendarEventInfo) {
    }

    @Override // com.crrepa.ble.conn.listener.CRPCalendarEventListener
    public void onEventReminderTime(boolean z7, int i8) {
        com.orhanobut.logger.f.d("onEventReminderTime：" + z7 + ", " + i8);
        org.greenrobot.eventbus.c.getDefault().post(new BandCalendarEventRemindDetailEvent(z7, i8));
        BandCalendarEventProvider.saveReminderState(z7);
        BandCalendarEventProvider.saveEventTime(i8);
    }

    @Override // com.crrepa.ble.conn.listener.CRPCalendarEventListener
    public void onSupportEvent(int i8, List<CRPSavedCalendarEventInfo> list) {
        com.orhanobut.logger.f.d("support calendar event count：" + i8);
        BandCalendarEventProvider.saveMaxEventCount(i8);
        org.greenrobot.eventbus.c.getDefault().post(new BandCalendarEventChangeEvent());
        if (BandCalendarEventProvider.getCalendarEventState()) {
            com.crrepa.band.my.device.calendar.utils.a.getInstance().sendAllCalendarEvent(com.moyoung.dafit.module.common.utils.d.get());
        }
    }
}
