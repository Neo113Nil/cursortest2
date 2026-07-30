package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vb3 implements kc3 {
    public final kc3 m;
    public final String n;

    public vb3(String str) {
        this.m = kc3.e;
        this.n = str;
    }

    @Override // defpackage.kc3
    public final Boolean a() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.kc3
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vb3)) {
            return false;
        }
        vb3 vb3Var = (vb3) obj;
        return this.n.equals(vb3Var.n) && this.m.equals(vb3Var.m);
    }

    @Override // defpackage.kc3
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return this.m.hashCode() + (this.n.hashCode() * 31);
    }

    @Override // defpackage.kc3
    public final kc3 j(String str, js0 js0Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // defpackage.kc3
    public final kc3 k() {
        return new vb3(this.n, this.m.k());
    }

    @Override // defpackage.kc3
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    public vb3(String str, kc3 kc3Var) {
        this.m = kc3Var;
        this.n = str;
    }
}
