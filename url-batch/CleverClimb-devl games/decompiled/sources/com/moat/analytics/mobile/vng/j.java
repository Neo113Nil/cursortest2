package com.moat.analytics.mobile.vng;

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
import com.moat.analytics.mobile.vng.s;
import com.moat.analytics.mobile.vng.w;
import com.tapjoy.TapjoyConstants;
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
    private final WeakReference<WebView> e;
    private final a l;

    /* renamed from: b, reason: collision with root package name */
    private int f7367b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7368c = false;

    /* renamed from: a, reason: collision with root package name */
    boolean f7366a = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7369d = false;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final BroadcastReceiver m = new BroadcastReceiver() { // from class: com.moat.analytics.mobile.vng.j.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                j.this.c();
            } catch (Exception e) {
                m.a(e);
            }
            if (System.currentTimeMillis() - j.this.i > TapjoyConstants.TIMER_INCREMENT) {
                j.this.e();
            }
        }
    };
    private final BroadcastReceiver n = new BroadcastReceiver() { // from class: com.moat.analytics.mobile.vng.j.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                j.this.d();
            } catch (Exception e) {
                m.a(e);
            }
        }
    };
    private final s.a j = new s.a();
    private final LinkedList<String> g = new LinkedList<>();
    private final List<String> k = new ArrayList();
    private final Map<b, String> f = new WeakHashMap();
    private final long i = System.currentTimeMillis();

    enum a {
        WEBVIEW,
        NATIVE_DISPLAY,
        NATIVE_VIDEO
    }

    j(WebView webView, a aVar) {
        this.e = new WeakReference<>(webView);
        this.l = aVar;
        IntentFilter intentFilter = new IntentFilter("UPDATE_METADATA");
        IntentFilter intentFilter2 = new IntentFilter("UPDATE_VIEW_INFO");
        LocalBroadcastManager.getInstance(s.c()).registerReceiver(this.m, intentFilter);
        LocalBroadcastManager.getInstance(s.c()).registerReceiver(this.n, intentFilter2);
        try {
            p.a(3, "JavaScriptBridge", this, b() ? "bridge installed" : "bridge not installed");
        } catch (Exception e) {
            m.a(e);
        }
    }

    private boolean a(WebView webView, String str) {
        String str2;
        StringBuilder sb;
        String str3;
        if (webView == null) {
            str2 = "JavaScriptBridge";
            sb = new StringBuilder();
            str3 = "WebView is null. Can't ";
        } else {
            if (webView.getSettings().getJavaScriptEnabled()) {
                return true;
            }
            str2 = "JavaScriptBridge";
            sb = new StringBuilder();
            str3 = "JavaScript is not enabled in the given WebView. Can't ";
        }
        sb.append(str3);
        sb.append(str);
        p.a(6, str2, this, sb.toString());
        return false;
    }

    private boolean b() {
        if (h() != null && !a(h(), "installBridge")) {
            return false;
        }
        this.f7366a = true;
        i.a().a(s.c(), this);
        return true;
    }

    static /* synthetic */ int c(j jVar) {
        int i = jVar.f7367b;
        jVar.f7367b = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            if (w.a().f7405a == w.d.OFF) {
                return;
            }
            if (!this.f7369d) {
                p.a(3, "JavaScriptBridge", this, "Ready for communication (setting environment variables).");
                this.f7369d = true;
            }
            String format = String.format("javascript:(function(e,k){function l(){function f(a){var b=a.c,c=a.a,f=a.b;a=a.f;var d=[];if(c)b[c]&&d.push(b[c].fn[0]);else for(key in b)if(b[key])for(var g=0,e=b[key].fn.length;g<e;g++)d.push(b[key].fn[g]);g=0;for(e=d.length;g<e;g++){var h=d[g];if('function'===typeof h)try{f?h(f):h()}catch(k){}a&&delete b[c]}}function d(a,b,c){'function'===typeof a&&(b===kuea&&c[b]?c[b].fn.push(a):c[b]={ts:+new Date,fn:[a]})}kuea=+new Date;iymv={};briz=!1;ewat=+new Date;bnkr=[];bjmk={};dptk={};uqaj={};ryup={};yhgt={};csif={};this.g=function(a){this.namespace=a.namespace;this.version=a.version;this.appName=a.appName;this.deviceOS=a.deviceOS;this.isNative=a.isNative;this.versionHash=a.versionHash;this.aqzx=a.aqzx;this.appId=a.appId};this.nvsj=function(a){briz||(d(a,ewat,iymv),briz=!0)};this.bpsy=function(a,b){var c=b||kuea;c!==kuea&&bjmk[c]||d(a,c,bjmk)};this.qmrv=function(a,b){var c=b||kuea;c!==kuea&&uqaj[c]||d(a,c,uqaj)};this.lgpr=function(a,b){d(a,b||kuea,yhgt)};this.hgen=function(a,b){d(a,b||kuea,csif)};this.xrnk=function(a){delete yhgt[a||kuea]};this.vgft=function(a){return dptk[a||kuea]||!1};this.lkpu=function(a){return ryup[a||kuea]||!1};this.crts=function(a){var b={c:iymv,b:a,a:ewat};briz?f(b):bnkr.push(a)};this.mqjh=function(a){var b=a||kuea;dptk[b]=!0;var c={c:bjmk,f:!0};b!==kuea&&(c.b=a,c.a=a);f(c)};this.egpw=function(a){var b=a||kuea;ryup[b]=!0;var c={c:uqaj,f:!0};b!==kuea&&(c.b=a,c.a=a);f(c)};this.sglu=function(a){var b={c:yhgt,b:a.event||a,f:!1};(a.adKey||kuea)!==kuea&&(b.a=a.adKey);f(b);return 0<Object.keys(yhgt).length};this.ucbx=function(a){f({a:a.adKey||kuea,c:csif,b:a.event,f:!1})}}'undefined'===typeof e.MoatMAK&&(e.MoatMAK=new l,e.MoatMAK.g(k),e.__zMoatInit__=!0)})(window,%s);", i());
            if (g()) {
                h().loadUrl(format);
            }
        } catch (Exception e) {
            p.a("JavaScriptBridge", this, "Failed to initialize communication (did not set environment variables).", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(19)
    public void d() {
        String str;
        String sb;
        try {
            if (w.a().f7405a == w.d.OFF) {
                return;
            }
            if (this.e != null && g() && (!this.f7368c || h().getUrl() != null)) {
                if (h().getUrl() != null) {
                    this.f7368c = true;
                }
                Iterator<Map.Entry<b, String>> it = this.f.entrySet().iterator();
                while (it.hasNext()) {
                    b key = it.next().getKey();
                    if (key == null || key.d() == null) {
                        p.a(3, "JavaScriptBridge", this, "Tracker has no subject");
                        if (key != null && key.f7339c) {
                        }
                        c(key);
                    }
                    if (key.f7340d) {
                        f(String.format("javascript: MoatMAK.mqjh(\"%s\")", key.f7338b));
                        String format = String.format("javascript: MoatMAK.sglu(%s)", key.f());
                        if (Build.VERSION.SDK_INT >= 19) {
                            h().evaluateJavascript(format, new ValueCallback<String>() { // from class: com.moat.analytics.mobile.vng.j.1
                                @Override // android.webkit.ValueCallback
                                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                                public void onReceiveValue(String str2) {
                                    String str3;
                                    if (str2 != null && !str2.equalsIgnoreCase("null") && !str2.equalsIgnoreCase("false")) {
                                        if (str2.equalsIgnoreCase("true")) {
                                            if (j.this.f7367b != 0) {
                                                p.a(3, "JavaScriptBridge", j.this, "Javascript has found ad");
                                                j.this.e();
                                            }
                                            j.this.f7367b = 0;
                                            return;
                                        }
                                        p.a(3, "JavaScriptBridge", j.this, "Received unusual value from Javascript:" + str2);
                                        return;
                                    }
                                    j jVar = j.this;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Received value is:");
                                    if (str2 == null) {
                                        str3 = "null";
                                    } else {
                                        str3 = "(String)" + str2;
                                    }
                                    sb2.append(str3);
                                    p.a(3, "JavaScriptBridge", jVar, sb2.toString());
                                    if (j.this.f7367b >= 50) {
                                        j.this.f();
                                    }
                                    j.c(j.this);
                                }
                            });
                        } else {
                            h().loadUrl(format);
                        }
                    }
                }
                return;
            }
            if (this.e == null) {
                str = "JavaScriptBridge";
                sb = "WebView ref became null, stopping tracking loop";
            } else {
                str = "JavaScriptBridge";
                StringBuilder sb2 = new StringBuilder();
                sb2.append("WebView became null");
                sb2.append(h() == null ? "" : "based on null url");
                sb2.append(", stopping tracking loop");
                sb = sb2.toString();
            }
            p.a(3, str, this, sb);
            f();
        } catch (Exception e) {
            m.a(e);
            f();
        }
    }

    private void d(b bVar) {
        p.a(3, "JavaScriptBridge", this, "Stopping view update loop");
        if (bVar != null) {
            i.a().a(bVar);
        }
    }

    private void d(String str) {
        if (this.k.size() >= 50) {
            this.k.subList(0, 25).clear();
        }
        this.k.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        p.a(3, "JavaScriptBridge", this, "Stopping metadata reporting loop");
        i.a().a(this);
        LocalBroadcastManager.getInstance(s.c()).unregisterReceiver(this.m);
    }

    private boolean e(String str) {
        if (this.f7366a) {
            return true;
        }
        p.a(6, "JavaScriptBridge", this, "Bridge is not installed in the given WebView. Can't " + str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        p.a(3, "JavaScriptBridge", this, "Cleaning up");
        e();
        Iterator<Map.Entry<b, String>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            d(it.next().getKey());
        }
        this.f.clear();
        LocalBroadcastManager.getInstance(s.c()).unregisterReceiver(this.n);
    }

    private void f(String str) {
        if (g()) {
            h().loadUrl(str);
        }
    }

    private boolean g() {
        return h() != null;
    }

    private WebView h() {
        return this.e.get();
    }

    private String i() {
        try {
            HashMap hashMap = new HashMap();
            String a2 = this.j.a();
            String b2 = this.j.b();
            String num = Integer.toString(Build.VERSION.SDK_INT);
            String b3 = s.b();
            String str = this.l == a.WEBVIEW ? "0" : "1";
            hashMap.put("versionHash", "3f2ae9c1894282b5e0222f0d06bbf457191f816f");
            hashMap.put("appName", a2);
            hashMap.put(FavaDiagnosticsEntity.EXTRA_NAMESPACE, "VNG");
            hashMap.put("version", "2.2.0");
            hashMap.put("deviceOS", num);
            hashMap.put("isNative", str);
            hashMap.put("appId", b2);
            if (b3 != null) {
                hashMap.put("aqzx", b3);
            }
            return new JSONObject(hashMap).toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    void a() {
        p.a(3, "JavaScriptBridge", this, "webViewReady");
        this.h.compareAndSet(false, true);
        e();
        Iterator<String> it = this.k.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
        this.k.clear();
    }

    void a(b bVar) {
        if (bVar != null) {
            p.a(3, "JavaScriptBridge", this, "adding tracker" + bVar.f7338b);
            this.f.put(bVar, "");
        }
    }

    void a(String str) {
        String format = String.format("javascript: MoatMAK.crts(%s)", str);
        if (this.h.get()) {
            f(format);
        } else {
            d(format);
        }
    }

    void a(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (this.h.get() && g()) {
            f(String.format("javascript:%s.dispatchEvent(%s);", str, jSONObject2));
        } else {
            this.g.add(jSONObject2);
        }
    }

    void b(String str) {
        p.a(3, "JavaScriptBridge", this, "markUserInteractionEvent:" + str);
        String format = String.format("javascript: MoatMAK.ucbx(%s)", str);
        if (this.h.get()) {
            f(format);
        } else {
            d(format);
        }
    }

    boolean b(b bVar) {
        try {
            if (g() && a(h(), "startTracking") && e("startTracking")) {
                if (bVar.d() == null) {
                    if (!bVar.f7339c) {
                        p.a(3, "JavaScriptBridge", this, "Tracker subject is null, won't start tracking");
                        return false;
                    }
                    p.a(3, "JavaScriptBridge", this, "Tracker subject is null at start");
                }
                p.a(3, "JavaScriptBridge", this, "Starting tracking on tracker" + bVar.f7338b);
                f(String.format("javascript: MoatMAK.mqjh(\"%s\")", bVar.f7338b));
                i.a().a(s.c(), bVar);
                return true;
            }
            return false;
        } catch (Exception e) {
            p.a("JavaScriptBridge", this, "Failed to initialize impression start.", e);
            return false;
        }
    }

    void c(String str) {
        p.a(3, "JavaScriptBridge", this, "flushDispatchQueue");
        this.h.compareAndSet(false, true);
        if (this.g.size() >= 200) {
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < 10; i++) {
                linkedList.addFirst(this.g.removeFirst());
            }
            int min = Math.min(Math.min(this.g.size() / ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, 10) + ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, this.g.size());
            for (int i2 = 0; i2 < min; i2++) {
                this.g.removeFirst();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                this.g.addFirst((String) it.next());
            }
        }
        int i3 = 0;
        while (!this.g.isEmpty() && i3 < 200) {
            i3++;
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            while (!this.g.isEmpty() && i3 < 200) {
                i3++;
                String first = this.g.getFirst();
                if (sb.length() + first.length() > 2000) {
                    break;
                }
                this.g.removeFirst();
                if (z) {
                    z = false;
                } else {
                    sb.append(",");
                }
                sb.append(first);
            }
            f(String.format("javascript:%s.dispatchMany([%s])", str, sb.toString()));
        }
        this.g.clear();
    }

    boolean c(b bVar) {
        boolean z = false;
        if (g() && a(h(), "stopTracking") && e("stopTracking")) {
            try {
                p.a(3, "JavaScriptBridge", this, "Ending tracking on tracker" + bVar.f7338b);
                f(String.format("javascript: MoatMAK.egpw(\"%s\")", bVar.f7338b));
            } catch (Exception e) {
                p.a("JavaScriptBridge", this, "Failed to end impression.", e);
            }
            z = true;
        }
        if (this.l == a.NATIVE_DISPLAY) {
            d(bVar);
        } else {
            f();
        }
        this.f.remove(bVar);
        return z;
    }

    protected void finalize() {
        try {
            super.finalize();
            p.a(3, "JavaScriptBridge", this, "finalize");
            f();
        } catch (Exception e) {
            m.a(e);
        }
    }
}
