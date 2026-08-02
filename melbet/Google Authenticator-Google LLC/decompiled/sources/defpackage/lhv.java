package defpackage;

import android.net.http.BidirectionalStream$Callback;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lhv implements BidirectionalStream$Callback {
    public lhw a;
    private final BidirectionalStream.Callback b;

    public lhv(BidirectionalStream.Callback callback) {
        this.b = callback;
    }

    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        lim a = lim.a(urlResponseInfo);
        try {
            this.b.onCanceled(this.a, a);
        } finally {
            this.a.a(2, a, null);
        }
    }

    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        lim a = lim.a(urlResponseInfo);
        CronetException c = jax.c(httpException);
        try {
            this.b.onFailed(this.a, a, c);
        } finally {
            this.a.a(1, a, c);
        }
    }

    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onReadCompleted(this.a, lim.a(urlResponseInfo), byteBuffer, z);
    }

    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.b.onResponseHeadersReceived(this.a, lim.a(urlResponseInfo));
    }

    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
        this.b.onResponseTrailersReceived(this.a, lim.a(urlResponseInfo), new lhy(headerBlock));
    }

    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.b.onStreamReady(this.a);
    }

    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        lim a = lim.a(urlResponseInfo);
        try {
            this.b.onSucceeded(this.a, a);
        } finally {
            this.a.a(0, a, null);
        }
    }

    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onWriteCompleted(this.a, lim.a(urlResponseInfo), byteBuffer, z);
    }
}
