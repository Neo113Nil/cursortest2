package s7;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p3 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f8916e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t3 f8917i;

    public p3(t3 t3Var, long j, int i3) {
        this.f8915d = i3;
        switch (i3) {
            case 1:
                this.f8916e = j;
                Objects.requireNonNull(t3Var);
                this.f8917i = t3Var;
                break;
            default:
                this.f8916e = j;
                Objects.requireNonNull(t3Var);
                this.f8917i = t3Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
    
        if (r2.G.a() != false) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.f8915d) {
            case 0:
                t3 t3Var = this.f8917i;
                s3 s3Var = t3Var.f9029t;
                t3Var.s();
                t3Var.w();
                q1 q1Var = (q1) t3Var.f1478d;
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                t0 t0Var = v0Var.B;
                long j = this.f8916e;
                t0Var.b(Long.valueOf(j), "Activity resumed, time");
                g gVar = q1Var.f8935r;
                if (!gVar.D(null, e0.S0)) {
                    if (!gVar.H()) {
                        f1 f1Var = q1Var.f8936s;
                        q1.j(f1Var);
                        break;
                    }
                    s3Var.f9002d.s();
                    s3Var.f9001c.c();
                    s3Var.f8999a = j;
                    s3Var.f9000b = j;
                } else if (gVar.H() || t3Var.f9027r) {
                    s3Var.f9002d.s();
                    s3Var.f9001c.c();
                    s3Var.f8999a = j;
                    s3Var.f9000b = j;
                }
                c6.l lVar = t3Var.f9030u;
                t3 t3Var2 = (t3) lVar.f1830i;
                t3Var2.s();
                q3 q3Var = (q3) lVar.f1829e;
                if (q3Var != null) {
                    t3Var2.f9026i.removeCallbacks(q3Var);
                }
                f1 f1Var2 = ((q1) t3Var2.f1478d).f8936s;
                q1.j(f1Var2);
                f1Var2.G.b(false);
                t3Var2.s();
                t3Var2.f9027r = false;
                l.d dVar = t3Var.f9028s;
                t3 t3Var3 = (t3) dVar.f5643e;
                t3Var3.s();
                q1 q1Var2 = (q1) t3Var3.f1478d;
                boolean c10 = q1Var2.c();
                g7.a aVar = q1Var2.f8942y;
                if (c10) {
                    aVar.getClass();
                    dVar.D(System.currentTimeMillis(), q1Var2.f8935r.D(null, e0.f8619e1) ? SystemClock.elapsedRealtime() : 0L);
                    break;
                }
                break;
            default:
                t3 t3Var4 = this.f8917i;
                t3Var4.s();
                t3Var4.w();
                q1 q1Var3 = (q1) t3Var4.f1478d;
                v0 v0Var2 = q1Var3.f8937t;
                q1.l(v0Var2);
                t0 t0Var2 = v0Var2.B;
                long j3 = this.f8916e;
                t0Var2.b(Long.valueOf(j3), "Activity paused, time");
                c6.l lVar2 = t3Var4.f9030u;
                t3 t3Var5 = (t3) lVar2.f1830i;
                ((q1) t3Var5.f1478d).f8942y.getClass();
                q3 q3Var2 = new q3(lVar2, System.currentTimeMillis(), j3);
                lVar2.f1829e = q3Var2;
                t3Var5.f9026i.postDelayed(q3Var2, 2000L);
                if (q1Var3.f8935r.H()) {
                    t3Var4.f9029t.f9001c.c();
                    break;
                }
                break;
        }
    }
}
