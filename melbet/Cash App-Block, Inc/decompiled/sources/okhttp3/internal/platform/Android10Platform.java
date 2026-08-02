package okhttp3.internal.platform;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.util.CloseGuard;
import android.util.Log;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.X509TrustManager;
import kotlin.UnsignedKt;
import kotlin.collections.ArraysKt___ArraysKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;

/* loaded from: classes3.dex */
public final class Android10Platform extends Platform {
    public Context applicationContext;
    public final ArrayList socketAdapters;

    public Android10Platform() {
        List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new SocketAdapter[]{new Android10SocketAdapter(), new DeferredSocketAdapter(AndroidSocketAdapter.playProviderFactory), new DeferredSocketAdapter(ConscryptSocketAdapter.factory), new DeferredSocketAdapter(BouncyCastleSocketAdapter.factory)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : filterNotNull) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
    }

    public final UnsignedKt buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        x509TrustManager.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        AndroidCertificateChainCleaner androidCertificateChainCleaner = x509TrustManagerExtensions != null ? new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions) : null;
        if (androidCertificateChainCleaner != null) {
            return androidCertificateChainCleaner;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new BasicCertificateChainCleaner(new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    public final Object getStackTraceForCloseable() {
        if (Build.VERSION.SDK_INT >= 30) {
            CloseGuard closeGuard = new CloseGuard();
            closeGuard.open("response.body().close()");
            return closeGuard;
        }
        if (Platform.logger.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public final void log(int i, String str, Throwable th) {
        if (i == 5) {
            AndroidPlatform.Companion.getTag();
            Log.w("OkHttp", str, th);
        } else {
            AndroidPlatform.Companion.getTag();
            Log.i("OkHttp", str, th);
        }
    }

    public final void logCloseableLeak(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            obj.getClass();
            f$$ExternalSyntheticLambda0.m(obj).warnIfOpen();
        } else {
            if (obj == null) {
                str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            }
            log(5, str, (Throwable) obj);
        }
    }
}
