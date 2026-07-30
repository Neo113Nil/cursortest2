package L;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new A.l(2);

    /* renamed from: a, reason: collision with root package name */
    public int f488a;

    /* renamed from: b, reason: collision with root package name */
    public int f489b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f490c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f491d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f488a + ", mGapDir=" + this.f489b + ", mHasUnwantedGapAfter=" + this.f491d + ", mGapPerSpan=" + Arrays.toString(this.f490c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f488a);
        parcel.writeInt(this.f489b);
        parcel.writeInt(this.f491d ? 1 : 0);
        int[] iArr = this.f490c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f490c);
        }
    }
}
