package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uh extends yh2 {
    public static volatile uh b;
    public static final th c = new th(0);
    public final f90 a = new f90();

    public static uh t() {
        if (b != null) {
            return b;
        }
        synchronized (uh.class) {
            try {
                if (b == null) {
                    b = new uh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }
}
