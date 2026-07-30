package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3770q implements InterfaceC3716p {

    /* renamed from: a, reason: collision with root package name */
    public final B8 f33553a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33554b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f33555c;

    /* renamed from: d, reason: collision with root package name */
    public final TP[] f33556d;

    /* renamed from: e, reason: collision with root package name */
    public int f33557e;

    public C3770q(B8 b82, int[] iArr) {
        TP[] tpArr;
        int length = iArr.length;
        PA.T(length > 0);
        b82.getClass();
        this.f33553a = b82;
        this.f33554b = length;
        this.f33556d = new TP[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            tpArr = b82.f24000d;
            if (i >= length2) {
                break;
            }
            this.f33556d[i] = tpArr[iArr[i]];
            i++;
        }
        Arrays.sort(this.f33556d, C2959b.J);
        this.f33555c = new int[this.f33554b];
        for (int i4 = 0; i4 < this.f33554b; i4++) {
            int[] iArr2 = this.f33555c;
            TP tp = this.f33556d[i4];
            int i9 = 0;
            while (true) {
                if (i9 >= tpArr.length) {
                    i9 = -1;
                    break;
                } else if (tp == tpArr[i9]) {
                    break;
                } else {
                    i9++;
                }
            }
            iArr2[i4] = i9;
        }
    }

    public static void b(ArrayList arrayList, long[] jArr) {
        long j9 = 0;
        for (int i = 0; i < 2; i++) {
            j9 += jArr[i];
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            RB rb = (RB) arrayList.get(i4);
            if (rb != null) {
                rb.a(new C3150eR(j9, jArr[i4]));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final B8 a() {
        return this.f33553a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final int c() {
        return this.f33555c.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3770q c3770q = (C3770q) obj;
            if (this.f33553a.equals(c3770q.f33553a) && Arrays.equals(this.f33555c, c3770q.f33555c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final int g() {
        return this.f33555c[0];
    }

    public final int hashCode() {
        int i = this.f33557e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f33555c) + (System.identityHashCode(this.f33553a) * 31);
        this.f33557e = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final TP i() {
        return this.f33556d[0];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final int l0(int i) {
        for (int i4 = 0; i4 < this.f33554b; i4++) {
            if (this.f33555c[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final int s(int i) {
        return this.f33555c[i];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3716p
    public final TP t(int i) {
        return this.f33556d[i];
    }
}
