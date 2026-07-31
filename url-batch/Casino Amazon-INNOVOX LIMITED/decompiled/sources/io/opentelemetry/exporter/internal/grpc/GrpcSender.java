package io.opentelemetry.exporter.internal.grpc;

import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.sdk.common.CompletableResultCode;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public interface GrpcSender<T extends Marshaler> {
    void send(T t, Consumer<GrpcResponse> consumer, Consumer<Throwable> consumer2);

    CompletableResultCode shutdown();
}
