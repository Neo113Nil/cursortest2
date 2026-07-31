package com.bytedance.sdk.openadsdk.nqi;

import java.util.Map;

/* loaded from: classes5.dex */
public final class cyb {
    public fs zmn(String str, int i, int i2, Map<hhw, ?> map) throws iqz {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        zg zgVar = zg.L;
        int i3 = 4;
        if (map != null) {
            hhw hhwVar = hhw.ERROR_CORRECTION;
            if (map.containsKey(hhwVar)) {
                zgVar = zg.valueOf(map.get(hhwVar).toString());
            }
            hhw hhwVar2 = hhw.MARGIN;
            if (map.containsKey(hhwVar2)) {
                i3 = Integer.parseInt(map.get(hhwVar2).toString());
            }
        }
        return zmn(nps.zmn(str, zgVar, map), i, i2, i3);
    }

    private static fs zmn(cn cnVar, int i, int i2, int i3) {
        zn zmn = cnVar.zmn();
        if (zmn == null) {
            throw new IllegalStateException();
        }
        int fs = zmn.fs();
        int zmn2 = zmn.zmn();
        int i4 = i3 * 2;
        int i5 = fs + i4;
        int i6 = i4 + zmn2;
        int max = Math.max(i, i5);
        int max2 = Math.max(i2, i6);
        int min = Math.min(max / i5, max2 / i6);
        int i7 = (max - (fs * min)) / 2;
        int i8 = (max2 - (zmn2 * min)) / 2;
        fs fsVar = new fs(max, max2);
        int i9 = 0;
        while (i9 < zmn2) {
            int i10 = 0;
            int i11 = i7;
            while (i10 < fs) {
                if (zmn.zmn(i10, i9) == 1) {
                    fsVar.zmn(i11, i8, min, min);
                }
                i10++;
                i11 += min;
            }
            i9++;
            i8 += min;
        }
        return fsVar;
    }
}
