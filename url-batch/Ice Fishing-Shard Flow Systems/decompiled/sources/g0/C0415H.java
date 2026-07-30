package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: g0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415H implements Parcelable {
    public static final Parcelable.Creator<C0415H> CREATOR = new I1.c(14);

    /* renamed from: d, reason: collision with root package name */
    public int f4869d;

    /* renamed from: e, reason: collision with root package name */
    public int f4870e;

    /* renamed from: i, reason: collision with root package name */
    public int[] f4871i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4872l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f4869d + ", mGapDir=" + this.f4870e + ", mHasUnwantedGapAfter=" + this.f4872l + ", mGapPerSpan=" + Arrays.toString(this.f4871i) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4869d);
        parcel.writeInt(this.f4870e);
        parcel.writeInt(this.f4872l ? 1 : 0);
        int[] iArr = this.f4871i;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f4871i);
        }
    }
}
