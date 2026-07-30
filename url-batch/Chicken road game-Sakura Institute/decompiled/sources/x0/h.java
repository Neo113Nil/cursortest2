package x0;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final h f9606h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f9607i;

    /* renamed from: j, reason: collision with root package name */
    public static final h f9608j;

    /* renamed from: k, reason: collision with root package name */
    public static final h f9609k;

    /* renamed from: l, reason: collision with root package name */
    public static final h f9610l;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9611g;

    static {
        int i7 = 1;
        f9606h = new h(i7, 0);
        f9607i = new h(i7, 1);
        f9608j = new h(i7, 2);
        f9609k = new h(i7, 3);
        f9610l = new h(i7, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i7) {
        super(1);
        this.f9611g = 5;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f9611g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((i) obj).b(false);
                return z.f2639a;
            case 1:
                int i7 = ((b) obj).f9595a;
                return n.f9624b;
            case 2:
                int i8 = ((b) obj).f9595a;
                return n.f9624b;
            case 3:
                Boolean B = d.B((r) obj);
                return Boolean.valueOf(B != null ? B.booleanValue() : false);
            case 4:
                Boolean B2 = d.B((r) obj);
                return Boolean.valueOf(B2 != null ? B2.booleanValue() : false);
            default:
                Boolean B3 = d.B((r) obj);
                return Boolean.valueOf(B3 != null ? B3.booleanValue() : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, int i8) {
        super(i7);
        this.f9611g = i8;
    }
}
