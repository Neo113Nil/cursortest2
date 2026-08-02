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
public final class Cp2Identifier extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctv(2);
    public final long a;
    public final String b;

    public Cp2Identifier(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cp2Identifier) {
            Cp2Identifier cp2Identifier = (Cp2Identifier) obj;
            if (this.a == cp2Identifier.a && Objects.equals(this.b, cp2Identifier.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int q = oy.q(parcel, 20293);
        oy.w(parcel, 1, j);
        oy.I(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
