package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzchv {
    private final zzchw zza;
    private final zzchu zzb;

    public zzchv(zzchw zzchwVar, zzchu zzchuVar) {
        this.zzb = zzchuVar;
        this.zza = zzchwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzchw, com.google.android.gms.internal.ads.zzcid] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.zza;
        zzasi zzI = r0.zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzase zzc = zzI.zzc();
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        zzchw zzchwVar = this.zza;
        return zzc.zzf(zzchwVar.getContext(), str, (View) zzchwVar, zzchwVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzchw, com.google.android.gms.internal.ads.zzcid] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.zza;
        zzasi zzI = r0.zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzase zzc = zzI.zzc();
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        zzchw zzchwVar = this.zza;
        return zzc.zzh(zzchwVar.getContext(), (View) zzchwVar, zzchwVar.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzcbn.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcht
                @Override // java.lang.Runnable
                public final void run() {
                    zzchv.this.zza(str);
                }
            });
        }
    }

    final /* synthetic */ void zza(String str) {
        Uri parse = Uri.parse(str);
        zzchc zzaJ = ((zzcho) this.zzb.zza).zzaJ();
        if (zzaJ == null) {
            zzcbn.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaJ.zzj(parse);
        }
    }
}
