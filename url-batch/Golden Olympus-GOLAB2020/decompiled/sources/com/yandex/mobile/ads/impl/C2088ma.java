package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sj0;
import com.yandex.mobile.ads.impl.x60;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.yandex.mobile.ads.impl.ma, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2088ma extends AbstractC1859ck {

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1881di f28962f;

    /* renamed from: g, reason: collision with root package name */
    private final wo f28963g;

    /* renamed from: com.yandex.mobile.ads.impl.ma$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f28964a;

        /* renamed from: b, reason: collision with root package name */
        public final long f28965b;

        public a(long j4, long j5) {
            this.f28964a = j4;
            this.f28965b = j5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28964a == aVar.f28964a && this.f28965b == aVar.f28965b;
        }

        public final int hashCode() {
            return (((int) this.f28964a) * 31) + ((int) this.f28965b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ma$b */
    public static class b implements x60.b {
        public b(int i4) {
            this((Object) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final x60[] a(x60.a[] aVarArr, InterfaceC1881di interfaceC1881di) {
            sj0 a4 = C2088ma.a(aVarArr);
            x60[] x60VarArr = new x60[aVarArr.length];
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                x60.a aVar = aVarArr[i4];
                if (aVar != null) {
                    int[] iArr = aVar.f34457b;
                    if (iArr.length != 0) {
                        x60VarArr[i4] = iArr.length == 1 ? new ib0(iArr[0], aVar.f34458c, aVar.f34456a) : new C2088ma(aVar.f34456a, iArr, aVar.f34458c, interfaceC1881di, 10000, 25000, (sj0) a4.get(i4), wo.f34156a);
                    }
                }
            }
            return x60VarArr;
        }

        public b(Object obj) {
        }
    }

    protected C2088ma(n52 n52Var, int[] iArr, int i4, InterfaceC1881di interfaceC1881di, long j4, long j5, sj0 sj0Var, wo woVar) {
        super(n52Var, iArr);
        if (j5 < j4) {
            ms0.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f28962f = interfaceC1881di;
        sj0.a((Collection) sj0Var);
        this.f28963g = woVar;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1859ck, com.yandex.mobile.ads.impl.x60
    public final void a(float f4) {
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1859ck, com.yandex.mobile.ads.impl.x60
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1859ck, com.yandex.mobile.ads.impl.x60
    public final void d() {
    }

    private static void a(ArrayList arrayList, long[] jArr) {
        long j4 = 0;
        for (long j5 : jArr) {
            j4 += j5;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            sj0.a aVar = (sj0.a) arrayList.get(i4);
            if (aVar != null) {
                aVar.b(new a(j4, jArr[i4]));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static sj0<sj0<a>> a(x60.a[] aVarArr) {
        int i4;
        int i5;
        int i6;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i4 = 1;
            if (i8 >= aVarArr.length) {
                break;
            }
            x60.a aVar = aVarArr[i8];
            if (aVar != null && aVar.f34457b.length > 1) {
                sj0.a g4 = sj0.g();
                g4.b(new a(0L, 0L));
                arrayList.add(g4);
            } else {
                arrayList.add(null);
            }
            i8++;
        }
        int length = aVarArr.length;
        long[][] jArr = new long[length][];
        for (int i9 = 0; i9 < aVarArr.length; i9++) {
            x60.a aVar2 = aVarArr[i9];
            if (aVar2 == null) {
                jArr[i9] = new long[0];
            } else {
                jArr[i9] = new long[aVar2.f34457b.length];
                int i10 = 0;
                while (true) {
                    if (i10 >= aVar2.f34457b.length) {
                        break;
                    }
                    jArr[i9][i10] = aVar2.f34456a.a(r11[i10]).f34987i;
                    i10++;
                }
                Arrays.sort(jArr[i9]);
            }
        }
        int[] iArr = new int[length];
        long[] jArr2 = new long[length];
        for (int i11 = 0; i11 < length; i11++) {
            long[] jArr3 = jArr[i11];
            jArr2[i11] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        a(arrayList, jArr2);
        g31 b4 = i31.a().a().b();
        int i12 = 0;
        while (i12 < length) {
            long[] jArr4 = jArr[i12];
            if (jArr4.length <= i4) {
                i5 = i7;
                i6 = length;
            } else {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i13 = i7;
                while (true) {
                    long[] jArr5 = jArr[i12];
                    double d4 = 0.0d;
                    if (i13 >= jArr5.length) {
                        break;
                    }
                    int i14 = i7;
                    int i15 = length;
                    long j4 = jArr5[i13];
                    if (j4 != -1) {
                        d4 = Math.log(j4);
                    }
                    dArr[i13] = d4;
                    i13++;
                    i7 = i14;
                    length = i15;
                }
                i5 = i7;
                i6 = length;
                int i16 = length2 - 1;
                double d5 = dArr[i16] - dArr[i5];
                int i17 = i5;
                while (i17 < i16) {
                    double d6 = dArr[i17];
                    i17++;
                    b4.put(Double.valueOf(d5 == 0.0d ? 1.0d : (((d6 + dArr[i17]) * 0.5d) - dArr[i5]) / d5), Integer.valueOf(i12));
                    i4 = i4;
                }
            }
            i12++;
            i7 = i5;
            length = i6;
            i4 = i4;
        }
        int i18 = i7;
        sj0 a4 = sj0.a(b4.values());
        for (int i19 = i18; i19 < a4.size(); i19++) {
            int intValue = ((Integer) a4.get(i19)).intValue();
            int i20 = iArr[intValue] + 1;
            iArr[intValue] = i20;
            jArr2[intValue] = jArr[intValue][i20];
            a(arrayList, jArr2);
        }
        for (int i21 = i18; i21 < aVarArr.length; i21++) {
            if (arrayList.get(i21) != null) {
                jArr2[i21] = jArr2[i21] * 2;
            }
        }
        a(arrayList, jArr2);
        sj0.a g5 = sj0.g();
        for (int i22 = i18; i22 < arrayList.size(); i22++) {
            sj0.a aVar3 = (sj0.a) arrayList.get(i22);
            g5.b((Object) (aVar3 == null ? sj0.h() : aVar3.a()));
        }
        return g5.a();
    }
}
