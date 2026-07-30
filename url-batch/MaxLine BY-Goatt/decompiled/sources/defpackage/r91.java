package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r91 implements pj1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj1 b;
    public final /* synthetic */ v91 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ pj1 e;

    public /* synthetic */ r91(pj1 pj1Var, v91 v91Var, int i, pj1 pj1Var2, int i2) {
        this.a = i2;
        this.c = v91Var;
        this.d = i;
        this.e = pj1Var2;
        this.b = pj1Var;
    }

    @Override // defpackage.pj1
    public final Map a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.pj1
    public final void b() {
        int i = this.a;
        pj1 pj1Var = this.e;
        int i2 = this.d;
        v91 v91Var = this.c;
        switch (i) {
            case 0:
                v91Var.q = i2;
                pj1Var.b();
                tn1 tn1Var = v91Var.x;
                long[] jArr = tn1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = tn1Var.b[i6];
                                    eq2 eq2Var = (eq2) tn1Var.c[i6];
                                    int j2 = v91Var.y.j(obj);
                                    if (j2 < 0 || j2 >= v91Var.q) {
                                        eq2Var.a();
                                        tn1Var.l(i6);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                break;
            default:
                v91Var.p = i2;
                pj1Var.b();
                v91Var.c(v91Var.p);
                break;
        }
    }

    @Override // defpackage.pj1
    public final int c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    @Override // defpackage.pj1
    public final Function1 d() {
        switch (this.a) {
        }
        return this.b.d();
    }

    @Override // defpackage.pj1
    public final int e() {
        switch (this.a) {
        }
        return this.b.e();
    }
}
