package androidx.room;

import java.util.concurrent.Callable;
import k2.AbstractC0546s;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import n2.AbstractC0682G;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class d extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f4061e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4062f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f4063g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0701g f4064h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String[] f4065i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Callable f4066j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s sVar, InterfaceC0701g interfaceC0701g, String[] strArr, Callable callable, P1.d dVar) {
        super(2, dVar);
        this.f4063g = sVar;
        this.f4064h = interfaceC0701g;
        this.f4065i = strArr;
        this.f4066j = callable;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        d dVar2 = new d(this.f4063g, this.f4064h, this.f4065i, this.f4066j, dVar);
        dVar2.f4062f = obj;
        return dVar2;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((d) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4061e;
        L1.z zVar = L1.z.f2729a;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f4062f;
            m2.e a3 = m2.l.a(-1, 6, null);
            C2.c cVar = new C2.c(this.f4065i, a3);
            a3.g(zVar);
            if (interfaceC0550w.u().k(y.f4115d) != null) {
                throw new ClassCastException();
            }
            AbstractC0546s b2 = h.b(this.f4063g);
            m2.e a4 = m2.l.a(0, 7, null);
            AbstractC0552y.q(interfaceC0550w, b2, null, new c(this.f4063g, cVar, a3, this.f4066j, a4, null), 2);
            this.f4061e = 1;
            Object h3 = AbstractC0682G.h(this.f4064h, a4, true, this);
            if (h3 != aVar) {
                h3 = zVar;
            }
            if (h3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return zVar;
    }
}
