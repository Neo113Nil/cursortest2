package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbi extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(2);
    public final byte[] a;

    public dbi(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.A(parcel, 2, this.a);
        oy.r(parcel, q);
    }
}
