package a0;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h extends s0.b {
    public static final Parcelable.Creator<h> CREATOR = new g(0);

    /* renamed from: h, reason: collision with root package name */
    public SparseArray f98h;

    public h(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f98h = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f98h.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // s0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f98h;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = this.f98h.keyAt(i4);
            parcelableArr[i4] = (Parcelable) this.f98h.valueAt(i4);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
