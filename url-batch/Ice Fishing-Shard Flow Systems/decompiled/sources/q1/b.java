package q1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.attribution.RequestError;
import java.util.Arrays;
import t1.u;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class b extends AbstractC0943a {

    /* renamed from: d, reason: collision with root package name */
    public final int f7310d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7311e;

    /* renamed from: i, reason: collision with root package name */
    public final PendingIntent f7312i;

    /* renamed from: l, reason: collision with root package name */
    public final String f7313l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f7314m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f7309n = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new I1.c(21);

    public b(int i2, int i5, PendingIntent pendingIntent, String str, Integer num) {
        this.f7310d = i2;
        this.f7311e = i5;
        this.f7312i = pendingIntent;
        this.f7313l = str;
        this.f7314m = num;
    }

    public static String c(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
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
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
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
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean a() {
        return (this.f7311e == 0 || this.f7312i == null) ? false : true;
    }

    public final boolean b() {
        return this.f7311e == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7311e == bVar.f7311e && u.i(this.f7312i, bVar.f7312i) && u.i(this.f7313l, bVar.f7313l) && u.i(this.f7314m, bVar.f7314m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7311e), this.f7312i, this.f7313l, this.f7314m});
    }

    public final String toString() {
        P0.e eVar = new P0.e(this);
        eVar.l(c(this.f7311e), "statusCode");
        eVar.l(this.f7312i, "resolution");
        eVar.l(this.f7313l, "message");
        eVar.l(this.f7314m, "clientMethodKey");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(this.f7310d);
        AbstractC1053a.P(parcel, 2, 4);
        parcel.writeInt(this.f7311e);
        AbstractC1053a.J(parcel, 3, this.f7312i, i2);
        AbstractC1053a.K(parcel, 4, this.f7313l);
        Integer num = this.f7314m;
        if (num != null) {
            AbstractC1053a.P(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        AbstractC1053a.S(parcel, Q);
    }

    public b(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str, null);
    }
}
