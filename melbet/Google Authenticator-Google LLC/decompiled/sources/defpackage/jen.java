package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jen extends cri {
    public static final Parcelable.Creator CREATOR = new dtk(18);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public jen(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
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
        oy.I(parcel, 6, this.f);
        oy.I(parcel, 7, this.g);
        oy.I(parcel, 8, this.h);
        oy.I(parcel, 9, this.i);
        oy.I(parcel, 10, this.j);
        oy.I(parcel, 11, this.k);
        oy.I(parcel, 12, this.l);
        oy.I(parcel, 13, this.m);
        oy.I(parcel, 14, this.n);
        oy.r(parcel, q);
    }
}
