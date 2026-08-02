package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dcv extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(14);
    final int a;
    final crb b;

    public dcv(int i, crb crbVar) {
        this.a = i;
        this.b = crbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, this.a);
        oy.H(parcel, 2, this.b, i);
        oy.r(parcel, q);
    }
}
