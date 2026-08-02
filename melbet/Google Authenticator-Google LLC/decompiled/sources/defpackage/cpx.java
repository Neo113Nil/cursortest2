package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpx extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(1);
    public final SparseArray a;

    public cpx(SparseArray sparseArray) {
        this.a = sparseArray != null ? sparseArray.clone() : new SparseArray(0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SparseArray sparseArray = this.a;
        int q = oy.q(parcel, 20293);
        SparseArray clone = sparseArray.clone();
        if (clone != null) {
            int q2 = oy.q(parcel, 1);
            int size = clone.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(clone.keyAt(i2));
                Parcelable parcelable = (Parcelable) clone.valueAt(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    oy.x(parcel, parcelable, 0);
                }
            }
            oy.r(parcel, q2);
        }
        oy.r(parcel, q);
    }
}
