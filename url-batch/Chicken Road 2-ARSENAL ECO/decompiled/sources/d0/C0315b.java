package d0;

import H5.InterfaceC0163x;
import K5.c;
import k5.v;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315b extends g implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public int f3938f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f3939g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C.a f3940h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0315b(c cVar, C.a aVar, InterfaceC0564d interfaceC0564d) {
        super(2, interfaceC0564d);
        this.f3939g = cVar;
        this.f3940h = aVar;
    }

    @Override // q5.AbstractC0605a
    public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
        return new C0315b(this.f3939g, this.f3940h, interfaceC0564d);
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0315b) create((InterfaceC0163x) obj, (InterfaceC0564d) obj2)).invokeSuspend(v.f5219a);
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f3938f;
        if (i7 == 0) {
            AbstractC0676f.w(obj);
            C0314a c0314a = new C0314a(this.f3940h);
            this.f3938f = 1;
            if (this.f3939g.c(c0314a, this) == enumC0580a) {
                return enumC0580a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
        }
        return v.f5219a;
    }
}
