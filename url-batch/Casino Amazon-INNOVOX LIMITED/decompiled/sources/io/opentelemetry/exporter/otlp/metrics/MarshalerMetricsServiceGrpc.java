package io.opentelemetry.exporter.otlp.metrics;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.MethodDescriptor;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.ClientCalls;
import io.opentelemetry.exporter.internal.grpc.MarshalerInputStream;
import io.opentelemetry.exporter.internal.grpc.MarshalerServiceStub;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import java.io.InputStream;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class MarshalerMetricsServiceGrpc {
    private static final MethodDescriptor.Marshaller<Marshaler> REQUEST_MARSHALLER;
    private static final MethodDescriptor.Marshaller<ExportMetricsServiceResponse> RESPONSE_MARSHALER;
    private static final String SERVICE_NAME = "opentelemetry.proto.collector.metrics.v1.MetricsService";
    private static final MethodDescriptor<Marshaler, ExportMetricsServiceResponse> getExportMethod;

    static {
        MethodDescriptor.Marshaller<Marshaler> marshaller = new MethodDescriptor.Marshaller<Marshaler>() { // from class: io.opentelemetry.exporter.otlp.metrics.MarshalerMetricsServiceGrpc.1
            public InputStream stream(Marshaler marshaler) {
                return new MarshalerInputStream(marshaler);
            }

            /* renamed from: parse, reason: merged with bridge method [inline-methods] */
            public Marshaler m3933parse(InputStream inputStream) {
                throw new UnsupportedOperationException("Only for serializing");
            }
        };
        REQUEST_MARSHALLER = marshaller;
        MethodDescriptor.Marshaller<ExportMetricsServiceResponse> marshaller2 = new MethodDescriptor.Marshaller<ExportMetricsServiceResponse>() { // from class: io.opentelemetry.exporter.otlp.metrics.MarshalerMetricsServiceGrpc.2
            public InputStream stream(ExportMetricsServiceResponse exportMetricsServiceResponse) {
                throw new UnsupportedOperationException("Only for parsing");
            }

            /* renamed from: parse, reason: merged with bridge method [inline-methods] */
            public ExportMetricsServiceResponse m3934parse(InputStream inputStream) {
                return ExportMetricsServiceResponse.INSTANCE;
            }
        };
        RESPONSE_MARSHALER = marshaller2;
        getExportMethod = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "Export")).setRequestMarshaller(marshaller).setResponseMarshaller(marshaller2).build();
    }

    static MetricsServiceFutureStub newFutureStub(Channel channel, @Nullable final String str) {
        return MetricsServiceFutureStub.newStub(new AbstractStub.StubFactory() { // from class: io.opentelemetry.exporter.otlp.metrics.MarshalerMetricsServiceGrpc$$ExternalSyntheticLambda0
            public final AbstractStub newStub(Channel channel2, CallOptions callOptions) {
                return MarshalerMetricsServiceGrpc.lambda$newFutureStub$0(str, channel2, callOptions);
            }
        }, channel);
    }

    static /* synthetic */ MetricsServiceFutureStub lambda$newFutureStub$0(String str, Channel channel, CallOptions callOptions) {
        return new MetricsServiceFutureStub(channel, callOptions.withAuthority(str));
    }

    static final class MetricsServiceFutureStub extends MarshalerServiceStub<Marshaler, ExportMetricsServiceResponse, MetricsServiceFutureStub> {
        private MetricsServiceFutureStub(Channel channel, CallOptions callOptions) {
            super(channel, callOptions);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public MetricsServiceFutureStub build(Channel channel, CallOptions callOptions) {
            return new MetricsServiceFutureStub(channel, callOptions);
        }

        @Override // io.opentelemetry.exporter.internal.grpc.MarshalerServiceStub
        public ListenableFuture<ExportMetricsServiceResponse> export(Marshaler marshaler) {
            return ClientCalls.futureUnaryCall(getChannel().newCall(MarshalerMetricsServiceGrpc.getExportMethod, getCallOptions()), marshaler);
        }
    }

    private MarshalerMetricsServiceGrpc() {
    }
}
