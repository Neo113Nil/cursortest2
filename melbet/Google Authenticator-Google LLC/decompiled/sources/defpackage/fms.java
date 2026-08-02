package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fms extends abn {
    public static final Parcelable.Creator CREATOR = new lh(8);
    String a;

    public fms(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readString();
    }

    @Override // defpackage.abn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public fms(Parcelable parcelable) {
        super(parcelable);
    }
}
