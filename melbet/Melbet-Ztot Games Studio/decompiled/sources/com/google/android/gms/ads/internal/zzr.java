package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzauo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
final class zzr extends AsyncTask {
    final /* synthetic */ zzt zza;

    /* synthetic */ zzr(zzt zztVar, zzq zzqVar) {
        this.zza = zztVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        WebView webView;
        WebView webView2;
        zzt zztVar = this.zza;
        String str = (String) obj;
        webView = zztVar.zzf;
        if (webView == null || str == null) {
            return;
        }
        webView2 = zztVar.zzf;
        webView2.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        Future future;
        try {
            zzt zztVar = this.zza;
            future = zztVar.zzc;
            zztVar.zzh = (zzauo) future.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        } catch (ExecutionException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        } catch (TimeoutException e3) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e3);
        }
        return this.zza.zzp();
    }
}
