package com.squareup.util.coroutines;

import app.cash.cdp.backend.jvm.RealEventConsumer$track$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.util.cache.Cache;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ThrottleLatestKt$throttleLatest$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $this_throttleLatest;
    public final /* synthetic */ long $timeoutMillis;
    public /* synthetic */ Object L$0;
    public int label;

    /* renamed from: com.squareup.util.coroutines.ThrottleLatestKt$throttleLatest$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ ProducerScope $$this$channelFlow;
        public final /* synthetic */ Flow $this_throttleLatest;
        public final /* synthetic */ long $timeoutMillis;
        public /* synthetic */ Object L$0;
        public StandaloneCoroutine L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Flow flow, ProducerScope producerScope, long j, Continuation continuation) {
            super(2, continuation);
            this.$this_throttleLatest = flow;
            this.$$this$channelFlow = producerScope;
            this.$timeoutMillis = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_throttleLatest, this.$$this$channelFlow, this.$timeoutMillis, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            StandaloneCoroutine standaloneCoroutine;
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                BufferedChannel Channel$default = PapaEvent.Channel$default(-1, null, null, 6);
                StandaloneCoroutine launch$default = JobKt.launch$default(coroutineScope, null, null, new RealEventConsumer$track$1(this.$$this$channelFlow, Channel$default, this.$timeoutMillis, null), 3);
                Cache.AnonymousClass1.C00671 c00671 = new Cache.AnonymousClass1.C00671(Channel$default, 12);
                this.L$0 = null;
                this.L$2 = launch$default;
                this.label = 1;
                if (this.$this_throttleLatest.collect(c00671, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                standaloneCoroutine = launch$default;
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                standaloneCoroutine = this.L$2;
                SafeTrace.throwOnFailure(obj);
            }
            standaloneCoroutine.cancel(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrottleLatestKt$throttleLatest$1(Flow flow, long j, Continuation continuation) {
        super(2, continuation);
        this.$this_throttleLatest = flow;
        this.$timeoutMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ThrottleLatestKt$throttleLatest$1 throttleLatestKt$throttleLatest$1 = new ThrottleLatestKt$throttleLatest$1(this.$this_throttleLatest, this.$timeoutMillis, continuation);
        throttleLatestKt$throttleLatest$1.L$0 = obj;
        return throttleLatestKt$throttleLatest$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ThrottleLatestKt$throttleLatest$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope = (ProducerScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_throttleLatest, producerScope, this.$timeoutMillis, null);
            this.L$0 = null;
            this.label = 1;
            if (JobKt.coroutineScope(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
