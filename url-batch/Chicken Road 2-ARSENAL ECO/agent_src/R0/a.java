package R0;

import U0.t;
import a.AbstractC0219a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Arrays;
import u0.C0675e;

/* loaded from: classes.dex */
public final class a extends V0.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f2052f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2053g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f2054h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2055i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f2051j = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new I.j(2);

    public a(int i7, int i8, PendingIntent pendingIntent, String str) {
        this.f2052f = i7;
        this.f2053g = i8;
        this.f2054h = pendingIntent;
        this.f2055i = str;
    }

    public static String c(int i7) {
        if (i7 == 99) {
            return "UNFINISHED";
        }
        if (i7 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i7) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "SERVICE_MISSING";
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
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
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i7) {
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
                        return C1.c.g("UNKNOWN_ERROR_CODE(", i7, ")");
                }
        }
    }

    public final boolean a() {
        return (this.f2053g == 0 || this.f2054h == null) ? false : true;
    }

    public final boolean b() {
        return this.f2053g == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2053g == aVar.f2053g && t.i(this.f2054h, aVar.f2054h) && t.i(this.f2055i, aVar.f2055i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2053g), this.f2054h, this.f2055i});
    }

    public final String toString() {
        C0675e c0675e = new C0675e(this);
        c0675e.b(c(this.f2053g), "statusCode");
        c0675e.b(this.f2054h, "resolution");
        c0675e.b(this.f2055i, "message");
        return c0675e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int O6 = AbstractC0219a.O(parcel, 20293);
        AbstractC0219a.R(parcel, 1, 4);
        parcel.writeInt(this.f2052f);
        AbstractC0219a.R(parcel, 2, 4);
        parcel.writeInt(this.f2053g);
        AbstractC0219a.I(parcel, 3, this.f2054h, i7);
        AbstractC0219a.J(parcel, 4, this.f2055i);
        AbstractC0219a.Q(parcel, O6);
    }

    public a(int i7) {
        this(1, i7, null, null);
    }

    public a(int i7, PendingIntent pendingIntent) {
        this(1, i7, pendingIntent, null);
    }
}
