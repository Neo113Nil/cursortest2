package u7;

import android.os.Parcel;
import android.os.Parcelable;
import c7.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends d7.a {
    public static final Parcelable.Creator<d> CREATOR = new p(25);

    /* renamed from: d, reason: collision with root package name */
    public final List f9677d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9678e;

    public d(String str, ArrayList arrayList) {
        this.f9677d = arrayList;
        this.f9678e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        List<String> list = this.f9677d;
        if (list != null) {
            int Z2 = cf.c.Z(parcel, 1);
            parcel.writeStringList(list);
            cf.c.a0(parcel, Z2);
        }
        cf.c.V(parcel, 2, this.f9678e);
        cf.c.a0(parcel, Z);
    }
}
