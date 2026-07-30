package q;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final l f7300h;

    /* renamed from: i, reason: collision with root package name */
    public static final l f7301i;

    /* renamed from: j, reason: collision with root package name */
    public static final l f7302j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7303g;

    static {
        int i7 = 1;
        f7300h = new l(i7, 0);
        f7301i = new l(i7, 1);
        f7302j = new l(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i7, int i8) {
        super(i7);
        this.f7303g = i8;
    }

    @Override // q6.c
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        switch (this.f7303g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                break;
            default:
                break;
        }
        return d6.z.f2639a;
    }
}
