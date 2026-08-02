package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.cqc;
import defpackage.cri;
import defpackage.oy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TogglingData extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cqc(20);
    String a;
    String b;
    public String c;

    public TogglingData(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.I(parcel, 2, this.a);
        oy.I(parcel, 3, this.b);
        oy.I(parcel, 4, this.c);
        oy.r(parcel, q);
    }

    private TogglingData() {
    }
}
