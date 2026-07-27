package com.google.android.gms.common.api;

import A.AbstractC0017m;
import E1.b;
import E1.l;
import H1.o;
import I1.a;
import a.AbstractC0345a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i1.i;
import java.util.Arrays;
import q.AbstractC1024c;
import y.t;

/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new l(3);

    /* renamed from: d, reason: collision with root package name */
    public final int f6029d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6030e;

    /* renamed from: i, reason: collision with root package name */
    public final PendingIntent f6031i;

    /* renamed from: j, reason: collision with root package name */
    public final b f6032j;

    public Status(int i2, String str, PendingIntent pendingIntent, b bVar) {
        this.f6029d = i2;
        this.f6030e = str;
        this.f6031i = pendingIntent;
        this.f6032j = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f6029d == status.f6029d && o.f(this.f6030e, status.f6030e) && o.f(this.f6031i, status.f6031i) && o.f(this.f6032j, status.f6032j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6029d), this.f6030e, this.f6031i, this.f6032j});
    }

    public final String toString() {
        t tVar = new t(this);
        String str = this.f6030e;
        if (str == null) {
            int i2 = this.f6029d;
            switch (i2) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case AbstractC1024c.f9242c /* 9 */:
                case RequestError.STOP_TRACKING /* 11 */:
                case 12:
                default:
                    str = AbstractC0017m.g(i2, "unknown status code: ");
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
                case i.BYTES_FIELD_NUMBER /* 8 */:
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
                case AbstractC1024c.f9246g /* 15 */:
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
        tVar.h(str, "statusCode");
        tVar.h(this.f6031i, "resolution");
        return tVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int N3 = AbstractC0345a.N(parcel, 20293);
        AbstractC0345a.P(parcel, 1, 4);
        parcel.writeInt(this.f6029d);
        AbstractC0345a.L(parcel, 2, this.f6030e);
        AbstractC0345a.K(parcel, 3, this.f6031i, i2);
        AbstractC0345a.K(parcel, 4, this.f6032j, i2);
        AbstractC0345a.O(parcel, N3);
    }
}
