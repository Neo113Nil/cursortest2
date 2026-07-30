package com.google.android.gms.common.api;

import L2.b;
import O2.w;
import P2.a;
import S0.f;
import S0.l;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.h;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new F0.a(6);

    /* renamed from: n, reason: collision with root package name */
    public final int f23768n;

    /* renamed from: u, reason: collision with root package name */
    public final String f23769u;

    /* renamed from: v, reason: collision with root package name */
    public final PendingIntent f23770v;

    /* renamed from: w, reason: collision with root package name */
    public final b f23771w;

    public Status(int i, String str, PendingIntent pendingIntent, b bVar) {
        this.f23768n = i;
        this.f23769u = str;
        this.f23770v = pendingIntent;
        this.f23771w = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f23768n == status.f23768n && w.l(this.f23769u, status.f23769u) && w.l(this.f23770v, status.f23770v) && w.l(this.f23771w, status.f23771w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23768n), this.f23769u, this.f23770v, this.f23771w});
    }

    public final String toString() {
        l lVar = new l(this);
        String str = this.f23769u;
        if (str == null) {
            str = h.n(this.f23768n);
        }
        lVar.j(str, "statusCode");
        lVar.j(this.f23770v, "resolution");
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = f.B(parcel, 20293);
        f.A(parcel, 1, 4);
        parcel.writeInt(this.f23768n);
        f.u(parcel, 2, this.f23769u);
        f.t(parcel, 3, this.f23770v, i);
        f.t(parcel, 4, this.f23771w, i);
        f.C(parcel, B8);
    }
}
