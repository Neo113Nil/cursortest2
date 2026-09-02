package v1;

import a0.g;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends s0.b {
    public static final Parcelable.Creator<c> CREATOR = new g(10);

    /* renamed from: h, reason: collision with root package name */
    public boolean f3474h;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            c.class.getClassLoader();
        }
        this.f3474h = parcel.readInt() == 1;
    }

    @Override // s0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3474h ? 1 : 0);
    }
}
