package r1;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e1 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f7764b = new e1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7765a;

    public /* synthetic */ e1(int i7) {
        this.f7765a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7765a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d0 d0Var = (d0) obj;
                d0 d0Var2 = (d0) obj2;
                int g9 = r6.k.g(d0Var2.f7728o, d0Var.f7728o);
                return g9 != 0 ? g9 : r6.k.g(d0Var.hashCode(), d0Var2.hashCode());
            default:
                d0 d0Var3 = (d0) obj;
                d0 d0Var4 = (d0) obj2;
                int g10 = r6.k.g(d0Var3.f7728o, d0Var4.f7728o);
                return g10 != 0 ? g10 : r6.k.g(d0Var3.hashCode(), d0Var4.hashCode());
        }
    }
}
