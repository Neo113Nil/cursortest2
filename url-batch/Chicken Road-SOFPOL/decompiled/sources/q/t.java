package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t extends q6.j implements p6.c {

    /* renamed from: f, reason: collision with root package name */
    public static final t f5905f;

    /* renamed from: g, reason: collision with root package name */
    public static final t f5906g;

    /* renamed from: h, reason: collision with root package name */
    public static final t f5907h;
    public static final t i;

    /* renamed from: j, reason: collision with root package name */
    public static final t f5908j;

    /* renamed from: k, reason: collision with root package name */
    public static final t f5909k;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5910e;

    static {
        int i8 = 1;
        f5905f = new t(i8, 0);
        f5906g = new t(i8, 1);
        f5907h = new t(i8, 2);
        i = new t(i8, 3);
        f5908j = new t(i8, 4);
        f5909k = new t(i8, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i8, int i9) {
        super(i8);
        this.f5910e = i9;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f5910e) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 1:
                long a8 = f1.s.a(((f1.s) obj).f2705a, g1.d.f2843x);
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                long j7 = ((f1.l0) obj).f2685a;
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                r.m mVar = (r.m) obj;
                float f6 = mVar.f6357a;
                float f8 = mVar.f6358b;
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                break;
            case 5:
                break;
        }
        return new r2.k((((int) (((r2.k) obj).f6528a >> 32)) << 32) | (0 & 4294967295L));
    }
}
