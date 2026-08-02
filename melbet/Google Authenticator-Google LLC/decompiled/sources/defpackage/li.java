package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class li extends abn {
    public static final Parcelable.Creator CREATOR = new lh(0);
    public Parcelable a;

    public li(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? ky.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.abn, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    public li(Parcelable parcelable) {
        super(parcelable);
    }
}
