package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cqc;
import defpackage.cri;
import defpackage.oy;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FRDProductSpecificDataEntry extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cqc(15);
    final int a;
    final int b;
    final List c;
    final List d;
    final List e;
    final List f;
    final byte[][] g;
    final Boolean h;

    public FRDProductSpecificDataEntry(int i, int i2, List list, List list2, List list3, List list4, byte[][] bArr, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = bArr;
        this.h = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FRDProductSpecificDataEntry)) {
            return false;
        }
        FRDProductSpecificDataEntry fRDProductSpecificDataEntry = (FRDProductSpecificDataEntry) obj;
        return this.a == fRDProductSpecificDataEntry.a && this.b == fRDProductSpecificDataEntry.b && Objects.equals(this.c, fRDProductSpecificDataEntry.c) && Objects.equals(this.d, fRDProductSpecificDataEntry.d) && Objects.equals(this.e, fRDProductSpecificDataEntry.e) && Objects.equals(this.f, fRDProductSpecificDataEntry.f) && Arrays.equals(this.g, fRDProductSpecificDataEntry.g) && Objects.equals(this.h, fRDProductSpecificDataEntry.h);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(Arrays.deepHashCode(this.g)), this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 2, this.a);
        oy.v(parcel, 3, this.b);
        oy.K(parcel, 4, this.c);
        oy.F(parcel, 5, this.d);
        oy.K(parcel, 6, this.e);
        oy.F(parcel, 7, this.f);
        oy.B(parcel, 8, this.g);
        oy.y(parcel, 9, this.h);
        oy.r(parcel, q);
    }
}
