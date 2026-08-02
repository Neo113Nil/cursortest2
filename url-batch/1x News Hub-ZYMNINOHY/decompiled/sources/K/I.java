package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class I extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f679e;
    public final /* synthetic */ f2.i f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0039c f680g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(l2.p pVar, C0039c c0039c, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = (f2.i) pVar;
        this.f680g = c0039c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.i, l2.p] */
    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new I(this.f, this.f680g, interfaceC0300c);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [f2.i, l2.p] */
    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f679e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
            return obj;
        }
        android.support.v4.media.session.a.T(obj);
        Object obj2 = this.f680g.f744b;
        this.f679e = 1;
        Object invoke = this.f.invoke(obj2, this);
        return invoke == enumC0317a ? enumC0317a : invoke;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((I) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
