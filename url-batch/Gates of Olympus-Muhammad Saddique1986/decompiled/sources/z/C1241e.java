package z;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import u0.S;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1241e extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10442h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10443i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ R0.g f10444j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1242f f10445k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1258v f10446l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241e(R0.g gVar, C1242f c1242f, C1258v c1258v, V1.d dVar) {
        super(2, dVar);
        this.f10444j = gVar;
        this.f10445k = c1242f;
        this.f10446l = c1258v;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((C1241e) o((V1.d) obj2, (S) obj)).q(R1.y.f4171a);
        return W1.a.f4608d;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1241e c1241e = new C1241e(this.f10444j, this.f10445k, this.f10446l, dVar);
        c1241e.f10443i = obj;
        return c1241e;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10442h;
        if (i3 == 0) {
            R1.a.e(obj);
            C1240d c1240d = new C1240d((S) this.f10443i, this.f10444j, this.f10445k, this.f10446l, null);
            this.f10442h = 1;
            if (AbstractC0837y.e(c1240d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        throw new C1.c();
    }
}
