package com.moat.analytics.mobile.you;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.moat.analytics.mobile.you.s;
import com.moat.analytics.mobile.you.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class j {
    private final WeakReference<WebView> h;
    private final a n;

    /* renamed from: a, reason: collision with root package name */
    private int f7488a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7489b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7490c = false;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f7491d = new AtomicBoolean(false);
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private final BroadcastReceiver o = new BroadcastReceiver() { // from class: com.moat.analytics.mobile.you.j.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                j.this.d();
            } catch (Exception e) {
                m.a(e);
            }
            if (System.currentTimeMillis() - j.this.k > 30000) {
                j.this.i();
            }
        }
    };
    private final BroadcastReceiver p = new BroadcastReceiver() { // from class: com.moat.analytics.mobile.you.j.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                j.this.e();
            } catch (Exception e) {
                m.a(e);
            }
        }
    };
    private final LinkedList<String> j = new LinkedList<>();
    private final List<String> m = new ArrayList();
    private final Map<b, String> i = new WeakHashMap();
    private final long k = System.currentTimeMillis();
    private final String l = String.format("javascript:(function(d,k){function l(){function d(a,b){var c=ipkn[b]||ipkn[kuea];if(c){var h=function(b){var c=b.b;c.ts=b.i;c.ticks=b.g;c.buffered=!0;a(c)};h(c.first);c.a.forEach(function(a){h(a)})}}function e(a){var b=a.a,c=a.c,h=a.b;a=a.f;var d=[];if(c)b[c]&&d.push(b[c].fn[0]);else for(key in b)if(b[key])for(var g=0,e=b[key].fn.length;g<e;g++)d.push(b[key].fn[g]);g=0;for(e=d.length;g<e;g++){var f=d[g];if('function'===typeof f)try{h?f(h):f()}catch(k){}a&&delete b[c]}}function f(a,b,c){'function'===typeof a&& (b===kuea&&c[b]?c[b].fn.push(a):c[b]={ts:+new Date,fn:[a]},c===yhgt&&d(a,b))}kuea=+new Date;iymv={};briz=!1;ewat=+new Date;bnkr=[];bjmk={};dptk={};uqaj={};ryup={};yhgt={};ipkn={};csif={};this.h=function(a){this.namespace=a.namespace;this.version=a.version;this.appName=a.appName;this.deviceOS=a.deviceOS;this.isNative=a.isNative;this.versionHash=a.versionHash;this.aqzx=a.aqzx;this.appId=a.appId;this.metadata=a};this.nvsj=function(a){briz||(f(a,ewat,iymv),briz=!0)};this.bpsy=function(a,b){var c=b||kuea; c!==kuea&&bjmk[c]||f(a,c,bjmk)};this.qmrv=function(a,b){var c=b||kuea;c!==kuea&&uqaj[c]||f(a,c,uqaj)};this.lgpr=function(a,b){f(a,b||kuea,yhgt)};this.hgen=function(a,b){f(a,b||kuea,csif)};this.xrnk=function(a){delete yhgt[a||kuea]};this.vgft=function(a){return dptk[a||kuea]||!1};this.lkpu=function(a){return ryup[a||kuea]||!1};this.crts=function(a){var b={a:iymv,b:a,c:ewat};briz?e(b):bnkr.push(a)};this.mqjh=function(a){var b=a||kuea;dptk[b]=!0;var c={a:bjmk,f:!0};b!==kuea&&(c.b=a,c.c=a);e(c)};this.egpw= function(a){var b=a||kuea;ryup[b]=!0;var c={a:uqaj,f:!0};b!==kuea&&(c.b=a,c.c=a);e(c)};this.sglu=function(a){var b=a.adKey||kuea,c={a:yhgt,b:a.event||a,g:1,i:+new Date,f:!1};b!==kuea&&(c.c=a.adKey);a=0<Object.keys(yhgt).length;if(!a||!this.isNative)if(ipkn[b]){var d=ipkn[b].a.slice(-1)[0]||ipkn[b].first;JSON.stringify(c.b)==JSON.stringify(d.b)?d.g+=1:(5<=ipkn[b].a.length&&ipkn[b].a.shift(),ipkn[b].a.push(c))}else ipkn[b]={first:c,a:[]};a&&e(c);return a};this.ucbx=function(a){e({c:a.adKey||kuea,a:csif, b:a.event,f:!1})}}'undefined'===typeof d.MoatMAK&&(d.MoatMAK=new l,d.MoatMAK.h(k),d.__zMoatInit__=!0)})(window,%s);", h());

    enum a {
        WEBVIEW,
        NATIVE_DISPLAY,
        NATIVE_VIDEO
    }

    j(WebView webView, a aVar) {
        this.h = new WeakReference<>(webView);
        this.n = aVar;
        if (d("Initialize")) {
            IntentFilter intentFilter = new IntentFilter("UPDATE_METADATA");
            IntentFilter intentFilter2 = new IntentFilter("UPDATE_VIEW_INFO");
            LocalBroadcastManager.getInstance(s.c()).registerReceiver(this.o, intentFilter);
            LocalBroadcastManager.getInstance(s.c()).registerReceiver(this.p, intentFilter2);
            d();
            i.a().a(s.c(), this);
            p.a(3, "JavaScriptBridge", this, "bridge initialization succeeded");
        }
    }

    private boolean a(WebView webView) {
        return webView.getSettings().getJavaScriptEnabled();
    }

    static /* synthetic */ int b(j jVar) {
        int i = jVar.f7488a;
        jVar.f7488a = i + 1;
        return i;
    }

    private void c() {
        Iterator<Map.Entry<b, String>> it = this.i.entrySet().iterator();
        while (it.hasNext()) {
            b key = it.next().getKey();
            if (key.e()) {
                g(String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.mqjh(\"%s\");}", key.e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            if (w.a().f7538a == w.d.OFF) {
                return;
            }
            if (!this.f7490c) {
                p.a(3, "JavaScriptBridge", this, "Attempting to establish communication (setting environment variables).");
                this.f7490c = true;
            }
            g(this.l);
        } catch (Exception e) {
            p.a("JavaScriptBridge", this, "Attempt failed to establish communication (did not set environment variables).", e);
        }
    }

    private void d(b bVar) {
        p.a(3, "JavaScriptBridge", this, "Stopping view update loop");
        if (bVar != null) {
            i.a().a(bVar);
        }
    }

    private boolean d(String str) {
        WebView g = g();
        if (g == null) {
            p.a(6, "JavaScriptBridge", this, "WebView is null. Can't " + str);
            throw new m("WebView is null");
        }
        if (a(g)) {
            return true;
        }
        p.a(6, "JavaScriptBridge", this, "JavaScript is not enabled in the given WebView. Can't " + str);
        throw new m("JavaScript is not enabled in the WebView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(19)
    public void e() {
        try {
            if (w.a().f7538a == w.d.OFF) {
                return;
            }
            if (this.g) {
                p.a(3, "JavaScriptBridge", this, "Can't send info, already cleaned up");
                return;
            }
            if (f() && (!this.f7489b || g().getUrl() != null)) {
                if (g().getUrl() != null) {
                    this.f7489b = true;
                }
                Iterator<Map.Entry<b, String>> it = this.i.entrySet().iterator();
                while (it.hasNext()) {
                    b key = it.next().getKey();
                    if (key == null || key.f() == null) {
                        p.a(3, "JavaScriptBridge", this, "Tracker has no subject");
                        if (key != null && key.f) {
                        }
                        c(key);
                    }
                    if (key.e()) {
                        if (!this.f7491d.get()) {
                            g(String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.mqjh(\"%s\");}", key.e));
                        }
                        String format = String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.sglu(%s);}", key.h());
                        if (Build.VERSION.SDK_INT >= 19) {
                            g().evaluateJavascript(format, new ValueCallback<String>() { // from class: com.moat.analytics.mobile.you.j.1
                                @Override // android.webkit.ValueCallback
                                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                                public void onReceiveValue(String str) {
                                    String str2;
                                    if (str != null && !str.equalsIgnoreCase("null") && !str.equalsIgnoreCase("false")) {
                                        if (str.equalsIgnoreCase("true")) {
                                            if (!j.this.f) {
                                                j.this.f = true;
                                                p.a(3, "JavaScriptBridge", j.this, "Javascript has found ad");
                                                j.this.a();
                                            }
                                            j.this.f7488a = 0;
                                            return;
                                        }
                                        p.a(3, "JavaScriptBridge", j.this, "Received unusual value from Javascript:" + str);
                                        return;
                                    }
                                    j jVar = j.this;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Received value is:");
                                    if (str == null) {
                                        str2 = "null";
                                    } else {
                                        str2 = "(String)" + str;
                                    }
                                    sb.append(str2);
                                    p.a(3, "JavaScriptBridge", jVar, sb.toString());
                                    if (j.this.f7488a >= 150) {
                                        p.a(3, "JavaScriptBridge", j.this, "Giving up on finding ad");
                                        j.this.b();
                                    }
                                    j.b(j.this);
                                    if (str == null || !str.equalsIgnoreCase("false") || j.this.e) {
                                        return;
                                    }
                                    j.this.e = true;
                                    p.a(3, "JavaScriptBridge", j.this, "Bridge connection established");
                                }
                            });
                        } else {
                            g().loadUrl(format);
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("WebView became null");
            sb.append(g() == null ? "" : "based on null url");
            sb.append(", stopping tracking loop");
            p.a(3, "JavaScriptBridge", this, sb.toString());
            b();
        } catch (Exception e) {
            m.a(e);
            b();
        }
    }

    private void e(String str) {
        if (this.m.size() >= 50) {
            this.m.subList(0, 25).clear();
        }
        this.m.add(str);
    }

    private void f(String str) {
        if (this.f7491d.get()) {
            g(str);
        } else {
            e(str);
        }
    }

    private boolean f() {
        return g() != null;
    }

    private WebView g() {
        return this.h.get();
    }

    private void g(String str) {
        if (this.g) {
            p.a(3, "JavaScriptBridge", this, "Can't send, already cleaned up");
            return;
        }
        if (f()) {
            p.b(2, "JavaScriptBridge", this, str);
            if (Build.VERSION.SDK_INT >= 19) {
                g().evaluateJavascript(str, null);
            } else {
                g().loadUrl(str);
            }
        }
    }

    private String h() {
        try {
            s.a d2 = s.d();
            s.b e = s.e();
            HashMap hashMap = new HashMap();
            String a2 = d2.a();
            String b2 = d2.b();
            String c2 = d2.c();
            String num = Integer.toString(Build.VERSION.SDK_INT);
            String b3 = s.b();
            String str = this.n == a.WEBVIEW ? "0" : "1";
            String str2 = e.e ? "1" : "0";
            String str3 = e.f7537d ? "1" : "0";
            String str4 = ((k) MoatAnalytics.getInstance()).b() ? "0" : "1";
            hashMap.put("versionHash", "9d24c90729bf464dce5d8fd1ace14a60656dbb2d");
            hashMap.put("appName", a2);
            hashMap.put(FavaDiagnosticsEntity.EXTRA_NAMESPACE, "YOU");
            hashMap.put("version", "2.4.5");
            hashMap.put("deviceOS", num);
            hashMap.put("isNative", str);
            hashMap.put("appId", b2);
            hashMap.put("source", c2);
            hashMap.put(com.umeng.commonsdk.proguard.d.O, e.f7535b);
            hashMap.put("sim", e.f7534a);
            hashMap.put("phone", String.valueOf(e.f7536c));
            hashMap.put("buildFp", Build.FINGERPRINT);
            hashMap.put("buildModel", Build.MODEL);
            hashMap.put("buildMfg", Build.MANUFACTURER);
            hashMap.put("buildBrand", Build.BRAND);
            hashMap.put("buildProduct", Build.PRODUCT);
            hashMap.put("buildTags", Build.TAGS);
            hashMap.put("f1", str3);
            hashMap.put("f2", str2);
            hashMap.put("locationEnabled", str4);
            if (b3 != null) {
                hashMap.put("aqzx", b3);
            }
            return new JSONObject(hashMap).toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        p.a(3, "JavaScriptBridge", this, "Stopping metadata reporting loop");
        i.a().a(this);
        LocalBroadcastManager.getInstance(s.c()).unregisterReceiver(this.o);
    }

    void a() {
        p.a(3, "JavaScriptBridge", this, "webViewReady");
        if (this.f7491d.compareAndSet(false, true)) {
            p.a(3, "JavaScriptBridge", this, "webViewReady first time");
            i();
            Iterator<String> it = this.m.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            this.m.clear();
        }
        c();
    }

    void a(b bVar) {
        if (bVar != null) {
            p.a(3, "JavaScriptBridge", this, "adding tracker" + bVar.e);
            this.i.put(bVar, "");
        }
    }

    void a(String str) {
        f(String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.crts(%s);}", str));
    }

    void a(String str, JSONObject jSONObject) {
        if (this.g) {
            p.a(3, "JavaScriptBridge", this, "Can't dispatch, already cleaned up");
            return;
        }
        String jSONObject2 = jSONObject.toString();
        if (this.f7491d.get() && f()) {
            g(String.format("javascript:%s.dispatchEvent(%s);", str, jSONObject2));
        } else {
            this.j.add(jSONObject2);
        }
    }

    void b() {
        p.a(3, "JavaScriptBridge", this, "Cleaning up");
        this.g = true;
        i();
        Iterator<Map.Entry<b, String>> it = this.i.entrySet().iterator();
        while (it.hasNext()) {
            d(it.next().getKey());
        }
        this.i.clear();
        LocalBroadcastManager.getInstance(s.c()).unregisterReceiver(this.p);
    }

    void b(b bVar) {
        if (d("startTracking")) {
            p.a(3, "JavaScriptBridge", this, "Starting tracking on tracker" + bVar.e);
            g(String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.mqjh(\"%s\");}", bVar.e));
            i.a().a(s.c(), bVar);
        }
    }

    void b(String str) {
        p.a(3, "JavaScriptBridge", this, "markUserInteractionEvent:" + str);
        f(String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.ucbx(%s);}", str));
    }

    void c(b bVar) {
        m mVar = null;
        if (!this.g) {
            try {
                if (d("stopTracking")) {
                    try {
                        p.a(3, "JavaScriptBridge", this, "Ending tracking on tracker" + bVar.e);
                        g(String.format("javascript: if(typeof MoatMAK !== 'undefined'){MoatMAK.egpw(\"%s\");}", bVar.e));
                    } catch (Exception e) {
                        p.a("JavaScriptBridge", this, "Failed to end impression.", e);
                    }
                }
            } catch (m e2) {
                mVar = e2;
            }
            if (this.n == a.NATIVE_DISPLAY) {
                d(bVar);
            } else {
                b();
            }
            this.i.remove(bVar);
        }
        if (mVar != null) {
            throw mVar;
        }
    }

    void c(String str) {
        p.a(3, "JavaScriptBridge", this, "flushDispatchQueue");
        if (this.j.size() >= 200) {
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < 10; i++) {
                linkedList.addFirst(this.j.removeFirst());
            }
            int min = Math.min(Math.min(this.j.size() / ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, 10) + ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, this.j.size());
            for (int i2 = 0; i2 < min; i2++) {
                this.j.removeFirst();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                this.j.addFirst((String) it.next());
            }
        }
        if (!this.j.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            int i3 = 1;
            while (!this.j.isEmpty() && i3 < 200) {
                i3++;
                String removeFirst = this.j.removeFirst();
                if (sb.length() + removeFirst.length() > 2000) {
                    break;
                }
                sb.append(str2);
                sb.append(removeFirst);
                str2 = ",";
            }
            g(String.format("javascript:%s.dispatchMany([%s])", str, sb.toString()));
        }
        this.j.clear();
    }

    protected void finalize() {
        try {
            super.finalize();
            p.a(3, "JavaScriptBridge", this, "finalize");
            b();
        } catch (Exception e) {
            m.a(e);
        }
    }
}
