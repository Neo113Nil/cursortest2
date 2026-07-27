package E1;

import A.AbstractC0017m;
import a.AbstractC0345a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.Arrays;
import q.AbstractC1024c;
import y.t;

/* loaded from: classes.dex */
public final class b extends I1.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f2277d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2278e;

    /* renamed from: i, reason: collision with root package name */
    public final PendingIntent f2279i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2280j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f2276k = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new l(0);

    public b(int i2, int i4, PendingIntent pendingIntent, String str) {
        this.f2277d = i2;
        this.f2278e = i4;
        this.f2279i = pendingIntent;
        this.f2280j = str;
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
            case 0:
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
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case AbstractC1024c.f9242c /* 9 */:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case RequestError.STOP_TRACKING /* 11 */:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case AbstractC1024c.f9246g /* 15 */:
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
                        return AbstractC0017m.h(i2, "UNKNOWN_ERROR_CODE(", ")");
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
        return this.f2278e == bVar.f2278e && H1.o.f(this.f2279i, bVar.f2279i) && H1.o.f(this.f2280j, bVar.f2280j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2278e), this.f2279i, this.f2280j});
    }

    public final String toString() {
        t tVar = new t(this);
        tVar.h(a(this.f2278e), "statusCode");
        tVar.h(this.f2279i, "resolution");
        tVar.h(this.f2280j, "message");
        return tVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int N3 = AbstractC0345a.N(parcel, 20293);
        AbstractC0345a.P(parcel, 1, 4);
        parcel.writeInt(this.f2277d);
        AbstractC0345a.P(parcel, 2, 4);
        parcel.writeInt(this.f2278e);
        AbstractC0345a.K(parcel, 3, this.f2279i, i2);
        AbstractC0345a.L(parcel, 4, this.f2280j);
        AbstractC0345a.O(parcel, N3);
    }

    public b(int i2) {
        this(1, i2, null, null);
    }

    public b(int i2, PendingIntent pendingIntent) {
        this(1, i2, pendingIntent, null);
    }
}
