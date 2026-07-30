package m;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 extends r6.l implements q6.a {

    /* renamed from: h, reason: collision with root package name */
    public static final i0 f6179h;

    /* renamed from: i, reason: collision with root package name */
    public static final i0 f6180i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6181g;

    static {
        int i7 = 0;
        f6179h = new i0(i7, 0);
        f6180i = new i0(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i7, int i8) {
        super(i7);
        this.f6181g = i8;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f6181g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return u.f6263a;
            case 1:
                return new u0();
            default:
                return new g1(0);
        }
    }
}
