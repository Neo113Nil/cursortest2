package io.opentelemetry.exporter.internal.grpc;

import androidx.core.app.NotificationCompat;
import io.grpc.ManagedChannel;
import io.opentelemetry.exporter.internal.RetryUtil;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.export.RetryPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* loaded from: classes3.dex */
public final class ManagedChannelUtil {
    private static final Logger logger = Logger.getLogger(ManagedChannelUtil.class.getName());

    public static Map<String, ?> toServiceConfig(String str, RetryPolicy retryPolicy) {
        List list = (List) RetryUtil.retryableGrpcStatusCodes().stream().map(new Function() { // from class: io.opentelemetry.exporter.internal.grpc.ManagedChannelUtil$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                double parseDouble;
                parseDouble = Double.parseDouble((String) obj);
                return Double.valueOf(parseDouble);
            }
        }).collect(Collectors.toList());
        HashMap hashMap = new HashMap();
        hashMap.put("retryableStatusCodes", list);
        hashMap.put("maxAttempts", Double.valueOf(retryPolicy.getMaxAttempts()));
        hashMap.put("initialBackoff", (retryPolicy.getInitialBackoff().toMillis() / 1000.0d) + "s");
        hashMap.put("maxBackoff", (retryPolicy.getMaxBackoff().toMillis() / 1000.0d) + "s");
        hashMap.put("backoffMultiplier", Double.valueOf(retryPolicy.getBackoffMultiplier()));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("name", Collections.singletonList(Collections.singletonMap(NotificationCompat.CATEGORY_SERVICE, str)));
        hashMap2.put("retryPolicy", hashMap);
        return Collections.singletonMap("methodConfig", Collections.singletonList(hashMap2));
    }

    public static CompletableResultCode shutdownChannel(final ManagedChannel managedChannel) {
        final CompletableResultCode completableResultCode = new CompletableResultCode();
        managedChannel.shutdown();
        Thread thread = new Thread(new Runnable() { // from class: io.opentelemetry.exporter.internal.grpc.ManagedChannelUtil$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ManagedChannelUtil.lambda$shutdownChannel$0(managedChannel, completableResultCode);
            }
        });
        thread.setDaemon(true);
        thread.setName("grpc-cleanup");
        thread.start();
        return completableResultCode;
    }

    static /* synthetic */ void lambda$shutdownChannel$0(ManagedChannel managedChannel, CompletableResultCode completableResultCode) {
        try {
            managedChannel.awaitTermination(10L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.log(Level.WARNING, "Failed to shutdown the gRPC channel", (Throwable) e);
            completableResultCode.fail();
        }
        completableResultCode.succeed();
    }

    private ManagedChannelUtil() {
    }
}
