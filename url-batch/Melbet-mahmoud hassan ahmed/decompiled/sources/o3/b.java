package o3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c4.w0;
import r3.n;

/* loaded from: classes.dex */
public final class b extends s3.a {

    /* renamed from: f, reason: collision with root package name */
    final int f19843f;

    /* renamed from: g, reason: collision with root package name */
    private final int f19844g;

    /* renamed from: h, reason: collision with root package name */
    private final PendingIntent f19845h;

    /* renamed from: i, reason: collision with root package name */
    private final String f19846i;

    /* renamed from: j, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f19842j = new b(0);

    @RecentlyNonNull
    public static final Parcelable.Creator<b> CREATOR = new p();

    public b(int i7) {
        this(i7, null, null);
    }

    b(int i7, int i8, PendingIntent pendingIntent, String str) {
        this.f19843f = i7;
        this.f19844g = i8;
        this.f19845h = pendingIntent;
        this.f19846i = str;
    }

    public b(int i7, PendingIntent pendingIntent) {
        this(i7, pendingIntent, null);
    }

    public b(int i7, PendingIntent pendingIntent, String str) {
        this(1, i7, pendingIntent, str);
    }

    static String k(int i7) {
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
            case w0.f2149o /* 7 */:
                return "NETWORK_ERROR";
            case w0.f2150p /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
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
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i7);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public int c() {
        return this.f19844g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19844g == bVar.f19844g && r3.n.a(this.f19845h, bVar.f19845h) && r3.n.a(this.f19846i, bVar.f19846i);
    }

    @RecentlyNullable
    public String g() {
        return this.f19846i;
    }

    @RecentlyNullable
    public PendingIntent h() {
        return this.f19845h;
    }

    public int hashCode() {
        return r3.n.b(Integer.valueOf(this.f19844g), this.f19845h, this.f19846i);
    }

    public boolean i() {
        return (this.f19844g == 0 || this.f19845h == null) ? false : true;
    }

    public boolean j() {
        return this.f19844g == 0;
    }

    @RecentlyNonNull
    public String toString() {
        n.a c7 = r3.n.c(this);
        c7.a("statusCode", k(this.f19844g));
        c7.a("resolution", this.f19845h);
        c7.a("message", this.f19846i);
        return c7.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f19843f);
        s3.c.h(parcel, 2, c());
        s3.c.l(parcel, 3, h(), i7, false);
        s3.c.m(parcel, 4, g(), false);
        s3.c.b(parcel, a7);
    }
}
