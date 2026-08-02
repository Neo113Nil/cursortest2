package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyc extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(10);
    public final Uri a;
    public final Uri b;

    public cyc(Uri uri, Uri uri2) {
        this.a = uri;
        this.b = uri2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, this.a, i);
        oy.H(parcel, 2, this.b, i);
        oy.r(parcel, q);
    }
}
