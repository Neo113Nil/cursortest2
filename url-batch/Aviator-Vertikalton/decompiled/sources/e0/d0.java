package e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2212a;

    /* renamed from: b, reason: collision with root package name */
    public int f2213b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2214c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2215d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2212a + ", mGapDir=" + this.f2213b + ", mHasUnwantedGapAfter=" + this.f2215d + ", mGapPerSpan=" + Arrays.toString(this.f2214c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2212a);
        parcel.writeInt(this.f2213b);
        parcel.writeInt(this.f2215d ? 1 : 0);
        int[] iArr = this.f2214c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2214c);
        }
    }
}
