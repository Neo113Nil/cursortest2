package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends d7.a {
    public static final Parcelable.Creator<n> CREATOR = new p(0);

    /* renamed from: d, reason: collision with root package name */
    public final int f1956d;

    /* renamed from: e, reason: collision with root package name */
    public List f1957e;

    public n(int i3, List list) {
        this.f1956d = i3;
        this.f1957e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f1956d);
        cf.c.X(parcel, 2, this.f1957e);
        cf.c.a0(parcel, Z);
    }
}
