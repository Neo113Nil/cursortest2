package s0;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300a extends b {
    public static final Parcelable.Creator<C0300a> CREATOR = new B0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f3732c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3733e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3734f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3735g;

    public C0300a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3732c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3733e = parcel.readInt() == 1;
        this.f3734f = parcel.readInt() == 1;
        this.f3735g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3732c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3733e ? 1 : 0);
        parcel.writeInt(this.f3734f ? 1 : 0);
        parcel.writeInt(this.f3735g ? 1 : 0);
    }

    public C0300a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3732c = bottomSheetBehavior.f1548L;
        this.d = bottomSheetBehavior.f1570e;
        this.f3733e = bottomSheetBehavior.f1565b;
        this.f3734f = bottomSheetBehavior.f1545I;
        this.f3735g = bottomSheetBehavior.f1546J;
    }
}
