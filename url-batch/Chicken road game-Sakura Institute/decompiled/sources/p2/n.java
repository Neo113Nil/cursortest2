package p2;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends r6.l implements q6.e {

    /* renamed from: h, reason: collision with root package name */
    public static final n f7154h;

    /* renamed from: i, reason: collision with root package name */
    public static final n f7155i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7156g;

    static {
        int i7 = 2;
        f7154h = new n(i7, 0);
        f7155i = new n(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i7, int i8) {
        super(i7);
        this.f7156g = i8;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f7156g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                }
                break;
            default:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                }
                break;
        }
        return d6.z.f2639a;
    }
}
