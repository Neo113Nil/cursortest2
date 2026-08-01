package I0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class d extends R.b {
    public static final Parcelable.Creator<d> CREATOR = new B0.b(1);

    /* renamed from: c, reason: collision with root package name */
    public final int f373c;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f373c = parcel.readInt();
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f373c);
    }

    public d(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f373c = sideSheetBehavior.h;
    }
}
