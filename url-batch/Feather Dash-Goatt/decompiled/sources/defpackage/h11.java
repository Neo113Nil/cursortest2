package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h11 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ h11(int i, int i2, Object obj, Object obj2) {
        this.d = i2;
        this.g = obj;
        this.e = i;
        this.h = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ll llVar;
        ll llVar2;
        int i;
        int i2 = this.d;
        int i3 = 0;
        Object obj2 = this.h;
        int i4 = this.e;
        Object obj3 = this.g;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i11 i11Var = (i11) obj3;
                ln0 ln0Var = (ln0) obj2;
                ll llVar3 = (ll) obj;
                if (i11Var.e == i4 && Intrinsics.a(ln0Var, i11Var.f) && (llVar3 instanceof tl)) {
                    long[] jArr = ln0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = ln0Var.b[i9];
                                        int i10 = ln0Var.c[i9] != i4 ? 1 : i3;
                                        if (i10 != 0) {
                                            tl tlVar = (tl) llVar3;
                                            i = i6;
                                            vn0 vn0Var = tlVar.k;
                                            gb0.I(vn0Var, obj4, i11Var);
                                            llVar2 = llVar3;
                                            if (obj4 instanceof xr) {
                                                xr xrVar = (xr) obj4;
                                                if (!vn0Var.c(xrVar)) {
                                                    gb0.J(tlVar.n, xrVar);
                                                }
                                                vn0 vn0Var2 = i11Var.g;
                                                if (vn0Var2 != null) {
                                                    vn0Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            llVar2 = llVar3;
                                            i = i6;
                                        }
                                        if (i10 != 0) {
                                            ln0Var.f(i9);
                                        }
                                    } else {
                                        llVar2 = llVar3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    llVar3 = llVar2;
                                    i3 = 0;
                                }
                                llVar = llVar3;
                                if (i7 != i6) {
                                }
                            } else {
                                llVar = llVar3;
                            }
                            if (i5 != length) {
                                i5++;
                                llVar3 = llVar;
                                i3 = 0;
                            }
                        }
                    }
                }
                break;
            default:
                d71 d71Var = (d71) obj3;
                zw0 zw0Var = (zw0) obj2;
                yw0 yw0Var = (yw0) obj;
                int h = d71Var.s.a.h();
                if (h < 0) {
                    h = 0;
                }
                if (h <= i4) {
                    i4 = h;
                }
                int i11 = -i4;
                boolean z = d71Var.t;
                int i12 = z ? 0 : i11;
                if (!z) {
                    i11 = 0;
                }
                yw0Var.d = true;
                yw0.r(yw0Var, zw0Var, i12, i11);
                yw0Var.d = false;
                break;
        }
        return Unit.a;
    }
}
