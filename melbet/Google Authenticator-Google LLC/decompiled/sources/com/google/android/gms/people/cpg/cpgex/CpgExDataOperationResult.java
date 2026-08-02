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
public final class CpgExDataOperationResult extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctv(3);
    public final CpgExRequestStatus a;
    public final Long b;
    public final Long c;

    public CpgExDataOperationResult(CpgExRequestStatus cpgExRequestStatus, Long l, Long l2) {
        this.a = cpgExRequestStatus;
        this.b = l;
        this.c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CpgExDataOperationResult) {
            CpgExDataOperationResult cpgExDataOperationResult = (CpgExDataOperationResult) obj;
            if (Objects.equals(this.a, cpgExDataOperationResult.a) && Objects.equals(this.b, cpgExDataOperationResult.b) && Objects.equals(this.c, cpgExDataOperationResult.c)) {
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
        oy.G(parcel, 2, this.b);
        oy.G(parcel, 3, this.c);
        oy.r(parcel, q);
    }
}
