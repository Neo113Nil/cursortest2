package t0;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314a extends b {
    public static final Parcelable.Creator<C0314a> CREATOR = new C0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f3745c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3746e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3747f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3748g;

    public C0314a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3745c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3746e = parcel.readInt() == 1;
        this.f3747f = parcel.readInt() == 1;
        this.f3748g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3745c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3746e ? 1 : 0);
        parcel.writeInt(this.f3747f ? 1 : 0);
        parcel.writeInt(this.f3748g ? 1 : 0);
    }

    public C0314a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3745c = bottomSheetBehavior.f1613L;
        this.d = bottomSheetBehavior.f1635e;
        this.f3746e = bottomSheetBehavior.f1630b;
        this.f3747f = bottomSheetBehavior.f1610I;
        this.f3748g = bottomSheetBehavior.f1611J;
    }
}
