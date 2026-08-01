package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e4 implements f5, b5 {

    /* renamed from: d, reason: collision with root package name */
    public final String f2253d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f2254e = new HashMap();

    public e4(String str) {
        this.f2253d = str;
    }

    public abstract f5 a(e7 e7Var, List list);

    @Override // com.google.android.gms.internal.measurement.f5
    public final Boolean b() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final f5 c(String str) {
        HashMap hashMap = this.f2254e;
        return hashMap.containsKey(str) ? (f5) hashMap.get(str) : f5.f2280b;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Iterator e() {
        return new w4(this.f2254e.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        String str = this.f2253d;
        if (str != null) {
            return str.equals(e4Var.f2253d);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final String f() {
        return this.f2253d;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Double g() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final boolean h(String str) {
        return this.f2254e.containsKey(str);
    }

    public final int hashCode() {
        String str = this.f2253d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 i(String str, e7 e7Var, ArrayList arrayList) {
        return "toString".equals(str) ? new i5(this.f2253d) : b5.m(this, new i5(str), e7Var, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final void k(String str, f5 f5Var) {
        HashMap hashMap = this.f2254e;
        if (f5Var == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, f5Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public f5 n() {
        return this;
    }
}
