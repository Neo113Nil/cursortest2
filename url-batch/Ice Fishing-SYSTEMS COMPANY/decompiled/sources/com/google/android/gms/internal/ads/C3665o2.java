package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3665o2 implements InterfaceC3015c1 {

    /* renamed from: a, reason: collision with root package name */
    public final I0 f33084a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f33085b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33086c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33087d;

    public C3665o2(SparseArray sparseArray, long j9, int i, long j10, long j11) {
        int i4;
        this.f33085b = sparseArray;
        this.f33086c = j9;
        this.f33087d = i;
        List list = (List) sparseArray.get(i);
        I0 i02 = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                C3611n2 c3611n2 = (C3611n2) list.get(i10);
                jArr3[i10] = c3611n2.f32817n;
                jArr[i10] = c3611n2.f32818u;
            }
            while (true) {
                i4 = size - 1;
                if (i9 >= i4) {
                    break;
                }
                int i11 = i9 + 1;
                iArr[i9] = (int) (jArr[i11] - jArr[i9]);
                jArr2[i9] = jArr3[i11] - jArr3[i9];
                i9 = i11;
            }
            int i12 = i4;
            while (i12 > 0 && jArr3[i12] >= j9) {
                i12--;
            }
            iArr[i12] = (int) ((j10 + j11) - jArr[i12]);
            jArr2[i12] = j9 - jArr3[i12];
            if (i12 < i4) {
                AbstractC3217fl.I("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i13 = i12 + 1;
                iArr = Arrays.copyOf(iArr, i13);
                jArr = Arrays.copyOf(jArr, i13);
                jArr2 = Arrays.copyOf(jArr2, i13);
                jArr3 = Arrays.copyOf(jArr3, i13);
            }
            i02 = new I0(iArr, jArr, jArr2, jArr3);
        }
        this.f33084a = i02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        return this.f33086c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        I0 i02 = this.f33084a;
        if (i02 != null) {
            return i02.c(j9);
        }
        C3070d1 c3070d1 = C3070d1.f29773c;
        return new C2961b1(c3070d1, c3070d1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        List list = (List) this.f33085b.get(this.f33087d);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
