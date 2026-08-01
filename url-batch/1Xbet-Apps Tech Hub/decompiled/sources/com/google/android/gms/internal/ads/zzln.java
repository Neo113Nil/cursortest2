package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzln implements zzuu, zzrm {
    final /* synthetic */ zzlr zza;
    private final zzlp zzb;

    public zzln(zzlr zzlrVar, zzlp zzlpVar) {
        this.zza = zzlrVar;
        this.zzb = zzlpVar;
    }

    private final Pair zzf(int i, zzuk zzukVar) {
        zzuk zzukVar2;
        zzuk zzukVar3 = null;
        if (zzukVar != null) {
            zzlp zzlpVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzlpVar.zzc.size()) {
                    zzukVar2 = null;
                    break;
                }
                if (((zzuk) zzlpVar.zzc.get(i2)).zzd == zzukVar.zzd) {
                    zzukVar2 = zzukVar.zza(Pair.create(zzlpVar.zzb, zzukVar.zza));
                    break;
                }
                i2++;
            }
            if (zzukVar2 == null) {
                return null;
            }
            zzukVar3 = zzukVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzukVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzae(int i, zzuk zzukVar, final zzug zzugVar) {
        zzeq zzeqVar;
        final Pair zzf = zzf(0, zzukVar);
        if (zzf != null) {
            zzeqVar = this.zza.zzi;
            zzeqVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzll
                @Override // java.lang.Runnable
                public final void run() {
                    zzmj zzmjVar;
                    Pair pair = zzf;
                    zzmjVar = zzln.this.zza.zzh;
                    zzmjVar.zzae(((Integer) pair.first).intValue(), (zzuk) pair.second, zzugVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzaf(int i, zzuk zzukVar, final zzub zzubVar, final zzug zzugVar) {
        zzeq zzeqVar;
        final Pair zzf = zzf(0, zzukVar);
        if (zzf != null) {
            zzeqVar = this.zza.zzi;
            zzeqVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlj
                @Override // java.lang.Runnable
                public final void run() {
                    zzmj zzmjVar;
                    Pair pair = zzf;
                    zzmjVar = zzln.this.zza.zzh;
                    zzmjVar.zzaf(((Integer) pair.first).intValue(), (zzuk) pair.second, zzubVar, zzugVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzag(int i, zzuk zzukVar, final zzub zzubVar, final zzug zzugVar) {
        zzeq zzeqVar;
        final Pair zzf = zzf(0, zzukVar);
        if (zzf != null) {
            zzeqVar = this.zza.zzi;
            zzeqVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlm
                @Override // java.lang.Runnable
                public final void run() {
                    zzmj zzmjVar;
                    Pair pair = zzf;
                    zzmjVar = zzln.this.zza.zzh;
                    zzmjVar.zzag(((Integer) pair.first).intValue(), (zzuk) pair.second, zzubVar, zzugVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzah(int i, zzuk zzukVar, final zzub zzubVar, final zzug zzugVar, final IOException iOException, final boolean z) {
        zzeq zzeqVar;
        final Pair zzf = zzf(0, zzukVar);
        if (zzf != null) {
            zzeqVar = this.zza.zzi;
            zzeqVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzli
                @Override // java.lang.Runnable
                public final void run() {
                    zzmj zzmjVar;
                    Pair pair = zzf;
                    zzmjVar = zzln.this.zza.zzh;
                    zzmjVar.zzah(((Integer) pair.first).intValue(), (zzuk) pair.second, zzubVar, zzugVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzai(int i, zzuk zzukVar, final zzub zzubVar, final zzug zzugVar) {
        zzeq zzeqVar;
        final Pair zzf = zzf(0, zzukVar);
        if (zzf != null) {
            zzeqVar = this.zza.zzi;
            zzeqVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlk
                @Override // java.lang.Runnable
                public final void run() {
                    zzmj zzmjVar;
                    Pair pair = zzf;
                    zzmjVar = zzln.this.zza.zzh;
                    zzmjVar.zzai(((Integer) pair.first).intValue(), (zzuk) pair.second, zzubVar, zzugVar);
                }
            });
        }
    }
}
