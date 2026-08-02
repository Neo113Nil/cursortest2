package io.opentelemetry.api.trace;

import io.opentelemetry.api.internal.OtelEncodingUtils;

/* loaded from: classes4.dex */
public interface SpanContext {
    String getSpanId();

    ImmutableTraceFlags getTraceFlags();

    String getTraceId();

    default boolean isValid() {
        String traceId = getTraceId();
        if (traceId != null && traceId.length() == 32 && !"00000000000000000000000000000000".contentEquals(traceId)) {
            char[] cArr = OtelEncodingUtils.ENCODING;
            int length = traceId.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    String spanId = getSpanId();
                    if (spanId != null && spanId.length() == 16 && !"0000000000000000".contentEquals(spanId)) {
                        int length2 = spanId.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            if (OtelEncodingUtils.VALID_HEX[spanId.charAt(i2)]) {
                            }
                        }
                        return true;
                    }
                } else {
                    if (!OtelEncodingUtils.VALID_HEX[traceId.charAt(i)]) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}
