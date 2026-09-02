package K;

import c3.C0297i;
import f3.C0431i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import x3.C1552l;
import x3.InterfaceC1560u;

/* renamed from: K.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074x extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f1432b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0074x(M m4, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1432b = m4;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        return new C0074x(this.f1432b, interfaceC0425c);
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0074x) create((InterfaceC1560u) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r9 == r0) goto L23;
     */
    @Override // h3.AbstractC0448a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1431a;
        C0297i c0297i = C0297i.f5732a;
        M m4 = this.f1432b;
        if (i4 == 0) {
            O3.l.w(obj);
            G1.c cVar = m4.f1281i;
            this.f1431a = 1;
            Object Q4 = ((C1552l) cVar.f836c).Q(this);
            if (Q4 != enumC0441a) {
                Q4 = c0297i;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O3.l.w(obj);
                return c0297i;
            }
            O3.l.w(obj);
        }
        A3.d dVar = m4.g().f1364c;
        z3.a aVar = z3.a.f16291b;
        A3.d a3 = dVar instanceof B3.i ? B3.k.a((A3.c) ((B3.i) dVar), null, 0, aVar, 1) : new B3.g(dVar, C0431i.f8817a, 0, aVar);
        A3.q qVar = new A3.q(2, m4);
        this.f1431a = 2;
        return a3.collect(qVar, this) == enumC0441a ? enumC0441a : c0297i;
    }
}
