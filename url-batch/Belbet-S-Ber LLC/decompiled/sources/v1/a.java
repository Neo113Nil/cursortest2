package v1;

import a0.h;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends t0.b {
    public static final Parcelable.Creator<a> CREATOR = new h(8);
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3724j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3725k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3726l;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.f3724j = parcel.readInt() == 1;
        this.f3725k = parcel.readInt() == 1;
        this.f3726l = parcel.readInt() == 1;
    }

    @Override // t0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.f3724j ? 1 : 0);
        parcel.writeInt(this.f3725k ? 1 : 0);
        parcel.writeInt(this.f3726l ? 1 : 0);
    }

    public a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.h = bottomSheetBehavior.P;
        this.i = bottomSheetBehavior.f940f;
        this.f3724j = bottomSheetBehavior.f934b;
        this.f3725k = bottomSheetBehavior.J;
        this.f3726l = bottomSheetBehavior.K;
    }
}
