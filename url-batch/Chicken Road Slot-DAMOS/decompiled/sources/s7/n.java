package s7;

import android.os.Handler;
import com.google.android.gms.internal.measurement.z5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: d, reason: collision with root package name */
    public static volatile z5 f8858d;

    /* renamed from: a, reason: collision with root package name */
    public final y1 f8859a;

    /* renamed from: b, reason: collision with root package name */
    public final f8.j0 f8860b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f8861c;

    public n(y1 y1Var) {
        c7.c0.g(y1Var);
        this.f8859a = y1Var;
        this.f8860b = new f8.j0(14, this, y1Var, false);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            y1 y1Var = this.f8859a;
            y1Var.f().getClass();
            this.f8861c = System.currentTimeMillis();
            if (d().postDelayed(this.f8860b, j)) {
                return;
            }
            y1Var.b().f9050t.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f8861c = 0L;
        d().removeCallbacks(this.f8860b);
    }

    public final Handler d() {
        z5 z5Var;
        if (f8858d != null) {
            return f8858d;
        }
        synchronized (n.class) {
            try {
                if (f8858d == null) {
                    f8858d = new z5(this.f8859a.e().getMainLooper(), 0);
                }
                z5Var = f8858d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z5Var;
    }
}
