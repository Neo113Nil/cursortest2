package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.net.HttpHeaders;
import io.ktor.http.auth.HttpAuthHeader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public class zzchc extends WebViewClient implements zzcii {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final zzefa zzE;
    private View.OnAttachStateChangeListener zzF;
    protected zzbyo zza;
    private final zzcgv zzc;
    private final zzayp zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzo zzh;
    private zzcig zzi;
    private zzcih zzj;
    private zzbit zzk;
    private zzbiv zzl;
    private zzdge zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.ads.internal.overlay.zzz zzv;
    private zzbsr zzw;
    private com.google.android.gms.ads.internal.zzb zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbsm zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfD)).split(",")));

    public zzchc(zzcgv zzcgvVar, zzayp zzaypVar, boolean z, zzbsr zzbsrVar, zzbsm zzbsmVar, zzefa zzefaVar) {
        this.zzd = zzaypVar;
        this.zzc = zzcgvVar;
        this.zzs = z;
        this.zzw = zzbsrVar;
        this.zzE = zzefaVar;
    }

    private static WebResourceResponse zzN() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaI)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzO(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                com.google.android.gms.ads.internal.zzt.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().zza, false, httpURLConnection, false, 60000);
                webResourceResponse = null;
                zzcbm zzcbmVar = new zzcbm(null);
                zzcbmVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzcbmVar.zze(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    break;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    zzcbn.zzj("Protocol is null");
                    webResourceResponse = zzN();
                    break;
                }
                if (!protocol.equals("http") && !protocol.equals("https")) {
                    zzcbn.zzj("Unsupported scheme: " + protocol);
                    webResourceResponse = zzN();
                    break;
                }
                zzcbn.zze("Redirecting to " + headerField);
                httpURLConnection.disconnect();
                url = url2;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.zzt.zzp();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            com.google.android.gms.ads.internal.zzt.zzp();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i2 = 1;
                    while (true) {
                        if (i2 >= split.length) {
                            break;
                        }
                        if (split[i2].trim().startsWith(HttpAuthHeader.Parameters.Charset)) {
                            String[] split2 = split[i2].trim().split("=");
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i2++;
                    }
                }
            }
            String str3 = str2;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            webResourceResponse = com.google.android.gms.ads.internal.zzt.zzq().zzc(trim, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbkd) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzQ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzR(final View view, final zzbyo zzbyoVar, final int i) {
        if (!zzbyoVar.zzi() || i <= 0) {
            return;
        }
        zzbyoVar.zzg(view);
        if (zzbyoVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgw
                @Override // java.lang.Runnable
                public final void run() {
                    zzchc.this.zzo(view, zzbyoVar, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzS(zzcgv zzcgvVar) {
        if (zzcgvVar.zzD() != null) {
            return zzcgvVar.zzD().zzaj;
        }
        return false;
    }

    private static final boolean zzT(boolean z, zzcgv zzcgvVar) {
        return (!z || zzcgvVar.zzO().zzi() || zzcgvVar.zzS().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaz()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzU();
                return;
            }
            this.zzz = true;
            zzcih zzcihVar = this.zzj;
            if (zzcihVar != null) {
                zzcihVar.zza();
                this.zzj = null;
            }
            zzg();
            if (this.zzc.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkY)).booleanValue()) {
                    this.zzc.zzL().zzG(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzay(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case Opcodes.LOR /* 129 */:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbyo zzbyoVar = this.zza;
                        if (zzbyoVar != null) {
                            zzbyoVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdge zzdgeVar = this.zzm;
                    if (zzdgeVar != null) {
                        zzdgeVar.zzbL();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                zzcbn.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzasi zzI = this.zzc.zzI();
                    if (zzI != null && zzI.zzf(parse)) {
                        Context context = this.zzc.getContext();
                        zzcgv zzcgvVar = this.zzc;
                        parse = zzI.zza(parse, context, (View) zzcgvVar, zzcgvVar.zzi());
                    }
                } catch (zzasj unused) {
                    zzcbn.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzx;
                if (zzbVar == null || zzbVar.zzc()) {
                    zzt(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                } else {
                    zzbVar.zzb(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzA(zzcig zzcigVar) {
        this.zzi = zzcigVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzB(int i, int i2) {
        zzbsm zzbsmVar = this.zzy;
        if (zzbsmVar != null) {
            zzbsmVar.zzd(i, i2);
        }
    }

    public final void zzC(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzD(boolean z) {
        synchronized (this.zzf) {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzE() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcca.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgx
                @Override // java.lang.Runnable
                public final void run() {
                    zzchc.this.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzF(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzG(zzcih zzcihVar) {
        this.zzj = zzcihVar;
    }

    public final void zzH(String str, zzbkd zzbkdVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbkdVar);
        }
    }

    public final void zzI(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbkd> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbkd zzbkdVar : list) {
                if (predicate.apply(zzbkdVar)) {
                    arrayList.add(zzbkdVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzJ() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final boolean zzK() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzL() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzM(com.google.android.gms.ads.internal.client.zza zzaVar, zzbit zzbitVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbiv zzbivVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, boolean z, zzbkf zzbkfVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbst zzbstVar, zzbyo zzbyoVar, final zzeep zzeepVar, final zzfla zzflaVar, zzdtp zzdtpVar, zzfje zzfjeVar, zzbkw zzbkwVar, final zzdge zzdgeVar, zzbkv zzbkvVar, zzbkp zzbkpVar, final zzcpo zzcpoVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbyoVar, null) : zzbVar;
        this.zzy = new zzbsm(this.zzc, zzbstVar);
        this.zza = zzbyoVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaQ)).booleanValue()) {
            zzz("/adMetadata", new zzbis(zzbitVar));
        }
        if (zzbivVar != null) {
            zzz("/appEvent", new zzbiu(zzbivVar));
        }
        zzz("/backButton", zzbkc.zzj);
        zzz("/refresh", zzbkc.zzk);
        zzz("/canOpenApp", zzbkc.zzb);
        zzz("/canOpenURLs", zzbkc.zza);
        zzz("/canOpenIntents", zzbkc.zzc);
        zzz("/close", zzbkc.zzd);
        zzz("/customClose", zzbkc.zze);
        zzz("/instrument", zzbkc.zzn);
        zzz("/delayPageLoaded", zzbkc.zzp);
        zzz("/delayPageClosed", zzbkc.zzq);
        zzz("/getLocationInfo", zzbkc.zzr);
        zzz("/log", zzbkc.zzg);
        zzz("/mraid", new zzbkj(zzbVar2, this.zzy, zzbstVar));
        zzbsr zzbsrVar = this.zzw;
        if (zzbsrVar != null) {
            zzz("/mraidLoaded", zzbsrVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzz("/open", new zzbko(zzbVar2, this.zzy, zzeepVar, zzdtpVar, zzfjeVar, zzcpoVar));
        zzz("/precache", new zzcfi());
        zzz("/touch", zzbkc.zzi);
        zzz("/video", zzbkc.zzl);
        zzz("/videoMeta", zzbkc.zzm);
        if (zzeepVar == null || zzflaVar == null) {
            zzz("/click", new zzbjb(zzdgeVar, zzcpoVar));
            zzz("/httpTrack", zzbkc.zzf);
        } else {
            zzz("/click", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzfew
                @Override // com.google.android.gms.internal.ads.zzbkd
                public final void zza(Object obj, Map map) {
                    zzcgv zzcgvVar = (zzcgv) obj;
                    zzbkc.zzc(map, zzdge.this);
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcbn.zzj("URL missing from click GMSG.");
                        return;
                    }
                    zzeep zzeepVar2 = zzeepVar;
                    zzfla zzflaVar2 = zzflaVar;
                    zzgbb.zzr(zzbkc.zza(zzcgvVar, str), new zzfey(zzcgvVar, zzcpoVar, zzflaVar2, zzeepVar2), zzcca.zza);
                }
            });
            zzz("/httpTrack", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzfex
                @Override // com.google.android.gms.internal.ads.zzbkd
                public final void zza(Object obj, Map map) {
                    zzcgm zzcgmVar = (zzcgm) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcbn.zzj("URL missing from httpTrack GMSG.");
                    } else if (zzcgmVar.zzD().zzaj) {
                        zzeepVar.zzd(new zzeer(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), ((zzchs) zzcgmVar).zzP().zzb, str, 2));
                    } else {
                        zzfla.this.zzc(str, null);
                    }
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zzc.getContext())) {
            zzz("/logScionEvent", new zzbki(this.zzc.getContext()));
        }
        if (zzbkfVar != null) {
            zzz("/setInterstitialProperties", new zzbke(zzbkfVar));
        }
        if (zzbkwVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziJ)).booleanValue()) {
                zzz("/inspectorNetworkExtras", zzbkwVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjc)).booleanValue() && zzbkvVar != null) {
            zzz("/shareSheet", zzbkvVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjh)).booleanValue() && zzbkpVar != null) {
            zzz("/inspectorOutOfContextTest", zzbkpVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkF)).booleanValue()) {
            zzz("/bindPlayStoreOverlay", zzbkc.zzu);
            zzz("/presentPlayStoreOverlay", zzbkc.zzv);
            zzz("/expandPlayStoreOverlay", zzbkc.zzw);
            zzz("/collapsePlayStoreOverlay", zzbkc.zzx);
            zzz("/closePlayStoreOverlay", zzbkc.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcY)).booleanValue()) {
            zzz("/setPAIDPersonalizationEnabled", zzbkc.zzA);
            zzz("/resetPAID", zzbkc.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkX)).booleanValue()) {
            zzcgv zzcgvVar = this.zzc;
            if (zzcgvVar.zzD() != null && zzcgvVar.zzD().zzar) {
                zzz("/writeToLocalStorage", zzbkc.zzB);
                zzz("/clearLocalStorageKeys", zzbkc.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzoVar;
        this.zzk = zzbitVar;
        this.zzl = zzbivVar;
        this.zzv = zzzVar;
        this.zzx = zzbVar3;
        this.zzm = zzdgeVar;
        this.zzn = z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzbL() {
        zzdge zzdgeVar = this.zzm;
        if (zzdgeVar != null) {
            zzdgeVar.zzbL();
        }
    }

    protected final WebResourceResponse zzc(String str, Map map) {
        zzaxy zzb2;
        try {
            String zzc = zzbzu.zzc(str, this.zzc.getContext(), this.zzC);
            if (!zzc.equals(str)) {
                return zzO(zzc, map);
            }
            zzayb zza = zzayb.zza(Uri.parse(str));
            if (zza != null && (zzb2 = com.google.android.gms.ads.internal.zzt.zzc().zzb(zza)) != null && zzb2.zze()) {
                return new WebResourceResponse("", "", zzb2.zzc());
            }
            if (zzcbm.zzk() && ((Boolean) zzber.zzb.zze()).booleanValue()) {
                return zzO(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "AdWebViewClient.interceptRequest");
            return zzN();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzx;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbO)).booleanValue() && this.zzc.zzm() != null) {
                zzbdm.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcig zzcigVar = this.zzi;
            boolean z = false;
            if (!this.zzA && !this.zzo) {
                z = true;
            }
            zzcigVar.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzac();
    }

    public final void zzh() {
        zzbyo zzbyoVar = this.zza;
        if (zzbyoVar != null) {
            zzbyoVar.zze();
            this.zza = null;
        }
        zzQ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzv = null;
            this.zzx = null;
            this.zzw = null;
            zzbsm zzbsmVar = this.zzy;
            if (zzbsmVar != null) {
                zzbsmVar.zza(true);
                this.zzy = null;
            }
        }
    }

    public final void zzi(boolean z) {
        this.zzC = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzj(Uri uri) {
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(uri))));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgL)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzo().zzg() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? AbstractJsonLexerKt.NULL : path.substring(1);
            zzcca.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgy
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzchc.zzb;
                    com.google.android.gms.ads.internal.zzt.zzo().zzg().zze(substring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfC)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfE)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgbb.zzr(com.google.android.gms.ads.internal.zzt.zzp().zzb(uri), new zzcha(this, list, path, uri), zzcca.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        zzP(com.google.android.gms.ads.internal.util.zzt.zzO(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzk() {
        zzayp zzaypVar = this.zzd;
        if (zzaypVar != null) {
            zzaypVar.zzc(10005);
        }
        this.zzA = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzm() {
        this.zzB--;
        zzg();
    }

    final /* synthetic */ void zzn() {
        this.zzc.zzaa();
        com.google.android.gms.ads.internal.overlay.zzl zzL = this.zzc.zzL();
        if (zzL != null) {
            zzL.zzz();
        }
    }

    final /* synthetic */ void zzo(View view, zzbyo zzbyoVar, int i) {
        zzR(view, zzbyoVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzp(int i, int i2, boolean z) {
        zzbsr zzbsrVar = this.zzw;
        if (zzbsrVar != null) {
            zzbsrVar.zzb(i, i2);
        }
        zzbsm zzbsmVar = this.zzy;
        if (zzbsmVar != null) {
            zzbsmVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcii
    public final void zzq() {
        zzbyo zzbyoVar = this.zza;
        if (zzbyoVar != null) {
            WebView zzG = this.zzc.zzG();
            if (ViewCompat.isAttachedToWindow(zzG)) {
                zzR(zzG, zzbyoVar, 10);
                return;
            }
            zzQ();
            zzcgz zzcgzVar = new zzcgz(this, zzbyoVar);
            this.zzF = zzcgzVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcgzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzs() {
        zzdge zzdgeVar = this.zzm;
        if (zzdgeVar != null) {
            zzdgeVar.zzs();
        }
    }

    public final void zzt(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        zzcgv zzcgvVar = this.zzc;
        boolean zzaA = zzcgvVar.zzaA();
        boolean zzT = zzT(zzaA, zzcgvVar);
        boolean z2 = true;
        if (!zzT && z) {
            z2 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzT ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = zzaA ? null : this.zzh;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcgv zzcgvVar2 = this.zzc;
        zzw(new AdOverlayInfoParcel(zzcVar, zzaVar, zzoVar, zzzVar, zzcgvVar2.zzn(), zzcgvVar2, z2 ? null : this.zzm));
    }

    public final void zzu(String str, String str2, int i) {
        zzefa zzefaVar = this.zzE;
        zzcgv zzcgvVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzcgvVar, zzcgvVar.zzn(), str, str2, 14, zzefaVar));
    }

    public final void zzv(boolean z, int i, boolean z2) {
        zzcgv zzcgvVar = this.zzc;
        boolean zzT = zzT(zzcgvVar.zzaA(), zzcgvVar);
        boolean z3 = true;
        if (!zzT && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzT ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcgv zzcgvVar2 = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzoVar, zzzVar, zzcgvVar2, z, i, zzcgvVar2.zzn(), z3 ? null : this.zzm, zzS(this.zzc) ? this.zzE : null));
    }

    public final void zzw(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbsm zzbsmVar = this.zzy;
        boolean zze = zzbsmVar != null ? zzbsmVar.zze() : false;
        com.google.android.gms.ads.internal.zzt.zzi();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zze);
        zzbyo zzbyoVar = this.zza;
        if (zzbyoVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbyoVar.zzh(str);
        }
    }

    public final void zzx(boolean z, int i, String str, String str2, boolean z2) {
        zzcgv zzcgvVar = this.zzc;
        boolean zzaA = zzcgvVar.zzaA();
        boolean zzT = zzT(zzaA, zzcgvVar);
        boolean z3 = true;
        if (!zzT && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzT ? null : this.zzg;
        zzchb zzchbVar = zzaA ? null : new zzchb(this.zzc, this.zzh);
        zzbit zzbitVar = this.zzk;
        zzbiv zzbivVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcgv zzcgvVar2 = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzchbVar, zzbitVar, zzbivVar, zzzVar, zzcgvVar2, z, i, str, str2, zzcgvVar2.zzn(), z3 ? null : this.zzm, zzS(this.zzc) ? this.zzE : null));
    }

    public final void zzy(boolean z, int i, String str, boolean z2, boolean z3) {
        zzcgv zzcgvVar = this.zzc;
        boolean zzaA = zzcgvVar.zzaA();
        boolean zzT = zzT(zzaA, zzcgvVar);
        boolean z4 = true;
        if (!zzT && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzT ? null : this.zzg;
        zzchb zzchbVar = zzaA ? null : new zzchb(this.zzc, this.zzh);
        zzbit zzbitVar = this.zzk;
        zzbiv zzbivVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcgv zzcgvVar2 = this.zzc;
        zzw(new AdOverlayInfoParcel(zzaVar, zzchbVar, zzbitVar, zzbivVar, zzzVar, zzcgvVar2, z, i, str, zzcgvVar2.zzn(), z4 ? null : this.zzm, zzS(this.zzc) ? this.zzE : null, z3));
    }

    public final void zzz(String str, zzbkd zzbkdVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbkdVar);
        }
    }
}
