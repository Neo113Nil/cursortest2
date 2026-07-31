package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.s31;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class if0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f27190a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27191b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27192c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27193d;

    private if0(List list, int i4, float f4, String str) {
        this.f27190a = list;
        this.f27191b = i4;
        this.f27192c = f4;
        this.f27193d = str;
    }

    public static if0 a(sf1 sf1Var) {
        boolean z4;
        int i4;
        try {
            sf1Var.f(21);
            int t4 = sf1Var.t() & 3;
            int t5 = sf1Var.t();
            int d4 = sf1Var.d();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                z4 = true;
                if (i6 >= t5) {
                    break;
                }
                sf1Var.f(1);
                int z5 = sf1Var.z();
                for (int i8 = 0; i8 < z5; i8++) {
                    int z6 = sf1Var.z();
                    i7 += z6 + 4;
                    sf1Var.f(z6);
                }
                i6++;
            }
            sf1Var.e(d4);
            byte[] bArr = new byte[i7];
            float f4 = 1.0f;
            String str = null;
            int i9 = 0;
            int i10 = 0;
            while (i9 < t5) {
                int t6 = sf1Var.t() & 127;
                int z7 = sf1Var.z();
                int i11 = i5;
                while (i11 < z7) {
                    int z8 = sf1Var.z();
                    boolean z9 = z4;
                    System.arraycopy(s31.f31556a, i5, bArr, i10, 4);
                    int i12 = i10 + 4;
                    System.arraycopy(sf1Var.c(), sf1Var.d(), bArr, i12, z8);
                    if (t6 == 33 && i11 == 0) {
                        s31.a a4 = s31.a(bArr, i12, i12 + z8);
                        float f5 = a4.f31566g;
                        i4 = t4;
                        str = bq.a(a4.f31560a, a4.f31561b, a4.f31562c, a4.f31563d, a4.f31564e, a4.f31565f);
                        f4 = f5;
                    } else {
                        i4 = t4;
                    }
                    i10 = i12 + z8;
                    sf1Var.f(z8);
                    i11++;
                    z4 = z9;
                    t4 = i4;
                    i5 = 0;
                }
                i9++;
                i5 = 0;
            }
            return new if0(i7 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), t4 + 1, f4, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw wf1.a("Error parsing HEVC config", e4);
        }
    }
}
