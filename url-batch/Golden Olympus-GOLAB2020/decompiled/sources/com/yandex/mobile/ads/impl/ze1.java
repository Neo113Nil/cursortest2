package com.yandex.mobile.ads.impl;

import com.huawei.hms.iap.entity.OrderStatusCode;
import com.ironsource.mediationsdk.demandOnly.e;
import com.yandex.mobile.ads.impl.n22;
import com.yandex.mobile.ads.impl.yb0;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class ze1 extends n22 {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f35577o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f35578p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f35579n;

    ze1() {
    }

    public static boolean b(sf1 sf1Var) {
        byte[] bArr = f35577o;
        if (sf1Var.a() < 8) {
            return false;
        }
        int d4 = sf1Var.d();
        byte[] bArr2 = new byte[8];
        sf1Var.a(bArr2, 0, 8);
        sf1Var.e(d4);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.yandex.mobile.ads.impl.n22
    protected final long a(sf1 sf1Var) {
        int i4;
        byte[] c4 = sf1Var.c();
        byte b4 = c4[0];
        int i5 = b4 & 255;
        int i6 = b4 & 3;
        if (i6 != 0) {
            i4 = 2;
            if (i6 != 1 && i6 != 2) {
                i4 = c4[1] & 63;
            }
        } else {
            i4 = 1;
        }
        int i7 = i5 >> 3;
        return b(i4 * (i7 >= 16 ? e.b.f17432p << r0 : i7 >= 12 ? 10000 << (i7 & 1) : (i7 & 3) == 3 ? OrderStatusCode.ORDER_STATE_CANCEL : 10000 << r0));
    }

    @Override // com.yandex.mobile.ads.impl.n22
    protected final boolean a(sf1 sf1Var, long j4, n22.a aVar) {
        byte[] bArr = f35577o;
        if (sf1Var.a() >= 8) {
            int d4 = sf1Var.d();
            byte[] bArr2 = new byte[8];
            sf1Var.a(bArr2, 0, 8);
            sf1Var.e(d4);
            if (Arrays.equals(bArr2, bArr)) {
                byte[] copyOf = Arrays.copyOf(sf1Var.c(), sf1Var.e());
                int i4 = copyOf[9] & 255;
                ArrayList a4 = af1.a(copyOf);
                if (aVar.f29380a != null) {
                    return true;
                }
                aVar.f29380a = new yb0.a().e("audio/opus").c(i4).l(48000).a(a4).a();
                return true;
            }
        }
        byte[] bArr3 = f35578p;
        if (sf1Var.a() >= 8) {
            int d5 = sf1Var.d();
            byte[] bArr4 = new byte[8];
            sf1Var.a(bArr4, 0, 8);
            sf1Var.e(d5);
            if (Arrays.equals(bArr4, bArr3)) {
                if (aVar.f29380a != null) {
                    if (this.f35579n) {
                        return true;
                    }
                    this.f35579n = true;
                    sf1Var.f(8);
                    wz0 a5 = vi2.a(sj0.b(vi2.a(sf1Var, false, false).f33646a));
                    if (a5 == null) {
                        return true;
                    }
                    aVar.f29380a = aVar.f29380a.a().a(a5.a(aVar.f29380a.f34989k)).a();
                    return true;
                }
                throw new IllegalStateException();
            }
        }
        if (aVar.f29380a != null) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.n22
    protected final void a(boolean z4) {
        super.a(z4);
        if (z4) {
            this.f35579n = false;
        }
    }
}
