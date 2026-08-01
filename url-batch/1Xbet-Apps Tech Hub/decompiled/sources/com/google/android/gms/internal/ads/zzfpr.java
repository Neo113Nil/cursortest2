package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfpr {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfps zzc;
    private final zzfnt zzd;
    private final zzfno zze;
    private zzfpg zzf;
    private final Object zzg = new Object();

    public zzfpr(Context context, zzfps zzfpsVar, zzfnt zzfntVar, zzfno zzfnoVar) {
        this.zzb = context;
        this.zzc = zzfpsVar;
        this.zzd = zzfntVar;
        this.zze = zzfnoVar;
    }

    private final synchronized Class zzd(zzfph zzfphVar) throws zzfpq {
        String zzk = zzfphVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfphVar.zzc())) {
                throw new zzfpq(2026, "VM did not pass signature verification");
            }
            try {
                File zzb = zzfphVar.zzb();
                if (!zzb.exists()) {
                    zzb.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfphVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zzk, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfpq(AdError.REMOTE_ADS_SERVICE_ERROR, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfpq(2026, e2);
        }
    }

    public final zzfnw zza() {
        zzfpg zzfpgVar;
        synchronized (this.zzg) {
            zzfpgVar = this.zzf;
        }
        return zzfpgVar;
    }

    public final zzfph zzb() {
        synchronized (this.zzg) {
            zzfpg zzfpgVar = this.zzf;
            if (zzfpgVar == null) {
                return null;
            }
            return zzfpgVar.zzf();
        }
    }

    public final boolean zzc(zzfph zzfphVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfpg zzfpgVar = new zzfpg(zzd(zzfphVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfphVar.zze(), null, new Bundle(), 2), zzfphVar, this.zzc, this.zzd);
                if (!zzfpgVar.zzh()) {
                    throw new zzfpq(4000, "init failed");
                }
                int zze = zzfpgVar.zze();
                if (zze != 0) {
                    throw new zzfpq(4001, "ci: " + zze);
                }
                synchronized (this.zzg) {
                    zzfpg zzfpgVar2 = this.zzf;
                    if (zzfpgVar2 != null) {
                        try {
                            zzfpgVar2.zzg();
                        } catch (zzfpq e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                    }
                    this.zzf = zzfpgVar;
                }
                this.zzd.zzd(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfpq(AdError.INTERNAL_ERROR_2004, e2);
            }
        } catch (zzfpq e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}
