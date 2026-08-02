package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cri;
import defpackage.ctt;
import defpackage.oy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TetheredSyncStatus extends cri {
    public static final Parcelable.Creator CREATOR = new ctt(6);
    public static final int DUAL_WRITE_ENABLED = 2;
    public static final int SUCCESS = 3;
    public static final String TCS_DUAL_WRITE_ENABLED = "TCS companion dual write is enabled. ";
    public static final String TCS_SUCCESS = "TCS sync is enabled on GmsCore both phone and watch.";
    public static final String TCS_UNSUPPORTED = "TCS unsupported on GmsCore.";
    public static final int UNSUPPORTED = 1;
    private final int a;
    private final String b;

    public TetheredSyncStatus(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public int getCode() {
        return this.a;
    }

    public String getMessage() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 2, getCode());
        oy.I(parcel, 3, getMessage());
        oy.r(parcel, q);
    }
}
