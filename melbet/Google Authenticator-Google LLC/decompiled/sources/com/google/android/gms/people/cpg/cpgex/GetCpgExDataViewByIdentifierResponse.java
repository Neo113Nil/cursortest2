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
public final class GetCpgExDataViewByIdentifierResponse extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctv(6);
    public final CpgExRequestStatus a;
    public final List b;

    public GetCpgExDataViewByIdentifierResponse(CpgExRequestStatus cpgExRequestStatus, List list) {
        this.a = cpgExRequestStatus;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetCpgExDataViewByIdentifierResponse) {
            GetCpgExDataViewByIdentifierResponse getCpgExDataViewByIdentifierResponse = (GetCpgExDataViewByIdentifierResponse) obj;
            if (Objects.equals(this.a, getCpgExDataViewByIdentifierResponse.a) && Objects.equals(this.b, getCpgExDataViewByIdentifierResponse.b)) {
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
