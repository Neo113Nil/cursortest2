package S;

import I.C0089d;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3249a = new Object();

    public static final void a(int i3, int i4) {
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException("index (" + i3 + ") is out of bound of [0, " + i4 + ')');
        }
    }

    public static final int b(int[] iArr, int i3) {
        int length = iArr.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (i4 + length) >>> 1;
            int i6 = iArr[i5];
            if (i3 > i6) {
                i4 = i5 + 1;
            } else {
                if (i3 >= i6) {
                    return i5;
                }
                length = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static i c() {
        return (i) q.f3234a.g();
    }

    public static i d(i iVar) {
        if (iVar instanceof B) {
            B b2 = (B) iVar;
            if (b2.f3181t == C0089d.A()) {
                b2.f3179r = null;
                return iVar;
            }
        }
        if (iVar instanceof C) {
            C c3 = (C) iVar;
            if (c3.f3185h == C0089d.A()) {
                c3.f3184g = null;
                return iVar;
            }
        }
        i h3 = q.h(iVar, null, false);
        h3.j();
        return h3;
    }

    public static Object e(Y1.a aVar, Y1.c cVar) {
        i b2;
        if (cVar == null) {
            return aVar.b();
        }
        i iVar = (i) q.f3234a.g();
        if (iVar instanceof B) {
            B b3 = (B) iVar;
            if (b3.f3181t == C0089d.A()) {
                Y1.c cVar2 = b3.f3179r;
                Y1.c cVar3 = b3.f3180s;
                try {
                    ((B) iVar).f3179r = q.l(cVar, cVar2, true);
                    ((B) iVar).f3180s = q.b(null, cVar3);
                    return aVar.b();
                } finally {
                    b3.f3179r = cVar2;
                    b3.f3180s = cVar3;
                }
            }
        }
        if (iVar == null || (iVar instanceof e)) {
            b2 = new B(iVar instanceof e ? (e) iVar : null, cVar, null, true, false);
        } else {
            if (cVar == null) {
                return aVar.b();
            }
            b2 = iVar.t(cVar);
        }
        try {
            i j3 = b2.j();
            try {
                return aVar.b();
            } finally {
                i.p(j3);
            }
        } finally {
            b2.c();
        }
    }

    public static void f(i iVar, i iVar2, Y1.c cVar) {
        if (iVar != iVar2) {
            iVar2.getClass();
            i.p(iVar);
            iVar2.c();
        } else if (iVar instanceof B) {
            ((B) iVar).f3179r = cVar;
        } else if (iVar instanceof C) {
            ((C) iVar).f3184g = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + iVar).toString());
        }
    }

    public static final void g() {
        throw new UnsupportedOperationException();
    }
}
