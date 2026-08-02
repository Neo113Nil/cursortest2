package kotlinx.coroutines.flow;

import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;

/* loaded from: classes9.dex */
public final class FlowKt__DelayKt$timeoutInternal$1 extends SuspendLambda implements Function3 {

    /* renamed from: $$v$c$kotlin-time-Duration$-timeout$0, reason: not valid java name */
    public final /* synthetic */ long f833$$v$c$kotlintimeDuration$timeout$0;
    public final /* synthetic */ SquareAccountStore$userFlow$$inlined$map$1 $this_timeoutInternal;
    public int I$0;
    public long J$0;
    public /* synthetic */ CoroutineScope L$0;
    public /* synthetic */ FlowCollector L$1;
    public ReceiveChannel L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1(long j, SquareAccountStore$userFlow$$inlined$map$1 squareAccountStore$userFlow$$inlined$map$1, Continuation continuation) {
        super(3, continuation);
        this.f833$$v$c$kotlintimeDuration$timeout$0 = j;
        this.$this_timeoutInternal = squareAccountStore$userFlow$$inlined$map$1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.f833$$v$c$kotlintimeDuration$timeout$0, this.$this_timeoutInternal, (Continuation) obj3);
        flowKt__DelayKt$timeoutInternal$1.L$0 = (CoroutineScope) obj;
        flowKt__DelayKt$timeoutInternal$1.L$1 = (FlowCollector) obj2;
        return flowKt__DelayKt$timeoutInternal$1.invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0091 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x008f -> B:5:0x0092). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            kotlinx.coroutines.CoroutineScope r1 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = r0.L$1
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r0.label
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L23
            if (r4 != r5) goto L1d
            int r1 = r0.I$0
            long r7 = r0.J$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = r0.L$2
            papa.SafeTrace.throwOnFailure(r18)
            r9 = r18
            goto L92
        L1d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            bo.app.a$$ExternalSyntheticBUOutline0.m$1(r0)
            return r6
        L23:
            papa.SafeTrace.throwOnFailure(r18)
            kotlin.time.Duration$Companion r4 = kotlin.time.Duration.Companion
            r4.getClass()
            r7 = 0
            long r9 = r0.f833$$v$c$kotlintimeDuration$timeout$0
            int r4 = kotlin.time.Duration.m4164compareToLRDsOJo(r9, r7)
            if (r4 <= 0) goto L9d
            com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1 r4 = r0.$this_timeoutInternal
            r7 = 2
            r8 = 0
            kotlinx.coroutines.flow.Flow r4 = kotlinx.coroutines.flow.FlowKt.buffer$default(r4, r8, r7)
            boolean r7 = r4 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r7 == 0) goto L45
            r7 = r4
            kotlinx.coroutines.flow.internal.ChannelFlow r7 = (kotlinx.coroutines.flow.internal.ChannelFlow) r7
            goto L46
        L45:
            r7 = r6
        L46:
            if (r7 != 0) goto L55
            kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl r11 = new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl
            r15 = 0
            r13 = 14
            r12 = 0
            r14 = 0
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r7 = r11
        L55:
            kotlinx.coroutines.channels.ReceiveChannel r1 = r7.produceImpl(r1)
            r4 = r1
            r1 = r8
            r7 = r9
        L5c:
            kotlinx.coroutines.selects.SelectImplementation r9 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()
            r9.<init>(r10)
            okio.internal.DefaultSocket r10 = r4.getOnReceiveCatching()
            com.withpersona.sdk2.inquiry.logger.Logger$log$1 r11 = new com.withpersona.sdk2.inquiry.logger.Logger$log$1
            r12 = 24
            r11.<init>(r2, r6, r12)
            r9.invoke(r10, r11)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r10 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r10.<init>(r7, r6)
            long r11 = kotlinx.coroutines.JobKt.m4183toDelayMillisLRDsOJo(r7)
            kotlinx.coroutines.selects.SelectKt.onTimeout(r9, r11, r10)
            r0.L$0 = r6
            r0.L$1 = r2
            r0.L$2 = r4
            r0.J$0 = r7
            r0.I$0 = r1
            r0.label = r5
            java.lang.Object r9 = r9.doSelect(r0)
            if (r9 != r3) goto L92
            return r3
        L92:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5c
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9d:
            kotlinx.coroutines.TimeoutCancellationException r0 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r1 = "Timed out immediately"
            r0.<init>(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
