package io.opentelemetry.exporter.internal.otlp.traces;

import io.opentelemetry.api.trace.TraceFlags;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class SpanFlags {
    static final int CONTEXT_HAS_IS_REMOTE_BIT = 256;
    static final int CONTEXT_IS_REMOTE_BIT = 512;
    static final int CONTEXT_IS_REMOTE_MASK = 768;

    public static int getHasParentIsRemoteMask() {
        return 256;
    }

    public static int getParentIsRemoteMask() {
        return 768;
    }

    public static boolean isKnownWhetherParentIsRemote(int i) {
        return (i & 256) != 0;
    }

    public static boolean isParentRemote(int i) {
        return (i & 768) == 768;
    }

    private SpanFlags() {
    }

    public static int withParentIsRemoteFlags(TraceFlags traceFlags, boolean z) {
        byte asByte = traceFlags.asByte();
        return z ? (asByte & UByte.MAX_VALUE) | 768 : (asByte & UByte.MAX_VALUE) | 256;
    }

    public static TraceFlags getTraceFlags(int i) {
        return TraceFlags.fromByte((byte) (i & 255));
    }
}
