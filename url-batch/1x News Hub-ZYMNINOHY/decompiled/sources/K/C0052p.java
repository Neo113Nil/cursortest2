package K;

import b2.C0195i;
import d2.InterfaceC0300c;

/* renamed from: K.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052p extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f805e;
    public final /* synthetic */ i0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0052p(i0 i0Var, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = i0Var;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        C0052p c0052p = new C0052p(this.f, interfaceC0300c);
        c0052p.f805e = obj;
        return c0052p;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        android.support.v4.media.session.a.T(obj);
        i0 i0Var = (i0) this.f805e;
        return Boolean.valueOf((i0Var instanceof C0039c) && i0Var.f777a <= this.f.f777a);
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0052p) b((InterfaceC0300c) obj2, (i0) obj)).g(C0195i.f2555a);
    }
}
