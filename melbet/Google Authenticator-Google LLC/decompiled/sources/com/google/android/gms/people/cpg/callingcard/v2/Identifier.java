package com.google.android.gms.people.cpg.callingcard.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cri;
import defpackage.ctt;
import defpackage.dab;
import defpackage.oy;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Identifier extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctt(19);
    public final int a;
    public final Long b;
    public final String c;
    public final dab d;

    public Identifier(int i, Long l, String str, dab dabVar) {
        this.a = i;
        this.b = l;
        this.c = str;
        this.d = dabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Identifier) {
            Identifier identifier = (Identifier) obj;
            if (this.a == identifier.a && Objects.equals(this.b, identifier.b) && Objects.equals(this.c, identifier.c) && Objects.equals(this.d, identifier.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.G(parcel, 2, this.b);
        oy.I(parcel, 3, this.c);
        oy.H(parcel, 4, this.d, i | 1);
        oy.r(parcel, q);
    }
}
