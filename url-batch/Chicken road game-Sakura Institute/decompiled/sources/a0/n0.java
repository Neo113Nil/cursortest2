package a0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n0 extends r6.l implements q6.a {

    /* renamed from: h, reason: collision with root package name */
    public static final n0 f113h;

    /* renamed from: i, reason: collision with root package name */
    public static final n0 f114i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f115g;

    static {
        int i7 = 0;
        f113h = new n0(i7, 0);
        f114i = new n0(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i7, int i8) {
        super(i7);
        this.f115g = i8;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f115g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return null;
            default:
                return h1.f84b;
        }
    }
}
