package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;
import com.google.common.base.Optional;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes3.dex */
public final class zzgx {
    private static volatile Optional<Boolean> zza = Optional.absent();
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (zza.isPresent()) {
            return zza.get().booleanValue();
        }
        synchronized (zzb) {
            if (zza.isPresent()) {
                return zza.get().booleanValue();
            }
            if (!"com.google.android.gms".equals(context.getPackageName())) {
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456);
                if (resolveContentProvider != null) {
                }
                zza = Optional.of(Boolean.valueOf(z));
                return zza.get().booleanValue();
            }
            if (zza(context)) {
                z = true;
            }
            zza = Optional.of(Boolean.valueOf(z));
            return zza.get().booleanValue();
        }
    }
}
