package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f11708c = {0, 1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f11709a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f11710b = 0;

    public Cdo(int[] iArr) {
        for (int i4 : iArr) {
            this.f11709a.put(i4, new HashMap());
        }
    }
}
