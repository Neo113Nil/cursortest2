package j4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends n4.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f5002f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5003g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f5004h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5005i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f5001j = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new d4.a(3);

    public b(int i7, int i8, PendingIntent pendingIntent, String str) {
        this.f5002f = i7;
        this.f5003g = i8;
        this.f5004h = pendingIntent;
        this.f5005i = str;
    }

    public static String a(int i7) {
        if (i7 == 99) {
            return "UNFINISHED";
        }
        if (i7 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i7) {
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
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case q.c.f7259c /* 9 */:
                return "SERVICE_INVALID";
            case q.c.f7261e /* 10 */:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i7) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case q.c.f7263g /* 15 */:
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
                        return a0.m.g(i7, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5003g == bVar.f5003g && m4.o.f(this.f5004h, bVar.f5004h) && m4.o.f(this.f5005i, bVar.f5005i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5003g), this.f5004h, this.f5005i});
    }

    public final String toString() {
        androidx.room.c cVar = new androidx.room.c(this);
        cVar.l(a(this.f5003g), "statusCode");
        cVar.l(this.f5004h, "resolution");
        cVar.l(this.f5005i, "message");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int R = a8.m.R(parcel, 20293);
        a8.m.T(parcel, 1, 4);
        parcel.writeInt(this.f5002f);
        a8.m.T(parcel, 2, 4);
        parcel.writeInt(this.f5003g);
        a8.m.O(parcel, 3, this.f5004h, i7);
        a8.m.P(parcel, 4, this.f5005i);
        a8.m.S(parcel, R);
    }

    public b(int i7) {
        this(1, i7, null, null);
    }

    public b(int i7, PendingIntent pendingIntent) {
        this(1, i7, pendingIntent, null);
    }
}
