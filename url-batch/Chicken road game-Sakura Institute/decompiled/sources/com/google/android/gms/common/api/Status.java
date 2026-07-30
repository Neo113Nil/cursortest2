package com.google.android.gms.common.api;

import a0.m;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j3.i;
import j4.b;
import java.util.Arrays;
import m4.o;
import n4.a;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new d4.a(6);

    /* renamed from: f, reason: collision with root package name */
    public final int f1774f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1775g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f1776h;

    /* renamed from: i, reason: collision with root package name */
    public final b f1777i;

    public Status(int i7, String str, PendingIntent pendingIntent, b bVar) {
        this.f1774f = i7;
        this.f1775g = str;
        this.f1776h = pendingIntent;
        this.f1777i = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f1774f == status.f1774f && o.f(this.f1775g, status.f1775g) && o.f(this.f1776h, status.f1776h) && o.f(this.f1777i, status.f1777i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1774f), this.f1775g, this.f1776h, this.f1777i});
    }

    public final String toString() {
        c cVar = new c(this);
        String str = this.f1775g;
        if (str == null) {
            int i7 = this.f1774f;
            switch (i7) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    str = "SUCCESS_CACHE";
                    break;
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    str = "SUCCESS";
                    break;
                case 1:
                case q.c.f7259c /* 9 */:
                case 11:
                case 12:
                default:
                    str = m.i("unknown status code: ", i7);
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
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case q.c.f7261e /* 10 */:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case q.c.f7263g /* 15 */:
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
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        cVar.l(str, "statusCode");
        cVar.l(this.f1776h, "resolution");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int R = a8.m.R(parcel, 20293);
        a8.m.T(parcel, 1, 4);
        parcel.writeInt(this.f1774f);
        a8.m.P(parcel, 2, this.f1775g);
        a8.m.O(parcel, 3, this.f1776h, i7);
        a8.m.O(parcel, 4, this.f1777i, i7);
        a8.m.S(parcel, R);
    }
}
