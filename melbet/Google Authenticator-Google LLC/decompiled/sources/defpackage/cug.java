package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cug extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(16);
    public GoogleHelp a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;

    public cug(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2, String str4) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
        this.g = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, this.a, i);
        oy.I(parcel, 2, this.b);
        oy.I(parcel, 3, this.c);
        oy.v(parcel, 4, this.d);
        oy.I(parcel, 5, this.e);
        oy.v(parcel, 6, this.f);
        oy.I(parcel, 7, this.g);
        oy.r(parcel, q);
    }
}
