package t0;

import android.os.Parcel;
import android.os.Parcelable;
import f3.C4509h;
import java.util.Arrays;

/* renamed from: t0.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5037V implements Parcelable {
    public static final Parcelable.Creator<C5037V> CREATOR = new C4509h(10);

    /* renamed from: n, reason: collision with root package name */
    public int f40644n;

    /* renamed from: u, reason: collision with root package name */
    public int f40645u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f40646v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40647w;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f40644n + ", mGapDir=" + this.f40645u + ", mHasUnwantedGapAfter=" + this.f40647w + ", mGapPerSpan=" + Arrays.toString(this.f40646v) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40644n);
        parcel.writeInt(this.f40645u);
        parcel.writeInt(this.f40647w ? 1 : 0);
        int[] iArr = this.f40646v;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f40646v);
        }
    }
}
