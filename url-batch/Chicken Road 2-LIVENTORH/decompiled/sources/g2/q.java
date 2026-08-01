package g2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class q extends s0.b {
    public static final Parcelable.Creator<q> CREATOR = new a0.g(4);

    /* renamed from: h, reason: collision with root package name */
    public Bundle f1787h;

    public q(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1787h = parcel.readBundle(classLoader == null ? q.class.getClassLoader() : classLoader);
    }

    @Override // s0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f1787h);
    }
}
