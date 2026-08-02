package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aik extends ahz {
    public static final Parcelable.Creator CREATOR = new ag(18);
    public final int a;

    public aik(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public aik(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }
}
