package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fm extends t0 {
    public final int d;
    public final int e;
    public final PendingIntent g;
    public final String h;
    public static final fm i = new fm(0);
    public static final Parcelable.Creator<fm> CREATOR = new g2(20);

    public fm(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.d = i2;
        this.e = i3;
        this.g = pendingIntent;
        this.h = str;
    }

    public static String a(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "UNKNOWN";
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return "DEVELOPER_ERROR";
            case RequestError.STOP_TRACKING /* 11 */:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i2 + ")";
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) obj;
        return this.e == fmVar.e && xa0.m(this.g, fmVar.g) && xa0.m(this.h, fmVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), this.g, this.h});
    }

    public final String toString() {
        yw ywVar = new yw(this);
        ywVar.g(a(this.e), "statusCode");
        ywVar.g(this.g, "resolution");
        ywVar.g(this.h, "message");
        return ywVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int P = y90.P(parcel, 20293);
        y90.R(parcel, 1, 4);
        parcel.writeInt(this.d);
        y90.R(parcel, 2, 4);
        parcel.writeInt(this.e);
        y90.L(parcel, 3, this.g, i2);
        y90.M(parcel, 4, this.h);
        y90.Q(parcel, P);
    }

    public fm(int i2) {
        this(1, i2, null, null);
    }

    public fm(int i2, PendingIntent pendingIntent) {
        this(1, i2, pendingIntent, null);
    }
}
