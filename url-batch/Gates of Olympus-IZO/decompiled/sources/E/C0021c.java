package E;

import k2.InterfaceC0550w;
import t0.AbstractC0898f;

/* renamed from: E.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021c extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0022d f646g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q.l f647h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0021c(q qVar, C0022d c0022d, q.l lVar, P1.d dVar) {
        super(2, dVar);
        this.f645f = qVar;
        this.f646g = c0022d;
        this.f647h = lVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0021c(this.f645f, this.f646g, this.f647h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0021c) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f644e;
        q.l lVar = this.f647h;
        C0022d c0022d = this.f646g;
        try {
            if (i3 == 0) {
                I2.l.Q(obj);
                q qVar = this.f645f;
                this.f644e = 1;
                if (qVar.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I2.l.Q(obj);
            }
            c0022d.f648A.g(lVar);
            AbstractC0898f.m(c0022d);
            return L1.z.f2729a;
        } catch (Throwable th) {
            c0022d.f648A.g(lVar);
            AbstractC0898f.m(c0022d);
            throw th;
        }
    }
}
