package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfxa {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfxb zzc;
    private final zzfvh zzd;
    private final zzfvc zze;
    private final boolean zzf;
    private zzfwp zzg;
    private final Object zzh = new Object();

    public zzfxa(Context context, zzfxb zzfxbVar, zzfvh zzfvhVar, zzfvc zzfvcVar, boolean z) {
        this.zzb = context;
        this.zzc = zzfxbVar;
        this.zzd = zzfvhVar;
        this.zze = zzfvcVar;
        this.zzf = z;
    }

    private final synchronized Class zzd(zzfwq zzfwqVar) throws zzfwz {
        if (zzfwqVar.zza() == null) {
            throw new zzfwz(4010, "mc");
        }
        String zza2 = zzfwqVar.zza().zza();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zza2);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfwqVar.zzb())) {
                throw new zzfwz(2026, "VM did not pass signature verification");
            }
            try {
                File zzc = zzfwqVar.zzc();
                if (!zzc.exists()) {
                    zzc.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfwqVar.zzb().getAbsolutePath(), zzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zza2, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfwz(AdError.REMOTE_ADS_SERVICE_ERROR, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfwz(2026, e2);
        }
    }

    public final boolean zza(zzfwq zzfwqVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfwp zzfwpVar = new zzfwp(zzd(zzfwqVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfwqVar.zzd(), null, new Bundle(), 2), zzfwqVar, this.zzc, this.zzd, this.zzf);
                if (!zzfwpVar.zzf()) {
                    throw new zzfwz(4000, "init failed");
                }
                int zzh = zzfwpVar.zzh();
                if (zzh != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(zzh);
                    throw new zzfwz(4001, sb.toString());
                }
                synchronized (this.zzh) {
                    zzfwp zzfwpVar2 = this.zzg;
                    if (zzfwpVar2 != null) {
                        try {
                            zzfwpVar2.zzg();
                        } catch (zzfwz e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                    }
                    this.zzg = zzfwpVar;
                }
                this.zzd.zzb(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfwz(AdError.INTERNAL_ERROR_2004, e2);
            }
        } catch (zzfwz e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }

    public final zzfvk zzb() {
        zzfwp zzfwpVar;
        synchronized (this.zzh) {
            zzfwpVar = this.zzg;
        }
        return zzfwpVar;
    }

    public final zzfwq zzc() {
        synchronized (this.zzh) {
            zzfwp zzfwpVar = this.zzg;
            if (zzfwpVar == null) {
                return null;
            }
            return zzfwpVar.zze();
        }
    }
}
