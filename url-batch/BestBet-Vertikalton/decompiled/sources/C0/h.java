package C0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class h extends S.b {
    public static final Parcelable.Creator<h> CREATOR = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public final int f98c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f99e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f100f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f101g;

    public h(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f98c = parcel.readInt();
        this.d = parcel.readInt();
        this.f99e = parcel.readInt() == 1;
        this.f100f = parcel.readInt() == 1;
        this.f101g = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f98c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f99e ? 1 : 0);
        parcel.writeInt(this.f100f ? 1 : 0);
        parcel.writeInt(this.f101g ? 1 : 0);
    }

    public h(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f98c = bottomSheetBehavior.f2155L;
        this.d = bottomSheetBehavior.f2177e;
        this.f99e = bottomSheetBehavior.f2172b;
        this.f100f = bottomSheetBehavior.f2152I;
        this.f101g = bottomSheetBehavior.f2153J;
    }
}
