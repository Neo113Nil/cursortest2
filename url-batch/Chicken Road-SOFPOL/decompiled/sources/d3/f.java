package d3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import w0.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends w3.b {
    public static final Parcelable.Creator<f> CREATOR = new o(1);

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f2241f;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f2241f = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f2241f.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // w3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f2241f;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr[i8] = this.f2241f.keyAt(i8);
            parcelableArr[i8] = (Parcelable) this.f2241f.valueAt(i8);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
