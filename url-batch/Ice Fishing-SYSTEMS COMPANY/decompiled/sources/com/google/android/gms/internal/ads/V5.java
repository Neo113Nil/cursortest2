package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class V5 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28210a;

    /* renamed from: b, reason: collision with root package name */
    public int f28211b;

    public V5() {
        this.f28210a = new ArrayList();
        this.f28211b = 0;
    }

    public int a(long j9) {
        long j10;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i = iArr[0];
        int i4 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int g9 = com.anythink.basead.b.c.i.g(((~i) & i4) | i9, (i & i10) | i11, i12, i13);
        int i15 = i14 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        long j19 = (((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + j17;
        long j20 = j18 % 438792350;
        if (j9 >= 0) {
            j10 = (this.f28211b + (g9 ^ i15)) - j9;
        } else {
            j10 = (j19 ^ j20) + (-j9);
        }
        if (j10 < 0 || j10 >= this.f28211b) {
            throw new T5();
        }
        return (int) j10;
    }

    public void b(C3020c6 c3020c6) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i = iArr[0];
        int i4 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int g9 = com.anythink.basead.b.c.i.g((i4 & (~i)) | i9, (i & i10) | i11, i12, i13);
        int i15 = this.f28211b;
        if (i15 >= ((i14 % 937558955) ^ g9)) {
            throw new U5();
        }
        ArrayList arrayList = this.f28210a;
        if (i15 == arrayList.size()) {
            arrayList.add(c3020c6);
        } else {
            arrayList.set(this.f28211b, c3020c6);
        }
        this.f28211b++;
    }

    public C3020c6 c() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i = iArr[0];
        int i4 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int g9 = com.anythink.basead.b.c.i.g((i4 & (~i)) | i9, (i & i10) | i11, i12, i13);
        int i15 = i14 % 459541652;
        int i16 = this.f28211b;
        if (i16 <= 0) {
            throw new T5();
        }
        int i17 = i15 ^ g9;
        ArrayList arrayList = this.f28210a;
        C3020c6 c3020c6 = (C3020c6) arrayList.get(i16 + i17);
        arrayList.set(this.f28211b + i17, null);
        this.f28211b += i17;
        return c3020c6;
    }

    public C3020c6 d(long j9) {
        return (C3020c6) this.f28210a.get(a(j9));
    }

    public V5(ArrayList arrayList) {
        this.f28210a = arrayList;
    }
}
