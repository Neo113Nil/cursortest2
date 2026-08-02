package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crx extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(7);
    public final boolean a;
    public final int b;

    public crx(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int q = oy.q(parcel, 20293);
        oy.s(parcel, 1, z);
        oy.v(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
