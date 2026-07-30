package defpackage;

import defpackage.aa2;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mp {
    public final eo1 a;

    public mp(int i) {
        switch (i) {
            case 1:
                this.a = new eo1(new za1[16]);
                break;
            default:
                this.a = new eo1(new g20[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        eo1 eo1Var = this.a;
        int i = eo1Var.o;
        ds[] dsVarArr = new ds[i];
        for (int i2 = 0; i2 < i; i2++) {
            dsVarArr[i2] = ((g20) eo1Var.m[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            dsVarArr[i3].g(cancellationException);
        }
        if (eo1Var.o == 0) {
            return;
        }
        lh.g("uncancelled requests present");
    }

    public void b() {
        eo1 eo1Var = this.a;
        int i = 0;
        int i2 = new IntRange(0, eo1Var.o - 1, 1).n;
        if (i2 >= 0) {
            while (true) {
                fs fsVar = ((g20) eo1Var.m[i]).b;
                Unit unit = Unit.a;
                aa2.a aVar = aa2.m;
                fsVar.resumeWith(unit);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        eo1Var.g();
    }
}
