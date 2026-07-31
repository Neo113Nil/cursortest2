package com.my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1654l {
    public static int a(Comparable[] comparableArr, Comparable[] comparableArr2) {
        if (comparableArr == comparableArr2) {
            return 0;
        }
        if (comparableArr == null || comparableArr2 == null) {
            return comparableArr == null ? -1 : 1;
        }
        int min = Math.min(comparableArr.length, comparableArr2.length);
        for (int i4 = 0; i4 < min; i4++) {
            Comparable comparable = comparableArr[i4];
            Comparable comparable2 = comparableArr2[i4];
            if (comparable != comparable2) {
                if (comparable == null || comparable2 == null) {
                    return comparable == null ? -1 : 1;
                }
                int compareTo = comparable.compareTo(comparable2);
                if (compareTo != 0) {
                    return compareTo;
                }
            }
        }
        return comparableArr.length - comparableArr2.length;
    }
}
