package S;

import I.C0143d;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4258a = new Object();

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
        return (i) p.f4240a.g();
    }

    public static i d(i iVar) {
        if (iVar instanceof D) {
            D d3 = (D) iVar;
            if (d3.f4188t == C0143d.A()) {
                d3.f4186r = null;
                return iVar;
            }
        }
        if (iVar instanceof E) {
            E e3 = (E) iVar;
            if (e3.f4192h == C0143d.A()) {
                e3.f4191g = null;
                return iVar;
            }
        }
        i h3 = p.h(iVar, null, false);
        h3.j();
        return h3;
    }

    public static Object e(InterfaceC0422a interfaceC0422a, InterfaceC0424c interfaceC0424c) {
        i d3;
        if (interfaceC0424c == null) {
            return interfaceC0422a.b();
        }
        i iVar = (i) p.f4240a.g();
        if (iVar instanceof D) {
            D d4 = (D) iVar;
            if (d4.f4188t == C0143d.A()) {
                InterfaceC0424c interfaceC0424c2 = d4.f4186r;
                InterfaceC0424c interfaceC0424c3 = d4.f4187s;
                try {
                    ((D) iVar).f4186r = p.l(interfaceC0424c, interfaceC0424c2, true);
                    ((D) iVar).f4187s = p.b(null, interfaceC0424c3);
                    return interfaceC0422a.b();
                } finally {
                    d4.f4186r = interfaceC0424c2;
                    d4.f4187s = interfaceC0424c3;
                }
            }
        }
        if (iVar == null || (iVar instanceof C0221e)) {
            d3 = new D(iVar instanceof C0221e ? (C0221e) iVar : null, interfaceC0424c, null, true, false);
        } else {
            if (interfaceC0424c == null) {
                return interfaceC0422a.b();
            }
            d3 = iVar.t(interfaceC0424c);
        }
        try {
            i j3 = d3.j();
            try {
                return interfaceC0422a.b();
            } finally {
                i.p(j3);
            }
        } finally {
            d3.c();
        }
    }

    public static void f(i iVar, i iVar2, InterfaceC0424c interfaceC0424c) {
        if (iVar != iVar2) {
            iVar2.getClass();
            i.p(iVar);
            iVar2.c();
        } else if (iVar instanceof D) {
            ((D) iVar).f4186r = interfaceC0424c;
        } else if (iVar instanceof E) {
            ((E) iVar).f4191g = interfaceC0424c;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + iVar).toString());
        }
    }

    public static final void g() {
        throw new UnsupportedOperationException();
    }
}
