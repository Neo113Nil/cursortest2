package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cri;
import defpackage.ctt;
import defpackage.czv;
import defpackage.czw;
import defpackage.oy;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CpgDocument extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctt(8);
    public final int a;
    public final czw b;
    public final czv c;

    public CpgDocument(int i, czw czwVar, czv czvVar) {
        this.a = i;
        this.b = czwVar;
        this.c = czvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CpgDocument cpgDocument = (CpgDocument) obj;
            if (this.a == cpgDocument.a && Objects.equals(this.b, cpgDocument.b) && Objects.equals(this.c, cpgDocument.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.H(parcel, 2, this.b, i);
        oy.H(parcel, 3, this.c, i);
        oy.r(parcel, q);
    }
}
