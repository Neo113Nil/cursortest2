package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaal;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzarc;
import com.google.android.gms.internal.ads.zzasc;
import com.google.android.gms.internal.ads.zzasd;
import com.google.android.gms.internal.ads.zzhs;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zznk;
import java.util.Collections;

@zzadh
/* loaded from: classes.dex */
public class zzd extends zzaaq implements zzw {

    @VisibleForTesting
    private static final int zzbxm = Color.argb(0, 0, 0, 0);
    protected final Activity mActivity;

    @VisibleForTesting
    zzaqw zzbnd;

    @VisibleForTesting
    AdOverlayInfoParcel zzbxn;

    @VisibleForTesting
    private zzi zzbxo;

    @VisibleForTesting
    private zzo zzbxp;

    @VisibleForTesting
    private FrameLayout zzbxr;

    @VisibleForTesting
    private WebChromeClient.CustomViewCallback zzbxs;

    @VisibleForTesting
    private zzh zzbxv;
    private Runnable zzbxz;
    private boolean zzbya;
    private boolean zzbyb;

    @VisibleForTesting
    private boolean zzbxq = false;

    @VisibleForTesting
    private boolean zzbxt = false;

    @VisibleForTesting
    private boolean zzbxu = false;

    @VisibleForTesting
    private boolean zzbxw = false;

    @VisibleForTesting
    int zzbxx = 0;
    private final Object zzbxy = new Object();
    private boolean zzbyc = false;
    private boolean zzbyd = false;
    private boolean zzbye = true;

    public zzd(Activity activity) {
        this.mActivity = activity;
    }

    private final void zznl() {
        if (!this.mActivity.isFinishing() || this.zzbyc) {
            return;
        }
        this.zzbyc = true;
        if (this.zzbnd != null) {
            this.zzbnd.zzai(this.zzbxx);
            synchronized (this.zzbxy) {
                if (!this.zzbya && this.zzbnd.zzun()) {
                    this.zzbxz = new zzf(this);
                    zzakk.zzcrm.postDelayed(this.zzbxz, ((Long) zzkb.zzik().zzd(zznk.zzayq)).longValue());
                    return;
                }
            }
        }
        zznm();
    }

    private final void zzno() {
        this.zzbnd.zzno();
    }

