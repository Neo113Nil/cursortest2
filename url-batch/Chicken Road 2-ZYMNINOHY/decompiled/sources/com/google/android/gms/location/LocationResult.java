package com.google.android.gms.location;

import H.h;
import O3.l;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e2.AbstractC0408a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class LocationResult extends AbstractC0408a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final List f6052a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f6051b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new h(27);

    public LocationResult(List list) {
        this.f6052a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int size = locationResult.f6052a.size();
        List list = this.f6052a;
        if (size != list.size()) {
            return false;
        }
        Iterator it = locationResult.f6052a.iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f6052a.iterator();
        int i4 = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i4 = (i4 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6052a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = l.D(parcel, 20293);
        l.C(parcel, 1, this.f6052a);
        l.F(parcel, D3);
    }
}
