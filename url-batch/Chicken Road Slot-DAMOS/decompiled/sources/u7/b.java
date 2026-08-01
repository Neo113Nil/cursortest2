package u7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c7.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends d7.a {
    public static final Parcelable.Creator<b> CREATOR = new p(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f9674d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9675e;

    /* renamed from: i, reason: collision with root package name */
    public final Intent f9676i;

    public b(int i3, int i10, Intent intent) {
        this.f9674d = i3;
        this.f9675e = i10;
        this.f9676i = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f9674d);
        cf.c.Y(parcel, 2, 4);
        parcel.writeInt(this.f9675e);
        cf.c.U(parcel, 3, this.f9676i, i3);
        cf.c.a0(parcel, Z);
    }
}
