package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import com.bumptech.glide.load.Key;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbmx;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzckb;
import com.google.android.gms.internal.ads.zzclh;
import com.google.android.gms.internal.ads.zzclj;
import com.google.android.gms.internal.ads.zzclv;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzejg;
import com.google.android.gms.internal.ads.zzejh;
import com.google.android.gms.internal.ads.zzejz;
import com.google.android.gms.internal.ads.zzekb;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzgrt;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public class zzm extends zzbxr implements zzah {
    static final int zza = Color.argb(0, 0, 0, 0);
    public static final /* synthetic */ int zzo = 0;
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcjl zzd;
    zzj zze;
    zzu zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzi zzl;
    private Runnable zzr;
    private boolean zzs;
    private boolean zzt;
    private Toolbar zzx;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzp = new Object();
    private final View.OnClickListener zzq = new zzd(this);
    private boolean zzu = false;
    private boolean zzv = false;
    private boolean zzw = true;

    public zzm(Activity activity) {
        this.zzb = activity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzbm)).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0045, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzbl)).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzJ(Configuration configuration) {
        boolean z;
        boolean z2;
        com.google.android.gms.ads.internal.zzl zzlVar;
        boolean z3;
        int i;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z4 = (adOverlayInfoParcel == null || (zzlVar2 = adOverlayInfoParcel.zzo) == null || !zzlVar2.zzb) ? false : true;
        Activity activity = this.zzb;
        boolean zzd = com.google.android.gms.ads.internal.zzt.zzf().zzd(activity, configuration);
        if (this.zzk && !z4) {
        }
        if (zzd) {
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 != null && (zzlVar = adOverlayInfoParcel2.zzo) != null && zzlVar.zzg) {
            z = true;
            z2 = z;
            Window window = activity.getWindow();
            if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzbL)).booleanValue()) {
            }
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzoS)).booleanValue()) {
                return;
            } else {
                return;
            }
        }
        z = true;
        z2 = false;
        Window window2 = activity.getWindow();
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzbL)).booleanValue()) {
            View decorView = window2.getDecorView();
            if (z) {
                i = z2 ? 5894 : 5380;
                z3 = true;
            } else {
                i = 256;
                z3 = false;
            }
            decorView.setSystemUiVisibility(i);
        } else if (z) {
            window2.addFlags(1024);
            window2.clearFlags(2048);
            if (z2) {
                window2.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            }
            z3 = true;
        } else {
            window2.addFlags(2048);
            window2.clearFlags(1024);
            z3 = false;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzoS)).booleanValue() || Build.VERSION.SDK_INT > 34 || Build.VERSION.SDK_INT < 28 || !z3) {
            return;
        }
        window2.getAttributes().layoutInDisplayCutoutMode = 1;
        WindowCompat.setDecorFitsSystemWindows(window2, false);
    }

    private final void zzK(View view) {
        zzekb zzU;
        zzejz zzV;
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && (zzV = zzcjlVar.zzV()) != null) {
            zzV.zzf(view);
        } else if (((Boolean) zzbd.zzc().zzd(zzbhe.zzgl)).booleanValue() && (zzU = zzcjlVar.zzU()) != null && zzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzU.zza(), view);
        }
    }

    private static final void zzL(zzekb zzekbVar, View view) {
        if (zzekbVar == null || view == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzgl)).booleanValue() && zzekbVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzekbVar.zza(), view);
    }

    protected final void zzA() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.zzb.isFinishing() || this.zzu) {
            return;
        }
        this.zzu = true;
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null) {
            zzcjlVar.zzH(this.zzn - 1);
            synchronized (this.zzp) {
                if (!this.zzs && this.zzd.zzaa()) {
                    if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfX)).booleanValue() && !this.zzv && (adOverlayInfoParcel = this.zzc) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                        zzrVar.zzdS();
                    }
                    this.zzr = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzf
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzm.this.zzB();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this.zzr, ((Long) zzbd.zzc().zzd(zzbhe.zzbE)).longValue());
                    return;
                }
            }
        }
        zzB();
    }

    final void zzB() {
        zzcjl zzcjlVar;
        zzr zzrVar;
        if (this.zzv) {
            return;
        }
        this.zzv = true;
        zzcjl zzcjlVar2 = this.zzd;
        if (zzcjlVar2 != null) {
            this.zzl.removeView(zzcjlVar2.zzE());
            zzj zzjVar = this.zze;
            if (zzjVar != null) {
                this.zzd.zzai(zzjVar.zzd);
                this.zzd.zzag(false);
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzof)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzE());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View zzE = this.zzd.zzE();
                zzj zzjVar2 = this.zze;
                viewGroup.addView(zzE, zzjVar2.zza, zzjVar2.zzb);
                this.zze = null;
            } else {
                Activity activity = this.zzb;
                if (activity.getApplicationContext() != null) {
                    this.zzd.zzai(activity.getApplicationContext());
                }
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdT(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcjlVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzcjlVar.zzU(), this.zzc.zzd.zzE());
    }

    public final void zzC() {
        if (this.zzm) {
            this.zzm = false;
            zzD();
        }
    }

    protected final void zzD() {
        this.zzd.zzI();
    }

    public final void zzE() {
        this.zzl.zzb = true;
    }

    public final void zzF() {
        synchronized (this.zzp) {
            this.zzs = true;
            if (this.zzr != null) {
                zzfyn zzfynVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzfynVar.removeCallbacks(this.zzr);
                zzfynVar.post(this.zzr);
            }
        }
    }

    public final void zzG(zzejh zzejhVar) throws zzh, RemoteException {
        zzbxl zzbxlVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbxlVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzh("noioou");
        }
        zzbxlVar.zzh(ObjectWrapper.wrap(zzejhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzH(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.zzb;
            zzejg zze = zzejh.zze();
            zze.zza(activity);
            zze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzi(strArr, iArr, ObjectWrapper.wrap(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzb() {
        this.zzn = 3;
        Activity activity = this.zzb;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null) {
            zzcjlVar.zzae(null);
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzt = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzah
    public final void zzd() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zze() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzf() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final boolean zzg() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzZ = this.zzd.zzZ();
        if (!zzZ) {
            this.zzd.zze("onbackblocked", Collections.emptyMap());
        }
        return zzZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[Catch: zzh -> 0x0115, TryCatch #0 {zzh -> 0x0115, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0037, B:19:0x0040, B:21:0x004b, B:22:0x004d, B:24:0x0053, B:25:0x005f, B:27:0x0066, B:30:0x0073, B:32:0x0077, B:34:0x007c, B:36:0x008a, B:38:0x008e, B:40:0x0094, B:41:0x0097, B:43:0x009d, B:44:0x00a0, B:46:0x00a6, B:48:0x00aa, B:49:0x00ad, B:51:0x00b3, B:52:0x00b6, B:54:0x00ba, B:56:0x00be, B:57:0x00c1, B:64:0x00ec, B:67:0x00f0, B:68:0x00f7, B:69:0x00f8, B:71:0x00fc, B:73:0x0109, B:75:0x006d, B:77:0x0071, B:78:0x0086, B:79:0x010d, B:80:0x0114), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba A[Catch: zzh -> 0x0115, TryCatch #0 {zzh -> 0x0115, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0037, B:19:0x0040, B:21:0x004b, B:22:0x004d, B:24:0x0053, B:25:0x005f, B:27:0x0066, B:30:0x0073, B:32:0x0077, B:34:0x007c, B:36:0x008a, B:38:0x008e, B:40:0x0094, B:41:0x0097, B:43:0x009d, B:44:0x00a0, B:46:0x00a6, B:48:0x00aa, B:49:0x00ad, B:51:0x00b3, B:52:0x00b6, B:54:0x00ba, B:56:0x00be, B:57:0x00c1, B:64:0x00ec, B:67:0x00f0, B:68:0x00f7, B:69:0x00f8, B:71:0x00fc, B:73:0x0109, B:75:0x006d, B:77:0x0071, B:78:0x0086, B:79:0x010d, B:80:0x0114), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109 A[Catch: zzh -> 0x0115, TryCatch #0 {zzh -> 0x0115, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0037, B:19:0x0040, B:21:0x004b, B:22:0x004d, B:24:0x0053, B:25:0x005f, B:27:0x0066, B:30:0x0073, B:32:0x0077, B:34:0x007c, B:36:0x008a, B:38:0x008e, B:40:0x0094, B:41:0x0097, B:43:0x009d, B:44:0x00a0, B:46:0x00a6, B:48:0x00aa, B:49:0x00ad, B:51:0x00b3, B:52:0x00b6, B:54:0x00ba, B:56:0x00be, B:57:0x00c1, B:64:0x00ec, B:67:0x00f0, B:68:0x00f7, B:69:0x00f8, B:71:0x00fc, B:73:0x0109, B:75:0x006d, B:77:0x0071, B:78:0x0086, B:79:0x010d, B:80:0x0114), top: B:10:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbxs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzh(Bundle bundle) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        int i;
        zzr zzrVar;
        if (!this.zzt) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.zzb;
            AdOverlayInfoParcel zza2 = AdOverlayInfoParcel.zza(activity.getIntent());
            this.zzc = zza2;
            if (zza2 == null) {
                throw new zzh("Could not get info for ad overlay.");
            }
            if (zza2.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzn = 4;
            }
            if (activity.getIntent() != null) {
                this.zzw = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel2.zzo;
            if (zzlVar != null) {
                boolean z = zzlVar.zza;
                this.zzk = z;
                if (z) {
                    if (adOverlayInfoParcel2.zzk != 5 && zzlVar.zzf != -1) {
                        new zzl(this, null).zzb();
                    }
                }
                if (bundle == null) {
                    if (this.zzw) {
                        zzdbs zzdbsVar = this.zzc.zzt;
                        if (zzdbsVar != null) {
                            zzdbsVar.zza();
                        }
                        zzr zzrVar2 = this.zzc.zzc;
                        if (zzrVar2 != null) {
                            zzrVar2.zzh();
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                    if (adOverlayInfoParcel3.zzk != 1) {
                        com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel3.zzb;
                        if (zzaVar != null) {
                            zzaVar.onAdClicked();
                        }
                        zzdjm zzdjmVar = this.zzc.zzu;
                        if (zzdjmVar != null) {
                            zzdjmVar.zzdu();
                        }
                    }
                }
                adOverlayInfoParcel = this.zzc;
                if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                    zzrVar.zzdo();
                }
                AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
                zzi zziVar = new zzi(activity, adOverlayInfoParcel4.zzn, adOverlayInfoParcel4.zzm.afmaVersion, adOverlayInfoParcel4.zzs);
                this.zzl = zziVar;
                zziVar.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
                AdOverlayInfoParcel adOverlayInfoParcel5 = this.zzc;
                i = adOverlayInfoParcel5.zzk;
                if (i == 1) {
                    zzy(false);
                    return;
                }
                if (i == 2) {
                    this.zze = new zzj(adOverlayInfoParcel5.zzd);
                    zzy(false);
                    return;
                } else if (i == 3) {
                    zzy(true);
                    return;
                } else {
                    if (i != 5) {
                        throw new zzh("Could not determine ad overlay type.");
                    }
                    zzy(false);
                    return;
                }
            }
            if (adOverlayInfoParcel2.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel2.zzk != 5) {
                    new zzl(this, null).zzb();
                }
                if (bundle == null) {
                }
                adOverlayInfoParcel = this.zzc;
                if (adOverlayInfoParcel != null) {
                    zzrVar.zzdo();
                }
                AdOverlayInfoParcel adOverlayInfoParcel42 = this.zzc;
                zzi zziVar2 = new zzi(activity, adOverlayInfoParcel42.zzn, adOverlayInfoParcel42.zzm.afmaVersion, adOverlayInfoParcel42.zzs);
                this.zzl = zziVar2;
                zziVar2.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
                AdOverlayInfoParcel adOverlayInfoParcel52 = this.zzc;
                i = adOverlayInfoParcel52.zzk;
                if (i == 1) {
                }
            } else {
                this.zzk = false;
                if (bundle == null) {
                }
                adOverlayInfoParcel = this.zzc;
                if (adOverlayInfoParcel != null) {
                }
                AdOverlayInfoParcel adOverlayInfoParcel422 = this.zzc;
                zzi zziVar22 = new zzi(activity, adOverlayInfoParcel422.zzn, adOverlayInfoParcel422.zzm.afmaVersion, adOverlayInfoParcel422.zzs);
                this.zzl = zziVar22;
                zziVar22.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
                AdOverlayInfoParcel adOverlayInfoParcel522 = this.zzc;
                i = adOverlayInfoParcel522.zzk;
                if (i == 1) {
                }
            }
        } catch (zzh e) {
            String message = e.getMessage();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzi() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdq();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzj() {
        zzr zzrVar;
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue()) {
            zzcjl zzcjlVar = this.zzd;
            if (zzcjlVar == null || zzcjlVar.zzX()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzk() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdx();
        }
        zzJ(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue()) {
            return;
        }
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null && !zzcjlVar.zzX()) {
            this.zzd.onResume();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzl() {
        zzr zzrVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdw();
        }
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzm(int i, int i2, Intent intent) {
        zzdxz zzI;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            zzbgv zzbgvVar = zzbhe.zzoD;
            if (((Boolean) zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i2);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                zzcjl zzcjlVar = this.zzd;
                if (zzcjlVar == null || zzcjlVar.zzP() == null || (zzI = zzcjlVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.zzc) == null || !((Boolean) zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                    return;
                }
                zzdxy zza2 = zzI.zza();
                zza2.zzc("action", "hilca");
                zza2.zzc("gqi", zzgrt.zza(adOverlayInfoParcel.zzq));
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length());
                sb2.append(i2);
                zza2.zzc("hilr", sb2.toString());
                if (i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zza2.zzc("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zza2.zzc("hills", stringExtra2);
                    }
                }
                zza2.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzn(IObjectWrapper iObjectWrapper) {
        zzJ((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzp() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdy();
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzq() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdz();
        }
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null) {
            try {
                this.zzl.removeView(zzcjlVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        zzA();
    }

    public final void zzr(boolean z) {
        if (this.zzc.zzw) {
            return;
        }
        int intValue = ((Integer) zzbd.zzc().zzd(zzbhe.zzgc)).intValue();
        boolean z2 = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbH)).booleanValue() || z;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z2 ? 0 : intValue;
        zztVar.zzb = true != z2 ? intValue : 0;
        zztVar.zzc = intValue;
        this.zzf = new zzu(this.zzb, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzt(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzK(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzs() {
        this.zzt = true;
    }

    public final void zzt(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbF)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z5 = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbG)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbwx(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.zzf;
        if (zzuVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzuVar.zza(z3);
        }
    }

    public final void zzu(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzv() {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i) {
        Activity activity = this.zzb;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzbd.zzc().zzd(zzbhe.zzgU)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbd.zzc().zzd(zzbhe.zzgV)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzbd.zzc().zzd(zzbhe.zzgW)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzbd.zzc().zzd(zzbhe.zzgX)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzx(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.zzb;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        activity.setContentView(this.zzh);
        this.zzt = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzy(boolean z) throws zzh {
        boolean z2;
        Resources.Theme theme;
        ?? r2;
        zzcjl zzcjlVar;
        if (!this.zzt) {
            this.zzb.requestWindowFeature(1);
        }
        Activity activity = this.zzb;
        Window window = activity.getWindow();
        if (window == null) {
            throw new zzh("Invalid activity, no window available.");
        }
        zzcjl zzcjlVar2 = this.zzc.zzd;
        zzclj zzP = zzcjlVar2 != null ? zzcjlVar2.zzP() : null;
        boolean z3 = zzP != null && zzP.zzk();
        this.zzm = false;
        if (z3) {
            int i = this.zzc.zzj;
            if (i == 6) {
                z2 = activity.getResources().getConfiguration().orientation == 1;
                this.zzm = z2;
            } else if (i == 7) {
                z2 = activity.getResources().getConfiguration().orientation == 2;
                this.zzm = z2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(z2).length() + 41);
            sb.append("Delay onShow to next orientation change: ");
            sb.append(z2);
            String sb2 = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
            zzw(this.zzc.zzj);
            window.setFlags(16777216, 16777216);
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Hardware acceleration on the AdActivity window enabled.");
            if (this.zzk) {
                this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.zzl.setBackgroundColor(zza);
            }
            activity.setContentView(this.zzl);
            this.zzt = true;
            if (z) {
                theme = null;
                r2 = 0;
                zzcjl zzcjlVar3 = this.zzc.zzd;
                this.zzd = zzcjlVar3;
                zzcjlVar3.zzai(this.zzb);
            } else {
                try {
                    com.google.android.gms.ads.internal.zzt.zzd();
                    zzcjl zzcjlVar4 = this.zzc.zzd;
                    zzclv zzN = zzcjlVar4 != null ? zzcjlVar4.zzN() : null;
                    zzcjl zzcjlVar5 = this.zzc.zzd;
                    String zzO = zzcjlVar5 != null ? zzcjlVar5.zzO() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                    VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                    zzcjl zzcjlVar6 = adOverlayInfoParcel.zzd;
                    String str = zzO;
                    theme = null;
                    boolean z4 = false;
                    zzcjl zza2 = zzckb.zza(activity, zzN, str, true, z3, null, null, versionInfoParcel, null, null, zzcjlVar6 != null ? zzcjlVar6.zzk() : null, zzbgd.zza(), null, null, null, null, null);
                    this.zzd = zza2;
                    zzclj zzP2 = zza2.zzP();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    zzbmx zzbmxVar = adOverlayInfoParcel2.zzp;
                    zzbmz zzbmzVar = adOverlayInfoParcel2.zze;
                    zzad zzadVar = adOverlayInfoParcel2.zzi;
                    zzcjl zzcjlVar7 = adOverlayInfoParcel2.zzd;
                    zzP2.zzab(null, zzbmxVar, null, zzbmzVar, zzadVar, true, null, zzcjlVar7 != null ? zzcjlVar7.zzP().zzh() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    this.zzd.zzP().zzG(new zzclh() { // from class: com.google.android.gms.ads.internal.overlay.zzg
                        @Override // com.google.android.gms.internal.ads.zzclh
                        public final /* synthetic */ void zza(boolean z5, int i3, String str2, String str3) {
                            zzcjl zzcjlVar8 = zzm.this.zzd;
                            if (zzcjlVar8 != null) {
                                zzcjlVar8.zzI();
                            }
                        }
                    });
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                    String str2 = adOverlayInfoParcel3.zzl;
                    if (str2 != null) {
                        this.zzd.loadUrl(str2);
                    } else {
                        String str3 = adOverlayInfoParcel3.zzh;
                        if (str3 == null) {
                            throw new zzh("No URL or HTML to display in ad overlay.");
                        }
                        this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str3, "text/html", Key.STRING_CHARSET_NAME, null);
                    }
                    zzcjl zzcjlVar8 = this.zzc.zzd;
                    r2 = z4;
                    if (zzcjlVar8 != null) {
                        zzcjlVar8.zzan(this);
                        r2 = z4;
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error obtaining webview.", e);
                    throw new zzh("Could not obtain webview for the overlay.", e);
                }
            }
            if (this.zzc.zzw) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.zzD(), r2);
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbw)).booleanValue() && Build.VERSION.SDK_INT >= 27) {
                    this.zzd.zzD().setTextClassifier(TextClassifier.NO_OP);
                }
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbx)).booleanValue()) {
                    this.zzd.zzD().setDownloadListener(zze.zza);
                }
            }
            this.zzd.zzae(this);
            zzcjlVar = this.zzc.zzd;
            if (zzcjlVar != null) {
                zzL(zzcjlVar.zzU(), this.zzl);
            }
            if (this.zzc.zzk != 5) {
                ViewParent parent = this.zzd.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.zzd.zzE());
                }
                if (this.zzk) {
                    this.zzd.zzat();
                }
                if (this.zzc.zzw) {
                    Toolbar toolbar = new Toolbar(this.zzb);
                    this.zzx = toolbar;
                    toolbar.setId(View.generateViewId());
                    this.zzd.zzE().setId(View.generateViewId());
                    this.zzx.setBackgroundColor(-12303292);
                    this.zzx.setVisibility(r2);
                    try {
                        this.zzx.setNavigationIcon(com.google.android.gms.ads.internal.zzt.zzh().zzf().getDrawable(R.drawable.admob_close_button_white_cross, theme));
                    } catch (Resources.NotFoundException | NullPointerException e2) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", e2);
                    }
                    this.zzx.setNavigationOnClickListener(this.zzq);
                    this.zzx.setTitleMarginStart(r2);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(10);
                    this.zzl.addView(this.zzx, layoutParams);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(3, this.zzx.getId());
                    layoutParams2.addRule(12);
                    this.zzl.addView(this.zzd.zzE(), layoutParams2);
                    zzK(this.zzx);
                } else {
                    this.zzl.addView(this.zzd.zzE(), -1, -1);
                }
            }
            if (!z && !this.zzm) {
                zzD();
            }
            if (this.zzc.zzk == 5) {
                zzr(z3);
                if (this.zzd.zzR()) {
                    zzt(z3, true);
                    return;
                }
                return;
            }
            Activity activity2 = this.zzb;
            zzejg zze = zzejh.zze();
            zze.zza(activity2);
            zze.zzb(this);
            zze.zzc(this.zzc.zzq);
            zze.zzd(this.zzc.zzr);
            try {
                zzG(zze.zze());
                return;
            } catch (RemoteException | zzh e3) {
                throw new zzh(e3.getMessage(), e3);
            }
        }
        z2 = false;
        StringBuilder sb3 = new StringBuilder(String.valueOf(z2).length() + 41);
        sb3.append("Delay onShow to next orientation change: ");
        sb3.append(z2);
        String sb22 = sb3.toString();
        int i22 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb22);
        zzw(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
        }
        activity.setContentView(this.zzl);
        this.zzt = true;
        if (z) {
        }
        if (this.zzc.zzw) {
        }
        this.zzd.zzae(this);
        zzcjlVar = this.zzc.zzd;
        if (zzcjlVar != null) {
        }
        if (this.zzc.zzk != 5) {
        }
        if (!z) {
            zzD();
        }
        if (this.zzc.zzk == 5) {
        }
    }

    public final void zzz(String str) {
        Toolbar toolbar = this.zzx;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }
}
