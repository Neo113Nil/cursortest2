package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c7.p;
import c7.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends d7.a {
    public static final Parcelable.Creator<e> CREATOR = new p(26);

    /* renamed from: d, reason: collision with root package name */
    public final int f9679d;

    /* renamed from: e, reason: collision with root package name */
    public final z6.b f9680e;

    /* renamed from: i, reason: collision with root package name */
    public final w f9681i;

    public e(int i3, z6.b bVar, w wVar) {
        this.f9679d = i3;
        this.f9680e = bVar;
        this.f9681i = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f9679d);
        cf.c.U(parcel, 2, this.f9680e, i3);
        cf.c.U(parcel, 3, this.f9681i, i3);
        cf.c.a0(parcel, Z);
    }
}
