package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
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
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzfru;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
final class zzcfi extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcej {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcfl zzB;
    private boolean zzC;
    private boolean zzD;
    private zzber zzE;
    private zzbep zzF;
    private zzazj zzG;
    private int zzH;
    private int zzI;
    private zzbci zzJ;
    private final zzbci zzK;
    private zzbci zzL;
    private final zzbcj zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzck zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbav zzX;
    private boolean zzY;
    private final zzcgc zzb;
    private final zzauo zzc;
    private final zzffk zzd;
    private final zzbcz zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzm zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfel zzk;
    private zzfeo zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcer zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzeeo zzq;
    private zzeem zzr;
    private zzcgd zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    protected zzcfi(zzcgc zzcgcVar, zzcgd zzcgdVar, String str, boolean z, boolean z2, zzauo zzauoVar, zzbcz zzbczVar, VersionInfoParcel versionInfoParcel, zzbcl zzbclVar, com.google.android.gms.ads.internal.zzm zzmVar, com.google.android.gms.ads.internal.zza zzaVar, zzbav zzbavVar, zzfel zzfelVar, zzfeo zzfeoVar, zzffk zzffkVar) {
        super(zzcgcVar);
        zzfeo zzfeoVar2;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzcgcVar;
        this.zzs = zzcgdVar;
        this.zzt = str;
        this.zzw = z;
        this.zzc = zzauoVar;
        this.zzd = zzffkVar;
        this.zze = zzbczVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzmVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.zzu.zzp();
        DisplayMetrics zzt = com.google.android.gms.ads.internal.util.zzt.zzt(windowManager);
        this.zzi = zzt;
        this.zzj = zzt.density;
        this.zzX = zzbavVar;
        this.zzk = zzfelVar;
        this.zzl = zzfeoVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzck(zzcgcVar.zza(), this, this, null);
        this.zzY = false;
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkJ)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzu.zzp().zzc(zzcgcVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzu.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfru zzfruVar = zzt.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaC)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return true;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzba();
        addJavascriptInterface(new zzcfp(this, new zzcfo(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbcj zzbcjVar = new zzbcj(new zzbcl(true, "make_wv", this.zzt));
        this.zzM = zzbcjVar;
        zzbcjVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbG)).booleanValue() && (zzfeoVar2 = this.zzl) != null && zzfeoVar2.zzb != null) {
            zzbcjVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbcjVar.zza();
        zzbci zzf = zzbcl.zzf();
        this.zzK = zzf;
        zzbcjVar.zzb("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzcg.zza().zzb(zzcgcVar);
        com.google.android.gms.ads.internal.zzu.zzo().zzt();
    }

    private final synchronized void zzba() {
        zzfel zzfelVar = this.zzk;
        if (zzfelVar != null && zzfelVar.zzam) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Disabling hardware acceleration on an overlay.");
            zzbc();
            return;
        }
        if (!this.zzw && !this.zzs.zzi()) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbb() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzu.zzo().zzr();
    }

    private final synchronized void zzbc() {
        if (!this.zzx) {
            setLayerType(1, null);
        }
        this.zzx = true;
    }

