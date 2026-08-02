package l1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: l1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1251H implements Parcelable {
    public static final Parcelable.Creator<C1251H> CREATOR = new H.h(23);

    /* renamed from: a, reason: collision with root package name */
    public int f14179a;

    /* renamed from: b, reason: collision with root package name */
    public int f14180b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f14181c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14182d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f14179a + ", mGapDir=" + this.f14180b + ", mHasUnwantedGapAfter=" + this.f14182d + ", mGapPerSpan=" + Arrays.toString(this.f14181c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f14179a);
        parcel.writeInt(this.f14180b);
        parcel.writeInt(this.f14182d ? 1 : 0);
        int[] iArr = this.f14181c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f14181c);
        }
    }
}
