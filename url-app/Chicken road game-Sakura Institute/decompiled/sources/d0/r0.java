package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r0 extends r6.l implements q6.a {

    /* renamed from: h, reason: collision with root package name */
    public static final r0 f2344h;

    /* renamed from: i, reason: collision with root package name */
    public static final r0 f2345i;

    /* renamed from: j, reason: collision with root package name */
    public static final r0 f2346j;

    /* renamed from: k, reason: collision with root package name */
    public static final r0 f2347k;

    /* renamed from: l, reason: collision with root package name */
    public static final r0 f2348l;

    /* renamed from: m, reason: collision with root package name */
    public static final r0 f2349m;

    /* renamed from: n, reason: collision with root package name */
    public static final r0 f2350n;

    /* renamed from: o, reason: collision with root package name */
    public static final r0 f2351o;

    /* renamed from: p, reason: collision with root package name */
    public static final r0 f2352p;

    /* renamed from: q, reason: collision with root package name */
    public static final r0 f2353q;

    /* renamed from: r, reason: collision with root package name */
    public static final r0 f2354r;

    /* renamed from: s, reason: collision with root package name */
    public static final r0 f2355s;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2356g;

    static {
        int i7 = 0;
        f2344h = new r0(i7, 0);
        f2345i = new r0(i7, 1);
        f2346j = new r0(i7, 2);
        f2347k = new r0(i7, 3);
        f2348l = new r0(i7, 4);
        f2349m = new r0(i7, 5);
        f2350n = new r0(i7, 6);
        f2351o = new r0(i7, 7);
        f2352p = new r0(i7, 8);
        f2353q = new r0(i7, 9);
        f2354r = new r0(i7, 10);
        f2355s = new r0(i7, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i7, int i8) {
        super(i7);
        this.f2356g = i8;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f2356g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return s0.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1);
            case 1:
                return Boolean.TRUE;
            case 2:
                return new z0.u(z0.u.f10052b);
            case 3:
                return Boolean.TRUE;
            case 4:
                return new m2.e(48);
            case 5:
                return Boolean.FALSE;
            case 6:
                return new c3();
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.FALSE;
            case 8:
                return new n3();
            case q.c.f7259c /* 9 */:
                return new m2.e(0);
            case q.c.f7261e /* 10 */:
                return f0.w.f3075a;
            case 11:
                return new a4();
            case 12:
                return d6.z.f2639a;
            default:
                return Float.valueOf(0.0f);
        }
    }
}
