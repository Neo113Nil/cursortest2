package defpackage;

import android.net.http.HttpException;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lij implements UrlRequest$Callback {
    public final UrlRequest.Callback a;
    public lil b;

    public lij(UrlRequest.Callback callback) {
        this.a = callback;
    }

    public final void onCanceled(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        lim b = lim.b(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, b);
        } finally {
            this.b.a(2, b, null);
        }
    }

    public final void onFailed(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        lim b = lim.b(urlResponseInfo);
        CronetException c = jax.c(httpException);
        try {
            this.a.onFailed(this.b, b, c);
        } finally {
            this.b.a(1, b, c);
        }
    }

    public final void onReadCompleted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        jax.b(new lii(this, urlResponseInfo, byteBuffer, 1), Exception.class);
    }

    public final void onRedirectReceived(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        jax.b(new lii(this, urlResponseInfo, str, 0), Exception.class);
    }

    public final void onResponseStarted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        jax.b(new lih(this, urlResponseInfo, 0), Exception.class);
    }

    public final void onSucceeded(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        lim b = lim.b(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, b);
        } finally {
            this.b.a(0, b, null);
        }
    }
}
