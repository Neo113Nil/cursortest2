package e1;

import java.util.List;

/* renamed from: e1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355d extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f4686e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4687f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f4688g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355d(List list, P1.d dVar) {
        super(2, dVar);
        this.f4688g = list;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0355d c0355d = new C0355d(this.f4688g, dVar);
        c0355d.f4687f = obj;
        return c0355d;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0355d) create((C0362k) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4686e;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0362k c0362k = (C0362k) this.f4687f;
            this.f4686e = 1;
            if (M1.B.l(this.f4688g, c0362k, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
