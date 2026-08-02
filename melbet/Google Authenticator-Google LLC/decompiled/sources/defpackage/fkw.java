package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fkw extends abn {
    public static final Parcelable.Creator CREATOR = new fgb(5);
    public Bundle a;

    public fkw(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readBundle(classLoader);
    }

    @Override // defpackage.abn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.a);
    }

    public fkw(Parcelable parcelable) {
        super(parcelable);
    }
}
