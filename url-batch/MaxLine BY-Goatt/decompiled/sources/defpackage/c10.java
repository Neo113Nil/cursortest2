package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c10 extends i1 {
    public final int m;
    public final int n;
    public final PendingIntent o;
    public final String p;
    public static final c10 q = new c10(0);
    public static final Parcelable.Creator<c10> CREATOR = new va3(10);

    public c10(int i, int i2, PendingIntent pendingIntent, String str) {
        this.m = i;
        this.n = i2;
        this.o = pendingIntent;
        this.p = str;
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
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
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
                    case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                        return "CANCELED";
                    case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                        return "API_UNAVAILABLE";
                    case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
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
                    case Constants.MAX_TREE_DEPTH /* 25 */:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return in1.l(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c10)) {
            return false;
        }
        c10 c10Var = (c10) obj;
        return this.n == c10Var.n && ll3.C(this.o, c10Var.o) && ll3.C(this.p, c10Var.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.n), this.o, this.p});
    }

    public final String toString() {
        tt1 tt1Var = new tt1(this);
        tt1Var.k(a(this.n), "statusCode");
        tt1Var.k(this.o, "resolution");
        tt1Var.k(this.p, "message");
        return tt1Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m);
        yk3.d0(parcel, 2, 4);
        parcel.writeInt(this.n);
        yk3.V(parcel, 3, this.o, i);
        yk3.W(parcel, 4, this.p);
        yk3.c0(parcel, b0);
    }

    public c10(int i) {
        this(1, i, null, null);
    }

    public c10(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
