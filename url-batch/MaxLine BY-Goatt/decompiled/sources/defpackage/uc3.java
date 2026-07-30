package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class uc3 {
    public static volatile bb3 d;
    public final qk3 a;
    public final iu0 b;
    public volatile long c;

    public uc3(qk3 qk3Var) {
        ll3.v(qk3Var);
        this.a = qk3Var;
        this.b = new iu0(15, (Object) this, (Object) qk3Var, false);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            qk3 qk3Var = this.a;
            qk3Var.e().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            qk3Var.a().r.c(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        bb3 bb3Var;
        if (d != null) {
            return d;
        }
        synchronized (uc3.class) {
            try {
                if (d == null) {
                    d = new bb3(this.a.d().getMainLooper(), 2);
                }
                bb3Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bb3Var;
    }
}
