package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ddq extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(18);
    public final boolean a;
    public final int b;

    public ddq(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.s(parcel, 2, this.a);
        oy.v(parcel, 3, this.b);
        oy.r(parcel, q);
    }
}
