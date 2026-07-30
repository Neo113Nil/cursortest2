package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sd0 implements wk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk0 b;
    public final /* synthetic */ xd0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ wk0 e;

    public /* synthetic */ sd0(wk0 wk0Var, xd0 xd0Var, int i, wk0 wk0Var2, int i2) {
        this.a = i2;
        this.c = xd0Var;
        this.d = i;
        this.e = wk0Var2;
        this.b = wk0Var;
    }

    @Override // defpackage.wk0
    public final Map a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.wk0
    public final void b() {
        int i;
        int i2 = this.a;
        wk0 wk0Var = this.e;
        int i3 = this.d;
        xd0 xd0Var = this.c;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                xd0Var.i = i3;
                wk0Var.b();
                eo0 eo0Var = xd0Var.q;
                vn0 vn0Var = xd0Var.p;
                long[] jArr = vn0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj = vn0Var.b[i8];
                                    bf1 bf1Var = (bf1) vn0Var.c[i8];
                                    int i9 = eo0Var.i(obj);
                                    if (i9 < 0 || i9 >= xd0Var.i) {
                                        if (i9 >= 0) {
                                            Object obj2 = la0.v;
                                            i = i5;
                                            Object[] objArr = eo0Var.d;
                                            Object obj3 = objArr[i9];
                                            objArr[i9] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (xd0Var.n.b(obj)) {
                                            bf1Var.a();
                                        }
                                        vn0Var.l(i8);
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                    }
                                }
                                i = i5;
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 != i5) {
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                xd0Var.g(xd0Var.h);
                break;
            default:
                xd0Var.h = i3;
                wk0Var.b();
                if (xd0Var.d.m == null) {
                    xd0Var.g(xd0Var.h);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wk0
    public final int c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    @Override // defpackage.wk0
    public final Function1 d() {
        switch (this.a) {
        }
        return this.b.d();
    }

    @Override // defpackage.wk0
    public final int e() {
        switch (this.a) {
        }
        return this.b.e();
    }
}
