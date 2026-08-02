package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxp extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(7);
    public final Uri a;

    public cxp(Uri uri) {
        this.a = uri;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, this.a, i);
        oy.r(parcel, q);
    }
}
