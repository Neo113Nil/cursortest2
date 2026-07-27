package r;

import A.C0016l;
import G.C0216p;
import G.C0222s0;
import kotlin.jvm.internal.Intrinsics;
import p0.C0959U;
import s.C1101e;
import s.C1103g;
import z2.C1439w;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final v f9454a;

    /* renamed from: b, reason: collision with root package name */
    public final g f9455b;

    /* renamed from: c, reason: collision with root package name */
    public final c f9456c;

    /* renamed from: d, reason: collision with root package name */
    public final C0016l f9457d;

    public h(v vVar, g gVar, c cVar, C0016l c0016l) {
        this.f9454a = vVar;
        this.f9455b = gVar;
        this.f9456c = cVar;
        this.f9457d = c0016l;
    }

    public final void a(int i2, Object obj, C0216p c0216p, int i4) {
        int i5;
        c0216p.U(-462424778);
        if ((i4 & 6) == 0) {
            i5 = (c0216p.d(i2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0216p.h(obj) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0216p.f(this) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            m3.s.b(obj, i2, this.f9454a.f9567q, O.f.b(-824725566, new P0.u(i2, 3, this), c0216p), c0216p, ((i5 >> 3) & 14) | 3072 | ((i5 << 3) & 112));
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0959U(this, i2, obj, i4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [M2.p, kotlin.jvm.functions.Function1] */
    public final Object b(int i2) {
        g gVar = this.f9455b;
        gVar.getClass();
        C1103g d4 = gVar.f9453a.d(i2);
        return ((M2.p) d4.f9932c.f7976b).invoke(Integer.valueOf(i2 - d4.f9930a));
    }

    public final int c() {
        g gVar = this.f9455b;
        gVar.getClass();
        return gVar.f9453a.f163b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i2) {
        Object obj;
        C0016l c0016l = this.f9457d;
        int i4 = i2 - c0016l.f163b;
        if (i4 >= 0) {
            Object[] objArr = (Object[]) c0016l.f165d;
            if (i4 <= C1439w.u(objArr)) {
                obj = objArr[i4];
                if (obj == null) {
                    return obj;
                }
                g gVar = this.f9455b;
                gVar.getClass();
                int i5 = gVar.f9453a.d(i2).f9930a;
                return new C1101e(i2);
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
        if (!(obj instanceof h)) {
            return false;
        }
        return Intrinsics.a(this.f9455b, ((h) obj).f9455b);
    }

    public final int hashCode() {
        return this.f9455b.hashCode();
    }
}
