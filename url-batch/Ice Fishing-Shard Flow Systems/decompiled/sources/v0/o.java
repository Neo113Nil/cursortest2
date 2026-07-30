package v0;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* loaded from: classes.dex */
public final class o extends ServiceWorkerClient {

    /* renamed from: a, reason: collision with root package name */
    public final u0.h f8192a;

    public o(u0.h hVar) {
        this.f8192a = hVar;
    }

    @Override // android.webkit.ServiceWorkerClient
    public final WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f8192a.shouldInterceptRequest(webResourceRequest);
    }
}
