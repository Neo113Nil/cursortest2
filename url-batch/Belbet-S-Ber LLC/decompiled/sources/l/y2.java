package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class y2 extends t0.b {
    public static final Parcelable.Creator<y2> CREATOR = new a0.h(3);
    public int h;
    public boolean i;

    public y2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readInt();
        this.i = parcel.readInt() != 0;
    }

    @Override // t0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
