package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lc3 implements kc3 {
    public final String m;
    public final ArrayList n;

    public lc3(String str, ArrayList arrayList) {
        this.m = str;
        ArrayList arrayList2 = new ArrayList();
        this.n = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // defpackage.kc3
    public final Boolean a() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.kc3
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc3)) {
            return false;
        }
        lc3 lc3Var = (lc3) obj;
        String str = lc3Var.m;
        String str2 = this.m;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.n.equals(lc3Var.n);
        }
        return false;
    }

    @Override // defpackage.kc3
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        String str = this.m;
        return this.n.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // defpackage.kc3
    public final kc3 j(String str, js0 js0Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // defpackage.kc3
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.kc3
    public final kc3 k() {
        return this;
    }
}
