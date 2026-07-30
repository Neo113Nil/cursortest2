package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xq extends POWyO8hTM6YC {
    public final int OPXfSBeufaJ8;
    public final String dgRBjINgWbAK;
    public final int rtx2ld2ELZv4;
    public final PendingIntent wdg6QnbFHrFF;
    public static final xq x50lh2ztY7Y5 = new xq(0);
    public static final Parcelable.Creator<xq> CREATOR = new BUo4iHFctTZi(16);

    public xq(int i, int i2, PendingIntent pendingIntent, String str) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = i2;
        this.wdg6QnbFHrFF = pendingIntent;
        this.dgRBjINgWbAK = str;
    }

    public static String PxuCJdSBwIXG(int i) {
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
                    default:
                        return o0.OPXfSBeufaJ8(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xq)) {
            return false;
        }
        xq xqVar = (xq) obj;
        return this.OPXfSBeufaJ8 == xqVar.OPXfSBeufaJ8 && ni0.BRwzKIf41E4i(this.wdg6QnbFHrFF, xqVar.wdg6QnbFHrFF) && ni0.BRwzKIf41E4i(this.dgRBjINgWbAK, xqVar.dgRBjINgWbAK);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.OPXfSBeufaJ8), this.wdg6QnbFHrFF, this.dgRBjINgWbAK});
    }

    public final String toString() {
        op0 op0Var = new op0(this);
        op0Var.wdg6QnbFHrFF(PxuCJdSBwIXG(this.OPXfSBeufaJ8), "statusCode");
        op0Var.wdg6QnbFHrFF(this.wdg6QnbFHrFF, "resolution");
        op0Var.wdg6QnbFHrFF(this.dgRBjINgWbAK, "message");
        return op0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        ki0.JTxCbbCwomzt(parcel, 1, 4);
        parcel.writeInt(this.rtx2ld2ELZv4);
        ki0.JTxCbbCwomzt(parcel, 2, 4);
        parcel.writeInt(this.OPXfSBeufaJ8);
        ki0.yQRudnv4La6p(parcel, 3, this.wdg6QnbFHrFF, i);
        ki0.KUoIVIumpKat(parcel, 4, this.dgRBjINgWbAK);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }

    public xq(int i) {
        this(1, i, null, null);
    }

    public xq(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
