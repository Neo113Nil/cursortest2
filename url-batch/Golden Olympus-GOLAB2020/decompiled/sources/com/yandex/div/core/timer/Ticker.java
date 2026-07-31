package com.yandex.div.core.timer;

import W1.h;
import W1.i;
import W1.l;
import android.os.SystemClock;
import com.yandex.div.core.view2.errors.ErrorCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class Ticker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private Long currentDuration;

    @Nullable
    private Long currentInterval;

    @Nullable
    private Long duration;

    @Nullable
    private final ErrorCollector errorCollector;
    private long interruptedAt;

    @Nullable
    private Long interval;

    @NotNull
    private final String name;

    @NotNull
    private final Function1<Long, Unit> onEnd;

    @NotNull
    private final Function1<Long, Unit> onInterrupt;

    @NotNull
    private final Function1<Long, Unit> onStart;

    @NotNull
    private final Function1<Long, Unit> onTick;
    private long startedAt;

    @NotNull
    private State state;

    @NotNull
    private final h timer$delegate;
    private long workTimeFromPrevious;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public enum State {
        STOPPED,
        WORKING,
        PAUSED
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.WORKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticker(@NotNull String name, @NotNull Function1<? super Long, Unit> onInterrupt, @NotNull Function1<? super Long, Unit> onStart, @NotNull Function1<? super Long, Unit> onEnd, @NotNull Function1<? super Long, Unit> onTick, @Nullable ErrorCollector errorCollector) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(onInterrupt, "onInterrupt");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        Intrinsics.checkNotNullParameter(onTick, "onTick");
        this.name = name;
        this.onInterrupt = onInterrupt;
        this.onStart = onStart;
        this.onEnd = onEnd;
        this.onTick = onTick;
        this.errorCollector = errorCollector;
        this.state = State.STOPPED;
        this.startedAt = -1L;
        this.interruptedAt = -1L;
        this.timer$delegate = i.a(l.f9608d, Ticker$timer$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanTicker() {
        getTimer().cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void coercedTick() {
        Long l4 = this.duration;
        if (l4 != null) {
            this.onTick.invoke(Long.valueOf(g.h(getTotalWorkTime(), l4.longValue())));
        } else {
            this.onTick.invoke(Long.valueOf(getTotalWorkTime()));
        }
    }

    private final long getCurrentTime() {
        return SystemClock.elapsedRealtime();
    }

    private final FixedRateScheduler getTimer() {
        return (FixedRateScheduler) this.timer$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getTotalWorkTime() {
        return getWorkTime() + this.workTimeFromPrevious;
    }

    private final long getWorkTime() {
        if (this.startedAt == -1) {
            return 0L;
        }
        return getCurrentTime() - this.startedAt;
    }

    private final void onError(String str) {
        ErrorCollector errorCollector = this.errorCollector;
        if (errorCollector != null) {
            errorCollector.logError(new IllegalArgumentException(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetTickerState() {
        this.startedAt = -1L;
        this.interruptedAt = -1L;
        this.workTimeFromPrevious = 0L;
    }

    private final void runCountDownTimer(long j4) {
        long totalWorkTime = j4 - getTotalWorkTime();
        if (totalWorkTime >= 0) {
            setupTimer$default(this, totalWorkTime, 0L, new Ticker$runCountDownTimer$1(this, j4), 2, null);
        } else {
            this.onEnd.invoke(Long.valueOf(j4));
            resetTickerState();
        }
    }

    private final void runEndlessTimer(long j4) {
        setupTimer(j4, j4 - (getTotalWorkTime() % j4), new Ticker$runEndlessTimer$1(this));
    }

    private final void runTickTimer(long j4, long j5) {
        long totalWorkTime = j5 - (getTotalWorkTime() % j5);
        F f4 = new F();
        f4.f41131b = (j4 / j5) - (getTotalWorkTime() / j5);
        setupTimer(j5, totalWorkTime, new Ticker$runTickTimer$1(j4, this, f4, j5, new Ticker$runTickTimer$processTick$1(f4, this, j4)));
    }

    private final void runTimer() {
        Long l4 = this.currentInterval;
        Long l5 = this.currentDuration;
        if (l4 != null && this.interruptedAt != -1 && getCurrentTime() - this.interruptedAt > l4.longValue()) {
            coercedTick();
        }
        if (l4 == null && l5 != null) {
            runCountDownTimer(l5.longValue());
            return;
        }
        if (l4 != null && l5 != null) {
            runTickTimer(l5.longValue(), l4.longValue());
        } else {
            if (l4 == null || l5 != null) {
                return;
            }
            runEndlessTimer(l4.longValue());
        }
    }

    private final void setupTimer(long j4, long j5, Function0<Unit> function0) {
        this.startedAt = getCurrentTime();
        getTimer().scheduleAtFixedRate(j5, j4, function0);
    }

    static /* synthetic */ void setupTimer$default(Ticker ticker, long j4, long j5, Function0 function0, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j5 = j4;
        }
        ticker.setupTimer(j4, j5, function0);
    }

    public final void cancel() {
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i4 == 2 || i4 == 3) {
            this.state = State.STOPPED;
            cleanTicker();
            this.onInterrupt.invoke(Long.valueOf(getTotalWorkTime()));
            resetTickerState();
        }
    }

    public final void pause() {
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i4 == 1) {
            onError("The timer '" + this.name + "' already stopped!");
            return;
        }
        if (i4 == 2) {
            this.state = State.PAUSED;
            this.onInterrupt.invoke(Long.valueOf(getTotalWorkTime()));
            saveState();
            this.startedAt = -1L;
            return;
        }
        if (i4 != 3) {
            return;
        }
        onError("The timer '" + this.name + "' already paused!");
    }

    public final void reset() {
        cancel();
        start();
    }

    public final void restoreState(boolean z4) {
        if (!z4) {
            this.interruptedAt = -1L;
        }
        runTimer();
    }

    public final void resume() {
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i4 == 1) {
            onError("The timer '" + this.name + "' is stopped!");
            return;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                return;
            }
            this.state = State.WORKING;
            restoreState(false);
            return;
        }
        onError("The timer '" + this.name + "' already working!");
    }

    public final void saveState() {
        if (this.startedAt != -1) {
            this.workTimeFromPrevious += getCurrentTime() - this.startedAt;
            this.interruptedAt = getCurrentTime();
            this.startedAt = -1L;
        }
        cleanTicker();
    }

    public final void start() {
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i4 == 1) {
            cleanTicker();
            this.currentDuration = this.duration;
            this.currentInterval = this.interval;
            this.state = State.WORKING;
            this.onStart.invoke(Long.valueOf(getTotalWorkTime()));
            runTimer();
            return;
        }
        if (i4 == 2) {
            onError("The timer '" + this.name + "' already working!");
            return;
        }
        if (i4 != 3) {
            return;
        }
        onError("The timer '" + this.name + "' paused!");
    }

    public final void stop() {
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i4 == 1) {
            onError("The timer '" + this.name + "' already stopped!");
            return;
        }
        if (i4 == 2 || i4 == 3) {
            this.state = State.STOPPED;
            this.onEnd.invoke(Long.valueOf(getTotalWorkTime()));
            cleanTicker();
            resetTickerState();
        }
    }

    public final void update(long j4, @Nullable Long l4) {
        this.interval = l4;
        this.duration = j4 == 0 ? null : Long.valueOf(j4);
    }
}
