package com.crrepa.band.my.health.widgets;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface b {
    void measureComplete();

    void renderBo(int i8);

    void renderDate(Date date);

    void renderLast7TimesBloodOxygen(List<Float> list, Date[] dateArr);
}
