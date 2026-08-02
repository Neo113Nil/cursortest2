package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeo extends cri {
    public static final Parcelable.Creator CREATOR = new dtk(19);
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public jeo(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.I(parcel, 2, this.b);
        oy.I(parcel, 3, this.c);
        oy.I(parcel, 4, this.d);
        oy.r(parcel, q);
    }
}
