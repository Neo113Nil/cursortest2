package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class uf3 implements Runnable {
    public final long m;
    public final long n;
    public final boolean o;
    public final /* synthetic */ dg3 p;

    public uf3(dg3 dg3Var, boolean z) {
        Objects.requireNonNull(dg3Var);
        this.p = dg3Var;
        this.m = System.currentTimeMillis();
        this.n = SystemClock.elapsedRealtime();
        this.o = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        dg3 dg3Var = this.p;
        if (dg3Var.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            dg3Var.d(e, false, this.o);
            b();
        }
    }

    public void b() {
    }
}
