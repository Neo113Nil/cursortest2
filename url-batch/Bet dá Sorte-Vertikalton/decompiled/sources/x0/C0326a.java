package x0;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326a extends b {
    public static final Parcelable.Creator<C0326a> CREATOR = new G0.b(7);

    /* renamed from: c, reason: collision with root package name */
    public final int f4200c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4201e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4202f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4203g;

    public C0326a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4200c = parcel.readInt();
        this.d = parcel.readInt();
        this.f4201e = parcel.readInt() == 1;
        this.f4202f = parcel.readInt() == 1;
        this.f4203g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4200c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f4201e ? 1 : 0);
        parcel.writeInt(this.f4202f ? 1 : 0);
        parcel.writeInt(this.f4203g ? 1 : 0);
    }

    public C0326a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f4200c = bottomSheetBehavior.f1679L;
        this.d = bottomSheetBehavior.f1701e;
        this.f4201e = bottomSheetBehavior.f1696b;
        this.f4202f = bottomSheetBehavior.f1676I;
        this.f4203g = bottomSheetBehavior.f1677J;
    }
}
