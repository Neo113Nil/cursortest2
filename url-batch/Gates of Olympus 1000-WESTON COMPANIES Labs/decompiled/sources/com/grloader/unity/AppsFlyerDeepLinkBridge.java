package com.grloader.unity;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.unity3d.player.UnityPlayer;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AppsFlyerDeepLinkBridge {
    public static void subscribe() {
        AppsFlyerLib.getInstance().subscribeForDeepLink(new DeepLinkListener() { // from class: com.grloader.unity.AppsFlyerDeepLinkBridge$$ExternalSyntheticLambda0
            @Override // com.appsflyer.deeplink.DeepLinkListener
            public final void onDeepLinking(DeepLinkResult deepLinkResult) {
                AppsFlyerDeepLinkBridge.lambda$subscribe$0(deepLinkResult);
            }
        });
    }

    static /* synthetic */ void lambda$subscribe$0(DeepLinkResult deepLinkResult) {
        try {
            if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND) {
                JSONObject clickEvent = deepLinkResult.getDeepLink().getClickEvent();
                JSONObject jSONObject = new JSONObject();
                Iterator<String> keys = clickEvent.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, clickEvent.get(next));
                }
                UnityPlayer.UnitySendMessage("- GR Loader -", "OnDeepLinkReceived", jSONObject.toString());
            }
        } catch (Exception e) {
            UnityPlayer.UnitySendMessage("- GR Loader -", "OnDeepLinkError", e.toString());
        }
    }
}
