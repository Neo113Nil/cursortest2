package g2;

import com.android.installreferrer.api.InstallReferrerClient;
import z0.f0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final d f4003h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f4004i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f4005j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f4006k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f4007l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f4008m;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4009g;

    static {
        int i7 = 1;
        f4003h = new d(i7, 0);
        f4004i = new d(i7, 1);
        f4005j = new d(i7, 2);
        f4006k = new d(i7, 3);
        f4007l = new d(i7, 4);
        f4008m = new d(i7, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, int i8) {
        super(i7);
        this.f4009g = i8;
    }

    @Override // q6.c
    public final /* synthetic */ Object f(Object obj) {
        switch (this.f4009g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float[] fArr = ((f0) obj).f9990a;
                break;
            case 1:
                float[] fArr2 = ((f0) obj).f9990a;
                break;
            case 2:
                break;
            case 3:
                int i7 = ((l) obj).f4040a;
                break;
            case 4:
                break;
            default:
                int i8 = ((l) obj).f4040a;
                break;
        }
        return d6.z.f2639a;
    }
}
