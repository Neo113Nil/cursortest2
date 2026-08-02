package com.google.android.gms.people.cpg.cpgex;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cri;
import defpackage.ctv;
import defpackage.oy;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CpgExDataViewResult extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctv(4);
    public final CpgExRequestStatus a;
    public final Identifier b;
    public final CpgExDataContents c;

    public CpgExDataViewResult(CpgExRequestStatus cpgExRequestStatus, Identifier identifier, CpgExDataContents cpgExDataContents) {
        this.a = cpgExRequestStatus;
        this.b = identifier;
        this.c = cpgExDataContents;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CpgExDataViewResult) {
            CpgExDataViewResult cpgExDataViewResult = (CpgExDataViewResult) obj;
            if (Objects.equals(this.a, cpgExDataViewResult.a) && Objects.equals(this.b, cpgExDataViewResult.b) && Objects.equals(this.c, cpgExDataViewResult.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CpgExRequestStatus cpgExRequestStatus = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, cpgExRequestStatus, i);
        oy.H(parcel, 2, this.b, i);
        oy.H(parcel, 3, this.c, i);
        oy.r(parcel, q);
    }
}
