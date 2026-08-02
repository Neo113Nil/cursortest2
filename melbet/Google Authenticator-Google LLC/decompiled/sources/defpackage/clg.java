package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clg extends cri {
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    public final Integer f;
    public static final clg a = new clg(1, 0, null, null, null);
    public static final Parcelable.Creator CREATOR = new ckq(5);

    public clg(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
        this.f = num;
    }

    public static String a(int i) {
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
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        return "CANCELED";
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
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
                    case 26:
                        return "FEATURE_MISSING_OR_NEEDS_UPDATE";
                    default:
                        return a.ai(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean b() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean c() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof clg)) {
            return false;
        }
        clg clgVar = (clg) obj;
        return this.c == clgVar.c && Objects.equals(this.d, clgVar.d) && Objects.equals(this.e, clgVar.e) && Objects.equals(this.f, clgVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e, this.f});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        oy.ax("statusCode", a(this.c), arrayList);
        oy.ax("resolution", this.d, arrayList);
        oy.ax("message", this.e, arrayList);
        oy.ax("clientMethodKey", this.f, arrayList);
        return oy.aw(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, this.b);
        oy.v(parcel, 2, this.c);
        oy.H(parcel, 3, this.d, i);
        oy.I(parcel, 4, this.e);
        oy.E(parcel, 5, this.f);
        oy.r(parcel, q);
    }
}
