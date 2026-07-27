package k4;

import B0.o;
import java.io.Serializable;
import t4.InterfaceC1445p;

/* renamed from: k4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1217c implements InterfaceC1223i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1223i f10717a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1221g f10718b;

    public C1217c(InterfaceC1221g element, InterfaceC1223i left) {
        kotlin.jvm.internal.i.e(left, "left");
        kotlin.jvm.internal.i.e(element, "element");
        this.f10717a = left;
        this.f10718b = element;
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1223i A(InterfaceC1223i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == C1224j.f10720a ? this : (InterfaceC1223i) context.q(this, new C1216b(1));
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1223i c(InterfaceC1222h key) {
        kotlin.jvm.internal.i.e(key, "key");
        InterfaceC1221g interfaceC1221g = this.f10718b;
        InterfaceC1221g o2 = interfaceC1221g.o(key);
        InterfaceC1223i interfaceC1223i = this.f10717a;
        if (o2 != null) {
            return interfaceC1223i;
        }
        InterfaceC1223i c2 = interfaceC1223i.c(key);
        return c2 == interfaceC1223i ? this : c2 == C1224j.f10720a ? interfaceC1221g : new C1217c(interfaceC1221g, c2);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof C1217c)) {
                return false;
            }
            C1217c c1217c = (C1217c) obj;
            c1217c.getClass();
            int i2 = 2;
            C1217c c1217c2 = c1217c;
            int i3 = 2;
            while (true) {
                InterfaceC1223i interfaceC1223i = c1217c2.f10717a;
                c1217c2 = interfaceC1223i instanceof C1217c ? (C1217c) interfaceC1223i : null;
                if (c1217c2 == null) {
                    break;
                }
                i3++;
            }
            C1217c c1217c3 = this;
            while (true) {
                InterfaceC1223i interfaceC1223i2 = c1217c3.f10717a;
                c1217c3 = interfaceC1223i2 instanceof C1217c ? (C1217c) interfaceC1223i2 : null;
                if (c1217c3 == null) {
                    break;
                }
                i2++;
            }
            if (i3 != i2) {
                return false;
            }
            C1217c c1217c4 = this;
            while (true) {
                InterfaceC1221g interfaceC1221g = c1217c4.f10718b;
                if (!kotlin.jvm.internal.i.a(c1217c.o(interfaceC1221g.getKey()), interfaceC1221g)) {
                    z = false;
                    break;
                }
                InterfaceC1223i interfaceC1223i3 = c1217c4.f10717a;
                if (!(interfaceC1223i3 instanceof C1217c)) {
                    kotlin.jvm.internal.i.c(interfaceC1223i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    InterfaceC1221g interfaceC1221g2 = (InterfaceC1221g) interfaceC1223i3;
                    z = kotlin.jvm.internal.i.a(c1217c.o(interfaceC1221g2.getKey()), interfaceC1221g2);
                    break;
                }
                c1217c4 = (C1217c) interfaceC1223i3;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f10718b.hashCode() + this.f10717a.hashCode();
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1221g o(InterfaceC1222h key) {
        kotlin.jvm.internal.i.e(key, "key");
        C1217c c1217c = this;
        while (true) {
            InterfaceC1221g o2 = c1217c.f10718b.o(key);
            if (o2 != null) {
                return o2;
            }
            InterfaceC1223i interfaceC1223i = c1217c.f10717a;
            if (!(interfaceC1223i instanceof C1217c)) {
                return interfaceC1223i.o(key);
            }
            c1217c = (C1217c) interfaceC1223i;
        }
    }

    @Override // k4.InterfaceC1223i
    public final Object q(Object obj, InterfaceC1445p interfaceC1445p) {
        return interfaceC1445p.invoke(this.f10717a.q(obj, interfaceC1445p), this.f10718b);
    }

    public final String toString() {
        return o.l(new StringBuilder("["), (String) q("", new C1216b(0)), ']');
    }
}
