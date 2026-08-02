package defpackage;

import j$.time.Instant;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqf extends RequestFinishedInfo.Listener {
    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        Map allHeaders;
        List list;
        if (!eim.a().d()) {
            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 61, "RequestFinishedListener.java")).s("onRequestFinished is skipped as primes preconditions failed.");
            return;
        }
        if (requestFinishedInfo == null) {
            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 65, "RequestFinishedListener.java")).s("Un-expected null UrlRequestInfo from cronet's RequestFinishedListener,  skipping current NetworkEvent");
            return;
        }
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        if (metrics == null) {
            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 72, "RequestFinishedListener.java")).s("un-expected null metrics from cronet's RequestFinishedListener, skipping current request");
            return;
        }
        if (requestFinishedInfo.getAnnotations() != null) {
            Iterator it = requestFinishedInfo.getAnnotations().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof djw) {
                    ((hkf) ((hkf) eiu.a.d()).i("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 81, "RequestFinishedListener.java")).s("onRequestFinished is skipped due to PrimesCronetMonitorIgnoreAnnotation");
                    return;
                }
            }
        }
        Date requestStart = metrics.getRequestStart();
        eqa eqaVar = new eqa(null, requestFinishedInfo.getUrl(), false, requestStart == null ? Instant.now().toEpochMilli() : requestStart.getTime());
        UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
        if (responseInfo != null && (allHeaders = responseInfo.getAllHeaders()) != null && (list = (List) allHeaders.get("Content-Type")) != null && !list.isEmpty()) {
            eqaVar.k = (String) list.get(0);
        }
        Long receivedByteCount = metrics.getReceivedByteCount();
        if (receivedByteCount != null) {
            eqaVar.d = receivedByteCount.intValue();
        }
        Long sentByteCount = metrics.getSentByteCount();
        if (sentByteCount != null) {
            eqaVar.e = sentByteCount.intValue();
        }
        Long ttfbMs = metrics.getTtfbMs();
        if (ttfbMs != null) {
            eqaVar.b = ttfbMs.longValue();
        }
        Long totalTimeMs = metrics.getTotalTimeMs();
        if (totalTimeMs != null) {
            eqaVar.c = totalTimeMs.longValue();
        }
        UrlResponseInfo responseInfo2 = requestFinishedInfo.getResponseInfo();
        if (responseInfo2 != null) {
            int httpStatusCode = responseInfo2.getHttpStatusCode();
            if (httpStatusCode >= 0) {
                eqaVar.j = httpStatusCode;
            }
            String negotiatedProtocol = responseInfo2.getNegotiatedProtocol();
            if (negotiatedProtocol != null && !negotiatedProtocol.isEmpty()) {
                eqaVar.i = negotiatedProtocol;
            }
        }
        int finishedReason = requestFinishedInfo.getFinishedReason();
        int i = 4;
        eqaVar.v = finishedReason != 0 ? finishedReason != 1 ? finishedReason != 2 ? 1 : 4 : 3 : 2;
        CronetException exception = requestFinishedInfo.getException();
        if (exception != null) {
            if (exception instanceof NetworkException) {
                switch (((NetworkException) exception).getErrorCode()) {
                    case 1:
                        i = 3;
                        break;
                    case 2:
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 6;
                        break;
                    case 5:
                        i = 7;
                        break;
                    case 6:
                        i = 8;
                        break;
                    case 7:
                        i = 9;
                        break;
                    case 8:
                        i = 10;
                        break;
                    case 9:
                        i = 11;
                        break;
                    case 10:
                        i = 12;
                        break;
                    case 11:
                        i = 13;
                        break;
                    default:
                        i = 1;
                        break;
                }
                eqaVar.u = i;
            } else if (exception instanceof CallbackException) {
                eqaVar.u = 2;
            } else {
                eqaVar.u = 1;
            }
            if (exception instanceof QuicException) {
                eqaVar.n = Integer.valueOf(((QuicException) exception).getQuicDetailedErrorCode());
            }
        }
        eqaVar.r = 2;
        eim.a().c(eqaVar);
    }
}
