package K;

import T.C0098p;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.util.concurrent.atomic.AtomicInteger;
import x3.AbstractC1562w;
import x3.C1552l;
import x3.InterfaceC1560u;

/* loaded from: classes.dex */
public final class I extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1255a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f1257c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h3.g f1258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(M m4, o3.p pVar, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1257c = m4;
        this.f1258d = (h3.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [h3.g, o3.p] */
    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        I i4 = new I(this.f1257c, this.f1258d, interfaceC0425c);
        i4.f1256b = obj;
        return i4;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((InterfaceC1560u) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [h3.g, o3.p] */
    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1255a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O3.l.w(obj);
            return obj;
        }
        O3.l.w(obj);
        InterfaceC1560u interfaceC1560u = (InterfaceC1560u) this.f1256b;
        C1552l c1552l = new C1552l(true);
        c1552l.D(null);
        M m4 = this.f1257c;
        Y y4 = new Y(this.f1258d, c1552l, m4.f1280h.j(), interfaceC1560u.g());
        G1.c cVar = m4.f1284l;
        Object h2 = ((z3.c) cVar.f837d).h(y4);
        if (h2 instanceof z3.h) {
            z3.h hVar = (z3.h) h2;
            if (hVar == null) {
                hVar = null;
            }
            Throwable th = hVar != null ? hVar.f16328a : null;
            if (th == null) {
                throw new C0098p("Channel was closed normally");
            }
            throw th;
        }
        if (h2 instanceof z3.i) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) ((t1.h) cVar.f838e).f15398b).getAndIncrement() == 0) {
            AbstractC1562w.g((InterfaceC1560u) cVar.f835b, null, new c0(cVar, null), 3);
        }
        this.f1255a = 1;
        Object Q4 = c1552l.Q(this);
        return Q4 == enumC0441a ? enumC0441a : Q4;
    }
}
