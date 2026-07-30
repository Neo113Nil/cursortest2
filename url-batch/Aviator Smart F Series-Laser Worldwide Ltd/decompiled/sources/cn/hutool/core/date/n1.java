package cn.hutool.core.date;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class n1 {
    private String currentTaskName;
    private final String id;
    private a lastTaskInfo;
    private long startTimeNanos;
    private int taskCount;
    private List<a> taskList;
    private long totalTimeNanos;

    public static final class a {
        private final String taskName;
        private final long timeNanos;

        a(String str, long j8) {
            this.taskName = str;
            this.timeNanos = j8;
        }

        public String getTaskName() {
            return this.taskName;
        }

        public long getTime(TimeUnit timeUnit) {
            return timeUnit.convert(this.timeNanos, TimeUnit.NANOSECONDS);
        }

        public long getTimeMillis() {
            return getTime(TimeUnit.MILLISECONDS);
        }

        public long getTimeNanos() {
            return this.timeNanos;
        }

        public double getTimeSeconds() {
            return z.nanosToSeconds(this.timeNanos);
        }
    }

    public n1() {
        this("");
    }

    public static n1 create(String str) {
        return new n1(str);
    }

    public String currentTaskName() {
        return this.currentTaskName;
    }

    public String getId() {
        return this.id;
    }

    public a getLastTaskInfo() {
        a aVar = this.lastTaskInfo;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("No tasks run: can't get last task info");
    }

    public String getLastTaskName() {
        a aVar = this.lastTaskInfo;
        if (aVar != null) {
            return aVar.getTaskName();
        }
        throw new IllegalStateException("No tasks run: can't get last task name");
    }

    public long getLastTaskTimeMillis() {
        a aVar = this.lastTaskInfo;
        if (aVar != null) {
            return aVar.getTimeMillis();
        }
        throw new IllegalStateException("No tasks run: can't get last task interval");
    }

    public long getLastTaskTimeNanos() {
        a aVar = this.lastTaskInfo;
        if (aVar != null) {
            return aVar.getTimeNanos();
        }
        throw new IllegalStateException("No tasks run: can't get last task interval");
    }

    public int getTaskCount() {
        return this.taskCount;
    }

    public a[] getTaskInfo() {
        List<a> list = this.taskList;
        if (list != null) {
            return (a[]) list.toArray(new a[0]);
        }
        throw new UnsupportedOperationException("Task info is not being kept!");
    }

    public long getTotal(TimeUnit timeUnit) {
        return timeUnit.convert(this.totalTimeNanos, TimeUnit.NANOSECONDS);
    }

    public long getTotalTimeMillis() {
        return getTotal(TimeUnit.MILLISECONDS);
    }

    public long getTotalTimeNanos() {
        return this.totalTimeNanos;
    }

    public double getTotalTimeSeconds() {
        return z.nanosToSeconds(this.totalTimeNanos);
    }

    public boolean isRunning() {
        return this.currentTaskName != null;
    }

    public String prettyPrint() {
        return prettyPrint(null);
    }

    public void setKeepTaskList(boolean z7) {
        if (!z7) {
            this.taskList = null;
        } else if (this.taskList == null) {
            this.taskList = new ArrayList();
        }
    }

    public String shortSummary() {
        return shortSummary(null);
    }

    public void start() {
        start("");
    }

    public void stop() {
        if (this.currentTaskName == null) {
            throw new IllegalStateException("Can't stop StopWatch: it's not running");
        }
        long nanoTime = System.nanoTime() - this.startTimeNanos;
        this.totalTimeNanos += nanoTime;
        a aVar = new a(this.currentTaskName, nanoTime);
        this.lastTaskInfo = aVar;
        List<a> list = this.taskList;
        if (list != null) {
            list.add(aVar);
        }
        this.taskCount++;
        this.currentTaskName = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(shortSummary());
        List<a> list = this.taskList;
        if (list != null) {
            for (a aVar : list) {
                sb.append("; [");
                sb.append(aVar.getTaskName());
                sb.append("] took ");
                sb.append(aVar.getTimeNanos());
                sb.append(" ns");
                long round = Math.round((aVar.getTimeNanos() * 100.0d) / getTotalTimeNanos());
                sb.append(" = ");
                sb.append(round);
                sb.append("%");
            }
        } else {
            sb.append("; no task info kept");
        }
        return sb.toString();
    }

    public n1(String str) {
        this(str, true);
    }

    public String prettyPrint(TimeUnit timeUnit) {
        if (timeUnit == null) {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        StringBuilder sb = new StringBuilder(shortSummary(timeUnit));
        sb.append(cn.hutool.core.io.l.getLineSeparator());
        if (this.taskList == null) {
            sb.append("No task info kept");
        } else {
            sb.append("---------------------------------------------");
            sb.append(cn.hutool.core.io.l.getLineSeparator());
            sb.append(z.getShotName(timeUnit));
            sb.append("         %     Task name");
            sb.append(cn.hutool.core.io.l.getLineSeparator());
            sb.append("---------------------------------------------");
            sb.append(cn.hutool.core.io.l.getLineSeparator());
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMinimumIntegerDigits(9);
            numberInstance.setGroupingUsed(false);
            NumberFormat percentInstance = NumberFormat.getPercentInstance();
            percentInstance.setMinimumIntegerDigits(2);
            percentInstance.setGroupingUsed(false);
            for (a aVar : getTaskInfo()) {
                sb.append(numberInstance.format(aVar.getTime(timeUnit)));
                sb.append("  ");
                sb.append(percentInstance.format(aVar.getTimeNanos() / getTotalTimeNanos()));
                sb.append("   ");
                sb.append(aVar.getTaskName());
                sb.append(cn.hutool.core.io.l.getLineSeparator());
            }
        }
        return sb.toString();
    }

    public String shortSummary(TimeUnit timeUnit) {
        if (timeUnit == null) {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        return cn.hutool.core.text.l.format("StopWatch '{}': running time = {} {}", this.id, Long.valueOf(getTotal(timeUnit)), z.getShotName(timeUnit));
    }

    public void start(String str) {
        if (this.currentTaskName != null) {
            throw new IllegalStateException("Can't start StopWatch: it's already running");
        }
        this.currentTaskName = str;
        this.startTimeNanos = System.nanoTime();
    }

    public n1(String str, boolean z7) {
        this.id = str;
        if (z7) {
            this.taskList = new ArrayList();
        }
    }
}
