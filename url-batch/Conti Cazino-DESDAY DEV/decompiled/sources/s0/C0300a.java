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
    public final int f3753c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3754e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3755f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3756g;

    public C0300a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3753c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3754e = parcel.readInt() == 1;
        this.f3755f = parcel.readInt() == 1;
        this.f3756g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3753c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3754e ? 1 : 0);
        parcel.writeInt(this.f3755f ? 1 : 0);
        parcel.writeInt(this.f3756g ? 1 : 0);
    }

    public C0300a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3753c = bottomSheetBehavior.f1550L;
        this.d = bottomSheetBehavior.f1572e;
        this.f3754e = bottomSheetBehavior.f1567b;
        this.f3755f = bottomSheetBehavior.f1547I;
        this.f3756g = bottomSheetBehavior.f1548J;
    }
}
