package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public final class zzhw {
    final zzio zza;

    zzhw(zzpv zzpvVar) {
        this.zza = zzpvVar.zzt();
    }

    final boolean zza() {
        try {
            zzio zzioVar = this.zza;
            PackageManagerWrapper packageManager = Wrappers.packageManager(zzioVar.zzaT());
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", UserVerificationMethods.USER_VERIFY_PATTERN).versionCode >= 80837300;
            }
            zzioVar.zzaW().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e4) {
            this.zza.zzaW().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e4);
            return false;
        }
    }
}
