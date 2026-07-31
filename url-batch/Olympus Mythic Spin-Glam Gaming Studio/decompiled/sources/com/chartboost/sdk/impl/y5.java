package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.t3;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes5.dex */
public final class y5 implements v3 {
    public final CoroutineScope a;
    public final ConcurrentHashMap b;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: com.chartboost.sdk.impl.y5$a$a, reason: collision with other inner class name */
        public static final class C0232a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ String c;
            public final /* synthetic */ MutableSharedFlow d;
            public final /* synthetic */ y5 e;

            /* renamed from: com.chartboost.sdk.impl.y5$a$a$a, reason: collision with other inner class name */
            public static final class C0233a extends SuspendLambda implements Function2 {
                public int b;
                public final /* synthetic */ String c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0233a(String str, Continuation continuation) {
                    super(2, continuation);
                    this.c = str;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
                    return ((C0233a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0233a(this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    xb.d("Subscription count flow active for " + this.c, null, 2, null);
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: com.chartboost.sdk.impl.y5$a$a$b */
            public static final class b extends SuspendLambda implements Function2 {
                public int b;
                public /* synthetic */ int c;

                public b(Continuation continuation) {
                    super(2, continuation);
                }

                public final Object a(int i, Continuation continuation) {
                    return ((b) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    b bVar = new b(continuation);
                    bVar.c = ((Number) obj).intValue();
                    return bVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return a(((Number) obj).intValue(), (Continuation) obj2);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(this.c == 0);
                }
            }

            /* renamed from: com.chartboost.sdk.impl.y5$a$a$c */
            public static final class c extends SuspendLambda implements Function2 {
                public int b;
                public /* synthetic */ int c;

                public c(Continuation continuation) {
                    super(2, continuation);
                }

                public final Object a(int i, Continuation continuation) {
                    return ((c) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    c cVar = new c(continuation);
                    cVar.c = ((Number) obj).intValue();
                    return cVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return a(((Number) obj).intValue(), (Continuation) obj2);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(this.c == 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0232a(String str, MutableSharedFlow mutableSharedFlow, y5 y5Var, Continuation continuation) {
                super(2, continuation);
                this.c = str;
                this.d = mutableSharedFlow;
                this.e = y5Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0232a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0232a(this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        xb.d("Starting subscription count monitor for " + this.c, null, 2, null);
                        Flow dropWhile = FlowKt.dropWhile(FlowKt.onSubscription(this.d.getSubscriptionCount(), new C0233a(this.c, null)), new b(null));
                        c cVar = new c(null);
                        this.b = 1;
                        if (FlowKt.first(dropWhile, cVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    xb.d("Subscription count for " + this.c + " reached zero. Attempting cleanup.", null, 2, null);
                    if (((MutableSharedFlow) this.e.b.get(this.c)) != this.d) {
                        xb.d("Flow for " + this.c + " was already removed or replaced before cleanup could execute.", null, 2, null);
                    } else if (this.e.b.remove(this.c, this.d)) {
                        xb.d("Successfully removed inactive SharedFlow for " + this.c + ".", null, 2, null);
                    } else {
                        xb.e("Failed to remove flow for " + this.c + " during cleanup, likely already removed concurrently.", null, 2, null);
                    }
                } catch (CancellationException unused) {
                    xb.d("Cleanup job for " + this.c + " was cancelled.", null, 2, null);
                } catch (Exception e) {
                    xb.b("Error during cache notifier cleanup monitor for " + this.c, e);
                } finally {
                    xb.d("Subscription count monitor finished for " + this.c, null, 2, null);
                }
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableSharedFlow invoke(String flowKey) {
            Intrinsics.checkNotNullParameter(flowKey, "flowKey");
            xb.d("Creating new SharedFlow for cache events: " + flowKey, null, 2, null);
            MutableSharedFlow MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 64, BufferOverflow.DROP_OLDEST);
            BuildersKt__Builders_commonKt.launch$default(y5.this.a, null, null, new C0232a(flowKey, MutableSharedFlow, y5.this, null), 3, null);
            return MutableSharedFlow;
        }
    }

    public y5(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = scope;
        this.b = new ConcurrentHashMap();
    }

    @Override // com.chartboost.sdk.impl.v3
    public Object a(URL url, m8 m8Var, Continuation continuation) {
        Unit unit;
        String url2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.b.get(url2);
        if (mutableSharedFlow != null) {
            if (mutableSharedFlow.tryEmit(new t3.a(m8Var, url))) {
                xb.d("Notified eviction for " + url2 + ".", null, 2, null);
            } else {
                xb.e("Failed to emit eviction event for " + url2 + " (buffer full). Current subs: " + mutableSharedFlow.getSubscriptionCount().getValue(), null, 2, null);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.d("Attempted to notify eviction for " + url2 + ", but no active observers found.", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.chartboost.sdk.impl.v3
    public Flow a(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String url2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
        ConcurrentHashMap concurrentHashMap = this.b;
        final a aVar = new a();
        Object computeIfAbsent = concurrentHashMap.computeIfAbsent(url2, new Function() { // from class: com.chartboost.sdk.impl.y5$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return y5.a(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(computeIfAbsent, "computeIfAbsent(...)");
        return FlowKt.asSharedFlow((MutableSharedFlow) computeIfAbsent);
    }

    public static final MutableSharedFlow a(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (MutableSharedFlow) tmp0.invoke(obj);
    }
}
