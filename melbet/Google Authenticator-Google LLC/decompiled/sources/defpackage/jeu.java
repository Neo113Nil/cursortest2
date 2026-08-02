package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeu extends cri {
    public static final Parcelable.Creator CREATOR = new jex(4);
    public final String a;
    public final String b;
    public final int c;

    public jeu(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, str);
        oy.I(parcel, 2, this.b);
        oy.v(parcel, 3, this.c);
        oy.r(parcel, q);
    }
}
