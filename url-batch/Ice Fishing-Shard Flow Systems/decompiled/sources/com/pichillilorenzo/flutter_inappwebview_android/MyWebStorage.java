package com.pichillilorenzo.flutter_inappwebview_android;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import s4.n;
import s4.p;
import s4.q;

/* loaded from: classes.dex */
public class MyWebStorage extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "MyWebStorage";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webstoragemanager";
    public static WebStorage webStorageManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyWebStorage(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new q(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init() {
        if (webStorageManager == null) {
            webStorageManager = WebStorage.getInstance();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public void getOrigins(final p pVar) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            pVar.success(new ArrayList());
        } else {
            webStorage.getOrigins(new ValueCallback<Map>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Map map) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        WebStorage.Origin origin = (WebStorage.Origin) map.get(it.next());
                        HashMap hashMap = new HashMap();
                        hashMap.put("origin", origin.getOrigin());
                        hashMap.put("quota", Long.valueOf(origin.getQuota()));
                        hashMap.put("usage", Long.valueOf(origin.getUsage()));
                        arrayList.add(hashMap);
                    }
                    pVar.success(arrayList);
                }
            });
        }
    }

    public void getQuotaForOrigin(String str, final p pVar) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            pVar.success(0);
        } else {
            webStorage.getQuotaForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.2
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Long l7) {
                    pVar.success(l7);
                }
            });
        }
    }

    public void getUsageForOrigin(String str, final p pVar) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            pVar.success(0);
        } else {
            webStorage.getUsageForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.3
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Long l7) {
                    pVar.success(l7);
                }
            });
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, s4.o
    public void onMethodCall(n nVar, p pVar) {
        init();
        String str = nVar.f7767a;
        str.getClass();
        switch (str) {
            case "getQuotaForOrigin":
                getQuotaForOrigin((String) nVar.a("origin"), pVar);
                break;
            case "deleteAllData":
                WebStorage webStorage = webStorageManager;
                if (webStorage == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    webStorage.deleteAllData();
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case "deleteOrigin":
                if (webStorageManager == null) {
                    pVar.success(Boolean.FALSE);
                    break;
                } else {
                    webStorageManager.deleteOrigin((String) nVar.a("origin"));
                    pVar.success(Boolean.TRUE);
                    break;
                }
            case "getOrigins":
                getOrigins(pVar);
                break;
            case "getUsageForOrigin":
                getUsageForOrigin((String) nVar.a("origin"), pVar);
                break;
            default:
                pVar.notImplemented();
                break;
        }
    }
}
