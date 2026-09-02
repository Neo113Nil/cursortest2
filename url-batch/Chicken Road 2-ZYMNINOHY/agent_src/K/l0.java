package K;

import a.AbstractC0124a;
import f3.C0431i;
import f3.InterfaceC0428f;
import f3.InterfaceC0429g;
import f3.InterfaceC0430h;

/* loaded from: classes.dex */
public final class l0 implements InterfaceC0428f {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f1394a;

    /* renamed from: b, reason: collision with root package name */
    public final M f1395b;

    public l0(l0 l0Var, M m4) {
        this.f1394a = l0Var;
        this.f1395b = m4;
    }

    public final void c(M m4) {
        if (this.f1395b == m4) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        l0 l0Var = this.f1394a;
        if (l0Var != null) {
            l0Var.c(m4);
        }
    }

    @Override // f3.InterfaceC0430h
    public final Object e(Object obj, o3.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h f(InterfaceC0430h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == C0431i.f8817a ? this : (InterfaceC0430h) context.e(this, new com.startapp.sdk.components.c(2));
    }

    @Override // f3.InterfaceC0428f
    public final InterfaceC0429g getKey() {
        return k0.f1384a;
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h k(InterfaceC0429g interfaceC0429g) {
        return AbstractC0124a.J(this, interfaceC0429g);
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0428f n(InterfaceC0429g interfaceC0429g) {
        return AbstractC0124a.x(this, interfaceC0429g);
    }
}
