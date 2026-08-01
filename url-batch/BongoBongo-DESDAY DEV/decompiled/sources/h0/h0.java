package h0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new R.k(11);

    /* renamed from: a, reason: collision with root package name */
    public int f2514a;

    /* renamed from: b, reason: collision with root package name */
    public int f2515b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2516c;
    public boolean d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2514a + ", mGapDir=" + this.f2515b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.f2516c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2514a);
        parcel.writeInt(this.f2515b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] iArr = this.f2516c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2516c);
        }
    }
}
