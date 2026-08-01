package s0;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327a extends b {
    public static final Parcelable.Creator<C0327a> CREATOR = new B0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f4145c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4146d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4147e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4148f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4149g;

    public C0327a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4145c = parcel.readInt();
        this.f4146d = parcel.readInt();
        this.f4147e = parcel.readInt() == 1;
        this.f4148f = parcel.readInt() == 1;
        this.f4149g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4145c);
        parcel.writeInt(this.f4146d);
        parcel.writeInt(this.f4147e ? 1 : 0);
        parcel.writeInt(this.f4148f ? 1 : 0);
        parcel.writeInt(this.f4149g ? 1 : 0);
    }

    public C0327a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f4145c = bottomSheetBehavior.f1764L;
        this.f4146d = bottomSheetBehavior.f1787e;
        this.f4147e = bottomSheetBehavior.f1781b;
        this.f4148f = bottomSheetBehavior.f1761I;
        this.f4149g = bottomSheetBehavior.f1762J;
    }
}
