package g0;

import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends r6.l implements q6.a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f3660h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f3661i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3662g;

    static {
        int i7 = 0;
        f3660h = new a(i7, 0);
        f3661i = new a(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, int i8) {
        super(i7);
        this.f3662g = i8;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f3662g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Looper.getMainLooper() != null ? c0.f3696f : w1.f3956f;
            default:
                d.x("Unexpected call to default provider");
                throw null;
        }
    }
}
