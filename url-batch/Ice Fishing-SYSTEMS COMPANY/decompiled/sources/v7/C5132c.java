package v7;

import E7.p;
import java.io.Serializable;

/* renamed from: v7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5132c implements InterfaceC5138i, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5138i f41369n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5136g f41370u;

    public C5132c(InterfaceC5136g element, InterfaceC5138i left) {
        kotlin.jvm.internal.h.e(left, "left");
        kotlin.jvm.internal.h.e(element, "element");
        this.f41369n = left;
        this.f41370u = element;
    }

    public final boolean equals(Object obj) {
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5132c) {
            C5132c c5132c = (C5132c) obj;
            c5132c.getClass();
            int i = 2;
            C5132c c5132c2 = c5132c;
            int i4 = 2;
            while (true) {
                InterfaceC5138i interfaceC5138i = c5132c2.f41369n;
                c5132c2 = interfaceC5138i instanceof C5132c ? (C5132c) interfaceC5138i : null;
                if (c5132c2 == null) {
                    break;
                }
                i4++;
            }
            C5132c c5132c3 = this;
            while (true) {
                InterfaceC5138i interfaceC5138i2 = c5132c3.f41369n;
                c5132c3 = interfaceC5138i2 instanceof C5132c ? (C5132c) interfaceC5138i2 : null;
                if (c5132c3 == null) {
                    break;
                }
                i++;
            }
            if (i4 == i) {
                C5132c c5132c4 = this;
                while (true) {
                    InterfaceC5136g interfaceC5136g = c5132c4.f41370u;
                    if (!kotlin.jvm.internal.h.a(c5132c.i(interfaceC5136g.getKey()), interfaceC5136g)) {
                        z8 = false;
                        break;
                    }
                    InterfaceC5138i interfaceC5138i3 = c5132c4.f41369n;
                    if (!(interfaceC5138i3 instanceof C5132c)) {
                        kotlin.jvm.internal.h.c(interfaceC5138i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC5136g interfaceC5136g2 = (InterfaceC5136g) interfaceC5138i3;
                        z8 = kotlin.jvm.internal.h.a(c5132c.i(interfaceC5136g2.getKey()), interfaceC5136g2);
                        break;
                    }
                    c5132c4 = (C5132c) interfaceC5138i3;
                }
                if (z8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5138i g(InterfaceC5137h key) {
        kotlin.jvm.internal.h.e(key, "key");
        InterfaceC5136g interfaceC5136g = this.f41370u;
        InterfaceC5136g i = interfaceC5136g.i(key);
        InterfaceC5138i interfaceC5138i = this.f41369n;
        if (i != null) {
            return interfaceC5138i;
        }
        InterfaceC5138i g9 = interfaceC5138i.g(key);
        return g9 == interfaceC5138i ? this : g9 == C5139j.f41372n ? interfaceC5136g : new C5132c(interfaceC5136g, g9);
    }

    public final int hashCode() {
        return this.f41370u.hashCode() + this.f41369n.hashCode();
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5136g i(InterfaceC5137h key) {
        kotlin.jvm.internal.h.e(key, "key");
        C5132c c5132c = this;
        while (true) {
            InterfaceC5136g i = c5132c.f41370u.i(key);
            if (i != null) {
                return i;
            }
            InterfaceC5138i interfaceC5138i = c5132c.f41369n;
            if (!(interfaceC5138i instanceof C5132c)) {
                return interfaceC5138i.i(key);
            }
            c5132c = (C5132c) interfaceC5138i;
        }
    }

    @Override // v7.InterfaceC5138i
    public final Object m(Object obj, p pVar) {
        return pVar.invoke(this.f41369n.m(obj, pVar), this.f41370u);
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5138i n(InterfaceC5138i context) {
        kotlin.jvm.internal.h.e(context, "context");
        return context == C5139j.f41372n ? this : (InterfaceC5138i) context.m(this, new C5131b(1));
    }

    public final String toString() {
        return "[" + ((String) m("", new C5131b(0))) + ']';
    }
}
