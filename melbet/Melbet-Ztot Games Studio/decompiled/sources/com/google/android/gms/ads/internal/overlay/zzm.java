package com.google.android.gms.ads.internal.overlay;

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
import android.widget.Toolbar;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbhp;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzcej;
import com.google.android.gms.internal.ads.zzcew;
import com.google.android.gms.internal.ads.zzcfz;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzcgd;
import com.google.android.gms.internal.ads.zzcxd;
import com.google.android.gms.internal.ads.zzdeq;
import com.google.android.gms.internal.ads.zzedt;
import com.google.android.gms.internal.ads.zzedu;
import com.google.android.gms.internal.ads.zzeem;
import com.google.android.gms.internal.ads.zzeeo;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public class zzm extends zzbsm implements zzae {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcej zzd;
    zzi zze;
    zzs zzf;
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
    private final View.OnClickListener zzp = new zzf(this);
    private boolean zzt = false;
    private boolean zzu = false;
    private boolean zzv = true;

    public zzm(Activity activity) {
        this.zzb = activity;
    }

    private final void zzJ(View view) {
        zzeeo zzQ;
        zzeem zzP;
        if (((Boolean) zzba.zzc().zza(zzbbw.zzeC)).booleanValue() && (zzP = this.zzd.zzP()) != null) {
            zzP.zza(view);
        } else if (((Boolean) zzba.zzc().zza(zzbbw.zzeB)).booleanValue() && (zzQ = this.zzd.zzQ()) != null && zzQ.zzb()) {
            com.google.android.gms.ads.internal.zzu.zzA().zzg(zzQ.zza(), view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzax)).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0045, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzaw)).booleanValue() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzK(Configuration configuration) {
        com.google.android.gms.ads.internal.zzk zzkVar;
        com.google.android.gms.ads.internal.zzk zzkVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (zzkVar2 = adOverlayInfoParcel.zzo) == null || !zzkVar2.zzb) ? false : true;
        boolean zzd = com.google.android.gms.ads.internal.zzu.zzq().zzd(this.zzb, configuration);
        if (this.zzk && !z3) {
        }
        if (zzd) {
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 != null && (zzkVar = adOverlayInfoParcel2.zzo) != null && zzkVar.zzg) {
            z2 = true;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzba.zzc().zza(zzbbw.zzaV)).booleanValue()) {
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
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        }
    }

    private static final void zzL(zzeeo zzeeoVar, View view) {
        if (zzeeoVar == null || view == null) {
            return;
        }
        if (((Boolean) zzba.zzc().zza(zzbbw.zzeB)).booleanValue() && zzeeoVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzj(zzeeoVar.zza(), view);
    }

    public final void zzA(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().zza(zzbbw.zzfq)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().zza(zzbbw.zzfr)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzba.zzc().zza(zzbbw.zzfs)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzba.zzc().zza(zzbbw.zzft)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "AdOverlay.setRequestedOrientation");
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
        this.zzs = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzD(boolean z) throws zzg {
        boolean z2;
        zzcej zzcejVar;
        if (!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window == null) {
            throw new zzg("Invalid activity, no window available.");
        }
        zzcej zzcejVar2 = this.zzc.zzd;
        zzcgb zzN = zzcejVar2 != null ? zzcejVar2.zzN() : null;
        boolean z3 = zzN != null && zzN.zzP();
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
            com.google.android.gms.ads.internal.util.client.zzm.zze("Delay onShow to next orientation change: " + z2);
            zzA(this.zzc.zzj);
            window.setFlags(16777216, 16777216);
            com.google.android.gms.ads.internal.util.client.zzm.zze("Hardware acceleration on the AdActivity window enabled.");
            if (this.zzk) {
                this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.zzl.setBackgroundColor(zza);
            }
            this.zzb.setContentView(this.zzl);
            this.zzs = true;
            if (z) {
                zzcej zzcejVar3 = this.zzc.zzd;
                this.zzd = zzcejVar3;
                zzcejVar3.zzan(this.zzb);
            } else {
                try {
                    com.google.android.gms.ads.internal.zzu.zzz();
                    Activity activity = this.zzb;
                    zzcej zzcejVar4 = this.zzc.zzd;
                    zzcgd zzO = zzcejVar4 != null ? zzcejVar4.zzO() : null;
                    zzcej zzcejVar5 = this.zzc.zzd;
                    String zzU = zzcejVar5 != null ? zzcejVar5.zzU() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                    VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                    zzcej zzcejVar6 = adOverlayInfoParcel.zzd;
                    zzcej zza2 = zzcew.zza(activity, zzO, zzU, true, z3, null, null, versionInfoParcel, null, null, zzcejVar6 != null ? zzcejVar6.zzj() : null, zzbav.zza(), null, null, null, null);
                    this.zzd = zza2;
                    zzcgb zzN2 = zza2.zzN();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    zzbhn zzbhnVar = adOverlayInfoParcel2.zzp;
                    zzbhp zzbhpVar = adOverlayInfoParcel2.zze;
                    zzaa zzaaVar = adOverlayInfoParcel2.zzi;
                    zzcej zzcejVar7 = adOverlayInfoParcel2.zzd;
                    zzN2.zzR(null, zzbhnVar, null, zzbhpVar, zzaaVar, true, null, zzcejVar7 != null ? zzcejVar7.zzN().zzd() : null, null, null, null, null, null, null, null, null, null, null, null);
                    this.zzd.zzN().zzB(new zzcfz() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // com.google.android.gms.internal.ads.zzcfz
                        public final void zza(boolean z4, int i2, String str, String str2) {
                            zzcej zzcejVar8 = zzm.this.zzd;
                            if (zzcejVar8 != null) {
                                zzcejVar8.zzaa();
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
                            throw new zzg("No URL or HTML to display in ad overlay.");
                        }
                        this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                    }
                    zzcej zzcejVar8 = this.zzc.zzd;
                    if (zzcejVar8 != null) {
                        zzcejVar8.zzaw(this);
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Error obtaining webview.", e);
                    throw new zzg("Could not obtain webview for the overlay.", e);
                }
            }
            if (this.zzc.zzw) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.zzG(), false);
            }
            this.zzd.zzai(this);
            zzcejVar = this.zzc.zzd;
            if (zzcejVar != null) {
                zzL(zzcejVar.zzQ(), this.zzl);
            }
            if (this.zzc.zzk != 5) {
                ViewParent parent = this.zzd.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.zzd.zzF());
                }
                if (this.zzk) {
                    this.zzd.zzam();
                }
                if (!this.zzc.zzw || Build.VERSION.SDK_INT < 24) {
                    this.zzl.addView(this.zzd.zzF(), -1, -1);
                } else {
                    Toolbar toolbar = new Toolbar(this.zzb);
                    this.zzw = toolbar;
                    toolbar.setId(View.generateViewId());
                    this.zzd.zzF().setId(View.generateViewId());
                    this.zzw.setBackgroundColor(-12303292);
                    this.zzw.setVisibility(0);
                    this.zzw.setNavigationIcon(com.google.android.gms.ads.internal.zzu.zzo().zze().getDrawable(R.drawable.admob_close_button_white_cross));
                    this.zzw.setNavigationOnClickListener(this.zzp);
                    this.zzw.setTitleMarginStart(0);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(10);
                    this.zzl.addView(this.zzw, layoutParams);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(3, this.zzw.getId());
                    layoutParams2.addRule(12);
                    this.zzl.addView(this.zzd.zzF(), layoutParams2);
                    zzJ(this.zzw);
                }
            }
            if (!z && !this.zzm) {
                zze();
            }
            if (this.zzc.zzk == 5) {
                zzw(z3);
                if (this.zzd.zzaB()) {
                    zzy(z3, true);
                    return;
                }
                return;
            }
            Activity activity2 = this.zzb;
            zzedt zze = zzedu.zze();
            zze.zza(activity2);
            zze.zzb(this);
            zze.zzc(this.zzc.zzq);
            zze.zzd(this.zzc.zzr);
            try {
                zzf(zze.zze());
                return;
            } catch (RemoteException | zzg e2) {
                throw new zzg(e2.getMessage(), e2);
            }
        }
        z2 = false;
        com.google.android.gms.ads.internal.util.client.zzm.zze("Delay onShow to next orientation change: " + z2);
        zzA(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.client.zzm.zze("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
        }
        this.zzb.setContentView(this.zzl);
        this.zzs = true;
        if (z) {
        }
        if (this.zzc.zzw) {
        }
        this.zzd.zzai(this);
        zzcejVar = this.zzc.zzd;
        if (zzcejVar != null) {
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
            this.zzr = true;
            if (this.zzq != null) {
                com.google.android.gms.ads.internal.util.zzt.zza.removeCallbacks(this.zzq);
                com.google.android.gms.ads.internal.util.zzt.zza.post(this.zzq);
            }
        }
    }

    protected final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzp zzpVar;
        if (!this.zzb.isFinishing() || this.zzt) {
            return;
        }
        this.zzt = true;
        zzcej zzcejVar = this.zzd;
        if (zzcejVar != null) {
            zzcejVar.zzZ(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzr && this.zzd.zzaC()) {
                    if (((Boolean) zzba.zzc().zza(zzbbw.zzen)).booleanValue() && !this.zzu && (adOverlayInfoParcel = this.zzc) != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
                        zzpVar.zzdq();
                    }
                    this.zzq = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzm.this.zzc();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(this.zzq, ((Long) zzba.zzc().zza(zzbbw.zzaO)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    public final void zzG(String str) {
        Toolbar toolbar = this.zzw;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final boolean zzH() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().zza(zzbbw.zzia)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzaH = this.zzd.zzaH();
        if (!zzaH) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaH;
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
        zzcej zzcejVar;
        zzp zzpVar;
        if (this.zzu) {
            return;
        }
        this.zzu = true;
        zzcej zzcejVar2 = this.zzd;
        if (zzcejVar2 != null) {
            this.zzl.removeView(zzcejVar2.zzF());
            zzi zziVar = this.zze;
            if (zziVar != null) {
                this.zzd.zzan(zziVar.zzd);
                this.zzd.zzaq(false);
                if (((Boolean) zzba.zzc().zza(zzbbw.zzlJ)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzF());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View zzF = this.zzd.zzF();
                zzi zziVar2 = this.zze;
                viewGroup.addView(zzF, zziVar2.zza, zziVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzan(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
            zzpVar.zzdu(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcejVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzcejVar.zzQ(), this.zzc.zzd.zzF());
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    protected final void zze() {
        this.zzd.zzaa();
    }

    public final void zzf(zzedu zzeduVar) throws zzg, RemoteException {
        zzbsg zzbsgVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbsgVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzg("noioou");
        }
        zzbsgVar.zzg(ObjectWrapper.wrap(zzeduVar));
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzA(adOverlayInfoParcel.zzj);
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

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzh(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzi() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzae
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzk(IObjectWrapper iObjectWrapper) {
        zzK((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: zzg -> 0x0116, TryCatch #0 {zzg -> 0x0116, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0051, B:24:0x0059, B:25:0x0067, B:27:0x006e, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0092, B:38:0x0096, B:40:0x009c, B:41:0x009f, B:43:0x00a5, B:44:0x00a8, B:46:0x00ae, B:48:0x00b2, B:49:0x00b5, B:51:0x00bb, B:52:0x00be, B:59:0x00ed, B:62:0x00f1, B:63:0x00f8, B:64:0x00f9, B:66:0x00fd, B:68:0x010a, B:70:0x0075, B:72:0x0079, B:73:0x008e, B:74:0x010e, B:75:0x0115), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a A[Catch: zzg -> 0x0116, TryCatch #0 {zzg -> 0x0116, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0051, B:24:0x0059, B:25:0x0067, B:27:0x006e, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0092, B:38:0x0096, B:40:0x009c, B:41:0x009f, B:43:0x00a5, B:44:0x00a8, B:46:0x00ae, B:48:0x00b2, B:49:0x00b5, B:51:0x00bb, B:52:0x00be, B:59:0x00ed, B:62:0x00f1, B:63:0x00f8, B:64:0x00f9, B:66:0x00fd, B:68:0x010a, B:70:0x0075, B:72:0x0079, B:73:0x008e, B:74:0x010e, B:75:0x0115), top: B:10:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbsn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzl(Bundle bundle) {
        int i;
        if (!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zza2 = AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = zza2;
            if (zza2 == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (zza2.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.zzb.setShowWhenLocked(true);
                } else {
                    this.zzb.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzn = 4;
            }
            if (this.zzb.getIntent() != null) {
                this.zzv = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzk zzkVar = adOverlayInfoParcel.zzo;
            if (zzkVar != null) {
                boolean z = zzkVar.zza;
                this.zzk = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzkVar.zzf != -1) {
                        new zzl(this, null).zzb();
                    }
                }
                if (bundle == null) {
                    if (this.zzv) {
                        zzcxd zzcxdVar = this.zzc.zzt;
                        if (zzcxdVar != null) {
                            zzcxdVar.zze();
                        }
                        zzp zzpVar = this.zzc.zzc;
                        if (zzpVar != null) {
                            zzpVar.zzdr();
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    if (adOverlayInfoParcel2.zzk != 1) {
                        com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                        if (zzaVar != null) {
                            zzaVar.onAdClicked();
                        }
                        zzdeq zzdeqVar = this.zzc.zzu;
                        if (zzdeqVar != null) {
                            zzdeqVar.zzdG();
                        }
                    }
                }
                Activity activity = this.zzb;
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                zzh zzhVar = new zzh(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.afmaVersion, adOverlayInfoParcel3.zzs);
                this.zzl = zzhVar;
                zzhVar.setId(1000);
                com.google.android.gms.ads.internal.zzu.zzq().zzk(this.zzb);
                AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
                i = adOverlayInfoParcel4.zzk;
                if (i == 1) {
                    zzD(false);
                    return;
                }
                if (i == 2) {
                    this.zze = new zzi(adOverlayInfoParcel4.zzd);
                    zzD(false);
                    return;
                } else if (i == 3) {
                    zzD(true);
                    return;
                } else {
                    if (i != 5) {
                        throw new zzg("Could not determine ad overlay type.");
                    }
                    zzD(false);
                    return;
                }
            }
            if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzl(this, null).zzb();
                }
                if (bundle == null) {
                }
                Activity activity2 = this.zzb;
                AdOverlayInfoParcel adOverlayInfoParcel32 = this.zzc;
                zzh zzhVar2 = new zzh(activity2, adOverlayInfoParcel32.zzn, adOverlayInfoParcel32.zzm.afmaVersion, adOverlayInfoParcel32.zzs);
                this.zzl = zzhVar2;
                zzhVar2.setId(1000);
                com.google.android.gms.ads.internal.zzu.zzq().zzk(this.zzb);
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
                zzh zzhVar22 = new zzh(activity22, adOverlayInfoParcel322.zzn, adOverlayInfoParcel322.zzm.afmaVersion, adOverlayInfoParcel322.zzs);
                this.zzl = zzhVar22;
                zzhVar22.setId(1000);
                com.google.android.gms.ads.internal.zzu.zzq().zzk(this.zzb);
                AdOverlayInfoParcel adOverlayInfoParcel422 = this.zzc;
                i = adOverlayInfoParcel422.zzk;
                if (i == 1) {
                }
            }
        } catch (zzg e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(e.getMessage());
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzm() {
        zzcej zzcejVar = this.zzd;
        if (zzcejVar != null) {
            try {
                this.zzl.removeView(zzcejVar.zzF());
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

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzo() {
        zzp zzpVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
            zzpVar.zzdk();
        }
        if (!((Boolean) zzba.zzc().zza(zzbbw.zzep)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzp(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.zzb;
            zzedt zze = zzedu.zze();
            zze.zza(activity);
            zze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzf(strArr, iArr, ObjectWrapper.wrap(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzr() {
        zzp zzpVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
            zzpVar.zzdH();
        }
        zzK(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzba.zzc().zza(zzbbw.zzep)).booleanValue()) {
            return;
        }
        zzcej zzcejVar = this.zzd;
        if (zzcejVar == null || zzcejVar.zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzt() {
        if (((Boolean) zzba.zzc().zza(zzbbw.zzep)).booleanValue()) {
            zzcej zzcejVar = this.zzd;
            if (zzcejVar == null || zzcejVar.zzaE()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzu() {
        if (((Boolean) zzba.zzc().zza(zzbbw.zzep)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzv() {
        zzp zzpVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzpVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzpVar.zzdt();
    }

    public final void zzw(boolean z) {
        if (this.zzc.zzw) {
            return;
        }
        int intValue = ((Integer) zzba.zzc().zza(zzbbw.zzes)).intValue();
        boolean z2 = ((Boolean) zzba.zzc().zza(zzbbw.zzaR)).booleanValue() || z;
        zzr zzrVar = new zzr();
        zzrVar.zzd = 50;
        zzrVar.zza = true != z2 ? 0 : intValue;
        zzrVar.zzb = true != z2 ? intValue : 0;
        zzrVar.zzc = intValue;
        this.zzf = new zzs(this.zzb, zzrVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzy(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzJ(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzx() {
        this.zzs = true;
    }

    public final void zzy(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzk zzkVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzk zzkVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzba.zzc().zza(zzbbw.zzaP)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzkVar2 = adOverlayInfoParcel2.zzo) != null && zzkVar2.zzh;
        boolean z5 = ((Boolean) zzba.zzc().zza(zzbbw.zzaQ)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzkVar = adOverlayInfoParcel.zzo) != null && zzkVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbrq(this.zzd, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzs zzsVar = this.zzf;
        if (zzsVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzsVar.zzb(z3);
        }
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }
}
