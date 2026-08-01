package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class o60 extends f {
    public static final Parcelable.Creator<o60> CREATOR = new e(9);
    public int f;
    public boolean g;

    public o60(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f = parcel.readInt();
        this.g = parcel.readInt() != 0;
    }

    @Override // defpackage.f, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
