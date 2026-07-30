package B2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC2734Qa;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.Av;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.C3157eg;
import com.google.android.gms.internal.ads.C3280gu;
import com.google.android.gms.internal.ads.C3348i7;
import com.google.android.gms.internal.ads.C3381io;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k2.C4635f;
import k2.C4636g;
import k2.EnumC4631b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: B2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f201a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f202b;

    /* renamed from: c, reason: collision with root package name */
    public final C3348i7 f203c;

    /* renamed from: d, reason: collision with root package name */
    public final C3280gu f204d;

    /* renamed from: e, reason: collision with root package name */
    public final int f205e;

    /* renamed from: f, reason: collision with root package name */
    public final C3381io f206f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f207g;

    /* renamed from: h, reason: collision with root package name */
    public final C3157eg f208h = AbstractC3212fg.f30743f;
    public final Av i;

    /* renamed from: j, reason: collision with root package name */
    public final E f209j;

    /* renamed from: k, reason: collision with root package name */
    public final C0268b f210k;

    /* renamed from: l, reason: collision with root package name */
    public final B f211l;

    public C0267a(WebView webView, C3348i7 c3348i7, C3381io c3381io, Av av, C3280gu c3280gu, E e6, C0268b c0268b, B b9) {
        this.f202b = webView;
        Context context = webView.getContext();
        this.f201a = context;
        this.f203c = c3348i7;
        this.f206f = c3381io;
        AbstractC3368ia.a(context);
        C3151ea c3151ea = AbstractC3368ia.Ya;
        q2.r rVar = q2.r.f40116e;
        this.f205e = ((Integer) rVar.f40119c.a(c3151ea)).intValue();
        this.f207g = ((Boolean) rVar.f40119c.a(AbstractC3368ia.Za)).booleanValue();
        this.i = av;
        this.f204d = c3280gu;
        this.f209j = e6;
        this.f210k = c0268b;
        this.f211l = b9;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            p2.j jVar = p2.j.f39798C;
            jVar.f39810k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String h9 = this.f203c.f31319b.h(this.f201a, str, this.f202b);
            if (!this.f207g) {
                return h9;
            }
            jVar.f39810k.getClass();
            K3.b.L(this.f206f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            return h9;
        } catch (RuntimeException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Exception getting click signals. ", e6);
            p2.j.f39798C.f39808h.d("TaggingLibraryJsInterface.getClickSignals", e6);
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            String j9 = D.y.j(i, "Invalid timeout for getting click signals. Timeout=", new StringBuilder(String.valueOf(i).length() + 51));
            int i4 = t2.C.f40822b;
            u2.i.c(j9);
            return "";
        }
        try {
            return (String) AbstractC3212fg.f30738a.b(new y(0, this, str)).get(Math.min(i, this.f205e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e6) {
            int i9 = t2.C.f40822b;
            u2.i.d("Exception getting click signals with timeout. ", e6);
            p2.j.f39798C.f39808h.d("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e6);
            return e6 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        t2.G g9 = p2.j.f39798C.f39803c;
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        w wVar = new w(this, uuid);
        if (((Boolean) AbstractC2734Qa.f27167e.r()).booleanValue()) {
            this.f209j.a(this.f202b, wVar);
            return uuid;
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.bb)).booleanValue()) {
            this.f208h.execute(new z(this, bundle, wVar, 0));
            return uuid;
        }
        E2.a.a(this.f201a, EnumC4631b.BANNER, new C4636g((C4635f) new C4635f(1).e(bundle)), wVar);
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            p2.j jVar = p2.j.f39798C;
            jVar.f39810k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String i = this.f203c.f31319b.i(this.f201a, this.f202b, null);
            if (!this.f207g) {
                return i;
            }
            jVar.f39810k.getClass();
            K3.b.L(this.f206f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            return i;
        } catch (RuntimeException e6) {
            int i4 = t2.C.f40822b;
            u2.i.d("Exception getting view signals. ", e6);
            p2.j.f39798C.f39808h.d("TaggingLibraryJsInterface.getViewSignals", e6);
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            String j9 = D.y.j(i, "Invalid timeout for getting view signals. Timeout=", new StringBuilder(String.valueOf(i).length() + 50));
            int i4 = t2.C.f40822b;
            u2.i.c(j9);
            return "";
        }
        try {
            return (String) AbstractC3212fg.f30738a.b(new x(0, this)).get(Math.min(i, this.f205e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e6) {
            int i9 = t2.C.f40822b;
            u2.i.d("Exception getting view signals with timeout. ", e6);
            p2.j.f39798C.f39808h.d("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e6);
            return e6 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.db)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC3212fg.f30738a.execute(new RunnableC0272f(1, this, str));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i4 = jSONObject.getInt("x");
            int i9 = jSONObject.getInt("y");
            int i10 = jSONObject.getInt("duration_ms");
            float f6 = (float) jSONObject.getDouble("force");
            int i11 = jSONObject.getInt("type");
            if (i11 != 0) {
                i = 1;
                if (i11 != 1) {
                    i = 2;
                    if (i11 != 2) {
                        i = 3;
                        if (i11 != 3) {
                            i = -1;
                        }
                    }
                }
            } else {
                i = 0;
            }
            try {
                this.f203c.f31319b.b(MotionEvent.obtain(0L, i10, i, i4, i9, f6, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e6) {
                e = e6;
                int i12 = t2.C.f40822b;
                u2.i.d("Failed to parse the touch string. ", e);
                p2.j.f39798C.f39808h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
            } catch (JSONException e9) {
                e = e9;
                int i122 = t2.C.f40822b;
                u2.i.d("Failed to parse the touch string. ", e);
                p2.j.f39798C.f39808h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
            }
        } catch (RuntimeException | JSONException e10) {
            e = e10;
        }
    }
}
