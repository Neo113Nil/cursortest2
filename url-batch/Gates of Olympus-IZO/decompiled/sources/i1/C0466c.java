package i1;

import I2.l;
import L1.z;
import R1.i;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466c extends i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f5107e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f5109g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0466c(Y1.e eVar, P1.d dVar) {
        super(2, dVar);
        this.f5109g = (i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0466c c0466c = new C0466c(this.f5109g, dVar);
        c0466c.f5108f = obj;
        return c0466c;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0466c) create((C0465b) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5107e;
        if (i3 == 0) {
            l.Q(obj);
            C0465b c0465b = (C0465b) this.f5108f;
            this.f5107e = 1;
            obj = this.f5109g.g(c0465b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.Q(obj);
        }
        C0465b c0465b2 = (C0465b) obj;
        Z1.i.d(c0465b2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        c0465b2.f5106b.f4796a.set(true);
        return c0465b2;
    }
}
