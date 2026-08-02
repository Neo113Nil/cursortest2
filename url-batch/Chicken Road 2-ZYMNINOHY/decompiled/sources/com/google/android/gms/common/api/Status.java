package com.google.android.gms.common.api;

import E.AbstractC0005f;
import H.h;
import O3.l;
import a2.C0162b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d2.C0389g;
import d2.s;
import e2.AbstractC0408a;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends AbstractC0408a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new h(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f5773a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5774b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f5775c;

    /* renamed from: d, reason: collision with root package name */
    public final C0162b f5776d;

    public Status(int i4, String str, PendingIntent pendingIntent, C0162b c0162b) {
        this.f5773a = i4;
        this.f5774b = str;
        this.f5775c = pendingIntent;
        this.f5776d = c0162b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5773a == status.f5773a && s.e(this.f5774b, status.f5774b) && s.e(this.f5775c, status.f5775c) && s.e(this.f5776d, status.f5776d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5773a), this.f5774b, this.f5775c, this.f5776d});
    }

    public final String toString() {
        C0389g c0389g = new C0389g(this);
        String str = this.f5774b;
        if (str == null) {
            int i4 = this.f5773a;
            switch (i4) {
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
                    str = AbstractC0005f.j(i4, "unknown status code: ");
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
                case C0583e9.f11743C /* 19 */:
                    str = "REMOTE_EXCEPTION";
                    break;
                case C0583e9.f11744D /* 20 */:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case Build.API_LEVELS.API_22 /* 22 */:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        c0389g.C(str, "statusCode");
        c0389g.C(this.f5775c, "resolution");
        return c0389g.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = l.D(parcel, 20293);
        l.G(parcel, 1, 4);
        parcel.writeInt(this.f5773a);
        l.A(parcel, 2, this.f5774b);
        l.z(parcel, 3, this.f5775c, i4);
        l.z(parcel, 4, this.f5776d, i4);
        l.F(parcel, D3);
    }
}
