package j1;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import f0.C0322a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import l.t0;
import l1.C1105b;
import m1.C1114b;
import n1.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.AbstractC1180a;
import u1.C1221a;

/* loaded from: classes.dex */
public final class i extends AbstractC1053b {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f9540a;

    /* renamed from: b, reason: collision with root package name */
    public final C0322a f9541b;

    /* renamed from: c, reason: collision with root package name */
    public final n1.g f9542c;

    /* renamed from: d, reason: collision with root package name */
    public C1221a f9543d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1180a f9544e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9545g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9546h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9547i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9548j;

    public i(C0322a c0322a, t0 t0Var) {
        AbstractC1180a bVar;
        WebViewClient webViewClient;
        String uuid = UUID.randomUUID().toString();
        this.f9542c = new n1.g();
        this.f = false;
        this.f9545g = false;
        this.f9541b = c0322a;
        this.f9540a = t0Var;
        this.f9546h = uuid;
        this.f9543d = new C1221a(null);
        EnumC1054c enumC1054c = EnumC1054c.HTML;
        EnumC1054c enumC1054c2 = (EnumC1054c) t0Var.f9914g;
        if (enumC1054c2 == enumC1054c || enumC1054c2 == EnumC1054c.JAVASCRIPT) {
            bVar = new q1.b(uuid);
            WebView webView = (WebView) t0Var.f9910b;
            if (webView != null && Build.VERSION.SDK_INT >= 26 && ((ArrayList) C1105b.b(n1.h.f10158b.f10159a).a()).size() > 0) {
                webViewClient = webView.getWebViewClient();
                webView.setWebViewClient(new X1.i(webViewClient));
            }
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            bVar.f10230b = new C1221a(webView);
        } else {
            bVar = new q1.d(uuid, Collections.unmodifiableMap((HashMap) t0Var.f9912d), (String) t0Var.f9913e);
        }
        this.f9544e = bVar;
        this.f9544e.h();
        n1.c.f10148c.f10149a.add(this);
        AbstractC1180a abstractC1180a = this.f9544e;
        n1.i iVar = n1.i.f10160a;
        WebView g3 = abstractC1180a.g();
        JSONObject jSONObject = new JSONObject();
        r1.b.b(jSONObject, "impressionOwner", g.NATIVE);
        r1.b.b(jSONObject, "mediaEventsOwner", (g) c0322a.f4977b);
        r1.b.b(jSONObject, "creativeType", (EnumC1055d) c0322a.f4978c);
        r1.b.b(jSONObject, "impressionType", f.VIEWABLE);
        r1.b.b(jSONObject, "isolateVerificationScripts", Boolean.FALSE);
        iVar.a(g3, "init", jSONObject, abstractC1180a.f10229a);
    }

    @Override // j1.AbstractC1053b
    public final void a(View view, e eVar) {
        n1.f fVar;
        if (this.f9545g) {
            return;
        }
        n1.g gVar = this.f9542c;
        gVar.getClass();
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        ArrayList arrayList = gVar.f10157a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                fVar = null;
                break;
            } else {
                fVar = (n1.f) it.next();
                if (fVar.f10154a.get() == view) {
                    break;
                }
            }
        }
        if (fVar == null) {
            arrayList.add(new n1.f(view, eVar));
        }
    }

    @Override // j1.AbstractC1053b
    public final void c() {
        if (this.f9545g) {
            return;
        }
        this.f9543d.clear();
        if (!this.f9545g) {
            this.f9542c.f10157a.clear();
        }
        this.f9545g = true;
        AbstractC1180a abstractC1180a = this.f9544e;
        n1.i.f10160a.a(abstractC1180a.g(), "finishSession", abstractC1180a.f10229a);
        n1.c cVar = n1.c.f10148c;
        boolean z = cVar.f10150b.size() > 0;
        cVar.f10149a.remove(this);
        ArrayList arrayList = cVar.f10150b;
        arrayList.remove(this);
        if (z && arrayList.size() <= 0) {
            j b3 = j.b();
            b3.getClass();
            s1.b bVar = s1.b.f10295g;
            bVar.getClass();
            Handler handler = s1.b.f10297i;
            if (handler != null) {
                handler.removeCallbacks(s1.b.f10299k);
                s1.b.f10297i = null;
            }
            bVar.f10300a.clear();
            s1.b.f10296h.post(new B.b(18, bVar));
            n1.b bVar2 = n1.b.f10147d;
            bVar2.f10151a = false;
            bVar2.f10153c = null;
            C1114b c1114b = b3.f10164c;
            c1114b.f9964b.getContentResolver().unregisterContentObserver(c1114b);
        }
        this.f9544e.f();
        this.f9544e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j1.AbstractC1053b
    public final void d(View view) {
        if (this.f9545g || ((View) this.f9543d.get()) == view) {
            return;
        }
        this.f9543d = new C1221a(view);
        AbstractC1180a abstractC1180a = this.f9544e;
        abstractC1180a.getClass();
        abstractC1180a.f = System.nanoTime();
        abstractC1180a.f10233e = 1;
        Collection<i> unmodifiableCollection = Collections.unmodifiableCollection(n1.c.f10148c.f10149a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (i iVar : unmodifiableCollection) {
            if (iVar != this && ((View) iVar.f9543d.get()) == view) {
                iVar.f9543d.clear();
            }
        }
    }

    @Override // j1.AbstractC1053b
    public final void e() {
        if (this.f || this.f9544e == null) {
            return;
        }
        this.f = true;
        n1.c cVar = n1.c.f10148c;
        boolean z = cVar.f10150b.size() > 0;
        cVar.f10150b.add(this);
        if (!z) {
            j b3 = j.b();
            b3.getClass();
            n1.b bVar = n1.b.f10147d;
            bVar.f10153c = b3;
            bVar.f10151a = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z2 = runningAppProcessInfo.importance == 100 || bVar.b();
            bVar.f10152b = z2;
            bVar.a(z2);
            s1.b.f10295g.getClass();
            s1.b.b();
            C1114b c1114b = b3.f10164c;
            c1114b.getClass();
            c1114b.f9969h.submit(new B.b(15, c1114b));
            c1114b.f9964b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c1114b);
        }
        float f = j.b().f10162a;
        AbstractC1180a abstractC1180a = this.f9544e;
        n1.i iVar = n1.i.f10160a;
        iVar.a(abstractC1180a.g(), "setDeviceVolume", Float.valueOf(f), abstractC1180a.f10229a);
        AbstractC1180a abstractC1180a2 = this.f9544e;
        Date date = n1.a.f.f10143b;
        abstractC1180a2.e(date != null ? (Date) date.clone() : null);
        AbstractC1180a abstractC1180a3 = this.f9544e;
        List a3 = C1105b.b(n1.h.f10158b.f10159a).a();
        abstractC1180a3.getClass();
        try {
            JSONArray a4 = AbstractC1180a.a(a3);
            JSONObject jSONObject = new JSONObject();
            r1.b.b(jSONObject, "supportedAttestationMechanisms", a4);
            iVar.a(abstractC1180a3.g(), "setSupportedAttestations", jSONObject);
        } catch (JSONException unused) {
        }
        this.f9544e.b(this, this.f9540a);
    }
}
