package x5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import w0.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends w3.b {
    public static final Parcelable.Creator<c> CREATOR = new o(8);

    /* renamed from: f, reason: collision with root package name */
    public final int f8661f;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8661f = parcel.readInt();
    }

    @Override // w3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8661f);
    }

    public c(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f8661f = sideSheetBehavior.f1943h;
    }
}
