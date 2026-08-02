package defpackage;

import internal.org.jni_zero.JNINamespace;
import java.util.Date;
import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
@JNINamespace("cronet")
/* loaded from: classes2.dex */
public final class ljc extends RequestFinishedInfo.Metrics {
    private final Long a = 0L;
    private final Long b = 0L;

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectEnd() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectStart() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsEnd() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsStart() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushEnd() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushStart() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getReceivedByteCount() {
        return this.b;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestEnd() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestStart() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getResponseStart() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingEnd() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingStart() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getSentByteCount() {
        return this.a;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final boolean getSocketReused() {
        return false;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslEnd() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslStart() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTotalTimeMs() {
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTtfbMs() {
        return null;
    }
}
