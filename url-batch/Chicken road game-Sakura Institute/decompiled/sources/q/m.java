package q;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m implements p1.f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m f7305b = new m(0);

    /* renamed from: c, reason: collision with root package name */
    public static final m f7306c = new m(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7307a;

    public /* synthetic */ m(int i7) {
        this.f7307a = i7;
    }

    @Override // p1.f0
    public final p1.g0 a(p1.h0 h0Var, List list, long j8) {
        switch (this.f7307a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return h0Var.C(m2.a.j(j8), m2.a.i(j8), e6.v.f2827f, l.f7300h);
            default:
                return h0Var.C(m2.a.f(j8) ? m2.a.h(j8) : 0, m2.a.e(j8) ? m2.a.g(j8) : 0, e6.v.f2827f, l.f7302j);
        }
    }
}
