package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u02 extends t0 {
    public nm1 m = new nm1(1);
    public uz2 n;
    public Object o;
    public int p;
    public int q;
    public v02 r;

    public u02(v02 v02Var) {
        this.n = v02Var.p;
        this.q = v02Var.q;
        this.r = v02Var;
    }

    @Override // defpackage.t0
    public final Set a() {
        return new z02(0, this);
    }

    @Override // defpackage.t0
    public final Set b() {
        return new z02(1, this);
    }

    @Override // defpackage.t0
    public final int c() {
        return this.q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.n = uz2.e;
        i(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof t52) {
            return f((t52) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof r33) {
            return super.containsValue((r33) obj);
        }
        return false;
    }

    @Override // defpackage.t0
    public final Collection d() {
        return new zh1(1, this);
    }

    public final v02 e() {
        uz2 uz2Var = this.n;
        v02 v02Var = this.r;
        if (uz2Var != v02Var.p) {
            this.m = new nm1(1);
            v02Var = new v02(this.n, c());
        }
        this.r = v02Var;
        return v02Var;
    }

    public final boolean f(Object obj) {
        return this.n.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object g(Object obj) {
        return this.n.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof t52) {
            return (r33) g((t52) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof t52) ? obj2 : (r33) super.getOrDefault((t52) obj, (r33) obj2);
    }

    public final Object h(Object obj) {
        this.o = null;
        uz2 n = this.n.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = uz2.e;
        }
        this.n = n;
        return this.o;
    }

    public final void i(int i) {
        this.q = i;
        this.p++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.o = null;
        this.n = this.n.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [w02] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        v02 v02Var = null;
        v02 v02Var2 = map instanceof w02 ? (w02) map : null;
        if (v02Var2 == null) {
            u02 u02Var = map instanceof u02 ? (u02) map : null;
            if (u02Var != null) {
                v02Var = u02Var.e();
            }
        } else {
            v02Var = v02Var2;
        }
        if (v02Var == null) {
            super.putAll(map);
            return;
        }
        ba0 ba0Var = new ba0();
        ba0Var.a = 0;
        int i = this.q;
        uz2 uz2Var = this.n;
        uz2 uz2Var2 = v02Var.p;
        uz2Var2.getClass();
        this.n = uz2Var.m(uz2Var2, 0, ba0Var, this);
        int i2 = (v02Var.q + i) - ba0Var.a;
        if (i != i2) {
            i(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int c = c();
        uz2 o = this.n.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o == null) {
            o = uz2.e;
        }
        this.n = o;
        return c != c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof t52) {
            return (r33) h((t52) obj);
        }
        return null;
    }
}
