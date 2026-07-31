package p;

import F.C0131y0;
import e2.InterfaceC0426e;
import m.AbstractC0620e;

/* renamed from: p.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752a0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7638h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7639i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0793v0 f7640j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f7641k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f2.r f7642l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0752a0(C0793v0 c0793v0, long j3, f2.r rVar, V1.d dVar) {
        super(2, dVar);
        this.f7640j = c0793v0;
        this.f7641k = j3;
        this.f7642l = rVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0752a0) o((V1.d) obj2, (C0787s0) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0752a0 c0752a0 = new C0752a0(this.f7640j, this.f7641k, this.f7642l, dVar);
        c0752a0.f7639i = obj;
        return c0752a0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7638h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0787s0 c0787s0 = (C0787s0) this.f7639i;
            C0793v0 c0793v0 = this.f7640j;
            float f3 = c0793v0.f(this.f7641k);
            C0131y0 c0131y0 = new C0131y0(this.f7642l, c0793v0, c0787s0, 4);
            this.f7638h = 1;
            if (AbstractC0620e.c(0.0f, f3, null, c0131y0, this, 12) == aVar) {
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
