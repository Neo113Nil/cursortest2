package S0;

import C0.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class c extends S.b {
    public static final Parcelable.Creator<c> CREATOR = new g(4);

    /* renamed from: c, reason: collision with root package name */
    public final int f991c;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f991c = parcel.readInt();
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f991c);
    }

    public c(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f991c = sideSheetBehavior.h;
    }
}
