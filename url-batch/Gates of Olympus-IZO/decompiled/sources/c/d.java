package c;

import I2.l;
import L1.z;
import R1.i;
import Z1.p;
import k2.m0;

/* loaded from: classes.dex */
public final class d extends i implements Y1.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, P1.d dVar, int i3) {
        super(3, dVar);
        this.f4324e = i3;
        this.f4325f = obj;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        P1.d dVar = (P1.d) obj3;
        switch (this.f4324e) {
            case 0:
                d dVar2 = new d((p) this.f4325f, dVar, 0);
                z zVar = z.f2729a;
                dVar2.invokeSuspend(zVar);
                return zVar;
            default:
                d dVar3 = new d((m0) this.f4325f, dVar, 1);
                z zVar2 = z.f2729a;
                dVar3.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        z zVar = z.f2729a;
        Object obj2 = this.f4325f;
        switch (this.f4324e) {
            case 0:
                Q1.a aVar = Q1.a.f3113d;
                l.Q(obj);
                ((p) obj2).f3476d = true;
                break;
            default:
                Q1.a aVar2 = Q1.a.f3113d;
                l.Q(obj);
                ((m0) obj2).a(null);
                break;
        }
        return zVar;
    }
}
