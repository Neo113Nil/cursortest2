package io.opentelemetry.exporter.internal.grpc;

import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class GrpcResponse {
    @Nullable
    public abstract String grpcStatusDescription();

    public abstract int grpcStatusValue();

    GrpcResponse() {
    }

    public static GrpcResponse create(int i, @Nullable String str) {
        return new AutoValue_GrpcResponse(i, str);
    }
}
