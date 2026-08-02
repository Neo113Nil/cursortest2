package com.squareup.util.task;

import androidx.lifecycle.Lifecycle;
import com.squareup.util.task.RepeatTaskExecutor;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes.dex */
public final class RepeatTaskExecutor$repeatOn$1 implements RepeatTask {
    public final /* synthetic */ Function1 $action;
    public final /* synthetic */ Duration $interval;
    public final /* synthetic */ Lifecycle.State $lifecycleState;
    public final /* synthetic */ RepeatTaskExecutor.SessionState $sessionState;
    public StandaloneCoroutine job;
    public final /* synthetic */ RepeatTaskExecutor this$0;

    public RepeatTaskExecutor$repeatOn$1(RepeatTaskExecutor repeatTaskExecutor, RepeatTaskExecutor.SessionState sessionState, Duration duration, Lifecycle.State state, Function1 function1) {
        this.this$0 = repeatTaskExecutor;
        this.$sessionState = sessionState;
        this.$interval = duration;
        this.$lifecycleState = state;
        this.$action = function1;
    }
}
