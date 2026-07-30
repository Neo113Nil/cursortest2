package com.crrepa.band.my.device.calendar.model;

/* loaded from: classes2.dex */
public class BandCalendarEventRemindDetailEvent {
    private boolean enable;
    private int minutes;

    public BandCalendarEventRemindDetailEvent(boolean z7, int i8) {
        this.enable = z7;
        this.minutes = i8;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public boolean isEnable() {
        return this.enable;
    }
}
