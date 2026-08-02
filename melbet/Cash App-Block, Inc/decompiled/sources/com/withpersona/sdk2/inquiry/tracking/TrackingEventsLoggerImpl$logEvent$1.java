package com.withpersona.sdk2.inquiry.tracking;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl$logEvent$1", f = "TrackingEventsLoggerImpl.kt", l = {504, 506, 508, 510}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class TrackingEventsLoggerImpl$logEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TrackingEvent $event;
    final /* synthetic */ boolean $force;
    int label;
    final /* synthetic */ TrackingEventsLoggerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventsLoggerImpl$logEvent$1(TrackingEvent trackingEvent, boolean z, TrackingEventsLoggerImpl trackingEventsLoggerImpl, Continuation<? super TrackingEventsLoggerImpl$logEvent$1> continuation) {
        super(2, continuation);
        this.$event = trackingEvent;
        this.$force = z;
        this.this$0 = trackingEventsLoggerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackingEventsLoggerImpl$logEvent$1(this.$event, this.$force, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingEventsLoggerImpl$logEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        if (r6 == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[Catch: Exception -> 0x0073, TRY_LEAVE, TryCatch #0 {Exception -> 0x0073, blocks: (B:11:0x001a, B:12:0x005c, B:15:0x0068, B:20:0x001e, B:21:0x0022, B:22:0x003c, B:24:0x0040, B:27:0x004b, B:29:0x0053, B:34:0x0029, B:36:0x0031), top: B:2:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Object flush;
        Object flush2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            TrackingEventsCache companion = TrackingEventsCache.INSTANCE.getInstance();
            if (companion != null) {
                TrackingEvent trackingEvent = this.$event;
                this.label = 1;
                if (companion.add(trackingEvent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        i = ((Number) obj).intValue();
                        if (i >= 10) {
                            TrackingEventsLoggerImpl trackingEventsLoggerImpl = this.this$0;
                            this.label = 4;
                            flush2 = trackingEventsLoggerImpl.flush(this);
                        }
                        return Unit.INSTANCE;
                    }
                    if (i2 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
        }
        if (this.$force) {
            TrackingEventsLoggerImpl trackingEventsLoggerImpl2 = this.this$0;
            this.label = 2;
            flush = trackingEventsLoggerImpl2.flush(this);
            if (flush == coroutineSingletons) {
            }
            return Unit.INSTANCE;
        }
        TrackingEventsCache companion2 = TrackingEventsCache.INSTANCE.getInstance();
        if (companion2 == null) {
            i = 0;
            if (i >= 10) {
            }
            return Unit.INSTANCE;
        }
        this.label = 3;
        obj = companion2.currentCount(this);
        if (obj == coroutineSingletons) {
        }
        i = ((Number) obj).intValue();
        if (i >= 10) {
        }
        return Unit.INSTANCE;
        return coroutineSingletons;
    }
}