    private final void zzs(boolean z) {
        int intValue = ((Integer) zzkb.zzik().zzd(zznk.zzben)).intValue();
        zzp zzpVar = new zzp();
        zzpVar.size = 50;
        zzpVar.paddingLeft = z ? intValue : 0;
        zzpVar.paddingRight = z ? 0 : intValue;
        zzpVar.paddingTop = 0;
        zzpVar.paddingBottom = intValue;
        this.zzbxp = new zzo(this.mActivity, zzpVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzbxn.zzbyr);
        this.zzbxv.addView(this.zzbxp, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        if (r18.mActivity.getResources().getConfiguration().orientation == 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        r18.zzbxw = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        if (r18.mActivity.getResources().getConfiguration().orientation == 2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzt(boolean z) throws zzg {
        boolean z2;
        boolean zzfz;
        zzh zzhVar;
        int i;
        ViewParent parent;
        if (!this.zzbyb) {
            this.mActivity.requestWindowFeature(1);
        }
        Window window = this.mActivity.getWindow();
        if (window == null) {
            throw new zzg("Invalid activity, no window available.");
        }
        if (PlatformVersion.isAtLeastN()) {
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbel)).booleanValue()) {
                zzbv.zzek();
                z2 = zzakk.zza(this.mActivity, this.mActivity.getResources().getConfiguration());
                boolean z3 = false;
                boolean z4 = this.zzbxn.zzbyw == null && this.zzbxn.zzbyw.zzzf;
                if ((this.zzbxu || z4) && z2) {
                    window.setFlags(1024, 1024);
                    if (((Boolean) zzkb.zzik().zzd(zznk.zzayr)).booleanValue() && PlatformVersion.isAtLeastKitKat() && this.zzbxn.zzbyw != null && this.zzbxn.zzbyw.zzzk) {
                        window.getDecorView().setSystemUiVisibility(4098);
                    }
                }
                zzasc zzuf = this.zzbxn.zzbyo == null ? this.zzbxn.zzbyo.zzuf() : null;
                zzfz = zzuf == null ? zzuf.zzfz() : false;
                this.zzbxw = false;
                if (zzfz) {
                    if (this.zzbxn.orientation != zzbv.zzem().zzrl()) {
                        if (this.zzbxn.orientation == zzbv.zzem().zzrm()) {
                        }
                    }
                }
                boolean z5 = this.zzbxw;
                StringBuilder sb = new StringBuilder(46);
                sb.append("Delay onShow to next orientation change: ");
                sb.append(z5);
                zzakb.zzck(sb.toString());
                setRequestedOrientation(this.zzbxn.orientation);
                if (zzbv.zzem().zza(window)) {
                    zzakb.zzck("Hardware acceleration on the AdActivity window enabled.");
                }
                if (this.zzbxu) {
                    zzhVar = this.zzbxv;
                    i = -16777216;
                } else {
                    zzhVar = this.zzbxv;
                    i = zzbxm;
                }
                zzhVar.setBackgroundColor(i);
                this.mActivity.setContentView(this.zzbxv);
                this.zzbyb = true;
                if (z) {
                    this.zzbnd = this.zzbxn.zzbyo;
                    this.zzbnd.zzbm(this.mActivity);
                } else {
                    try {
                        zzbv.zzel();
                        this.zzbnd = zzarc.zza(this.mActivity, this.zzbxn.zzbyo != null ? this.zzbxn.zzbyo.zzud() : null, this.zzbxn.zzbyo != null ? this.zzbxn.zzbyo.zzue() : null, true, zzfz, null, this.zzbxn.zzacr, null, null, this.zzbxn.zzbyo != null ? this.zzbxn.zzbyo.zzbi() : null, zzhs.zzhm());
                        this.zzbnd.zzuf().zza(null, this.zzbxn.zzbyx, null, this.zzbxn.zzbyp, this.zzbxn.zzbyt, true, null, this.zzbxn.zzbyo != null ? this.zzbxn.zzbyo.zzuf().zzut() : null, null, null);
                        this.zzbnd.zzuf().zza(new zzasd(this) { // from class: com.google.android.gms.ads.internal.overlay.zze
                            private final zzd zzbyf;

                            {
                                this.zzbyf = this;
                            }

                            @Override // com.google.android.gms.internal.ads.zzasd
                            public final void zze(boolean z6) {
                                this.zzbyf.zzbnd.zzno();
                            }
                        });
                        if (this.zzbxn.url != null) {
                            this.zzbnd.loadUrl(this.zzbxn.url);
                        } else {
                            if (this.zzbxn.zzbys == null) {
                                throw new zzg("No URL or HTML to display in ad overlay.");
                            }
                            this.zzbnd.loadDataWithBaseURL(this.zzbxn.zzbyq, this.zzbxn.zzbys, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8", null);
                        }
                        if (this.zzbxn.zzbyo != null) {
                            this.zzbxn.zzbyo.zzb(this);
                        }
                    } catch (Exception e) {
                        zzakb.zzb("Error obtaining webview.", e);
                        throw new zzg("Could not obtain webview for the overlay.");
                    }
                }
                this.zzbnd.zza(this);
                parent = this.zzbnd.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.zzbnd.getView());
                }
                if (this.zzbxu) {
                    this.zzbnd.zzur();
                }
                this.zzbxv.addView(this.zzbnd.getView(), -1, -1);
                if (!z && !this.zzbxw) {
                    zzno();
                }
                zzs(zzfz);
                if (this.zzbnd.zzuh()) {
                    return;
                }
                zza(zzfz, true);
                return;
            }
        }
        z2 = true;
        boolean z32 = false;
        if (this.zzbxn.zzbyw == null) {
        }
        if (this.zzbxu) {
        }
        window.setFlags(1024, 1024);
        if (((Boolean) zzkb.zzik().zzd(zznk.zzayr)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
        if (this.zzbxn.zzbyo == null) {
        }
        if (zzuf == null) {
        }
        this.zzbxw = false;
        if (zzfz) {
        }
        boolean z52 = this.zzbxw;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Delay onShow to next orientation change: ");
        sb2.append(z52);
        zzakb.zzck(sb2.toString());
        setRequestedOrientation(this.zzbxn.orientation);
        if (zzbv.zzem().zza(window)) {
        }
        if (this.zzbxu) {
        }
        zzhVar.setBackgroundColor(i);
        this.mActivity.setContentView(this.zzbxv);
        this.zzbyb = true;
        if (z) {
        }
        this.zzbnd.zza(this);
        parent = this.zzbnd.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.zzbnd.getView());
        }
        if (this.zzbxu) {
        }
        this.zzbxv.addView(this.zzbnd.getView(), -1, -1);
        if (!z) {
            zzno();
        }
        zzs(zzfz);
        if (this.zzbnd.zzuh()) {
        }
    }

