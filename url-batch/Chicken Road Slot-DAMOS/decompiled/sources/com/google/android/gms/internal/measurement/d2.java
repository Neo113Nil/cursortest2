package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d2 implements f5 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2212d;

    public d2(Boolean bool) {
        this.f2212d = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Boolean b() {
        return Boolean.valueOf(this.f2212d);
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2) && this.f2212d == ((d2) obj).f2212d;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final String f() {
        return Boolean.toString(this.f2212d);
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Double g() {
        return Double.valueOf(true != this.f2212d ? 0.0d : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f2212d).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 i(String str, e7 e7Var, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z10 = this.f2212d;
        if (equals) {
            return new i5(Boolean.toString(z10));
        }
        throw new IllegalArgumentException(Boolean.toString(z10) + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 n() {
        return new d2(Boolean.valueOf(this.f2212d));
    }

    public final String toString() {
        return String.valueOf(this.f2212d);
    }
}
