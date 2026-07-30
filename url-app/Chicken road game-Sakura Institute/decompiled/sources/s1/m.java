package s1;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final m f8280h;

    /* renamed from: i, reason: collision with root package name */
    public static final m f8281i;

    /* renamed from: j, reason: collision with root package name */
    public static final m f8282j;

    /* renamed from: k, reason: collision with root package name */
    public static final m f8283k;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8284g;

    static {
        int i7 = 1;
        f8280h = new m(i7, 0);
        f8281i = new m(i7, 1);
        f8282j = new m(i7, 2);
        f8283k = new m(i7, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i7) {
        super(1);
        this.f8284g = 6;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f8284g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return d6.z.f2639a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Boolean.valueOf(j0.n(obj));
            case 4:
                Boolean B = x0.d.B((x0.r) obj);
                return Boolean.valueOf(B != null ? B.booleanValue() : true);
            case 5:
                Boolean B2 = x0.d.B((x0.r) obj);
                return Boolean.valueOf(B2 != null ? B2.booleanValue() : true);
            default:
                Boolean B3 = x0.d.B((x0.r) obj);
                return Boolean.valueOf(B3 != null ? B3.booleanValue() : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i7, int i8) {
        super(i7);
        this.f8284g = i8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(x0.b bVar, int i7) {
        super(1);
        this.f8284g = i7;
    }
}
