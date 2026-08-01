package s0;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329a extends b {
    public static final Parcelable.Creator<C0329a> CREATOR = new B0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f4149c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4150d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4151e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4152f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4153g;

    public C0329a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4149c = parcel.readInt();
        this.f4150d = parcel.readInt();
        this.f4151e = parcel.readInt() == 1;
        this.f4152f = parcel.readInt() == 1;
        this.f4153g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4149c);
        parcel.writeInt(this.f4150d);
        parcel.writeInt(this.f4151e ? 1 : 0);
        parcel.writeInt(this.f4152f ? 1 : 0);
        parcel.writeInt(this.f4153g ? 1 : 0);
    }

    public C0329a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f4149c = bottomSheetBehavior.f1742L;
        this.f4150d = bottomSheetBehavior.f1765e;
        this.f4151e = bottomSheetBehavior.f1759b;
        this.f4152f = bottomSheetBehavior.f1739I;
        this.f4153g = bottomSheetBehavior.f1740J;
    }
}
