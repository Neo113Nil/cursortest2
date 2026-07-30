package m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends n4.a {
    public static final Parcelable.Creator<h> CREATOR = new d4.a(7);

    /* renamed from: f, reason: collision with root package name */
    public final int f6371f;

    /* renamed from: g, reason: collision with root package name */
    public List f6372g;

    public h(int i7, List list) {
        this.f6371f = i7;
        this.f6372g = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int R = a8.m.R(parcel, 20293);
        a8.m.T(parcel, 1, 4);
        parcel.writeInt(this.f6371f);
        List list = this.f6372g;
        if (list != null) {
            int R2 = a8.m.R(parcel, 2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i8 = 0; i8 < size; i8++) {
                Parcelable parcelable = (Parcelable) list.get(i8);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            a8.m.S(parcel, R2);
        }
        a8.m.S(parcel, R);
    }
}
