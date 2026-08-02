package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jel extends cri {
    public static final Parcelable.Creator CREATOR = new dtk(16);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final jek f;
    public final jek g;

    public jel(String str, String str2, String str3, String str4, String str5, jek jekVar, jek jekVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = jekVar;
        this.g = jekVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.I(parcel, 2, this.b);
        oy.I(parcel, 3, this.c);
        oy.I(parcel, 4, this.d);
        oy.I(parcel, 5, this.e);
        oy.H(parcel, 6, this.f, i);
        oy.H(parcel, 7, this.g, i);
        oy.r(parcel, q);
    }
}
