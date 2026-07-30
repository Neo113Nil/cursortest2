package m;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final k f6187h;

    /* renamed from: i, reason: collision with root package name */
    public static final k f6188i;

    /* renamed from: j, reason: collision with root package name */
    public static final k f6189j;

    /* renamed from: k, reason: collision with root package name */
    public static final k f6190k;

    /* renamed from: l, reason: collision with root package name */
    public static final k f6191l;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6192g;

    static {
        int i7 = 1;
        f6187h = new k(i7, 0);
        f6188i = new k(i7, 1);
        f6189j = new k(i7, 2);
        f6190k = new k(i7, 3);
        f6191l = new k(i7, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i7, int i8) {
        super(i7);
        this.f6192g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7 = this.f6192g;
        d6.z zVar = d6.z.f2639a;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((r1.f0) obj).b();
                return zVar;
            case 1:
                return zVar;
            case 2:
                ((Number) obj).longValue();
                return zVar;
            case 3:
                y1.e eVar = y1.e.f9800c;
                x6.e[] eVarArr = y1.r.f9886a;
                y1.s sVar = y1.p.f9861c;
                x6.e eVar2 = y1.r.f9886a[1];
                sVar.a((y1.i) obj, eVar);
                return zVar;
            default:
                return new g1(((Number) obj).intValue());
        }
    }
}
