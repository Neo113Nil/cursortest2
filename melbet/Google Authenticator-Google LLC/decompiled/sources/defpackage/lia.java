package defpackage;

import android.net.Network;
import android.net.http.HttpEngine;
import android.net.http.UrlRequest;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lia extends lip {
    public static final /* synthetic */ int b = 0;
    private static boolean c;
    private static boolean d;
    public final HttpEngine a;
    private final Map e = DesugarCollections.synchronizedMap(new HashMap());

    public lia(HttpEngine httpEngine) {
        this.a = httpEngine;
    }

    private static final Network c(long j) {
        Network fromNetworkHandle;
        if (j == -1) {
            return null;
        }
        fromNetworkHandle = Network.fromNetworkHandle(j);
        return fromNetworkHandle;
    }

    final void a(RequestFinishedInfo requestFinishedInfo, lka lkaVar) {
        ArrayList arrayList = new ArrayList();
        Map map = this.e;
        synchronized (map) {
            arrayList.addAll(map.values());
        }
        if (lkaVar != null) {
            arrayList.add(lkaVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lka lkaVar2 = (lka) arrayList.get(i);
            try {
                lkaVar2.getExecutor().execute(new kyf(lkaVar2, requestFinishedInfo, 2, null));
            } catch (RejectedExecutionException e) {
                jav.c("HttpEngineWrapper", "Exception posting task to executor", e);
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.e.put(listener, new lka(listener));
    }

    @Override // defpackage.lip
    public final ExperimentalUrlRequest b(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, RequestFinishedInfo.Listener listener, long j, String str2, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2) {
        UrlRequest.Builder newUrlRequestBuilder;
        android.net.http.UrlRequest build;
        lij lijVar = new lij(callback);
        newUrlRequestBuilder = this.a.newUrlRequestBuilder(str, executor, lijVar);
        newUrlRequestBuilder.setPriority(i);
        if (z) {
            newUrlRequestBuilder.setCacheDisabled(true);
        }
        if (z2) {
            newUrlRequestBuilder.setDirectExecutorAllowed(true);
        }
        if (z3) {
            newUrlRequestBuilder.setTrafficStatsTag(i2);
        }
        if (z4) {
            newUrlRequestBuilder.setTrafficStatsUid(i3);
        }
        newUrlRequestBuilder.bindToNetwork(c(j));
        newUrlRequestBuilder.setHttpMethod(str2);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i4);
            newUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (uploadDataProvider != null) {
            newUrlRequestBuilder.setUploadDataProvider(new lif(uploadDataProvider), executor2);
        }
        build = newUrlRequestBuilder.build();
        lil lilVar = new lil(build, this, str, collection, listener);
        lijVar.b = lilVar;
        return lilVar;
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.a.bindToNetwork(c(j));
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        URLStreamHandlerFactory createUrlStreamHandlerFactory;
        createUrlStreamHandlerFactory = this.a.createUrlStreamHandlerFactory();
        return createUrlStreamHandlerFactory;
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        if (!d) {
            d = true;
        }
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        String versionString;
        versionString = HttpEngine.getVersionString();
        return versionString;
    }

    @Override // defpackage.lip, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new lin(str, callback, executor, this);
    }

    @Override // defpackage.lip, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new ljw(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return (URLConnection) jax.b(new lih(this, url, 1), IOException.class);
        }
        throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(protocol)));
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.e.remove(listener);
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        if (c) {
            return;
        }
        c = true;
    }

    @Override // defpackage.lip, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new lin(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return (URLConnection) jax.b(new lih(this, url, 1), IOException.class);
    }
}
