package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hy2 extends s {
    public static final Parcelable.Creator<hy2> CREATOR = new kz1(2);
    public int o;
    public boolean p;

    public hy2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.o = parcel.readInt();
        this.p = parcel.readInt() != 0;
    }

    @Override // defpackage.s, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }
}
