package x3;

import a.AbstractC0124a;
import f3.C0431i;
import f3.InterfaceC0428f;
import f3.InterfaceC0429g;
import f3.InterfaceC0430h;

/* loaded from: classes.dex */
public final class o0 implements InterfaceC0428f, InterfaceC0429g {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f16050a = new o0();

    @Override // f3.InterfaceC0430h
    public final Object e(Object obj, o3.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h f(InterfaceC0430h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == C0431i.f8817a ? this : (InterfaceC0430h) context.e(this, new com.startapp.sdk.components.c(2));
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h k(InterfaceC0429g interfaceC0429g) {
        return AbstractC0124a.J(this, interfaceC0429g);
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0428f n(InterfaceC0429g interfaceC0429g) {
        return AbstractC0124a.x(this, interfaceC0429g);
    }

    @Override // f3.InterfaceC0428f
    public final InterfaceC0429g getKey() {
        return this;
    }
}
