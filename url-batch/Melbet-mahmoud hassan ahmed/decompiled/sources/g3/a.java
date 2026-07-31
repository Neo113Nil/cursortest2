package g3;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import r2.g;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16598a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f16599b;

    /* renamed from: c, reason: collision with root package name */
    private final gb f16600c;

    a(WebView webView, gb gbVar) {
        this.f16599b = webView;
        this.f16598a = webView.getContext();
        this.f16600c = gbVar;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        m10.c(this.f16598a);
        try {
            return this.f16600c.c().f(this.f16598a, str, this.f16599b);
        } catch (RuntimeException e7) {
            io0.e("Exception getting click signals. ", e7);
            y2.t.p().s(e7, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        y2.t.q();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        Context context = this.f16598a;
        r2.b bVar = r2.b.BANNER;
        g.a aVar = new g.a();
        aVar.b(AdMobAdapter.class, bundle);
        h3.b.a(context, bVar, aVar.c(), new k(this, uuid));
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        m10.c(this.f16598a);
        try {
            return this.f16600c.c().c(this.f16598a, this.f16599b, null);
        } catch (RuntimeException e7) {
            io0.e("Exception getting view signals. ", e7);
            y2.t.p().s(e7, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        m10.c(this.f16598a);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i7 = jSONObject.getInt("x");
            int i8 = jSONObject.getInt("y");
            int i9 = jSONObject.getInt("duration_ms");
            float f7 = (float) jSONObject.getDouble("force");
            int i10 = jSONObject.getInt("type");
            this.f16600c.d(MotionEvent.obtain(0L, i9, i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? -1 : 3 : 2 : 1 : 0, i7, i8, f7, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException | JSONException e7) {
            io0.e("Failed to parse the touch string. ", e7);
            y2.t.p().s(e7, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
