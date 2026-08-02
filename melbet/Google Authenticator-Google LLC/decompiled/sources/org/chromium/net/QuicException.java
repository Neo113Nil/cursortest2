package org.chromium.net;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class QuicException extends NetworkException {
    protected QuicException(String str, Throwable th) {
        super(str, th);
    }

    public int getConnectionCloseSource() {
        return 0;
    }

    public abstract int getQuicDetailedErrorCode();
}
