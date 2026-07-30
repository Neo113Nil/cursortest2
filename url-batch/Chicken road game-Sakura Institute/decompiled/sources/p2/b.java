package p2;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final b f7116h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f7117i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f7118j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f7119k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f7120l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f7121m;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7122g;

    static {
        int i7 = 1;
        f7116h = new b(i7, 0);
        f7117i = new b(i7, 1);
        f7118j = new b(i7, 2);
        f7119k = new b(i7, 3);
        f7120l = new b(i7, 4);
        f7121m = new b(i7, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i8) {
        super(i7);
        this.f7122g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7 = this.f7122g;
        d6.z zVar = d6.z.f2639a;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x6.e[] eVarArr = y1.r.f9886a;
                ((y1.i) obj).m(y1.p.f9876r, zVar);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                x6.e[] eVarArr2 = y1.r.f9886a;
                ((y1.i) obj).m(y1.p.f9875q, zVar);
                break;
            case 4:
                break;
            default:
                v vVar = (v) obj;
                if (vVar.isAttachedToWindow()) {
                    vVar.l();
                    break;
                }
                break;
        }
        return zVar;
    }
}
