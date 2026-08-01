package e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2216a;

    /* renamed from: b, reason: collision with root package name */
    public int f2217b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2218c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2219d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2216a + ", mGapDir=" + this.f2217b + ", mHasUnwantedGapAfter=" + this.f2219d + ", mGapPerSpan=" + Arrays.toString(this.f2218c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2216a);
        parcel.writeInt(this.f2217b);
        parcel.writeInt(this.f2219d ? 1 : 0);
        int[] iArr = this.f2218c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2218c);
        }
    }
}
