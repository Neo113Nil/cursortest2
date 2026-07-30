package t3;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.u0;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f8788h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i7) {
        super(0);
        this.f8787g = i7;
        this.f8788h = hVar;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f8787g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                h hVar = this.f8788h;
                Context context = hVar.f8791f;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new u0(applicationContext instanceof Application ? (Application) applicationContext : null, hVar, hVar.g());
            default:
                h hVar2 = this.f8788h;
                if (!hVar2.f8800o) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                androidx.lifecycle.x xVar = hVar2.f8798m;
                if (xVar.f1046d == androidx.lifecycle.o.f1007f) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                e eVar = new e();
                eVar.f8779a = (x3.e) hVar2.f8799n.f138d;
                eVar.f8780b = xVar;
                return ((f) new b6.c(hVar2.e(), eVar, hVar2.d()).o(r6.w.a(f.class))).f8786b;
        }
    }
}
