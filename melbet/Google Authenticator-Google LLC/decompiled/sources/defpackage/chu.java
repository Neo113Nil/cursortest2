package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chu extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(8);
    public final String a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final String e;

    public chu(String str, String str2, String str3, String str4, byte[] bArr) {
        this.a = str;
        this.d = str3;
        this.c = str2;
        this.e = str4;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.I(parcel, 3, this.c);
        oy.I(parcel, 4, this.d);
        oy.I(parcel, 5, this.e);
        oy.A(parcel, 6, this.b);
        oy.r(parcel, q);
    }
}
