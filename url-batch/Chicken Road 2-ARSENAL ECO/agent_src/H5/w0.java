package H5;

import a1.AbstractC0223a;
import o5.InterfaceC0567g;
import o5.InterfaceC0568h;
import o5.InterfaceC0569i;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class w0 implements InterfaceC0567g, InterfaceC0568h {

    /* renamed from: f, reason: collision with root package name */
    public static final w0 f1111f = new w0();

    @Override // o5.InterfaceC0569i
    public final Object h(Object obj, InterfaceC0747p interfaceC0747p) {
        return interfaceC0747p.invoke(obj, this);
    }

    @Override // o5.InterfaceC0569i
    public final InterfaceC0567g m(InterfaceC0568h key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(this, key)) {
            return this;
        }
        return null;
    }

    @Override // o5.InterfaceC0569i
    public final InterfaceC0569i v(InterfaceC0569i interfaceC0569i) {
        return AbstractC0223a.D(this, interfaceC0569i);
    }

    @Override // o5.InterfaceC0569i
    public final InterfaceC0569i y(InterfaceC0568h interfaceC0568h) {
        return AbstractC0223a.B(this, interfaceC0568h);
    }

    @Override // o5.InterfaceC0567g
    public final InterfaceC0568h getKey() {
        return this;
    }
}
