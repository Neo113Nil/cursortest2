package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckj extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(20);
    public final int a;
    public final int b;
    public final int c;

    public ckj(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.v(parcel, 2, this.b);
        oy.v(parcel, 3, this.c);
        oy.r(parcel, q);
    }
}
