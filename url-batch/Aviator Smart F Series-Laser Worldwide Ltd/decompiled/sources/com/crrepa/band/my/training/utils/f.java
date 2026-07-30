package com.crrepa.band.my.training.utils;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class f {
    public static long sum(List<Integer> list) {
        int i8 = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            i8 += it.next().intValue();
        }
        return i8;
    }

    public static float sumFloat(List<Float> list) {
        int i8 = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Iterator<Float> it = list.iterator();
        while (it.hasNext()) {
            i8 = (int) (i8 + it.next().floatValue());
        }
        return i8;
    }
}
