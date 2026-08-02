package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzdsp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zze {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final zzdsp zzd;
    private final ExecutorService zze;

    zze(Context context, zzdsp zzdspVar, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzdspVar;
        this.zze = executorService;
    }

    private final void zzh(final boolean z) {
        Map map = this.zzb;
        Boolean valueOf = Boolean.valueOf(z);
        if (map.containsKey(valueOf)) {
            return;
        }
        this.zzb.put(valueOf, new ArrayList());
        this.zze.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzc
            @Override // java.lang.Runnable
            public final void run() {
                zze.this.zzc(z);
            }
        });
    }

    private final void zzi(zzg zzgVar, Pair pair, boolean z) {
        zzgVar.zzd();
        QueryInfo zzb = zzgVar.zzb();
        if (zzb != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(zzb);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzgVar.zzc());
        }
        zzq.zzd(this.zzd, null, "sgpcr", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z)), new Pair("sgpc_rs", Boolean.toString(zzgVar.zzb() != null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0024, B:8:0x002d, B:12:0x0043, B:14:0x0070, B:18:0x007c, B:21:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[Catch: all -> 0x0085, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0024, B:8:0x002d, B:12:0x0043, B:14:0x0070, B:18:0x007c, B:21:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: all -> 0x0085, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0024, B:8:0x002d, B:12:0x0043, B:14:0x0070, B:18:0x007c, B:21:0x003a), top: B:2:0x0001 }] */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzd(boolean z, boolean z2) {
        int i;
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        bundle.putBoolean("accept_3p_cookie", z);
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z);
        zzg zzgVar = (zzg) map.get(valueOf);
        if (z2 && zzgVar != null) {
            i = zzgVar.zza() + 1;
            zzg zzgVar2 = (zzg) this.zza.get(valueOf);
            final zzf zzfVar = new zzf(this, z, i, zzgVar2 != null ? null : Boolean.valueOf(zzgVar2.zzf()), this.zzd);
            final AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkg)).booleanValue()) {
                QueryInfo.generate(this.zzc, AdFormat.BANNER, build, zzfVar);
                return;
            } else {
                this.zze.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zze.this.zza(build, zzfVar);
                    }
                });
                return;
            }
        }
        i = 0;
        zzg zzgVar22 = (zzg) this.zza.get(valueOf);
        final zzf zzfVar2 = new zzf(this, z, i, zzgVar22 != null ? null : Boolean.valueOf(zzgVar22.zzf()), this.zzd);
        final AdRequest build2 = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkg)).booleanValue()) {
        }
    }

    final /* synthetic */ Object zza(AdRequest adRequest, zzf zzfVar) throws Exception {
        QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest, zzfVar);
        return true;
    }

    public final synchronized void zzb() {
        zzh(true);
        zzh(false);
    }

    final /* synthetic */ void zzc(boolean z) {
        zzd(z, false);
    }

    final /* synthetic */ void zze(Object obj, Pair pair) {
        boolean z = false;
        if (obj instanceof WebView) {
            CookieManager zza = com.google.android.gms.ads.internal.zzu.zzq().zza(this.zzc);
            if (zza != null) {
                z = zza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z);
        zzg zzgVar = (zzg) map.get(valueOf);
        if (zzgVar != null && !zzgVar.zze()) {
            zzi(zzgVar, pair, true);
            return;
        }
        List list = (List) this.zzb.get(valueOf);
        if (list == null) {
            list = new ArrayList();
            this.zzb.put(valueOf, list);
        }
        list.add(pair);
    }

    final synchronized void zzf(final boolean z, zzg zzgVar) {
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z);
        zzg zzgVar2 = (zzg) map.get(valueOf);
        if (zzgVar2 == null || zzgVar2.zze() || zzgVar2.zzb() == null || zzgVar.zzb() != null) {
            this.zza.put(valueOf, zzgVar);
        }
        int intValue = (zzgVar.zzb() != null ? (Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziY) : (Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziZ)).intValue();
        final boolean z2 = zzgVar.zzb() == null;
        zzbzo.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzb
            @Override // java.lang.Runnable
            public final void run() {
                zze.this.zzd(z, z2);
            }
        }, intValue, TimeUnit.SECONDS);
        List list = (List) this.zzb.get(valueOf);
        this.zzb.put(valueOf, new ArrayList());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzi(zzgVar, (Pair) it.next(), false);
            }
        }
    }

    public final synchronized void zzg(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
        zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
            @Override // java.lang.Runnable
            public final void run() {
                zze.this.zze(obj, pair);
            }
        });
    }
}
