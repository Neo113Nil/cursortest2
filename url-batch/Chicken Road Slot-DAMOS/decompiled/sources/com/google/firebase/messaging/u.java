package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u extends d7.a {
    public static final Parcelable.Creator<u> CREATOR = new c7.p(9);

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f3173d;

    public u(Bundle bundle) {
        this.f3173d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.P(parcel, 2, this.f3173d);
        cf.c.a0(parcel, Z);
    }
}
