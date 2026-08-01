package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzcbn;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzq extends AsyncTask {
    final /* synthetic */ zzs zza;

    /* synthetic */ zzq(zzs zzsVar, zzp zzpVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        WebView webView;
        WebView webView2;
        zzs zzsVar = this.zza;
        String str = (String) obj;
        webView = zzsVar.zzf;
        if (webView == null || str == null) {
            return;
        }
        webView2 = zzsVar.zzf;
        webView2.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        Future future;
        try {
            zzs zzsVar = this.zza;
            future = zzsVar.zzc;
            zzsVar.zzh = (zzasi) future.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            zzcbn.zzk("", e);
        } catch (ExecutionException e2) {
            e = e2;
            zzcbn.zzk("", e);
        } catch (TimeoutException e3) {
            zzcbn.zzk("", e3);
        }
        return this.zza.zzp();
    }
}
