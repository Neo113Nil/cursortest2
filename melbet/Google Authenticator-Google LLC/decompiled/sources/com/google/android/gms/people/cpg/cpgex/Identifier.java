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
public final class Identifier extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctv(7);
    public final Account a;
    public final Long b;
    public final Long c;
    public final Cp2Identifier d;

    public Identifier(Account account, Long l, Long l2, Cp2Identifier cp2Identifier) {
        this.a = account;
        this.b = l;
        this.c = l2;
        this.d = cp2Identifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Identifier) {
            Identifier identifier = (Identifier) obj;
            if (Objects.equals(this.a, identifier.a) && Objects.equals(this.b, identifier.b) && Objects.equals(this.c, identifier.c) && Objects.equals(this.d, identifier.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, account, i);
        oy.G(parcel, 2, this.b);
        oy.G(parcel, 3, this.c);
        oy.H(parcel, 4, this.d, i);
        oy.r(parcel, q);
    }
}
