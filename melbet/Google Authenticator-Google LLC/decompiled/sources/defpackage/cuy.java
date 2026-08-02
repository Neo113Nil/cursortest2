package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cuy extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(19);
    final int a;
    final String b;
    final Intent c;

    public cuy(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 2, this.a);
        oy.I(parcel, 3, this.b);
        oy.H(parcel, 4, this.c, i);
        oy.r(parcel, q);
    }
}
