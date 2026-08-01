package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class h9 extends f {
    public static final Parcelable.Creator<h9> CREATOR = new e(1);
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public h9(Parcel parcel, ClassLoader classLoader) {
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

    public h9(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.h = bottomSheetBehavior.P;
        this.i = bottomSheetBehavior.f;
        this.j = bottomSheetBehavior.b;
        this.k = bottomSheetBehavior.J;
        this.l = bottomSheetBehavior.K;
    }
}
