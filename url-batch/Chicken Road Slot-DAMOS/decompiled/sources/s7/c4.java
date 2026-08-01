package s7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c4 extends d7.a {
    public static final Parcelable.Creator<c4> CREATOR = new c7.p(20);

    /* renamed from: d, reason: collision with root package name */
    public final List f8565d;

    public c4(ArrayList arrayList) {
        this.f8565d = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.X(parcel, 1, this.f8565d);
        cf.c.a0(parcel, Z);
    }
}
