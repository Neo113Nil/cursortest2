package m2;

import a0.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d extends s0.b {
    public static final Parcelable.Creator<d> CREATOR = new g(6);

    /* renamed from: h, reason: collision with root package name */
    public final int f2691h;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2691h = parcel.readInt();
    }

    @Override // s0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2691h);
    }

    public d(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f2691h = sideSheetBehavior.f990h;
    }
}
