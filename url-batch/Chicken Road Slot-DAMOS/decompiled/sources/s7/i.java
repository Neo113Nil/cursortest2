package s7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends d7.a {
    public static final Parcelable.Creator<i> CREATOR = new c7.p(14);

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f8731d;

    public i(Bundle bundle) {
        this.f8731d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.P(parcel, 1, this.f8731d);
        cf.c.a0(parcel, Z);
    }
}
