package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.c10;
import defpackage.i1;
import defpackage.in1;
import defpackage.l42;
import defpackage.ll3;
import defpackage.tt1;
import defpackage.va3;
import defpackage.yk3;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Status extends i1 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new va3(17);
    public final int m;
    public final String n;
    public final PendingIntent o;
    public final c10 p;

    public Status(int i, String str, PendingIntent pendingIntent, c10 c10Var) {
        this.m = i;
        this.n = str;
        this.o = pendingIntent;
        this.p = c10Var;
    }

    public final String a() {
        String str = this.n;
        if (str != null) {
            return str;
        }
        int i = this.m;
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
            default:
                return in1.k(i, "unknown status code: ");
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
            case 10:
                return "DEVELOPER_ERROR";
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return "ERROR";
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return "CANCELED";
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.m == status.m && ll3.C(this.n, status.n) && ll3.C(this.o, status.o) && ll3.C(this.p, status.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.m), this.n, this.o, this.p});
    }

    public final String toString() {
        tt1 tt1Var = new tt1(this);
        tt1Var.k(a(), "statusCode");
        tt1Var.k(this.o, "resolution");
        return tt1Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m);
        yk3.W(parcel, 2, this.n);
        yk3.V(parcel, 3, this.o, i);
        yk3.V(parcel, 4, this.p, i);
        yk3.c0(parcel, b0);
    }
}
