package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzasj;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzcca;
import com.google.android.gms.internal.ads.zzdtu;
import com.google.android.gms.internal.ads.zzfla;
import com.google.android.gms.internal.ads.zzgbl;
import io.ktor.http.LinkHeader;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzasi zzc;
    private final int zzd;
    private final zzdtu zze;
    private final boolean zzf;
    private final zzgbl zzg = zzcca.zze;
    private final zzfla zzh;

    TaggingLibraryJsInterface(WebView webView, zzasi zzasiVar, zzdtu zzdtuVar, zzfla zzflaVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzasiVar;
        this.zze = zzdtuVar;
        zzbdc.zza(context);
        this.zzd = ((Integer) zzba.zzc().zza(zzbdc.zzjm)).intValue();
        this.zzf = ((Boolean) zzba.zzc().zza(zzbdc.zzjn)).booleanValue();
        this.zzh = zzflaVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            String zze = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zze;
        } catch (RuntimeException e) {
            zzcbn.zzh("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            zzcbn.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzcca.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzcbn.zzh("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzar zzarVar = new zzar(this, uuid);
        if (((Boolean) zzba.zzc().zza(zzbdc.zzjp)).booleanValue()) {
            this.zzg.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaq
                @Override // java.lang.Runnable
                public final void run() {
                    TaggingLibraryJsInterface.this.zzb(bundle, zzarVar);
                }
            });
        } else {
            Context context = this.zza;
            AdFormat adFormat = AdFormat.BANNER;
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
            QueryInfo.generate(context, adFormat, builder.build(), zzarVar);
        }
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            String zzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zzh;
        } catch (RuntimeException e) {
            zzcbn.zzh("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            zzcbn.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzcca.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzcbn.zzh("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) zzba.zzc().zza(zzbdc.zzjr)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcca.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // java.lang.Runnable
            public final void run() {
                TaggingLibraryJsInterface.this.zzc(str);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        int i2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i3 = jSONObject.getInt("x");
            int i4 = jSONObject.getInt("y");
            int i5 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i6 = jSONObject.getInt(LinkHeader.Parameters.Type);
            try {
                if (i6 != 0) {
                    int i7 = 1;
                    if (i6 != 1) {
                        i7 = 2;
                        if (i6 != 2) {
                            i7 = 3;
                            i2 = i6 != 3 ? -1 : 0;
                        }
                    }
                    i = i7;
                    this.zzc.zzd(MotionEvent.obtain(0L, i5, i, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                    return;
                }
                this.zzc.zzd(MotionEvent.obtain(0L, i5, i, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            } catch (RuntimeException e) {
                e = e;
                zzcbn.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            } catch (JSONException e2) {
                e = e2;
                zzcbn.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            }
            i = i2;
        } catch (RuntimeException | JSONException e3) {
            e = e3;
        }
    }

    final /* synthetic */ void zzb(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager zzb = com.google.android.gms.ads.internal.zzt.zzq().zzb(this.zza);
        bundle.putBoolean("accept_3p_cookie", zzb != null ? zzb.acceptThirdPartyCookies(this.zzb) : false);
        Context context = this.zza;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), queryInfoGenerationCallback);
    }

    final /* synthetic */ void zzc(String str) {
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzc.zza(parse, this.zza, this.zzb, null);
        } catch (zzasj e) {
            zzcbn.zzf("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzh.zzc(parse.toString(), null);
    }
}
