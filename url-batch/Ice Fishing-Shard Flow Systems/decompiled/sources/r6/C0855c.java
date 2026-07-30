package r6;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import n6.EnumC0790x;
import n6.F;
import n6.InterfaceC0789w;
import p6.EnumC0830a;
import u6.C0953e;

/* renamed from: r6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855c extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f7545d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7546e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.e f7547i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f7548l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0855c(q6.e eVar, e eVar2, V5.b bVar) {
        super(2, bVar);
        this.f7547i = eVar;
        this.f7548l = eVar2;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        C0855c c0855c = new C0855c(this.f7547i, this.f7548l, bVar);
        c0855c.f7546e = obj;
        return c0855c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0855c) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = W5.a.f2787d;
        int i2 = this.f7545d;
        if (i2 == 0) {
            V6.b.P(obj);
            InterfaceC0789w interfaceC0789w = (InterfaceC0789w) this.f7546e;
            e eVar = this.f7548l;
            CoroutineContext coroutineContext = eVar.f7552d;
            int i5 = eVar.f7553e;
            if (i5 == -3) {
                i5 = -2;
            }
            EnumC0830a enumC0830a = eVar.f7554i;
            EnumC0790x enumC0790x = EnumC0790x.f7090i;
            Function2 c0856d = new C0856d(eVar, null);
            p6.c a7 = p6.j.a(i5, enumC0830a, 4);
            CoroutineContext a8 = n6.r.a(interfaceC0789w.h(), coroutineContext, true);
            C0953e c0953e = F.f7011a;
            if (a8 != c0953e && a8.g(kotlin.coroutines.d.f6145f) == null) {
                a8 = a8.j(c0953e);
            }
            p6.p pVar = new p6.p(a8, a7);
            pVar.Y(enumC0790x, pVar, c0856d);
            this.f7545d = 1;
            Object c7 = q6.w.c(this.f7547i, pVar, true, this);
            if (c7 != obj2) {
                c7 = Unit.f6114a;
            }
            if (c7 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
        }
        return Unit.f6114a;
    }
}
