package io.opentelemetry.exporter.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes3.dex */
public final class RetryUtil {
    private static final Set<String> RETRYABLE_GRPC_STATUS_CODES;
    private static final Set<Integer> RETRYABLE_HTTP_STATUS_CODES = Collections.unmodifiableSet(new HashSet(Arrays.asList(429, Integer.valueOf(TypedValues.Position.TYPE_DRAWPATH), Integer.valueOf(TypedValues.Position.TYPE_PERCENT_WIDTH), Integer.valueOf(TypedValues.Position.TYPE_PERCENT_HEIGHT))));

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(8);
        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(14);
        hashSet.add(15);
        RETRYABLE_GRPC_STATUS_CODES = Collections.unmodifiableSet((Set) hashSet.stream().map(new Function() { // from class: io.opentelemetry.exporter.internal.RetryUtil$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String obj2;
                obj2 = ((Integer) obj).toString();
                return obj2;
            }
        }).collect(Collectors.toSet()));
    }

    private RetryUtil() {
    }

    public static Set<String> retryableGrpcStatusCodes() {
        return RETRYABLE_GRPC_STATUS_CODES;
    }

    public static Set<Integer> retryableHttpResponseCodes() {
        return RETRYABLE_HTTP_STATUS_CODES;
    }
}
