package defpackage;

import org.chromium.net.QuicException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lid extends QuicException {
    private final lic a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lid(android.net.http.QuicException quicException) {
        super(r0, quicException);
        String message;
        message = quicException.getMessage();
        this.a = new lic(quicException, true);
    }

    @Override // org.chromium.net.QuicException
    public final int getConnectionCloseSource() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -508;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a.getErrorCode();
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        boolean isImmediatelyRetryable;
        isImmediatelyRetryable = this.a.a.isImmediatelyRetryable();
        return isImmediatelyRetryable;
    }
}
