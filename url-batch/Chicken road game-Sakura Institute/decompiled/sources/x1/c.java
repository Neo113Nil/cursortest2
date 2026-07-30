package x1;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import r6.l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final c f9646h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f9647i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f9648j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9649g;

    static {
        int i7 = 1;
        f9646h = new c(i7, 0);
        f9647i = new c(i7, 1);
        f9648j = new c(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, int i8) {
        super(i7);
        this.f9649g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f9649g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj).longValue();
                return z.f2639a;
            case 1:
                return Integer.valueOf(((k) obj).f9668b);
            default:
                m2.i iVar = ((k) obj).f9669c;
                return Integer.valueOf(iVar.f6320d - iVar.f6318b);
        }
    }
}
