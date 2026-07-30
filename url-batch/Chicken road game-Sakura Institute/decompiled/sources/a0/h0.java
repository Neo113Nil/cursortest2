package a0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final h0 f79h;

    /* renamed from: i, reason: collision with root package name */
    public static final h0 f80i;

    /* renamed from: j, reason: collision with root package name */
    public static final h0 f81j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f82g;

    static {
        int i7 = 1;
        f79h = new h0(i7, 0);
        f80i = new h0(i7, 1);
        f81j = new h0(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i7, int i8) {
        super(i7);
        this.f82g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f82g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                long j8 = ((y0.c) obj).f9778a;
                return u3.r.h(j8) ? new l.n(y0.c.d(j8), y0.c.e(j8)) : m0.f106a;
            case 1:
                l.n nVar = (l.n) obj;
                return new y0.c(u3.r.a(nVar.f5574a, nVar.f5575b));
            default:
                return d6.z.f2639a;
        }
    }
}
