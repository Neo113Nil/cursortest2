package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class r60 implements Parcelable {
    public static final Parcelable.Creator<r60> CREATOR = new s1(14);
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
