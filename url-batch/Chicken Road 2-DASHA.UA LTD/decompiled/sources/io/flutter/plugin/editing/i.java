package io.flutter.plugin.editing;

import D.y;
import M.o;
import M.q;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f617a;

    public /* synthetic */ i(l lVar) {
        this.f617a = lVar;
    }

    public void a(int i2, o oVar) {
        l lVar = this.f617a;
        lVar.c();
        lVar.f628f = oVar;
        lVar.f627e = new k(2, i2);
        lVar.f630h.e(lVar);
        B.e eVar = oVar.f331j;
        lVar.f630h = new f(eVar != null ? (q) eVar.f9c : null, lVar.f623a);
        lVar.d(oVar);
        lVar.f631i = true;
        if (lVar.f627e.f621a == 3) {
            lVar.f638p = false;
        }
        lVar.f635m = null;
        lVar.f630h.a(lVar);
    }

    public void b(double d2, double d3, double[] dArr) {
        l lVar = this.f617a;
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
        j jVar = new j(z2, dArr, dArr2);
        jVar.a(d2, 0.0d);
        jVar.a(d2, d3);
        jVar.a(0.0d, d3);
        double d8 = lVar.f623a.getContext().getResources().getDisplayMetrics().density;
        lVar.f635m = new Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) Math.ceil(dArr2[1] * d8), (int) Math.ceil(dArr2[3] * d8));
    }

    public void c(q qVar) {
        q qVar2;
        int i2;
        int i3;
        l lVar = this.f617a;
        y yVar = lVar.f623a;
        if (!lVar.f631i && (qVar2 = lVar.f637o) != null && (i2 = qVar2.f341d) >= 0 && (i3 = qVar2.f342e) > i2) {
            int i4 = i3 - i2;
            int i5 = qVar.f342e;
            int i6 = qVar.f341d;
            boolean z2 = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z2 = false;
                        break;
                    } else if (qVar2.f338a.charAt(i7 + i2) != qVar.f338a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            lVar.f631i = z2;
        }
        lVar.f637o = qVar;
        lVar.f630h.f(qVar);
        if (lVar.f631i) {
            lVar.f624b.restartInput(yVar);
            lVar.f631i = false;
        }
    }
}
