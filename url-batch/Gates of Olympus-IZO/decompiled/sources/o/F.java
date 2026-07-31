package o;

/* loaded from: classes.dex */
public final class F extends R1.i implements Y1.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i3, P1.d dVar, int i4) {
        super(i3, dVar);
        this.f6434e = i4;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.f6434e) {
            case 0:
                long j3 = ((a0.c) obj2).f3489a;
                F f3 = new F(3, (P1.d) obj3, 0);
                L1.z zVar = L1.z.f2729a;
                f3.invokeSuspend(zVar);
                return zVar;
            case 1:
                ((Number) obj2).floatValue();
                F f4 = new F(3, (P1.d) obj3, 1);
                L1.z zVar2 = L1.z.f2729a;
                f4.invokeSuspend(zVar2);
                return zVar2;
            default:
                long j4 = ((a0.c) obj2).f3489a;
                F f5 = new F(3, (P1.d) obj3, 2);
                L1.z zVar3 = L1.z.f2729a;
                f5.invokeSuspend(zVar3);
                return zVar3;
        }
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        L1.z zVar = L1.z.f2729a;
        switch (this.f6434e) {
            case 0:
                Q1.a aVar = Q1.a.f3113d;
                I2.l.Q(obj);
                break;
            case 1:
                Q1.a aVar2 = Q1.a.f3113d;
                I2.l.Q(obj);
                break;
            default:
                Q1.a aVar3 = Q1.a.f3113d;
                I2.l.Q(obj);
                break;
        }
        return zVar;
    }
}
