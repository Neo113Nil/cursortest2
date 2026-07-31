package m;

import e2.InterfaceC0424c;
import q2.AbstractC0837y;

/* loaded from: classes.dex */
public final class P extends X1.i implements InterfaceC0424c {

    /* renamed from: h, reason: collision with root package name */
    public int f6650h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6651i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6652j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ U f6653k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0 f6654l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f6655m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Object obj, Object obj2, U u3, l0 l0Var, float f3, V1.d dVar) {
        super(1, dVar);
        this.f6651i = obj;
        this.f6652j = obj2;
        this.f6653k = u3;
        this.f6654l = l0Var;
        this.f6655m = f3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        l0 l0Var = this.f6654l;
        float f3 = this.f6655m;
        return new P(this.f6651i, this.f6652j, this.f6653k, l0Var, f3, (V1.d) obj).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6650h;
        if (i3 == 0) {
            R1.a.e(obj);
            O o3 = new O(this.f6651i, this.f6652j, this.f6653k, this.f6654l, this.f6655m, null);
            this.f6650h = 1;
            if (AbstractC0837y.e(o3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return R1.y.f4171a;
    }
}
