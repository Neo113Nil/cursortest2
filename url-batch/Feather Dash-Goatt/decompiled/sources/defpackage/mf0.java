package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mf0 {
    public final wf0 a;
    public final kf0 b;
    public final de0 c;
    public final u5 d;

    public mf0(wf0 wf0Var, kf0 kf0Var, de0 de0Var, u5 u5Var) {
        this.a = wf0Var;
        this.b = kf0Var;
        this.c = de0Var;
        this.d = u5Var;
    }

    public final void a(int i, Object obj, hl hlVar, int i2) {
        int i3;
        Object obj2;
        hl hlVar2;
        hlVar.Y(-462424778);
        int i4 = (hlVar.d(i) ? 4 : 2) | i2 | (hlVar.h(obj) ? 32 : 16) | (hlVar.f(this) ? 256 : 128);
        int i5 = 0;
        if (hlVar.O(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            hlVar2 = hlVar;
            y90.a(obj2, i3, this.a.r, m90.J(-824725566, new lf0(i, i5, this), hlVar), hlVar2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            hlVar2 = hlVar;
            hlVar2.R();
        }
        i11 r = hlVar2.r();
        if (r != null) {
            r.d = new qe0(this, i3, obj2, i2);
        }
    }

    public final Object b(int i) {
        kf0 kf0Var = this.b;
        kf0Var.getClass();
        ja0 a = kf0Var.a.a(i);
        return ((Function1) a.c.e).invoke(Integer.valueOf(i - a.a));
    }

    public final int c() {
        kf0 kf0Var = this.b;
        kf0Var.getClass();
        return kf0Var.a.a;
    }

    public final Object d(int i) {
        u5 u5Var = this.d;
        Object[] objArr = (Object[]) u5Var.c;
        int i2 = i - u5Var.a;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        if (obj != null) {
            return obj;
        }
        kf0 kf0Var = this.b;
        kf0Var.getClass();
        int i3 = kf0Var.a.a(i).a;
        return new gq(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf0)) {
            return false;
        }
        return Intrinsics.a(this.b, ((mf0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
