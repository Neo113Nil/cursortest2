package o;

import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class e0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f6505f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f6506g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f6507h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, float f3, float f4, P1.d dVar) {
        super(2, dVar);
        this.f6505f = g0Var;
        this.f6506g = f3;
        this.f6507h = f4;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new e0(this.f6505f, this.f6506g, this.f6507h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((e0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6504e;
        if (i3 == 0) {
            I2.l.Q(obj);
            o0 o0Var = this.f6505f.f6516F;
            long f3 = I2.l.f(this.f6506g, this.f6507h);
            this.f6504e = 1;
            if (androidx.compose.foundation.gestures.a.a(o0Var, f3, this) == aVar) {
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
