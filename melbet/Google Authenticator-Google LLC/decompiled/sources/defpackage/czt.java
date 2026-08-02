package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czt extends cri {
    public static final Parcelable.Creator CREATOR = new ctt(3);
    public final int a;
    public final String b;
    public final czp c;

    public czt(int i, String str, czp czpVar) {
        this.a = i;
        this.b = str;
        this.c = czpVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.I(parcel, 2, this.b);
        oy.H(parcel, 3, this.c, i);
        oy.r(parcel, q);
    }
}
