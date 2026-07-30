package com.google.android.gms.auth;

import android.content.Intent;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int zza;

    GooglePlayServicesAvailabilityException(int i8, @Nullable String str, @Nullable Intent intent) {
        super(str, intent);
        this.zza = i8;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
