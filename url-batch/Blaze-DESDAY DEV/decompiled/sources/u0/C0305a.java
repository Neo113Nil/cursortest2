package u0;

import S.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305a extends b {
    public static final Parcelable.Creator<C0305a> CREATOR = new D0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f3772c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3773e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3774f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3775g;

    public C0305a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3772c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3773e = parcel.readInt() == 1;
        this.f3774f = parcel.readInt() == 1;
        this.f3775g = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3772c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3773e ? 1 : 0);
        parcel.writeInt(this.f3774f ? 1 : 0);
        parcel.writeInt(this.f3775g ? 1 : 0);
    }

    public C0305a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3772c = bottomSheetBehavior.f1706L;
        this.d = bottomSheetBehavior.f1728e;
        this.f3773e = bottomSheetBehavior.f1723b;
        this.f3774f = bottomSheetBehavior.f1703I;
        this.f3775g = bottomSheetBehavior.f1704J;
    }
}
