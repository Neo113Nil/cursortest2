package v0;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.io.File;

/* renamed from: v0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0963g {
    public static boolean a(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    public static boolean b(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    public static boolean c(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }

    public static int d(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    public static File e(Context context) {
        return context.getDataDir();
    }

    public static int f(WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }

    public static ServiceWorkerController g() {
        return ServiceWorkerController.getInstance();
    }

    public static ServiceWorkerWebSettings h(ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    public static w i(ServiceWorkerController serviceWorkerController) {
        ServiceWorkerWebSettings h7 = h(serviceWorkerController);
        w wVar = new w();
        wVar.f8204a = h7;
        return wVar;
    }

    public static boolean j(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    public static void k(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z7) {
        serviceWorkerWebSettings.setAllowContentAccess(z7);
    }

    public static void l(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z7) {
        serviceWorkerWebSettings.setAllowFileAccess(z7);
    }

    public static void m(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z7) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z7);
    }

    public static void n(ServiceWorkerWebSettings serviceWorkerWebSettings, int i2) {
        serviceWorkerWebSettings.setCacheMode(i2);
    }

    public static void o(WebSettings webSettings, int i2) {
        webSettings.setDisabledActionModeMenuItems(i2);
    }

    public static void p(ServiceWorkerController serviceWorkerController, ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    public static void q(ServiceWorkerController serviceWorkerController, u0.h hVar) {
        serviceWorkerController.setServiceWorkerClient(new o(hVar));
    }
}