    public final void close() {
        this.zzbxx = 2;
        this.mActivity.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onBackPressed() {
        this.zzbxx = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public void onCreate(Bundle bundle) {
        this.mActivity.requestWindowFeature(1);
        this.zzbxt = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.zzbxn = AdOverlayInfoParcel.zzc(this.mActivity.getIntent());
            if (this.zzbxn == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (this.zzbxn.zzacr.zzcvf > 7500000) {
                this.zzbxx = 3;
            }
            if (this.mActivity.getIntent() != null) {
                this.zzbye = this.mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.zzbxn.zzbyw != null) {
                this.zzbxu = this.zzbxn.zzbyw.zzze;
            } else {
                this.zzbxu = false;
            }
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbbg)).booleanValue() && this.zzbxu && this.zzbxn.zzbyw.zzzj != -1) {
                new zzj(this, null).zzqo();
            }
            if (bundle == null) {
                if (this.zzbxn.zzbyn != null && this.zzbye) {
                    this.zzbxn.zzbyn.zzcc();
                }
                if (this.zzbxn.zzbyu != 1 && this.zzbxn.zzbym != null) {
                    this.zzbxn.zzbym.onAdClicked();
                }
            }
            this.zzbxv = new zzh(this.mActivity, this.zzbxn.zzbyv, this.zzbxn.zzacr.zzcw);
            this.zzbxv.setId(1000);
            switch (this.zzbxn.zzbyu) {
                case 1:
                    zzt(false);
                    return;
                case 2:
                    this.zzbxo = new zzi(this.zzbxn.zzbyo);
                    zzt(false);
                    return;
                case 3:
                    zzt(true);
                    return;
                default:
                    throw new zzg("Could not determine ad overlay type.");
            }
        } catch (zzg e) {
            zzakb.zzdk(e.getMessage());
            this.zzbxx = 3;
            this.mActivity.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onDestroy() {
        if (this.zzbnd != null) {
            this.zzbxv.removeView(this.zzbnd.getView());
        }
        zznl();
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onPause() {
        zznh();
        if (this.zzbxn.zzbyn != null) {
            this.zzbxn.zzbyn.onPause();
        }
        if (!((Boolean) zzkb.zzik().zzd(zznk.zzbem)).booleanValue() && this.zzbnd != null && (!this.mActivity.isFinishing() || this.zzbxo == null)) {
            zzbv.zzem();
            zzakq.zzi(this.zzbnd);
        }
        zznl();
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onRestart() {
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onResume() {
        if (this.zzbxn.zzbyn != null) {
            this.zzbxn.zzbyn.onResume();
        }
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbem)).booleanValue()) {
            return;
        }
        if (this.zzbnd == null || this.zzbnd.isDestroyed()) {
            zzakb.zzdk("The webview does not exist. Ignoring action.");
        } else {
            zzbv.zzem();
            zzakq.zzj(this.zzbnd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzbxt);
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onStart() {
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbem)).booleanValue()) {
            if (this.zzbnd == null || this.zzbnd.isDestroyed()) {
                zzakb.zzdk("The webview does not exist. Ignoring action.");
            } else {
                zzbv.zzem();
                zzakq.zzj(this.zzbnd);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onStop() {
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbem)).booleanValue() && this.zzbnd != null && (!this.mActivity.isFinishing() || this.zzbxo == null)) {
            zzbv.zzem();
            zzakq.zzi(this.zzbnd);
        }
        zznl();
    }

