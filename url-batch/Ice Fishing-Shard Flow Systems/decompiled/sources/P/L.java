package P;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.AbstractC0792z;
import n6.C0781n;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class L extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f1998d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1999e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q f2000i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X5.j f2001l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(Q q4, Function2 function2, V5.b bVar) {
        super(2, bVar);
        this.f2000i = q4;
        this.f2001l = (X5.j) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X5.j, kotlin.jvm.functions.Function2] */
    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        L l7 = new L(this.f2000i, this.f2001l, bVar);
        l7.f1999e = obj;
        return l7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X5.j, kotlin.jvm.functions.Function2] */
    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f1998d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            return obj;
        }
        V6.b.P(obj);
        InterfaceC0789w interfaceC0789w = (InterfaceC0789w) this.f1999e;
        C0781n a7 = AbstractC0792z.a();
        Q q4 = this.f2000i;
        d0 d0Var = new d0(this.f2001l, a7, q4.f2024p.k(), interfaceC0789w.h());
        com.google.firebase.messaging.z zVar = q4.f2028t;
        Object i5 = ((p6.c) zVar.f4537i).i(d0Var);
        if (i5 instanceof p6.h) {
            p6.h hVar = i5 != null ? (p6.h) i5 : null;
            Throwable th = hVar != null ? hVar.f7254a : null;
            if (th == null) {
                throw new K1.b("Channel was closed normally");
            }
            throw th;
        }
        if (i5 instanceof p6.i) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) ((B.f) zVar.f4538l).f152e).getAndIncrement() == 0) {
            AbstractC0792z.l((s6.c) zVar.f4535d, null, new h0(zVar, null), 3);
        }
        this.f1998d = 1;
        Object W4 = a7.W(this);
        return W4 == aVar ? aVar : W4;
    }
}
