package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzdi {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfwu zzh;
    private final zzfwu zzi;
    private final int zzj;
    private final int zzk;
    private final zzfwu zzl;
    private final zzdh zzm;
    private zzfwu zzn;
    private int zzo;
    private final HashMap zzp;
    private final HashSet zzq;

    @Deprecated
    public zzdi() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = zzfwu.zzl();
        this.zzi = zzfwu.zzl();
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzfwu.zzl();
        this.zzm = zzdh.zza;
        this.zzn = zzfwu.zzl();
        this.zzo = 0;
        this.zzp = new HashMap();
        this.zzq = new HashSet();
    }

    public final zzdi zze(Context context) {
        CaptioningManager captioningManager;
        if ((zzfs.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzo = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzn = zzfwu.zzm(zzfs.zzA(locale));
            }
        }
        return this;
    }

    public zzdi zzf(int i, int i2, boolean z) {
        this.zze = i;
        this.zzf = i2;
        this.zzg = true;
        return this;
    }

    protected zzdi(zzdj zzdjVar) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzdjVar.zzl;
        this.zzf = zzdjVar.zzm;
        this.zzg = zzdjVar.zzn;
        this.zzh = zzdjVar.zzo;
        this.zzi = zzdjVar.zzq;
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzdjVar.zzu;
        this.zzm = zzdjVar.zzv;
        this.zzn = zzdjVar.zzw;
        this.zzo = zzdjVar.zzx;
        this.zzq = new HashSet(zzdjVar.zzD);
        this.zzp = new HashMap(zzdjVar.zzC);
    }
}
