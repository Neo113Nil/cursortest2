package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cri;
import defpackage.ctt;
import defpackage.oy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TetheredContactsSyncRequest extends cri {
    public static final Parcelable.Creator CREATOR = new ctt(5);
    public static final int DISABLE_SYNC = 2;
    public static final int FULL_SYNC = 0;
    public static final int INCREMENTAL_SYNC = 1;
    public static final int INITIAL_SYNC = 3;
    private final int a;
    private final boolean b;

    public TetheredContactsSyncRequest(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public int getType() {
        return this.a;
    }

    public boolean isValidForHighResPhotoSync() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 2, getType());
        oy.s(parcel, 3, isValidForHighResPhotoSync());
        oy.r(parcel, q);
    }
}
