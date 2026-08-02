package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bcs extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public bcs(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
