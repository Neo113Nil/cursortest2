package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
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
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.load.Key;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzayp;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzcbt;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzcig;
import com.google.android.gms.internal.ads.zzcii;
import com.google.android.gms.internal.ads.zzcik;
import com.google.android.gms.internal.ads.zzcyu;
import com.google.android.gms.internal.ads.zzdge;
import com.google.android.gms.internal.ads.zzefb;
import com.google.android.gms.internal.ads.zzefc;
import com.google.android.gms.internal.ads.zzflf;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzl extends zzbto implements zzad {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcgv zzd;
    zzh zze;
    zzr zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    private TextView zzv;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzaE)).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0045, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzaD)).booleanValue() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzJ(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zze = com.google.android.gms.ads.internal.zzt.zzq().zze(this.zzb, configuration);
        if (this.zzk && !z3) {
        }
        if (zze) {
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
            z2 = true;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzba.zzc().zza(zzbdc.zzbd)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z ? z2 ? 5894 : 5380 : 256);
            return;
        }
        if (!z) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z2) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    private static final void zzK(zzflf zzflfVar, View view) {
        if (zzflfVar == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzh(zzflfVar, view);
    }

    public final void zzA(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().zza(zzbdc.zzfX)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().zza(zzbdc.zzfY)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzba.zzc().zza(zzbdc.zzfZ)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzba.zzc().zza(zzbdc.zzga)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzv(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzD(boolean z) throws zzf {
        boolean z2;
        zzcgv zzcgvVar;
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window == null) {
            throw new zzf("Invalid activity, no window available.");
        }
        zzcgv zzcgvVar2 = this.zzc.zzd;
        zzcii zzN = zzcgvVar2 != null ? zzcgvVar2.zzN() : null;
        boolean z3 = zzN != null && zzN.zzK();
        this.zzm = false;
        if (z3) {
            int i = this.zzc.zzj;
            if (i == 6) {
                z2 = this.zzb.getResources().getConfiguration().orientation == 1;
                this.zzm = z2;
            } else if (i == 7) {
                z2 = this.zzb.getResources().getConfiguration().orientation == 2;
                this.zzm = z2;
            }
            zzcbn.zze("Delay onShow to next orientation change: " + z2);
            zzA(this.zzc.zzj);
            window.setFlags(16777216, 16777216);
            zzcbn.zze("Hardware acceleration on the AdActivity window enabled.");
            if (this.zzk) {
                this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.zzl.setBackgroundColor(zza);
            }
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            if (z) {
                zzcgv zzcgvVar3 = this.zzc.zzd;
                this.zzd = zzcgvVar3;
                zzcgvVar3.zzak(this.zzb);
            } else {
                try {
                    com.google.android.gms.ads.internal.zzt.zzz();
                    Activity activity = this.zzb;
                    zzcgv zzcgvVar4 = this.zzc.zzd;
                    zzcik zzO = zzcgvVar4 != null ? zzcgvVar4.zzO() : null;
                    zzcgv zzcgvVar5 = this.zzc.zzd;
                    String zzS = zzcgvVar5 != null ? zzcgvVar5.zzS() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                    zzcbt zzcbtVar = adOverlayInfoParcel.zzm;
                    zzcgv zzcgvVar6 = adOverlayInfoParcel.zzd;
                    zzcgv zza2 = zzchh.zza(activity, zzO, zzS, true, z3, null, null, zzcbtVar, null, null, zzcgvVar6 != null ? zzcgvVar6.zzj() : null, zzayp.zza(), null, null, null);
                    this.zzd = zza2;
                    zzcii zzN2 = zza2.zzN();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    zzbit zzbitVar = adOverlayInfoParcel2.zzp;
                    zzbiv zzbivVar = adOverlayInfoParcel2.zze;
                    zzz zzzVar = adOverlayInfoParcel2.zzi;
                    zzcgv zzcgvVar7 = adOverlayInfoParcel2.zzd;
                    zzN2.zzM(null, zzbitVar, null, zzbivVar, zzzVar, true, null, zzcgvVar7 != null ? zzcgvVar7.zzN().zzd() : null, null, null, null, null, null, null, null, null, null, null, null);
                    this.zzd.zzN().zzA(new zzcig() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // com.google.android.gms.internal.ads.zzcig
                        public final void zza(boolean z4, int i2, String str, String str2) {
                            zzcgv zzcgvVar8 = zzl.this.zzd;
                            if (zzcgvVar8 != null) {
                                zzcgvVar8.zzX();
                            }
                        }
                    });
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                    String str = adOverlayInfoParcel3.zzl;
                    if (str != null) {
                        this.zzd.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.zzh;
                        if (str2 == null) {
                            throw new zzf("No URL or HTML to display in ad overlay.");
                        }
                        this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", Key.STRING_CHARSET_NAME, null);
                    }
                    zzcgv zzcgvVar8 = this.zzc.zzd;
                    if (zzcgvVar8 != null) {
                        zzcgvVar8.zzar(this);
                    }
                } catch (Exception e) {
                    zzcbn.zzh("Error obtaining webview.", e);
                    throw new zzf("Could not obtain webview for the overlay.", e);
                }
            }
            if (this.zzc.zzw) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.zzG(), false);
            }
            this.zzd.zzaf(this);
            zzcgvVar = this.zzc.zzd;
            if (zzcgvVar != null) {
                zzK(zzcgvVar.zzQ(), this.zzl);
            }
            if (this.zzc.zzk != 5) {
                ViewParent parent = this.zzd.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.zzd.zzF());
                }
                if (this.zzk) {
                    this.zzd.zzaj();
                }
                if (this.zzc.zzw) {
                    TextView textView = new TextView(this.zzb);
                    this.zzv = textView;
                    textView.setId(View.generateViewId());
                    this.zzd.zzF().setId(View.generateViewId());
                    this.zzv.setTextAppearance(this.zzb, R.style.TextAppearance.Small);
                    this.zzv.setMinHeight(50);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                    this.zzv.setGravity(8388627);
                    this.zzl.addView(this.zzv, layoutParams);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams2.addRule(3, this.zzv.getId());
                    layoutParams2.addRule(12);
                    this.zzl.addView(this.zzd.zzF(), layoutParams2);
                } else {
                    this.zzl.addView(this.zzd.zzF(), -1, -1);
                }
            }
            if (!z && !this.zzm) {
                zze();
            }
            if (this.zzc.zzk == 5) {
                zzw(z3);
                if (this.zzd.zzaw()) {
                    zzy(z3, true);
                    return;
                }
                return;
            }
            Activity activity2 = this.zzb;
            zzefb zze = zzefc.zze();
            zze.zza(activity2);
            zze.zzb(this);
            zze.zzc(this.zzc.zzq);
            zze.zzd(this.zzc.zzr);
            try {
                zzf(zze.zze());
                return;
            } catch (RemoteException | zzf e2) {
                throw new zzf(e2.getMessage(), e2);
            }
        }
        z2 = false;
        zzcbn.zze("Delay onShow to next orientation change: " + z2);
        zzA(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        zzcbn.zze("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
        }
        this.zzb.setContentView(this.zzl);
        this.zzr = true;
        if (z) {
        }
        if (this.zzc.zzw) {
        }
        this.zzd.zzaf(this);
        zzcgvVar = this.zzc.zzd;
        if (zzcgvVar != null) {
        }
        if (this.zzc.zzk != 5) {
        }
        if (!z) {
            zze();
        }
        if (this.zzc.zzk == 5) {
        }
    }

    public final void zzE() {
        synchronized (this.zzo) {
            this.zzq = true;
            if (this.zzp != null) {
                com.google.android.gms.ads.internal.util.zzt.zza.removeCallbacks(this.zzp);
                com.google.android.gms.ads.internal.util.zzt.zza.post(this.zzp);
            }
        }
    }

    protected final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.zzb.isFinishing() || this.zzs) {
            return;
        }
        this.zzs = true;
        zzcgv zzcgvVar = this.zzd;
        if (zzcgvVar != null) {
            zzcgvVar.zzW(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzq && this.zzd.zzax()) {
                    if (((Boolean) zzba.zzc().zza(zzbdc.zzeH)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzbv();
                    }
                    this.zzp = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzl.this.zzc();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(this.zzp, ((Long) zzba.zzc().zza(zzbdc.zzaW)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    public final void zzG(String str) {
        TextView textView = this.zzv;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final boolean zzH() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().zza(zzbdc.zziJ)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzaC = this.zzd.zzaC();
        if (!zzaC) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaC;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
    }

    final void zzc() {
        zzcgv zzcgvVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcgv zzcgvVar2 = this.zzd;
        if (zzcgvVar2 != null) {
            this.zzl.removeView(zzcgvVar2.zzF());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.zzak(zzhVar.zzd);
                this.zzd.zzan(false);
                ViewGroup viewGroup = this.zze.zzc;
                View zzF = this.zzd.zzF();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(zzF, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzak(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbz(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcgvVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzK(zzcgvVar.zzQ(), this.zzc.zzd.zzF());
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    protected final void zze() {
        this.zzd.zzX();
    }

    public final void zzf(zzefc zzefcVar) throws zzf, RemoteException {
        zzbti zzbtiVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbtiVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzf("noioou");
        }
        zzbtiVar.zzg(ObjectWrapper.wrap(zzefcVar));
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
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

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzh(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzi() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzk(IObjectWrapper iObjectWrapper) {
        zzJ((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: zzf -> 0x0116, TryCatch #0 {zzf -> 0x0116, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0051, B:24:0x0059, B:25:0x0067, B:27:0x006e, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0092, B:38:0x0096, B:40:0x009c, B:41:0x009f, B:43:0x00a5, B:44:0x00a8, B:46:0x00ae, B:48:0x00b2, B:49:0x00b5, B:51:0x00bb, B:52:0x00be, B:59:0x00ed, B:62:0x00f1, B:63:0x00f8, B:64:0x00f9, B:66:0x00fd, B:68:0x010a, B:70:0x0075, B:72:0x0079, B:73:0x008e, B:74:0x010e, B:75:0x0115), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a A[Catch: zzf -> 0x0116, TryCatch #0 {zzf -> 0x0116, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0051, B:24:0x0059, B:25:0x0067, B:27:0x006e, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0092, B:38:0x0096, B:40:0x009c, B:41:0x009f, B:43:0x00a5, B:44:0x00a8, B:46:0x00ae, B:48:0x00b2, B:49:0x00b5, B:51:0x00bb, B:52:0x00be, B:59:0x00ed, B:62:0x00f1, B:63:0x00f8, B:64:0x00f9, B:66:0x00fd, B:68:0x010a, B:70:0x0075, B:72:0x0079, B:73:0x008e, B:74:0x010e, B:75:0x0115), top: B:10:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbtp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzl(Bundle bundle) {
        int i;
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zza2 = AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = zza2;
            if (zza2 == null) {
                throw new zzf("Could not get info for ad overlay.");
            }
            if (zza2.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.zzb.setShowWhenLocked(true);
                } else {
                    this.zzb.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.zzc > 7500000) {
                this.zzn = 4;
            }
            if (this.zzb.getIntent() != null) {
                this.zzu = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzj zzjVar = adOverlayInfoParcel.zzo;
            if (zzjVar != null) {
                boolean z = zzjVar.zza;
                this.zzk = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzjVar.zzf != -1) {
                        new zzk(this, null).zzb();
                    }
                }
                if (bundle == null) {
                    if (this.zzu) {
                        zzcyu zzcyuVar = this.zzc.zzt;
                        if (zzcyuVar != null) {
                            zzcyuVar.zze();
                        }
                        zzo zzoVar = this.zzc.zzc;
                        if (zzoVar != null) {
                            zzoVar.zzbw();
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    if (adOverlayInfoParcel2.zzk != 1) {
                        com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                        if (zzaVar != null) {
                            zzaVar.onAdClicked();
                        }
                        zzdge zzdgeVar = this.zzc.zzu;
                        if (zzdgeVar != null) {
                            zzdgeVar.zzbL();
                        }
                    }
                }
                Activity activity = this.zzb;
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                zzg zzgVar = new zzg(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.zza, adOverlayInfoParcel3.zzs);
                this.zzl = zzgVar;
                zzgVar.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzq().zzl(this.zzb);
                AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
                i = adOverlayInfoParcel4.zzk;
                if (i == 1) {
                    zzD(false);
                    return;
                }
                if (i == 2) {
                    this.zze = new zzh(adOverlayInfoParcel4.zzd);
                    zzD(false);
                    return;
                } else if (i == 3) {
                    zzD(true);
                    return;
                } else {
                    if (i != 5) {
                        throw new zzf("Could not determine ad overlay type.");
                    }
                    zzD(false);
                    return;
                }
            }
            if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzk(this, null).zzb();
                }
                if (bundle == null) {
                }
                Activity activity2 = this.zzb;
                AdOverlayInfoParcel adOverlayInfoParcel32 = this.zzc;
                zzg zzgVar2 = new zzg(activity2, adOverlayInfoParcel32.zzn, adOverlayInfoParcel32.zzm.zza, adOverlayInfoParcel32.zzs);
                this.zzl = zzgVar2;
                zzgVar2.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzq().zzl(this.zzb);
                AdOverlayInfoParcel adOverlayInfoParcel42 = this.zzc;
                i = adOverlayInfoParcel42.zzk;
                if (i == 1) {
                }
            } else {
                this.zzk = false;
                if (bundle == null) {
                }
                Activity activity22 = this.zzb;
                AdOverlayInfoParcel adOverlayInfoParcel322 = this.zzc;
                zzg zzgVar22 = new zzg(activity22, adOverlayInfoParcel322.zzn, adOverlayInfoParcel322.zzm.zza, adOverlayInfoParcel322.zzs);
                this.zzl = zzgVar22;
                zzgVar22.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzq().zzl(this.zzb);
                AdOverlayInfoParcel adOverlayInfoParcel422 = this.zzc;
                i = adOverlayInfoParcel422.zzk;
                if (i == 1) {
                }
            }
        } catch (zzf e) {
            zzcbn.zzj(e.getMessage());
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzm() {
        zzcgv zzcgvVar = this.zzd;
        if (zzcgvVar != null) {
            try {
                this.zzl.removeView(zzcgvVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzo() {
        zzo zzoVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbp();
        }
        if (!((Boolean) zzba.zzc().zza(zzbdc.zzeJ)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzp(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.zzb;
            zzefb zze = zzefc.zze();
            zze.zza(activity);
            zze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzf(strArr, iArr, ObjectWrapper.wrap(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzr() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbM();
        }
        zzJ(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzba.zzc().zza(zzbdc.zzeJ)).booleanValue()) {
            return;
        }
        zzcgv zzcgvVar = this.zzd;
        if (zzcgvVar == null || zzcgvVar.zzaz()) {
            zzcbn.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzt() {
        if (((Boolean) zzba.zzc().zza(zzbdc.zzeJ)).booleanValue()) {
            zzcgv zzcgvVar = this.zzd;
            if (zzcgvVar == null || zzcgvVar.zzaz()) {
                zzcbn.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzu() {
        if (((Boolean) zzba.zzc().zza(zzbdc.zzeJ)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzv() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zzby();
    }

    public final void zzw(boolean z) {
        int intValue = ((Integer) zzba.zzc().zza(zzbdc.zzeM)).intValue();
        boolean z2 = ((Boolean) zzba.zzc().zza(zzbdc.zzaZ)).booleanValue() || z;
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != z2 ? 0 : intValue;
        zzqVar.zzb = true != z2 ? intValue : 0;
        zzqVar.zzc = intValue;
        this.zzf = new zzr(this.zzb, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (!this.zzc.zzw || this.zzd == null) {
            layoutParams.addRule(true != z2 ? 9 : 11);
        } else {
            layoutParams.addRule(11);
            layoutParams.addRule(2, this.zzd.zzF().getId());
        }
        zzy(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzx() {
        this.zzr = true;
    }

    public final void zzy(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzba.zzc().zza(zzbdc.zzaX)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzba.zzc().zza(zzbdc.zzaY)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbss(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.zzf;
        if (zzrVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzrVar.zzb(z3);
        }
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }
}
