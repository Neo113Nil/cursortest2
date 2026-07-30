package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* renamed from: com.google.android.gms.internal.ads.lP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3526lP {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f32566a;

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.f32566a;
        PA.a0(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3526lP) {
            return this.f32566a.equals(((C3526lP) obj).f32566a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32566a.hashCode();
    }
}
