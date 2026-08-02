package U;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new H.h(16);

    /* renamed from: a, reason: collision with root package name */
    public int f1365a;

    /* renamed from: b, reason: collision with root package name */
    public int f1366b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1367c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1368d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1365a + ", mGapDir=" + this.f1366b + ", mHasUnwantedGapAfter=" + this.f1368d + ", mGapPerSpan=" + Arrays.toString(this.f1367c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1365a);
        parcel.writeInt(this.f1366b);
        parcel.writeInt(this.f1368d ? 1 : 0);
        int[] iArr = this.f1367c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1367c);
        }
    }
}
