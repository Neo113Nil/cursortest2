package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iej extends Exception {
    public iej() {
        super("Failed to get a Native provider. Rejecting JavaCronetEngine fallback.");
    }

    public iej(Throwable th) {
        super("Failed to get a Native provider", th);
    }
}
