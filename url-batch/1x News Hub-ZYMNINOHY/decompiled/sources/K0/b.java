package K0;

import E1.AbstractC0033i;
import N0.r;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.C0642l9;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends O0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f835a;

    /* renamed from: b, reason: collision with root package name */
    public final int f836b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f837c;

    /* renamed from: d, reason: collision with root package name */
    public final String f838d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f834e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new H.h(3);

    public b(int i3, int i4, PendingIntent pendingIntent, String str) {
        this.f835a = i3;
        this.f836b = i4;
        this.f837c = pendingIntent;
        this.f838d = str;
    }

    public static String a(int i3) {
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
                    case C0642l9.f7777C /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case C0642l9.f7778D /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case C0642l9.f7779E /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return AbstractC0033i.i(i3, "UNKNOWN_ERROR_CODE(", ")");
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
        return this.f836b == bVar.f836b && r.e(this.f837c, bVar.f837c) && r.e(this.f838d, bVar.f838d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f836b), this.f837c, this.f838d});
    }

    public final String toString() {
        V0.e eVar = new V0.e(this);
        eVar.u(a(this.f836b), "statusCode");
        eVar.u(this.f837c, "resolution");
        eVar.u(this.f838d, "message");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.U(parcel, 1, 4);
        parcel.writeInt(this.f835a);
        C2.b.U(parcel, 2, 4);
        parcel.writeInt(this.f836b);
        C2.b.N(parcel, 3, this.f837c, i3);
        C2.b.O(parcel, 4, this.f838d);
        C2.b.T(parcel, S2);
    }

    public b(int i3) {
        this(1, i3, null, null);
    }

    public b(int i3, PendingIntent pendingIntent) {
        this(1, i3, pendingIntent, null);
    }
}
