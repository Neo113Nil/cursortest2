package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t0 implements Parcelable {
    public static final Parcelable.Creator<t0> CREATOR = new e5.a(4);

    /* renamed from: d, reason: collision with root package name */
    public int f8034d;

    /* renamed from: e, reason: collision with root package name */
    public int f8035e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f8036f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8037g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f8034d + ", mGapDir=" + this.f8035e + ", mHasUnwantedGapAfter=" + this.f8037g + ", mGapPerSpan=" + Arrays.toString(this.f8036f) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8034d);
        parcel.writeInt(this.f8035e);
        parcel.writeInt(this.f8037g ? 1 : 0);
        int[] iArr = this.f8036f;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f8036f);
        }
    }
}
