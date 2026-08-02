package f3;

import java.io.Serializable;
import o3.p;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424b implements InterfaceC0430h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0430h f8814a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0428f f8815b;

    public C0424b(InterfaceC0430h left, InterfaceC0428f element) {
        kotlin.jvm.internal.i.e(left, "left");
        kotlin.jvm.internal.i.e(element, "element");
        this.f8814a = left;
        this.f8815b = element;
    }

    @Override // f3.InterfaceC0430h
    public final Object e(Object obj, p pVar) {
        return pVar.invoke(this.f8814a.e(obj, pVar), this.f8815b);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0424b) {
            C0424b c0424b = (C0424b) obj;
            c0424b.getClass();
            int i4 = 2;
            C0424b c0424b2 = c0424b;
            int i5 = 2;
            while (true) {
                InterfaceC0430h interfaceC0430h = c0424b2.f8814a;
                c0424b2 = interfaceC0430h instanceof C0424b ? (C0424b) interfaceC0430h : null;
                if (c0424b2 == null) {
                    break;
                }
                i5++;
            }
            C0424b c0424b3 = this;
            while (true) {
                InterfaceC0430h interfaceC0430h2 = c0424b3.f8814a;
                c0424b3 = interfaceC0430h2 instanceof C0424b ? (C0424b) interfaceC0430h2 : null;
                if (c0424b3 == null) {
                    break;
                }
                i4++;
            }
            if (i5 == i4) {
                C0424b c0424b4 = this;
                while (true) {
                    InterfaceC0428f interfaceC0428f = c0424b4.f8815b;
                    if (!kotlin.jvm.internal.i.a(c0424b.n(interfaceC0428f.getKey()), interfaceC0428f)) {
                        z = false;
                        break;
                    }
                    InterfaceC0430h interfaceC0430h3 = c0424b4.f8814a;
                    if (!(interfaceC0430h3 instanceof C0424b)) {
                        kotlin.jvm.internal.i.c(interfaceC0430h3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC0428f interfaceC0428f2 = (InterfaceC0428f) interfaceC0430h3;
                        z = kotlin.jvm.internal.i.a(c0424b.n(interfaceC0428f2.getKey()), interfaceC0428f2);
                        break;
                    }
                    c0424b4 = (C0424b) interfaceC0430h3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h f(InterfaceC0430h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == C0431i.f8817a ? this : (InterfaceC0430h) context.e(this, new com.startapp.sdk.components.c(2));
    }

    public final int hashCode() {
        return this.f8815b.hashCode() + this.f8814a.hashCode();
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h k(InterfaceC0429g key) {
        kotlin.jvm.internal.i.e(key, "key");
        InterfaceC0428f interfaceC0428f = this.f8815b;
        InterfaceC0428f n = interfaceC0428f.n(key);
        InterfaceC0430h interfaceC0430h = this.f8814a;
        if (n != null) {
            return interfaceC0430h;
        }
        InterfaceC0430h k4 = interfaceC0430h.k(key);
        return k4 == interfaceC0430h ? this : k4 == C0431i.f8817a ? interfaceC0428f : new C0424b(k4, interfaceC0428f);
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0428f n(InterfaceC0429g key) {
        kotlin.jvm.internal.i.e(key, "key");
        C0424b c0424b = this;
        while (true) {
            InterfaceC0428f n = c0424b.f8815b.n(key);
            if (n != null) {
                return n;
            }
            InterfaceC0430h interfaceC0430h = c0424b.f8814a;
            if (!(interfaceC0430h instanceof C0424b)) {
                return interfaceC0430h.n(key);
            }
            c0424b = (C0424b) interfaceC0430h;
        }
    }

    public final String toString() {
        return "[" + ((String) e("", new com.startapp.sdk.components.c(1))) + ']';
    }
}
