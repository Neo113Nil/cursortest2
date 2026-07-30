package r;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final k f7626h;

    /* renamed from: i, reason: collision with root package name */
    public static final k f7627i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7628g;

    static {
        int i7 = 1;
        f7626h = new k(i7, 0);
        f7627i = new k(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i7, int i8) {
        super(i7);
        this.f7628g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f7628g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return z.f2639a;
            default:
                List list = (List) obj;
                return new s(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
