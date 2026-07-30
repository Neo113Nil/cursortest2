package N0;

import G0.s;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1791b;

    public /* synthetic */ h(int i2, Object obj) {
        this.f1790a = i2;
        this.f1791b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f1790a) {
            case 1:
                f4.a aVar = (f4.a) this.f1791b;
                aVar.f4801c.post(new A.j(aVar, 21, l2.c.w(((ConnectivityManager) aVar.f4799a.f6269d).getNetworkCapabilities(network))));
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        switch (this.f1790a) {
            case 0:
                Intrinsics.checkNotNullParameter(network, "network");
                Intrinsics.checkNotNullParameter(capabilities, "capabilities");
                s.d().a(j.f1794a, "Network capabilities changed: " + capabilities);
                i iVar = (i) this.f1791b;
                iVar.c(j.a(iVar.f1792f));
                break;
            default:
                f4.a aVar = (f4.a) this.f1791b;
                aVar.f4799a.getClass();
                aVar.f4801c.post(new A.j(aVar, 21, l2.c.w(capabilities)));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f1790a) {
            case 0:
                Intrinsics.checkNotNullParameter(network, "network");
                s.d().a(j.f1794a, "Network connection lost");
                i iVar = (i) this.f1791b;
                iVar.c(j.a(iVar.f1792f));
                break;
            default:
                f4.a aVar = (f4.a) this.f1791b;
                aVar.getClass();
                aVar.f4801c.postDelayed(new A.k(16, aVar), 500L);
                break;
        }
    }
}
