package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class pk3 {
    public static final oy2 a;

    static {
        oy2 oy2Var;
        Uri uri = rk3.a;
        synchronized (tk3.class) {
            try {
                if (tk3.a == null) {
                    oy2 oy2Var2 = new oy2();
                    synchronized (tk3.class) {
                        if (tk3.a != null) {
                            throw new IllegalStateException("init() already called");
                        }
                        tk3.a = oy2Var2;
                    }
                }
                oy2Var = tk3.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        a = oy2Var;
    }
}
