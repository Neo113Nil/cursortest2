package io.flutter.embedding.engine.dart;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface PlatformMessageHandler {
    void handleMessageFromDart(String str, ByteBuffer byteBuffer, int i4, long j4);

    void handlePlatformMessageResponse(int i4, ByteBuffer byteBuffer);
}
