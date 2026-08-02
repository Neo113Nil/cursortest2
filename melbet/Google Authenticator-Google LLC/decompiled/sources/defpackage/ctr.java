package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ctr extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(13);
    final String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final ctu[] f;
    final boolean g;

    public ctr(String str, boolean z, boolean z2, boolean z3, boolean z4, ctu[] ctuVarArr, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = ctuVarArr;
        this.g = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, this.a);
        oy.s(parcel, 3, this.b);
        oy.s(parcel, 4, this.c);
        oy.s(parcel, 5, this.d);
        oy.s(parcel, 6, this.e);
        oy.L(parcel, 7, this.f, i);
        oy.s(parcel, 8, this.g);
        oy.r(parcel, q);
    }
}
