package r2;

import a0.h;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import q.j;
import t0.b;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new h(5);
    public final j h;

    public a(Parcelable parcelable) {
        super(parcelable);
        this.h = new j(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.h + "}";
    }

    @Override // t0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        j jVar = this.h;
        int i4 = jVar.h;
        parcel.writeInt(i4);
        String[] strArr = new String[i4];
        Bundle[] bundleArr = new Bundle[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            strArr[i5] = (String) jVar.f(i5);
            bundleArr[i5] = (Bundle) jVar.i(i5);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.h = new j(readInt);
        for (int i = 0; i < readInt; i++) {
            this.h.put(strArr[i], bundleArr[i]);
        }
    }
}
