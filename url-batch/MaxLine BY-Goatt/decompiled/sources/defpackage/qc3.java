package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qc3 implements kc3 {
    @Override // defpackage.kc3
    public final Boolean a() {
        return Boolean.FALSE;
    }

    @Override // defpackage.kc3
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof qc3;
    }

    @Override // defpackage.kc3
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.kc3
    public final kc3 j(String str, js0 js0Var, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    @Override // defpackage.kc3
    public final kc3 k() {
        return kc3.e;
    }

    @Override // defpackage.kc3
    public final String zzc() {
        return "undefined";
    }
}
