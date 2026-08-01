package v0;

import T.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307a extends b {
    public static final Parcelable.Creator<C0307a> CREATOR = new E0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f3953c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3954e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3955f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3956g;

    public C0307a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3953c = parcel.readInt();
        this.d = parcel.readInt();
        this.f3954e = parcel.readInt() == 1;
        this.f3955f = parcel.readInt() == 1;
        this.f3956g = parcel.readInt() == 1;
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3953c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f3954e ? 1 : 0);
        parcel.writeInt(this.f3955f ? 1 : 0);
        parcel.writeInt(this.f3956g ? 1 : 0);
    }

    public C0307a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3953c = bottomSheetBehavior.f1770L;
        this.d = bottomSheetBehavior.f1792e;
        this.f3954e = bottomSheetBehavior.f1787b;
        this.f3955f = bottomSheetBehavior.f1767I;
        this.f3956g = bottomSheetBehavior.f1768J;
    }
}
