package com.google.android.gms.people.cpg.cpgex;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cri;
import defpackage.ctv;
import defpackage.oy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CpgExRequestStatus extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctv(5);
    public final int a;

    public CpgExRequestStatus(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CpgExRequestStatus) && this.a == ((CpgExRequestStatus) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.r(parcel, q);
    }
}
