package o;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6808g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f6809h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(g0.z0 z0Var, int i7) {
        super(1);
        this.f6808g = i7;
        this.f6809h = z0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7 = this.f6808g;
        d6.z zVar = d6.z.f2639a;
        g0.z0 z0Var = this.f6809h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                Configuration configuration = new Configuration((Configuration) obj);
                g0.z zVar2 = AndroidCompositionLocals_androidKt.f738a;
                z0Var.setValue(configuration);
                break;
            default:
                ((q6.c) z0Var.getValue()).f(new y0.c(((y0.c) obj).f9778a));
                break;
        }
        return zVar;
    }
}
