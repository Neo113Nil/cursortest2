package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new F0.b(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2823a;

    /* renamed from: b, reason: collision with root package name */
    public int f2824b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2825c;
    public boolean d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2823a + ", mGapDir=" + this.f2824b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.f2825c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2823a);
        parcel.writeInt(this.f2824b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] iArr = this.f2825c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2825c);
        }
    }
}
