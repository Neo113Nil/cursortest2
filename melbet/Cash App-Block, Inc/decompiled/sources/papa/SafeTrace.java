package papa;

import android.os.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import okhttp3.CipherSuite;
import okhttp3.Handshake;
import okhttp3.Handshake$Companion$$ExternalSyntheticLambda0;
import okhttp3.HttpUrl;
import okhttp3.TlsVersion;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes3.dex */
public abstract class SafeTrace {
    public static volatile Boolean _isTraceable;

    public static final void beginAsyncSection(String str, int i) {
        if (Trace.isEnabled()) {
            androidx.tracing.Trace.beginAsyncSection(str, i);
        }
    }

    public static final void beginSection(String str) {
        str.getClass();
        if (Trace.isEnabled()) {
            Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel(StringsKt___StringsKt.take(127, str)));
        }
    }

    public static final void cancelConsumed(ReceiveChannel receiveChannel, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            cancellationException = JobKt.CancellationException("Channel was consumed, consumer had failed", th);
        }
        receiveChannel.cancel(cancellationException);
    }

    public static final Result.Failure createFailure(Throwable th) {
        th.getClass();
        return new Result.Failure(th);
    }

    public static final void endAsyncSection(String str, int i) {
        if (Trace.isEnabled()) {
            androidx.tracing.Trace.endAsyncSection(str, i);
        }
    }

    public static Handshake get(SSLSession sSLSession) {
        List list;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            a$$ExternalSyntheticBUOutline0.m$1("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            a$$ExternalSyntheticBUOutline0.m$4("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        CipherSuite m4320forJavaName = CipherSuite.Companion.m4320forJavaName(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            a$$ExternalSyntheticBUOutline0.m$1("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            a$$ExternalSyntheticBUOutline0.m$4("tlsVersion == NONE");
            return null;
        }
        TlsVersion.Companion.getClass();
        TlsVersion forJavaName = HttpUrl.Companion.forJavaName(protocol);
        try {
            list = _UtilJvmKt.toImmutableList(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            list = EmptyList.INSTANCE;
        }
        return new Handshake(forJavaName, m4320forJavaName, _UtilJvmKt.toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$$ExternalSyntheticLambda0(list, 0));
    }

    public static final boolean invalidatesCache(String str) {
        str.getClass();
        return Intrinsics.areEqual(str, "POST") || Intrinsics.areEqual(str, "PATCH") || Intrinsics.areEqual(str, "PUT") || Intrinsics.areEqual(str, "DELETE") || Intrinsics.areEqual(str, "MOVE");
    }

    public static final boolean permitsRequestBody(String str) {
        str.getClass();
        return (Intrinsics.areEqual(str, "GET") || Intrinsics.areEqual(str, "HEAD")) ? false : true;
    }

    public static final void throwOnFailure(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
