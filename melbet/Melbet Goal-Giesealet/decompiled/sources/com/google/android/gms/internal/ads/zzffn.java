package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzffn {
    private final zzfer zza;
    private final zzffk zzb;
    private final zzfen zzc;
    private zzfft zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzffn(zzfer zzferVar, zzfen zzfenVar, zzffk zzffkVar) {
        this.zza = zzferVar;
        this.zzc = zzfenVar;
        this.zzb = zzffkVar;
        zzfenVar.zza(new zzfem() { // from class: com.google.android.gms.internal.ads.zzffm
            @Override // com.google.android.gms.internal.ads.zzfem
            public final /* synthetic */ void zza() {
                zzffn.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r3 = new com.google.android.gms.internal.ads.zzfft(r4.zza, r4.zzb, r0);
        r4.zze = r3;
        r3.zza(new com.google.android.gms.internal.ads.zzffi(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        return;
     */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzd() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgI)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                ArrayDeque arrayDeque = this.zzd;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                zzffl zzfflVar = (zzffl) arrayDeque.pollFirst();
                if (zzfflVar == null || (zzfflVar.zzb() != null && this.zza.zzc(zzfflVar.zzb()))) {
                    break;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzffl zzfflVar) {
        this.zzd.add(zzfflVar);
    }

    public final synchronized ListenableFuture zzb(zzffl zzfflVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfflVar);
    }

    final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(zzfft zzfftVar) {
        this.zze = null;
    }

    final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
