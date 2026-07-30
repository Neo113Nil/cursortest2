package com.google.android.gms.common.api;

import O6.g;
import P0.e;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import q1.b;
import r1.o;
import t1.u;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class Status extends AbstractC0943a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new o(3);

    /* renamed from: d, reason: collision with root package name */
    public final int f4369d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4370e;

    /* renamed from: i, reason: collision with root package name */
    public final PendingIntent f4371i;

    /* renamed from: l, reason: collision with root package name */
    public final b f4372l;

    public Status(int i2, String str, PendingIntent pendingIntent, b bVar) {
        this.f4369d = i2;
        this.f4370e = str;
        this.f4371i = pendingIntent;
        this.f4372l = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4369d == status.f4369d && u.i(this.f4370e, status.f4370e) && u.i(this.f4371i, status.f4371i) && u.i(this.f4372l, status.f4372l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4369d), this.f4370e, this.f4371i, this.f4372l});
    }

    public final String toString() {
        e eVar = new e(this);
        String str = this.f4370e;
        if (str == null) {
            str = g.N(this.f4369d);
        }
        eVar.l(str, "statusCode");
        eVar.l(this.f4371i, "resolution");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(this.f4369d);
        AbstractC1053a.K(parcel, 2, this.f4370e);
        AbstractC1053a.J(parcel, 3, this.f4371i, i2);
        AbstractC1053a.J(parcel, 4, this.f4372l, i2);
        AbstractC1053a.S(parcel, Q);
    }
}
