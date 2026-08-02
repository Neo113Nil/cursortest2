package com.google.android.gms.location;

import C2.b;
import H.h;
import O0.a;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final List f2981a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f2980b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new h(21);

    public LocationResult(List list) {
        this.f2981a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int size = locationResult.f2981a.size();
        List list = this.f2981a;
        if (size != list.size()) {
            return false;
        }
        Iterator it = locationResult.f2981a.iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f2981a.iterator();
        int i3 = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i3 = (i3 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2981a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = b.S(parcel, 20293);
        b.Q(parcel, 1, this.f2981a);
        b.T(parcel, S2);
    }
}
