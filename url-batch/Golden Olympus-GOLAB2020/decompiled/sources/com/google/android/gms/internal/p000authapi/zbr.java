package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class zbr extends zbb implements zbs {
    public zbr() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 == 1) {
            Status status = (Status) zbc.zba(parcel, Status.CREATOR);
            Credential credential = (Credential) zbc.zba(parcel, Credential.CREATOR);
            zbc.zbb(parcel);
            zbb(status, credential);
        } else if (i4 == 2) {
            Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
            zbc.zbb(parcel);
            zbc(status2);
        } else {
            if (i4 != 3) {
                return false;
            }
            Status status3 = (Status) zbc.zba(parcel, Status.CREATOR);
            String readString = parcel.readString();
            zbc.zbb(parcel);
            zbd(status3, readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
