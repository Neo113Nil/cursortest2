package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kq extends lb {
    private ko c;
    private ko d;

    public static final int e(View view, ko koVar) {
        return (koVar.d(view) + (koVar.b(view) / 2)) - (koVar.j() + (koVar.k() / 2));
    }

    private static final View g(ky kyVar, ko koVar) {
        int at = kyVar.at();
        View view = null;
        if (at == 0) {
            return null;
        }
        int j = koVar.j() + (koVar.k() / 2);
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        while (i < at) {
            View aF = kyVar.aF(i);
            int abs = Math.abs((koVar.d(aF) + (koVar.b(aF) / 2)) - j);
            int i3 = abs < i2 ? abs : i2;
            if (abs < i2) {
                view = aF;
            }
            i++;
            i2 = i3;
        }
        return view;
    }

    public final ko a(ky kyVar) {
        ko koVar = this.d;
        if (koVar == null || koVar.a != kyVar) {
            this.d = new km(kyVar);
        }
        return this.d;
    }

    public final ko b(ky kyVar) {
        ko koVar = this.c;
        if (koVar == null || koVar.a != kyVar) {
            this.c = new kn(kyVar);
        }
        return this.c;
    }

    @Override // defpackage.lb
    public View c(ky kyVar) {
        if (kyVar.ae()) {
            return g(kyVar, b(kyVar));
        }
        if (kyVar.ad()) {
            return g(kyVar, a(kyVar));
        }
        return null;
    }

    @Override // defpackage.lb
    public final int[] d(ky kyVar, View view) {
        int[] iArr = new int[2];
        if (kyVar.ad()) {
            iArr[0] = e(view, a(kyVar));
        } else {
            iArr[0] = 0;
        }
        if (kyVar.ae()) {
            iArr[1] = e(view, b(kyVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }
}
