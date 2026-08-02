package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jer extends cri {
    public static final Parcelable.Creator CREATOR = new jex(0);
    public final int a;
    public final String b;

    public jer(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.I(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
