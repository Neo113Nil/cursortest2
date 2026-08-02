package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chx extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(10);
    public final cid a;
    public final String b;

    public chx(cid cidVar, String str) {
        this.a = cidVar;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cid cidVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, cidVar, i);
        oy.I(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
