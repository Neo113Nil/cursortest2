package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dba extends cri implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ctv(17);
    public final Integer a;
    public final Boolean b;

    public dba(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dba)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        dba dbaVar = (dba) obj;
        return Objects.equals(this.a, dbaVar.a) && Objects.equals(this.b, dbaVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int q = oy.q(parcel, 20293);
        oy.E(parcel, 3, num);
        oy.y(parcel, 4, this.b);
        oy.r(parcel, q);
    }
}
