package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zznq implements zzln {
    private final zzdj zza;
    private final zzca zzb;
    private final zzcb zzc;
    private final zznp zzd;
    private final SparseArray zze;
    private zzdz zzf;
    private zzbw zzg;
    private zzdt zzh;
    private boolean zzi;

    public static /* synthetic */ void zzV(zznq zznqVar) {
        final zzlo zzT = zznqVar.zzT();
        zznqVar.zzY(zzT, 1028, new zzdw(zzT) { // from class: com.google.android.gms.internal.ads.zzls
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
        zznqVar.zzf.zze();
    }

    private final zzlo zzaa(int i, zzui zzuiVar) {
        zzbw zzbwVar = this.zzg;
        zzbwVar.getClass();
        if (zzuiVar != null) {
            return this.zzd.zza(zzuiVar) != null ? zzZ(zzuiVar) : zzU(zzcc.zza, i, zzuiVar);
        }
        zzcc zzn = zzbwVar.zzn();
        if (i >= zzn.zzc()) {
            zzn = zzcc.zza;
        }
        return zzU(zzn, i, null);
    }

    private final zzlo zzab() {
        return zzZ(this.zzd.zzd());
    }

    private final zzlo zzac() {
        return zzZ(this.zzd.zze());
    }

    private final zzlo zzad(zzbp zzbpVar) {
        zzui zzuiVar;
        return (!(zzbpVar instanceof zzhw) || (zzuiVar = ((zzhw) zzbpVar).zzh) == null) ? zzT() : zzZ(zzuiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzA(final zzaf zzafVar, final zzho zzhoVar) {
        final zzlo zzac = zzac();
        zzY(zzac, PointerIconCompat.TYPE_VERTICAL_TEXT, new zzdw() { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zze(zzlo.this, zzafVar, zzhoVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzB(final long j) {
        final zzlo zzac = zzac();
        zzY(zzac, PointerIconCompat.TYPE_ALIAS, new zzdw(zzac, j) { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzC(final Exception exc) {
        final zzlo zzac = zzac();
        zzY(zzac, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, new zzdw(zzac, exc) { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzD(final zzpf zzpfVar) {
        final zzlo zzac = zzac();
        zzY(zzac, 1031, new zzdw(zzac, zzpfVar) { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzE(final zzpf zzpfVar) {
        final zzlo zzac = zzac();
        zzY(zzac, 1032, new zzdw(zzac, zzpfVar) { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzF(final int i, final long j, final long j2) {
        final zzlo zzac = zzac();
        zzY(zzac, PointerIconCompat.TYPE_COPY, new zzdw(zzac, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzme
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzG(final int i, final long j) {
        final zzlo zzab = zzab();
        zzY(zzab, PointerIconCompat.TYPE_ZOOM_IN, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmo
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzh(zzlo.this, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzH(final Object obj, final long j) {
        final zzlo zzac = zzac();
        zzY(zzac, 26, new zzdw() { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj2) {
                ((zzlq) obj2).zzn(zzlo.this, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzI(final Exception exc) {
        final zzlo zzac = zzac();
        zzY(zzac, 1030, new zzdw(zzac, exc) { // from class: com.google.android.gms.internal.ads.zzmd
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzJ(final String str, final long j, final long j2) {
        final zzlo zzac = zzac();
        zzY(zzac, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, new zzdw(zzac, str, j2, j) { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzK(final String str) {
        final zzlo zzac = zzac();
        zzY(zzac, PointerIconCompat.TYPE_ZOOM_OUT, new zzdw(zzac, str) { // from class: com.google.android.gms.internal.ads.zzmn
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzL(final zzhn zzhnVar) {
        final zzlo zzab = zzab();
        zzY(zzab, PointerIconCompat.TYPE_GRAB, new zzdw() { // from class: com.google.android.gms.internal.ads.zzna
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzo(zzlo.this, zzhnVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzM(final zzhn zzhnVar) {
        final zzlo zzac = zzac();
        zzY(zzac, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, new zzdw(zzac, zzhnVar) { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzN(final long j, final int i) {
        final zzlo zzab = zzab();
        zzY(zzab, PointerIconCompat.TYPE_GRABBING, new zzdw(zzab, j, i) { // from class: com.google.android.gms.internal.ads.zzms
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzO(final zzaf zzafVar, final zzho zzhoVar) {
        final zzlo zzac = zzac();
        zzY(zzac, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmz
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzp(zzlo.this, zzafVar, zzhoVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzP() {
        zzdt zzdtVar = this.zzh;
        zzdi.zzb(zzdtVar);
        zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zznh
            @Override // java.lang.Runnable
            public final void run() {
                zznq.zzV(zznq.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzQ(zzlq zzlqVar) {
        this.zzf.zzf(zzlqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzR(final zzbw zzbwVar, Looper looper) {
        zzfxr zzfxrVar;
        boolean z = true;
        if (this.zzg != null) {
            zzfxrVar = this.zzd.zzb;
            if (!zzfxrVar.isEmpty()) {
                z = false;
            }
        }
        zzdi.zzf(z);
        zzbwVar.getClass();
        this.zzg = zzbwVar;
        this.zzh = this.zza.zzb(looper, null);
        this.zzf = this.zzf.zza(looper, new zzdx() { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // com.google.android.gms.internal.ads.zzdx
            public final void zza(Object obj, zzab zzabVar) {
                zznq.this.zzW(zzbwVar, (zzlq) obj, zzabVar);
            }
        });
    }

    protected final zzlo zzT() {
        return zzZ(this.zzd.zzb());
    }

    @RequiresNonNull({"player"})
    protected final zzlo zzU(zzcc zzccVar, int i, zzui zzuiVar) {
        zzui zzuiVar2 = true == zzccVar.zzo() ? null : zzuiVar;
        long zza = this.zza.zza();
        boolean z = zzccVar.equals(this.zzg.zzn()) && i == this.zzg.zzd();
        long j = 0;
        if (zzuiVar2 == null || !zzuiVar2.zzb()) {
            if (z) {
                j = this.zzg.zzj();
            } else if (!zzccVar.zzo()) {
                long j2 = zzccVar.zze(i, this.zzc, 0L).zzl;
                j = zzet.zzu(0L);
            }
        } else if (z && this.zzg.zzb() == zzuiVar2.zzb && this.zzg.zzc() == zzuiVar2.zzc) {
            j = this.zzg.zzk();
        }
        return new zzlo(zza, zzccVar, i, zzuiVar2, j, this.zzg.zzn(), this.zzg.zzd(), this.zzd.zzb(), this.zzg.zzk(), this.zzg.zzm());
    }

    final /* synthetic */ void zzW(zzbw zzbwVar, zzlq zzlqVar, zzab zzabVar) {
        zzlqVar.zzi(zzbwVar, new zzlp(zzabVar, this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzyi
    public final void zzX(final int i, final long j, final long j2) {
        final zzlo zzZ = zzZ(this.zzd.zzc());
        zzY(zzZ, PointerIconCompat.TYPE_CELL, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmb
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzf(zzlo.this, i, j, j2);
            }
        });
    }

    protected final void zzY(zzlo zzloVar, int i, zzdw zzdwVar) {
        this.zze.put(i, zzloVar);
        zzdz zzdzVar = this.zzf;
        zzdzVar.zzd(i, zzdwVar);
        zzdzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zza(final zzbt zzbtVar) {
        final zzlo zzT = zzT();
        zzY(zzT, 13, new zzdw(zzT, zzbtVar) { // from class: com.google.android.gms.internal.ads.zzlx
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzae(int i, zzui zzuiVar, final zzue zzueVar) {
        final zzlo zzaa = zzaa(i, zzuiVar);
        zzY(zzaa, 1004, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzg(zzlo.this, zzueVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzaf(int i, zzui zzuiVar, final zztz zztzVar, final zzue zzueVar) {
        final zzlo zzaa = zzaa(i, zzuiVar);
        zzY(zzaa, 1002, new zzdw(zzaa, zztzVar, zzueVar) { // from class: com.google.android.gms.internal.ads.zzmu
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzag(int i, zzui zzuiVar, final zztz zztzVar, final zzue zzueVar) {
        final zzlo zzaa = zzaa(i, zzuiVar);
        zzY(zzaa, 1001, new zzdw(zzaa, zztzVar, zzueVar) { // from class: com.google.android.gms.internal.ads.zzmy
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzah(int i, zzui zzuiVar, final zztz zztzVar, final zzue zzueVar, final IOException iOException, final boolean z) {
        final zzlo zzaa = zzaa(i, zzuiVar);
        zzY(zzaa, PointerIconCompat.TYPE_HELP, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmf
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzj(zzlo.this, zztzVar, zzueVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzai(int i, zzui zzuiVar, final zztz zztzVar, final zzue zzueVar) {
        final zzlo zzaa = zzaa(i, zzuiVar);
        zzY(zzaa, 1000, new zzdw(zzaa, zztzVar, zzueVar) { // from class: com.google.android.gms.internal.ads.zzlw
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzb(final boolean z) {
        final zzlo zzT = zzT();
        zzY(zzT, 3, new zzdw(zzT, z) { // from class: com.google.android.gms.internal.ads.zzlu
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzc(final boolean z) {
        final zzlo zzT = zzT();
        zzY(zzT, 7, new zzdw(zzT, z) { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzd(final zzbc zzbcVar, final int i) {
        final zzlo zzT = zzT();
        zzY(zzT, 1, new zzdw(zzT, zzbcVar, i) { // from class: com.google.android.gms.internal.ads.zzlz
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zze(final zzbh zzbhVar) {
        final zzlo zzT = zzT();
        zzY(zzT, 14, new zzdw(zzT, zzbhVar) { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzf(final boolean z, final int i) {
        final zzlo zzT = zzT();
        zzY(zzT, 5, new zzdw(zzT, z, i) { // from class: com.google.android.gms.internal.ads.zzmq
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzg(final zzbq zzbqVar) {
        final zzlo zzT = zzT();
        zzY(zzT, 12, new zzdw(zzT, zzbqVar) { // from class: com.google.android.gms.internal.ads.zzlr
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzh(final int i) {
        final zzlo zzT = zzT();
        zzY(zzT, 4, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmx
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzk(zzlo.this, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzi(final int i) {
        final zzlo zzT = zzT();
        zzY(zzT, 6, new zzdw(zzT, i) { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzj(final zzbp zzbpVar) {
        final zzlo zzad = zzad(zzbpVar);
        zzY(zzad, 10, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmv
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzl(zzlo.this, zzbpVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzk(final zzbp zzbpVar) {
        final zzlo zzad = zzad(zzbpVar);
        zzY(zzad, 10, new zzdw(zzad, zzbpVar) { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzl(final boolean z, final int i) {
        final zzlo zzT = zzT();
        zzY(zzT, -1, new zzdw(zzT, z, i) { // from class: com.google.android.gms.internal.ads.zzmh
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzn(final boolean z) {
        final zzlo zzac = zzac();
        zzY(zzac, 23, new zzdw(zzac, z) { // from class: com.google.android.gms.internal.ads.zzma
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzo(final int i, final int i2) {
        final zzlo zzac = zzac();
        zzY(zzac, 24, new zzdw(zzac, i, i2) { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzq(final zzck zzckVar) {
        final zzlo zzT = zzT();
        zzY(zzT, 2, new zzdw(zzT, zzckVar) { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzr(final zzcp zzcpVar) {
        final zzlo zzac = zzac();
        zzY(zzac, 25, new zzdw() { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlo zzloVar = zzlo.this;
                zzcp zzcpVar2 = zzcpVar;
                ((zzlq) obj).zzq(zzloVar, zzcpVar2);
                int i = zzcpVar2.zzb;
                int i2 = zzcpVar2.zzc;
                int i3 = zzcpVar2.zzd;
                float f = zzcpVar2.zze;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzs(final float f) {
        final zzlo zzac = zzac();
        zzY(zzac, 22, new zzdw(zzac, f) { // from class: com.google.android.gms.internal.ads.zzmc
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzt(zzlq zzlqVar) {
        this.zzf.zzb(zzlqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzu() {
        if (this.zzi) {
            return;
        }
        final zzlo zzT = zzT();
        this.zzi = true;
        zzY(zzT, -1, new zzdw(zzT) { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzv(final Exception exc) {
        final zzlo zzac = zzac();
        zzY(zzac, 1029, new zzdw(zzac, exc) { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzw(final String str, final long j, final long j2) {
        final zzlo zzac = zzac();
        zzY(zzac, PointerIconCompat.TYPE_TEXT, new zzdw(zzac, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzml
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzx(final String str) {
        final zzlo zzac = zzac();
        zzY(zzac, PointerIconCompat.TYPE_NO_DROP, new zzdw(zzac, str) { // from class: com.google.android.gms.internal.ads.zzlv
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzy(final zzhn zzhnVar) {
        final zzlo zzab = zzab();
        zzY(zzab, PointerIconCompat.TYPE_ALL_SCROLL, new zzdw(zzab, zzhnVar) { // from class: com.google.android.gms.internal.ads.zzmw
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzz(final zzhn zzhnVar) {
        final zzlo zzac = zzac();
        zzY(zzac, PointerIconCompat.TYPE_CROSSHAIR, new zzdw(zzac, zzhnVar) { // from class: com.google.android.gms.internal.ads.zzlt
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    private final zzlo zzZ(zzui zzuiVar) {
        this.zzg.getClass();
        zzcc zza = zzuiVar == null ? null : this.zzd.zza(zzuiVar);
        if (zzuiVar != null && zza != null) {
            return zzU(zza, zza.zzn(zzuiVar.zza, this.zzb).zzc, zzuiVar);
        }
        int zzd = this.zzg.zzd();
        zzcc zzn = this.zzg.zzn();
        if (zzd >= zzn.zzc()) {
            zzn = zzcc.zza;
        }
        return zzU(zzn, zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzS(List list, zzui zzuiVar) {
        zzbw zzbwVar = this.zzg;
        zzbwVar.getClass();
        this.zzd.zzh(list, zzuiVar, zzbwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzm(final zzbv zzbvVar, final zzbv zzbvVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zznp zznpVar = this.zzd;
        zzbw zzbwVar = this.zzg;
        zzbwVar.getClass();
        zznpVar.zzg(zzbwVar);
        final zzlo zzT = zzT();
        zzY(zzT, 11, new zzdw() { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzm(zzlo.this, zzbvVar, zzbvVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzp(zzcc zzccVar, final int i) {
        zzbw zzbwVar = this.zzg;
        zzbwVar.getClass();
        this.zzd.zzi(zzbwVar);
        final zzlo zzT = zzT();
        zzY(zzT, 0, new zzdw(zzT, i) { // from class: com.google.android.gms.internal.ads.zzly
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
            }
        });
    }

    public zznq(zzdj zzdjVar) {
        zzdjVar.getClass();
        this.zza = zzdjVar;
        this.zzf = new zzdz(zzet.zzy(), zzdjVar, new zzdx() { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzdx
            public final void zza(Object obj, zzab zzabVar) {
            }
        });
        zzca zzcaVar = new zzca();
        this.zzb = zzcaVar;
        this.zzc = new zzcb();
        this.zzd = new zznp(zzcaVar);
        this.zze = new SparseArray();
    }
}
