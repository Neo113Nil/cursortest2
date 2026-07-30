package io.flutter.plugin.editing;

import D.C0013n;
import L.C0038n;
import android.graphics.Rect;
import c0.r;
import m0.C0205o;
import m0.C0207q;

/* loaded from: classes.dex */
public final class j implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2432a;

    public /* synthetic */ j(l lVar) {
        this.f2432a = lVar;
    }

    public void a(int i2, C0205o c0205o) {
        l lVar = this.f2432a;
        lVar.c();
        lVar.f2441f = c0205o;
        lVar.f2440e = new C0038n(2, i2);
        lVar.f2443h.e(lVar);
        C0013n c0013n = c0205o.f2767j;
        lVar.f2443h = new f(c0013n != null ? (C0207q) c0013n.f246c : null, lVar.f2436a);
        lVar.d(c0205o);
        lVar.f2444i = true;
        if (lVar.f2440e.f578b == 3) {
            lVar.f2451p = false;
        }
        lVar.f2448m = null;
        lVar.f2443h.a(lVar);
    }

    public void b(double d2, double d3, double[] dArr) {
        l lVar = this.f2432a;
        lVar.getClass();
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
        double d8 = lVar.f2436a.getContext().getResources().getDisplayMetrics().density;
        lVar.f2448m = new Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) Math.ceil(dArr2[1] * d8), (int) Math.ceil(dArr2[3] * d8));
    }

    public void c(C0207q c0207q) {
        C0207q c0207q2;
        int i2;
        int i3;
        l lVar = this.f2432a;
        r rVar = lVar.f2436a;
        if (!lVar.f2444i && (c0207q2 = lVar.f2450o) != null && (i2 = c0207q2.f2777d) >= 0 && (i3 = c0207q2.f2778e) > i2) {
            int i4 = i3 - i2;
            int i5 = c0207q.f2778e;
            int i6 = c0207q.f2777d;
            boolean z2 = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z2 = false;
                        break;
                    } else if (c0207q2.f2774a.charAt(i7 + i2) != c0207q.f2774a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            lVar.f2444i = z2;
        }
        lVar.f2450o = c0207q;
        lVar.f2443h.f(c0207q);
        if (lVar.f2444i) {
            lVar.f2437b.restartInput(rVar);
            lVar.f2444i = false;
        }
    }
}
