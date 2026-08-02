package com.google.android.gms.googlehelp.trails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cri;
import defpackage.ctk;
import defpackage.oy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TrailsInteraction extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctk(1);
    public final String a;
    public final long b;
    public final String c;

    public TrailsInteraction(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 1, this.a);
        oy.w(parcel, 2, this.b);
        oy.I(parcel, 3, this.c);
        oy.r(parcel, q);
    }
}
