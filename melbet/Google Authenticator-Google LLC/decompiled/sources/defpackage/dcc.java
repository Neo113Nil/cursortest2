package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dcc extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(9);
    public final byte[] a;

    public dcc(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dcc) {
            return Arrays.equals(this.a, ((dcc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int q = oy.q(parcel, 20293);
        oy.A(parcel, 1, bArr);
        oy.r(parcel, q);
    }
}
