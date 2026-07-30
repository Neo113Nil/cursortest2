package v0;

import android.webkit.ServiceWorkerController;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* loaded from: classes.dex */
public final class v extends u0.j {

    /* renamed from: a, reason: collision with root package name */
    public ServiceWorkerController f8201a;

    /* renamed from: b, reason: collision with root package name */
    public final ServiceWorkerControllerBoundaryInterface f8202b;

    /* renamed from: c, reason: collision with root package name */
    public final w f8203c;

    public v() {
        F.f8158h.getClass();
        ServiceWorkerController g7 = AbstractC0963g.g();
        this.f8201a = g7;
        this.f8202b = null;
        if (g7 == null) {
            this.f8201a = AbstractC0963g.g();
        }
        this.f8203c = AbstractC0963g.i(this.f8201a);
    }
}