    private final void zzbd(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzbe() {
        if (this.zzx) {
            setLayerType(0, null);
        }
        this.zzx = false;
    }

    private final synchronized void zzbf(String str) {
        try {
            final String str2 = "about:blank";
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkq)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcfd
                    public final /* synthetic */ String zzb = "about:blank";

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcfi.this.zzaW(this.zzb);
                    }
                });
            } else {
                super.loadUrl("about:blank");
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzbg() {
        zzbcd.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        Map map = this.zzV;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzccv) it.next()).release();
            }
        }
        this.zzV = null;
    }

    private final void zzbi() {
        zzbcj zzbcjVar = this.zzM;
        if (zzbcjVar == null) {
            return;
        }
        zzbcl zza2 = zzbcjVar.zza();
        zzbcb zzg = com.google.android.gms.ads.internal.zzu.zzo().zzg();
        if (zzg != null) {
            zzg.zzf(zza2);
        }
    }

    private final synchronized void zzbj() {
        Boolean zzl = com.google.android.gms.ads.internal.zzu.zzo().zzl();
        this.zzy = zzl;
        if (zzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaY(true);
            } catch (IllegalStateException unused) {
                zzaY(false);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final synchronized void destroy() {
        zzbi();
        this.zzQ.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzb();
            this.zzp.zzm();
            this.zzp = null;
        }
        this.zzq = null;
        this.zzr = null;
        this.zzo.zzh();
        this.zzG = null;
        this.zzg = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzv) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzy().zzd(this);
        zzbh();
        this.zzv = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjS)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzX();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzbf("about:blank");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjT)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzbzo.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfc
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfi.this.zzaU(str, valueCallback);
                }
            });
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzv) {
                    this.zzo.zzh();
                    com.google.android.gms.ads.internal.zzu.zzy().zzd(this);
                    zzbh();
                    zzbb();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final synchronized void loadUrl(final String str) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkq)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcff
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcfi.this.zzaV(str);
                    }
                });
            } else {
                super.loadUrl(str);
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "AdWebViewImpl.loadUrl");
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null) {
            zzcerVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaE()) {
            this.zzQ.zzc();
        }
        if (this.zzY) {
            onResume();
            this.zzY = false;
        }
        boolean z = this.zzC;
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null && zzcerVar.zzQ()) {
            if (!this.zzD) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = true;
            }
            zzaZ();
            z = true;
        }
        zzbd(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcer zzcerVar;
        synchronized (this) {
            if (!zzaE()) {
                this.zzQ.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzD && (zzcerVar = this.zzo) != null && zzcerVar.zzQ() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = false;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzke)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzaE()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
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
        boolean zzaZ = zzaZ();
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL == null || !zzaZ) {
            return;
        }
        zzL.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01bc A[Catch: all -> 0x01e2, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x000f, B:12:0x0015, B:14:0x0019, B:17:0x0023, B:19:0x002b, B:22:0x0030, B:24:0x0038, B:26:0x004a, B:29:0x004f, B:31:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0077, B:41:0x008e, B:45:0x007f, B:48:0x0084, B:52:0x009b, B:54:0x00a3, B:56:0x00b5, B:59:0x00ba, B:61:0x00d6, B:62:0x00df, B:65:0x00db, B:66:0x00e4, B:68:0x00ec, B:71:0x00f7, B:78:0x011d, B:80:0x0124, B:84:0x012c, B:86:0x013e, B:88:0x014c, B:91:0x0159, B:95:0x015e, B:97:0x01a4, B:98:0x01a8, B:100:0x01af, B:105:0x01bc, B:107:0x01c2, B:108:0x01c5, B:110:0x01c9, B:111:0x01d2, B:117:0x01dd), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013e A[Catch: all -> 0x01e2, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x000f, B:12:0x0015, B:14:0x0019, B:17:0x0023, B:19:0x002b, B:22:0x0030, B:24:0x0038, B:26:0x004a, B:29:0x004f, B:31:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0077, B:41:0x008e, B:45:0x007f, B:48:0x0084, B:52:0x009b, B:54:0x00a3, B:56:0x00b5, B:59:0x00ba, B:61:0x00d6, B:62:0x00df, B:65:0x00db, B:66:0x00e4, B:68:0x00ec, B:71:0x00f7, B:78:0x011d, B:80:0x0124, B:84:0x012c, B:86:0x013e, B:88:0x014c, B:91:0x0159, B:95:0x015e, B:97:0x01a4, B:98:0x01a8, B:100:0x01af, B:105:0x01bc, B:107:0x01c2, B:108:0x01c5, B:110:0x01c9, B:111:0x01d2, B:117:0x01dd), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015e A[Catch: all -> 0x01e2, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x000f, B:12:0x0015, B:14:0x0019, B:17:0x0023, B:19:0x002b, B:22:0x0030, B:24:0x0038, B:26:0x004a, B:29:0x004f, B:31:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0077, B:41:0x008e, B:45:0x007f, B:48:0x0084, B:52:0x009b, B:54:0x00a3, B:56:0x00b5, B:59:0x00ba, B:61:0x00d6, B:62:0x00df, B:65:0x00db, B:66:0x00e4, B:68:0x00ec, B:71:0x00f7, B:78:0x011d, B:80:0x0124, B:84:0x012c, B:86:0x013e, B:88:0x014c, B:91:0x0159, B:95:0x015e, B:97:0x01a4, B:98:0x01a8, B:100:0x01af, B:105:0x01bc, B:107:0x01c2, B:108:0x01c5, B:110:0x01c9, B:111:0x01d2, B:117:0x01dd), top: B:3:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized void onMeasure(int i, int i2) {
        int i3;
        zzcgd zzcgdVar;
        boolean z;
        int i4;
        int i5;
        int i6 = 0;
        if (zzaE()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzf()) {
            if (this.zzs.zzh()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzs.zzj()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdw)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzcfl zzq = zzq();
                float zze = zzq != null ? zzq.zze() : 0.0f;
                if (zze == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                float f = size2 * zze;
                int i7 = (int) (size / zze);
                if (size2 == 0) {
                    if (i7 != 0) {
                        i5 = (int) (i7 * zze);
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
                    i7 = (int) (i8 / zze);
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
            if (this.zzs.zzg()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdB)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzag("/contentHeight", new zzcfg(this));
                zzaT("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.zzi.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i9 = this.zzI;
                setMeasuredDimension(size3, i9 != -1 ? (int) (i9 * f2) : View.MeasureSpec.getSize(i2));
                return;
            }
            if (this.zzs.zzi()) {
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
                zzcgdVar = this.zzs;
                if (zzcgdVar.zzb <= i3 && zzcgdVar.zza <= i10) {
                    z = false;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeO)).booleanValue()) {
                        zzcgd zzcgdVar2 = this.zzs;
                        float f3 = zzcgdVar2.zzb;
                        float f4 = this.zzj;
                        z &= f3 / f4 <= ((float) i3) / f4 && ((float) zzcgdVar2.zza) / f4 <= ((float) i10) / f4;
                    }
                    if (z) {
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        if (!this.zzn) {
                            this.zzX.zzc(GamesActivityResultCodes.RESULT_SIGN_IN_FAILED);
                            this.zzn = true;
                        }
                        zzcgd zzcgdVar3 = this.zzs;
                        setMeasuredDimension(zzcgdVar3.zzb, zzcgdVar3.zza);
                        return;
                    }
                    zzcgd zzcgdVar4 = this.zzs;
                    float f5 = zzcgdVar4.zzb;
                    float f6 = this.zzj;
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Not enough space to show ad. Needs " + ((int) (f5 / f6)) + "x" + ((int) (zzcgdVar4.zza / f6)) + " dp, but only has " + ((int) (size4 / f6)) + "x" + ((int) (size5 / f6)) + " dp.");
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                    if (this.zzm) {
                        return;
                    }
                    this.zzX.zzc(GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED);
                    this.zzm = true;
                    return;
                }
                z = true;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeO)).booleanValue()) {
                }
                if (z) {
                }
            }
            i3 = size4;
            if (mode2 != Integer.MIN_VALUE) {
            }
            zzcgdVar = this.zzs;
            if (zzcgdVar.zzb <= i3) {
                z = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeO)).booleanValue()) {
                }
                if (z) {
                }
            }
            z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeO)).booleanValue()) {
            }
            if (z) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final void onPause() {
        if (zzaE()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlE)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Muting webview");
                WebViewCompat.setAudioMuted(this, true);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not pause webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlH)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final void onResume() {
        if (zzaE()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlE)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Unmuting webview");
                WebViewCompat.setAudioMuted(this, false);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not resume webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlH)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzo.zzQ() || this.zzo.zzO()) {
            zzauo zzauoVar = this.zzc;
            if (zzauoVar != null) {
                zzauoVar.zzd(motionEvent);
            }
            zzbcz zzbczVar = this.zze;
            if (zzbczVar != null) {
                zzbczVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzber zzberVar = this.zzE;
                if (zzberVar != null) {
                    zzberVar.zzd(motionEvent);
                }
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcej
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcer) {
            this.zzo = (zzcer) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final synchronized void zzA(int i) {
        this.zzN = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final synchronized void zzC(zzcfl zzcflVar) {
        if (this.zzB != null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzB = zzcflVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcea
    public final zzfel zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfy
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfw
    public final zzauo zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized zzazj zzJ() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized zzber zzK() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final /* synthetic */ zzcgb zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfv
    public final synchronized zzcgd zzO() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized zzeem zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized zzeeo zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfm
    public final zzfeo zzR() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final zzffk zzS() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final ListenableFuture zzT() {
        zzbcz zzbczVar = this.zze;
        return zzbczVar == null ? zzgcj.zzh(null) : zzbczVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized String zzU() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final List zzV() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzW(zzfel zzfelVar, zzfeo zzfeoVar) {
        this.zzk = zzfelVar;
        this.zzl = zzfeoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzX() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcfh(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzY() {
        zzbg();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzZ(int i) {
        if (i == 0) {
            zzbcj zzbcjVar = this.zzM;
            zzbcd.zza(zzbcjVar.zza(), this.zzK, "aebb2");
        }
        zzbg();
        this.zzM.zza();
        this.zzM.zza().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaA(String str, Predicate predicate) {
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null) {
            zzcerVar.zzN(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final boolean zzaD(final boolean z, final int i) {
        destroy();
        this.zzX.zzb(new zzbau() { // from class: com.google.android.gms.internal.ads.zzcfe
            @Override // com.google.android.gms.internal.ads.zzbau
            public final void zza(zzbbc.zzt.zza zzaVar) {
                int i2 = zzcfi.zza;
                zzbbc.zzbl.zza zzc = zzbbc.zzbl.zzc();
                boolean zzf = zzc.zzf();
                boolean z2 = z;
                if (zzf != z2) {
                    zzc.zzd(z2);
                }
                zzc.zze(i);
                zzaVar.zzab(zzc.zzbr());
            }
        });
        this.zzX.zzc(GamesActivityResultCodes.RESULT_LICENSE_FAILED);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2) {
        this.zzo.zzu(zzcVar, z, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaK(String str, String str2, int i) {
        this.zzo.zzv(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaL(boolean z, int i, boolean z2) {
        this.zzo.zzw(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaM(boolean z, int i, String str, String str2, boolean z2) {
        this.zzo.zzy(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaN(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zzo.zzz(z, i, str, z2, z3);
    }

    public final zzcer zzaO() {
        return this.zzo;
    }

    final synchronized Boolean zzaP() {
        return this.zzy;
    }

    protected final synchronized void zzaS(String str, ValueCallback valueCallback) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    protected final void zzaT(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaX("javascript:".concat(str));
            return;
        }
        if (zzaP() == null) {
            zzbj();
        }
        if (zzaP().booleanValue()) {
            zzaS(str, null);
        } else {
            zzaX("javascript:".concat(str));
        }
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

    protected final synchronized void zzaX(String str) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    final void zzaY(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzu.zzo().zzy(bool);
    }

    public final boolean zzaZ() {
        int i;
        int i2;
        if (this.zzo.zzP() || this.zzo.zzQ()) {
            com.google.android.gms.ads.internal.client.zzay.zzb();
            DisplayMetrics displayMetrics = this.zzi;
            int zzw = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            DisplayMetrics displayMetrics2 = this.zzi;
            int zzw2 = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i = zzw;
                i2 = zzw2;
            } else {
                com.google.android.gms.ads.internal.zzu.zzp();
                int[] zzQ = com.google.android.gms.ads.internal.util.zzt.zzQ(zza2);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int zzw3 = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zzi, zzQ[0]);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i2 = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zzi, zzQ[1]);
                i = zzw3;
            }
            int i3 = this.zzS;
            if (i3 != zzw || this.zzR != zzw2 || this.zzT != i || this.zzU != i2) {
                boolean z = (i3 == zzw && this.zzR == zzw2) ? false : true;
                this.zzS = zzw;
                this.zzR = zzw2;
                this.zzT = i;
                this.zzU = i2;
                new zzbrq(this, "").zzj(zzw, zzw2, i, i2, this.zzi.density, this.zzW.getDefaultDisplay().getRotation());
                return z;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaa() {
        if (this.zzJ == null) {
            zzbcj zzbcjVar = this.zzM;
            zzbcd.zza(zzbcjVar.zza(), this.zzK, "aes2");
            this.zzM.zza();
            zzbci zzf = zzbcl.zzf();
            this.zzJ = zzf;
            this.zzM.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzab() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzac(boolean z) {
        this.zzo.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzad() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzae(String str, String str2, String str3) {
        String str4;
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzI);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        super.loadDataWithBaseURL(str, zzcfu.zzb(str2, str4), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaf() {
        if (this.zzL == null) {
            this.zzM.zza();
            zzbci zzf = zzbcl.zzf();
            this.zzL = zzf;
            this.zzM.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzag(String str, zzbix zzbixVar) {
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null) {
            zzcerVar.zzA(str, zzbixVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzah() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzaj(zzcgd zzcgdVar) {
        this.zzs = zzcgdVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzak(zzazj zzazjVar) {
        this.zzG = zzazjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzal(boolean z) {
        this.zzz = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzan(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzao(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzy(this.zzo.zzP(), z);
        } else {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzap(zzbep zzbepVar) {
        this.zzF = zzbepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzaq(boolean z) {
        boolean z2 = this.zzw;
        this.zzw = z;
        zzba();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzJ)).booleanValue() || !this.zzs.zzi()) {
                new zzbrq(this, "").zzl(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzar(zzber zzberVar) {
        this.zzE = zzberVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzas(zzeem zzeemVar) {
        this.zzr = zzeemVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzat(zzeeo zzeeoVar) {
        this.zzq = zzeeoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzau(int i) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzav(boolean z) {
        this.zzY = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzax(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i = this.zzH + (true != z ? -1 : 1);
        this.zzH = i;
        if (i > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final synchronized void zzay(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzB(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaz(String str, zzbix zzbixVar) {
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null) {
            zzcerVar.zzM(str, zzbixVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzb(String str, String str2) {
        zzaT(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdG() {
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null) {
            zzcerVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdf() {
        zzcer zzcerVar = this.zzo;
        if (zzcerVar != null) {
            zzcerVar.zzdf();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final synchronized void zzdg() {
        com.google.android.gms.ads.internal.zzm zzmVar = this.zzg;
        if (zzmVar != null) {
            zzmVar.zzdg();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final synchronized void zzdh() {
        com.google.android.gms.ads.internal.zzm zzmVar = this.zzg;
        if (zzmVar != null) {
            zzmVar.zzdh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final synchronized String zzdi() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzdp(zzaxv zzaxvVar) {
        synchronized (this) {
            this.zzC = zzaxvVar.zzj;
        }
        zzbd(zzaxvVar.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzaT(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final synchronized int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfq, com.google.android.gms.internal.ads.zzcbk
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final zzbci zzk() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final zzbcj zzm() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfx, com.google.android.gms.internal.ads.zzcbk
    public final VersionInfoParcel zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final zzcaz zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final synchronized zzccv zzp(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzccv) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final synchronized zzcfl zzq() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final synchronized String zzr() {
        zzfeo zzfeoVar = this.zzl;
        if (zzfeoVar == null) {
            return null;
        }
        return zzfeoVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final synchronized void zzt(String str, zzccv zzccvVar) {
        if (this.zzV == null) {
            this.zzV = new HashMap();
        }
        this.zzV.put(str, zzccvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null) {
            zzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzv(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put(TypedValues.TransitionType.S_DURATION, Long.toString(j));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final synchronized void zzw() {
        zzbep zzbepVar = this.zzF;
        if (zzbepVar != null) {
            final zzdnb zzdnbVar = (zzdnb) zzbepVar;
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmz
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdnb.this.zzd();
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzz(boolean z) {
        this.zzo.zzD(false);
    }
}
