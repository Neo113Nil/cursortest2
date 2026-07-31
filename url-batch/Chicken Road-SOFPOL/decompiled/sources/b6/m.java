package b6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1381h;
    public /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, int i8, g6.c cVar) {
        super(i, cVar);
        this.f1381h = i8;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1381h) {
            case 0:
                m mVar = (m) l((g6.c) obj2, (b4.a) obj);
                c6.m mVar2 = c6.m.f1757a;
                mVar.p(mVar2);
                return mVar2;
            case 1:
                return ((m) l((g6.c) obj2, (d7.g0) obj)).p(c6.m.f1757a);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return ((m) l((g6.c) obj2, (m0.u1) obj)).p(c6.m.f1757a);
            default:
                return ((m) l((g6.c) obj2, (y3.s0) obj)).p(c6.m.f1757a);
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f1381h) {
            case 0:
                m mVar = new m(2, 0, cVar);
                mVar.i = obj;
                return mVar;
            case 1:
                m mVar2 = new m(2, 1, cVar);
                mVar2.i = obj;
                return mVar2;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m mVar3 = new m(2, 2, cVar);
                mVar3.i = obj;
                return mVar3;
            default:
                m mVar4 = new m(2, 3, cVar);
                mVar4.i = obj;
                return mVar4;
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f1381h) {
            case 0:
                b4.a aVar = (b4.a) this.i;
                s6.a.K(obj);
                Boolean bool = Boolean.FALSE;
                aVar.getClass();
                b4.c cVar = w.f1483h;
                q6.i.e(cVar, "key");
                aVar.d(cVar, bool);
                return c6.m.f1757a;
            case 1:
                s6.a.K(obj);
                return Boolean.valueOf(((d7.g0) this.i) != d7.g0.f2360d);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                s6.a.K(obj);
                return Boolean.valueOf(((m0.u1) this.i) == m0.u1.f5126d);
            default:
                s6.a.K(obj);
                return Boolean.valueOf(!(((y3.s0) this.i) instanceof y3.k0));
        }
    }
}
