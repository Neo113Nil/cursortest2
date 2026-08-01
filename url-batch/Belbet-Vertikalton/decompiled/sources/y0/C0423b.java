package y0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423b extends T.b {
    public static final Parcelable.Creator<C0423b> CREATOR = new H0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f4713c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4714d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4715f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4716g;

    public C0423b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4713c = parcel.readInt();
        this.f4714d = parcel.readInt();
        this.e = parcel.readInt() == 1;
        this.f4715f = parcel.readInt() == 1;
        this.f4716g = parcel.readInt() == 1;
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4713c);
        parcel.writeInt(this.f4714d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f4715f ? 1 : 0);
        parcel.writeInt(this.f4716g ? 1 : 0);
    }

    public C0423b(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f4713c = bottomSheetBehavior.f2267L;
        this.f4714d = bottomSheetBehavior.e;
        this.e = bottomSheetBehavior.f2284b;
        this.f4715f = bottomSheetBehavior.f2264I;
        this.f4716g = bottomSheetBehavior.f2265J;
    }
}
