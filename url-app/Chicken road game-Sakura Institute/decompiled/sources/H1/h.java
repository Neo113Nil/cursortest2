package H1;

import a.AbstractC0345a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends I1.a {
    public static final Parcelable.Creator<h> CREATOR = new E1.l(4);

    /* renamed from: d, reason: collision with root package name */
    public final int f3269d;

    /* renamed from: e, reason: collision with root package name */
    public List f3270e;

    public h(int i2, List list) {
        this.f3269d = i2;
        this.f3270e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int N3 = AbstractC0345a.N(parcel, 20293);
        AbstractC0345a.P(parcel, 1, 4);
        parcel.writeInt(this.f3269d);
        List list = this.f3270e;
        if (list != null) {
            int N4 = AbstractC0345a.N(parcel, 2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i4 = 0; i4 < size; i4++) {
                Parcelable parcelable = (Parcelable) list.get(i4);
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
            AbstractC0345a.O(parcel, N4);
        }
        AbstractC0345a.O(parcel, N3);
    }
}
