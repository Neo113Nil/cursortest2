package z;

import a0.b1;
import a0.g0;
import b6.i0;
import m0.s;
import m0.t1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final p f9018a;

    /* renamed from: b, reason: collision with root package name */
    public final f f9019b;

    /* renamed from: c, reason: collision with root package name */
    public final c f9020c;

    /* renamed from: d, reason: collision with root package name */
    public final b1 f9021d;

    public h(p pVar, f fVar, c cVar, b1 b1Var) {
        this.f9018a = pVar;
        this.f9019b = fVar;
        this.f9020c = cVar;
        this.f9021d = b1Var;
    }

    public final void a(int i, Object obj, s sVar, int i8) {
        sVar.W(-462424778);
        int i9 = (sVar.d(i) ? 4 : 2) | i8 | (sVar.h(obj) ? 32 : 16) | (sVar.f(this) ? 256 : 128);
        if (sVar.N(i9 & 1, (i9 & 147) != 146)) {
            g0.b(obj, i, this.f9018a.f9093r, u0.h.d(-824725566, new g(this, i), sVar), sVar, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112));
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new i0(this, i, obj, i8, 8);
        }
    }

    public final Object b(int i) {
        f fVar = this.f9019b;
        fVar.getClass();
        a0.j b8 = fVar.f9015a.b(i);
        return ((p6.c) b8.f100c.f8655a).i(Integer.valueOf(i - b8.f98a));
    }

    public final int c() {
        f fVar = this.f9019b;
        fVar.getClass();
        return fVar.f9015a.f22a;
    }

    public final Object d(int i) {
        b1 b1Var = this.f9021d;
        Object[] objArr = (Object[]) b1Var.f24c;
        int i8 = i - b1Var.f22a;
        Object obj = (i8 < 0 || i8 >= objArr.length) ? null : objArr[i8];
        if (obj != null) {
            return obj;
        }
        f fVar = this.f9019b;
        fVar.getClass();
        int i9 = fVar.f9015a.b(i).f98a;
        return new a0.h(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return q6.i.a(this.f9019b, ((h) obj).f9019b);
    }

    public final int hashCode() {
        return this.f9019b.hashCode();
    }
}
