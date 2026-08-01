package y6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c7.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends d7.a {
    public static final Parcelable.Creator<a> CREATOR = new p(28);

    /* renamed from: d, reason: collision with root package name */
    public final Intent f10624d;

    public a(Intent intent) {
        this.f10624d = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.U(parcel, 1, this.f10624d, i3);
        cf.c.a0(parcel, Z);
    }
}
