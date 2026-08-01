package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class c5 implements f5, b5 {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2190d = new HashMap();

    @Override // com.google.android.gms.internal.measurement.f5
    public final Boolean b() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final f5 c(String str) {
        HashMap hashMap = this.f2190d;
        return hashMap.containsKey(str) ? (f5) hashMap.get(str) : f5.f2280b;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Iterator e() {
        return new w4(this.f2190d.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c5) {
            return this.f2190d.equals(((c5) obj).f2190d);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final String f() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Double g() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final boolean h(String str) {
        return this.f2190d.containsKey(str);
    }

    public final int hashCode() {
        return this.f2190d.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public f5 i(String str, e7 e7Var, ArrayList arrayList) {
        return "toString".equals(str) ? new i5(toString()) : b5.m(this, new i5(str), e7Var, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final void k(String str, f5 f5Var) {
        HashMap hashMap = this.f2190d;
        if (f5Var == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, f5Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 n() {
        c5 c5Var = new c5();
        for (Map.Entry entry : this.f2190d.entrySet()) {
            boolean z10 = entry.getValue() instanceof b5;
            HashMap hashMap = c5Var.f2190d;
            if (z10) {
                hashMap.put((String) entry.getKey(), (f5) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((f5) entry.getValue()).n());
            }
        }
        return c5Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap hashMap = this.f2190d;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
