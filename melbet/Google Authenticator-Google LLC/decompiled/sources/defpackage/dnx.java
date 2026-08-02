package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnx extends abn {
    public static final Parcelable.Creator CREATOR = new lh(7);
    public boolean a;

    public dnx(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readByte() != 0;
    }

    @Override // defpackage.abn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public dnx(Parcelable parcelable) {
        super(parcelable);
    }
}
