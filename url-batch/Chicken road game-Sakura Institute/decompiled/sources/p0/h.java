package p0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends r6.l implements q6.a {

    /* renamed from: h, reason: collision with root package name */
    public static final h f7006h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f7007i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7008g;

    static {
        int i7 = 0;
        f7006h = new h(i7, 0);
        f7007i = new h(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, int i8) {
        super(i7);
        this.f7008g = i8;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f7008g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new g(new LinkedHashMap());
            default:
                return null;
        }
    }
}
