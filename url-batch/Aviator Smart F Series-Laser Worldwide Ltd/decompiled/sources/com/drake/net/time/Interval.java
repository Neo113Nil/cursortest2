package com.drake.net.time;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import f6.p;
import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.t0;
import y5.w;

/* loaded from: classes3.dex */
public class Interval implements Serializable, Closeable {
    private long count;
    private long countTime;
    private long delay;
    private long end;
    private final List<p> finishList;
    private final long initialDelay;
    private final long period;
    private i0 scope;
    private final long start;
    private IntervalStatus state;
    private final List<p> subscribeList;
    private ReceiveChannel ticker;
    private final TimeUnit unit;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IntervalStatus.values().length];
            iArr[IntervalStatus.STATE_ACTIVE.ordinal()] = 1;
            iArr[IntervalStatus.STATE_IDLE.ordinal()] = 2;
            iArr[IntervalStatus.STATE_PAUSE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Interval(long j8, long j9, TimeUnit unit) {
        this(j8, j9, unit, 0L, 0L, 24, null);
        s.checkNotNullParameter(unit, "unit");
    }

    private final void launch(long j8) {
        i0 CoroutineScope = j0.CoroutineScope(t0.getMain());
        this.scope = CoroutineScope;
        if (CoroutineScope != null) {
            i.launch$default(CoroutineScope, null, null, new Interval$launch$1(this, j8, null), 3, null);
        }
    }

    static /* synthetic */ void launch$default(Interval interval, long j8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
        }
        if ((i8 & 1) != 0) {
            j8 = interval.unit.toMillis(interval.initialDelay);
        }
        interval.launch(j8);
    }

    public static /* synthetic */ Interval life$default(Interval interval, LifecycleOwner lifecycleOwner, Lifecycle.Event event, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: life");
        }
        if ((i8 & 2) != 0) {
            event = Lifecycle.Event.ON_DESTROY;
        }
        return interval.life(lifecycleOwner, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: life$lambda-5, reason: not valid java name */
    public static final void m153life$lambda5(final Lifecycle.Event lifeEvent, final Interval this$0, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        s.checkNotNullParameter(lifeEvent, "$lifeEvent");
        s.checkNotNullParameter(this$0, "this$0");
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.drake.net.time.Interval$life$2$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                s.checkNotNullParameter(source, "source");
                s.checkNotNullParameter(event, "event");
                if (Lifecycle.Event.this == event) {
                    this$0.cancel();
                }
            }
        });
    }

    private final void runMain(final f6.a aVar) {
        if (s.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.drake.net.time.b
                @Override // java.lang.Runnable
                public final void run() {
                    Interval.m154runMain$lambda7(f6.a.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runMain$lambda-7, reason: not valid java name */
    public static final void m154runMain$lambda7(f6.a block) {
        s.checkNotNullParameter(block, "$block");
        block.invoke();
    }

    public final void cancel() {
        IntervalStatus intervalStatus = this.state;
        IntervalStatus intervalStatus2 = IntervalStatus.STATE_IDLE;
        if (intervalStatus == intervalStatus2) {
            return;
        }
        i0 i0Var = this.scope;
        if (i0Var != null) {
            j0.cancel$default(i0Var, null, 1, null);
        }
        this.state = intervalStatus2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        cancel();
    }

    public final Interval finish(p block) {
        s.checkNotNullParameter(block, "block");
        this.finishList.add(block);
        return this;
    }

    public final long getCount() {
        return this.count;
    }

    public final long getEnd() {
        return this.end;
    }

    public final IntervalStatus getState() {
        return this.state;
    }

    public final Interval life(Fragment fragment) {
        s.checkNotNullParameter(fragment, "fragment");
        return life$default(this, fragment, (Lifecycle.Event) null, 2, (Object) null);
    }

    public final Interval onlyResumed(final LifecycleOwner lifecycleOwner) {
        s.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        runMain(new f6.a() { // from class: com.drake.net.time.Interval$onlyResumed$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m157invoke();
                return w.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m157invoke() {
                Lifecycle lifecycle = LifecycleOwner.this.getLifecycle();
                final Interval interval = this;
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.drake.net.time.Interval$onlyResumed$1$1.1

                    /* renamed from: com.drake.net.time.Interval$onlyResumed$1$1$1$a */
                    public /* synthetic */ class a {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[Lifecycle.Event.values().length];
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
                            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                        s.checkNotNullParameter(source, "source");
                        s.checkNotNullParameter(event, "event");
                        int i8 = a.$EnumSwitchMapping$0[event.ordinal()];
                        if (i8 == 1) {
                            Interval.this.resume();
                        } else if (i8 == 2) {
                            Interval.this.pause();
                        } else {
                            if (i8 != 3) {
                                return;
                            }
                            Interval.this.cancel();
                        }
                    }
                });
            }
        });
        return this;
    }

    public final void pause() {
        if (this.state != IntervalStatus.STATE_ACTIVE) {
            return;
        }
        i0 i0Var = this.scope;
        if (i0Var != null) {
            j0.cancel$default(i0Var, null, 1, null);
        }
        this.state = IntervalStatus.STATE_PAUSE;
        this.delay = System.currentTimeMillis() - this.countTime;
    }

    public final void reset() {
        this.count = this.start;
        this.delay = this.unit.toMillis(this.initialDelay);
        i0 i0Var = this.scope;
        if (i0Var != null) {
            j0.cancel$default(i0Var, null, 1, null);
        }
        if (this.state == IntervalStatus.STATE_ACTIVE) {
            launch$default(this, 0L, 1, null);
        }
    }

    public final void resume() {
        if (this.state != IntervalStatus.STATE_PAUSE) {
            return;
        }
        this.state = IntervalStatus.STATE_ACTIVE;
        launch(this.delay);
    }

    public final void setCount(long j8) {
        this.count = j8;
    }

    public final void setEnd(long j8) {
        this.end = j8;
    }

    public final Interval start() {
        IntervalStatus intervalStatus = this.state;
        IntervalStatus intervalStatus2 = IntervalStatus.STATE_ACTIVE;
        if (intervalStatus == intervalStatus2) {
            return this;
        }
        this.state = intervalStatus2;
        this.count = this.start;
        launch$default(this, 0L, 1, null);
        return this;
    }

    public final void stop() {
        IntervalStatus intervalStatus = this.state;
        IntervalStatus intervalStatus2 = IntervalStatus.STATE_IDLE;
        if (intervalStatus == intervalStatus2) {
            return;
        }
        i0 i0Var = this.scope;
        if (i0Var != null) {
            j0.cancel$default(i0Var, null, 1, null);
        }
        this.state = intervalStatus2;
        Iterator<T> it = this.finishList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).invoke(this, Long.valueOf(this.count));
        }
    }

    public final Interval subscribe(p block) {
        s.checkNotNullParameter(block, "block");
        this.subscribeList.add(block);
        return this;
    }

    /* renamed from: switch, reason: not valid java name */
    public final void m155switch() {
        int i8 = a.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i8 == 1) {
            stop();
        } else if (i8 == 2) {
            start();
        } else {
            if (i8 != 3) {
                return;
            }
            resume();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Interval(long j8, long j9, TimeUnit unit, long j10) {
        this(j8, j9, unit, j10, 0L, 16, null);
        s.checkNotNullParameter(unit, "unit");
    }

    public final Interval life(LifecycleOwner lifecycleOwner) {
        s.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        return life$default(this, lifecycleOwner, (Lifecycle.Event) null, 2, (Object) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Interval(long j8, TimeUnit unit) {
        this(j8, unit, 0L, 4, (o) null);
        s.checkNotNullParameter(unit, "unit");
    }

    public static /* synthetic */ Interval life$default(Interval interval, Fragment fragment, Lifecycle.Event event, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: life");
        }
        if ((i8 & 2) != 0) {
            event = Lifecycle.Event.ON_DESTROY;
        }
        return interval.life(fragment, event);
    }

    public final Interval life(final LifecycleOwner lifecycleOwner, final Lifecycle.Event lifeEvent) {
        s.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        s.checkNotNullParameter(lifeEvent, "lifeEvent");
        runMain(new f6.a() { // from class: com.drake.net.time.Interval$life$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m156invoke();
                return w.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m156invoke() {
                Lifecycle lifecycle = LifecycleOwner.this.getLifecycle();
                final Lifecycle.Event event = lifeEvent;
                final Interval interval = this;
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.drake.net.time.Interval$life$1$1.1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event2) {
                        s.checkNotNullParameter(source, "source");
                        s.checkNotNullParameter(event2, "event");
                        if (Lifecycle.Event.this == event2) {
                            interval.cancel();
                        }
                    }
                });
            }
        });
        return this;
    }

    public Interval(long j8, long j9, TimeUnit unit, long j10, long j11) {
        s.checkNotNullParameter(unit, "unit");
        this.end = j8;
        this.period = j9;
        this.unit = unit;
        this.start = j10;
        this.initialDelay = j11;
        this.subscribeList = new ArrayList();
        this.finishList = new ArrayList();
        this.count = j10;
        this.state = IntervalStatus.STATE_IDLE;
    }

    public final Interval life(Fragment fragment, final Lifecycle.Event lifeEvent) {
        s.checkNotNullParameter(fragment, "fragment");
        s.checkNotNullParameter(lifeEvent, "lifeEvent");
        fragment.getViewLifecycleOwnerLiveData().observe(fragment, new Observer() { // from class: com.drake.net.time.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Interval.m153life$lambda5(Lifecycle.Event.this, this, (LifecycleOwner) obj);
            }
        });
        return this;
    }

    public /* synthetic */ Interval(long j8, long j9, TimeUnit timeUnit, long j10, long j11, int i8, o oVar) {
        this(j8, j9, timeUnit, (i8 & 8) != 0 ? 0L : j10, (i8 & 16) != 0 ? 0L : j11);
    }

    public /* synthetic */ Interval(long j8, TimeUnit timeUnit, long j9, int i8, o oVar) {
        this(j8, timeUnit, (i8 & 4) != 0 ? 0L : j9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Interval(long j8, TimeUnit unit, long j9) {
        this(-1L, j8, unit, 0L, j9);
        s.checkNotNullParameter(unit, "unit");
    }
}
