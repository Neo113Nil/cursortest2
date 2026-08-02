package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fgc extends abn {
    public static final Parcelable.Creator CREATOR = new fgb(0);
    public final int a;
    public final int b;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public fgc(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.e = parcel.readInt() == 1;
        this.f = parcel.readInt() == 1;
        this.g = parcel.readInt() == 1;
    }

    @Override // defpackage.abn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public fgc(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.a = bottomSheetBehavior.x;
        this.b = bottomSheetBehavior.d;
        this.e = bottomSheetBehavior.a;
        this.f = bottomSheetBehavior.u;
        this.g = bottomSheetBehavior.v;
    }
}
