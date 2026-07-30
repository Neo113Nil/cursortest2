package k;

import com.android.installreferrer.api.InstallReferrerClient;
import z0.s0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final u f5266h;

    /* renamed from: i, reason: collision with root package name */
    public static final u f5267i;

    /* renamed from: j, reason: collision with root package name */
    public static final u f5268j;

    /* renamed from: k, reason: collision with root package name */
    public static final u f5269k;

    /* renamed from: l, reason: collision with root package name */
    public static final u f5270l;

    /* renamed from: m, reason: collision with root package name */
    public static final u f5271m;

    /* renamed from: n, reason: collision with root package name */
    public static final u f5272n;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5273g;

    static {
        int i7 = 1;
        f5266h = new u(i7, 0);
        f5267i = new u(i7, 1);
        f5268j = new u(i7, 2);
        f5269k = new u(i7, 3);
        f5270l = new u(i7, 4);
        f5271m = new u(i7, 5);
        f5272n = new u(i7, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i7, int i8) {
        super(i7);
        this.f5273g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f5273g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                long a3 = z0.u.a(((z0.u) obj).f10059a, a1.d.f237t);
                return new l.p(z0.u.d(a3), z0.u.h(a3), z0.u.g(a3), z0.u.e(a3));
            case 1:
                long j8 = ((s0) obj).f10049a;
                return new l.n(s0.b(j8), s0.c(j8));
            case 2:
                l.n nVar = (l.n) obj;
                float f9 = nVar.f5574a;
                float f10 = nVar.f5575b;
                return new s0((Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
            case 3:
                return l.e.k(7, null);
            case 4:
                ((Number) obj).intValue();
                return 0;
            case 5:
                ((Number) obj).intValue();
                return 0;
            default:
                return b0.f5178c;
        }
    }
}
