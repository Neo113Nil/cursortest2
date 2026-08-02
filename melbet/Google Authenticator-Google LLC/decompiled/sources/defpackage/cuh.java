package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cuh extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(18);
    final String a;
    final String b;
    final String c;
    final String d;

    public cuh(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, this.a);
        oy.I(parcel, 3, this.b);
        oy.I(parcel, 4, this.c);
        oy.I(parcel, 5, this.d);
        oy.r(parcel, q);
    }
}
