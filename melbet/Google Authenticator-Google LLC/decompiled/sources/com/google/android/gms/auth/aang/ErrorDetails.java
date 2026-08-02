package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.aqr;
import defpackage.cri;
import defpackage.oy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ErrorDetails extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aqr(9);
    public final boolean a;
    public final boolean b;

    public ErrorDetails(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int q = oy.q(parcel, 20293);
        oy.s(parcel, 1, z);
        oy.s(parcel, 2, this.b);
        oy.r(parcel, q);
    }
}
