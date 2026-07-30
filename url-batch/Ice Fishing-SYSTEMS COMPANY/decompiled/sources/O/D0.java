package O;

import android.app.ApplicationExitInfo;
import android.media.RouteDiscoveryPreference;
import android.util.CloseGuard;
import com.google.android.gms.internal.ads.UB;

/* loaded from: classes.dex */
public abstract /* synthetic */ class D0 {
    public static /* bridge */ /* synthetic */ ApplicationExitInfo e(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder h(UB ub) {
        return new RouteDiscoveryPreference.Builder(ub, false);
    }

    public static /* synthetic */ CloseGuard i() {
        return new CloseGuard();
    }

    public static /* synthetic */ void z() {
    }
}
