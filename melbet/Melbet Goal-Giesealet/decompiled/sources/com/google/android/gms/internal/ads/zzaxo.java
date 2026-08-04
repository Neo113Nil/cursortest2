package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaxo {
    public static String zza(Context context, String str, List list, Executor executor) throws CertificateEncodingException, PackageManager.NameNotFoundException, InterruptedException, ExecutionException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzgpm zze = zzgpm.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaxn
            @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzgpm zzgpmVar = zzgpm.this;
                if (list2 == null) {
                    zzgpmVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ApkChecksum apkChecksum = (ApkChecksum) list2.get(i);
                        if (apkChecksum.getType() == 8) {
                            zzgpmVar.zza(zzawa.zza(apkChecksum.getValue()));
                            return;
                        }
                    }
                    zzgpmVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzgpmVar.zza((Object) null);
                }
            }
        });
        return (String) zze.get();
    }
}
