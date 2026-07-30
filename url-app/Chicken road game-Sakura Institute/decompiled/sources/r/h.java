package r;

import g0.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final s f7604a;

    /* renamed from: b, reason: collision with root package name */
    public final e f7605b;

    /* renamed from: c, reason: collision with root package name */
    public final b f7606c;

    /* renamed from: d, reason: collision with root package name */
    public final a0.l f7607d;

    public h(s sVar, e eVar, b bVar, a0.l lVar) {
        this.f7604a = sVar;
        this.f7605b = eVar;
        this.f7606c = bVar;
        this.f7607d = lVar;
    }

    public final void a(int i7, Object obj, g0.p pVar, int i8) {
        int i9;
        Object obj2;
        g0.p pVar2;
        pVar.S(-462424778);
        int i10 = (pVar.d(i7) ? 4 : 2) | i8 | (pVar.h(obj) ? 32 : 16) | (pVar.f(this) ? 256 : 128);
        if ((i10 & 147) == 146 && pVar.x()) {
            pVar.L();
            i9 = i7;
            obj2 = obj;
            pVar2 = pVar;
        } else {
            i9 = i7;
            obj2 = obj;
            pVar2 = pVar;
            t6.a.e(obj2, i9, this.f7604a.f7690q, o0.f.b(-824725566, new f(this, i7), pVar), pVar2, ((i10 >> 3) & 14) | 3072 | ((i10 << 3) & 112));
        }
        p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new g(this, i9, obj2, i8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [q6.c, r6.l] */
    public final Object b(int i7) {
        e eVar = this.f7605b;
        eVar.getClass();
        s.g d8 = eVar.f7597a.d(i7);
        return ((r6.l) d8.f8006c.f1231h).f(Integer.valueOf(i7 - d8.f8004a));
    }

    public final int c() {
        e eVar = this.f7605b;
        eVar.getClass();
        return eVar.f7597a.f100g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i7) {
        Object obj;
        Object f9;
        a0.l lVar = this.f7607d;
        Object[] objArr = (Object[]) lVar.f102i;
        int i8 = i7 - lVar.f100g;
        if (i8 >= 0) {
            r6.k.f(objArr, "<this>");
            if (i8 <= objArr.length - 1) {
                obj = objArr[i8];
                if (obj == null) {
                    return obj;
                }
                e eVar = this.f7605b;
                eVar.getClass();
                s.g d8 = eVar.f7597a.d(i7);
                int i9 = i7 - d8.f8004a;
                q6.c cVar = (q6.c) d8.f8006c.f1230g;
                return (cVar == null || (f9 = cVar.f(Integer.valueOf(i9))) == null) ? new s.e(i7) : f9;
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
        return r6.k.a(this.f7605b, ((h) obj).f7605b);
    }

    public final int hashCode() {
        return this.f7605b.hashCode();
    }
}
