package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g5 implements f5 {

    /* renamed from: d, reason: collision with root package name */
    public final String f2326d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2327e;

    public g5(String str, ArrayList arrayList) {
        this.f2326d = str;
        ArrayList arrayList2 = new ArrayList();
        this.f2327e = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Boolean b() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        String str = g5Var.f2326d;
        String str2 = this.f2326d;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.f2327e.equals(g5Var.f2327e);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final String f() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Double g() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        String str = this.f2326d;
        return this.f2327e.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 i(String str, e7 e7Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 n() {
        return this;
    }
}
