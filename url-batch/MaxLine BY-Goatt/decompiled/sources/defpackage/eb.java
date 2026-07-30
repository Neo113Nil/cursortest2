package defpackage;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eb implements r82, Runnable, Choreographer.FrameCallback {
    public static long s;
    public final View m;
    public boolean o;
    public boolean q;
    public long r;
    public final eo1 n = new eo1(new n42[16]);
    public final Choreographer p = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r4 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eb(View view) {
        float f;
        this.m = view;
        if (s == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            s = (long) (1.0E9f / f);
        }
    }

    @Override // defpackage.r82
    public final void a() {
        this.q = true;
    }

    @Override // defpackage.r82
    public final void d() {
        this.q = false;
        this.m.removeCallbacks(this);
        this.p.removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.q) {
            this.r = j;
            this.m.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        eo1 eo1Var = this.n;
        if (eo1Var.o == 0 || !this.o || !this.q || this.m.getWindowVisibility() != 0) {
            this.o = false;
            return;
        }
        db dbVar = new db(this.r + s);
        boolean z = false;
        while (eo1Var.o != 0 && !z) {
            if (dbVar.a() <= 0 || ((n42) eo1Var.m[0]).b(dbVar)) {
                z = true;
            } else {
                eo1Var.l(0);
            }
        }
        if (z) {
            this.p.postFrameCallback(this);
        } else {
            this.o = false;
        }
    }

    @Override // defpackage.r82
    public final void c() {
    }
}
