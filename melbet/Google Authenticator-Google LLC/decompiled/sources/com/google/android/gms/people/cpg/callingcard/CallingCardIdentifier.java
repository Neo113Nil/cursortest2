package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cri;
import defpackage.ctt;
import defpackage.oy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CallingCardIdentifier extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctt(13);
    public final long a;

    public CallingCardIdentifier(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallingCardIdentifier) && this.a == ((CallingCardIdentifier) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int q = oy.q(parcel, 20293);
        oy.w(parcel, 1, j);
        oy.r(parcel, q);
    }
}
