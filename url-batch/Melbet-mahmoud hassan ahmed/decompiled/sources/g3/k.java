package g3;

import android.webkit.WebView;
import com.google.android.gms.internal.ads.io0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class k extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16659a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f16660b;

    k(a aVar, String str) {
        this.f16660b = aVar;
        this.f16659a = str;
    }

    @Override // h3.c
    public final void a(String str) {
        WebView webView;
        String valueOf = String.valueOf(str);
        io0.g(valueOf.length() != 0 ? "Failed to generate query info for the tagging library, error: ".concat(valueOf) : new String("Failed to generate query info for the tagging library, error: "));
        String format = String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.f16659a, str);
        webView = this.f16660b.f16599b;
        webView.evaluateJavascript(format, null);
    }

    @Override // h3.c
    public final void b(h3.b bVar) {
        String format;
        WebView webView;
        String b7 = bVar.b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f16659a);
            jSONObject.put("signal", b7);
            format = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            format = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.f16659a, bVar.b());
        }
        webView = this.f16660b.f16599b;
        webView.evaluateJavascript(format, null);
    }
}
