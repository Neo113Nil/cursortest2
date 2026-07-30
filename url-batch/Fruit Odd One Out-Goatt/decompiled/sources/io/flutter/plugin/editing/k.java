package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.view.View;
import m0.o;
import m0.q;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class k implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f467a;

    public /* synthetic */ k(n nVar) {
        this.f467a = nVar;
    }

    public void a(int i2, o oVar) {
        n nVar = this.f467a;
        nVar.c();
        nVar.f478f = oVar;
        nVar.f477e = new m(2, i2);
        nVar.f480h.e(nVar);
        c0.e eVar = oVar.f829j;
        nVar.f480h = new g(eVar != null ? (q) eVar.f72c : null, nVar.f473a);
        nVar.d(oVar);
        nVar.f481i = true;
        if (nVar.f477e.f471a == 3) {
            nVar.f487p = false;
        }
        nVar.m = null;
        nVar.f480h.a(nVar);
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
        l lVar = new l(z2, dArr, dArr2);
        lVar.a(d2, 0.0d);
        lVar.a(d2, d3);
        lVar.a(0.0d, d3);
        n nVar = this.f467a;
        double d8 = nVar.f473a.getContext().getResources().getDisplayMetrics().density;
        nVar.m = new Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) Math.ceil(dArr2[1] * d8), (int) Math.ceil(dArr2[3] * d8));
    }

    public void c(q qVar) {
        q qVar2;
        int i2;
        int i3;
        n nVar = this.f467a;
        View view = nVar.f473a;
        if (!nVar.f481i && (qVar2 = nVar.f486o) != null && (i2 = qVar2.f838d) >= 0 && (i3 = qVar2.f839e) > i2) {
            int i4 = i3 - i2;
            int i5 = qVar.f839e;
            int i6 = qVar.f838d;
            boolean z2 = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z2 = false;
                        break;
                    } else if (qVar2.f835a.charAt(i7 + i2) != qVar.f835a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            nVar.f481i = z2;
        }
        nVar.f486o = qVar;
        nVar.f480h.f(qVar);
        if (nVar.f481i) {
            nVar.f474b.restartInput(view);
            nVar.f481i = false;
        }
    }
}
