package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class A {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9876a = {1, 2, 3, 4};

    public static /* synthetic */ int a(int i4) {
        if (i4 != 0) {
            return i4 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] b(int i4) {
        int[] iArr = new int[i4];
        System.arraycopy(f9876a, 0, iArr, 0, i4);
        return iArr;
    }
}
