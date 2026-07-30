package io.flutter.plugins.firebase.core;

import A.k;
import K1.h;
import P1.g;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import x4.RunnableC1008c;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    public static Task<Void> didReinitializeFirebaseCore() {
        h hVar = new h();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(22, hVar));
        return hVar.f1428a;
    }

    public static Task<Map<String, Object>> getPluginConstantsForFirebaseApp(g gVar) {
        h hVar = new h();
        FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1008c(gVar, hVar));
        return hVar.f1428a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(h hVar) {
        try {
            Iterator<Map.Entry<String, FlutterFirebasePlugin>> it = registeredPlugins.entrySet().iterator();
            while (it.hasNext()) {
                AbstractC1053a.e(it.next().getValue().didReinitializeFirebaseCore());
            }
            hVar.b(null);
        } catch (Exception e7) {
            hVar.a(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(g gVar, h hVar) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry<String, FlutterFirebasePlugin> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), AbstractC1053a.e(entry.getValue().getPluginConstantsForFirebaseApp(gVar)));
            }
            hVar.b(hashMap);
        } catch (Exception e7) {
            hVar.a(e7);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
