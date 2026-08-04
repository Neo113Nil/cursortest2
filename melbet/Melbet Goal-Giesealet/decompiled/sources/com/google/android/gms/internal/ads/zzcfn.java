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
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.facebook.hermes.intl.Constants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
final class zzcfn extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcek {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcfq zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbfj zzE;
    private zzbfg zzF;
    private zzazv zzG;
    private int zzH;
    private int zzI;
    private zzbcu zzJ;
    private final zzbcu zzK;
    private zzbcu zzL;
    private final zzbcv zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzl zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbbh zzY;
    private boolean zzZ;
    private final zzcgl zzb;
    private final zzauu zzc;
    private final zzfdg zzd;
    private final zzbdp zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfcj zzk;
    private zzfcm zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcev zzo;
    private com.google.android.gms.ads.internal.overlay.zzl zzp;
    private zzedu zzq;
    private zzeds zzr;
    private zzcgt zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    protected zzcfn(zzcgl zzcglVar, zzcgt zzcgtVar, String str, boolean z, boolean z2, zzauu zzauuVar, zzbdp zzbdpVar, VersionInfoParcel versionInfoParcel, zzbcx zzbcxVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbbh zzbbhVar, zzfcj zzfcjVar, zzfcm zzfcmVar, zzfdg zzfdgVar) {
        super(zzcglVar);
        zzfcm zzfcmVar2;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzcglVar;
        this.zzs = zzcgtVar;
        this.zzt = str;
        this.zzw = z;
        this.zzc = zzauuVar;
        this.zzd = zzfdgVar;
        this.zze = zzbdpVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics zzx = com.google.android.gms.ads.internal.util.zzs.zzx(windowManager);
        this.zzi = zzx;
        this.zzj = zzx.density;
        this.zzY = zzbbhVar;
        this.zzk = zzfcjVar;
        this.zzl = zzfcmVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzcglVar.zzb(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzms)).booleanValue()) {
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmr)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznY)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zze(zzcglVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzr(getContext(), settings);
        setDownloadListener(this);
        zzbc();
        addJavascriptInterface(new zzcfv(this, new zzcfu() { // from class: com.google.android.gms.internal.ads.zzcft
            @Override // com.google.android.gms.internal.ads.zzcfu
            public final /* synthetic */ void zza(Uri uri) {
                zzcev zzaS = ((zzcfn) zzcek.this).zzaS();
                if (zzaS != null) {
                    zzaS.zzO(uri);
                } else {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        zzbcv zzbcvVar = new zzbcv(new zzbcx(true, "make_wv", this.zzt));
        this.zzM = zzbcvVar;
        zzbcvVar.zzc().zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue() && (zzfcmVar2 = this.zzl) != null && zzfcmVar2.zzb != null) {
            zzbcvVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbcvVar.zzc();
        zzbcu zzf = zzbcx.zzf();
        this.zzK = zzf;
        zzbcvVar.zza("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcglVar);
        com.google.android.gms.ads.internal.zzt.zzh().zzj();
    }

    private final synchronized void zzaZ(String str) {
        final String str2 = "about:blank";
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcfk
                private final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcfn.this.zzaW(this.zzb);
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
        zzbcp.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final synchronized void zzbc() {
        zzfcj zzfcjVar = this.zzk;
        if (zzfcjVar != null && zzfcjVar.zzam) {
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
                ((zzccq) it.next()).release();
            }
        }
        this.zzW = null;
    }

    private final void zzbh() {
        zzbcv zzbcvVar = this.zzM;
        if (zzbcvVar == null) {
            return;
        }
        zzbcx zzc = zzbcvVar.zzc();
        zzbcn zza2 = com.google.android.gms.ads.internal.zzt.zzh().zza();
        if (zza2 != null) {
            zza2.zzb(zzc);
        }
    }

    private final void zzbi(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        zze("onAdVisibilityChanged", hashMap);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final synchronized void destroy() {
        zzbh();
        this.zzQ.zzc();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzp;
        if (zzlVar != null) {
            zzlVar.zzb();
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
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlC)).booleanValue()) {
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
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlD)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzbzh.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcfn.this.zzaU(str, valueCallback);
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

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            super.loadData(str, str2, str3);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
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

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final synchronized void loadUrl(final String str) {
        if (zzX()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcfn.this.zzaV(str);
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
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.onAdClicked();
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
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null && zzcevVar.zzl()) {
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
        zzcev zzcevVar;
        synchronized (this) {
            if (!zzX()) {
                this.zzQ.zze();
            }
            super.onDetachedFromWindow();
            if (this.zzD && (zzcevVar = this.zzo) != null && zzcevVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
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
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlR)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzY(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
            zzbyv zzh = com.google.android.gms.ads.internal.zzt.zzh();
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
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzL();
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
        zzcgt zzcgtVar;
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
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzen)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzcfq zzh = zzh();
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
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzev)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzab("/contentHeight", new zzcfh(this));
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
                zzcgtVar = this.zzs;
                if (zzcgtVar.zzb <= i3 && zzcgtVar.zza <= i10) {
                    z = false;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfW)).booleanValue()) {
                        zzcgt zzcgtVar2 = this.zzs;
                        float f3 = zzcgtVar2.zzb;
                        float f4 = this.zzj;
                        z &= f3 / f4 <= ((float) i3) / f4 && ((float) zzcgtVar2.zza) / f4 <= ((float) i10) / f4;
                    }
                    if (z) {
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        if (!this.zzn) {
                            this.zzY.zzc(10002);
                            this.zzn = true;
                        }
                        zzcgt zzcgtVar3 = this.zzs;
                        setMeasuredDimension(zzcgtVar3.zzb, zzcgtVar3.zza);
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
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfW)).booleanValue()) {
                }
                if (z) {
                }
            }
            i3 = size4;
            if (mode2 != Integer.MIN_VALUE) {
            }
            zzcgtVar = this.zzs;
            if (zzcgtVar.zzb <= i3) {
                z = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfW)).booleanValue()) {
                }
                if (z) {
                }
            }
            z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfW)).booleanValue()) {
            }
            if (z) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzns)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Muting webview");
                WebViewCompat.setAudioMuted(this, true);
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not pause webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznv)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzns)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unmuting webview");
                WebViewCompat.setAudioMuted(this, false);
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not resume webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznv)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdV)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z) {
            zzauu zzauuVar = this.zzc;
            if (zzauuVar != null) {
                zzauuVar.zzc(motionEvent);
            }
            zzbdp zzbdpVar = this.zze;
            if (zzbdpVar != null) {
                zzbdpVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbfj zzbfjVar = this.zzE;
                if (zzbfjVar != null) {
                    zzbfjVar.zzb(motionEvent);
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcek
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcev) {
            this.zzo = (zzcev) webViewClient;
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

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzA(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzceb
    public final zzfcj zzC() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcgf
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final List zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzG() {
        zzbb();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzH(int i) {
        if (i == 0) {
            zzbcv zzbcvVar = this.zzM;
            zzbcp.zza(zzbcvVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        zzbcv zzbcvVar2 = this.zzM;
        zzbcvVar2.zzc();
        zzbcvVar2.zzc().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzf.afmaVersion);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzI() {
        if (this.zzJ == null) {
            zzbcv zzbcvVar = this.zzM;
            zzbcp.zza(zzbcvVar.zzc(), this.zzK, "aes2");
            zzbcvVar.zzc();
            zzbcu zzf = zzbcx.zzf();
            this.zzJ = zzf;
            zzbcvVar.zza("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zze("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzJ() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzd()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzb()));
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzaa.zze(getContext())));
        zze("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final Context zzK() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcgc
    public final synchronized zzcgt zzN() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized String zzO() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final /* synthetic */ zzcgi zzP() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final WebViewClient zzQ() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzR() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcgd
    public final zzauu zzS() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final zzfdg zzT() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized zzedu zzU() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized zzeds zzV() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzW() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzX() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbf();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfi(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zza(String str) {
        zzaP(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzaA(final boolean z, final int i) {
        destroy();
        zzbbg zzbbgVar = new zzbbg() { // from class: com.google.android.gms.internal.ads.zzcfl
            @Override // com.google.android.gms.internal.ads.zzbbg
            public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar) {
                int i2 = zzcfn.zza;
                zzbbn.zzbl.zza zzq = zzbbn.zzbl.zzq();
                boolean zzb = zzq.zzb();
                boolean z2 = z;
                if (zzb != z2) {
                    zzq.zzc(z2);
                }
                zzq.zzg(i);
                zzaVar.zzal(zzq.zzbu());
            }
        };
        zzbbh zzbbhVar = this.zzY;
        zzbbhVar.zzb(zzbbgVar);
        zzbbhVar.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcfr
    public final zzfcm zzaC() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaD(zzfcj zzfcjVar, zzfcm zzfcmVar) {
        this.zzk = zzfcjVar;
        this.zzl = zzfcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzaE(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzp;
        if (zzlVar != null) {
            zzlVar.zzu(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final ListenableFuture zzaF() {
        zzbdp zzbdpVar = this.zze;
        return zzbdpVar == null ? zzgot.zza(null) : zzbdpVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaG(boolean z) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        this.zzo.zzv(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaI(boolean z, int i, boolean z2) {
        this.zzo.zzx(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaJ(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zzo.zzy(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zzaK(boolean z, int i, String str, String str2, boolean z2) {
        this.zzo.zzz(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcga
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
                int[] zzV = com.google.android.gms.ads.internal.util.zzs.zzV(zzb);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, zzV[0]);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                i2 = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, zzV[1]);
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            int rotation = this.zzX.getDefaultDisplay().getRotation();
            if (this.zzS == zzA && this.zzR == zzA2 && this.zzT == i && this.zzU == i2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzak)).booleanValue()) {
                }
            }
            if (this.zzS == zzA && this.zzR == zzA2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzak)).booleanValue()) {
                }
                this.zzS = zzA;
                this.zzR = zzA2;
                this.zzT = i;
                this.zzU = i2;
                this.zzV = rotation;
                new zzbsb(this, "").zzl(zzA, zzA2, i, i2, displayMetrics.density, rotation);
                return z;
            }
            z = true;
            this.zzS = zzA;
            this.zzR = zzA2;
            this.zzT = i;
            this.zzU = i2;
            this.zzV = rotation;
            new zzbsb(this, "").zzl(zzA, zzA2, i, i2, displayMetrics.density, rotation);
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
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaN("javascript:".concat(str));
            return;
        }
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

    public final zzcev zzaS() {
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

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzab(String str, zzbjl zzbjlVar) {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzB(str, zzbjlVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzac(String str, zzbjl zzbjlVar) {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzC(str, zzbjlVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzad(String str, Predicate predicate) {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzE(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzp = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzaf(zzcgt zzcgtVar) {
        this.zzs = zzcgtVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzag(boolean z) {
        boolean z2 = this.zzw;
        this.zzw = z;
        zzbc();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzai)).booleanValue() || !this.zzs.zzg()) {
                new zzbsb(this, "").zzk(true != z ? Constants.COLLATION_DEFAULT : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzah() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzai(Context context) {
        zzcgl zzcglVar = this.zzb;
        zzcglVar.setBaseContext(context);
        this.zzQ.zza(zzcglVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzaj(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzp;
        if (zzlVar != null) {
            zzlVar.zzt(this.zzo.zzk(), z);
        } else {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzak(zzedu zzeduVar) {
        this.zzq = zzeduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzal(zzeds zzedsVar) {
        this.zzr = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzam(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzp;
        if (zzlVar != null) {
            zzlVar.zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzan(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzO = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzao(boolean z) {
        this.zzz = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzap() {
        if (this.zzL == null) {
            zzbcv zzbcvVar = this.zzM;
            zzbcvVar.zzc();
            zzbcu zzf = zzbcx.zzf();
            this.zzL = zzf;
            zzbcvVar.zza("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzaq(zzbfj zzbfjVar) {
        this.zzE = zzbfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized zzbfj zzar() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzas(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.zzH + (true != z ? -1 : 1);
        this.zzH = i;
        if (i > 0 || (zzlVar = this.zzp) == null) {
            return;
        }
        zzlVar.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzat() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
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
                String str5 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzah);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
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
                super.loadDataWithBaseURL(str, zzcgb.zza(str2, strArr), "text/html", "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzav() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final void zzaw(boolean z) {
        this.zzo.zzM(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzax(zzbfg zzbfgVar) {
        this.zzF = zzbfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized void zzay(zzazv zzazvVar) {
        this.zzG = zzazvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcek
    public final synchronized zzazv zzaz() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zzc(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
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

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzdo(zzayh zzayhVar) {
        synchronized (this) {
            this.zzC = zzayhVar.zzj;
        }
        zzbi(zzayhVar.zzj);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdp() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdp();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdq() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzcas zzdr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzds(boolean z) {
        this.zzo.zzK(false);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        zzcev zzcevVar = this.zzo;
        if (zzcevVar != null) {
            zzcevVar.zzdz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final synchronized zzcfq zzh() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzbcu zzi() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcfw, com.google.android.gms.internal.ads.zzcbd
    public final Activity zzj() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzL();
        if (zzL != null) {
            zzL.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized String zzm() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized String zzn() {
        zzfcm zzfcmVar = this.zzl;
        if (zzfcmVar == null) {
            return null;
        }
        return zzfcmVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzo(int i) {
        this.zzN = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized int zzp() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final zzbcv zzq() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized zzccq zzr(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzccq) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbd
    public final VersionInfoParcel zzs() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzt(String str, zzccq zzccqVar) {
        if (this.zzW == null) {
            this.zzW = new HashMap();
        }
        this.zzW.put(str, zzccqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzu(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        zze("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzv(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcek, com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzw(zzcfq zzcfqVar) {
        if (this.zzB == null) {
            this.zzB = zzcfqVar;
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final int zzy() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final synchronized void zzz() {
        zzbfg zzbfgVar = this.zzF;
        if (zzbfgVar != null) {
            zzbfgVar.zza();
        }
    }
}
