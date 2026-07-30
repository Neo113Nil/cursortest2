package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaco implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzadr zze;
    private final zzdn zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzact zzi;
    private zzff zzj = new zzff(10);
    private zzv zzk;
    private zzdx zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    /* synthetic */ zzaco(zzacg zzacgVar, byte[] bArr) {
        this.zza = zzacgVar.zze();
        zzbs zzg = zzacgVar.zzg();
        zzg.getClass();
        this.zzb = zzg;
        this.zzc = new SparseArray();
        zzguf.zzi();
        this.zzd = zzacgVar.zzh();
        zzdn zzi = zzacgVar.zzi();
        this.zzf = zzi;
        this.zzh = zzacgVar.zzj() != -9223372036854775807L ? -zzacgVar.zzj() : -9223372036854775807L;
        zzact zzk = zzacgVar.zzk();
        this.zzi = zzk;
        this.zze = new zzabt(zzacgVar.zzf(), zzk, zzi);
        new zzacf(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzM();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    final /* synthetic */ void zzA(long j) {
        this.zzq = j;
    }

    public final void zza(int i) {
        this.zzr = 1;
    }

    public final zzadr zzb(int i) {
        SparseArray sparseArray = this.zzc;
        if (zzfj.zza(sparseArray, 0)) {
            return (zzadr) sparseArray.get(0);
        }
        zzaci zzaciVar = new zzaci(this, this.zza, 0);
        this.zzg.add(zzaciVar);
        sparseArray.put(0, zzaciVar);
        return zzaciVar;
    }

    public final void zzc(Surface surface, zzes zzesVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzes) this.zzm.second).equals(zzesVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzesVar);
        zzesVar.zza();
        zzesVar.zzb();
    }

    public final void zzd() {
        zzes zzesVar = zzes.zza;
        zzesVar.zza();
        zzesVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdx zzdxVar = this.zzl;
        if (zzdxVar != null) {
            zzdxVar.zzm(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    final /* synthetic */ void zzh() {
        this.zzn--;
    }

    final /* synthetic */ boolean zzi(zzv zzvVar, int i) {
        zzgrc.zzi(this.zzo == 0);
        zzi zzC = zzC(zzvVar.zzE);
        try {
            int i2 = zzC.zzd;
            try {
                if (i2 == 7) {
                    if (Build.VERSION.SDK_INT < 34 && zzdv.zzd()) {
                        zzh zzd = zzC.zzd();
                        zzd.zzc(6);
                        zzC = zzd.zzg();
                        zzi zziVar = zzC;
                        zzdn zzdnVar = this.zzf;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        this.zzl = zzdnVar.zzd(myLooper, null);
                        zzbs zzbsVar = this.zzb;
                        Context context = this.zza;
                        zzl zzlVar = zzl.zzb;
                        final zzdx zzdxVar = this.zzl;
                        Objects.requireNonNull(zzdxVar);
                        zzbsVar.zza(context, zziVar, zzlVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzach
                            @Override // java.util.concurrent.Executor
                            public final /* synthetic */ void execute(Runnable runnable) {
                                zzdx.this.zzn(runnable);
                            }
                        }, 0L, false);
                        throw null;
                    }
                    i2 = 7;
                }
                if (!zzdv.zzc(i2) && Build.VERSION.SDK_INT >= 29) {
                    Object[] objArr = {Integer.valueOf(i2)};
                    String str = zzfj.zza;
                    zzee.zzc("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                    zzC = zzi.zza;
                    zzi zziVar2 = zzC;
                    zzdn zzdnVar2 = this.zzf;
                    Looper myLooper2 = Looper.myLooper();
                    myLooper2.getClass();
                    this.zzl = zzdnVar2.zzd(myLooper2, null);
                    zzbs zzbsVar2 = this.zzb;
                    Context context2 = this.zza;
                    zzl zzlVar2 = zzl.zzb;
                    final zzdx zzdxVar2 = this.zzl;
                    Objects.requireNonNull(zzdxVar2);
                    zzbsVar2.zza(context2, zziVar2, zzlVar2, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzach
                        @Override // java.util.concurrent.Executor
                        public final /* synthetic */ void execute(Runnable runnable) {
                            zzdx.this.zzn(runnable);
                        }
                    }, 0L, false);
                    throw null;
                }
                zzbs zzbsVar22 = this.zzb;
                Context context22 = this.zza;
                zzl zzlVar22 = zzl.zzb;
                final zzdx zzdxVar22 = this.zzl;
                Objects.requireNonNull(zzdxVar22);
                zzbsVar22.zza(context22, zziVar2, zzlVar22, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzach
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzdx.this.zzn(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (zzbo e) {
                throw new zzadq(e, zzvVar);
            }
            if (i2 == 2 || i2 == 10) {
                zzC = zzi.zza;
            }
            zzi zziVar22 = zzC;
            zzdn zzdnVar22 = this.zzf;
            Looper myLooper22 = Looper.myLooper();
            myLooper22.getClass();
            this.zzl = zzdnVar22.zzd(myLooper22, null);
        } catch (zzdu e2) {
            throw new zzadq(e2, zzvVar);
        }
    }

    final /* synthetic */ boolean zzj(boolean z) {
        return this.zze.zzh(false);
    }

    final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    final /* synthetic */ void zzl(long j, long j2) {
        this.zze.zzv(j, j2);
    }

    final /* synthetic */ void zzm(boolean z) {
        if (this.zzo == 1) {
            this.zzn++;
            zzadr zzadrVar = this.zze;
            zzadrVar.zzg(z);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzacn zzacnVar = (zzacn) this.zzj.zzd();
                zzacnVar.getClass();
                zzadrVar.zzs(1, this.zzk, zzacnVar.zza, zzacnVar.zzb, zzguf.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z) {
                this.zzq = -9223372036854775807L;
            }
            zzdx zzdxVar = this.zzl;
            zzdxVar.getClass();
            zzdxVar.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaco.this.zzh();
                }
            });
        }
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zze.zzw(z);
    }

    final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    final /* synthetic */ void zzp(zzacp zzacpVar) {
        this.zze.zzl(zzacpVar);
    }

    final /* synthetic */ void zzq(float f) {
        this.zzi.zzc(f);
        this.zze.zzm(f);
    }

    final /* synthetic */ void zzr(int i) {
        this.zze.zzr(i);
    }

    final /* synthetic */ boolean zzs() {
        int i = this.zzr;
        return i != -1 && i == 0;
    }

    final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    final /* synthetic */ long zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzact zzv() {
        return this.zzi;
    }

    final /* synthetic */ zzff zzw() {
        return this.zzj;
    }

    final /* synthetic */ void zzx(zzff zzffVar) {
        this.zzj = zzffVar;
    }

    final /* synthetic */ long zzy() {
        return this.zzp;
    }

    final /* synthetic */ long zzz() {
        return this.zzq;
    }
}
