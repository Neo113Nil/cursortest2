package okhttp3;

import kotlin.jvm.internal.s;
import okio.ByteString;

/* loaded from: classes5.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i8, String reason) {
        s.checkNotNullParameter(webSocket, "webSocket");
        s.checkNotNullParameter(reason, "reason");
    }

    public void onClosing(WebSocket webSocket, int i8, String reason) {
        s.checkNotNullParameter(webSocket, "webSocket");
        s.checkNotNullParameter(reason, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable t7, Response response) {
        s.checkNotNullParameter(webSocket, "webSocket");
        s.checkNotNullParameter(t7, "t");
    }

    public void onMessage(WebSocket webSocket, String text) {
        s.checkNotNullParameter(webSocket, "webSocket");
        s.checkNotNullParameter(text, "text");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        s.checkNotNullParameter(webSocket, "webSocket");
        s.checkNotNullParameter(response, "response");
    }

    public void onMessage(WebSocket webSocket, ByteString bytes) {
        s.checkNotNullParameter(webSocket, "webSocket");
        s.checkNotNullParameter(bytes, "bytes");
    }
}
