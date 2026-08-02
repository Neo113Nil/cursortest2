package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbb extends cri implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ctv(18);
    public final dba a;
    public final String b;
    public final String c;

    public dbb(dba dbaVar, String str, String str2) {
        this.a = dbaVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dbb)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        dbb dbbVar = (dbb) obj;
        return Objects.equals(this.a, dbbVar.a) && Objects.equals(this.b, dbbVar.b) && Objects.equals(this.c, dbbVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dba dbaVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 2, dbaVar, i);
        oy.I(parcel, 3, this.b);
        oy.I(parcel, 4, this.c);
        oy.r(parcel, q);
    }
}
