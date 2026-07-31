package com.yandex.div.internal.viewpool;

import android.os.Process;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.util.Cancelable;
import com.yandex.div.internal.util.UtilsKt;
import com.yandex.div.internal.viewpool.AdvanceViewPool;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.c;
import m2.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ViewCreator {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ViewCreatorThread creatorThread;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    private static final class CreateViewTask implements Runnable, Comparable<CreateViewTask> {
        static final /* synthetic */ h[] $$delegatedProperties = {H.g(new B(CreateViewTask.class, "channelRef", "getChannelRef()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", 0))};

        @NotNull
        private final c channelRef$delegate;
        private final int priority;

        @NotNull
        private final String viewName;

        public CreateViewTask(@NotNull AdvanceViewPool.Channel<?> channel, int i4) {
            Intrinsics.checkNotNullParameter(channel, "channel");
            this.priority = i4;
            this.viewName = channel.getViewName();
            this.channelRef$delegate = UtilsKt.weak(channel);
        }

        private final AdvanceViewPool.Channel<?> getChannelRef() {
            return (AdvanceViewPool.Channel) this.channelRef$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual(CreateViewTask.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.div.internal.viewpool.ViewCreator.CreateViewTask");
            CreateViewTask createViewTask = (CreateViewTask) obj;
            return Intrinsics.areEqual(this.viewName, createViewTask.viewName) && this.priority == createViewTask.priority;
        }

        @NotNull
        public final String getViewName() {
            return this.viewName;
        }

        public int hashCode() {
            return ((6913 + this.priority) * 31) + this.viewName.hashCode();
        }

        @Override // java.lang.Runnable
        public void run() {
            AdvanceViewPool.Channel<?> channelRef = getChannelRef();
            if (channelRef != null) {
                channelRef.createAndEnqueueView();
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull CreateViewTask other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i4 = this.priority - other.priority;
            return i4 != 0 ? i4 : !Intrinsics.areEqual(this.viewName, other.viewName) ? 1 : 0;
        }
    }

    @Metadata
    private static final class ViewCreatorThread extends Thread {

        @NotNull
        private final CpuUsageHistogramReporter cpuUsageHistogramReporter;

        @Nullable
        private volatile String currentViewName;

        @NotNull
        private final BatchBlockingQueue<CreateViewTask> taskQueue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewCreatorThread(@NotNull String name, @NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
            super(name);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(cpuUsageHistogramReporter, "cpuUsageHistogramReporter");
            this.cpuUsageHistogramReporter = cpuUsageHistogramReporter;
            this.taskQueue = new BatchBlockingQueue<>(new PriorityQueue(32));
            setPriority(5);
        }

        private final void createView() {
            CreateViewTask poll = this.taskQueue.poll();
            if (poll == null) {
                try {
                    setPriority(3);
                    poll = this.taskQueue.take();
                    setPriority(5);
                    Intrinsics.checkNotNullExpressionValue(poll, "run {\n                //…          }\n            }");
                } catch (Throwable th) {
                    setPriority(5);
                    throw th;
                }
            }
            this.currentViewName = poll.getViewName();
            poll.run();
            this.currentViewName = null;
        }

        @Nullable
        public final String getCurrentViewName() {
            return this.currentViewName;
        }

        @NotNull
        public final BatchBlockingQueue<CreateViewTask> getTaskQueue() {
            return this.taskQueue;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Cancelable startReporting = this.cpuUsageHistogramReporter.startReporting("Div.ViewPool.CPU", Process.myTid());
            while (true) {
                try {
                    try {
                        createView();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        startReporting.cancel();
                        return;
                    }
                } catch (Throwable th) {
                    startReporting.cancel();
                    throw th;
                }
            }
        }
    }

    public ViewCreator(@NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        Intrinsics.checkNotNullParameter(cpuUsageHistogramReporter, "cpuUsageHistogramReporter");
        ViewCreatorThread viewCreatorThread = new ViewCreatorThread("ViewPoolThread", cpuUsageHistogramReporter);
        this.creatorThread = viewCreatorThread;
        viewCreatorThread.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        r2.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void promote$div_release(@NotNull AdvanceViewPool.Channel<?> channel) {
        Queue queue;
        Intrinsics.checkNotNullParameter(channel, "channel");
        if (Intrinsics.areEqual(channel.getViewName(), this.creatorThread.getCurrentViewName()) || channel.getNotEmpty()) {
            return;
        }
        BatchBlockingQueue<CreateViewTask> taskQueue = this.creatorThread.getTaskQueue();
        ((BatchBlockingQueue) taskQueue).lock.lock();
        try {
            if (!Intrinsics.areEqual(channel.getViewName(), this.creatorThread.getCurrentViewName()) && !channel.getNotEmpty()) {
                taskQueue = this.creatorThread.getTaskQueue();
                ((BatchBlockingQueue) taskQueue).lock.lock();
                queue = ((BatchBlockingQueue) taskQueue).queue;
                Iterator it = queue.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Intrinsics.areEqual(((CreateViewTask) it.next()).getViewName(), channel.getViewName())) {
                        break;
                    }
                }
                ((BatchBlockingQueue) taskQueue).lock.unlock();
                this.creatorThread.getTaskQueue().offer(new CreateViewTask(channel, -1));
                Unit unit = Unit.f41027a;
            }
        } finally {
        }
    }

    public final void request$div_release(@NotNull AdvanceViewPool.Channel<?> channel, int i4) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.creatorThread.getTaskQueue().offer(new CreateViewTask(channel, i4));
    }
}
