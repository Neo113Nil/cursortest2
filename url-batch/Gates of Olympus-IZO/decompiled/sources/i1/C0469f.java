package i1;

import I2.l;
import L1.z;
import M1.B;
import R1.i;

/* renamed from: i1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469f extends i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f5111e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5112f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f5113g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0469f(Y1.e eVar, P1.d dVar) {
        super(2, dVar);
        this.f5113g = (i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0469f c0469f = new C0469f(this.f5113g, dVar);
        c0469f.f5112f = obj;
        return c0469f;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0469f) create((C0465b) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [R1.i, Y1.e] */
    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5111e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0465b c0465b = (C0465b) this.f5112f;
            l.Q(obj);
            return c0465b;
        }
        l.Q(obj);
        C0465b c0465b2 = new C0465b(B.R(((C0465b) this.f5112f).a()), false);
        this.f5112f = c0465b2;
        this.f5111e = 1;
        return this.f5113g.g(c0465b2, this) == aVar ? aVar : c0465b2;
    }
}
