package L2;

import O2.w;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class b extends P2.a {

    /* renamed from: n, reason: collision with root package name */
    public final int f1711n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1712u;

    /* renamed from: v, reason: collision with root package name */
    public final PendingIntent f1713v;

    /* renamed from: w, reason: collision with root package name */
    public final String f1714w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f1715x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f1710y = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new F0.a(3);

    public b(int i, int i4, PendingIntent pendingIntent, String str, Integer num) {
        this.f1711n = i;
        this.f1712u = i4;
        this.f1713v = pendingIntent;
        this.f1714w = str;
        this.f1715x = num;
    }

    public static String c(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
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
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
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
                        return AbstractC5051n.d(i, "UNKNOWN_ERROR_CODE(", ")", new StringBuilder(String.valueOf(i).length() + 20));
                }
        }
    }

    public final boolean a() {
        return (this.f1712u == 0 || this.f1713v == null) ? false : true;
    }

    public final boolean b() {
        return this.f1712u == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1712u == bVar.f1712u && w.l(this.f1713v, bVar.f1713v) && w.l(this.f1714w, bVar.f1714w) && w.l(this.f1715x, bVar.f1715x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1712u), this.f1713v, this.f1714w, this.f1715x});
    }

    public final String toString() {
        S0.l lVar = new S0.l(this);
        lVar.j(c(this.f1712u), "statusCode");
        lVar.j(this.f1713v, "resolution");
        lVar.j(this.f1714w, "message");
        lVar.j(this.f1715x, "clientMethodKey");
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.A(parcel, 1, 4);
        parcel.writeInt(this.f1711n);
        S0.f.A(parcel, 2, 4);
        parcel.writeInt(this.f1712u);
        S0.f.t(parcel, 3, this.f1713v, i);
        S0.f.u(parcel, 4, this.f1714w);
        Integer num = this.f1715x;
        if (num != null) {
            S0.f.A(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        S0.f.C(parcel, B8);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
