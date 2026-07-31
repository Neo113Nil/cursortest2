package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class i00 implements e72.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f27035a;

    /* renamed from: b, reason: collision with root package name */
    private final List<yb0> f27036b;

    public i00() {
        this(sj0.h());
    }

    @Override // com.yandex.mobile.ads.impl.e72.c
    public final e72 a(int i4, e72.b bVar) {
        if (i4 != 2) {
            if (i4 == 3 || i4 == 4) {
                return new ng1(new r11(bVar.f25125a));
            }
            if (i4 == 21) {
                return new ng1(new bi0());
            }
            if (i4 == 27) {
                if (a(4)) {
                    return null;
                }
                return new ng1(new te0(new yw1(a(bVar)), a(1), a(8)));
            }
            if (i4 == 36) {
                return new ng1(new ue0(new yw1(a(bVar))));
            }
            if (i4 == 89) {
                return new ng1(new m40(bVar.f25126b));
            }
            if (i4 != 138) {
                if (i4 == 172) {
                    return new ng1(new r(bVar.f25125a));
                }
                if (i4 == 257) {
                    return new sw1(new dg1("application/vnd.dvb.ait"));
                }
                if (i4 == 134) {
                    if (a(16)) {
                        return null;
                    }
                    return new sw1(new dg1("application/x-scte35"));
                }
                if (i4 != 135) {
                    switch (i4) {
                        case 15:
                            if (!a(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!a(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i4) {
                                case 130:
                                    if (!a(64)) {
                                    }
                                    break;
                            }
                    }
                    return null;
                }
                return new ng1(new C2123o(bVar.f25125a));
            }
            return new ng1(new c40(bVar.f25125a));
        }
        return new ng1(new re0(new t82(a(bVar))));
    }

    public i00(List list) {
        this.f27035a = 0;
        this.f27036b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private List<yb0> a(e72.b bVar) {
        String str;
        int i4;
        List<byte[]> list;
        if (a(32)) {
            return this.f27036b;
        }
        sf1 sf1Var = new sf1(bVar.f25127c);
        ArrayList arrayList = this.f27036b;
        while (sf1Var.a() > 0) {
            int t4 = sf1Var.t();
            int d4 = sf1Var.d() + sf1Var.t();
            if (t4 == 134) {
                arrayList = new ArrayList();
                int t5 = sf1Var.t() & 31;
                for (int i5 = 0; i5 < t5; i5++) {
                    String a4 = sf1Var.a(3, un.f33183c);
                    int t6 = sf1Var.t();
                    boolean z4 = (t6 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                    if (z4) {
                        i4 = t6 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i4 = 1;
                    }
                    byte t7 = (byte) sf1Var.t();
                    sf1Var.f(1);
                    if (z4) {
                        list = Collections.singletonList((t7 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    arrayList.add(new yb0.a().e(str).d(a4).a(i4).a(list).a());
                }
            }
            sf1Var.e(d4);
            arrayList = arrayList;
        }
        return arrayList;
    }

    private boolean a(int i4) {
        return (i4 & this.f27035a) != 0;
    }

    @Override // com.yandex.mobile.ads.impl.e72.c
    public final SparseArray<e72> a() {
        return new SparseArray<>();
    }
}
