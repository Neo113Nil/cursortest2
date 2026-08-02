package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dav extends cri implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ctv(12);
    public final dba a;
    public final Long b;

    public dav(dba dbaVar, Long l) {
        this.a = dbaVar;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dav)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        dav davVar = (dav) obj;
        return Objects.equals(this.a, davVar.a) && Objects.equals(this.b, davVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dba dbaVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 2, dbaVar, i);
        oy.G(parcel, 3, this.b);
        oy.r(parcel, q);
    }
}
