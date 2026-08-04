package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgge {
    private static final zzggc zza = new zzggc("PhoneskyVerificationUtils");

    public static boolean zza(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        zza.zzb("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String zza2 = zzggd.zza(signature.toByteArray());
                            arrayList.add(zza2);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(zza2)) {
                                return true;
                            }
                            if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(zza2)) {
                                return true;
                            }
                        }
                        zza.zzb(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", UByte$$ExternalSyntheticBackport0.m(", ", arrayList)), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zza.zzb("Play Store package is not found.", new Object[0]);
                }
            } else {
                zza.zzb("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            zza.zzb("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
