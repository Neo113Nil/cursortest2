package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class og extends oa {

    /* renamed from: e, reason: collision with root package name */
    public Object[] f2650e;

    /* renamed from: f, reason: collision with root package name */
    public int f2651f;

    @Override // com.google.android.gms.internal.measurement.oa
    public final int a() {
        return this.f2651f;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final vg i(int i3) {
        if (i3 < this.f2651f) {
            return (vg) this.f2650e[i3 + i3];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final Object j(int i3) {
        if (i3 < this.f2651f) {
            return this.f2650e[i3 + i3 + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final Object k(vg vgVar) {
        int m10 = m(vgVar);
        if (m10 == -1) {
            return null;
        }
        return vgVar.f2899b.cast(this.f2650e[m10 + m10 + 1]);
    }

    public final void l(vg vgVar, Object obj) {
        int m10;
        if (!vgVar.f2900c && (m10 = m(vgVar)) != -1) {
            g1.c(obj, "metadata value");
            this.f2650e[m10 + m10 + 1] = obj;
            return;
        }
        int i3 = this.f2651f + 1;
        Object[] objArr = this.f2650e;
        int length = objArr.length;
        if (i3 + i3 > length) {
            this.f2650e = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.f2650e;
        int i10 = this.f2651f;
        int i11 = i10 + i10;
        objArr2[i11] = vgVar;
        g1.c(obj, "metadata value");
        objArr2[i11 + 1] = obj;
        this.f2651f++;
    }

    public final int m(vg vgVar) {
        for (int i3 = 0; i3 < this.f2651f; i3++) {
            if (this.f2650e[i3 + i3].equals(vgVar)) {
                return i3;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata{");
        for (int i3 = 0; i3 < this.f2651f; i3++) {
            sb2.append(" '");
            sb2.append(i(i3));
            sb2.append("': ");
            sb2.append(j(i3));
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
