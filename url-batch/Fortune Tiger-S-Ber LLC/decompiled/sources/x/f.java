package x;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f extends p0.b {
    public static final Parcelable.Creator<f> CREATOR = new a2.c(8);
    public SparseArray h;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.h = new SparseArray(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.h.append(iArr[i4], readParcelableArray[i4]);
        }
    }

    @Override // p0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        SparseArray sparseArray = this.h;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = this.h.keyAt(i5);
            parcelableArr[i5] = (Parcelable) this.h.valueAt(i5);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i4);
    }
}
