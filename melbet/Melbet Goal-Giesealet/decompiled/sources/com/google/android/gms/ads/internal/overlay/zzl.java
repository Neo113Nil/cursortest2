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
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.WindowCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcfa;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcwf;
import com.google.android.gms.internal.ads.zzddz;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzecz;
import com.google.android.gms.internal.ads.zzeda;
import com.google.android.gms.internal.ads.zzeds;
import com.google.android.gms.internal.ads.zzedu;
import com.google.android.gms.internal.ads.zzfro;
import com.google.android.gms.internal.ads.zzghs;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public class zzl extends zzbsv implements zzag {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcek zzd;
    zzi zze;
    zzt zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzh zzl;
    private Runnable zzq;
    private boolean zzr;
    private boolean zzs;
    private Toolbar zzw;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private final View.OnClickListener zzp = new zzd(this);
    private boolean zzt = false;
    private boolean zzu = false;
    private boolean zzv = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzaV)).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0045, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzaU)).booleanValue() != false) goto L21;
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
            if (!((Boolean) zzbd.zzc().zzd(zzbci.zzbs)).booleanValue()) {
            }
            if (((Boolean) zzbd.zzc().zzd(zzbci.zzof)).booleanValue()) {
                return;
            } else {
                return;
            }
        }
        z = true;
        z2 = false;
        Window window2 = activity.getWindow();
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzbs)).booleanValue()) {
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
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzof)).booleanValue() || Build.VERSION.SDK_INT > 34 || Build.VERSION.SDK_INT < 28 || !z3) {
            return;
        }
        window2.getAttributes().layoutInDisplayCutoutMode = 1;
        WindowCompat.setDecorFitsSystemWindows(window2, false);
    }

    private final void zzK(View view) {
        zzedu zzU;
        zzeds zzV;
        zzcek zzcekVar = this.zzd;
        if (zzcekVar == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && (zzV = zzcekVar.zzV()) != null) {
            zzV.zzf(view);
        } else if (((Boolean) zzbd.zzc().zzd(zzbci.zzfL)).booleanValue() && (zzU = zzcekVar.zzU()) != null && zzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzU.zza(), view);
        }
    }

    private static final void zzL(zzedu zzeduVar, View view) {
        if (zzeduVar == null || view == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfL)).booleanValue() && zzeduVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzeduVar.zza(), view);
    }

    protected final void zzA() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzq zzqVar;
        if (!this.zzb.isFinishing() || this.zzt) {
            return;
        }
        this.zzt = true;
        zzcek zzcekVar = this.zzd;
        if (zzcekVar != null) {
            zzcekVar.zzH(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzr && this.zzd.zzaa()) {
                    if (((Boolean) zzbd.zzc().zzd(zzbci.zzfx)).booleanValue() && !this.zzu && (adOverlayInfoParcel = this.zzc) != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
                        zzqVar.zzdX();
                    }
                    this.zzq = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzl.this.zzB();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this.zzq, ((Long) zzbd.zzc().zzd(zzbci.zzbl)).longValue());
                    return;
                }
            }
        }
        zzB();
    }

    final void zzB() {
        zzcek zzcekVar;
        zzq zzqVar;
        if (this.zzu) {
            return;
        }
        this.zzu = true;
        zzcek zzcekVar2 = this.zzd;
        if (zzcekVar2 != null) {
            this.zzl.removeView(zzcekVar2.zzE());
            zzi zziVar = this.zze;
            if (zziVar != null) {
                this.zzd.zzai(zziVar.zzd);
                this.zzd.zzag(false);
                if (((Boolean) zzbd.zzc().zzd(zzbci.zznx)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzE());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View zzE = this.zzd.zzE();
                zzi zziVar2 = this.zze;
                viewGroup.addView(zzE, zziVar2.zza, zziVar2.zzb);
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
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdY(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcekVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzcekVar.zzU(), this.zzc.zzd.zzE());
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
        synchronized (this.zzo) {
            this.zzr = true;
            if (this.zzq != null) {
                zzfro zzfroVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzfroVar.removeCallbacks(this.zzq);
                zzfroVar.post(this.zzq);
            }
        }
    }

    public final void zzG(zzeda zzedaVar) throws zzg, RemoteException {
        zzbsp zzbspVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbspVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzg("noioou");
        }
        zzbspVar.zzh(ObjectWrapper.wrap(zzedaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzH(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.zzb;
            zzecz zze = zzeda.zze();
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
        zzcek zzcekVar = this.zzd;
        if (zzcekVar != null) {
            zzcekVar.zzae(null);
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzs = true;
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

    @Override // com.google.android.gms.ads.internal.overlay.zzag
    public final void zzd() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zze() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzf() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzqVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzqVar.zzdA();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final boolean zzg() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzjI)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzZ = this.zzd.zzZ();
        if (!zzZ) {
            this.zzd.zze("onbackblocked", Collections.emptyMap());
        }
        return zzZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[Catch: zzg -> 0x0115, TryCatch #0 {zzg -> 0x0115, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0037, B:19:0x0040, B:21:0x004b, B:22:0x004d, B:24:0x0053, B:25:0x005f, B:27:0x0066, B:30:0x0073, B:32:0x0077, B:34:0x007c, B:36:0x008a, B:38:0x008e, B:40:0x0094, B:41:0x0097, B:43:0x009d, B:44:0x00a0, B:46:0x00a6, B:48:0x00aa, B:49:0x00ad, B:51:0x00b3, B:52:0x00b6, B:54:0x00ba, B:56:0x00be, B:57:0x00c1, B:64:0x00ec, B:67:0x00f0, B:68:0x00f7, B:69:0x00f8, B:71:0x00fc, B:73:0x0109, B:75:0x006d, B:77:0x0071, B:78:0x0086, B:79:0x010d, B:80:0x0114), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba A[Catch: zzg -> 0x0115, TryCatch #0 {zzg -> 0x0115, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0037, B:19:0x0040, B:21:0x004b, B:22:0x004d, B:24:0x0053, B:25:0x005f, B:27:0x0066, B:30:0x0073, B:32:0x0077, B:34:0x007c, B:36:0x008a, B:38:0x008e, B:40:0x0094, B:41:0x0097, B:43:0x009d, B:44:0x00a0, B:46:0x00a6, B:48:0x00aa, B:49:0x00ad, B:51:0x00b3, B:52:0x00b6, B:54:0x00ba, B:56:0x00be, B:57:0x00c1, B:64:0x00ec, B:67:0x00f0, B:68:0x00f7, B:69:0x00f8, B:71:0x00fc, B:73:0x0109, B:75:0x006d, B:77:0x0071, B:78:0x0086, B:79:0x010d, B:80:0x0114), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109 A[Catch: zzg -> 0x0115, TryCatch #0 {zzg -> 0x0115, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0037, B:19:0x0040, B:21:0x004b, B:22:0x004d, B:24:0x0053, B:25:0x005f, B:27:0x0066, B:30:0x0073, B:32:0x0077, B:34:0x007c, B:36:0x008a, B:38:0x008e, B:40:0x0094, B:41:0x0097, B:43:0x009d, B:44:0x00a0, B:46:0x00a6, B:48:0x00aa, B:49:0x00ad, B:51:0x00b3, B:52:0x00b6, B:54:0x00ba, B:56:0x00be, B:57:0x00c1, B:64:0x00ec, B:67:0x00f0, B:68:0x00f7, B:69:0x00f8, B:71:0x00fc, B:73:0x0109, B:75:0x006d, B:77:0x0071, B:78:0x0086, B:79:0x010d, B:80:0x0114), top: B:10:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbsw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzh(Bundle bundle) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        int i;
        zzq zzqVar;
        if (!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.zzb;
            AdOverlayInfoParcel zza2 = AdOverlayInfoParcel.zza(activity.getIntent());
            this.zzc = zza2;
            if (zza2 == null) {
                throw new zzg("Could not get info for ad overlay.");
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
                this.zzv = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel2.zzo;
            if (zzlVar != null) {
                boolean z = zzlVar.zza;
                this.zzk = z;
                if (z) {
                    if (adOverlayInfoParcel2.zzk != 5 && zzlVar.zzf != -1) {
                        new zzk(this, null).zzb();
                    }
                }
                if (bundle == null) {
                    if (this.zzv) {
                        zzcwf zzcwfVar = this.zzc.zzt;
                        if (zzcwfVar != null) {
                            zzcwfVar.zza();
                        }
                        zzq zzqVar2 = this.zzc.zzc;
                        if (zzqVar2 != null) {
                            zzqVar2.zzh();
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                    if (adOverlayInfoParcel3.zzk != 1) {
                        com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel3.zzb;
                        if (zzaVar != null) {
                            zzaVar.onAdClicked();
                        }
                        zzddz zzddzVar = this.zzc.zzu;
                        if (zzddzVar != null) {
                            zzddzVar.zzdz();
                        }
                    }
                }
                adOverlayInfoParcel = this.zzc;
                if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
                    zzqVar.zzdt();
                }
                AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
                zzh zzhVar = new zzh(activity, adOverlayInfoParcel4.zzn, adOverlayInfoParcel4.zzm.afmaVersion, adOverlayInfoParcel4.zzs);
                this.zzl = zzhVar;
                zzhVar.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
                AdOverlayInfoParcel adOverlayInfoParcel5 = this.zzc;
                i = adOverlayInfoParcel5.zzk;
                if (i == 1) {
                    zzy(false);
                    return;
                }
                if (i == 2) {
                    this.zze = new zzi(adOverlayInfoParcel5.zzd);
                    zzy(false);
                    return;
                } else if (i == 3) {
                    zzy(true);
                    return;
                } else {
                    if (i != 5) {
                        throw new zzg("Could not determine ad overlay type.");
                    }
                    zzy(false);
                    return;
                }
            }
            if (adOverlayInfoParcel2.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel2.zzk != 5) {
                    new zzk(this, null).zzb();
                }
                if (bundle == null) {
                }
                adOverlayInfoParcel = this.zzc;
                if (adOverlayInfoParcel != null) {
                    zzqVar.zzdt();
                }
                AdOverlayInfoParcel adOverlayInfoParcel42 = this.zzc;
                zzh zzhVar2 = new zzh(activity, adOverlayInfoParcel42.zzn, adOverlayInfoParcel42.zzm.afmaVersion, adOverlayInfoParcel42.zzs);
                this.zzl = zzhVar2;
                zzhVar2.setId(1000);
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
                zzh zzhVar22 = new zzh(activity, adOverlayInfoParcel422.zzn, adOverlayInfoParcel422.zzm.afmaVersion, adOverlayInfoParcel422.zzs);
                this.zzl = zzhVar22;
                zzhVar22.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
                AdOverlayInfoParcel adOverlayInfoParcel522 = this.zzc;
                i = adOverlayInfoParcel522.zzk;
                if (i == 1) {
                }
            }
        } catch (zzg e) {
            String message = e.getMessage();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzi() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzqVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzqVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzj() {
        zzq zzqVar;
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfz)).booleanValue()) {
            zzcek zzcekVar = this.zzd;
            if (zzcekVar == null || zzcekVar.zzX()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzqVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzqVar.zzdu();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzk() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdC();
        }
        zzJ(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfz)).booleanValue()) {
            return;
        }
        zzcek zzcekVar = this.zzd;
        if (zzcekVar != null && !zzcekVar.zzX()) {
            this.zzd.onResume();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzl() {
        zzq zzqVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdB();
        }
        if (!((Boolean) zzbd.zzc().zzd(zzbci.zzfz)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzm(int i, int i2, Intent intent) {
        zzdsm zzI;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            zzbbz zzbbzVar = zzbci.zznV;
            if (((Boolean) zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i2);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                zzcek zzcekVar = this.zzd;
                if (zzcekVar == null || zzcekVar.zzP() == null || (zzI = zzcekVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.zzc) == null || !((Boolean) zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                    return;
                }
                zzdsl zza2 = zzI.zza();
                zza2.zzc("action", "hilca");
                zza2.zzc("gqi", zzghs.zza(adOverlayInfoParcel.zzq));
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

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzn(IObjectWrapper iObjectWrapper) {
        zzJ((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzp() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdD();
        }
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzfz)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzq() {
        zzq zzqVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzqVar = adOverlayInfoParcel.zzc) != null) {
            zzqVar.zzdE();
        }
        zzcek zzcekVar = this.zzd;
        if (zzcekVar != null) {
            try {
                this.zzl.removeView(zzcekVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        zzA();
    }

    public final void zzr(boolean z) {
        if (this.zzc.zzw) {
            return;
        }
        int intValue = ((Integer) zzbd.zzc().zzd(zzbci.zzfC)).intValue();
        boolean z2 = ((Boolean) zzbd.zzc().zzd(zzbci.zzbo)).booleanValue() || z;
        zzs zzsVar = new zzs();
        zzsVar.zzd = 50;
        zzsVar.zza = true != z2 ? 0 : intValue;
        zzsVar.zzb = true != z2 ? intValue : 0;
        zzsVar.zzc = intValue;
        this.zzf = new zzt(this.zzb, zzsVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzt(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzK(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzs() {
        this.zzs = true;
    }

    public final void zzt(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzbd.zzc().zzd(zzbci.zzbm)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z5 = ((Boolean) zzbd.zzc().zzd(zzbci.zzbn)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbsb(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzt zztVar = this.zzf;
        if (zztVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zztVar.zza(z3);
        }
    }

    public final void zzu(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }

    public final void zzv() {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i) {
        Activity activity = this.zzb;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzbd.zzc().zzd(zzbci.zzgu)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbd.zzc().zzd(zzbci.zzgv)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzbd.zzc().zzd(zzbci.zzgw)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzbd.zzc().zzd(zzbci.zzgx)).intValue()) {
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
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        activity.setContentView(this.zzh);
        this.zzs = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzy(boolean z) throws zzg {
        boolean z2;
        Resources.Theme theme;
        ?? r2;
        zzcek zzcekVar;
        if (!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        Activity activity = this.zzb;
        Window window = activity.getWindow();
        if (window == null) {
            throw new zzg("Invalid activity, no window available.");
        }
        zzcek zzcekVar2 = this.zzc.zzd;
        zzcgi zzP = zzcekVar2 != null ? zzcekVar2.zzP() : null;
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
                this.zzl.setBackgroundColor(-16777216);
            } else {
                this.zzl.setBackgroundColor(zza);
            }
            activity.setContentView(this.zzl);
            this.zzs = true;
            if (z) {
                theme = null;
                r2 = 0;
                zzcek zzcekVar3 = this.zzc.zzd;
                this.zzd = zzcekVar3;
                zzcekVar3.zzai(this.zzb);
            } else {
                try {
                    com.google.android.gms.ads.internal.zzt.zzd();
                    zzcek zzcekVar4 = this.zzc.zzd;
                    zzcgt zzN = zzcekVar4 != null ? zzcekVar4.zzN() : null;
                    zzcek zzcekVar5 = this.zzc.zzd;
                    String zzO = zzcekVar5 != null ? zzcekVar5.zzO() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                    VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                    zzcek zzcekVar6 = adOverlayInfoParcel.zzd;
                    String str = zzO;
                    theme = null;
                    boolean z4 = false;
                    zzcek zza2 = zzcfa.zza(activity, zzN, str, true, z3, null, null, versionInfoParcel, null, null, zzcekVar6 != null ? zzcekVar6.zzk() : null, zzbbh.zza(), null, null, null, null, null);
                    this.zzd = zza2;
                    zzcgi zzP2 = zza2.zzP();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    zzbib zzbibVar = adOverlayInfoParcel2.zzp;
                    zzbid zzbidVar = adOverlayInfoParcel2.zze;
                    zzac zzacVar = adOverlayInfoParcel2.zzi;
                    zzcek zzcekVar7 = adOverlayInfoParcel2.zzd;
                    zzP2.zzZ(null, zzbibVar, null, zzbidVar, zzacVar, true, null, zzcekVar7 != null ? zzcekVar7.zzP().zzh() : null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    this.zzd.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.ads.internal.overlay.zzf
                        @Override // com.google.android.gms.internal.ads.zzcgg
                        public final /* synthetic */ void zza(boolean z5, int i3, String str2, String str3) {
                            zzcek zzcekVar8 = zzl.this.zzd;
                            if (zzcekVar8 != null) {
                                zzcekVar8.zzI();
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
                            throw new zzg("No URL or HTML to display in ad overlay.");
                        }
                        this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str3, "text/html", "UTF-8", null);
                    }
                    zzcek zzcekVar8 = this.zzc.zzd;
                    r2 = z4;
                    if (zzcekVar8 != null) {
                        zzcekVar8.zzan(this);
                        r2 = z4;
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error obtaining webview.", e);
                    throw new zzg("Could not obtain webview for the overlay.", e);
                }
            }
            if (this.zzc.zzw) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.zzD(), r2);
            }
            this.zzd.zzae(this);
            zzcekVar = this.zzc.zzd;
            if (zzcekVar != null) {
                zzL(zzcekVar.zzU(), this.zzl);
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
                    this.zzw = toolbar;
                    toolbar.setId(View.generateViewId());
                    this.zzd.zzE().setId(View.generateViewId());
                    this.zzw.setBackgroundColor(-12303292);
                    this.zzw.setVisibility(r2);
                    try {
                        this.zzw.setNavigationIcon(com.google.android.gms.ads.internal.zzt.zzh().zzf().getDrawable(R.drawable.admob_close_button_white_cross, theme));
                    } catch (Resources.NotFoundException | NullPointerException e2) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", e2);
                    }
                    this.zzw.setNavigationOnClickListener(this.zzp);
                    this.zzw.setTitleMarginStart(r2);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(10);
                    this.zzl.addView(this.zzw, layoutParams);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(3, this.zzw.getId());
                    layoutParams2.addRule(12);
                    this.zzl.addView(this.zzd.zzE(), layoutParams2);
                    zzK(this.zzw);
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
            zzecz zze = zzeda.zze();
            zze.zza(activity2);
            zze.zzb(this);
            zze.zzc(this.zzc.zzq);
            zze.zzd(this.zzc.zzr);
            try {
                zzG(zze.zze());
                return;
            } catch (RemoteException | zzg e3) {
                throw new zzg(e3.getMessage(), e3);
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
        this.zzs = true;
        if (z) {
        }
        if (this.zzc.zzw) {
        }
        this.zzd.zzae(this);
        zzcekVar = this.zzc.zzd;
        if (zzcekVar != null) {
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
        Toolbar toolbar = this.zzw;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }
}
