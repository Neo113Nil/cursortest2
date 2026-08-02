package f3;

import a.AbstractC0124a;
import o3.p;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0423a implements InterfaceC0428f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0429g f8813a;

    public AbstractC0423a(InterfaceC0429g interfaceC0429g) {
        this.f8813a = interfaceC0429g;
    }

    @Override // f3.InterfaceC0430h
    public final Object e(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h f(InterfaceC0430h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == C0431i.f8817a ? this : (InterfaceC0430h) context.e(this, new com.startapp.sdk.components.c(2));
    }

    @Override // f3.InterfaceC0428f
    public final InterfaceC0429g getKey() {
        return this.f8813a;
    }

    @Override // f3.InterfaceC0430h
    public /* bridge */ InterfaceC0430h k(InterfaceC0429g interfaceC0429g) {
        return AbstractC0124a.J(this, interfaceC0429g);
    }

    @Override // f3.InterfaceC0430h
    public /* bridge */ InterfaceC0428f n(InterfaceC0429g interfaceC0429g) {
        return AbstractC0124a.x(this, interfaceC0429g);
    }
}
