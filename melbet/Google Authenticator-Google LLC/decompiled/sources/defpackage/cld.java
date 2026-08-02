package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cld extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(4);
    public final boolean a;
    public final long b;

    public cld(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final Instant a() {
        return Instant.ofEpochMilli(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int q = oy.q(parcel, 20293);
        oy.s(parcel, 1, z);
        oy.w(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
