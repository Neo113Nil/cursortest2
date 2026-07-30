package androidx.lifecycle;

import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509q extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f5283n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f5284u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0509q(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f5284u = lifecycleCoroutineScopeImpl;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        C0509q c0509q = new C0509q(this.f5284u, interfaceC5133d);
        c0509q.f5283n = obj;
        return c0509q;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        C0509q c0509q = (C0509q) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2);
        q7.v vVar = q7.v.f40183a;
        c0509q.invokeSuspend(vVar);
        return vVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        com.bumptech.glide.f.r(obj);
        InterfaceC0397w interfaceC0397w = (InterfaceC0397w) this.f5283n;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f5284u;
        AbstractC0508p abstractC0508p = lifecycleCoroutineScopeImpl.f5237n;
        if (((C0515x) abstractC0508p).f5290d.compareTo(EnumC0507o.f5277u) >= 0) {
            abstractC0508p.a(lifecycleCoroutineScopeImpl);
        } else {
            AbstractC0399y.d(interfaceC0397w.z(), null);
        }
        return q7.v.f40183a;
    }
}
