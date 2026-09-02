package f1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class v0 extends s0.b {
    public static final Parcelable.Creator<v0> CREATOR = new a0.g(3);

    /* renamed from: h, reason: collision with root package name */
    public Parcelable f1514h;

    public v0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1514h = parcel.readParcelable(classLoader == null ? m0.class.getClassLoader() : classLoader);
    }

    @Override // s0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f1514h, 0);
    }
}
