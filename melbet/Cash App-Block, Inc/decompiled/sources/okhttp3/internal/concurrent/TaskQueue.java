package okhttp3.internal.concurrent;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db.WireAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes3.dex */
public final class TaskQueue {
    public Task activeTask;
    public boolean cancelActiveTask;
    public final ArrayList futureTasks;
    public final String name;
    public boolean shutdown;
    public final TaskRunner taskRunner;

    public TaskQueue(TaskRunner taskRunner, String str) {
        taskRunner.getClass();
        this.taskRunner = taskRunner;
        this.name = str;
        this.futureTasks = new ArrayList();
    }

    public static void execute$default(TaskQueue taskQueue, String str, long j, Function0 function0, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        taskQueue.getClass();
        str.getClass();
        function0.getClass();
        taskQueue.schedule(new TaskQueue$execute$1(str, z, function0), j);
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null && task.cancelable) {
            this.cancelActiveTask = true;
        }
        ArrayList arrayList = this.futureTasks;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).cancelable) {
                Logger logger = this.taskRunner.logger$1;
                Task task2 = (Task) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(this.name + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{"canceled"}, 1)) + ": " + task2.name);
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void schedule(Task task, long j) {
        task.getClass();
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (scheduleAndDecide$okhttp(task, j, false)) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
                return;
            }
            boolean z = task.cancelable;
            TaskRunner taskRunner = this.taskRunner;
            if (z) {
                Logger logger = taskRunner.logger$1;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(this.name + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{"schedule canceled (queue is shutdown)"}, 1)) + ": " + task.name);
                }
            } else {
                Logger logger2 = taskRunner.logger$1;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(this.name + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{"schedule failed (queue is shutdown)"}, 1)) + ": " + task.name);
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean scheduleAndDecide$okhttp(Task task, long j, boolean z) {
        task.getClass();
        TaskQueue taskQueue = task.queue;
        if (taskQueue != this) {
            if (taskQueue != null) {
                a$$ExternalSyntheticBUOutline0.m$1("task is in multiple queues");
                return false;
            }
            task.queue = this;
        }
        TaskRunner taskRunner = this.taskRunner;
        WireAdapter wireAdapter = taskRunner.backend;
        Logger logger = taskRunner.logger$1;
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.futureTasks;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.nextExecuteNanoTime <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(this.name + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{"already scheduled"}, 1)) + ": " + task.name);
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        task.nextExecuteNanoTime = j2;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(this.name + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{z ? "run again after ".concat(TaskLoggerKt.formatDuration(j2 - nanoTime)) : "scheduled after ".concat(TaskLoggerKt.formatDuration(j2 - nanoTime))}, 1)) + ": " + task.name);
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Task) it.next()).nextExecuteNanoTime - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, task);
        return i == 0;
    }

    public final void shutdown() {
        TaskRunner taskRunner = this.taskRunner;
        TimeZone timeZone = _UtilJvmKt.UTC;
        synchronized (taskRunner) {
            this.shutdown = true;
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
        }
    }

    public final String toString() {
        return this.name;
    }
}
