package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jem extends cri {
    public static final Parcelable.Creator CREATOR = new dtk(17);
    public final jeq a;
    public final String b;
    public final String c;
    public final jer[] d;
    public final jeo[] e;
    public final String[] f;
    public final jej[] g;

    public jem(jeq jeqVar, String str, String str2, jer[] jerVarArr, jeo[] jeoVarArr, String[] strArr, jej[] jejVarArr) {
        this.a = jeqVar;
        this.b = str;
        this.c = str2;
        this.d = jerVarArr;
        this.e = jeoVarArr;
        this.f = strArr;
        this.g = jejVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jeq jeqVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, jeqVar, i);
        oy.I(parcel, 2, this.b);
        oy.I(parcel, 3, this.c);
        oy.L(parcel, 4, this.d, i);
        oy.L(parcel, 5, this.e, i);
        oy.J(parcel, 6, this.f);
        oy.L(parcel, 7, this.g, i);
        oy.r(parcel, q);
    }
}
