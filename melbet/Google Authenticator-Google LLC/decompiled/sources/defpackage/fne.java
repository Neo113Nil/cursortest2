package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fne extends abn {
    public static final Parcelable.Creator CREATOR = new lh(9);
    String a;
    int b;

    public fne(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }

    @Override // defpackage.abn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }

    public fne(Parcelable parcelable) {
        super(parcelable);
    }
}
