package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import s4.n;
import s4.p;
import s4.q;
import u0.b;
import u0.d;
import u0.e;
import v0.C0958b;
import v0.F;
import v0.H;
import v0.s;

/* loaded from: classes.dex */
public class ProxyManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ProxyManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_proxycontroller";
    public static e proxyController;
    public InAppWebViewFlutterPlugin plugin;

    public ProxyManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new q(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    private void clearProxyOverride(final p pVar) {
        e eVar = proxyController;
        if (eVar != null) {
            Executor executor = new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.3
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            };
            Runnable runnable = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.4
                @Override // java.lang.Runnable
                public void run() {
                    pVar.success(Boolean.TRUE);
                }
            };
            s sVar = (s) eVar;
            if (!F.f8140E.b()) {
                throw F.a();
            }
            if (sVar.f8197a == null) {
                sVar.f8197a = H.f8177a.getProxyController();
            }
            sVar.f8197a.clearProxyOverride(runnable, executor);
        }
    }

    public static void init() {
        if (proxyController == null && d.a("PROXY_OVERRIDE")) {
            if (!d.a("PROXY_OVERRIDE")) {
                throw new UnsupportedOperationException("Proxy override not supported");
            }
            proxyController = d.f8051a;
        }
    }

    private void setProxyOverride(ProxySettings proxySettings, final p pVar) {
        if (proxyController != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = proxySettings.bypassRules.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next());
            }
            Iterator<String> it2 = proxySettings.directs.iterator();
            while (it2.hasNext()) {
                arrayList.add(new b(it2.next(), "direct://"));
            }
            for (ProxyRuleExt proxyRuleExt : proxySettings.proxyRules) {
                if (proxyRuleExt.getSchemeFilter() != null) {
                    arrayList.add(new b(proxyRuleExt.getSchemeFilter(), proxyRuleExt.getUrl()));
                } else {
                    arrayList.add(new b("*", proxyRuleExt.getUrl()));
                }
            }
            Boolean bool = proxySettings.bypassSimpleHostnames;
            if (bool != null && bool.booleanValue()) {
                arrayList2.add("<local>");
            }
            Boolean bool2 = proxySettings.removeImplicitRules;
            if (bool2 != null && bool2.booleanValue()) {
                arrayList2.add("<-loopback>");
            }
            boolean booleanValue = (proxySettings.reverseBypassEnabled == null || !d.a("PROXY_OVERRIDE_REVERSE_BYPASS")) ? false : proxySettings.reverseBypassEnabled.booleanValue();
            e eVar = proxyController;
            Executor executor = new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.1
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            };
            Runnable runnable = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.2
                @Override // java.lang.Runnable
                public void run() {
                    pVar.success(Boolean.TRUE);
                }
            };
            s sVar = (s) eVar;
            sVar.getClass();
            C0958b c0958b = F.f8140E;
            C0958b c0958b2 = F.f8146K;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, unmodifiableList.size(), 2);
            for (int i2 = 0; i2 < unmodifiableList.size(); i2++) {
                strArr[i2][0] = ((b) unmodifiableList.get(i2)).f8049a;
                strArr[i2][1] = ((b) unmodifiableList.get(i2)).f8050b;
            }
            String[] strArr2 = (String[]) Collections.unmodifiableList(arrayList2).toArray(new String[0]);
            if (c0958b.b() && !booleanValue) {
                if (sVar.f8197a == null) {
                    sVar.f8197a = H.f8177a.getProxyController();
                }
                sVar.f8197a.setProxyOverride(strArr, strArr2, runnable, executor);
            } else {
                if (!c0958b.b() || !c0958b2.b()) {
                    throw F.a();
                }
                if (sVar.f8197a == null) {
                    sVar.f8197a = H.f8177a.getProxyController();
                }
                sVar.f8197a.setProxyOverride(strArr, strArr2, runnable, executor, booleanValue);
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, p pVar) {
        init();
        String str = nVar.f7767a;
        str.getClass();
        if (str.equals("clearProxyOverride")) {
            if (proxyController != null) {
                clearProxyOverride(pVar);
                return;
            } else {
                pVar.success(Boolean.FALSE);
                return;
            }
        }
        if (!str.equals("setProxyOverride")) {
            pVar.notImplemented();
            return;
        }
        if (proxyController == null) {
            pVar.success(Boolean.FALSE);
            return;
        }
        HashMap hashMap = (HashMap) nVar.a("settings");
        ProxySettings proxySettings = new ProxySettings();
        if (hashMap != null) {
            proxySettings.parse2((Map<String, Object>) hashMap);
        }
        setProxyOverride(proxySettings, pVar);
    }
}
