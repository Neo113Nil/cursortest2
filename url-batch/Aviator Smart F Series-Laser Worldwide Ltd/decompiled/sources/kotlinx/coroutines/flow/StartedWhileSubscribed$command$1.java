package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements f6.q {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StartedWhileSubscribed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.this$0 = startedWhileSubscribed;
    }

    @Override // f6.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((f) obj, ((Number) obj2).intValue(), (kotlin.coroutines.c) obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        f fVar;
        long j8;
        long j9;
        long j10;
        SharingCommand sharingCommand;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            fVar = (f) this.L$0;
            if (this.I$0 > 0) {
                SharingCommand sharingCommand2 = SharingCommand.START;
                this.label = 1;
                if (fVar.emit(sharingCommand2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return y5.w.INSTANCE;
            }
            j8 = this.this$0.stopTimeout;
            this.L$0 = fVar;
            this.label = 2;
            if (DelayKt.delay(j8, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j9 = this.this$0.replayExpiration;
            if (j9 > 0) {
            }
            sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
            this.L$0 = null;
            this.label = 5;
            if (fVar.emit(sharingCommand, this) == coroutine_suspended) {
            }
            return y5.w.INSTANCE;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                fVar = (f) this.L$0;
                y5.g.throwOnFailure(obj);
                j9 = this.this$0.replayExpiration;
                if (j9 > 0) {
                    SharingCommand sharingCommand3 = SharingCommand.STOP;
                    this.L$0 = fVar;
                    this.label = 3;
                    if (fVar.emit(sharingCommand3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j10 = this.this$0.replayExpiration;
                    this.L$0 = fVar;
                    this.label = 4;
                    if (DelayKt.delay(j10, this) == coroutine_suspended) {
                    }
                }
                sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                this.L$0 = null;
                this.label = 5;
                if (fVar.emit(sharingCommand, this) == coroutine_suspended) {
                }
                return y5.w.INSTANCE;
            }
            if (i8 == 3) {
                fVar = (f) this.L$0;
                y5.g.throwOnFailure(obj);
                j10 = this.this$0.replayExpiration;
                this.L$0 = fVar;
                this.label = 4;
                if (DelayKt.delay(j10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                this.L$0 = null;
                this.label = 5;
                if (fVar.emit(sharingCommand, this) == coroutine_suspended) {
                }
                return y5.w.INSTANCE;
            }
            if (i8 == 4) {
                fVar = (f) this.L$0;
                y5.g.throwOnFailure(obj);
                sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                this.L$0 = null;
                this.label = 5;
                if (fVar.emit(sharingCommand, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return y5.w.INSTANCE;
            }
            if (i8 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        y5.g.throwOnFailure(obj);
        return y5.w.INSTANCE;
    }

    public final Object invoke(f fVar, int i8, kotlin.coroutines.c cVar) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, cVar);
        startedWhileSubscribed$command$1.L$0 = fVar;
        startedWhileSubscribed$command$1.I$0 = i8;
        return startedWhileSubscribed$command$1.invokeSuspend(y5.w.INSTANCE);
    }
}
