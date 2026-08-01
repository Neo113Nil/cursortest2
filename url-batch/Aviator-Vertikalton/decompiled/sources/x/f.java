package x;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class f extends R.b {
    public static final Parcelable.Creator<f> CREATOR = new B0.b(8);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f4604c;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f4604c = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f4604c.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f4604c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f4604c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f4604c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
