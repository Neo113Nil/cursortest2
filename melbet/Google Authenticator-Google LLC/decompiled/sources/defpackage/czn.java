package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czn extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(16);
    public final String a;
    public final int[] b;
    public final int c;
    public final String[] d;

    public czn(String str, int[] iArr, int i, String[] strArr) {
        this.a = str;
        this.b = iArr;
        this.c = i;
        this.d = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.D(parcel, 2, this.b);
        oy.v(parcel, 4, this.c);
        oy.J(parcel, 5, this.d);
        oy.r(parcel, q);
    }
}
