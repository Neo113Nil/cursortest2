package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2501ao {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f38684c = {0, 1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f38685a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f38686b = 0;

    public C2501ao(int[] iArr) {
        for (int i4 : iArr) {
            this.f38685a.put(i4, new HashMap());
        }
    }
}
