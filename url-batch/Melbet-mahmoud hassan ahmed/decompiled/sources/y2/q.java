package y2;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.io0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class q extends AsyncTask<Void, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f23425a;

    /* synthetic */ q(s sVar, p pVar) {
        this.f23425a = sVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        Future future;
        try {
            s sVar = this.f23425a;
            future = sVar.f23434h;
            sVar.f23439m = (gb) future.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            io0.h("", e7);
        }
        return this.f23425a.l();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        WebView webView;
        WebView webView2;
        String str2 = str;
        webView = this.f23425a.f23437k;
        if (webView == null || str2 == null) {
            return;
        }
        webView2 = this.f23425a.f23437k;
        webView2.loadUrl(str2);
    }
}
