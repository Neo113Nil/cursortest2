package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class zj implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ck f15160f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ek f15161g;

    zj(ek ekVar, ck ckVar) {
        this.f15161g = ekVar;
        this.f15160f = ckVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.f15160f.a();
        sparseArray = this.f15161g.f4637s;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            sparseArray2 = this.f15161g.f4637s;
            ((tk) sparseArray2.valueAt(i7)).i();
        }
    }
}
