package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b3 extends s0.b {
    public static final Parcelable.Creator<b3> CREATOR = new a0.g(5);

    /* renamed from: h, reason: collision with root package name */
    public int f2250h;
    public boolean i;

    public b3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2250h = parcel.readInt();
        this.i = parcel.readInt() != 0;
    }

    @Override // s0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2250h);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
