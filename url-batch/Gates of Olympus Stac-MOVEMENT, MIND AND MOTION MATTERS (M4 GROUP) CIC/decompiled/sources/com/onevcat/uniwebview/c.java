package com.onevcat.uniwebview;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5};

    public static /* synthetic */ int a(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] b(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }
}
