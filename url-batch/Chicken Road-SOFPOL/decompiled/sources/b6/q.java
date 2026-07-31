package b6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q implements d7.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d7.f f1423e;

    public /* synthetic */ q(d7.f fVar, int i) {
        this.f1422d = i;
        this.f1423e = fVar;
    }

    @Override // d7.f
    public final Object c(d7.g gVar, g6.c cVar) {
        switch (this.f1422d) {
            case 0:
                Object c8 = this.f1423e.c(new p(gVar, 0), cVar);
                if (c8 != h6.a.f3204d) {
                    break;
                }
                break;
            case 1:
                Object c9 = this.f1423e.c(new p(gVar, 1), cVar);
                if (c9 != h6.a.f3204d) {
                    break;
                }
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                Object c10 = this.f1423e.c(new p(gVar, 2), cVar);
                if (c10 != h6.a.f3204d) {
                    break;
                }
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                Object c11 = this.f1423e.c(new p(gVar, 3), cVar);
                if (c11 != h6.a.f3204d) {
                    break;
                }
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                Object c12 = this.f1423e.c(new p(gVar, 4), cVar);
                if (c12 != h6.a.f3204d) {
                    break;
                }
                break;
            default:
                Object c13 = this.f1423e.c(new p(gVar, 5), cVar);
                if (c13 != h6.a.f3204d) {
                    break;
                }
                break;
        }
        return c6.m.f1757a;
    }
}
