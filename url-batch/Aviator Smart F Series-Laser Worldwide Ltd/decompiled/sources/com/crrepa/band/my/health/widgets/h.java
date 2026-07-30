package com.crrepa.band.my.health.widgets;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface h {
    void renderDate(Date date);

    void renderEmptySleep();

    void renderEndSleepTime(Date date);

    void renderSleepDetail(List<com.crrepa.band.my.health.widgets.segmentedview.a> list);

    void renderSleepTime(int i8);

    void renderStartSleepTime(Date date);
}
