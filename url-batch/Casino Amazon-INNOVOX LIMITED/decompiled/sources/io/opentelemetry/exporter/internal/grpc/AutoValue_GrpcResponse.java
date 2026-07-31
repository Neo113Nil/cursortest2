package io.opentelemetry.exporter.internal.grpc;

import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class AutoValue_GrpcResponse extends GrpcResponse {

    @Nullable
    private final String grpcStatusDescription;
    private final int grpcStatusValue;

    AutoValue_GrpcResponse(int i, @Nullable String str) {
        this.grpcStatusValue = i;
        this.grpcStatusDescription = str;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcResponse
    public int grpcStatusValue() {
        return this.grpcStatusValue;
    }

    @Override // io.opentelemetry.exporter.internal.grpc.GrpcResponse
    @Nullable
    public String grpcStatusDescription() {
        return this.grpcStatusDescription;
    }

    public String toString() {
        return "GrpcResponse{grpcStatusValue=" + this.grpcStatusValue + ", grpcStatusDescription=" + this.grpcStatusDescription + "}";
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof GrpcResponse) {
            GrpcResponse grpcResponse = (GrpcResponse) obj;
            if (this.grpcStatusValue == grpcResponse.grpcStatusValue() && ((str = this.grpcStatusDescription) != null ? str.equals(grpcResponse.grpcStatusDescription()) : grpcResponse.grpcStatusDescription() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.grpcStatusValue ^ 1000003) * 1000003;
        String str = this.grpcStatusDescription;
        return i ^ (str == null ? 0 : str.hashCode());
    }
}
