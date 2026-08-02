package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ddo extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(16);
    public final String a;
    public final byte[] b;
    public final List c;

    public ddo(String str, byte[] bArr, List list) {
        this.a = str;
        this.b = bArr;
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ddo)) {
            return false;
        }
        ddo ddoVar = (ddo) obj;
        return Objects.equals(this.a, ddoVar.a) && Objects.equals(this.b, ddoVar.b) && Objects.equals(this.c, ddoVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.A(parcel, 2, this.b);
        ArrayList arrayList = new ArrayList(this.c);
        int q2 = oy.q(parcel, 3);
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        oy.r(parcel, q2);
        oy.r(parcel, q);
    }
}
