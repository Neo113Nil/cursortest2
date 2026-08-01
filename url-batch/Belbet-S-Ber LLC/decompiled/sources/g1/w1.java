package g1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class w1 implements Parcelable {
    public static final Parcelable.Creator<w1> CREATOR = new androidx.fragment.app.b(11);

    /* renamed from: f, reason: collision with root package name */
    public int f1818f;

    /* renamed from: g, reason: collision with root package name */
    public int f1819g;
    public int[] h;
    public boolean i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1818f + ", mGapDir=" + this.f1819g + ", mHasUnwantedGapAfter=" + this.i + ", mGapPerSpan=" + Arrays.toString(this.h) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1818f);
        parcel.writeInt(this.f1819g);
        parcel.writeInt(this.i ? 1 : 0);
        int[] iArr = this.h;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.h);
        }
    }
}
