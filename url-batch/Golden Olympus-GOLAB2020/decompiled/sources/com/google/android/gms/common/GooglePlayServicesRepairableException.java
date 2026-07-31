package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i4, String str, Intent intent) {
        super(str, intent);
        this.zza = i4;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
