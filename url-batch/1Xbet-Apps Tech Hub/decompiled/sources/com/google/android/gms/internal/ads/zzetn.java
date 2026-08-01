package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzetn implements zzeuy {
    private final Context zza;
    private final zzgbl zzb;
    private final zzfeq zzc;
    private final zzcbt zzd;

    zzetn(Context context, zzgbl zzgblVar, zzfeq zzfeqVar, zzcbt zzcbtVar) {
        this.zza = context;
        this.zzb = zzgblVar;
        this.zzc = zzfeqVar;
        this.zzd = zzcbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetn.this.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzcI)).booleanValue() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzfqz.zzj(r0).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzcW)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzi().zzQ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzcJ)).booleanValue() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        r0 = com.google.android.gms.internal.ads.zzfra.zzi(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e9, code lost:
    
        if (r8.zzd.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzcS)).intValue()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
    
        r2 = r0.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzcX)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzi().zzQ());
        r3 = r0.zzo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x010f, code lost:
    
        r6 = r0.zzp();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzcL)).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzcK)).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzeto zzc() throws Exception {
        try {
            Context context = this.zza;
            boolean zzb = this.zzc.zzb();
            zzfqw zzfqwVar = new zzfqw();
            zzfqw zzfqwVar2 = new zzfqw();
            boolean z = true;
            if (zzb) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcM)).booleanValue()) {
                    return new zzeto(true);
                }
            }
            if (!zzb) {
            }
            if (zzb) {
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcT)).booleanValue()) {
                if (this.zzd.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcS)).intValue()) {
                    zzfra.zzi(context).zzj();
                }
            }
            if (!zzb) {
            }
            if (zzb) {
            }
            zzfqw zzfqwVar3 = zzfqwVar2;
            boolean z2 = true;
            boolean z3 = true;
            return new zzeto(zzfqwVar, zzfqwVar3, z2, z3, zzb);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "PerAppIdSignal");
            return new zzeto(this.zzc.zzb());
        }
    }
}
