package com.crrepa.band.my.health.widgets;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void renderAverageHeartRate(int i8);

    void renderHeartRateAnalysis(int... iArr);

    void renderHeartRateList(List<Float> list, Date date);

    void renderTrainingDate(Date date);
}
