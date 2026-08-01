package s7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b4 extends d7.a {
    public static final Parcelable.Creator<b4> CREATOR = new c7.p(19);

    /* renamed from: d, reason: collision with root package name */
    public final List f8532d;

    public b4(ArrayList arrayList) {
        this.f8532d = arrayList;
    }

    public static b4 b(x2... x2VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(x2VarArr[0].f9103d));
        return new b4(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        List list = this.f8532d;
        if (list != null) {
            int Z2 = cf.c.Z(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeInt(((Integer) list.get(i10)).intValue());
            }
            cf.c.a0(parcel, Z2);
        }
        cf.c.a0(parcel, Z);
    }
}
