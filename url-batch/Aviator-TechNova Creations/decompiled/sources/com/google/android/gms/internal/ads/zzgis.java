package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgis {
    private final zzgmu zza;
    private final zzgkg zzb;
    private final zzgkx zzc;
    private final zzgoe zzd;
    private final zzgcl zze;
    private final boolean zzf;
    private final long zzg;
    private final long zzh;

    zzgis(zzgmu zzgmuVar, zzgkg zzgkgVar, zzgkx zzgkxVar, zzgoe zzgoeVar, zzgcl zzgclVar, boolean z, long j, long j2) {
        this.zza = zzgmuVar;
        this.zzb = zzgkgVar;
        this.zzc = zzgkxVar;
        this.zzd = zzgoeVar;
        this.zze = zzgclVar;
        this.zzf = z;
        this.zzg = j;
        this.zzh = j2;
    }

    private final ListenableFuture zzh(final int i) {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzg.zzw(this.zzb.zza()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgij
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                zzgds zzgdsVar = (zzgds) obj;
                zzgis.this.zzd(zzgdsVar);
                return zzgdsVar;
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgik
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgis.this.zze((zzgds) obj);
            }
        }, zzhaf.zza()), zzgil.zza, zzhaf.zza()), zzgie.class, zzgim.zza, zzhaf.zza()), zzgif.class, zzgin.zza, zzhaf.zza()), zzgid.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgio
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzgis.this.zzf(i, (zzgid) obj);
            }
        }, zzhaf.zza());
        this.zzd.zze(1002, zzgzgVar);
        return zzgzgVar;
    }

    final void zza(long j) {
        if (j > 0) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgiq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgis.this.zzb();
                }
            }, j);
        } else {
            zzb();
        }
    }

    final ListenableFuture zzb() {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg(zzgzg.zzw(this.zzc.zzb()), Throwable.class, zzgih.zza, zzhaf.zza());
        final zzgmu zzgmuVar = this.zza;
        Objects.requireNonNull(zzgmuVar);
        return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzgVar, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgig
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return new Boolean(zzgmu.this.zza((zzgdu) obj));
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgii
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgis.this.zzc((Boolean) obj);
            }
        }, zzhaf.zza());
    }

    final /* synthetic */ ListenableFuture zzc(Boolean bool) {
        if (bool.booleanValue()) {
            return zzh(0);
        }
        this.zzd.zzb(PointerIconCompat.TYPE_HELP);
        return zzgzo.zza(zzgir.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
    }

    final /* synthetic */ zzgds zzd(zzgds zzgdsVar) {
        int zzj = zzgdsVar.zzj() - 1;
        if (zzj == 1 || zzj == 2) {
            return zzgdsVar;
        }
        if (zzj == 3) {
            zzgoe zzgoeVar = this.zzd;
            int zzj2 = zzgdsVar.zzj() - 1;
            StringBuilder sb = new StringBuilder(String.valueOf(zzj2).length());
            sb.append(zzj2);
            zzgoeVar.zzc(PointerIconCompat.TYPE_WAIT, sb.toString());
            throw new zzgif(zzgdsVar.zzj() - 1);
        }
        if (zzj != 12) {
            zzgoe zzgoeVar2 = this.zzd;
            int zzj3 = zzgdsVar.zzj() - 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzj3).length());
            sb2.append(zzj3);
            zzgoeVar2.zzc(1005, sb2.toString());
            throw new zzgie(zzgdsVar.zzj() - 1);
        }
        zzgoe zzgoeVar3 = this.zzd;
        int zzj4 = zzgdsVar.zzj() - 1;
        StringBuilder sb3 = new StringBuilder(String.valueOf(zzj4).length());
        sb3.append(zzj4);
        zzgoeVar3.zzc(1005, sb3.toString());
        throw new zzgid(zzgdsVar.zzj() - 1);
    }

    final /* synthetic */ ListenableFuture zze(zzgds zzgdsVar) {
        if (zzgdsVar.zzj() == 2) {
            return this.zzc.zzd(zzgdsVar.zza(), zzgdsVar.zzb().zzy());
        }
        if (zzgdsVar.zzj() == 3) {
            return this.zzc.zzc(zzgdsVar.zza(), zzgdsVar.zzc().zzy(), zzgdsVar.zzb().zzy());
        }
        throw new AssertionError("Unreachable");
    }

    final /* synthetic */ zzgir zzf(final int i, zzgid zzgidVar) {
        if (this.zzf && i < this.zzg) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgip
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgis.this.zzg(i);
                }
            }, this.zzh * ((long) Math.pow(2.0d, i)));
        }
        return zzgir.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    final /* synthetic */ void zzg(int i) {
        zzh(i + 1);
    }
}
