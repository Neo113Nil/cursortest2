package P;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class K implements Parcelable {
    public static final Parcelable.Creator<K> CREATOR = new F.k(2);

    /* renamed from: a, reason: collision with root package name */
    public int f848a;

    /* renamed from: b, reason: collision with root package name */
    public int f849b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f850c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f851d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f848a + ", mGapDir=" + this.f849b + ", mHasUnwantedGapAfter=" + this.f851d + ", mGapPerSpan=" + Arrays.toString(this.f850c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f848a);
        parcel.writeInt(this.f849b);
        parcel.writeInt(this.f851d ? 1 : 0);
        int[] iArr = this.f850c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f850c);
        }
    }
}
