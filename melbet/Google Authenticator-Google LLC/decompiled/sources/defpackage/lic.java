package defpackage;

import org.chromium.net.NetworkException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lic extends NetworkException {
    public final android.net.http.NetworkException a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lic(android.net.http.NetworkException networkException, boolean z) {
        super(r0, networkException);
        String message;
        message = networkException.getMessage();
        this.a = networkException;
        if (!z && aah$$ExternalSyntheticApiModelOutline2.m$1(networkException)) {
            throw new IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", networkException);
        }
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -508;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        int errorCode;
        errorCode = this.a.getErrorCode();
        return errorCode;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        boolean isImmediatelyRetryable;
        isImmediatelyRetryable = this.a.isImmediatelyRetryable();
        return isImmediatelyRetryable;
    }
}
