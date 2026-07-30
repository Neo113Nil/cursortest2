package f1;

import android.graphics.PathMeasure;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends r6.l implements q6.a {

    /* renamed from: h, reason: collision with root package name */
    public static final h f3156h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f3157i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3158g;

    static {
        int i7 = 0;
        f3156h = new h(i7, 0);
        f3157i = new h(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, int i8) {
        super(i7);
        this.f3158g = i8;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f3158g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new z0.k(new PathMeasure());
            default:
                return d6.z.f2639a;
        }
    }
}
