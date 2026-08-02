package com.squareup.util.task;

import androidx.lifecycle.Lifecycle;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.session.backend.OnboardedAccountStatus;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.util.task.RepeatTaskExecutor;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RepeatTaskExecutor$repeatOn$1$start$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $action;
    public final /* synthetic */ Duration $interval;
    public final /* synthetic */ Lifecycle.State $lifecycleState;
    public final /* synthetic */ RepeatTaskExecutor.SessionState $sessionState;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RepeatTaskExecutor this$0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RepeatTaskExecutor.SessionState.values().length];
            try {
                RepeatTaskExecutor.SessionState sessionState = RepeatTaskExecutor.SessionState.AUTHENTICATED;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RepeatTaskExecutor.SessionState sessionState2 = RepeatTaskExecutor.SessionState.AUTHENTICATED;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatTaskExecutor$repeatOn$1$start$1(RepeatTaskExecutor.SessionState sessionState, RepeatTaskExecutor repeatTaskExecutor, Duration duration, Lifecycle.State state, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$sessionState = sessionState;
        this.this$0 = repeatTaskExecutor;
        this.$interval = duration;
        this.$lifecycleState = state;
        this.$action = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RepeatTaskExecutor$repeatOn$1$start$1 repeatTaskExecutor$repeatOn$1$start$1 = new RepeatTaskExecutor$repeatOn$1$start$1(this.$sessionState, this.this$0, this.$interval, this.$lifecycleState, this.$action, continuation);
        repeatTaskExecutor$repeatOn$1$start$1.L$0 = obj;
        return repeatTaskExecutor$repeatOn$1$start$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatTaskExecutor$repeatOn$1$start$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r11.collect(r0, r10) == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (r11.collect(r0, r10) == r6) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final RepeatTaskExecutor repeatTaskExecutor = this.this$0;
        SessionManager sessionManager = repeatTaskExecutor.sessionManager;
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$sessionState.ordinal()];
            final Function1 function1 = this.$action;
            if (i2 == -1) {
                Duration duration = this.$interval;
                Lifecycle.State state = this.$lifecycleState;
                RepeatTaskExecutor.m3997access$repeatOnIntervalhhJSO8g(repeatTaskExecutor, coroutineScope, duration, state, function1);
                RepeatTaskExecutor.access$repeatOnLifecycle(repeatTaskExecutor, coroutineScope, state, function1);
            } else if (i2 == 1) {
                FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new FinishSetupTileBadgeCounter(23, sessionManager.getSessionState(), Reflection.factory.getOrCreateKotlinClass(SessionState.Authenticated.class)), 1);
                final Duration duration2 = this.$interval;
                final Lifecycle.State state2 = this.$lifecycleState;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.util.task.RepeatTaskExecutor$repeatOn$1$start$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        RepeatTaskExecutor repeatTaskExecutor2 = RepeatTaskExecutor.this;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        Duration duration3 = duration2;
                        Lifecycle.State state3 = state2;
                        Function1 function12 = function1;
                        RepeatTaskExecutor.m3997access$repeatOnIntervalhhJSO8g(repeatTaskExecutor2, coroutineScope2, duration3, state3, function12);
                        RepeatTaskExecutor.access$repeatOnLifecycle(repeatTaskExecutor2, coroutineScope2, state3, function12);
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 1;
            } else {
                if (i2 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take2 = FlowKt.take(new FinishSetupTileBadgeCounter(23, sessionManager.getOnboardedAccountStatus(), Reflection.factory.getOrCreateKotlinClass(OnboardedAccountStatus.Onboarded.class)), 1);
                final Duration duration3 = this.$interval;
                final Lifecycle.State state3 = this.$lifecycleState;
                FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.util.task.RepeatTaskExecutor$repeatOn$1$start$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        RepeatTaskExecutor repeatTaskExecutor2 = RepeatTaskExecutor.this;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        Duration duration4 = duration3;
                        Lifecycle.State state4 = state3;
                        Function1 function12 = function1;
                        RepeatTaskExecutor.m3997access$repeatOnIntervalhhJSO8g(repeatTaskExecutor2, coroutineScope2, duration4, state4, function12);
                        RepeatTaskExecutor.access$repeatOnLifecycle(repeatTaskExecutor2, coroutineScope2, state4, function12);
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
