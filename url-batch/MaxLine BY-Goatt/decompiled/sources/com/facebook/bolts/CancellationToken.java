package com.facebook.bolts;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CancellationToken {
    private final CancellationTokenSource tokenSource;

    public CancellationToken(CancellationTokenSource cancellationTokenSource) {
        cancellationTokenSource.getClass();
        this.tokenSource = cancellationTokenSource;
    }

    public final boolean isCancellationRequested() {
        return this.tokenSource.isCancellationRequested();
    }

    public final CancellationTokenRegistration register(Runnable runnable) {
        return this.tokenSource.register$facebook_bolts_release(runnable);
    }

    public final void throwIfCancellationRequested() {
        this.tokenSource.throwIfCancellationRequested$facebook_bolts_release();
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", Arrays.copyOf(new Object[]{CancellationToken.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(this.tokenSource.isCancellationRequested())}, 3));
    }
}
