package n3;

import B.g;
import V.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4811a extends b {
    public static final Parcelable.Creator<C4811a> CREATOR = new g(7);

    /* renamed from: v, reason: collision with root package name */
    public final int f39641v;

    /* renamed from: w, reason: collision with root package name */
    public final int f39642w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f39643x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f39644y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f39645z;

    public C4811a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f39641v = parcel.readInt();
        this.f39642w = parcel.readInt();
        this.f39643x = parcel.readInt() == 1;
        this.f39644y = parcel.readInt() == 1;
        this.f39645z = parcel.readInt() == 1;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f39641v);
        parcel.writeInt(this.f39642w);
        parcel.writeInt(this.f39643x ? 1 : 0);
        parcel.writeInt(this.f39644y ? 1 : 0);
        parcel.writeInt(this.f39645z ? 1 : 0);
    }

    public C4811a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f39641v = bottomSheetBehavior.f36003L;
        this.f39642w = bottomSheetBehavior.f36025e;
        this.f39643x = bottomSheetBehavior.f36019b;
        this.f39644y = bottomSheetBehavior.f36001I;
        this.f39645z = bottomSheetBehavior.J;
    }
}
