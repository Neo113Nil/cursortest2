package com.crrepa.band.my.device.alarm;

import com.crrepa.band.my.model.db.Alarm;
import java.util.List;

/* loaded from: classes2.dex */
public interface j {
    void renderAddAlarmVisible(boolean z7);

    void renderAlarmHint(int i8);

    void renderAlarmList(List<Alarm> list, boolean z7);

    void renderDeleteAlarm(int i8, boolean z7);
}
