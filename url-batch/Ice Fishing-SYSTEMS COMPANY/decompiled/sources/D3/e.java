package D3;

import B.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final class e extends V.b {
    public static final Parcelable.Creator<e> CREATOR = new g(1);

    /* renamed from: v, reason: collision with root package name */
    public final int f694v;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f694v = parcel.readInt();
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f694v);
    }

    public e(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f694v = sideSheetBehavior.f36210h;
    }
}
