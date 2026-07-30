package g4;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements q6.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4308g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f4309h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4310i;

    public /* synthetic */ i(String str, String str2, Object obj, int i7, int i8) {
        this.f4307f = i8;
        this.f4308g = str;
        this.f4309h = str2;
        this.f4310i = obj;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f4307f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                int T = g0.d.T(7);
                a8.d.i(this.f4308g, this.f4309h, (s0.o) this.f4310i, (g0.p) obj, T);
                break;
            default:
                ((Integer) obj2).getClass();
                int T2 = g0.d.T(1);
                a8.d.h(this.f4308g, this.f4309h, (q6.a) this.f4310i, (g0.p) obj, T2);
                break;
        }
        return d6.z.f2639a;
    }
}
