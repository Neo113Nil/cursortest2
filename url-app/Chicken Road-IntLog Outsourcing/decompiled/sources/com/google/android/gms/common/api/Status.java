package com.google.android.gms.common.api;

import B1.c;
import a.AbstractC0169a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import l1.b;
import m1.l;
import n2.AbstractC1341c;
import o1.u;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class Status extends AbstractC1380a implements l, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4977a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4978b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f4979c;

    /* renamed from: d, reason: collision with root package name */
    public final b f4980d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f4974e = new Status(8, null, null, null);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f4975f = new Status(15, null, null, null);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f4976g = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new c(21);

    public Status(int i2, String str, PendingIntent pendingIntent, b bVar) {
        this.f4977a = i2;
        this.f4978b = str;
        this.f4979c = pendingIntent;
        this.f4980d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4977a == status.f4977a && u.j(this.f4978b, status.f4978b) && u.j(this.f4979c, status.f4979c) && u.j(this.f4980d, status.f4980d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4977a), this.f4978b, this.f4979c, this.f4980d});
    }

    public final String toString() {
        B0.l lVar = new B0.l(this);
        String str = this.f4978b;
        if (str == null) {
            str = AbstractC1341c.q(this.f4977a);
        }
        lVar.c(str, "statusCode");
        lVar.c(this.f4979c, "resolution");
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f4977a);
        AbstractC0169a.O(parcel, 2, this.f4978b);
        AbstractC0169a.N(parcel, 3, this.f4979c, i2);
        AbstractC0169a.N(parcel, 4, this.f4980d, i2);
        AbstractC0169a.S(parcel, R5);
    }
}
