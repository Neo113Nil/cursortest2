package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t2 implements f5 {

    /* renamed from: d, reason: collision with root package name */
    public final f5 f2805d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2806e;

    public t2(String str) {
        this.f2805d = f5.f2280b;
        this.f2806e = str;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Boolean b() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return this.f2806e.equals(t2Var.f2806e) && this.f2805d.equals(t2Var.f2805d);
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final String f() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Double g() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return this.f2805d.hashCode() + (this.f2806e.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 i(String str, e7 e7Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 n() {
        return new t2(this.f2806e, this.f2805d.n());
    }

    public t2(String str, f5 f5Var) {
        this.f2805d = f5Var;
        this.f2806e = str;
    }
}
