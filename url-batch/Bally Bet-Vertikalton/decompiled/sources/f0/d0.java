package f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new Q.k(11);

    /* renamed from: a, reason: collision with root package name */
    public int f2051a;

    /* renamed from: b, reason: collision with root package name */
    public int f2052b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2053c;
    public boolean d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2051a + ", mGapDir=" + this.f2052b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.f2053c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2051a);
        parcel.writeInt(this.f2052b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] iArr = this.f2053c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2053c);
        }
    }
}
