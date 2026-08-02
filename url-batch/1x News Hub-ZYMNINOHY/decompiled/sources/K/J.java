package K;

import b0.C0178i;
import b2.C0195i;
import d1.C0297a;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.util.concurrent.atomic.AtomicInteger;
import t2.AbstractC1212w;
import t2.C1202l;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class J extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f681e;
    public /* synthetic */ InterfaceC1210u f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f682g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f2.i f683h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(N n3, l2.p pVar, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f682g = n3;
        this.f683h = (f2.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f2.i, l2.p] */
    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        J j3 = new J(this.f682g, this.f683h, interfaceC0300c);
        j3.f = (InterfaceC1210u) obj;
        return j3;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [f2.i, l2.p] */
    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f681e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
            return obj;
        }
        android.support.v4.media.session.a.T(obj);
        InterfaceC1210u interfaceC1210u = this.f;
        C1202l c1202l = new C1202l(true);
        c1202l.G(null);
        N n3 = this.f682g;
        a0 a0Var = new a0(this.f683h, c1202l, n3.f701h.s(), interfaceC1210u.e());
        B0.p pVar = n3.f705l;
        Object j3 = ((v2.c) pVar.f164c).j(a0Var);
        if (j3 instanceof v2.h) {
            v2.h hVar = j3 != null ? (v2.h) j3 : null;
            Throwable th = hVar != null ? hVar.f10608a : null;
            if (th == null) {
                throw new C0297a("Channel was closed normally");
            }
            throw th;
        }
        if (j3 instanceof v2.i) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) ((C0178i) pVar.f165d).f2532b).getAndIncrement() == 0) {
            AbstractC1212w.g((InterfaceC1210u) pVar.f162a, null, new d0(pVar, null), 3);
        }
        this.f681e = 1;
        Object q3 = c1202l.q(this);
        return q3 == enumC0317a ? enumC0317a : q3;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((J) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
