package q0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final m f7423h;

    /* renamed from: i, reason: collision with root package name */
    public static final m f7424i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7425g;

    static {
        int i7 = 1;
        f7423h = new m(i7, 0);
        f7424i = new m(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i7, int i8) {
        super(i7);
        this.f7425g = i8;
    }

    @Override // q6.c
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        switch (this.f7425g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                break;
        }
        return d6.z.f2639a;
    }
}
