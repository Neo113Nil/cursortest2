package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class v8 extends f {
    public static final Parcelable.Creator<v8> CREATOR = new e(1);
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public v8(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt() == 1;
        this.k = parcel.readInt() == 1;
        this.l = parcel.readInt() == 1;
    }

    @Override // defpackage.f, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
    }

    public v8(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.h = bottomSheetBehavior.P;
        this.i = bottomSheetBehavior.f;
        this.j = bottomSheetBehavior.b;
        this.k = bottomSheetBehavior.J;
        this.l = bottomSheetBehavior.K;
    }
}
