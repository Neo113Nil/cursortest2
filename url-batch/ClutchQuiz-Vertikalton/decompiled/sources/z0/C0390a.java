package z0;

import R.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390a extends b {
    public static final Parcelable.Creator<C0390a> CREATOR = new A0.b(8);

    /* renamed from: c, reason: collision with root package name */
    public final int f4033c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4034e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4035f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4036g;

    public C0390a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4033c = parcel.readInt();
        this.d = parcel.readInt();
        this.f4034e = parcel.readInt() == 1;
        this.f4035f = parcel.readInt() == 1;
        this.f4036g = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4033c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f4034e ? 1 : 0);
        parcel.writeInt(this.f4035f ? 1 : 0);
        parcel.writeInt(this.f4036g ? 1 : 0);
    }

    public C0390a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f4033c = bottomSheetBehavior.f1757L;
        this.d = bottomSheetBehavior.f1779e;
        this.f4034e = bottomSheetBehavior.f1774b;
        this.f4035f = bottomSheetBehavior.f1754I;
        this.f4036g = bottomSheetBehavior.f1755J;
    }
}
