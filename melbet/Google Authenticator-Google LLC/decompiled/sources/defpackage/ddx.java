package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ddx extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(19);
    public final boolean a;
    public final boolean b;
    public final int c;

    public ddx(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.s(parcel, 2, this.a);
        oy.s(parcel, 3, this.b);
        oy.v(parcel, 4, this.c);
        oy.r(parcel, q);
    }
}
