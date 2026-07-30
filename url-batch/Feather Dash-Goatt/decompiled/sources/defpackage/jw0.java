package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jw0 extends g0 {
    public j41 d = new j41(23);
    public oj1 e;
    public Object g;
    public int h;
    public int i;
    public kw0 j;

    public jw0(kw0 kw0Var) {
        this.e = kw0Var.h;
        this.i = kw0Var.i;
        this.j = kw0Var;
    }

    @Override // defpackage.g0
    public final Set a() {
        return new ow0(0, this);
    }

    @Override // defpackage.g0
    public final Set b() {
        return new ow0(1, this);
    }

    @Override // defpackage.g0
    public final int c() {
        return this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.e = oj1.e;
        i(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof m01) {
            return f((m01) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof gm1) {
            return super.containsValue((gm1) obj);
        }
        return false;
    }

    @Override // defpackage.g0
    public final Collection d() {
        return new zj0(1, this);
    }

    public final kw0 e() {
        oj1 oj1Var = this.e;
        kw0 kw0Var = this.j;
        if (oj1Var != kw0Var.h) {
            this.d = new j41(23);
            kw0Var = new kw0(this.e, c());
        }
        this.j = kw0Var;
        return kw0Var;
    }

    public final boolean f(Object obj) {
        return this.e.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object g(Object obj) {
        return this.e.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof m01) {
            return (gm1) g((m01) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof m01) ? obj2 : (gm1) super.getOrDefault((m01) obj, (gm1) obj2);
    }

    public final Object h(Object obj) {
        this.g = null;
        oj1 n = this.e.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = oj1.e;
        }
        this.e = n;
        return this.g;
    }

    public final void i(int i) {
        this.i = i;
        this.h++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.g = null;
        this.e = this.e.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [lw0] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        kw0 kw0Var = null;
        kw0 kw0Var2 = map instanceof lw0 ? (lw0) map : null;
        if (kw0Var2 == null) {
            jw0 jw0Var = map instanceof jw0 ? (jw0) map : null;
            if (jw0Var != null) {
                kw0Var = jw0Var.e();
            }
        } else {
            kw0Var = kw0Var2;
        }
        if (kw0Var == null) {
            super.putAll(map);
            return;
        }
        mr mrVar = new mr();
        mrVar.a = 0;
        int i = this.i;
        oj1 oj1Var = this.e;
        oj1 oj1Var2 = kw0Var.h;
        oj1Var2.getClass();
        this.e = oj1Var.m(oj1Var2, 0, mrVar, this);
        int i2 = (kw0Var.i + i) - mrVar.a;
        if (i != i2) {
            i(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int c = c();
        oj1 o = this.e.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o == null) {
            o = oj1.e;
        }
        this.e = o;
        return c != c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof m01) {
            return (gm1) h((m01) obj);
        }
        return null;
    }
}
