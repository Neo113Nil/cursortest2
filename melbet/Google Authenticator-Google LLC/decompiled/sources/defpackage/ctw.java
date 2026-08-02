package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ctw extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(14);
    public int a;
    int b;

    public ctw(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 2, this.a);
        oy.v(parcel, 3, this.b);
        oy.r(parcel, q);
    }

    public ctw() {
        throw null;
    }
}
