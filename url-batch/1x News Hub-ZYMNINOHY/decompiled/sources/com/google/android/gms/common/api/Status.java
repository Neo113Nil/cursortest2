package com.google.android.gms.common.api;

import E1.AbstractC0033i;
import H.h;
import K0.b;
import N0.r;
import O0.a;
import V0.e;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import io.appmetrica.analytics.impl.C0642l9;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new h(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f2677a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2678b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f2679c;

    /* renamed from: d, reason: collision with root package name */
    public final b f2680d;

    public Status(int i3, String str, PendingIntent pendingIntent, b bVar) {
        this.f2677a = i3;
        this.f2678b = str;
        this.f2679c = pendingIntent;
        this.f2680d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2677a == status.f2677a && r.e(this.f2678b, status.f2678b) && r.e(this.f2679c, status.f2679c) && r.e(this.f2680d, status.f2680d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2677a), this.f2678b, this.f2679c, this.f2680d});
    }

    public final String toString() {
        e eVar = new e(this);
        String str = this.f2678b;
        if (str == null) {
            int i3 = this.f2677a;
            switch (i3) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = AbstractC0033i.h(i3, "unknown status code: ");
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case C0642l9.f7777C /* 19 */:
                    str = "REMOTE_EXCEPTION";
                    break;
                case C0642l9.f7778D /* 20 */:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case C0642l9.f7779E /* 21 */:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        eVar.u(str, "statusCode");
        eVar.u(this.f2679c, "resolution");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.U(parcel, 1, 4);
        parcel.writeInt(this.f2677a);
        C2.b.O(parcel, 2, this.f2678b);
        C2.b.N(parcel, 3, this.f2679c, i3);
        C2.b.N(parcel, 4, this.f2680d, i3);
        C2.b.T(parcel, S2);
    }
}
