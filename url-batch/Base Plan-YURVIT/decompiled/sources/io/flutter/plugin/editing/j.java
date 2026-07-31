package io.flutter.plugin.editing;

import F.C0032n;
import N.C0056m;
import android.graphics.Rect;
import android.view.View;
import u0.o;
import u0.q;

/* loaded from: classes.dex */
public final class j implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2436a;

    public /* synthetic */ j(l lVar) {
        this.f2436a = lVar;
    }

    public void a(int i2, o oVar) {
        l lVar = this.f2436a;
        lVar.c();
        lVar.f2445f = oVar;
        lVar.f2444e = new C0056m(2, i2);
        lVar.f2447h.e(lVar);
        C0032n c0032n = oVar.f3047j;
        lVar.f2447h = new f(c0032n != null ? (q) c0032n.f411c : null, lVar.f2440a);
        lVar.d(oVar);
        lVar.f2448i = true;
        if (lVar.f2444e.f756b == 3) {
            lVar.f2455p = false;
        }
        lVar.f2452m = null;
        lVar.f2447h.a(lVar);
    }

    public void b(double d2, double d3, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z2 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d4 = dArr[12];
        double d5 = dArr[15];
        double d6 = d4 / d5;
        dArr2[1] = d6;
        dArr2[0] = d6;
        double d7 = dArr[13] / d5;
        dArr2[3] = d7;
        dArr2[2] = d7;
        k kVar = new k(z2, dArr, dArr2);
        kVar.a(d2, 0.0d);
        kVar.a(d2, d3);
        kVar.a(0.0d, d3);
        l lVar = this.f2436a;
        double d8 = lVar.f2440a.getContext().getResources().getDisplayMetrics().density;
        lVar.f2452m = new Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) Math.ceil(dArr2[1] * d8), (int) Math.ceil(dArr2[3] * d8));
    }

    public void c(q qVar) {
        q qVar2;
        int i2;
        int i3;
        l lVar = this.f2436a;
        View view = lVar.f2440a;
        if (!lVar.f2448i && (qVar2 = lVar.f2454o) != null && (i2 = qVar2.f3057d) >= 0 && (i3 = qVar2.f3058e) > i2) {
            int i4 = i3 - i2;
            int i5 = qVar.f3058e;
            int i6 = qVar.f3057d;
            boolean z2 = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z2 = false;
                        break;
                    } else if (qVar2.f3054a.charAt(i7 + i2) != qVar.f3054a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            lVar.f2448i = z2;
        }
        lVar.f2454o = qVar;
        lVar.f2447h.f(qVar);
        if (lVar.f2448i) {
            lVar.f2441b.restartInput(view);
            lVar.f2448i = false;
        }
    }
}
