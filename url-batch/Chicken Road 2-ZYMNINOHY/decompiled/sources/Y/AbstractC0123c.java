package Y;

import W.J;
import a.AbstractC0124a;
import android.os.SystemClock;
import java.util.ArrayList;
import v2.a0;

/* renamed from: Y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0123c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3680a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3681b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f3682c;

    /* renamed from: d, reason: collision with root package name */
    public k f3683d;

    public AbstractC0123c(boolean z) {
        this.f3680a = z;
    }

    public final void a(int i4) {
        k kVar = this.f3683d;
        String str = J.f3263a;
        for (int i5 = 0; i5 < this.f3682c; i5++) {
            A a3 = (A) this.f3681b.get(i5);
            boolean z = this.f3680a;
            u0.g gVar = (u0.g) a3;
            synchronized (gVar) {
                a0 a0Var = u0.g.f15448p;
                if (z && (kVar.f3708h & 8) != 8) {
                    gVar.f15462i += i4;
                }
            }
        }
    }

    public final void f() {
        k kVar = this.f3683d;
        String str = J.f3263a;
        for (int i4 = 0; i4 < this.f3682c; i4++) {
            A a3 = (A) this.f3681b.get(i4);
            boolean z = this.f3680a;
            u0.g gVar = (u0.g) a3;
            synchronized (gVar) {
                try {
                    a0 a0Var = u0.g.f15448p;
                    if (z && (kVar.f3708h & 8) != 8) {
                        AbstractC0124a.t(gVar.f15460g > 0);
                        gVar.f15457d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i5 = (int) (elapsedRealtime - gVar.f15461h);
                        gVar.f15463j += i5;
                        long j4 = gVar.f15464k;
                        long j5 = gVar.f15462i;
                        gVar.f15464k = j4 + j5;
                        if (i5 > 0) {
                            gVar.f15459f.a((j5 * 8000.0f) / i5, (int) Math.sqrt(j5));
                            if (gVar.f15463j < 2000) {
                                if (gVar.f15464k >= 524288) {
                                }
                                gVar.b(i5, gVar.f15462i, gVar.f15465l);
                                gVar.f15461h = elapsedRealtime;
                                gVar.f15462i = 0L;
                            }
                            gVar.f15465l = (long) gVar.f15459f.b();
                            gVar.b(i5, gVar.f15462i, gVar.f15465l);
                            gVar.f15461h = elapsedRealtime;
                            gVar.f15462i = 0L;
                        }
                        gVar.f15460g--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f3683d = null;
    }

    public final void g() {
        for (int i4 = 0; i4 < this.f3682c; i4++) {
            ((A) this.f3681b.get(i4)).getClass();
        }
    }

    public final void h(k kVar) {
        this.f3683d = kVar;
        for (int i4 = 0; i4 < this.f3682c; i4++) {
            A a3 = (A) this.f3681b.get(i4);
            boolean z = this.f3680a;
            u0.g gVar = (u0.g) a3;
            synchronized (gVar) {
                try {
                    a0 a0Var = u0.g.f15448p;
                    if (z && (kVar.f3708h & 8) != 8) {
                        if (gVar.f15460g == 0) {
                            gVar.f15457d.getClass();
                            gVar.f15461h = SystemClock.elapsedRealtime();
                        }
                        gVar.f15460g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // Y.h
    public final void y(A a3) {
        a3.getClass();
        ArrayList arrayList = this.f3681b;
        if (arrayList.contains(a3)) {
            return;
        }
        arrayList.add(a3);
        this.f3682c++;
    }
}
