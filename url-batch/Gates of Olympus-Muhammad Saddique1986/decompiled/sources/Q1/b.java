package Q1;

import R1.y;
import e2.InterfaceC0426e;
import n2.AbstractC0730j;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class b extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f3962h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3963i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J1.a f3964j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f3965k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f3966l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f3967m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f3968n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(J1.a aVar, String str, String str2, String str3, c cVar, V1.d dVar) {
        super(2, dVar);
        this.f3964j = aVar;
        this.f3965k = str;
        this.f3966l = str2;
        this.f3967m = str3;
        this.f3968n = cVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((b) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        b bVar = new b(this.f3964j, this.f3965k, this.f3966l, this.f3967m, this.f3968n, dVar);
        bVar.f3963i = obj;
        return bVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        Object u3;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f3962h;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                J1.a aVar2 = this.f3964j;
                if (aVar2 == null) {
                    aVar2 = new J1.a(0L, this.f3965k, "", "", 0L);
                }
                J1.a a3 = J1.a.a(aVar2, AbstractC0730j.Y(this.f3965k).toString(), AbstractC0730j.Y(this.f3966l).toString(), AbstractC0730j.Y(this.f3967m).toString(), 0L, 17);
                K1.b bVar = (K1.b) this.f3968n.f3969b.f2913d;
                this.f3962h = 1;
                bVar.getClass();
                if (AbstractC0730j.K(a3.f3160b)) {
                    throw new IllegalArgumentException("Client name is required");
                }
                if (a3.f3163e == 0) {
                    a3 = J1.a.a(a3, null, null, null, System.currentTimeMillis(), 15);
                }
                u3 = bVar.f3257a.u(a3, this);
                if (u3 == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
                u3 = obj;
            }
            new Long(((Number) u3).longValue());
        } catch (Throwable th) {
            R1.a.b(th);
        }
        return y.f4171a;
    }
}
