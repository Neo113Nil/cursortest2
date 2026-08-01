package z6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c7.c0;
import com.appsflyer.attribution.RequestError;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends d7.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f10866d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10867e;

    /* renamed from: i, reason: collision with root package name */
    public final PendingIntent f10868i;

    /* renamed from: r, reason: collision with root package name */
    public final String f10869r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f10870s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f10865t = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new y6.m(1);

    public b(int i3, int i10, PendingIntent pendingIntent, String str, Integer num) {
        this.f10866d = i3;
        this.f10867e = i10;
        this.f10868i = pendingIntent;
        this.f10869r = str;
        this.f10870s = num;
    }

    public static String e(int i3) {
        if (i3 == 99) {
            return "UNFINISHED";
        }
        if (i3 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i3) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return "SERVICE_DISABLED";
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return "SIGN_IN_REQUIRED";
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case RequestError.STOP_TRACKING /* 11 */:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i3) {
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
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i3);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public final boolean b() {
        return (this.f10867e == 0 || this.f10868i == null) ? false : true;
    }

    public final boolean c() {
        return this.f10867e == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10867e == bVar.f10867e && c0.k(this.f10868i, bVar.f10868i) && c0.k(this.f10869r, bVar.f10869r) && c0.k(this.f10870s, bVar.f10870s);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10867e), this.f10868i, this.f10869r, this.f10870s});
    }

    public final String toString() {
        c6.e eVar = new c6.e(this);
        eVar.e(e(this.f10867e), "statusCode");
        eVar.e(this.f10868i, "resolution");
        eVar.e(this.f10869r, "message");
        eVar.e(this.f10870s, "clientMethodKey");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.Y(parcel, 1, 4);
        parcel.writeInt(this.f10866d);
        cf.c.Y(parcel, 2, 4);
        parcel.writeInt(this.f10867e);
        cf.c.U(parcel, 3, this.f10868i, i3);
        cf.c.V(parcel, 4, this.f10869r);
        Integer num = this.f10870s;
        if (num != null) {
            cf.c.Y(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        cf.c.a0(parcel, Z);
    }

    public b(int i3, PendingIntent pendingIntent, String str) {
        this(1, i3, pendingIntent, str, null);
    }
}
