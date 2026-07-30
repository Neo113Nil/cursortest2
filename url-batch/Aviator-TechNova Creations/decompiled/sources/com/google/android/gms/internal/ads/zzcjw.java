package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public class zzcjw extends WebViewClient implements zzclj {
    public static final /* synthetic */ int zzc = 0;
    private zzdxz zzA;
    private zzczz zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private final zzejf zzH;
    private View.OnAttachStateChangeListener zzI;
    protected final zzcjl zza;
    protected zzcce zzb;
    private final zzbgd zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzclh zzi;
    private zzcli zzj;
    private zzbmx zzk;
    private zzbmz zzl;
    private zzdjm zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;
    private zzbww zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbwr zzz = null;
    private final HashSet zzG = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgG)).split(",")));

    public zzcjw(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z, zzbww zzbwwVar, zzbwr zzbwrVar, zzejf zzejfVar) {
        this.zzd = zzbgdVar;
        this.zza = zzcjlVar;
        this.zzs = z;
        this.zzx = zzbwwVar;
        this.zzH = zzejfVar;
    }

    private final void zzac(final View view, final zzcce zzcceVar, final int i) {
        if (!zzcceVar.zzc() || i <= 0) {
            return;
        }
        zzcceVar.zzd(view);
        if (zzcceVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcju
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcjw.this.zzU(view, zzcceVar, i);
                }
            }, 100L);
        }
    }

    private final void zzad() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzI;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse zzae() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbq)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzaf(String str, Map map) throws IOException {
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
                int i2 = zzfxs.zzb;
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
                com.google.android.gms.ads.internal.util.zzs zzc2 = com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    zzcjl zzcjlVar = this.zza;
                    zzc2.zzb(zzcjlVar.getContext(), zzcjlVar.zzs().afmaVersion, false, httpURLConnection, false, 60000);
                    webResourceResponse = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    zzlVar.zza(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzlVar.zzc(httpURLConnection, responseCode);
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
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Protocol is null");
                        webResourceResponse = zzae();
                        break;
                    }
                    if (!protocol.equals(ProxyConfig.MATCH_HTTP) && !protocol.equals("https")) {
                        StringBuilder sb = new StringBuilder(protocol.length() + 20);
                        sb.append("Unsupported scheme: ");
                        sb.append(protocol);
                        String sb2 = sb.toString();
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                        webResourceResponse = zzae();
                        break;
                    }
                    StringBuilder sb3 = new StringBuilder(headerField.length() + 15);
                    sb3.append("Redirecting to ");
                    sb3.append(headerField);
                    String sb4 = sb3.toString();
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd(sb4);
                    httpURLConnection.disconnect();
                    url = url2;
                } catch (Throwable th) {
                    th = th;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.zzt.zzc();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            com.google.android.gms.ads.internal.zzt.zzc();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i6 = 1;
                    while (true) {
                        if (i6 >= split.length) {
                            break;
                        }
                        if (split[i6].trim().startsWith("charset")) {
                            String[] split2 = split[i6].trim().split("=");
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i6++;
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
            webResourceResponse = com.google.android.gms.ads.internal.zzt.zzf().zzc(trim, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            TrafficStats.clearThreadStatsTag();
            return webResourceResponse;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzaa(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzboh) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzY(boolean z, long j) {
        this.zza.zzu(z, j);
    }

    private static final boolean zzai(zzcjl zzcjlVar) {
        return zzcjlVar.zzC() != null && zzcjlVar.zzC().zzb();
    }

    private static final boolean zzaj(boolean z, zzcjl zzcjlVar) {
        return (!z || zzcjlVar.zzN().zzg() || zzcjlVar.zzO().equals("interstitial_mb")) ? false : true;
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
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzQ(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar.zzX()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                zzcjlVar.zzY();
                return;
            }
            this.zzC = true;
            zzcli zzcliVar = this.zzj;
            if (zzcliVar != null) {
                zzcliVar.zza();
                this.zzj = null;
            }
            zzu();
            zzcjl zzcjlVar2 = this.zza;
            if (zzcjlVar2.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznr)).booleanValue()) {
                    zzcjlVar2.zzL().zzz(str);
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
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzL(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case Opcodes.CASTORE /* 85 */:
            case Opcodes.SASTORE /* 86 */:
            case Opcodes.POP /* 87 */:
            case Opcodes.POP2 /* 88 */:
            case 89:
            case 90:
            case Opcodes.DUP_X2 /* 91 */:
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
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzQ(parse);
        } else {
            if (this.zzn && webView == this.zza.zzD()) {
                String scheme = parse.getScheme();
                if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcce zzcceVar = this.zzb;
                        if (zzcceVar != null) {
                            zzcceVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    zzdjm zzdjmVar = this.zzm;
                    if (zzdjmVar != null) {
                        zzdjmVar.zzdu();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar.zzD().willNotDraw()) {
                String.valueOf(str);
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzazh zzS = zzcjlVar.zzS();
                    zzfjo zzT = zzcjlVar.zzT();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || zzT == null) {
                        if (zzS != null && zzS.zza(parse)) {
                            parse = zzS.zzd(parse, zzcjlVar.getContext(), (View) zzcjlVar, zzcjlVar.zzj());
                        }
                    } else if (zzS != null && zzS.zza(parse)) {
                        parse = zzT.zza(parse, zzcjlVar.getContext(), (View) zzcjlVar, zzcjlVar.zzj());
                    }
                } catch (zzazi unused) {
                    String.valueOf(str);
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzb()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    zzcjl zzcjlVar2 = this.zza;
                    zzv(zzcVar, true, false, zzcjlVar2 != null ? zzcjlVar2.zzn() : "");
                } else {
                    zzbVar.zzc(str);
                }
            }
        }
        return true;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbwr zzbwrVar = this.zzz;
        boolean zzd = zzbwrVar != null ? zzbwrVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza.getContext(), adOverlayInfoParcel, !zzd, this.zzA);
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcceVar.zzb(str);
        }
    }

    public final void zzB(String str, zzboh zzbohVar) {
        synchronized (this.zzf) {
            HashMap hashMap = this.zze;
            List list = (List) hashMap.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                hashMap.put(str, list);
            }
            list.add(zzbohVar);
        }
    }

    public final void zzC(String str, zzboh zzbohVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbohVar);
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzE(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzboh> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzboh zzbohVar : list) {
                if (predicate.apply(zzbohVar)) {
                    arrayList.add(zzbohVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void zzF() {
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcceVar.zzf();
            this.zzb = null;
        }
        zzad();
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
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            zzbwr zzbwrVar = this.zzz;
            if (zzbwrVar != null) {
                zzbwrVar.zzb(true);
                this.zzz = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzG(zzclh zzclhVar) {
        this.zzi = zzclhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzH(zzcli zzcliVar) {
        this.zzj = zzcliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final zzdxz zzI() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzJ(zzczz zzczzVar) {
        this.zzB = zzczzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final zzczz zzK() {
        return this.zzB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TRY_ENTER, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:45:0x01b0, B:46:0x016f, B:49:0x02bb, B:51:0x02cb, B:53:0x02d1, B:55:0x02df, B:70:0x0238, B:71:0x026b, B:64:0x0206, B:66:0x013e, B:86:0x00d3, B:87:0x026c, B:89:0x0276, B:91:0x027c, B:93:0x02af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02bb A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:45:0x01b0, B:46:0x016f, B:49:0x02bb, B:51:0x02cb, B:53:0x02d1, B:55:0x02df, B:70:0x0238, B:71:0x026b, B:64:0x0206, B:66:0x013e, B:86:0x00d3, B:87:0x026c, B:89:0x0276, B:91:0x027c, B:93:0x02af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d1 A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:45:0x01b0, B:46:0x016f, B:49:0x02bb, B:51:0x02cb, B:53:0x02d1, B:55:0x02df, B:70:0x0238, B:71:0x026b, B:64:0x0206, B:66:0x013e, B:86:0x00d3, B:87:0x026c, B:89:0x0276, B:91:0x027c, B:93:0x02af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fb A[Catch: all -> 0x01e1, TryCatch #3 {all -> 0x01e1, blocks: (B:41:0x018c, B:43:0x019e, B:44:0x01a5, B:60:0x01e9, B:62:0x01fb, B:63:0x0202), top: B:27:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026c A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:45:0x01b0, B:46:0x016f, B:49:0x02bb, B:51:0x02cb, B:53:0x02d1, B:55:0x02df, B:70:0x0238, B:71:0x026b, B:64:0x0206, B:66:0x013e, B:86:0x00d3, B:87:0x026c, B:89:0x0276, B:91:0x027c, B:93:0x02af), top: B:2:0x000c }] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final WebResourceResponse zzL(String str, Map map) {
        WebResourceResponse webResourceResponse;
        int i;
        InputStream inputStream;
        InputStream zzb;
        final boolean z;
        final boolean z2;
        String sb;
        try {
            Map hashMap = new HashMap();
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar.zzC() != null) {
                hashMap = zzcjlVar.zzC().zzaw;
            }
            String zza = zzccs.zza(str, zzcjlVar.getContext(), this.zzF, hashMap);
            if (!zza.equals(str)) {
                return zzaf(zza, map);
            }
            Parcelable.Creator<zzbfp> creator = zzbfp.CREATOR;
            zzbfp zza2 = zzbfp.zza(Uri.parse(str));
            if (zza2 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains("range")) {
                    List zze = zzgrr.zza(zzgqq.zzc(SignatureVisitor.SUPER)).zze(parse.getQueryParameter("range"));
                    if (zze.size() == 2) {
                        int parseInt = Integer.parseInt((String) zze.get(0));
                        int parseInt2 = Integer.parseInt((String) zze.get(1)) + 1;
                        if (parseInt > 0) {
                            zza2.zzh = parseInt;
                        }
                        i = parseInt2 - parseInt;
                        final boolean z3 = "X-Afma-Gcache-CachedBytes";
                        webResourceResponse = null;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfj)).booleanValue()) {
                            zzbfm zzc2 = com.google.android.gms.ads.internal.zzt.zzj().zzc(zza2);
                            if (zzc2 == null || !zzc2.zza()) {
                                inputStream = null;
                                if (inputStream != null) {
                                    return new WebResourceResponse("", "", 200, "OK", hashMap2, inputStream);
                                }
                            } else {
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzc2.zzd()));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzc2.zzg()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzc2.zze()));
                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzc2.zzf()));
                                zzb = zzc2.zzb();
                                if (i != -1) {
                                    zzb = zzgxf.zzb(zzb, i);
                                }
                            }
                        } else {
                            zza2.zzi = zzgrt.zza(zzcjlVar.zzn());
                            zza2.zzj = zzcjlVar.zzp();
                            try {
                                long longValue = (zza2.zzg ? (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfl) : (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfk)).longValue();
                                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                                com.google.android.gms.ads.internal.zzt.zzz();
                                Future zza3 = zzbga.zza(zzcjlVar.getContext(), zza2);
                                try {
                                    zzbgb zzbgbVar = (zzbgb) zza3.get(longValue, TimeUnit.MILLISECONDS);
                                    try {
                                        try {
                                            hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbgbVar.zzc()));
                                            hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbgbVar.zzd()));
                                            hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbgbVar.zzf()));
                                            hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbgbVar.zze()));
                                            zzb = zzbgbVar.zzb();
                                            if (i != -1) {
                                                try {
                                                    zzb = zzgxf.zzb(zzb, i);
                                                } catch (InterruptedException e) {
                                                    e = e;
                                                    z2 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza3.cancel(true);
                                                    Thread.currentThread().interrupt();
                                                    final long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjq
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzcjw.this.zzX(z2, elapsedRealtime2);
                                                        }
                                                    });
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 24);
                                                    sb2.append("Cache connection took ");
                                                    sb2.append(elapsedRealtime2);
                                                    sb2.append("ms");
                                                    sb = sb2.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                } catch (ExecutionException e2) {
                                                    e = e2;
                                                    z = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza3.cancel(true);
                                                    final long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzcjw.this.zzW(z, elapsedRealtime3);
                                                        }
                                                    });
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                                                    sb3.append("Cache connection took ");
                                                    sb3.append(elapsedRealtime3);
                                                    sb3.append("ms");
                                                    sb = sb3.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                } catch (TimeoutException e3) {
                                                    e = e3;
                                                    z = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                                    }
                                                    zza3.cancel(true);
                                                    final long elapsedRealtime32 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzcjw.this.zzW(z, elapsedRealtime32);
                                                        }
                                                    });
                                                    StringBuilder sb32 = new StringBuilder(String.valueOf(elapsedRealtime32).length() + 24);
                                                    sb32.append("Cache connection took ");
                                                    sb32.append(elapsedRealtime32);
                                                    sb32.append("ms");
                                                    sb = sb32.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                }
                                            }
                                            final long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                            final boolean z4 = true;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(z4, elapsedRealtime4) { // from class: com.google.android.gms.internal.ads.zzcjo
                                                private final /* synthetic */ long zzb;

                                                {
                                                    this.zzb = elapsedRealtime4;
                                                }

                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzcjw.this.zzV(true, this.zzb);
                                                }
                                            });
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                                            sb4.append("Cache connection took ");
                                            sb4.append(elapsedRealtime4);
                                            sb4.append("ms");
                                            sb = sb4.toString();
                                        } catch (Throwable th) {
                                            th = th;
                                            z3 = 1;
                                            final long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjr
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzcjw.this.zzY(z3, elapsedRealtime5);
                                                }
                                            });
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
                                            sb5.append("Cache connection took ");
                                            sb5.append(elapsedRealtime5);
                                            sb5.append("ms");
                                            com.google.android.gms.ads.internal.util.zze.zza(sb5.toString());
                                            throw th;
                                        }
                                    } catch (InterruptedException e4) {
                                        e = e4;
                                        zzb = null;
                                    } catch (ExecutionException e5) {
                                        e = e5;
                                        zzb = null;
                                        z = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                        }
                                        zza3.cancel(true);
                                        final long elapsedRealtime322 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzcjw.this.zzW(z, elapsedRealtime322);
                                            }
                                        });
                                        StringBuilder sb322 = new StringBuilder(String.valueOf(elapsedRealtime322).length() + 24);
                                        sb322.append("Cache connection took ");
                                        sb322.append(elapsedRealtime322);
                                        sb322.append("ms");
                                        sb = sb322.toString();
                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                        inputStream = zzb;
                                        if (inputStream != null) {
                                        }
                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    } catch (TimeoutException e6) {
                                        e = e6;
                                        zzb = null;
                                        z = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                        }
                                        zza3.cancel(true);
                                        final long elapsedRealtime3222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzcjw.this.zzW(z, elapsedRealtime3222);
                                            }
                                        });
                                        StringBuilder sb3222 = new StringBuilder(String.valueOf(elapsedRealtime3222).length() + 24);
                                        sb3222.append("Cache connection took ");
                                        sb3222.append(elapsedRealtime3222);
                                        sb3222.append("ms");
                                        sb = sb3222.toString();
                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                        inputStream = zzb;
                                        if (inputStream != null) {
                                        }
                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    }
                                } catch (InterruptedException e7) {
                                    e = e7;
                                    zzb = null;
                                    z2 = false;
                                } catch (ExecutionException e8) {
                                    e = e8;
                                    zzb = null;
                                    z = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                    }
                                    zza3.cancel(true);
                                    final long elapsedRealtime32222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzcjw.this.zzW(z, elapsedRealtime32222);
                                        }
                                    });
                                    StringBuilder sb32222 = new StringBuilder(String.valueOf(elapsedRealtime32222).length() + 24);
                                    sb32222.append("Cache connection took ");
                                    sb32222.append(elapsedRealtime32222);
                                    sb32222.append("ms");
                                    sb = sb32222.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                    inputStream = zzb;
                                    if (inputStream != null) {
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (TimeoutException e9) {
                                    e = e9;
                                    zzb = null;
                                    z = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                    }
                                    zza3.cancel(true);
                                    final long elapsedRealtime322222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzcjw.this.zzW(z, elapsedRealtime322222);
                                        }
                                    });
                                    StringBuilder sb322222 = new StringBuilder(String.valueOf(elapsedRealtime322222).length() + 24);
                                    sb322222.append("Cache connection took ");
                                    sb322222.append(elapsedRealtime322222);
                                    sb322222.append("ms");
                                    sb = sb322222.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                    inputStream = zzb;
                                    if (inputStream != null) {
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z3 = 0;
                                }
                                com.google.android.gms.ads.internal.util.zze.zza(sb);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        inputStream = zzb;
                        if (inputStream != null) {
                        }
                    }
                }
                i = -1;
                final boolean z32 = "X-Afma-Gcache-CachedBytes";
                webResourceResponse = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfj)).booleanValue()) {
                }
                inputStream = zzb;
                if (inputStream != null) {
                }
            } else {
                webResourceResponse = null;
            }
            return (com.google.android.gms.ads.internal.util.client.zzl.zzj() || !((Boolean) zzbja.zzb.zze()).booleanValue()) ? webResourceResponse : zzaf(str, map);
        } catch (Exception | NoClassDefFoundError e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdWebViewClient.interceptRequest");
            return zzae();
        }
    }

    public final void zzM(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzN() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcjl zzcjlVar = zzcjw.this.zza;
                    zzcjlVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzm zzL = zzcjlVar.zzL();
                    if (zzL != null) {
                        zzL.zzv();
                    }
                }
            });
        }
    }

    public final void zzO(boolean z) {
        this.zzF = z;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzP(int i, int i2) {
        zzbwr zzbwrVar = this.zzz;
        if (zzbwrVar != null) {
            zzbwrVar.zze(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzQ(Uri uri) {
        String valueOf = String.valueOf(uri);
        String.valueOf(valueOf);
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(valueOf)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            String valueOf2 = String.valueOf(uri);
            String.valueOf(valueOf2);
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(valueOf2)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhF)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zza() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? AbstractJsonLexerKt.NULL : path.substring(1);
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzcjw.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(substring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgF)).booleanValue() && this.zzG.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgH)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgzo.zzr(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new zzcjn(this, list, path, uri), zzcei.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzaa(com.google.android.gms.ads.internal.util.zzs.zzV(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzR(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzS(boolean z) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzT(boolean z) {
        synchronized (this.zzf) {
            this.zzv = z;
        }
    }

    final /* synthetic */ void zzU(View view, zzcce zzcceVar, int i) {
        zzac(view, zzcceVar, i - 1);
    }

    final /* synthetic */ void zzV(boolean z, long j) {
        zzY(true, j);
    }

    final /* synthetic */ void zzZ(View view, zzcce zzcceVar, int i) {
        zzac(view, zzcceVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zza(int i, int i2, boolean z) {
        zzbww zzbwwVar = this.zzx;
        if (zzbwwVar != null) {
            zzbwwVar.zzb(i, i2);
        }
        zzbwr zzbwrVar = this.zzz;
        if (zzbwrVar != null) {
            zzbwrVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzab(com.google.android.gms.ads.internal.client.zza zzaVar, zzbmx zzbmxVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbmz zzbmzVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z, zzbok zzbokVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbwy zzbwyVar, zzcce zzcceVar, zzeiu zzeiuVar, zzfqk zzfqkVar, zzdxz zzdxzVar, zzbpc zzbpcVar, zzdjm zzdjmVar, zzbpb zzbpbVar, zzbov zzbovVar, zzboi zzboiVar, zzcrv zzcrvVar, zzdzc zzdzcVar, zzdae zzdaeVar, zzczz zzczzVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzcceVar, null) : zzbVar;
        zzcjl zzcjlVar = this.zza;
        this.zzz = new zzbwr(zzcjlVar, zzbwyVar);
        this.zzb = zzcceVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbz)).booleanValue()) {
            zzB("/adMetadata", new zzbmw(zzbmxVar));
        }
        if (zzbmzVar != null) {
            zzB("/appEvent", new zzbmy(zzbmzVar));
        }
        zzB("/backButton", zzbog.zzj);
        zzB("/refresh", zzbog.zzk);
        zzB("/canOpenApp", zzbog.zzb);
        zzB("/canOpenURLs", zzbog.zza);
        zzB("/canOpenIntents", zzbog.zzc);
        zzB("/close", zzbog.zzd);
        zzB("/customClose", zzbog.zze);
        zzB("/instrument", zzbog.zzn);
        zzB("/delayPageLoaded", zzbog.zzp);
        zzB("/delayPageClosed", zzbog.zzq);
        zzB("/getLocationInfo", zzbog.zzr);
        zzB("/log", zzbog.zzg);
        zzB("/mraid", new zzboo(zzbVar2, this.zzz, zzbwyVar));
        zzbww zzbwwVar = this.zzx;
        if (zzbwwVar != null) {
            zzB("/mraidLoaded", zzbwwVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbou(zzbVar3, this.zzz, zzeiuVar, zzdxzVar, zzcrvVar, zzdaeVar));
        zzB("/precache", new zzchs());
        zzB("/touch", zzbog.zzi);
        zzB("/video", zzbog.zzl);
        zzB("/videoMeta", zzbog.zzm);
        if (zzeiuVar == null || zzfqkVar == null) {
            zzB("/click", zzbog.zzb(zzdjmVar, zzcrvVar));
            zzB("/httpTrack", zzbog.zzf);
        } else {
            zzB("/click", zzfjv.zza(zzeiuVar, zzfqkVar, zzcrvVar, zzdjmVar));
            zzB("/httpTrack", zzfjv.zzb(zzeiuVar, zzfqkVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcjlVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcjlVar.zzC() != null) {
                hashMap = zzcjlVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbon(zzcjlVar.getContext(), hashMap));
        }
        if (zzbokVar != null) {
            zzB("/setInterstitialProperties", new zzboj(zzbokVar));
        }
        if (zzbpcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbpcVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkJ)).booleanValue() && zzbpbVar != null) {
            zzB("/shareSheet", zzbpbVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue() && zzdzcVar != null) {
            zzB("/onDeviceStorageEvent", new zzbop(zzdzcVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkO)).booleanValue() && zzbovVar != null) {
            zzB("/inspectorOutOfContextTest", zzbovVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkT)).booleanValue() && zzboiVar != null) {
            zzB("/inspectorStorage", zzboiVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmW)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbog.zzu);
            zzB("/presentPlayStoreOverlay", zzbog.zzv);
            zzB("/expandPlayStoreOverlay", zzbog.zzw);
            zzB("/collapsePlayStoreOverlay", zzbog.zzx);
            zzB("/closePlayStoreOverlay", zzbog.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzee)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbog.zzA);
            zzB("/resetPAID", zzbog.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznq)).booleanValue() && zzcjlVar.zzC() != null && zzcjlVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbog.zzB);
            zzB("/clearLocalStorageKeys", zzbog.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbmxVar;
        this.zzl = zzbmzVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzdjmVar;
        this.zzA = zzdxzVar;
        this.zzB = zzczzVar;
        this.zzn = z;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzb(zzfir zzfirVar) {
        zzcjl zzcjlVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcjlVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbon(zzcjlVar.getContext(), zzfirVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzc(zzcrv zzcrvVar) {
        zzD("/click");
        zzB("/click", zzbog.zzb(this.zzm, zzcrvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzd(zzcrv zzcrvVar, zzeiu zzeiuVar, zzfqk zzfqkVar) {
        zzD("/click");
        if (zzeiuVar == null || zzfqkVar == null) {
            zzB("/click", zzbog.zzb(this.zzm, zzcrvVar));
        } else {
            zzB("/click", zzfjv.zza(zzeiuVar, zzfqkVar, zzcrvVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzdjm zzdjmVar = this.zzm;
        if (zzdjmVar != null) {
            zzdjmVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzdjm zzdjmVar = this.zzm;
        if (zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zze(zzcrv zzcrvVar, zzeiu zzeiuVar, zzdxz zzdxzVar) {
        zzD("/open");
        zzB("/open", new zzbou(this.zzy, this.zzz, zzeiuVar, zzdxzVar, zzcrvVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzi(com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzj(zzcce zzcceVar) {
        this.zzb = zzcceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final boolean zzk() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    public final boolean zzn() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzv;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzq() {
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcjl zzcjlVar = this.zza;
            WebView zzD = zzcjlVar.zzD();
            if (ViewCompat.isAttachedToWindow(zzD)) {
                zzac(zzD, zzcceVar, 10);
                return;
            }
            zzad();
            zzcjm zzcjmVar = new zzcjm(this, zzcceVar);
            this.zzI = zzcjmVar;
            ((View) zzcjlVar).addOnAttachStateChangeListener(zzcjmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzE++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzs() {
        this.zzE--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzt() {
        zzbgd zzbgdVar = this.zzd;
        if (zzbgdVar != null) {
            zzbgdVar.zzc(10005);
        }
        this.zzD = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzC && this.zzE <= 0) || this.zzD || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue()) {
                zzcjl zzcjlVar = this.zza;
                if (zzcjlVar.zzq() != null) {
                    zzbhl.zza(zzcjlVar.zzq().zzc(), zzcjlVar.zzi(), "awfllc");
                }
            }
            this.zzi.zza((this.zzD || this.zzo) ? false : true, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        boolean z3;
        zzcjl zzcjlVar = this.zza;
        boolean zzW = zzcjlVar.zzW();
        boolean z4 = false;
        boolean z5 = zzaj(zzW, zzcjlVar) || z2;
        if (z5 || !z) {
            z3 = zzW;
            z4 = true;
        } else {
            z3 = zzW;
        }
        zzA(new AdOverlayInfoParcel(zzcVar, z5 ? null : this.zzg, z3 ? null : this.zzh, this.zzw, zzcjlVar.zzs(), zzcjlVar, z4 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i) {
        zzejf zzejfVar = this.zzH;
        zzcjl zzcjlVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzcjlVar, zzcjlVar.zzs(), str, str2, 14, zzejfVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbxl] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void zzx(boolean z, int i, boolean z2) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdjm zzdjmVar;
        ?? r9;
        int i2;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z3;
        zzcjl zzcjlVar = this.zza;
        boolean zzaj = zzaj(zzcjlVar.zzW(), zzcjlVar);
        boolean z4 = true;
        if (!zzaj && z2) {
            z4 = false;
        }
        if (zzaj) {
            zzaVar = null;
            zzdjmVar = null;
        } else {
            zzaVar = this.zzg;
            zzdjmVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzh;
        zzdjm zzdjmVar2 = zzdjmVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzs = zzcjlVar.zzs();
        zzdjm zzdjmVar3 = z4 ? zzdjmVar2 : this.zzm;
        if (zzai(zzcjlVar)) {
            r9 = this.zzH;
            z3 = z;
            i2 = i;
            zzaVar2 = zzaVar;
        } else {
            r9 = zzdjmVar2;
            i2 = i;
            zzaVar2 = zzaVar;
            z3 = z;
        }
        zzA(new AdOverlayInfoParcel(zzaVar2, zzrVar, zzadVar, zzcjlVar, z3, i2, zzs, zzdjmVar3, r9));
    }

    public final void zzy(boolean z, int i, String str, boolean z2, boolean z3) {
        zzcjl zzcjlVar = this.zza;
        boolean zzW = zzcjlVar.zzW();
        boolean zzaj = zzaj(zzW, zzcjlVar);
        boolean z4 = true;
        if (!zzaj && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzaj ? null : this.zzg;
        zzcjv zzcjvVar = zzW ? null : new zzcjv(zzcjlVar, this.zzh);
        zzbmx zzbmxVar = this.zzk;
        zzejf zzejfVar = null;
        zzbmz zzbmzVar = this.zzl;
        boolean z5 = z4;
        zzcjv zzcjvVar2 = zzcjvVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzs = zzcjlVar.zzs();
        zzdjm zzdjmVar = z5 ? null : this.zzm;
        if (zzai(zzcjlVar)) {
            zzejfVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzcjvVar2, zzbmxVar, zzbmzVar, zzadVar, zzcjlVar, z, i, str, zzs, zzdjmVar, zzejfVar, z3));
    }

    public final void zzz(boolean z, int i, String str, String str2, boolean z2) {
        zzcjl zzcjlVar = this.zza;
        boolean zzW = zzcjlVar.zzW();
        boolean zzaj = zzaj(zzW, zzcjlVar);
        boolean z3 = true;
        if (!zzaj && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzaj ? null : this.zzg;
        zzcjv zzcjvVar = zzW ? null : new zzcjv(zzcjlVar, this.zzh);
        zzbmx zzbmxVar = this.zzk;
        zzejf zzejfVar = null;
        zzbmz zzbmzVar = this.zzl;
        boolean z4 = z3;
        zzcjv zzcjvVar2 = zzcjvVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzs = zzcjlVar.zzs();
        zzdjm zzdjmVar = z4 ? null : this.zzm;
        if (zzai(zzcjlVar)) {
            zzejfVar = this.zzH;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzcjvVar2, zzbmxVar, zzbmzVar, zzadVar, zzcjlVar, z, i, str, str2, zzs, zzdjmVar, zzejfVar));
    }
}
