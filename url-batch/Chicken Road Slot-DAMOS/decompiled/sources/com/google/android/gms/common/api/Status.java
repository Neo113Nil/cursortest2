package com.google.android.gms.common.api;

import a7.o;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c6.e;
import c6.f;
import c7.c0;
import cf.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d7.a;
import java.util.Arrays;
import z6.b;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new o(3);

    /* renamed from: d, reason: collision with root package name */
    public final int f2119d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2120e;

    /* renamed from: i, reason: collision with root package name */
    public final PendingIntent f2121i;

    /* renamed from: r, reason: collision with root package name */
    public final b f2122r;

    public Status(int i3, String str, PendingIntent pendingIntent, b bVar) {
        this.f2119d = i3;
        this.f2120e = str;
        this.f2121i = pendingIntent;
        this.f2122r = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2119d == status.f2119d && c0.k(this.f2120e, status.f2120e) && c0.k(this.f2121i, status.f2121i) && c0.k(this.f2122r, status.f2122r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2119d), this.f2120e, this.f2121i, this.f2122r});
    }

    public final String toString() {
        e eVar = new e(this);
        String str = this.f2120e;
        if (str == null) {
            str = f.I(this.f2119d);
        }
        eVar.e(str, "statusCode");
        eVar.e(this.f2121i, "resolution");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = c.Z(parcel, 20293);
        c.Y(parcel, 1, 4);
        parcel.writeInt(this.f2119d);
        c.V(parcel, 2, this.f2120e);
        c.U(parcel, 3, this.f2121i, i3);
        c.U(parcel, 4, this.f2122r, i3);
        c.a0(parcel, Z);
    }
}
