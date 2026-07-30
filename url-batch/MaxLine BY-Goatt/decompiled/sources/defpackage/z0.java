package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z0 {
    public static final z0 c;
    public static final z0 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (h1.GENERATE_CANCELLATION_CAUSES) {
            d = null;
            c = null;
        } else {
            d = new z0(null, false);
            c = new z0(null, true);
        }
    }

    public z0(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
