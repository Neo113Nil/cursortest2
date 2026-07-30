package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class w02 extends m0 {
    public static final w02 r = new w02(uz2.e, 0);
    public final uz2 p;
    public final int q;

    public w02(uz2 uz2Var, int i) {
        this.p = uz2Var;
        this.q = i;
    }

    @Override // defpackage.m0
    public final Set a() {
        return new b12(this, 0);
    }

    @Override // defpackage.m0
    public final Set b() {
        return new b12(this, 1);
    }

    @Override // defpackage.m0
    public final int c() {
        return this.q;
    }

    @Override // defpackage.m0, java.util.Map
    public boolean containsKey(Object obj) {
        return this.p.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.m0
    public final Collection d() {
        return new o0(2, this);
    }

    public final w02 f(Object obj, je1 je1Var) {
        r5 u = this.p.u(obj != null ? obj.hashCode() : 0, 0, obj, je1Var);
        return u == null ? this : new w02((uz2) u.b, this.q + u.a);
    }

    @Override // defpackage.m0, java.util.Map
    public Object get(Object obj) {
        return this.p.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
