package o;

import W2.InterfaceC0280c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m.C0842o;
import y2.AbstractC1343r;

/* renamed from: o.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890i extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8778k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8779l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ U0 f8780m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0894k f8781n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0880d f8782o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0280c0 f8783p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0890i(U0 u02, C0894k c0894k, InterfaceC0880d interfaceC0880d, InterfaceC0280c0 interfaceC0280c0, C2.a aVar) {
        super(2, aVar);
        this.f8780m = u02;
        this.f8781n = c0894k;
        this.f8782o = interfaceC0880d;
        this.f8783p = interfaceC0280c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0890i) j((C2.a) obj2, (C0903o0) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0890i c0890i = new C0890i(this.f8780m, this.f8781n, this.f8782o, this.f8783p, aVar);
        c0890i.f8779l = obj;
        return c0890i;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8778k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0903o0 c0903o0 = (C0903o0) this.f8779l;
            InterfaceC0880d interfaceC0880d = this.f8782o;
            C0894k c0894k = this.f8781n;
            float B02 = C0894k.B0(c0894k, interfaceC0880d);
            U0 u02 = this.f8780m;
            u02.f8727e = B02;
            P.h hVar = new P.h(c0894k, this.f8783p, c0903o0, 7);
            C0842o c0842o = new C0842o(c0894k, u02, interfaceC0880d, 2);
            this.f8778k = 1;
            if (u02.a(hVar, c0842o, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
