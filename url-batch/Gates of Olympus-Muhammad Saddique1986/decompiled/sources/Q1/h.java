package Q1;

import R1.y;
import e2.InterfaceC0426e;
import n2.AbstractC0730j;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class h extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f3979h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3980i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J1.a f3981j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f3982k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f3983l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ double f3984m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f3985n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f3986o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(J1.a aVar, String str, String str2, double d3, String str3, j jVar, V1.d dVar) {
        super(2, dVar);
        this.f3981j = aVar;
        this.f3982k = str;
        this.f3983l = str2;
        this.f3984m = d3;
        this.f3985n = str3;
        this.f3986o = jVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((h) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        h hVar = new h(this.f3981j, this.f3982k, this.f3983l, this.f3984m, this.f3985n, this.f3986o, dVar);
        hVar.f3980i = obj;
        return hVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        String obj2;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f3979h;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                J1.a aVar2 = this.f3981j;
                if (aVar2 == null || (obj2 = aVar2.f3160b) == null) {
                    obj2 = AbstractC0730j.Y(this.f3982k).toString();
                }
                String str = obj2;
                Long l3 = aVar2 != null ? new Long(aVar2.f3159a) : null;
                String obj3 = AbstractC0730j.Y(this.f3983l).toString();
                if (AbstractC0730j.K(obj3)) {
                    obj3 = "Haircut";
                }
                J1.d dVar = new J1.d(0L, l3, str, obj3, this.f3984m, AbstractC0730j.Y(this.f3985n).toString(), 0L);
                K1.a aVar3 = (K1.a) this.f3986o.f3990b.f2916g;
                this.f3979h = 1;
                obj = aVar3.b(dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
            }
            new Long(((Number) obj).longValue());
        } catch (Throwable th) {
            R1.a.b(th);
        }
        return y.f4171a;
    }
}
