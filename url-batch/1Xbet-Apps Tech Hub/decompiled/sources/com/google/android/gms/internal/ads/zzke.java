package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzke implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaau, zzpo, zzwo, zztk, zzii, zzie {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzki zza;

    /* synthetic */ zzke(zzki zzkiVar, zzkd zzkdVar) {
        this.zza = zzkiVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzki.zzP(this.zza, surfaceTexture);
        this.zza.zzaf(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzai(null);
        this.zza.zzaf(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzaf(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzaf(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzaf(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zza(Exception exc) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zzb(String str, long j, long j2) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzw(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zzc(String str) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zzd(zzil zzilVar) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzy(zzilVar);
        this.zza.zzL = null;
        this.zza.zzS = null;
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zze(zzil zzilVar) {
        zzmj zzmjVar;
        this.zza.zzS = zzilVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzz(zzilVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zzf(zzam zzamVar, zzim zzimVar) {
        zzmj zzmjVar;
        this.zza.zzL = zzamVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzA(zzamVar, zzimVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zzg(long j) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzB(j);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zzh(Exception exc) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zzi(zzpp zzppVar) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzD(zzppVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zzj(zzpp zzppVar) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzE(zzppVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zzk(int i, long j, long j2) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzF(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void zzl(int i, long j) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzG(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void zzm(Object obj, long j) {
        zzmj zzmjVar;
        Object obj2;
        zzew zzewVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzH(obj, j);
        zzki zzkiVar = this.zza;
        obj2 = zzkiVar.zzN;
        if (obj2 == obj) {
            zzewVar = zzkiVar.zzl;
            zzewVar.zzd(26, new zzet() { // from class: com.google.android.gms.internal.ads.zzkc
                @Override // com.google.android.gms.internal.ads.zzet
                public final void zza(Object obj3) {
                }
            });
            zzewVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zzn(final boolean z) {
        boolean z2;
        zzew zzewVar;
        zzki zzkiVar = this.zza;
        z2 = zzkiVar.zzW;
        if (z2 == z) {
            return;
        }
        zzkiVar.zzW = z;
        zzewVar = this.zza.zzl;
        zzewVar.zzd(23, new zzet() { // from class: com.google.android.gms.internal.ads.zzka
            @Override // com.google.android.gms.internal.ads.zzet
            public final void zza(Object obj) {
                int i = zzke.zzb;
                ((zzco) obj).zzn(z);
            }
        });
        zzewVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void zzo(Exception exc) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzI(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void zzp(String str, long j, long j2) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzJ(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void zzq(String str) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzK(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void zzr(zzil zzilVar) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzL(zzilVar);
        this.zza.zzK = null;
        this.zza.zzR = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void zzs(zzil zzilVar) {
        zzmj zzmjVar;
        this.zza.zzR = zzilVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzM(zzilVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void zzt(long j, int i) {
        zzmj zzmjVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzN(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void zzu(zzam zzamVar, zzim zzimVar) {
        zzmj zzmjVar;
        this.zza.zzK = zzamVar;
        zzmjVar = this.zza.zzr;
        zzmjVar.zzO(zzamVar, zzimVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void zzv(final zzdu zzduVar) {
        zzew zzewVar;
        this.zza.zzab = zzduVar;
        zzewVar = this.zza.zzl;
        zzewVar.zzd(25, new zzet() { // from class: com.google.android.gms.internal.ads.zzkb
            @Override // com.google.android.gms.internal.ads.zzet
            public final void zza(Object obj) {
                int i = zzke.zzb;
                ((zzco) obj).zzr(zzdu.this);
            }
        });
        zzewVar.zzc();
    }
}
