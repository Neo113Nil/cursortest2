package x0;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends r6.l implements q6.a {

    /* renamed from: h, reason: collision with root package name */
    public static final f f9603h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f9604i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9605g;

    static {
        int i7 = 0;
        f9603h = new f(i7, 0);
        f9604i = new f(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i7, int i8) {
        super(i7);
        this.f9605g = i8;
    }

    @Override // q6.a
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f9605g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.FALSE;
            default:
                return z.f2639a;
        }
    }
}
