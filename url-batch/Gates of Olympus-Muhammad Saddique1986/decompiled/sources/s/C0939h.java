package s;

import B.C0011l;
import I.C0167p;
import I.C0173s0;
import n.T;
import t.C0978f;
import t.C0980h;

/* renamed from: s.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939h {

    /* renamed from: a, reason: collision with root package name */
    public final C0951t f8234a;

    /* renamed from: b, reason: collision with root package name */
    public final C0937f f8235b;

    /* renamed from: c, reason: collision with root package name */
    public final C0934c f8236c;

    /* renamed from: d, reason: collision with root package name */
    public final C0011l f8237d;

    public C0939h(C0951t c0951t, C0937f c0937f, C0934c c0934c, C0011l c0011l) {
        this.f8234a = c0951t;
        this.f8235b = c0937f;
        this.f8236c = c0934c;
        this.f8237d = c0011l;
    }

    public final void a(int i3, Object obj, C0167p c0167p, int i4) {
        int i5;
        c0167p.S(-462424778);
        if ((i4 & 6) == 0) {
            i5 = (c0167p.d(i3) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0167p.h(obj) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0167p.f(this) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            T.b(obj, i3, this.f8234a.f8333q, Q.f.b(-824725566, new R0.t(i3, 3, this), c0167p), c0167p, ((i5 >> 3) & 14) | 3072 | ((i5 << 3) & 112));
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0938g(this, i3, obj, i4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [e2.c, f2.k] */
    public final Object b(int i3) {
        C0937f c0937f = this.f8235b;
        c0937f.getClass();
        C0980h e3 = c0937f.f8229a.e(i3);
        return ((f2.k) e3.f8480c.f2117c).n(Integer.valueOf(i3 - e3.f8478a));
    }

    public final int c() {
        C0937f c0937f = this.f8235b;
        c0937f.getClass();
        return c0937f.f8229a.f421e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r0v8, types: [e2.c, f2.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i3) {
        Object obj;
        Object n3;
        C0011l c0011l = this.f8237d;
        int i4 = i3 - c0011l.f421e;
        if (i4 >= 0) {
            Object[] objArr = (Object[]) c0011l.f423g;
            f2.j.f(objArr, "<this>");
            if (i4 <= objArr.length - 1) {
                obj = objArr[i4];
                if (obj == null) {
                    return obj;
                }
                C0937f c0937f = this.f8235b;
                c0937f.getClass();
                C0980h e3 = c0937f.f8229a.e(i3);
                int i5 = i3 - e3.f8478a;
                ?? r02 = (f2.k) e3.f8480c.f2116b;
                return (r02 == 0 || (n3 = r02.n(Integer.valueOf(i5))) == null) ? new C0978f(i3) : n3;
            }
        }
        obj = null;
        if (obj == null) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0939h)) {
            return false;
        }
        return f2.j.a(this.f8235b, ((C0939h) obj).f8235b);
    }

    public final int hashCode() {
        return this.f8235b.hashCode();
    }
}
