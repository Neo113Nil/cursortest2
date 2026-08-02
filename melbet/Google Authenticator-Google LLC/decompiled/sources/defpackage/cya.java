package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cya extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(8);
    public final Uri a;
    public final int b;

    public cya(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, this.a, i);
        oy.v(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
