package com.squareup.wire.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.wire.ProtoAdapter;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.SendChannel;
import okhttp3.Response;
import okio.Utf8;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class GrpcKt$readFromResponseBodyCallback$1$onResponse$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Response $response;
    public final /* synthetic */ ProtoAdapter $responseAdapter;
    public final /* synthetic */ BufferedChannel $this_readFromResponseBodyCallback;
    public Closeable L$0;
    public Response L$1;
    public SendChannel L$2;
    public Closeable L$3;
    public GrpcMessageSource L$4;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrpcKt$readFromResponseBodyCallback$1$onResponse$1(Response response, ProtoAdapter protoAdapter, BufferedChannel bufferedChannel, Continuation continuation) {
        super(2, continuation);
        this.$response = response;
        this.$responseAdapter = protoAdapter;
        this.$this_readFromResponseBodyCallback = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GrpcKt$readFromResponseBodyCallback$1$onResponse$1(this.$response, this.$responseAdapter, this.$this_readFromResponseBodyCallback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GrpcKt$readFromResponseBodyCallback$1$onResponse$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r5;
        ?? r7;
        Closeable closeable;
        Response response;
        GrpcMessageSource messageSource;
        Response response2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        SafeTrace.throwOnFailure(obj);
                        response = this.$response;
                        ProtoAdapter protoAdapter = this.$responseAdapter;
                        BufferedChannel bufferedChannel = this.$this_readFromResponseBodyCallback;
                        try {
                            messageSource = GrpcKt.messageSource(response, protoAdapter);
                            response2 = response;
                            r7 = response2;
                            r5 = bufferedChannel;
                            closeable = messageSource;
                        } catch (IOException e) {
                            try {
                                bufferedChannel.closeOrCancelImpl(e, false);
                            } catch (CancellationException unused) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        messageSource = this.L$4;
                        closeable = this.L$3;
                        r5 = this.L$2;
                        response2 = this.L$1;
                        r7 = this.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            r5 = r5;
                            r7 = r7;
                        } catch (IOException e2) {
                            e = GrpcKt.grpcResponseToException(response2, e2);
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                    do {
                        obj = messageSource.read();
                        if (obj == 0) {
                            e = GrpcKt.grpcResponseToException(response2, null);
                            try {
                                r5.close(e);
                            } catch (CancellationException unused2) {
                            }
                            response = r7;
                            Utf8.closeFinally(closeable, null);
                            Utf8.closeFinally(response, null);
                            return Unit.INSTANCE;
                        }
                        this.L$0 = r7;
                        this.L$1 = response2;
                        this.L$2 = r5;
                        this.L$3 = closeable;
                        this.L$4 = messageSource;
                        this.label = 1;
                    } while (r5.send(obj, this) != coroutineSingletons);
                    return coroutineSingletons;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Utf8.closeFinally(obj, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                r5.close(null);
            } catch (CancellationException unused3) {
            }
            throw th3;
        }
    }
}
