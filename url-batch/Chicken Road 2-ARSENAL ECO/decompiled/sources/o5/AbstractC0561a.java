package o5;

import a1.AbstractC0223a;
import x5.InterfaceC0747p;

/* renamed from: o5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0561a implements InterfaceC0567g {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0568h f5615f;

    public AbstractC0561a(InterfaceC0568h interfaceC0568h) {
        this.f5615f = interfaceC0568h;
    }

    @Override // o5.InterfaceC0567g
    public final InterfaceC0568h getKey() {
        return this.f5615f;
    }

    @Override // o5.InterfaceC0569i
    public final Object h(Object obj, InterfaceC0747p interfaceC0747p) {
        return interfaceC0747p.invoke(obj, this);
    }

    @Override // o5.InterfaceC0569i
    public InterfaceC0567g m(InterfaceC0568h key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(getKey(), key)) {
            return this;
        }
        return null;
    }

    @Override // o5.InterfaceC0569i
    public final /* bridge */ InterfaceC0569i v(InterfaceC0569i interfaceC0569i) {
        return AbstractC0223a.D(this, interfaceC0569i);
    }

    @Override // o5.InterfaceC0569i
    public /* bridge */ InterfaceC0569i y(InterfaceC0568h interfaceC0568h) {
        return AbstractC0223a.B(this, interfaceC0568h);
    }
}
