package s7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t extends d7.a implements Iterable {
    public static final Parcelable.Creator<t> CREATOR = new c7.p(15);

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f9010d;

    public t(Bundle bundle) {
        this.f9010d = bundle;
    }

    public final Object b(String str) {
        return this.f9010d.get(str);
    }

    public final Double c() {
        return Double.valueOf(this.f9010d.getDouble("value"));
    }

    public final String e() {
        return this.f9010d.getString("currency");
    }

    public final Bundle f() {
        return new Bundle(this.f9010d);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
    }

    public final String toString() {
        return this.f9010d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.P(parcel, 2, f());
        cf.c.a0(parcel, Z);
    }
}
