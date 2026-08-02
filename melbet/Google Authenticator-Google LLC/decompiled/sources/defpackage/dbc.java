package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbc extends cri implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ctv(19);
    public final dba a;
    public final String b;

    public dbc(dba dbaVar, String str) {
        this.a = dbaVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dbc)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        dbc dbcVar = (dbc) obj;
        return Objects.equals(this.a, dbcVar.a) && Objects.equals(this.b, dbcVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dba dbaVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 2, dbaVar, i);
        oy.I(parcel, 3, this.b);
        oy.r(parcel, q);
    }
}
