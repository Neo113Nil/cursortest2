package O0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class e extends T.b {
    public static final Parcelable.Creator<e> CREATOR = new H0.b(1);

    /* renamed from: c, reason: collision with root package name */
    public final int f981c;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f981c = parcel.readInt();
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f981c);
    }

    public e(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f981c = sideSheetBehavior.f2458h;
    }
}
