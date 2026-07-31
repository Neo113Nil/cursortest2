package N;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new C.k(2);

    /* renamed from: e, reason: collision with root package name */
    public int f671e;

    /* renamed from: f, reason: collision with root package name */
    public int f672f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f673g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f674h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f671e + ", mGapDir=" + this.f672f + ", mHasUnwantedGapAfter=" + this.f674h + ", mGapPerSpan=" + Arrays.toString(this.f673g) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f671e);
        parcel.writeInt(this.f672f);
        parcel.writeInt(this.f674h ? 1 : 0);
        int[] iArr = this.f673g;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f673g);
        }
    }
}
