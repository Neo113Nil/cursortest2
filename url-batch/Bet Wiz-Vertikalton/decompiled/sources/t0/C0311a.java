package t0;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311a extends b {
    public static final Parcelable.Creator<C0311a> CREATOR = new C0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f3725c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3726e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3727f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3728g;

    public C0311a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3725c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3726e = parcel.readInt() == 1;
        this.f3727f = parcel.readInt() == 1;
        this.f3728g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3725c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3726e ? 1 : 0);
        parcel.writeInt(this.f3727f ? 1 : 0);
        parcel.writeInt(this.f3728g ? 1 : 0);
    }

    public C0311a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3725c = bottomSheetBehavior.f1650L;
        this.d = bottomSheetBehavior.f1672e;
        this.f3726e = bottomSheetBehavior.f1667b;
        this.f3727f = bottomSheetBehavior.f1647I;
        this.f3728g = bottomSheetBehavior.f1648J;
    }
}
