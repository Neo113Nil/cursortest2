package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzasd {
    protected volatile Boolean zzb;
    private final zzatj zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzfpv zza = null;
    private static volatile Random zzd = null;

    public zzasd(zzatj zzatjVar) {
        this.zze = zzatjVar;
        zzatjVar.zzk().execute(new zzasc(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return zze().nextInt();
        }
    }

    private static Random zze() {
        if (zzd == null) {
            synchronized (zzasd.class) {
                if (zzd == null) {
                    zzd = new Random();
                }
            }
        }
        return zzd;
    }

    public final void zzc(int i, int i2, long j, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzaos zza2 = zzaow.zza();
            zza2.zza(this.zze.zza.getPackageName());
            zza2.zze(j);
            if (str != null) {
                zza2.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzf(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzfpu zza3 = zza.zza(((zzaow) zza2.zzal()).zzax());
            zza3.zza(i);
            if (i2 != -1) {
                zza3.zzb(i2);
            }
            zza3.zzc();
        } catch (Exception unused) {
        }
    }
}
