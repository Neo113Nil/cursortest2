package w1;

import i1.InterfaceC0192l;

/* loaded from: classes.dex */
public final class o extends j1.i implements InterfaceC0192l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0192l f4494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1.i f4496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(InterfaceC0192l interfaceC0192l, Object obj, a1.i iVar) {
        super(1);
        this.f4494b = interfaceC0192l;
        this.f4495c = obj;
        this.f4496d = iVar;
    }

    @Override // i1.InterfaceC0192l
    public final Object g(Object obj) {
        a.a(this.f4494b, this.f4495c, this.f4496d);
        return W0.i.f1345a;
    }
}
