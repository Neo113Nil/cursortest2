package org.bouncycastle.tsp.ers;

/* loaded from: classes10.dex */
public class ERSException extends Exception {
    private final Throwable cause;

    public ERSException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ERSException(String str) {
        this(str, null);
    }
}
