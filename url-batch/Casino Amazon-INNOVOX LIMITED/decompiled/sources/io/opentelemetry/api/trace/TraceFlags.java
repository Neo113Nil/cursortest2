package io.opentelemetry.api.trace;

/* loaded from: classes3.dex */
public interface TraceFlags {
    static int getLength() {
        return 2;
    }

    byte asByte();

    String asHex();

    boolean isSampled();

    static TraceFlags getDefault() {
        return ImmutableTraceFlags.DEFAULT;
    }

    static TraceFlags getSampled() {
        return ImmutableTraceFlags.SAMPLED;
    }

    static TraceFlags fromHex(CharSequence charSequence, int i) {
        return ImmutableTraceFlags.fromHex(charSequence, i);
    }

    static TraceFlags fromByte(byte b) {
        return ImmutableTraceFlags.fromByte(b);
    }
}
