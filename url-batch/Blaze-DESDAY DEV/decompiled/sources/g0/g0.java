package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new Q.k(11);

    /* renamed from: a, reason: collision with root package name */
    public int f2416a;

    /* renamed from: b, reason: collision with root package name */
    public int f2417b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2418c;
    public boolean d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2416a + ", mGapDir=" + this.f2417b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.f2418c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2416a);
        parcel.writeInt(this.f2417b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] iArr = this.f2418c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2418c);
        }
    }
}
