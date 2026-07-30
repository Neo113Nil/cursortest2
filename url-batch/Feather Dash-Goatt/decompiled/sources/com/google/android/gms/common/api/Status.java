package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.fm;
import defpackage.g2;
import defpackage.qy0;
import defpackage.ry0;
import defpackage.t0;
import defpackage.xa0;
import defpackage.y90;
import defpackage.yw;
import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class Status extends t0 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new g2(21);
    public final int d;
    public final String e;
    public final PendingIntent g;
    public final fm h;

    public Status(int i, String str, PendingIntent pendingIntent, fm fmVar) {
        this.d = i;
        this.e = str;
        this.g = pendingIntent;
        this.h = fmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.d == status.d && xa0.m(this.e, status.e) && xa0.m(this.g, status.g) && xa0.m(this.h, status.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), this.e, this.g, this.h});
    }

    public final String toString() {
        yw ywVar = new yw(this);
        String str = this.e;
        if (str == null) {
            int i = this.d;
            switch (i) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    str = "SUCCESS_CACHE";
                    break;
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case RequestError.STOP_TRACKING /* 11 */:
                case 12:
                default:
                    str = qy0.i(i, "unknown status code: ");
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
                case ry0.STRING_FIELD_NUMBER /* 5 */:
                    str = "INVALID_ACCOUNT";
                    break;
                case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "NETWORK_ERROR";
                    break;
                case ry0.BYTES_FIELD_NUMBER /* 8 */:
                    str = "INTERNAL_ERROR";
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
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
        ywVar.g(str, "statusCode");
        ywVar.g(this.g, "resolution");
        return ywVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int P = y90.P(parcel, 20293);
        y90.R(parcel, 1, 4);
        parcel.writeInt(this.d);
        y90.M(parcel, 2, this.e);
        y90.L(parcel, 3, this.g, i);
        y90.L(parcel, 4, this.h, i);
        y90.Q(parcel, P);
    }
}
