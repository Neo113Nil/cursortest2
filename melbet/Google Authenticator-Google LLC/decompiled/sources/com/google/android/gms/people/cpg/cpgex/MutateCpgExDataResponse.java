package com.google.android.gms.people.cpg.cpgex;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cri;
import defpackage.ctv;
import defpackage.oy;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MutateCpgExDataResponse extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctv(8);
    public final CpgExRequestStatus a;
    public final List b;

    public MutateCpgExDataResponse(CpgExRequestStatus cpgExRequestStatus, List list) {
        this.a = cpgExRequestStatus;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MutateCpgExDataResponse) {
            MutateCpgExDataResponse mutateCpgExDataResponse = (MutateCpgExDataResponse) obj;
            if (Objects.equals(this.a, mutateCpgExDataResponse.a) && Objects.equals(this.b, mutateCpgExDataResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CpgExRequestStatus cpgExRequestStatus = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, cpgExRequestStatus, i);
        oy.M(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
