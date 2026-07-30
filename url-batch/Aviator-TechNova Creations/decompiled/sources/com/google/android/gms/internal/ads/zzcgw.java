package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcgw extends zzcfk implements TextureView.SurfaceTextureListener, zzcfu {
    private final zzcge zzc;
    private final zzcgf zzd;
    private final zzcgd zze;
    private final zzdxz zzf;
    private zzcfj zzg;
    private Surface zzh;
    private zzcfv zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcgc zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcgw(Context context, zzcgf zzcgfVar, zzcge zzcgeVar, boolean z, boolean z2, zzcgd zzcgdVar, zzdxz zzdxzVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzcgeVar;
        this.zzd = zzcgfVar;
        this.zzo = z;
        this.zze = zzcgdVar;
        zzcgfVar.zza(this);
        this.zzf = zzdxzVar;
    }

    private final boolean zzT() {
        zzcfv zzcfvVar = this.zzi;
        return (zzcfvVar == null || !zzcfvVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z, Integer num) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null && !z) {
            zzcfvVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z) {
            if (!zzT()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcfvVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzchr zzr = this.zzc.zzr(this.zzj);
            if (zzr instanceof zzcia) {
                zzcfv zza = ((zzcia) zzr).zza();
                this.zzi = zza;
                zza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzr instanceof zzchx)) {
                    String str = this.zzj;
                    String.valueOf(str);
                    String valueOf = String.valueOf(str);
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache miss: ".concat(valueOf));
                    return;
                }
                zzchx zzchxVar = (zzchx) zzr;
                String zzF = zzF();
                ByteBuffer zzu = zzchxVar.zzu();
                boolean zzt = zzchxVar.zzt();
                String zzs = zzchxVar.zzs();
                if (zzs == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache URL is null.");
                    return;
                } else {
                    zzcfv zzE = zzE(num);
                    this.zzi = zzE;
                    zzE.zzr(new Uri[]{Uri.parse(zzs)}, zzF, zzu, zzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            String zzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i5 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i5 >= strArr.length) {
                    break;
                }
                uriArr[i5] = Uri.parse(strArr[i5]);
                i5++;
            }
            this.zzi.zzq(uriArr, zzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int zzC = this.zzi.zzC();
            this.zzm = zzC;
            if (zzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            zzcfv zzcfvVar = this.zzi;
            if (zzcfvVar != null) {
                zzcfvVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(Surface surface, boolean z) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcfvVar.zzu(surface, z);
        } catch (IOException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static String zzZ(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzt != f) {
            this.zzt = f;
            requestLayout();
        }
    }

    private final void zzac() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzM(true);
        }
    }

    private final void zzad() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzM(false);
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzt;
        if (f != 0.0f && this.zzn == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzdxz zzdxzVar;
        if (this.zzo) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoK)).booleanValue() && (zzdxzVar = this.zzf) != null) {
                zzdxy zza = zzdxzVar.zza();
                zza.zzc("action", "svp_aepv");
                zza.zzd();
            }
            zzcgc zzcgcVar = new zzcgc(getContext());
            this.zzn = zzcgcVar;
            zzcgcVar.zzb(surfaceTexture, i, i2);
            zzcgc zzcgcVar2 = this.zzn;
            zzcgcVar2.start();
            SurfaceTexture zze = zzcgcVar2.zze();
            if (zze != null) {
                surfaceTexture = zze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzN(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzP(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzA(int i) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzB(int i) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzz(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzC(int i) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzS();
            }
        });
    }

    final zzcfv zzE(Integer num) {
        zzcgd zzcgdVar = this.zze;
        zzcge zzcgeVar = this.zzc;
        zzcit zzcitVar = new zzcit(zzcgeVar.getContext(), zzcgdVar, zzcgeVar, num);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        return zzcitVar;
    }

    final String zzF() {
        zzcge zzcgeVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzc().zze(zzcgeVar.getContext(), zzcgeVar.zzs().afmaVersion);
    }

    final /* synthetic */ void zzG() {
        float zzc = this.zzb.zzc();
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcfvVar.zzv(zzc, false);
        } catch (IOException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    final /* synthetic */ void zzH() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzb();
        }
    }

    final /* synthetic */ void zzI() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zze();
        }
    }

    final /* synthetic */ void zzJ(String str) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzK() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzc();
        }
    }

    final /* synthetic */ void zzL() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzd();
        }
    }

    final /* synthetic */ void zzM() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zza();
        }
    }

    final /* synthetic */ void zzN(int i, int i2) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzj(i, i2);
        }
    }

    final /* synthetic */ void zzO() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzh();
        }
    }

    final /* synthetic */ void zzP(int i) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.onWindowVisibilityChanged(i);
        }
    }

    final /* synthetic */ void zzQ(boolean z, long j) {
        this.zzc.zzu(z, j);
    }

    final /* synthetic */ void zzR(String str) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzS() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzb(zzcfj zzcfjVar) {
        this.zzg = zzcfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzc(String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzcgf zzcgfVar = this.zzd;
        zzcgfVar.zzf();
        this.zzb.zze();
        zzcgfVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zze() {
        if (!zzU()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzac();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgw.this.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzi(int i) {
        if (zzU()) {
            this.zzi.zzx(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzj(float f, float f2) {
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzm() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzn() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzo() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzp() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgh
    public final void zzq() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzr(final boolean z, final long j) {
        if (this.zzc != null) {
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgw.this.zzQ(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzs(int i) {
        if (this.zzm != i) {
            this.zzm = i;
            if (i == 3) {
                zzY();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgw.this.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzt(int i, int i2) {
        this.zzr = i;
        this.zzs = i2;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzu(String str, Exception exc) {
        final String zzZ = zzZ(str, exc);
        String concat = "ExoPlayerAdapter error: ".concat(zzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzJ(zzZ);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzv(String str, Exception exc) {
        final String zzZ = zzZ("onLoadException", exc);
        String concat = "ExoPlayerAdapter exception: ".concat(zzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzR(zzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final Integer zzw() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzy(int i) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzF(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzz(int i) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzG(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzx(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z = this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4;
        this.zzj = str;
        zzV(z, num);
    }
}
