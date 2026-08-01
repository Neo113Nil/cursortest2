package u1;

import a0.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends s0.b {
    public static final Parcelable.Creator<a> CREATOR = new g(9);

    /* renamed from: h, reason: collision with root package name */
    public final int f3348h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3349j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3350k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3351l;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3348h = parcel.readInt();
        this.i = parcel.readInt();
        this.f3349j = parcel.readInt() == 1;
        this.f3350k = parcel.readInt() == 1;
        this.f3351l = parcel.readInt() == 1;
    }

    @Override // s0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3348h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.f3349j ? 1 : 0);
        parcel.writeInt(this.f3350k ? 1 : 0);
        parcel.writeInt(this.f3351l ? 1 : 0);
    }

    public a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f3348h = bottomSheetBehavior.N;
        this.i = bottomSheetBehavior.f825e;
        this.f3349j = bottomSheetBehavior.f821b;
        this.f3350k = bottomSheetBehavior.I;
        this.f3351l = bottomSheetBehavior.J;
    }
}
