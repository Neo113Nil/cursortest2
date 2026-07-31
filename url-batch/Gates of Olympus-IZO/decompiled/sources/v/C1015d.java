package v;

import E2.j;
import I2.l;
import L1.z;
import R1.i;
import k2.InterfaceC0550w;
import t0.AbstractC0898f;
import t0.a0;

/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1015d extends i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f8561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1017f f8562f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f8563g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1015d(C1017f c1017f, j jVar, P1.d dVar) {
        super(2, dVar);
        this.f8562f = c1017f;
        this.f8563g = jVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C1015d(this.f8562f, this.f8563g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C1015d) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1012a interfaceC1012a;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f8561e;
        if (i3 == 0) {
            l.Q(obj);
            C1017f c1017f = this.f8562f;
            if (c1017f.p) {
                if (c1017f.f3303d.p) {
                    interfaceC1012a = (InterfaceC1012a) AbstractC0898f.j(c1017f, C1017f.f8569s);
                    if (interfaceC1012a == null) {
                        interfaceC1012a = new g(c1017f);
                    }
                } else {
                    interfaceC1012a = null;
                }
                if (interfaceC1012a != null) {
                    a0 s3 = AbstractC0898f.s(c1017f);
                    this.f8561e = 1;
                    if (interfaceC1012a.Q(s3, this.f8563g, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.Q(obj);
        }
        return z.f2729a;
    }
}
