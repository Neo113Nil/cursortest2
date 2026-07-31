package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f177h;

    public /* synthetic */ y(int i, b6.x0 x0Var, p6.a aVar, p6.a aVar2, int i8) {
        this.f173d = 2;
        this.f175f = i;
        this.f176g = x0Var;
        this.f174e = aVar;
        this.f177h = aVar2;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f173d) {
            case 0:
                ((Integer) obj2).getClass();
                int w7 = m0.b.w(1);
                g0.d((z.h) this.f176g, this.f174e, this.f175f, this.f177h, (m0.s) obj, w7);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int w8 = m0.b.w(this.f175f | 1);
                ((y0) this.f176g).b(this.f174e, (u0.c) this.f177h, (m0.s) obj, w8);
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                int w9 = m0.b.w(3073);
                b6.k.q(this.f175f, (b6.x0) this.f176g, (p6.a) this.f174e, (p6.a) this.f177h, (m0.s) obj, w9);
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                int w10 = m0.b.w(3073);
                b6.k.w((b6.k1) this.f176g, this.f175f, (p6.a) this.f174e, (y0.m) this.f177h, (m0.s) obj, w10);
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).intValue();
                m.a.c((androidx.lifecycle.u) this.f176g, (j4.d) this.f174e, (p6.c) this.f177h, (m0.s) obj, m0.b.w(this.f175f | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                int w11 = m0.b.w(this.f175f) | 1;
                ((u0.c) this.f176g).a(this.f174e, this.f177h, (m0.s) obj, w11);
                break;
            default:
                ((Integer) obj2).getClass();
                int w12 = m0.b.w(this.f175f | 1);
                ((v0.d) this.f176g).b(this.f174e, (u0.c) this.f177h, (m0.s) obj, w12);
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ y(b6.k1 k1Var, int i, p6.a aVar, y0.m mVar, int i8) {
        this.f173d = 3;
        this.f176g = k1Var;
        this.f175f = i;
        this.f174e = aVar;
        this.f177h = mVar;
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i, int i8) {
        this.f173d = i8;
        this.f176g = obj;
        this.f174e = obj2;
        this.f177h = obj3;
        this.f175f = i;
    }

    public /* synthetic */ y(z.h hVar, Object obj, int i, Object obj2, int i8) {
        this.f173d = 0;
        this.f176g = hVar;
        this.f174e = obj;
        this.f175f = i;
        this.f177h = obj2;
    }
}
