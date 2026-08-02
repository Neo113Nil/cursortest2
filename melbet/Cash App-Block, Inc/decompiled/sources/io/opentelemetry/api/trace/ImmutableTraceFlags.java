package io.opentelemetry.api.trace;

import io.opentelemetry.api.internal.OtelEncodingUtils;

/* loaded from: classes4.dex */
public final class ImmutableTraceFlags {
    public static final ImmutableTraceFlags DEFAULT;
    public static final ImmutableTraceFlags SAMPLED;
    public final byte byteRep;
    public final String hexRep;

    static {
        ImmutableTraceFlags[] immutableTraceFlagsArr = new ImmutableTraceFlags[256];
        for (int i = 0; i < 256; i++) {
            immutableTraceFlagsArr[i] = new ImmutableTraceFlags((byte) i);
        }
        DEFAULT = immutableTraceFlagsArr[0];
        SAMPLED = immutableTraceFlagsArr[1];
    }

    public ImmutableTraceFlags(byte b) {
        int i = b & 255;
        char[] cArr = OtelEncodingUtils.ENCODING;
        this.hexRep = new String(new char[]{cArr[i], cArr[i | 256]});
        this.byteRep = b;
    }

    public final String toString() {
        return this.hexRep;
    }
}
