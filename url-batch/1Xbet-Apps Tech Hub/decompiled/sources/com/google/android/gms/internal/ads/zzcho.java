package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
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
import com.bumptech.glide.load.Key;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzfqv;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
final class zzcho extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcgv {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbfv zzC;
    private zzbft zzD;
    private zzaxd zzE;
    private int zzF;
    private int zzG;
    private zzbdr zzH;
    private final zzbdr zzI;
    private zzbdr zzJ;
    private final zzbds zzK;
    private int zzL;
    private com.google.android.gms.ads.internal.overlay.zzl zzM;
    private boolean zzN;
    private final com.google.android.gms.ads.internal.util.zzco zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private Map zzT;
    private final WindowManager zzU;
    private final zzayp zzV;
    private final zzcij zzb;
    private final zzasi zzc;
    private final zzbee zzd;
    private final zzcbt zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzfdu zzj;
    private zzfdy zzk;
    private boolean zzl;
    private boolean zzm;
    private zzchc zzn;
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    private zzflf zzp;
    private zzcik zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzchr zzz;

    protected zzcho(zzcij zzcijVar, zzcik zzcikVar, String str, boolean z, boolean z2, zzasi zzasiVar, zzbee zzbeeVar, zzcbt zzcbtVar, zzbdu zzbduVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzayp zzaypVar, zzfdu zzfduVar, zzfdy zzfdyVar) {
        super(zzcijVar);
        zzfdy zzfdyVar2;
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzP = -1;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzS = -1;
        this.zzb = zzcijVar;
        this.zzq = zzcikVar;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzasiVar;
        this.zzd = zzbeeVar;
        this.zze = zzcbtVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzU = windowManager;
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzs = com.google.android.gms.ads.internal.util.zzt.zzs(windowManager);
        this.zzh = zzs;
        this.zzi = zzs.density;
        this.zzV = zzaypVar;
        this.zzj = zzfduVar;
        this.zzk = zzfdyVar;
        this.zzO = new com.google.android.gms.ads.internal.util.zzco(zzcijVar.zza(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzcbn.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkL)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzp().zzc(zzcijVar, zzcbtVar.zza));
        com.google.android.gms.ads.internal.zzt.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzch.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfqv zzfqvVar = zzt.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaJ)).booleanValue()) {
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
        zzaS();
        addJavascriptInterface(new zzchv(this, new zzchu(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzba();
        zzbds zzbdsVar = new zzbds(new zzbdu(true, "make_wv", this.zzr));
        this.zzK = zzbdsVar;
        zzbdsVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbO)).booleanValue() && (zzfdyVar2 = this.zzk) != null && zzfdyVar2.zzb != null) {
            zzbdsVar.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbdsVar.zza();
        zzbdr zzf = zzbdu.zzf();
        this.zzI = zzf;
        zzbdsVar.zzb("native:view_create", zzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.util.zzck.zza().zzb(zzcijVar);
        com.google.android.gms.ads.internal.zzt.zzo().zzt();
    }

    private final synchronized void zzaS() {
        zzfdu zzfduVar = this.zzj;
        if (zzfduVar != null && zzfduVar.zzan) {
            zzcbn.zze("Disabling hardware acceleration on an overlay.");
            zzaU();
            return;
        }
        if (!this.zzu && !this.zzq.zzi()) {
            zzcbn.zze("Enabling hardware acceleration on an AdView.");
            zzaW();
            return;
        }
        zzcbn.zze("Enabling hardware acceleration on an overlay.");
        zzaW();
    }

    private final synchronized void zzaT() {
        if (this.zzN) {
            return;
        }
        this.zzN = true;
        com.google.android.gms.ads.internal.zzt.zzo().zzr();
    }

    private final synchronized void zzaU() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final void zzaV(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzaW() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaX(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            zzcbn.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzaY() {
        zzbdm.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzaZ() {
        Map map = this.zzT;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzcfh) it.next()).release();
            }
        }
        this.zzT = null;
    }

    private final void zzba() {
        zzbds zzbdsVar = this.zzK;
        if (zzbdsVar == null) {
            return;
        }
        zzbdu zza2 = zzbdsVar.zza();
        zzbdk zzg = com.google.android.gms.ads.internal.zzt.zzo().zzg();
        if (zzg != null) {
            zzg.zzf(zza2);
        }
    }

    private final synchronized void zzbb() {
        Boolean zzl = com.google.android.gms.ads.internal.zzt.zzo().zzl();
        this.zzw = zzl;
        if (zzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(true);
            } catch (IllegalStateException unused) {
                zzaQ(false);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgv
    public final synchronized void destroy() {
        zzba();
        this.zzO.zza();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzm();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzh();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
        zzaZ();
        this.zzt = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkc)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzU();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaX("about:blank");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!zzaz()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzcbn.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzh();
                    com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
                    zzaZ();
                    zzaT();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgv
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaz()) {
            zzcbn.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgv
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaz()) {
            zzcbn.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgv
    public final synchronized void loadUrl(String str) {
        if (zzaz()) {
            zzcbn.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "AdWebViewImpl.loadUrl");
            zzcbn.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzchc zzchcVar = this.zzn;
        if (zzchcVar != null) {
            zzchcVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaz()) {
            this.zzO.zzc();
        }
        boolean z = this.zzA;
        zzchc zzchcVar = this.zzn;
        if (zzchcVar != null && zzchcVar.zzL()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaR();
            z = true;
        }
        zzaV(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzchc zzchcVar;
        synchronized (this) {
            if (!zzaz()) {
                this.zzO.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzchcVar = this.zzn) != null && zzchcVar.zzL() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaV(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkm)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzS(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            zzcbn.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzaz()) {
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
        boolean zzaR = zzaR();
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzL();
        if (zzL == null || !zzaR) {
            return;
        }
        zzL.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b7 A[Catch: all -> 0x01dd, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x000f, B:12:0x0015, B:14:0x0019, B:17:0x0023, B:19:0x002b, B:22:0x0030, B:24:0x0038, B:26:0x004a, B:29:0x004f, B:31:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:41:0x008c, B:45:0x007d, B:48:0x0082, B:52:0x0099, B:54:0x00a1, B:56:0x00b3, B:59:0x00b8, B:61:0x00d4, B:62:0x00dc, B:65:0x00d8, B:66:0x00e1, B:68:0x00e9, B:71:0x00f4, B:78:0x0118, B:80:0x011f, B:84:0x0127, B:86:0x0139, B:88:0x0147, B:91:0x0154, B:95:0x0159, B:97:0x019f, B:98:0x01a3, B:100:0x01aa, B:105:0x01b7, B:107:0x01bd, B:108:0x01c0, B:110:0x01c4, B:111:0x01cd, B:117:0x01d8), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0139 A[Catch: all -> 0x01dd, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x000f, B:12:0x0015, B:14:0x0019, B:17:0x0023, B:19:0x002b, B:22:0x0030, B:24:0x0038, B:26:0x004a, B:29:0x004f, B:31:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:41:0x008c, B:45:0x007d, B:48:0x0082, B:52:0x0099, B:54:0x00a1, B:56:0x00b3, B:59:0x00b8, B:61:0x00d4, B:62:0x00dc, B:65:0x00d8, B:66:0x00e1, B:68:0x00e9, B:71:0x00f4, B:78:0x0118, B:80:0x011f, B:84:0x0127, B:86:0x0139, B:88:0x0147, B:91:0x0154, B:95:0x0159, B:97:0x019f, B:98:0x01a3, B:100:0x01aa, B:105:0x01b7, B:107:0x01bd, B:108:0x01c0, B:110:0x01c4, B:111:0x01cd, B:117:0x01d8), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0159 A[Catch: all -> 0x01dd, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x000f, B:12:0x0015, B:14:0x0019, B:17:0x0023, B:19:0x002b, B:22:0x0030, B:24:0x0038, B:26:0x004a, B:29:0x004f, B:31:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:41:0x008c, B:45:0x007d, B:48:0x0082, B:52:0x0099, B:54:0x00a1, B:56:0x00b3, B:59:0x00b8, B:61:0x00d4, B:62:0x00dc, B:65:0x00d8, B:66:0x00e1, B:68:0x00e9, B:71:0x00f4, B:78:0x0118, B:80:0x011f, B:84:0x0127, B:86:0x0139, B:88:0x0147, B:91:0x0154, B:95:0x0159, B:97:0x019f, B:98:0x01a3, B:100:0x01aa, B:105:0x01b7, B:107:0x01bd, B:108:0x01c0, B:110:0x01c4, B:111:0x01cd, B:117:0x01d8), top: B:3:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized void onMeasure(int i, int i2) {
        int i3;
        zzcik zzcikVar;
        boolean z;
        int i4;
        int i5;
        int i6 = 0;
        if (zzaz()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzu && !this.zzq.zzf()) {
            if (this.zzq.zzh()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzq.zzj()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdH)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzchr zzq = zzq();
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
            if (this.zzq.zzg()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdN)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzad("/contentHeight", new zzchm(this));
                zzaO("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.zzh.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i9 = this.zzG;
                setMeasuredDimension(size3, i9 != -1 ? (int) (i9 * f2) : View.MeasureSpec.getSize(i2));
                return;
            }
            if (this.zzq.zzi()) {
                DisplayMetrics displayMetrics = this.zzh;
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
                zzcikVar = this.zzq;
                if (zzcikVar.zzb <= i3 && zzcikVar.zza <= i10) {
                    z = false;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfp)).booleanValue()) {
                        zzcik zzcikVar2 = this.zzq;
                        float f3 = zzcikVar2.zzb;
                        float f4 = this.zzi;
                        z &= f3 / f4 <= ((float) i3) / f4 && ((float) zzcikVar2.zza) / f4 <= ((float) i10) / f4;
                    }
                    if (z) {
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        if (!this.zzm) {
                            this.zzV.zzc(10002);
                            this.zzm = true;
                        }
                        zzcik zzcikVar3 = this.zzq;
                        setMeasuredDimension(zzcikVar3.zzb, zzcikVar3.zza);
                        return;
                    }
                    zzcik zzcikVar4 = this.zzq;
                    float f5 = zzcikVar4.zzb;
                    float f6 = this.zzi;
                    zzcbn.zzj("Not enough space to show ad. Needs " + ((int) (f5 / f6)) + "x" + ((int) (zzcikVar4.zza / f6)) + " dp, but only has " + ((int) (size4 / f6)) + "x" + ((int) (size5 / f6)) + " dp.");
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                    if (this.zzl) {
                        return;
                    }
                    this.zzV.zzc(10001);
                    this.zzl = true;
                    return;
                }
                z = true;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfp)).booleanValue()) {
                }
                if (z) {
                }
            }
            i3 = size4;
            if (mode2 != Integer.MIN_VALUE) {
            }
            zzcikVar = this.zzq;
            if (zzcikVar.zzb <= i3) {
                z = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfp)).booleanValue()) {
                }
                if (z) {
                }
            }
            z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfp)).booleanValue()) {
            }
            if (z) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgv
    public final void onPause() {
        if (zzaz()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            zzcbn.zzh("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgv
    public final void onResume() {
        if (zzaz()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            zzcbn.zzh("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzL() || this.zzn.zzJ()) {
            zzasi zzasiVar = this.zzc;
            if (zzasiVar != null) {
                zzasiVar.zzd(motionEvent);
            }
            zzbee zzbeeVar = this.zzd;
            if (zzbeeVar != null) {
                zzbeeVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbfv zzbfvVar = this.zzC;
                if (zzbfvVar != null) {
                    zzbfvVar.zzd(motionEvent);
                }
            }
        }
        if (zzaz()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgv
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzchc) {
            this.zzn = (zzchc) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaz()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzcbn.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final synchronized void zzA(int i) {
        this.zzL = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcdw
    public final synchronized void zzC(zzchr zzchrVar) {
        if (this.zzz != null) {
            zzcbn.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzchrVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcgm
    public final zzfdu zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcif
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final WebViewClient zzH() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcid
    public final zzasi zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized zzaxd zzJ() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized zzbfv zzK() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final /* synthetic */ zzcii zzN() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcic
    public final synchronized zzcik zzO() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzchs
    public final zzfdy zzP() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized zzflf zzQ() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final ListenableFuture zzR() {
        zzbee zzbeeVar = this.zzd;
        return zzbeeVar == null ? zzgbb.zzh(null) : zzbeeVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized String zzS() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzT(zzfdu zzfduVar, zzfdy zzfdyVar) {
        this.zzj = zzfduVar;
        this.zzk = zzfdyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzU() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzaT();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzchn(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzV() {
        zzaY();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzW(int i) {
        if (i == 0) {
            zzbds zzbdsVar = this.zzK;
            zzbdm.zza(zzbdsVar.zza(), this.zzI, "aebb2");
        }
        zzaY();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzX() {
        if (this.zzH == null) {
            zzbds zzbdsVar = this.zzK;
            zzbdm.zza(zzbdsVar.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbdr zzf = zzbdu.zzf();
            this.zzH = zzf;
            this.zzK.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzZ(boolean z) {
        this.zzn.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized boolean zzaA() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized boolean zzaC() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzcia
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zzn.zzt(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcia
    public final void zzaE(String str, String str2, int i) {
        this.zzn.zzu(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcia
    public final void zzaF(boolean z, int i, boolean z2) {
        this.zzn.zzv(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcia
    public final void zzaG(boolean z, int i, String str, String str2, boolean z2) {
        this.zzn.zzx(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcia
    public final void zzaH(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zzn.zzy(z, i, str, z2, z3);
    }

    public final zzchc zzaJ() {
        return this.zzn;
    }

    final synchronized Boolean zzaK() {
        return this.zzw;
    }

    protected final synchronized void zzaN(String str, ValueCallback valueCallback) {
        if (zzaz()) {
            zzcbn.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    protected final void zzaO(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaP("javascript:".concat(str));
            return;
        }
        if (zzaK() == null) {
            zzbb();
        }
        if (zzaK().booleanValue()) {
            zzaN(str, null);
        } else {
            zzaP("javascript:".concat(str));
        }
    }

    protected final synchronized void zzaP(String str) {
        if (zzaz()) {
            zzcbn.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzx(bool);
    }

    public final boolean zzaR() {
        int i;
        int i2;
        if (this.zzn.zzK() || this.zzn.zzL()) {
            com.google.android.gms.ads.internal.client.zzay.zzb();
            DisplayMetrics displayMetrics = this.zzh;
            int zzv = zzcbg.zzv(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            DisplayMetrics displayMetrics2 = this.zzh;
            int zzv2 = zzcbg.zzv(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i = zzv;
                i2 = zzv2;
            } else {
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] zzP = com.google.android.gms.ads.internal.util.zzt.zzP(zza2);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int zzv3 = zzcbg.zzv(this.zzh, zzP[0]);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i2 = zzcbg.zzv(this.zzh, zzP[1]);
                i = zzv3;
            }
            int i3 = this.zzQ;
            if (i3 != zzv || this.zzP != zzv2 || this.zzR != i || this.zzS != i2) {
                boolean z = (i3 == zzv && this.zzP == zzv2) ? false : true;
                this.zzQ = zzv;
                this.zzP = zzv2;
                this.zzR = i;
                this.zzS = i2;
                new zzbss(this, "").zzi(zzv, zzv2, i, i2, this.zzh.density, this.zzU.getDefaultDisplay().getRotation());
                return z;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzaa() {
        this.zzO.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzab(String str, String str2, String str3) {
        String str4;
        if (zzaz()) {
            zzcbn.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzP);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e) {
            zzcbn.zzk("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, zzcib.zza(str2, strArr), "text/html", Key.STRING_CHARSET_NAME, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzac() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbdr zzf = zzbdu.zzf();
            this.zzJ = zzf;
            this.zzK.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzad(String str, zzbkd zzbkdVar) {
        zzchc zzchcVar = this.zzn;
        if (zzchcVar != null) {
            zzchcVar.zzz(str, zzbkdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzae() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzag(zzcik zzcikVar) {
        this.zzq = zzcikVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzah(zzaxd zzaxdVar) {
        this.zzE = zzaxdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzai(boolean z) {
        this.zzx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzaj() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzak(Context context) {
        this.zzb.setBaseContext(context);
        this.zzO.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzal(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzy(this.zzn.zzK(), z);
        } else {
            this.zzs = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzam(zzbft zzbftVar) {
        this.zzD = zzbftVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzan(boolean z) {
        boolean z2 = this.zzu;
        this.zzu = z;
        zzaS();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzQ)).booleanValue() || !this.zzq.zzi()) {
                new zzbss(this, "").zzk(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzao(zzbfv zzbfvVar) {
        this.zzC = zzbfvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzap(zzflf zzflfVar) {
        this.zzp = zzflfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzaq(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzM = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzas(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.zzF + (true != z ? -1 : 1);
        this.zzF = i;
        if (i > 0 || (zzlVar = this.zzo) == null) {
            return;
        }
        zzlVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized void zzat(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzB(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzau(String str, zzbkd zzbkdVar) {
        zzchc zzchcVar = this.zzn;
        if (zzchcVar != null) {
            zzchcVar.zzH(str, zzbkdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzav(String str, Predicate predicate) {
        zzchc zzchcVar = this.zzn;
        if (zzchcVar != null) {
            zzchcVar.zzI(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized boolean zzaw() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized boolean zzax() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final boolean zzay(final boolean z, final int i) {
        destroy();
        this.zzV.zzb(new zzayo() { // from class: com.google.android.gms.internal.ads.zzchl
            @Override // com.google.android.gms.internal.ads.zzayo
            public final void zza(zzbae zzbaeVar) {
                int i2 = zzcho.zza;
                zzbcj zza2 = zzbck.zza();
                boolean zzc = zza2.zzc();
                boolean z2 = z;
                if (zzc != z2) {
                    zza2.zza(z2);
                }
                zza2.zzb(i);
                zzbaeVar.zzj((zzbck) zza2.zzal());
            }
        });
        this.zzV.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final synchronized boolean zzaz() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzb(String str, String str2) {
        zzaO(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzbL() {
        zzchc zzchcVar = this.zzn;
        if (zzchcVar != null) {
            zzchcVar.zzbL();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbk() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbk();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbl() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final synchronized String zzbm() {
        zzfdy zzfdyVar = this.zzk;
        if (zzfdyVar == null) {
            return null;
        }
        return zzfdyVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final synchronized String zzbn() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzbu(zzavp zzavpVar) {
        synchronized (this) {
            this.zzA = zzavpVar.zzj;
        }
        zzaV(zzavpVar.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzcbn.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
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
        zzcbn.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzaO(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final synchronized int zzf() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzchw, com.google.android.gms.internal.ads.zzcdw
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcdw
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final zzbdr zzk() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcdw
    public final zzbds zzm() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcie, com.google.android.gms.internal.ads.zzcdw
    public final zzcbt zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final zzcdl zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final synchronized zzcfh zzp(String str) {
        Map map = this.zzT;
        if (map == null) {
            return null;
        }
        return (zzcfh) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcdw
    public final synchronized zzchr zzq() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzs() {
        zzchc zzchcVar = this.zzn;
        if (zzchcVar != null) {
            zzchcVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcdw
    public final synchronized void zzt(String str, zzcfh zzcfhVar) {
        if (this.zzT == null) {
            this.zzT = new HashMap();
        }
        this.zzT.put(str, zzcfhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzL();
        if (zzL != null) {
            zzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzv(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(FirebaseAnalytics.Param.SUCCESS, true != z ? "0" : "1");
        hashMap.put(TypedValues.TransitionType.S_DURATION, Long.toString(j));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final synchronized void zzw() {
        zzbft zzbftVar = this.zzD;
        if (zzbftVar != null) {
            final zzdok zzdokVar = (zzdok) zzbftVar;
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoi
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdok.this.zzd();
                    } catch (RemoteException e) {
                        zzcbn.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzz(boolean z) {
        this.zzn.zzC(false);
    }
}
