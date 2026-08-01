package io.ktor.client.plugins.websocket;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: builders.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2", f = "builders.kt", i = {0, 1, 1, 2, 2}, l = {239, 242, 49, 248, 248}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class BuildersKt$webSocketSession$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CompletableDeferred<DefaultClientWebSocketSession> $sessionDeferred;
    final /* synthetic */ HttpStatement $statement;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BuildersKt$webSocketSession$2(HttpStatement httpStatement, CompletableDeferred<DefaultClientWebSocketSession> completableDeferred, Continuation<? super BuildersKt$webSocketSession$2> continuation) {
        super(2, continuation);
        this.$statement = httpStatement;
        this.$sessionDeferred = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuildersKt$webSocketSession$2(this.$statement, this.$sessionDeferred, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuildersKt$webSocketSession$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:35:0x004e, B:37:0x00ab, B:41:0x00e4, B:42:0x00eb), top: B:34:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4 A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:35:0x004e, B:37:0x00ab, B:41:0x00e4, B:42:0x00eb), top: B:34:0x004e }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CompletableDeferred<DefaultClientWebSocketSession> completableDeferred;
        HttpStatement httpStatement;
        HttpResponse httpResponse;
        HttpStatement httpStatement2;
        HttpResponse httpResponse2;
        Throwable th;
        CompletableDeferred<DefaultClientWebSocketSession> completableDeferred2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } catch (CancellationException e) {
                throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
            }
        } catch (Throwable th2) {
            this.$sessionDeferred.completeExceptionally(th2);
        }
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HttpStatement httpStatement3 = this.$statement;
                completableDeferred = this.$sessionDeferred;
                this.L$0 = httpStatement3;
                this.L$1 = completableDeferred;
                this.label = 1;
                Object executeUnsafe = httpStatement3.executeUnsafe(this);
                if (executeUnsafe == coroutine_suspended) {
                    return coroutine_suspended;
                }
                httpStatement = httpStatement3;
                obj = executeUnsafe;
            } else if (i == 1) {
                completableDeferred = (CompletableDeferred) this.L$1;
                httpStatement = (HttpStatement) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    httpResponse2 = (HttpResponse) this.L$2;
                    completableDeferred2 = (CompletableDeferred) this.L$1;
                    httpStatement = (HttpStatement) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        if (obj != null) {
                            throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                        }
                        DefaultClientWebSocketSession defaultClientWebSocketSession = (DefaultClientWebSocketSession) obj;
                        BuildersKt$webSocketSession$2 buildersKt$webSocketSession$2 = this;
                        final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        completableDeferred2.complete(defaultClientWebSocketSession);
                        defaultClientWebSocketSession.getOutgoing().invokeOnClose(new Function1<Throwable, Unit>() { // from class: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th3) {
                                invoke2(th3);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th3) {
                                if (th3 != null) {
                                    CompletableDeferred$default.completeExceptionally(th3);
                                } else {
                                    CompletableDeferred$default.complete(Unit.INSTANCE);
                                }
                            }
                        });
                        this.L$0 = httpStatement;
                        this.L$1 = httpResponse2;
                        this.L$2 = null;
                        this.label = 3;
                        if (CompletableDeferred$default.await(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        httpStatement2 = httpStatement;
                        this.L$0 = Unit.INSTANCE;
                        this.L$1 = null;
                        this.label = 4;
                        if (httpStatement2.cleanup(httpResponse2, this) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th = th3;
                        httpStatement2 = httpStatement;
                        this.L$0 = th;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (httpStatement2.cleanup(httpResponse2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw th;
                    }
                }
                if (i != 3) {
                    if (i == 4) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th4 = (Throwable) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    throw th4;
                }
                httpResponse2 = (HttpResponse) this.L$1;
                httpStatement2 = (HttpStatement) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = Unit.INSTANCE;
                    this.L$1 = null;
                    this.label = 4;
                    if (httpStatement2.cleanup(httpResponse2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th5) {
                    th = th5;
                    this.L$0 = th;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (httpStatement2.cleanup(httpResponse2, this) == coroutine_suspended) {
                    }
                }
            }
            HttpClientCall call = httpResponse.getCall();
            KType typeOf = Reflection.typeOf(DefaultClientWebSocketSession.class);
            TypeInfo typeInfoImpl = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(typeOf), Reflection.getOrCreateKotlinClass(DefaultClientWebSocketSession.class), typeOf);
            this.L$0 = httpStatement;
            this.L$1 = completableDeferred;
            this.L$2 = httpResponse;
            this.label = 2;
            Object bodyNullable = call.bodyNullable(typeInfoImpl, this);
            if (bodyNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
            CompletableDeferred<DefaultClientWebSocketSession> completableDeferred3 = completableDeferred;
            httpResponse2 = httpResponse;
            obj = bodyNullable;
            completableDeferred2 = completableDeferred3;
            if (obj != null) {
            }
        } catch (Throwable th6) {
            httpStatement2 = httpStatement;
            httpResponse2 = httpResponse;
            th = th6;
            this.L$0 = th;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 5;
            if (httpStatement2.cleanup(httpResponse2, this) == coroutine_suspended) {
            }
        }
        httpResponse = (HttpResponse) obj;
    }
}
