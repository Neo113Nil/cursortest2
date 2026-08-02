package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxf extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(3);
    public final String a;
    public final long b;

    public cxf(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.w(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
