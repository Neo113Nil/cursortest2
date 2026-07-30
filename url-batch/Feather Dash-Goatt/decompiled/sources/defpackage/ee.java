package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ee {
    public final eo0 a;

    public ee(int i) {
        switch (i) {
            case 1:
                this.a = new eo0(new fe0[16]);
                break;
            default:
                this.a = new eo0(new sm[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        eo0 eo0Var = this.a;
        int i = eo0Var.g;
        sf[] sfVarArr = new sf[i];
        for (int i2 = 0; i2 < i; i2++) {
            sfVarArr[i2] = ((sm) eo0Var.d[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sfVarArr[i3].t(cancellationException);
        }
        if (eo0Var.g == 0) {
            return;
        }
        r80.c("uncancelled requests present");
    }

    public void b() {
        eo0 eo0Var = this.a;
        IntRange g = b11.g(0, eo0Var.g);
        int i = g.d;
        int i2 = g.e;
        if (i <= i2) {
            while (true) {
                tf tfVar = ((sm) eo0Var.d[i]).b;
                Unit unit = Unit.a;
                i31 i31Var = k31.d;
                tfVar.l(unit);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        eo0Var.g();
    }
}