    public final void setRequestedOrientation(int i) {
        if (this.mActivity.getApplicationInfo().targetSdkVersion >= ((Integer) zzkb.zzik().zzd(zznk.zzbfs)).intValue()) {
            if (this.mActivity.getApplicationInfo().targetSdkVersion <= ((Integer) zzkb.zzik().zzd(zznk.zzbft)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzkb.zzik().zzd(zznk.zzbfu)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzkb.zzik().zzd(zznk.zzbfv)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.mActivity.setRequestedOrientation(i);
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.zzbxr = new FrameLayout(this.mActivity);
        this.zzbxr.setBackgroundColor(-16777216);
        this.zzbxr.addView(view, -1, -1);
        this.mActivity.setContentView(this.zzbxr);
        this.zzbyb = true;
        this.zzbxs = customViewCallback;
        this.zzbxq = true;
    }

    public final void zza(boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = ((Boolean) zzkb.zzik().zzd(zznk.zzays)).booleanValue() && this.zzbxn != null && this.zzbxn.zzbyw != null && this.zzbxn.zzbyw.zzzl;
        boolean z5 = ((Boolean) zzkb.zzik().zzd(zznk.zzayt)).booleanValue() && this.zzbxn != null && this.zzbxn.zzbyw != null && this.zzbxn.zzbyw.zzzm;
        if (z && z2 && z4 && !z5) {
            new zzaal(this.zzbnd, "useCustomClose").zzbw("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        if (this.zzbxp != null) {
            zzo zzoVar = this.zzbxp;
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzoVar.zzu(z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void zzax() {
        this.zzbyb = true;
    }

    public final void zznh() {
        if (this.zzbxn != null && this.zzbxq) {
            setRequestedOrientation(this.zzbxn.orientation);
        }
        if (this.zzbxr != null) {
            this.mActivity.setContentView(this.zzbxv);
            this.zzbyb = true;
            this.zzbxr.removeAllViews();
            this.zzbxr = null;
        }
        if (this.zzbxs != null) {
            this.zzbxs.onCustomViewHidden();
            this.zzbxs = null;
        }
        this.zzbxq = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzw
    public final void zzni() {
        this.zzbxx = 1;
        this.mActivity.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final boolean zznj() {
        this.zzbxx = 0;
        if (this.zzbnd == null) {
            return true;
        }
        boolean zzul = this.zzbnd.zzul();
        if (!zzul) {
            this.zzbnd.zza("onbackblocked", Collections.emptyMap());
        }
        return zzul;
    }

    public final void zznk() {
        this.zzbxv.removeView(this.zzbxp);
        zzs(true);
    }

    @VisibleForTesting
    final void zznm() {
        if (this.zzbyd) {
            return;
        }
        this.zzbyd = true;
        if (this.zzbnd != null) {
            this.zzbxv.removeView(this.zzbnd.getView());
            if (this.zzbxo != null) {
                this.zzbnd.zzbm(this.zzbxo.zzrt);
                this.zzbnd.zzai(false);
                this.zzbxo.parent.addView(this.zzbnd.getView(), this.zzbxo.index, this.zzbxo.zzbyi);
                this.zzbxo = null;
            } else if (this.mActivity.getApplicationContext() != null) {
                this.zzbnd.zzbm(this.mActivity.getApplicationContext());
            }
            this.zzbnd = null;
        }
        if (this.zzbxn == null || this.zzbxn.zzbyn == null) {
            return;
        }
        this.zzbxn.zzbyn.zzcb();
    }

    public final void zznn() {
        if (this.zzbxw) {
            this.zzbxw = false;
            zzno();
        }
    }

    public final void zznp() {
        this.zzbxv.zzbyh = true;
    }

    public final void zznq() {
        synchronized (this.zzbxy) {
            this.zzbya = true;
            if (this.zzbxz != null) {
                zzakk.zzcrm.removeCallbacks(this.zzbxz);
                zzakk.zzcrm.post(this.zzbxz);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void zzo(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbel)).booleanValue() && PlatformVersion.isAtLeastN()) {
            Configuration configuration = (Configuration) ObjectWrapper.unwrap(iObjectWrapper);
            zzbv.zzek();
            if (zzakk.zza(this.mActivity, configuration)) {
                this.mActivity.getWindow().addFlags(1024);
                this.mActivity.getWindow().clearFlags(2048);
            } else {
                this.mActivity.getWindow().addFlags(2048);
                this.mActivity.getWindow().clearFlags(1024);
            }
        }
    }
}
