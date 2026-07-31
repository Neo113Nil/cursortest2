package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes5.dex */
public class ApiHelperForN {
    public static ServiceWorkerController getServiceWorkerControllerInstance() {
        return ServiceWorkerController.getInstance();
    }

    public static ServiceWorkerWebSettings getServiceWorkerWebSettings(ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    public static ServiceWorkerWebSettingsImpl getServiceWorkerWebSettingsImpl(ServiceWorkerController serviceWorkerController) {
        return new ServiceWorkerWebSettingsImpl(getServiceWorkerWebSettings(serviceWorkerController));
    }
}
