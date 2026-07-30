package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final a0 f1811h;

    /* renamed from: i, reason: collision with root package name */
    public static final a0 f1812i;

    /* renamed from: j, reason: collision with root package name */
    public static final a0 f1813j;

    /* renamed from: k, reason: collision with root package name */
    public static final a0 f1814k;

    /* renamed from: l, reason: collision with root package name */
    public static final a0 f1815l;

    /* renamed from: m, reason: collision with root package name */
    public static final a0 f1816m;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1817g;

    static {
        int i7 = 1;
        f1811h = new a0(i7, 0);
        f1812i = new a0(i7, 1);
        f1813j = new a0(i7, 2);
        f1814k = new a0(i7, 3);
        f1815l = new a0(i7, 4);
        f1816m = new a0(i7, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i7, int i8) {
        super(i7);
        this.f1817g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7 = this.f1817g;
        d6.z zVar = d6.z.f2639a;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y1.r.d((y1.i) obj, 0);
                break;
            case 1:
                y1.r.d((y1.i) obj, 0);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                x6.e[] eVarArr = y1.r.f9886a;
                y1.s sVar = y1.p.f9870l;
                x6.e eVar = y1.r.f9886a[5];
                sVar.a((y1.i) obj, Boolean.TRUE);
                break;
        }
        return zVar;
    }
}
