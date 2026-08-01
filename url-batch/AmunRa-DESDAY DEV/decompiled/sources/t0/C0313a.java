package t0;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313a extends b {
    public static final Parcelable.Creator<C0313a> CREATOR = new C0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f3870c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3871e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3872f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3873g;

    public C0313a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3870c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3871e = parcel.readInt() == 1;
        this.f3872f = parcel.readInt() == 1;
        this.f3873g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3870c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3871e ? 1 : 0);
        parcel.writeInt(this.f3872f ? 1 : 0);
        parcel.writeInt(this.f3873g ? 1 : 0);
    }

    public C0313a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3870c = bottomSheetBehavior.f1583L;
        this.d = bottomSheetBehavior.f1605e;
        this.f3871e = bottomSheetBehavior.f1600b;
        this.f3872f = bottomSheetBehavior.f1580I;
        this.f3873g = bottomSheetBehavior.f1581J;
    }
}
