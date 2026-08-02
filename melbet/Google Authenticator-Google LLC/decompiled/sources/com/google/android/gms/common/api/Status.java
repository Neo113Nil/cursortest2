package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ckq;
import defpackage.clg;
import defpackage.cnc;
import defpackage.cri;
import defpackage.ox;
import defpackage.oy;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Status extends cri implements ReflectedParcelable, cnc {
    public final int f;
    public final String g;
    public final PendingIntent h;
    public final clg i;
    public static final Status a = new Status(0, null, null, null);
    public static final Status b = new Status(14, null, null, null);
    public static final Status c = new Status(8, null, null, null);
    public static final Status d = new Status(15, null, null, null);
    public static final Status e = new Status(16, null, null, null);
    public static final Parcelable.Creator CREATOR = new ckq(13);

    public Status(int i, String str, PendingIntent pendingIntent, clg clgVar) {
        this.f = i;
        this.g = str;
        this.h = pendingIntent;
        this.i = clgVar;
    }

    public final String a() {
        String str = this.g;
        return str != null ? str : ox.w(this.f);
    }

    public final boolean c() {
        return this.f <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && Objects.equals(this.g, status.g) && Objects.equals(this.h, status.h) && Objects.equals(this.i, status.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        oy.ax("statusCode", a(), arrayList);
        oy.ax("resolution", this.h, arrayList);
        return oy.aw(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.I(parcel, 2, this.g);
        oy.H(parcel, 3, this.h, i);
        oy.H(parcel, 4, this.i, i);
        oy.r(parcel, q);
    }

    @Deprecated
    public Status(clg clgVar, String str) {
        this(17, str, clgVar.d, clgVar);
    }

    @Override // defpackage.cnc
    public final Status b() {
        return this;
    }
}
