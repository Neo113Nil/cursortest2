package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpq extends abn {
    public static final Parcelable.Creator CREATOR = new fgb(6);
    public final qy a;

    public fpq(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.a = new qy(readInt);
        for (int i = 0; i < readInt; i++) {
            this.a.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.a.toString() + "}";
    }

    @Override // defpackage.abn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        qy qyVar = this.a;
        int i2 = qyVar.d;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) qyVar.c(i3);
            bundleArr[i3] = (Bundle) qyVar.f(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public fpq(Parcelable parcelable) {
        super(parcelable);
        this.a = new qy(0);
    }
}
