package y;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final a f9700h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f9701i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f9702j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9703g;

    static {
        int i7 = 1;
        f9700h = new a(i7, 0);
        f9701i = new a(i7, 1);
        f9702j = new a(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, int i8) {
        super(i7);
        this.f9703g = i8;
    }

    @Override // q6.c
    public final /* synthetic */ Object f(Object obj) {
        switch (this.f9703g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj).longValue();
                break;
            case 1:
                break;
            default:
                int i7 = ((g2.l) obj).f4040a;
                break;
        }
        return z.f2639a;
    }
}
