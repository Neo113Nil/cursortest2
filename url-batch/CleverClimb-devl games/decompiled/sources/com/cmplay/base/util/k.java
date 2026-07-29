package com.cmplay.base.util;

/* compiled from: ContainerHelpers.java */
/* loaded from: classes.dex */
class k {

    /* renamed from: a, reason: collision with root package name */
    static final boolean[] f4027a = new boolean[0];

    /* renamed from: b, reason: collision with root package name */
    static final int[] f4028b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    static final long[] f4029c = new long[0];

    /* renamed from: d, reason: collision with root package name */
    static final Object[] f4030d = new Object[0];

    static int a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return i4 ^ (-1);
    }
}
