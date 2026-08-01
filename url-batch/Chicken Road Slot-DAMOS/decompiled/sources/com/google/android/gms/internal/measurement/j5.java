package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j5 implements f5 {
    @Override // com.google.android.gms.internal.measurement.f5
    public final Boolean b() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof j5;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final String f() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Double g() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 i(String str, e7 e7Var, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 n() {
        return f5.f2280b;
    }
}
