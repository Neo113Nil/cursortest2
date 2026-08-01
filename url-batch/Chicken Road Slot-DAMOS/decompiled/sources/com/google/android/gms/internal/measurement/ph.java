package com.google.android.gms.internal.measurement;

import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ph extends c {

    /* renamed from: b, reason: collision with root package name */
    public final oa f2680b;

    /* renamed from: c, reason: collision with root package name */
    public final oa f2681c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2682d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2683e;

    public ph(oa oaVar, oa oaVar2) {
        this.f2680b = oaVar;
        this.f2681c = oaVar2;
        int a9 = oaVar2.a();
        if (!(a9 <= 28)) {
            te.a1.e("metadata size too large");
            throw null;
        }
        int[] iArr = new int[a9];
        this.f2682d = iArr;
        long j = 0;
        int i3 = 0;
        int i10 = 0;
        while (i3 < a9) {
            vg d10 = d(i3);
            long j3 = d10.f2902e | j;
            if (j3 == j) {
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        i11 = -1;
                        break;
                    } else if (d10.equals(d(iArr[i11] & 31))) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 != -1) {
                    iArr[i11] = d10.f2900c ? iArr[i11] | (1 << (i3 + 4)) : i3;
                    i3++;
                    j = j3;
                }
            }
            iArr[i10] = i3;
            i10++;
            i3++;
            j = j3;
        }
        this.f2683e = i10;
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final void a(mh mhVar, hh hhVar) {
        for (int i3 = 0; i3 < this.f2683e; i3++) {
            int i10 = this.f2682d[i3];
            vg d10 = d(i10 & 31);
            if (d10.f2900c) {
                mhVar.b(d10, new oh(this, d10, i10), hhVar);
            } else {
                oa oaVar = this.f2680b;
                int a9 = oaVar.a();
                if (i10 >= a9) {
                    oaVar = this.f2681c;
                    i10 -= a9;
                }
                mhVar.a(d10, d10.f2899b.cast(oaVar.j(i10)), hhVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final int b() {
        return this.f2683e;
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final Set c() {
        return new androidx.datastore.preferences.protobuf.b1(2, this);
    }

    public final vg d(int i3) {
        oa oaVar = this.f2680b;
        int a9 = oaVar.a();
        return i3 >= a9 ? this.f2681c.i(i3 - a9) : oaVar.i(i3);
    }
}
