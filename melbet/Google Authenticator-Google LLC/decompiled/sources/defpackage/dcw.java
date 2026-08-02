package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dcw extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(15);
    final int a;
    public final clg b;
    public final crc c;

    public dcw(int i, clg clgVar, crc crcVar) {
        this.a = i;
        this.b = clgVar;
        this.c = crcVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, this.a);
        oy.H(parcel, 2, this.b, i);
        oy.H(parcel, 3, this.c, i);
        oy.r(parcel, q);
    }
}
