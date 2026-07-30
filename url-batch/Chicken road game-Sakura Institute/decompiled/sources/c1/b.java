package c1;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final b f1525h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f1526i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1527g;

    static {
        int i7 = 1;
        f1525h = new b(i7, 0);
        f1526i = new b(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i8) {
        super(i7);
        this.f1527g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f1527g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                b1.e.t((b1.e) obj, u.f10056f, 0L, 0L, 126);
                break;
        }
        return z.f2639a;
    }
}
