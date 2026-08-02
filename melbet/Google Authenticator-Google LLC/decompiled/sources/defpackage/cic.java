package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cic extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(14);
    public final String a;
    public final cif b;

    public cic(String str, cif cifVar) {
        this.a = str;
        this.b = cifVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.H(parcel, 2, this.b, i);
        oy.r(parcel, q);
    }
}
