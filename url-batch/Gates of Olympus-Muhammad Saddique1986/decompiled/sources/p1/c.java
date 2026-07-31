package p1;

import I.C0166o0;
import R1.y;
import X1.i;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0286o;
import androidx.lifecycle.H;
import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import t2.InterfaceC1043N;

/* loaded from: classes.dex */
public final class c extends i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7825h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7826i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0294x f7827j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ EnumC0286o f7828k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V1.i f7829l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1043N f7830m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0294x c0294x, EnumC0286o enumC0286o, V1.i iVar, InterfaceC1043N interfaceC1043N, V1.d dVar) {
        super(2, dVar);
        this.f7827j = c0294x;
        this.f7828k = enumC0286o;
        this.f7829l = iVar;
        this.f7830m = interfaceC1043N;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((c) o((V1.d) obj2, (C0166o0) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        c cVar = new c(this.f7827j, this.f7828k, this.f7829l, this.f7830m, dVar);
        cVar.f7826i = obj;
        return cVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        Object e3;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7825h;
        y yVar = y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            C0803b c0803b = new C0803b(this.f7829l, this.f7830m, (C0166o0) this.f7826i, null);
            this.f7825h = 1;
            EnumC0286o enumC0286o = EnumC0286o.f5227e;
            EnumC0286o enumC0286o2 = this.f7828k;
            if (enumC0286o2 == enumC0286o) {
                throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            }
            C0294x c0294x = this.f7827j;
            if (c0294x.f5242d == EnumC0286o.f5226d || (e3 = AbstractC0837y.e(new H(c0294x, enumC0286o2, c0803b, null), this)) != aVar) {
                e3 = yVar;
            }
            if (e3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return yVar;
    }
}
