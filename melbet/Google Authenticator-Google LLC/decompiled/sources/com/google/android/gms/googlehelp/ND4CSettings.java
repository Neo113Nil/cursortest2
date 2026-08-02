package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cqc;
import defpackage.cri;
import defpackage.oy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ND4CSettings extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cqc(17);
    boolean a;
    String b;

    public ND4CSettings(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.s(parcel, 2, this.a);
        oy.I(parcel, 3, this.b);
        oy.r(parcel, q);
    }

    public ND4CSettings() {
        this(true, "");
    }
}
