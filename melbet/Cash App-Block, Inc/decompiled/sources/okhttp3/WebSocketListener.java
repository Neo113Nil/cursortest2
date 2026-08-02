package okhttp3;

import okio.ByteString;

/* loaded from: classes9.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String str) {
        webSocket.getClass();
        str.getClass();
    }

    public abstract void onClosing(WebSocket webSocket, int i, String str);

    public abstract void onFailure(WebSocket webSocket, Throwable th, Response response);

    public abstract void onMessage(WebSocket webSocket, String str);

    public void onMessage(WebSocket webSocket, ByteString byteString) {
        webSocket.getClass();
        byteString.getClass();
    }

    public void onOpen(WebSocket webSocket, Response response) {
    }
}
