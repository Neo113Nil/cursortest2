package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xe0 implements Parcelable {
    public static final Parcelable.Creator<xe0> CREATOR = new u1(15);
    public int f;
    public int g;
    public int[] h;
    public boolean i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f + ", mGapDir=" + this.g + ", mHasUnwantedGapAfter=" + this.i + ", mGapPerSpan=" + Arrays.toString(this.h) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
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
