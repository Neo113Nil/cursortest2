package defpackage;

import android.net.http.Proxy$HttpConnectCallback;
import java.util.List;
import org.chromium.net.AndroidProxyOptions;
import org.chromium.net.Proxy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhh implements Proxy$HttpConnectCallback {
    private final Proxy.HttpConnectCallback a;

    public lhh(Proxy.HttpConnectCallback httpConnectCallback) {
        if (!AndroidProxyOptions.areProxyApisEnabled()) {
            throw new AssertionError("AndroidProxy requires the proxy APIs to be enabled");
        }
        this.a = httpConnectCallback;
    }

    public final void onBeforeRequest(Proxy$HttpConnectCallback.Request request) {
        this.a.onBeforeRequest(new lhi(request));
    }

    public final int onResponseReceived(List list, int i) {
        int onResponseReceived = this.a.onResponseReceived(list, i);
        if (onResponseReceived == 0) {
            return 0;
        }
        if (onResponseReceived == 1) {
            return 1;
        }
        throw new AssertionError(String.format("Unknown OnResponseReceivedAction: %d", Integer.valueOf(onResponseReceived)));
    }
}
