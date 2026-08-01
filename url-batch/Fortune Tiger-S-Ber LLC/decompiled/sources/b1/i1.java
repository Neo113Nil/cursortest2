package b1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i1 implements Parcelable {
    public static final Parcelable.Creator<i1> CREATOR = new androidx.fragment.app.b(7);

    /* renamed from: f, reason: collision with root package name */
    public int f803f;
    public int g;
    public int[] h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f804i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f803f + ", mGapDir=" + this.g + ", mHasUnwantedGapAfter=" + this.f804i + ", mGapPerSpan=" + Arrays.toString(this.h) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f803f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.f804i ? 1 : 0);
        int[] iArr = this.h;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.h);
        }
    }
}
