package z;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323f extends T.b {
    public static final Parcelable.Creator<C0323f> CREATOR = new F0.b(8);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f4317c;

    public C0323f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f4317c = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f4317c.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f4317c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f4317c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f4317c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
