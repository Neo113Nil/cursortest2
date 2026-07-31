package io.opentelemetry.exporter.otlp.trace;

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
final class MarshalerTraceServiceGrpc {
    private static final MethodDescriptor.Marshaller<Marshaler> REQUEST_MARSHALLER;
    private static final MethodDescriptor.Marshaller<ExportTraceServiceResponse> RESPONSE_MARSHALER;
    private static final String SERVICE_NAME = "opentelemetry.proto.collector.trace.v1.TraceService";
    private static final MethodDescriptor<Marshaler, ExportTraceServiceResponse> getExportMethod;

    static {
        MethodDescriptor.Marshaller<Marshaler> marshaller = new MethodDescriptor.Marshaller<Marshaler>() { // from class: io.opentelemetry.exporter.otlp.trace.MarshalerTraceServiceGrpc.1
            public InputStream stream(Marshaler marshaler) {
                return new MarshalerInputStream(marshaler);
            }

            /* renamed from: parse, reason: merged with bridge method [inline-methods] */
            public Marshaler m3936parse(InputStream inputStream) {
                throw new UnsupportedOperationException("Only for serializing");
            }
        };
        REQUEST_MARSHALLER = marshaller;
        MethodDescriptor.Marshaller<ExportTraceServiceResponse> marshaller2 = new MethodDescriptor.Marshaller<ExportTraceServiceResponse>() { // from class: io.opentelemetry.exporter.otlp.trace.MarshalerTraceServiceGrpc.2
            public InputStream stream(ExportTraceServiceResponse exportTraceServiceResponse) {
                throw new UnsupportedOperationException("Only for parsing");
            }

            /* renamed from: parse, reason: merged with bridge method [inline-methods] */
            public ExportTraceServiceResponse m3937parse(InputStream inputStream) {
                return ExportTraceServiceResponse.INSTANCE;
            }
        };
        RESPONSE_MARSHALER = marshaller2;
        getExportMethod = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "Export")).setRequestMarshaller(marshaller).setResponseMarshaller(marshaller2).build();
    }

    static TraceServiceFutureStub newFutureStub(Channel channel, @Nullable final String str) {
        return TraceServiceFutureStub.newStub(new AbstractStub.StubFactory() { // from class: io.opentelemetry.exporter.otlp.trace.MarshalerTraceServiceGrpc$$ExternalSyntheticLambda0
            public final AbstractStub newStub(Channel channel2, CallOptions callOptions) {
                return MarshalerTraceServiceGrpc.lambda$newFutureStub$0(str, channel2, callOptions);
            }
        }, channel);
    }

    static /* synthetic */ TraceServiceFutureStub lambda$newFutureStub$0(String str, Channel channel, CallOptions callOptions) {
        return new TraceServiceFutureStub(channel, callOptions.withAuthority(str));
    }

    static final class TraceServiceFutureStub extends MarshalerServiceStub<Marshaler, ExportTraceServiceResponse, TraceServiceFutureStub> {
        private TraceServiceFutureStub(Channel channel, CallOptions callOptions) {
            super(channel, callOptions);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public TraceServiceFutureStub build(Channel channel, CallOptions callOptions) {
            return new TraceServiceFutureStub(channel, callOptions);
        }

        @Override // io.opentelemetry.exporter.internal.grpc.MarshalerServiceStub
        public ListenableFuture<ExportTraceServiceResponse> export(Marshaler marshaler) {
            return ClientCalls.futureUnaryCall(getChannel().newCall(MarshalerTraceServiceGrpc.getExportMethod, getCallOptions()), marshaler);
        }
    }

    private MarshalerTraceServiceGrpc() {
    }
}
