package io.flutter.embedding.engine.systemchannels;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class PlatformViewCreationRequest {
    public final int direction;
    public final RequestedDisplayMode displayMode;
    public final double logicalHeight;
    public final double logicalLeft;
    public final double logicalTop;
    public final double logicalWidth;
    public final ByteBuffer params;
    public final int viewId;
    public final String viewType;

    public enum RequestedDisplayMode {
        TEXTURE_WITH_VIRTUAL_FALLBACK,
        TEXTURE_WITH_HYBRID_FALLBACK,
        HYBRID_ONLY
    }

    public PlatformViewCreationRequest(int i4, String str, double d4, double d5, double d6, double d7, int i5, ByteBuffer byteBuffer) {
        this(i4, str, d4, d5, d6, d7, i5, RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBuffer);
    }

    public static PlatformViewCreationRequest createHCPPRequest(int i4, String str, int i5, ByteBuffer byteBuffer) {
        return new PlatformViewCreationRequest(i4, str, 0.0d, 0.0d, 0.0d, 0.0d, i5, null, byteBuffer);
    }

    public static PlatformViewCreationRequest createHybridCompositionRequest(int i4, String str, int i5, ByteBuffer byteBuffer) {
        return new PlatformViewCreationRequest(i4, str, 0.0d, 0.0d, 0.0d, 0.0d, i5, RequestedDisplayMode.HYBRID_ONLY, byteBuffer);
    }

    public static PlatformViewCreationRequest createTLHCWithFallbackRequest(int i4, String str, double d4, double d5, double d6, double d7, int i5, boolean z, ByteBuffer byteBuffer) {
        return new PlatformViewCreationRequest(i4, str, d4, d5, d6, d7, i5, z ? RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK : RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBuffer);
    }

    public PlatformViewCreationRequest(int i4, String str, double d4, double d5, double d6, double d7, int i5, RequestedDisplayMode requestedDisplayMode, ByteBuffer byteBuffer) {
        this.viewId = i4;
        this.viewType = str;
        this.logicalTop = d4;
        this.logicalLeft = d5;
        this.logicalWidth = d6;
        this.logicalHeight = d7;
        this.direction = i5;
        this.displayMode = requestedDisplayMode;
        this.params = byteBuffer;
    }
}
