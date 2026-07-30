package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzpf implements zzpo {
    public static final zzgru zza = zzpd.zza;
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzpn zzf;
    private zzbf zzg;
    private String zzh;
    private long zzi;

    public zzpf() {
        throw null;
    }

    public zzpf(zzgru zzgruVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzl(zzmy zzmyVar) {
        if (zzmyVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzpe zzpeVar = (zzpe) this.zze.get(str);
                zzpeVar.getClass();
                zzm(zzpeVar);
                return;
            }
            return;
        }
        zzpe zzpeVar2 = (zzpe) this.zze.get(this.zzh);
        int i = zzmyVar.zzc;
        zzwk zzwkVar = zzmyVar.zzd;
        this.zzh = zzo(i, zzwkVar).zze();
        zzc(zzmyVar);
        if (zzwkVar == null || !zzwkVar.zzb()) {
            return;
        }
        if (zzpeVar2 != null) {
            if (zzpeVar2.zzg() == zzwkVar.zzd && zzpeVar2.zzh() != null) {
                zzwk zzh = zzpeVar2.zzh();
                if (zzh.zzb == zzwkVar.zzb) {
                    zzwk zzh2 = zzpeVar2.zzh();
                    if (zzh2.zzc == zzwkVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i, new zzwk(zzwkVar.zza, zzwkVar.zzd));
    }

    private final void zzm(zzpe zzpeVar) {
        if (zzpeVar.zzg() != -1 && zzpeVar.zzi()) {
            this.zzi = zzpeVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzpe zzpeVar = (zzpe) this.zze.get(this.zzh);
        return (zzpeVar == null || zzpeVar.zzg() == -1) ? this.zzi + 1 : zzpeVar.zzg();
    }

    private final zzpe zzo(int i, zzwk zzwkVar) {
        HashMap hashMap = this.zze;
        long j = Long.MAX_VALUE;
        zzpe zzpeVar = null;
        for (zzpe zzpeVar2 : hashMap.values()) {
            zzpeVar2.zzc(i, zzwkVar);
            if (zzpeVar2.zzb(i, zzwkVar)) {
                long zzg = zzpeVar2.zzg();
                if (zzg == -1 || zzg < j) {
                    zzpeVar = zzpeVar2;
                    j = zzg;
                } else if (zzg == j) {
                    String str = zzfj.zza;
                    if (zzpeVar.zzh() != null && zzpeVar2.zzh() != null) {
                        zzpeVar = zzpeVar2;
                    }
                }
            }
        }
        if (zzpeVar != null) {
            return zzpeVar;
        }
        String zzp = zzp();
        zzpe zzpeVar3 = new zzpe(this, zzp, i, zzwkVar);
        hashMap.put(zzp, zzpeVar3);
        return zzpeVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zza(zzpn zzpnVar) {
        this.zzf = zzpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized String zzb(zzbf zzbfVar, zzwk zzwkVar) {
        return zzo(zzbfVar.zzo(zzwkVar.zza, this.zzd).zzc, zzwkVar).zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r2 < zzn()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r2.zzf() != r10.zzc) goto L40;
     */
    @Override // com.google.android.gms.internal.ads.zzpo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc(zzmy zzmyVar) {
        if (this.zzf == null) {
            throw null;
        }
        zzbf zzbfVar = zzmyVar.zzb;
        if (!zzbfVar.zzg()) {
            zzwk zzwkVar = zzmyVar.zzd;
            if (zzwkVar != null) {
                long j = zzwkVar.zzd;
                if (j != -1) {
                }
                zzpe zzpeVar = (zzpe) this.zze.get(this.zzh);
                if (zzpeVar != null) {
                    if (zzpeVar.zzg() == -1) {
                    }
                }
            }
            int i = zzmyVar.zzc;
            zzpe zzo = zzo(i, zzwkVar);
            if (this.zzh == null) {
                this.zzh = zzo.zze();
            }
            if (zzwkVar != null && zzwkVar.zzb()) {
                Object obj = zzwkVar.zza;
                long j2 = zzwkVar.zzd;
                int i2 = zzwkVar.zzb;
                zzpe zzo2 = zzo(i, new zzwk(obj, j2, i2));
                if (!zzo2.zzi()) {
                    zzo2.zzj(true);
                    zzbd zzbdVar = this.zzd;
                    zzbfVar.zzo(obj, zzbdVar);
                    zzbdVar.zzc(i2);
                    Math.max(0L, zzfj.zzp(0L) + zzfj.zzp(0L));
                }
            }
            if (!zzo.zzi()) {
                zzo.zzj(true);
            }
            if (zzo.zze().equals(this.zzh) && !zzo.zzk()) {
                zzo.zzl(true);
                this.zzf.zzc(zzmyVar, zzo.zze());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zzd(zzmy zzmyVar) {
        if (this.zzf == null) {
            throw null;
        }
        zzbf zzbfVar = this.zzg;
        this.zzg = zzmyVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpe zzpeVar = (zzpe) it.next();
            if (!zzpeVar.zza(zzbfVar, this.zzg) || zzpeVar.zzd(zzmyVar)) {
                it.remove();
                if (zzpeVar.zze().equals(this.zzh)) {
                    zzm(zzpeVar);
                }
                if (zzpeVar.zzi()) {
                    this.zzf.zzd(zzmyVar, zzpeVar.zze(), false);
                }
            }
        }
        zzl(zzmyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zze(zzmy zzmyVar, int i) {
        if (this.zzf == null) {
            throw null;
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpe zzpeVar = (zzpe) it.next();
            if (zzpeVar.zzd(zzmyVar)) {
                it.remove();
                boolean equals = zzpeVar.zze().equals(this.zzh);
                if (equals) {
                    zzm(zzpeVar);
                }
                if (zzpeVar.zzi()) {
                    boolean z = false;
                    if (i == 0 && equals && zzpeVar.zzk()) {
                        z = true;
                    }
                    this.zzf.zzd(zzmyVar, zzpeVar.zze(), z);
                }
            }
        }
        zzl(zzmyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zzg(zzmy zzmyVar) {
        zzpn zzpnVar;
        String str = this.zzh;
        if (str != null) {
            zzpe zzpeVar = (zzpe) this.zze.get(str);
            if (zzpeVar == null) {
                throw null;
            }
            zzpe zzpeVar2 = zzpeVar;
            zzm(zzpeVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpe zzpeVar3 = (zzpe) it.next();
            it.remove();
            if (zzpeVar3.zzi() && (zzpnVar = this.zzf) != null) {
                zzpnVar.zzd(zzmyVar, zzpeVar3.zze(), false);
            }
        }
    }

    final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }
}
