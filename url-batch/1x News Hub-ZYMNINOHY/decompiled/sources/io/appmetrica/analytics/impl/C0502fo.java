package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502fo {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f7339c = {0, 1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f7340a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f7341b = 0;

    public C0502fo(int[] iArr) {
        for (int i3 : iArr) {
            this.f7340a.put(i3, new HashMap());
        }
    }
}
