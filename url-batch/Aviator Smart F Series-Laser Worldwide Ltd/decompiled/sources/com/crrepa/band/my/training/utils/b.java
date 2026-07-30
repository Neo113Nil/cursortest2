package com.crrepa.band.my.training.utils;

import com.moyoung.dafit.module.common.utils.x0;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class b {
    public static String calculateAvgElevation(List<Float> list) {
        if (x0.isEmpty(list)) {
            return "0.0";
        }
        Iterator<Float> it = list.iterator();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        int i8 = 0;
        while (it.hasNext()) {
            if (it.next() != null) {
                d8 += r4.floatValue();
                i8++;
            }
        }
        if (i8 == 0) {
            return "0.0";
        }
        return com.moyoung.dafit.module.common.utils.n.getDecimalFormat("0.0").format(d8 / i8);
    }

    public static String[] calculateElevationChanges(List<Float> list) {
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        if (list == null || list.size() < 2) {
            return new String[]{String.valueOf(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON), String.valueOf(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON)};
        }
        double d9 = 0.0d;
        int i8 = 0;
        while (i8 < list.size() - 1) {
            float floatValue = list.get(i8).floatValue();
            i8++;
            float floatValue2 = list.get(i8).floatValue() - floatValue;
            if (floatValue2 > 0.0f) {
                d8 += floatValue2;
            } else if (floatValue2 < 0.0f) {
                d9 += Math.abs(floatValue2);
            }
        }
        DecimalFormat decimalFormat = com.moyoung.dafit.module.common.utils.n.getDecimalFormat("0.0");
        return new String[]{decimalFormat.format(d8), decimalFormat.format(d9)};
    }

    public static String calculateMaxElevation(List<Float> list) {
        if (x0.isEmpty(list)) {
            return "0.0";
        }
        return com.moyoung.dafit.module.common.utils.n.getDecimalFormat("0.0").format(((Float) Collections.max(list)).floatValue());
    }

    public static String calculateMinElevation(List<Float> list) {
        if (x0.isEmpty(list)) {
            return "0.0";
        }
        return com.moyoung.dafit.module.common.utils.n.getDecimalFormat("0.0").format(((Float) Collections.min(list)).floatValue());
    }
}
