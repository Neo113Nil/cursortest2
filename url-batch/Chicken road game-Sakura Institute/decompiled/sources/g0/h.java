package g0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends r6.l implements q6.e {

    /* renamed from: h, reason: collision with root package name */
    public static final h f3735h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f3736i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3737g;

    static {
        int i7 = 2;
        f3735h = new h(i7, 0);
        f3736i = new h(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, int i8) {
        super(i7);
        this.f3737g = i8;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f3737g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p pVar = (p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                }
                break;
            default:
                p pVar2 = (p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                }
                break;
        }
        return d6.z.f2639a;
    }
}
