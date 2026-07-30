package v0;

import android.webkit.ServiceWorkerWebSettings;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public ServiceWorkerWebSettings f8204a;

    public final ServiceWorkerWebSettings a() {
        if (this.f8204a == null) {
            J j = G.f8176a;
            this.f8204a = (ServiceWorkerWebSettings) ((WebkitToCompatConverterBoundaryInterface) j.f8180b).convertServiceWorkerSettings(Proxy.getInvocationHandler(null));
        }
        return this.f8204a;
    }
}
