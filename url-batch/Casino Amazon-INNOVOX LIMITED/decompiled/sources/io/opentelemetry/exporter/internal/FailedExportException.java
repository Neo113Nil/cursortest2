package io.opentelemetry.exporter.internal;

import io.opentelemetry.exporter.internal.grpc.GrpcResponse;
import io.opentelemetry.exporter.internal.http.HttpSender;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class FailedExportException extends Exception {
    private static final long serialVersionUID = 6988924855140178789L;

    public abstract boolean failedWithResponse();

    private FailedExportException(@Nullable Throwable th) {
        super(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HttpExportException httpFailedWithResponse(HttpSender.Response response) {
        return new HttpExportException(response, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HttpExportException httpFailedExceptionally(Throwable th) {
        return new HttpExportException(null, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GrpcExportException grpcFailedWithResponse(GrpcResponse grpcResponse) {
        return new GrpcExportException(grpcResponse, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GrpcExportException grpcFailedExceptionally(Throwable th) {
        return new GrpcExportException(null, th);
    }

    public static final class HttpExportException extends FailedExportException {
        private static final long serialVersionUID = -6787390183017184775L;

        @Nullable
        private final Throwable cause;

        @Nullable
        private final HttpSender.Response response;

        private HttpExportException(@Nullable HttpSender.Response response, @Nullable Throwable th) {
            super(th);
            this.response = response;
            this.cause = th;
        }

        @Override // io.opentelemetry.exporter.internal.FailedExportException
        public boolean failedWithResponse() {
            return this.response != null;
        }

        @Nullable
        public HttpSender.Response getResponse() {
            return this.response;
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public static final class GrpcExportException extends FailedExportException {
        private static final long serialVersionUID = -9157548250286695364L;

        @Nullable
        private final Throwable cause;

        @Nullable
        private final GrpcResponse response;

        private GrpcExportException(@Nullable GrpcResponse grpcResponse, @Nullable Throwable th) {
            super(th);
            this.response = grpcResponse;
            this.cause = th;
        }

        @Override // io.opentelemetry.exporter.internal.FailedExportException
        public boolean failedWithResponse() {
            return this.response != null;
        }

        @Nullable
        public GrpcResponse getResponse() {
            return this.response;
        }

        @Override // java.lang.Throwable
        @Nullable
        public Throwable getCause() {
            return this.cause;
        }
    }
}
