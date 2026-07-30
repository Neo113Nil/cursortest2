package com.moyoung.lib.ai.asrstream;

import android.util.Log;
import java.net.URI;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

/* loaded from: classes4.dex */
public class f extends WebSocketClient {
    private static final String TAG = "ASRWebSocketClient";
    private a listener;

    public interface a {
        void onClosed(String str);

        void onConnected();

        void onError(Exception exc);

        void onMessage(String str);
    }

    public f(URI uri, a aVar) {
        super(uri);
        this.listener = aVar;
    }

    public void closeConnection() {
        try {
            close();
        } catch (Exception e8) {
            Log.e(TAG, "关闭WebSocket时出错", e8);
        }
    }

    public void onClose(int i8, String str, boolean z7) {
        Log.d(TAG, "WebSocket连接关闭: code=" + i8 + ", reason=" + str + ", remote=" + z7);
        a aVar = this.listener;
        if (aVar != null) {
            aVar.onClosed("连接关闭: code=" + i8 + ", reason=" + str + ", remote=" + z7);
        }
    }

    public void onError(Exception exc) {
        Log.e(TAG, "WebSocket错误", exc);
        a aVar = this.listener;
        if (aVar != null) {
            aVar.onError(exc);
        }
    }

    public void onMessage(String str) {
        Log.d(TAG, "收到消息: " + str);
        a aVar = this.listener;
        if (aVar != null) {
            aVar.onMessage(str);
        }
    }

    public void onOpen(ServerHandshake serverHandshake) {
        Log.d(TAG, "WebSocket连接已建立");
        a aVar = this.listener;
        if (aVar != null) {
            aVar.onConnected();
        }
    }
}
