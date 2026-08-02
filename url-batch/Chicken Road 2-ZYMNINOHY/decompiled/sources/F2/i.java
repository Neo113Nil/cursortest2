package F2;

import J2.j;
import android.app.ActivityManager;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import k.q0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i extends b {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f781a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.e f782b;

    /* renamed from: c, reason: collision with root package name */
    public final J2.g f783c;

    /* renamed from: d, reason: collision with root package name */
    public Q2.a f784d;

    /* renamed from: e, reason: collision with root package name */
    public M2.a f785e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f786f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f787g;

    /* renamed from: h, reason: collision with root package name */
    public final String f788h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f789i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f790j;

    public i(l2.e eVar, q0 q0Var) {
        M2.a bVar;
        WebViewClient webViewClient;
        String uuid = UUID.randomUUID().toString();
        this.f783c = new J2.g();
        this.f786f = false;
        this.f787g = false;
        this.f782b = eVar;
        this.f781a = q0Var;
        this.f788h = uuid;
        this.f784d = new Q2.a(null);
        c cVar = (c) q0Var.f14088g;
        if (cVar == c.HTML || cVar == c.JAVASCRIPT) {
            WebView webView = (WebView) q0Var.f14083b;
            bVar = new M2.b(uuid);
            if (webView != null && Build.VERSION.SDK_INT >= 26 && ((ArrayList) H2.b.a(J2.h.f1183b.f1184a).b()).size() > 0) {
                webViewClient = webView.getWebViewClient();
                webView.setWebViewClient(new M2.c(webViewClient));
            }
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            bVar.f1750b = new Q2.a(webView);
        } else {
            bVar = new M2.d(uuid, Collections.unmodifiableMap((HashMap) q0Var.f14085d), (String) q0Var.f14086e);
        }
        this.f785e = bVar;
        this.f785e.h();
        J2.c.f1173c.f1174a.add(this);
        M2.a aVar = this.f785e;
        WebView g4 = aVar.g();
        String str = aVar.f1749a;
        JSONObject jSONObject = new JSONObject();
        N2.b.b(jSONObject, "impressionOwner", g.NATIVE);
        N2.b.b(jSONObject, "mediaEventsOwner", (g) eVar.f14270b);
        N2.b.b(jSONObject, "creativeType", (d) eVar.f14271c);
        N2.b.b(jSONObject, "impressionType", f.VIEWABLE);
        N2.b.b(jSONObject, "isolateVerificationScripts", Boolean.FALSE);
        J2.i.f1185a.a(g4, "init", jSONObject, str);
    }

    @Override // F2.b
    public final void a(View view, e eVar) {
        J2.f fVar;
        if (this.f787g) {
            return;
        }
        ArrayList arrayList = this.f783c.f1182a;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                fVar = null;
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            fVar = (J2.f) obj;
            if (fVar.f1179a.get() == view) {
                break;
            }
        }
        if (fVar == null) {
            arrayList.add(new J2.f(view, eVar));
        }
    }

    @Override // F2.b
    public final void c() {
        if (this.f787g) {
            return;
        }
        this.f784d.clear();
        if (!this.f787g) {
            this.f783c.f1182a.clear();
        }
        this.f787g = true;
        M2.a aVar = this.f785e;
        J2.i.f1185a.a(aVar.g(), "finishSession", aVar.f1749a);
        J2.c cVar = J2.c.f1173c;
        ArrayList arrayList = cVar.f1175b;
        ArrayList arrayList2 = cVar.f1175b;
        boolean z = arrayList.size() > 0;
        cVar.f1174a.remove(this);
        arrayList2.remove(this);
        if (z && arrayList2.size() <= 0) {
            j b4 = j.b();
            b4.getClass();
            O2.b bVar = O2.b.f2033g;
            bVar.getClass();
            Handler handler = O2.b.f2035i;
            if (handler != null) {
                handler.removeCallbacks(O2.b.f2037k);
                O2.b.f2035i = null;
            }
            bVar.f2038a.clear();
            O2.b.f2034h.post(new B.b(8, bVar));
            J2.b bVar2 = J2.b.f1172d;
            bVar2.f1176a = false;
            bVar2.f1178c = null;
            I2.b bVar3 = b4.f1189c;
            bVar3.f1133b.getContentResolver().unregisterContentObserver(bVar3);
        }
        this.f785e.f();
        this.f785e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F2.b
    public final void d(View view) {
        if (this.f787g || ((View) this.f784d.get()) == view) {
            return;
        }
        this.f784d = new Q2.a(view);
        M2.a aVar = this.f785e;
        aVar.getClass();
        aVar.f1754f = System.nanoTime();
        aVar.f1753e = 1;
        Collection<i> unmodifiableCollection = Collections.unmodifiableCollection(J2.c.f1173c.f1174a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (i iVar : unmodifiableCollection) {
            if (iVar != this && ((View) iVar.f784d.get()) == view) {
                iVar.f784d.clear();
            }
        }
    }

    @Override // F2.b
    public final void e() {
        if (this.f786f || this.f785e == null) {
            return;
        }
        this.f786f = true;
        J2.c cVar = J2.c.f1173c;
        boolean z = cVar.f1175b.size() > 0;
        cVar.f1175b.add(this);
        if (!z) {
            j b4 = j.b();
            b4.getClass();
            J2.b bVar = J2.b.f1172d;
            bVar.f1178c = b4;
            bVar.f1176a = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z4 = runningAppProcessInfo.importance == 100 || bVar.b();
            bVar.f1177b = z4;
            bVar.a(z4);
            O2.b.f2033g.getClass();
            O2.b.b();
            I2.b bVar2 = b4.f1189c;
            bVar2.f1139h.submit(new B.b(4, bVar2));
            bVar2.f1133b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, bVar2);
        }
        float f4 = j.b().f1187a;
        M2.a aVar = this.f785e;
        WebView g4 = aVar.g();
        Object[] objArr = {Float.valueOf(f4), aVar.f1749a};
        J2.i iVar = J2.i.f1185a;
        iVar.a(g4, "setDeviceVolume", objArr);
        M2.a aVar2 = this.f785e;
        Date date = J2.a.f1166f.f1168b;
        aVar2.e(date != null ? (Date) date.clone() : null);
        M2.a aVar3 = this.f785e;
        List b5 = H2.b.a(J2.h.f1183b.f1184a).b();
        aVar3.getClass();
        try {
            JSONArray a3 = M2.a.a(b5);
            JSONObject jSONObject = new JSONObject();
            N2.b.b(jSONObject, "supportedAttestationMechanisms", a3);
            iVar.a(aVar3.g(), "setSupportedAttestations", jSONObject);
        } catch (JSONException unused) {
        }
        this.f785e.b(this, this.f781a);
    }
}
