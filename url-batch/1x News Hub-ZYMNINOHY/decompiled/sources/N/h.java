package N;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f2.i;
import l2.p;

/* loaded from: classes.dex */
public final class h extends i implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f984e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f985g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f985g = (i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f2.i, l2.p] */
    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        h hVar = new h(this.f985g, interfaceC0300c);
        hVar.f = obj;
        return hVar;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [f2.i, l2.p] */
    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f984e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f;
            android.support.v4.media.session.a.T(obj);
            return bVar;
        }
        android.support.v4.media.session.a.T(obj);
        b bVar2 = new b(c2.p.g0(((b) this.f).a()), false);
        this.f = bVar2;
        this.f984e = 1;
        return this.f985g.invoke(bVar2, this) == enumC0317a ? enumC0317a : bVar2;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) b((InterfaceC0300c) obj2, (b) obj)).g(C0195i.f2555a);
    }
}
