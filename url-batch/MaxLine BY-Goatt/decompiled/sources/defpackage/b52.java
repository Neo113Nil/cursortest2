package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b52 implements id1 {
    public static final b52 u = new b52();
    public int m;
    public int n;
    public Handler q;
    public boolean o = true;
    public boolean p = true;
    public final kd1 r = new kd1(this, true);
    public final k3 s = new k3(20, this);
    public final at0 t = new at0(this);

    public final void a() {
        int i = this.n + 1;
        this.n = i;
        if (i == 1) {
            if (this.o) {
                this.r.f(yc1.ON_RESUME);
                this.o = false;
            } else {
                Handler handler = this.q;
                handler.getClass();
                handler.removeCallbacks(this.s);
            }
        }
    }

    @Override // defpackage.id1
    public final ad1 getLifecycle() {
        return this.r;
    }
}
