package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.bumptech.glide.load.Key;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
final class zzcko extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcjl {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzckr zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbkf zzE;
    private zzbkc zzF;
    private zzber zzG;
    private int zzH;
    private int zzI;
    private zzbhq zzJ;
    private final zzbhq zzK;
    private zzbhq zzL;
    private final zzbhr zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbgd zzY;
    private boolean zzZ;
    private final zzcln zzb;
    private final zzazh zzc;
    private final zzfjo zzd;
    private final zzbil zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfir zzk;
    private zzfiu zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcjw zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzekb zzq;
    private zzejz zzr;
    private zzclv zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    protected zzcko(zzcln zzclnVar, zzclv zzclvVar, String str, boolean z, boolean z2, zzazh zzazhVar, zzbil zzbilVar, VersionInfoParcel versionInfoParcel, zzbht zzbhtVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbgd zzbgdVar, zzfir zzfirVar, zzfiu zzfiuVar, zzfjo zzfjoVar) {
        super(zzclnVar);
        zzfiu zzfiuVar2;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzclnVar;
        this.zzs = zzclvVar;
        this.zzt = str;
        this.zzw = z;
        this.zzc = zzazhVar;
        this.zzd = zzfjoVar;
        this.zze = zzbilVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics zzx = com.google.android.gms.ads.internal.util.zzs.zzx(windowManager);
        this.zzi = zzx;
        this.zzj = zzx.density;
        this.zzY = zzbgdVar;
        this.zzk = zzfirVar;
        this.zzl = zzfiuVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzclnVar.zzb(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzna)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmZ)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoG)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zze(zzclnVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzr(getContext(), settings);
        setDownloadListener(this);
        zzbc();
        addJavascriptInterface(new zzckw(this, new zzckv() { // from class: com.google.android.gms.internal.ads.zzcku
            @Override // com.google.android.gms.internal.ads.zzckv
            public final /* synthetic */ void zza(Uri uri) {
                zzcjw zzaS = ((zzcko) zzcjl.this).zzaS();
                if (zzaS != null) {
                    zzaS.zzQ(uri);
                } else {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        zzbhr zzbhrVar = new zzbhr(new zzbht(true, "make_wv", this.zzt));
        this.zzM = zzbhrVar;
        zzbhrVar.zzc().zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() && (zzfiuVar2 = this.zzl) != null && zzfiuVar2.zzb != null) {
            zzbhrVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbhrVar.zzc();
        zzbhq zzf = zzbht.zzf();
        this.zzK = zzf;
        zzbhrVar.zza("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzclnVar);
        com.google.android.gms.ads.internal.zzt.zzh().zzj();
    }

    private final synchronized void zzaZ(String str) {
        final String str2 = "about:blank";
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzckl
                private final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcko.this.zzaW(this.zzb);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdWebViewImpl.loadUrlUnsafe");
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void zzba() {
        Boolean zzc = com.google.android.gms.ads.internal.zzt.zzh().zzc();
        this.zzy = zzc;
        if (zzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(true);
            } catch (IllegalStateException unused) {
                zzaQ(false);
            }
        }
    }

    private final void zzbb() {
        zzbhl.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final synchronized void zzbc() {
        zzfir zzfirVar = this.zzk;
        if (zzfirVar != null && zzfirVar.zzam) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Disabling hardware acceleration on an overlay.");
            zzbd();
            return;
        }
        if (!this.zzw && !this.zzs.zzg()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbd() {
        if (!this.zzx) {
            setLayerType(1, null);
        }
        this.zzx = true;
    }

    private final synchronized void zzbe() {
        if (this.zzx) {
            setLayerType(0, null);
        }
        this.zzx = false;
    }

    private final synchronized void zzbf() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzh().zzk();
    }

    private final synchronized void zzbg() {
        Map map = this.zzW;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzchr) it.next()).release();
            }
        }
        this.zzW = null;
    }

    private final void zzbh() {
        zzbhr zzbhrVar = this.zzM;
        if (zzbhrVar == null) {
            return;
        }
        zzbht zzc = zzbhrVar.zzc();
        zzbhj zza2 = com.google.android.gms.ads.internal.zzt.zzh().zza();
        if (zza2 != null) {
            zza2.zzb(zzc);
        }
    }

    private final void zzbi(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zze("onAdVisibilityChanged", hashMap);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void destroy() {
        zzbh();
        this.zzQ.zzc();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzb();
            this.zzp.zzq();
            this.zzp = null;
        }
        this.zzq = null;
        this.zzr = null;
        this.zzo.zzF();
        this.zzG = null;
        this.zzg = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzv) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzB().zza(this);
        zzbg();
        this.zzv = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmk)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzY();
            return;
        }
        Activity zzb = this.zzb.zzb();
        if (zzb != null && zzb.isDestroyed()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzY();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaZ("about:blank");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzX()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzml)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcei.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcko.this.zzaU(str, valueCallback);
                }
            });
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzv) {
                    this.zzo.zzF();
                    com.google.android.gms.ads.internal.zzt.zzB().zza(this);
                    zzbg();
                    zzbf();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            super.loadData(str, str2, str3);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            try {
                if (!zzX()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final synchronized void loadUrl(final String str) {
        if (zzX()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcko.this.zzaV(str);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdWebViewImpl.loadUrl");
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzX()) {
            this.zzQ.zzd();
        }
        if (this.zzZ) {
            onResume();
            this.zzZ = false;
        }
        boolean z = this.zzC;
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null && zzcjwVar.zzl()) {
            if (!this.zzD) {
                this.zzo.zzo();
                this.zzo.zzp();
                this.zzD = true;
            }
            zzaM();
            z = true;
        }
        zzbi(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcjw zzcjwVar;
        synchronized (this) {
            if (!zzX()) {
                this.zzQ.zze();
            }
            super.onDetachedFromWindow();
            if (this.zzD && (zzcjwVar = this.zzo) != null && zzcjwVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzo.zzo();
                this.zzo.zzp();
                this.zzD = false;
            }
        }
        zzbi(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmz)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzaa(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
            zzcdu zzh = com.google.android.gms.ads.internal.zzt.zzh();
            String.valueOf(str);
            zzh.zzg(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaM = zzaM();
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL == null || !zzaM) {
            return;
        }
        zzL.zzC();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e3 A[Catch: all -> 0x0209, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0074, B:40:0x008a, B:44:0x007b, B:47:0x0080, B:51:0x0097, B:53:0x009f, B:55:0x00b1, B:58:0x00b6, B:60:0x00d2, B:61:0x00da, B:64:0x00d6, B:65:0x00df, B:67:0x00e7, B:70:0x00f2, B:77:0x0116, B:79:0x011d, B:83:0x0125, B:85:0x0137, B:87:0x0145, B:90:0x0152, B:94:0x0157, B:96:0x01cc, B:97:0x01cf, B:99:0x01d6, B:104:0x01e3, B:106:0x01e9, B:107:0x01ec, B:109:0x01f0, B:110:0x01f9, B:116:0x0204), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0137 A[Catch: all -> 0x0209, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0074, B:40:0x008a, B:44:0x007b, B:47:0x0080, B:51:0x0097, B:53:0x009f, B:55:0x00b1, B:58:0x00b6, B:60:0x00d2, B:61:0x00da, B:64:0x00d6, B:65:0x00df, B:67:0x00e7, B:70:0x00f2, B:77:0x0116, B:79:0x011d, B:83:0x0125, B:85:0x0137, B:87:0x0145, B:90:0x0152, B:94:0x0157, B:96:0x01cc, B:97:0x01cf, B:99:0x01d6, B:104:0x01e3, B:106:0x01e9, B:107:0x01ec, B:109:0x01f0, B:110:0x01f9, B:116:0x0204), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0157 A[Catch: all -> 0x0209, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0074, B:40:0x008a, B:44:0x007b, B:47:0x0080, B:51:0x0097, B:53:0x009f, B:55:0x00b1, B:58:0x00b6, B:60:0x00d2, B:61:0x00da, B:64:0x00d6, B:65:0x00df, B:67:0x00e7, B:70:0x00f2, B:77:0x0116, B:79:0x011d, B:83:0x0125, B:85:0x0137, B:87:0x0145, B:90:0x0152, B:94:0x0157, B:96:0x01cc, B:97:0x01cf, B:99:0x01d6, B:104:0x01e3, B:106:0x01e9, B:107:0x01ec, B:109:0x01f0, B:110:0x01f9, B:116:0x0204), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized void onMeasure(int i, int i2) {
        int i3;
        zzclv zzclvVar;
        boolean z;
        int i4;
        int i5;
        int i6 = 0;
        if (zzX()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzh()) {
            if (this.zzs.zzj()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzs.zzi()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeJ)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzckr zzh = zzh();
                float zzm = zzh != null ? zzh.zzm() : 0.0f;
                if (zzm == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                float f = size2 * zzm;
                int i7 = (int) (size / zzm);
                if (size2 == 0) {
                    if (i7 != 0) {
                        i5 = (int) (i7 * zzm);
                        i6 = size;
                        i4 = i7;
                        setMeasuredDimension(Math.min(i5, i6), Math.min(i7, i4));
                        return;
                    }
                    size2 = 0;
                }
                int i8 = (int) f;
                if (size != 0) {
                    i6 = size;
                } else if (i8 != 0) {
                    i7 = (int) (i8 / zzm);
                    i4 = size2;
                    i5 = i8;
                    i6 = i5;
                    setMeasuredDimension(Math.min(i5, i6), Math.min(i7, i4));
                    return;
                }
                i4 = size2;
                i5 = i8;
                setMeasuredDimension(Math.min(i5, i6), Math.min(i7, i4));
                return;
            }
            if (this.zzs.zzf()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeR)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzab("/contentHeight", new zzcki(this));
                zzaP("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.zzi.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i9 = this.zzI;
                setMeasuredDimension(size3, i9 != -1 ? (int) (i9 * f2) : View.MeasureSpec.getSize(i2));
                return;
            }
            if (this.zzs.zzg()) {
                DisplayMetrics displayMetrics = this.zzi;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size4 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size5 = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                i3 = Integer.MAX_VALUE;
                int i10 = (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
                zzclvVar = this.zzs;
                if (zzclvVar.zzb <= i3 && zzclvVar.zza <= i10) {
                    z = false;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgw)).booleanValue()) {
                        zzclv zzclvVar2 = this.zzs;
                        float f3 = zzclvVar2.zzb;
                        float f4 = this.zzj;
                        z &= f3 / f4 <= ((float) i3) / f4 && ((float) zzclvVar2.zza) / f4 <= ((float) i10) / f4;
                    }
                    if (z) {
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        if (!this.zzn) {
                            this.zzY.zzc(10002);
                            this.zzn = true;
                        }
                        zzclv zzclvVar3 = this.zzs;
                        setMeasuredDimension(zzclvVar3.zzb, zzclvVar3.zza);
                        return;
                    }
                    float f5 = this.zzs.zzb;
                    float f6 = this.zzj;
                    int i11 = (int) (f5 / f6);
                    int i12 = (int) (r2.zza / f6);
                    int i13 = (int) (size4 / f6);
                    int i14 = (int) (size5 / f6);
                    StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 36 + String.valueOf(i12).length() + 18 + String.valueOf(i13).length() + 1 + String.valueOf(i14).length() + 4);
                    sb.append("Not enough space to show ad. Needs ");
                    sb.append(i11);
                    sb.append("x");
                    sb.append(i12);
                    sb.append(" dp, but only has ");
                    sb.append(i13);
                    sb.append("x");
                    sb.append(i14);
                    sb.append(" dp.");
                    String sb2 = sb.toString();
                    int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                    if (this.zzm) {
                        return;
                    }
                    this.zzY.zzc(10001);
                    this.zzm = true;
                    return;
                }
                z = true;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgw)).booleanValue()) {
                }
                if (z) {
                }
            }
            i3 = size4;
            if (mode2 != Integer.MIN_VALUE) {
            }
            zzclvVar = this.zzs;
            if (zzclvVar.zzb <= i3) {
                z = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgw)).booleanValue()) {
                }
                if (z) {
                }
            }
            z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgw)).booleanValue()) {
            }
            if (z) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoa)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Muting webview");
                WebViewCompat.setAudioMuted(this, true);
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not pause webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzod)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoa)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unmuting webview");
                WebViewCompat.setAudioMuted(this, false);
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not resume webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzod)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzer)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z) {
            zzazh zzazhVar = this.zzc;
            if (zzazhVar != null) {
                zzazhVar.zzc(motionEvent);
            }
            zzbil zzbilVar = this.zze;
            if (zzbilVar != null) {
                zzbilVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbkf zzbkfVar = this.zzE;
                if (zzbkfVar != null) {
                    zzbkfVar.zzb(motionEvent);
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcjl
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcjw) {
            this.zzo = (zzcjw) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzA(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcjc
    public final zzfir zzC() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzclg
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final List zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzG() {
        zzbb();
        HashMap hashMap = new HashMap(1);
        hashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.zzf.afmaVersion);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzH(int i) {
        if (i == 0) {
            zzbhr zzbhrVar = this.zzM;
            zzbhl.zza(zzbhrVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        zzbhr zzbhrVar2 = this.zzM;
        zzbhrVar2.zzc();
        zzbhrVar2.zzc().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.zzf.afmaVersion);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzI() {
        if (this.zzJ == null) {
            zzbhr zzbhrVar = this.zzM;
            zzbhl.zza(zzbhrVar.zzc(), this.zzK, "aes2");
            zzbhrVar.zzc();
            zzbhq zzf = zzbht.zzf();
            this.zzJ = zzf;
            zzbhrVar.zza("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.zzf.afmaVersion);
        zze("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzJ() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzd()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzb()));
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzaa.zze(getContext())));
        zze("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final Context zzK() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcld
    public final synchronized zzclv zzN() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized String zzO() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final /* synthetic */ zzclj zzP() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final WebViewClient zzQ() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzR() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcle
    public final zzazh zzS() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final zzfjo zzT() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzekb zzU() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzejz zzV() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzW() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzX() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbf();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzckj(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zza(String str) {
        zzaP(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzaA(final boolean z, final int i) {
        destroy();
        zzbgc zzbgcVar = new zzbgc() { // from class: com.google.android.gms.internal.ads.zzckm
            @Override // com.google.android.gms.internal.ads.zzbgc
            public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar) {
                int i2 = zzcko.zza;
                zzbgj.zzbl.zza zzq = zzbgj.zzbl.zzq();
                boolean zzb = zzq.zzb();
                boolean z2 = z;
                if (zzb != z2) {
                    zzq.zzc(z2);
                }
                zzq.zzg(i);
                zzaVar.zzal(zzq.zzbu());
            }
        };
        zzbgd zzbgdVar = this.zzY;
        zzbgdVar.zzb(zzbgcVar);
        zzbgdVar.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcks
    public final zzfiu zzaC() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaD(zzfir zzfirVar, zzfiu zzfiuVar) {
        this.zzk = zzfirVar;
        this.zzl = zzfiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaE(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzu(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final ListenableFuture zzaF() {
        zzbil zzbilVar = this.zze;
        return zzbilVar == null ? zzgzo.zza(null) : zzbilVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaG(boolean z) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        this.zzo.zzv(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaI(boolean z, int i, boolean z2) {
        this.zzo.zzx(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaJ(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zzo.zzy(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaK(boolean z, int i, String str, String str2, boolean z2) {
        this.zzo.zzz(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaL(String str, String str2, int i) {
        this.zzo.zzw(str, str2, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r10.zzV != r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r10.zzV != r9) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzaM() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzo.zzk() || this.zzo.zzl()) {
            com.google.android.gms.ads.internal.client.zzbb.zza();
            DisplayMetrics displayMetrics = this.zzi;
            int zzA = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            int zzA2 = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.heightPixels);
            Activity zzb = this.zzb.zzb();
            if (zzb == null || zzb.getWindow() == null) {
                i = zzA;
                i2 = zzA2;
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzX = com.google.android.gms.ads.internal.util.zzs.zzX(zzb);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, zzX[0]);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                i2 = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, zzX[1]);
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            int rotation = this.zzX.getDefaultDisplay().getRotation();
            if (this.zzS == zzA && this.zzR == zzA2 && this.zzT == i && this.zzU == i2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaB)).booleanValue()) {
                }
            }
            if (this.zzS == zzA && this.zzR == zzA2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaB)).booleanValue()) {
                }
                this.zzS = zzA;
                this.zzR = zzA2;
                this.zzT = i;
                this.zzU = i2;
                this.zzV = rotation;
                new zzbwx(this, "").zzl(zzA, zzA2, i, i2, displayMetrics.density, rotation);
                return z;
            }
            z = true;
            this.zzS = zzA;
            this.zzR = zzA2;
            this.zzT = i;
            this.zzU = i2;
            this.zzV = rotation;
            new zzbwx(this, "").zzl(zzA, zzA2, i, i2, displayMetrics.density, rotation);
            return z;
        }
        return false;
    }

    protected final synchronized void zzaN(String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final synchronized void zzaO(String str, ValueCallback valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final void zzaP(String str) {
        if (zzaR() == null) {
            zzba();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN("javascript:".concat(str));
        }
    }

    final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzb(bool);
    }

    final synchronized Boolean zzaR() {
        return this.zzy;
    }

    public final zzcjw zzaS() {
        return this.zzo;
    }

    final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    final /* synthetic */ void zzaW(String str) {
        super.loadUrl("about:blank");
    }

    final /* synthetic */ int zzaX() {
        return this.zzI;
    }

    final /* synthetic */ void zzaY(int i) {
        this.zzI = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzab(String str, zzboh zzbohVar) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzB(str, zzbohVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzac(String str, zzboh zzbohVar) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzC(str, zzbohVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzad(String str, Predicate predicate) {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzE(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaf(zzclv zzclvVar) {
        this.zzs = zzclvVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzag(boolean z) {
        boolean z2 = this.zzw;
        this.zzw = z;
        zzbc();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaz)).booleanValue() || !this.zzs.zzg()) {
                new zzbwx(this, "").zzk(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzah() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzai(Context context) {
        zzcln zzclnVar = this.zzb;
        zzclnVar.setBaseContext(context);
        this.zzQ.zza(zzclnVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaj(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzt(this.zzo.zzk(), z);
        } else {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzak(zzekb zzekbVar) {
        this.zzq = zzekbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzal(zzejz zzejzVar) {
        this.zzr = zzejzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzam(int i) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzao(boolean z) {
        this.zzz = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzap() {
        if (this.zzL == null) {
            zzbhr zzbhrVar = this.zzM;
            zzbhrVar.zzc();
            zzbhq zzf = zzbht.zzf();
            this.zzL = zzf;
            zzbhrVar.zza("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzaq(zzbkf zzbkfVar) {
        this.zzE = zzbkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzbkf zzar() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzas(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i = this.zzH + (true != z ? -1 : 1);
        this.zzH = i;
        if (i > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzat() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzau(String str, String str2, String str3) {
        Throwable th;
        String str4;
        try {
            try {
                if (zzX()) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String[] strArr = new String[1];
                String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzay);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, str5);
                        jSONObject.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, "Google Mobile Ads");
                        jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to build MRAID_ENV", e);
                    str4 = null;
                }
                strArr[0] = str4;
                super.loadDataWithBaseURL(str, zzclc.zza(str2, strArr), "text/html", Key.STRING_CHARSET_NAME, null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzav() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final void zzaw(boolean z) {
        this.zzo.zzO(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzax(zzbkc zzbkcVar) {
        this.zzF = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized void zzay(zzber zzberVar) {
        this.zzG = zzberVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl
    public final synchronized zzber zzaz() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzc(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(sb2));
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        synchronized (this) {
            this.zzC = zzbddVar.zzj;
        }
        zzbi(zzbddVar.zzj);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdk() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdl() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzcft zzdm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzdn(boolean z) {
        this.zzo.zzM(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzcjw zzcjwVar = this.zzo;
        if (zzcjwVar != null) {
            zzcjwVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final synchronized zzckr zzh() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final zzbhq zzi() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzckx, com.google.android.gms.internal.ads.zzcge
    public final Activity zzj() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null) {
            zzL.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized String zzm() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized String zzn() {
        zzfiu zzfiuVar = this.zzl;
        if (zzfiuVar == null) {
            return null;
        }
        return zzfiuVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzo(int i) {
        this.zzN = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized int zzp() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final zzbhr zzq() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized zzchr zzr(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzchr) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzclf, com.google.android.gms.internal.ads.zzcge
    public final VersionInfoParcel zzs() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzt(String str, zzchr zzchrVar) {
        if (this.zzW == null) {
            this.zzW = new HashMap();
        }
        this.zzW.put(str, zzchrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzu(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        hashMap.put(TypedValues.TransitionType.S_DURATION, Long.toString(j));
        zze("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final void zzv(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcjl, com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzw(zzckr zzckrVar) {
        if (this.zzB == null) {
            this.zzB = zzckrVar;
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final int zzy() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcge
    public final synchronized void zzz() {
        zzbkc zzbkcVar = this.zzF;
        if (zzbkcVar != null) {
            zzbkcVar.zza();
        }
    }
}
