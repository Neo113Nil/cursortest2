package d2;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import l2.p;

/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299b implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final h f4948a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0303f f4949b;

    public C0299b(InterfaceC0303f element, h left) {
        j.e(left, "left");
        j.e(element, "element");
        this.f4948a = left;
        this.f4949b = element;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0299b) {
            C0299b c0299b = (C0299b) obj;
            c0299b.getClass();
            int i3 = 2;
            C0299b c0299b2 = c0299b;
            int i4 = 2;
            while (true) {
                h hVar = c0299b2.f4948a;
                c0299b2 = hVar instanceof C0299b ? (C0299b) hVar : null;
                if (c0299b2 == null) {
                    break;
                }
                i4++;
            }
            C0299b c0299b3 = this;
            while (true) {
                h hVar2 = c0299b3.f4948a;
                c0299b3 = hVar2 instanceof C0299b ? (C0299b) hVar2 : null;
                if (c0299b3 == null) {
                    break;
                }
                i3++;
            }
            if (i4 == i3) {
                C0299b c0299b4 = this;
                while (true) {
                    InterfaceC0303f interfaceC0303f = c0299b4.f4949b;
                    if (!j.a(c0299b.h(interfaceC0303f.getKey()), interfaceC0303f)) {
                        z = false;
                        break;
                    }
                    h hVar3 = c0299b4.f4948a;
                    if (!(hVar3 instanceof C0299b)) {
                        j.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC0303f interfaceC0303f2 = (InterfaceC0303f) hVar3;
                        z = j.a(c0299b.h(interfaceC0303f2.getKey()), interfaceC0303f2);
                        break;
                    }
                    c0299b4 = (C0299b) hVar3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // d2.h
    public final InterfaceC0303f h(g key) {
        j.e(key, "key");
        C0299b c0299b = this;
        while (true) {
            InterfaceC0303f h3 = c0299b.f4949b.h(key);
            if (h3 != null) {
                return h3;
            }
            h hVar = c0299b.f4948a;
            if (!(hVar instanceof C0299b)) {
                return hVar.h(key);
            }
            c0299b = (C0299b) hVar;
        }
    }

    public final int hashCode() {
        return this.f4949b.hashCode() + this.f4948a.hashCode();
    }

    @Override // d2.h
    public final h i(h context) {
        j.e(context, "context");
        return context == i.f4951a ? this : (h) context.l(this, new com.startapp.sdk.components.c(2));
    }

    @Override // d2.h
    public final h k(g key) {
        j.e(key, "key");
        InterfaceC0303f interfaceC0303f = this.f4949b;
        InterfaceC0303f h3 = interfaceC0303f.h(key);
        h hVar = this.f4948a;
        if (h3 != null) {
            return hVar;
        }
        h k3 = hVar.k(key);
        return k3 == hVar ? this : k3 == i.f4951a ? interfaceC0303f : new C0299b(interfaceC0303f, k3);
    }

    @Override // d2.h
    public final Object l(Object obj, p pVar) {
        return pVar.invoke(this.f4948a.l(obj, pVar), this.f4949b);
    }

    public final String toString() {
        return "[" + ((String) l("", new com.startapp.sdk.components.c(1))) + ']';
    }
}
