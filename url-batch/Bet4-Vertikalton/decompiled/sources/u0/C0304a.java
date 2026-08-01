package u0;

import S.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304a extends b {
    public static final Parcelable.Creator<C0304a> CREATOR = new D0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f3813c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3814e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3815f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3816g;

    public C0304a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3813c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3814e = parcel.readInt() == 1;
        this.f3815f = parcel.readInt() == 1;
        this.f3816g = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3813c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3814e ? 1 : 0);
        parcel.writeInt(this.f3815f ? 1 : 0);
        parcel.writeInt(this.f3816g ? 1 : 0);
    }

    public C0304a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3813c = bottomSheetBehavior.f1675L;
        this.d = bottomSheetBehavior.f1697e;
        this.f3814e = bottomSheetBehavior.f1692b;
        this.f3815f = bottomSheetBehavior.f1672I;
        this.f3816g = bottomSheetBehavior.f1673J;
    }
}
