package o;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.n2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final e f6594h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f6595i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6596g;

    static {
        int i7 = 1;
        f6594h = new e(i7, 0);
        f6595i = new e(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, int i8) {
        super(i7);
        this.f6596g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f6596g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.k1 k1Var = (g0.k1) obj;
                n2 n2Var = AndroidCompositionLocals_androidKt.f739b;
                k1Var.getClass();
                if (((Context) g0.d.K(k1Var, n2Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return g.f6620b;
                }
                d.f6587a.getClass();
                return c.f6572c;
            default:
                return Boolean.valueOf(!(((l1.v) obj).f5838i == 2));
        }
    }
}
