package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.BUo4iHFctTZi;
import defpackage.POWyO8hTM6YC;
import defpackage.ki0;
import defpackage.ni0;
import defpackage.o0;
import defpackage.op0;
import defpackage.xq;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class Status extends POWyO8hTM6YC implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new BUo4iHFctTZi(17);
    public final String OPXfSBeufaJ8;
    public final xq dgRBjINgWbAK;
    public final int rtx2ld2ELZv4;
    public final PendingIntent wdg6QnbFHrFF;

    public Status(int i, String str, PendingIntent pendingIntent, xq xqVar) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = str;
        this.wdg6QnbFHrFF = pendingIntent;
        this.dgRBjINgWbAK = xqVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.rtx2ld2ELZv4 == status.rtx2ld2ELZv4 && ni0.BRwzKIf41E4i(this.OPXfSBeufaJ8, status.OPXfSBeufaJ8) && ni0.BRwzKIf41E4i(this.wdg6QnbFHrFF, status.wdg6QnbFHrFF) && ni0.BRwzKIf41E4i(this.dgRBjINgWbAK, status.dgRBjINgWbAK);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.rtx2ld2ELZv4), this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.dgRBjINgWbAK});
    }

    public final String toString() {
        op0 op0Var = new op0(this);
        String str = this.OPXfSBeufaJ8;
        if (str == null) {
            int i = this.rtx2ld2ELZv4;
            switch (i) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = o0.wdg6QnbFHrFF("unknown status code: ", i);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        op0Var.wdg6QnbFHrFF(str, "statusCode");
        op0Var.wdg6QnbFHrFF(this.wdg6QnbFHrFF, "resolution");
        return op0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        ki0.JTxCbbCwomzt(parcel, 1, 4);
        parcel.writeInt(this.rtx2ld2ELZv4);
        ki0.KUoIVIumpKat(parcel, 2, this.OPXfSBeufaJ8);
        ki0.yQRudnv4La6p(parcel, 3, this.wdg6QnbFHrFF, i);
        ki0.yQRudnv4La6p(parcel, 4, this.dgRBjINgWbAK, i);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }
}
