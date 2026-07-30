package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class lw0 extends b0 {
    public static final lw0 j = new lw0(oj1.e, 0);
    public final oj1 h;
    public final int i;

    public lw0(oj1 oj1Var, int i) {
        this.h = oj1Var;
        this.i = i;
    }

    @Override // defpackage.b0
    public final Set a() {
        return new qw0(this, 0);
    }

    @Override // defpackage.b0
    public final Set b() {
        return new qw0(this, 1);
    }

    @Override // defpackage.b0
    public final int c() {
        return this.i;
    }

    @Override // defpackage.b0, java.util.Map
    public boolean containsKey(Object obj) {
        return this.h.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.b0
    public final Collection d() {
        return new a0(2, this);
    }

    public final lw0 f(Object obj, sh0 sh0Var) {
        jj u = this.h.u(obj != null ? obj.hashCode() : 0, 0, obj, sh0Var);
        return u == null ? this : new lw0((oj1) u.e, this.i + u.d);
    }

    @Override // defpackage.b0, java.util.Map
    public Object get(Object obj) {
        return this.h.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
