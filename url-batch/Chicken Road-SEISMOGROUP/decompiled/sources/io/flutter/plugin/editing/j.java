package io.flutter.plugin.editing;

import E.v;
import M.n;
import M.p;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class j implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f672a;

    public /* synthetic */ j(m mVar) {
        this.f672a = mVar;
    }

    public void a(int i2, n nVar) {
        m mVar = this.f672a;
        mVar.c();
        mVar.f683f = nVar;
        mVar.f682e = new l(2, i2);
        mVar.f685h.e(mVar);
        A.e eVar = nVar.f389j;
        mVar.f685h = new g(eVar != null ? (p) eVar.f9d : null, mVar.f678a);
        mVar.d(nVar);
        mVar.f686i = true;
        if (mVar.f682e.f676a == 3) {
            mVar.f693p = false;
        }
        mVar.f690m = null;
        mVar.f685h.a(mVar);
    }

    public void b(double d2, double d3, double[] dArr) {
        m mVar = this.f672a;
        mVar.getClass();
        double[] dArr2 = new double[4];
        boolean z = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d4 = dArr[12];
        double d5 = dArr[15];
        double d6 = d4 / d5;
        dArr2[1] = d6;
        dArr2[0] = d6;
        double d7 = dArr[13] / d5;
        dArr2[3] = d7;
        dArr2[2] = d7;
        k kVar = new k(z, dArr, dArr2);
        kVar.a(d2, 0.0d);
        kVar.a(d2, d3);
        kVar.a(0.0d, d3);
        double d8 = mVar.f678a.getContext().getResources().getDisplayMetrics().density;
        mVar.f690m = new Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) Math.ceil(dArr2[1] * d8), (int) Math.ceil(dArr2[3] * d8));
    }

    public void c(p pVar) {
        p pVar2;
        int i2;
        int i3;
        m mVar = this.f672a;
        v vVar = mVar.f678a;
        if (!mVar.f686i && (pVar2 = mVar.f692o) != null && (i2 = pVar2.f399d) >= 0 && (i3 = pVar2.f400e) > i2) {
            int i4 = i3 - i2;
            int i5 = pVar.f400e;
            int i6 = pVar.f399d;
            boolean z = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z = false;
                        break;
                    } else if (pVar2.f396a.charAt(i7 + i2) != pVar.f396a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            mVar.f686i = z;
        }
        mVar.f692o = pVar;
        mVar.f685h.f(pVar);
        if (mVar.f686i) {
            mVar.f679b.restartInput(vVar);
            mVar.f686i = false;
        }
    }
}
