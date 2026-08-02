package com.squareup.wire.internal;

import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import com.squareup.wire.GrpcClient;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireGrpcClient;
import dev.zacsweers.metro.Provider;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealCall$timeout$1;
import okio.ForwardingTimeout;
import okio.Timeout;
import papa.PapaEvent;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class RealGrpcStreamingCall {
    public Object call;
    public final Object grpcClient;
    public final Object method;
    public final Object requestBody;
    public Object requestMetadata;
    public final Object timeout;

    public RealGrpcStreamingCall(WireGrpcClient wireGrpcClient, GrpcMethod grpcMethod) {
        wireGrpcClient.getClass();
        this.grpcClient = wireGrpcClient;
        this.method = grpcMethod;
        MediaType mediaType = GrpcKt.APPLICATION_GRPC_MEDIA_TYPE;
        this.requestBody = new PipeDuplexRequestBody(GrpcKt.APPLICATION_GRPC_MEDIA_TYPE);
        Timeout timeout = new Timeout();
        ForwardingTimeout forwardingTimeout = new ForwardingTimeout();
        forwardingTimeout.delegate = timeout;
        this.timeout = forwardingTimeout;
        forwardingTimeout.clearTimeout();
        forwardingTimeout.clearDeadline();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.requestMetadata = emptyMap;
    }

    public Pair executeIn(CoroutineScope coroutineScope) {
        GrpcMethod grpcMethod = (GrpcMethod) this.method;
        coroutineScope.getClass();
        Continuation continuation = null;
        BufferedChannel Channel$default = PapaEvent.Channel$default(1, null, null, 6);
        BufferedChannel Channel$default2 = PapaEvent.Channel$default(1, null, null, 6);
        ForwardingTimeout forwardingTimeout = (ForwardingTimeout) this.timeout;
        if (((Call) this.call) != null) {
            a$$ExternalSyntheticBUOutline0.m$1("already executed");
            return null;
        }
        WireGrpcClient wireGrpcClient = (WireGrpcClient) this.grpcClient;
        Map map = (Map) this.requestMetadata;
        PipeDuplexRequestBody pipeDuplexRequestBody = (PipeDuplexRequestBody) this.requestBody;
        wireGrpcClient.getClass();
        map.getClass();
        pipeDuplexRequestBody.getClass();
        forwardingTimeout.getClass();
        OkHttpClient okHttpClient = wireGrpcClient.client;
        Request.Builder builder = new Request.Builder();
        HttpUrl resolve = wireGrpcClient.baseUrl.resolve((String) grpcMethod.path);
        resolve.getClass();
        builder.url = resolve;
        builder.addHeader("te", "trailers");
        builder.addHeader("grpc-trace-bin", "");
        builder.addHeader("grpc-accept-encoding", "gzip");
        for (Map.Entry entry : map.entrySet()) {
            builder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (forwardingTimeout.delegate.hasDeadline()) {
            builder.addHeader("grpc-timeout", GrpcClient.serializeTimeout(forwardingTimeout.delegate.deadlineNanoTime()));
        }
        if (forwardingTimeout.delegate.timeoutNanos() > 0) {
            builder.addHeader("grpc-timeout", GrpcClient.serializeTimeout(forwardingTimeout.delegate.timeoutNanos()));
        }
        builder.tag(GrpcMethod.class, grpcMethod);
        builder.method("POST", pipeDuplexRequestBody);
        RealCall realCall = new RealCall(okHttpClient, new Request(builder), false);
        this.call = realCall;
        RealCall$timeout$1 realCall$timeout$1 = realCall.timeout;
        realCall$timeout$1.getClass();
        forwardingTimeout.delegate = realCall$timeout$1;
        Channel$default2.invokeOnClose(new MoleculeKt$$ExternalSyntheticLambda1(9, Channel$default2, realCall, Channel$default));
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new CoroutinesKt$until$2(Channel$default, this, realCall, continuation, 13), 2);
        ProtoAdapter protoAdapter = (ProtoAdapter) grpcMethod.responseAdapter;
        MediaType mediaType = GrpcKt.APPLICATION_GRPC_MEDIA_TYPE;
        protoAdapter.getClass();
        realCall.enqueue(new OkHttpCall.AnonymousClass1(Channel$default2, this, protoAdapter));
        return new Pair(Channel$default, Channel$default2);
    }

    public /* synthetic */ RealGrpcStreamingCall(Provider provider, Provider provider2, Object obj, Provider provider3, Provider provider4, Provider provider5) {
        this.grpcClient = provider;
        this.method = provider2;
        this.requestBody = obj;
        this.call = provider3;
        this.timeout = provider4;
        this.requestMetadata = provider5;
    }
}
