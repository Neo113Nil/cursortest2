package f1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h1 implements Parcelable {
    public static final Parcelable.Creator<h1> CREATOR = new androidx.fragment.app.b(10);

    /* renamed from: f, reason: collision with root package name */
    public int f1366f;

    /* renamed from: g, reason: collision with root package name */
    public int f1367g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f1368h;
    public boolean i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1366f + ", mGapDir=" + this.f1367g + ", mHasUnwantedGapAfter=" + this.i + ", mGapPerSpan=" + Arrays.toString(this.f1368h) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1366f);
        parcel.writeInt(this.f1367g);
        parcel.writeInt(this.i ? 1 : 0);
        int[] iArr = this.f1368h;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1368h);
        }
    }
}
