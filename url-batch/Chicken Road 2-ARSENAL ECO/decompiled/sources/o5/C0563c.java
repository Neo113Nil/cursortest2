package o5;

import java.io.Serializable;
import x5.InterfaceC0747p;

/* renamed from: o5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563c implements InterfaceC0569i, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0569i f5617f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0567g f5618g;

    public C0563c(InterfaceC0567g element, InterfaceC0569i left) {
        kotlin.jvm.internal.i.e(left, "left");
        kotlin.jvm.internal.i.e(element, "element");
        this.f5617f = left;
        this.f5618g = element;
    }

    public final boolean equals(Object obj) {
        boolean z5;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0563c) {
            C0563c c0563c = (C0563c) obj;
            c0563c.getClass();
            int i7 = 2;
            C0563c c0563c2 = c0563c;
            int i8 = 2;
            while (true) {
                InterfaceC0569i interfaceC0569i = c0563c2.f5617f;
                c0563c2 = interfaceC0569i instanceof C0563c ? (C0563c) interfaceC0569i : null;
                if (c0563c2 == null) {
                    break;
                }
                i8++;
            }
            C0563c c0563c3 = this;
            while (true) {
                InterfaceC0569i interfaceC0569i2 = c0563c3.f5617f;
                c0563c3 = interfaceC0569i2 instanceof C0563c ? (C0563c) interfaceC0569i2 : null;
                if (c0563c3 == null) {
                    break;
                }
                i7++;
            }
            if (i8 == i7) {
                C0563c c0563c4 = this;
                while (true) {
                    InterfaceC0567g interfaceC0567g = c0563c4.f5618g;
                    if (!kotlin.jvm.internal.i.a(c0563c.m(interfaceC0567g.getKey()), interfaceC0567g)) {
                        z5 = false;
                        break;
                    }
                    InterfaceC0569i interfaceC0569i3 = c0563c4.f5617f;
                    if (!(interfaceC0569i3 instanceof C0563c)) {
                        kotlin.jvm.internal.i.c(interfaceC0569i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC0567g interfaceC0567g2 = (InterfaceC0567g) interfaceC0569i3;
                        z5 = kotlin.jvm.internal.i.a(c0563c.m(interfaceC0567g2.getKey()), interfaceC0567g2);
                        break;
                    }
                    c0563c4 = (C0563c) interfaceC0569i3;
                }
                if (z5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o5.InterfaceC0569i
    public final Object h(Object obj, InterfaceC0747p interfaceC0747p) {
        return interfaceC0747p.invoke(this.f5617f.h(obj, interfaceC0747p), this.f5618g);
    }

    public final int hashCode() {
        return this.f5618g.hashCode() + this.f5617f.hashCode();
    }

    @Override // o5.InterfaceC0569i
    public final InterfaceC0567g m(InterfaceC0568h key) {
        kotlin.jvm.internal.i.e(key, "key");
        C0563c c0563c = this;
        while (true) {
            InterfaceC0567g m4 = c0563c.f5618g.m(key);
            if (m4 != null) {
                return m4;
            }
            InterfaceC0569i interfaceC0569i = c0563c.f5617f;
            if (!(interfaceC0569i instanceof C0563c)) {
                return interfaceC0569i.m(key);
            }
            c0563c = (C0563c) interfaceC0569i;
        }
    }

    public final String toString() {
        return "[" + ((String) h("", new C0562b(0))) + ']';
    }

    @Override // o5.InterfaceC0569i
    public final InterfaceC0569i v(InterfaceC0569i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == C0570j.f5620f ? this : (InterfaceC0569i) context.h(this, new C0562b(1));
    }

    @Override // o5.InterfaceC0569i
    public final InterfaceC0569i y(InterfaceC0568h key) {
        kotlin.jvm.internal.i.e(key, "key");
        InterfaceC0567g interfaceC0567g = this.f5618g;
        InterfaceC0567g m4 = interfaceC0567g.m(key);
        InterfaceC0569i interfaceC0569i = this.f5617f;
        if (m4 != null) {
            return interfaceC0569i;
        }
        InterfaceC0569i y = interfaceC0569i.y(key);
        return y == interfaceC0569i ? this : y == C0570j.f5620f ? interfaceC0567g : new C0563c(interfaceC0567g, y);
    }
}
