package com.iab.omid.library.startio.messagelistener;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface b {
    String getListenerName();

    void onMessageReceived(String str, JSONObject jSONObject);

    void onWebMessageListenerUnsupported();
}
