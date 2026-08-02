package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements Function3 {
    public /* synthetic */ int I$0;
    public /* synthetic */ FlowCollector L$0;
    public int label;
    public final /* synthetic */ StartedWhileSubscribed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, Continuation continuation) {
        super(3, continuation);
        this.this$0 = startedWhileSubscribed;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, (Continuation) obj3);
        startedWhileSubscribed$command$1.L$0 = (FlowCollector) obj;
        startedWhileSubscribed$command$1.I$0 = intValue;
        return startedWhileSubscribed$command$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
    
        if (r3.emit(r15, r14) != r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r1, r14) == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r3.emit(r15, r14) == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        if (r3.emit(r15, r14) == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r12, r14) == r5) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        StartedWhileSubscribed startedWhileSubscribed = this.this$0;
        long j = startedWhileSubscribed.replayExpiration;
        FlowCollector flowCollector = this.L$0;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            if (i > 0) {
                SharingCommand sharingCommand = SharingCommand.START;
                this.L$0 = null;
                this.I$0 = i;
                this.label = 1;
            } else {
                long j2 = startedWhileSubscribed.stopTimeout;
                this.L$0 = flowCollector;
                this.I$0 = i;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                SafeTrace.throwOnFailure(obj);
                if (j > 0) {
                    SharingCommand sharingCommand2 = SharingCommand.STOP;
                    this.L$0 = flowCollector;
                    this.I$0 = i;
                    this.label = 3;
                }
                SharingCommand sharingCommand3 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                this.L$0 = null;
                this.I$0 = i;
                this.label = 5;
            } else if (i2 == 3) {
                SafeTrace.throwOnFailure(obj);
                this.L$0 = flowCollector;
                this.I$0 = i;
                this.label = 4;
            } else if (i2 == 4) {
                SafeTrace.throwOnFailure(obj);
                SharingCommand sharingCommand32 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                this.L$0 = null;
                this.I$0 = i;
                this.label = 5;
            } else if (i2 != 5) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        SafeTrace.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
