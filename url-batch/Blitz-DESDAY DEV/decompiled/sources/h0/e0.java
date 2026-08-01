package h0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new S.k(11);

    /* renamed from: a, reason: collision with root package name */
    public int f2478a;

    /* renamed from: b, reason: collision with root package name */
    public int f2479b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2480c;
    public boolean d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2478a + ", mGapDir=" + this.f2479b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.f2480c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2478a);
        parcel.writeInt(this.f2479b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] iArr = this.f2480c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2480c);
        }
    }
}
