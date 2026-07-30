package okhttp3.internal.concurrent;

import f6.a;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;

/* loaded from: classes5.dex */
public final class TaskLoggerKt {
    public static final String formatDuration(long j8) {
        String str;
        if (j8 <= -999500000) {
            str = ((j8 - 500000000) / 1000000000) + " s ";
        } else if (j8 <= -999500) {
            str = ((j8 - 500000) / 1000000) + " ms";
        } else if (j8 <= 0) {
            str = ((j8 - 500) / 1000) + " µs";
        } else if (j8 < 999500) {
            str = ((j8 + 500) / 1000) + " µs";
        } else if (j8 < 999500000) {
            str = ((j8 + 500000) / 1000000) + " ms";
        } else {
            str = ((j8 + 500000000) / 1000000000) + " s ";
        }
        w wVar = w.INSTANCE;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        s.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        w wVar = w.INSTANCE;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        s.checkNotNullExpressionValue(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue queue, a block) {
        long j8;
        s.checkNotNullParameter(task, "task");
        s.checkNotNullParameter(queue, "queue");
        s.checkNotNullParameter(block, "block");
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j8 = queue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            j8 = -1;
        }
        try {
            T t7 = (T) block.invoke();
            r.finallyStart(1);
            if (isLoggable) {
                log(task, queue, s.stringPlus("finished run in ", formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - j8)));
            }
            r.finallyEnd(1);
            return t7;
        } catch (Throwable th) {
            r.finallyStart(1);
            if (isLoggable) {
                log(task, queue, s.stringPlus("failed a run in ", formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - j8)));
            }
            r.finallyEnd(1);
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue queue, a messageBlock) {
        s.checkNotNullParameter(task, "task");
        s.checkNotNullParameter(queue, "queue");
        s.checkNotNullParameter(messageBlock, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, (String) messageBlock.invoke());
        }
    }
}
