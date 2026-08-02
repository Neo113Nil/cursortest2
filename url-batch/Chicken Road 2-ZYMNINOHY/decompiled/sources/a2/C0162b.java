package a2;

import E.AbstractC0005f;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import d2.C0389g;
import d2.s;
import e2.AbstractC0408a;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.util.Arrays;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162b extends AbstractC0408a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4264a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4265b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f4266c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4267d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0162b f4263e = new C0162b(0);
    public static final Parcelable.Creator<C0162b> CREATOR = new H.h(3);

    public C0162b(int i4, int i5, PendingIntent pendingIntent, String str) {
        this.f4264a = i4;
        this.f4265b = i5;
        this.f4266c = pendingIntent;
        this.f4267d = str;
    }

    public static String a(int i4) {
        if (i4 == 99) {
            return "UNFINISHED";
        }
        if (i4 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i4) {
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
                switch (i4) {
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
                    case C0583e9.f11743C /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case C0583e9.f11744D /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case Build.API_LEVELS.API_22 /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case Build.API_LEVELS.API_23 /* 23 */:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return AbstractC0005f.k(i4, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0162b)) {
            return false;
        }
        C0162b c0162b = (C0162b) obj;
        return this.f4265b == c0162b.f4265b && s.e(this.f4266c, c0162b.f4266c) && s.e(this.f4267d, c0162b.f4267d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4265b), this.f4266c, this.f4267d});
    }

    public final String toString() {
        C0389g c0389g = new C0389g(this);
        c0389g.C(a(this.f4265b), "statusCode");
        c0389g.C(this.f4266c, "resolution");
        c0389g.C(this.f4267d, "message");
        return c0389g.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = O3.l.D(parcel, 20293);
        O3.l.G(parcel, 1, 4);
        parcel.writeInt(this.f4264a);
        O3.l.G(parcel, 2, 4);
        parcel.writeInt(this.f4265b);
        O3.l.z(parcel, 3, this.f4266c, i4);
        O3.l.A(parcel, 4, this.f4267d);
        O3.l.F(parcel, D3);
    }

    public C0162b(int i4) {
        this(1, i4, null, null);
    }

    public C0162b(int i4, PendingIntent pendingIntent) {
        this(1, i4, pendingIntent, null);
    }
}
