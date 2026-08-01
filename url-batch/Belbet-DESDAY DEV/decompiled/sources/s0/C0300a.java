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
    public final int f3754c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3755e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3756f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3757g;

    public C0300a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3754c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3755e = parcel.readInt() == 1;
        this.f3756f = parcel.readInt() == 1;
        this.f3757g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3754c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3755e ? 1 : 0);
        parcel.writeInt(this.f3756f ? 1 : 0);
        parcel.writeInt(this.f3757g ? 1 : 0);
    }

    public C0300a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3754c = bottomSheetBehavior.f1551L;
        this.d = bottomSheetBehavior.f1573e;
        this.f3755e = bottomSheetBehavior.f1568b;
        this.f3756f = bottomSheetBehavior.f1548I;
        this.f3757g = bottomSheetBehavior.f1549J;
    }
}
