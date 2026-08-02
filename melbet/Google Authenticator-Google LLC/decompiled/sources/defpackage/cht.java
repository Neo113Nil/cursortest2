package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cht extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(7);
    public final chv a;
    public final chu b;

    public cht(chv chvVar, chu chuVar) {
        this.a = chvVar;
        this.b = chuVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        chv chvVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, chvVar, i);
        oy.H(parcel, 2, this.b, i);
        oy.r(parcel, q);
    }
}
