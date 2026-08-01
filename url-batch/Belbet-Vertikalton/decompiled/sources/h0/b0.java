package h0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new B0.b(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2989a;

    /* renamed from: b, reason: collision with root package name */
    public int f2990b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2991c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2992d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2989a + ", mGapDir=" + this.f2990b + ", mHasUnwantedGapAfter=" + this.f2992d + ", mGapPerSpan=" + Arrays.toString(this.f2991c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2989a);
        parcel.writeInt(this.f2990b);
        parcel.writeInt(this.f2992d ? 1 : 0);
        int[] iArr = this.f2991c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2991c);
        }
    }
}
