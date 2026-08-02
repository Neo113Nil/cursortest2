package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dax extends cri implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ctv(14);
    public final dba a;
    public final String b;

    public dax(dba dbaVar, String str) {
        this.a = dbaVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dax)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        dax daxVar = (dax) obj;
        return Objects.equals(this.a, daxVar.a) && Objects.equals(this.b, daxVar.b);
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
