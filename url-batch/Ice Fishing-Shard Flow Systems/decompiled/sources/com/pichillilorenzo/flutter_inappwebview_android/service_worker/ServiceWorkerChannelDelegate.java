package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import java.util.Map;
import s4.n;
import s4.p;
import s4.q;
import u0.d;
import u0.j;
import v0.AbstractC0963g;
import v0.F;
import v0.v;
import v0.w;

/* loaded from: classes.dex */
public class ServiceWorkerChannelDelegate extends ChannelDelegateImpl {
    private ServiceWorkerManager serviceWorkerManager;

    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return new ShouldInterceptRequestCallback().decodeResult(obj);
        }
    }

    public ServiceWorkerChannelDelegate(ServiceWorkerManager serviceWorkerManager, q qVar) {
        super(qVar);
        this.serviceWorkerManager = serviceWorkerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.serviceWorkerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, p pVar) {
        w wVar;
        ServiceWorkerManager.init();
        j jVar = ServiceWorkerManager.serviceWorkerController;
        wVar = jVar != null ? ((v) jVar).f8203c : null;
        String str = nVar.f7767a;
        str.getClass();
        switch (str) {
            case "getAllowContentAccess":
                if (wVar != null && d.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    F.j.getClass();
                    pVar.success(Boolean.valueOf(AbstractC0963g.a(wVar.a())));
                    break;
                } else {
                    pVar.success(Boolean.FALSE);
                    break;
                }
            case "setServiceWorkerClient":
                if (this.serviceWorkerManager == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    this.serviceWorkerManager.setServiceWorkerClient((Boolean) nVar.a("isNull"));
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case "getCacheMode":
                if (wVar != null && d.a("SERVICE_WORKER_CACHE_MODE")) {
                    F.f8159i.getClass();
                    pVar.success(Integer.valueOf(AbstractC0963g.d(wVar.a())));
                    break;
                } else {
                    pVar.success(null);
                    break;
                }
            case "getAllowFileAccess":
                if (wVar != null && d.a("SERVICE_WORKER_FILE_ACCESS")) {
                    F.f8160k.getClass();
                    pVar.success(Boolean.valueOf(AbstractC0963g.b(wVar.a())));
                    break;
                } else {
                    pVar.success(Boolean.FALSE);
                    break;
                }
            case "setCacheMode":
                if (wVar != null && d.a("SERVICE_WORKER_CACHE_MODE")) {
                    int intValue = ((Integer) nVar.a("mode")).intValue();
                    F.f8159i.getClass();
                    AbstractC0963g.n(wVar.a(), intValue);
                }
                pVar.success(Boolean.TRUE);
                break;
            case "setBlockNetworkLoads":
                if (wVar != null && d.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    boolean booleanValue = ((Boolean) nVar.a("flag")).booleanValue();
                    F.f8161l.getClass();
                    AbstractC0963g.m(wVar.a(), booleanValue);
                }
                pVar.success(Boolean.TRUE);
                break;
            case "setAllowContentAccess":
                if (wVar != null && d.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    boolean booleanValue2 = ((Boolean) nVar.a("allow")).booleanValue();
                    F.j.getClass();
                    AbstractC0963g.k(wVar.a(), booleanValue2);
                }
                pVar.success(Boolean.TRUE);
                break;
            case "setAllowFileAccess":
                if (wVar != null && d.a("SERVICE_WORKER_FILE_ACCESS")) {
                    boolean booleanValue3 = ((Boolean) nVar.a("allow")).booleanValue();
                    F.f8160k.getClass();
                    AbstractC0963g.l(wVar.a(), booleanValue3);
                }
                pVar.success(Boolean.TRUE);
                break;
            case "getBlockNetworkLoads":
                if (wVar != null && d.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    F.f8161l.getClass();
                    pVar.success(Boolean.valueOf(AbstractC0963g.c(wVar.a())));
                    break;
                } else {
                    pVar.success(Boolean.FALSE);
                    break;
                }
                break;
            default:
                pVar.notImplemented();
                break;
        }
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        q channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
    }

    public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) {
        q channel = getChannel();
        if (channel == null) {
            return null;
        }
        return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
    }
}
