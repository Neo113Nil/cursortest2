package com.arthenica.ffmpegkit;

import android.util.Log;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class a implements u {
    public static final int DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT = 5000;
    protected static final AtomicLong sessionIdGenerator = new AtomicLong(1);
    protected final String[] arguments;
    protected final m logCallback;
    protected final LogRedirectionStrategy logRedirectionStrategy;
    protected final long sessionId = sessionIdGenerator.getAndIncrement();
    protected final Date createTime = new Date();
    protected Date startTime = null;
    protected Date endTime = null;
    protected final List<l> logs = new LinkedList();
    protected final Object logsLock = new Object();
    protected Future<?> future = null;
    protected SessionState state = SessionState.CREATED;
    protected t returnCode = null;
    protected String failStackTrace = null;

    protected a(String[] strArr, m mVar, LogRedirectionStrategy logRedirectionStrategy) {
        this.logCallback = mVar;
        this.arguments = strArr;
        this.logRedirectionStrategy = logRedirectionStrategy;
        FFmpegKitConfig.addSession(this);
    }

    @Override // com.arthenica.ffmpegkit.u
    public void addLog(l lVar) {
        synchronized (this.logsLock) {
            this.logs.add(lVar);
        }
    }

    @Override // com.arthenica.ffmpegkit.u
    public void cancel() {
        if (this.state == SessionState.RUNNING) {
            g.cancel(this.sessionId);
        }
    }

    void complete(t tVar) {
        this.returnCode = tVar;
        this.state = SessionState.COMPLETED;
        this.endTime = new Date();
    }

    void fail(Exception exc) {
        this.failStackTrace = com.arthenica.smartexception.java.a.getStackTraceString(exc);
        this.state = SessionState.FAILED;
        this.endTime = new Date();
    }

    @Override // com.arthenica.ffmpegkit.u
    public List<l> getAllLogs(int i8) {
        waitForAsynchronousMessagesInTransmit(i8);
        if (thereAreAsynchronousMessagesInTransmit()) {
            Log.i("ffmpeg-kit", String.format("getAllLogs was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.sessionId)));
        }
        return getLogs();
    }

    @Override // com.arthenica.ffmpegkit.u
    public String getAllLogsAsString(int i8) {
        waitForAsynchronousMessagesInTransmit(i8);
        if (thereAreAsynchronousMessagesInTransmit()) {
            Log.i("ffmpeg-kit", String.format("getAllLogsAsString was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.sessionId)));
        }
        return getLogsAsString();
    }

    @Override // com.arthenica.ffmpegkit.u
    public String[] getArguments() {
        return this.arguments;
    }

    @Override // com.arthenica.ffmpegkit.u
    public String getCommand() {
        return FFmpegKitConfig.argumentsToString(this.arguments);
    }

    @Override // com.arthenica.ffmpegkit.u
    public Date getCreateTime() {
        return this.createTime;
    }

    @Override // com.arthenica.ffmpegkit.u
    public long getDuration() {
        Date date = this.startTime;
        Date date2 = this.endTime;
        if (date == null || date2 == null) {
            return 0L;
        }
        return date2.getTime() - date.getTime();
    }

    @Override // com.arthenica.ffmpegkit.u
    public Date getEndTime() {
        return this.endTime;
    }

    @Override // com.arthenica.ffmpegkit.u
    public String getFailStackTrace() {
        return this.failStackTrace;
    }

    @Override // com.arthenica.ffmpegkit.u
    public Future<?> getFuture() {
        return this.future;
    }

    @Override // com.arthenica.ffmpegkit.u
    public m getLogCallback() {
        return this.logCallback;
    }

    @Override // com.arthenica.ffmpegkit.u
    public LogRedirectionStrategy getLogRedirectionStrategy() {
        return this.logRedirectionStrategy;
    }

    @Override // com.arthenica.ffmpegkit.u
    public List<l> getLogs() {
        LinkedList linkedList;
        synchronized (this.logsLock) {
            linkedList = new LinkedList(this.logs);
        }
        return linkedList;
    }

    @Override // com.arthenica.ffmpegkit.u
    public String getLogsAsString() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.logsLock) {
            try {
                Iterator<l> it = this.logs.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // com.arthenica.ffmpegkit.u
    public String getOutput() {
        return getAllLogsAsString();
    }

    @Override // com.arthenica.ffmpegkit.u
    public t getReturnCode() {
        return this.returnCode;
    }

    @Override // com.arthenica.ffmpegkit.u
    public long getSessionId() {
        return this.sessionId;
    }

    @Override // com.arthenica.ffmpegkit.u
    public Date getStartTime() {
        return this.startTime;
    }

    @Override // com.arthenica.ffmpegkit.u
    public SessionState getState() {
        return this.state;
    }

    @Override // com.arthenica.ffmpegkit.u
    public abstract /* synthetic */ boolean isFFmpeg();

    @Override // com.arthenica.ffmpegkit.u
    public abstract /* synthetic */ boolean isFFprobe();

    @Override // com.arthenica.ffmpegkit.u
    public abstract /* synthetic */ boolean isMediaInformation();

    void setFuture(Future<?> future) {
        this.future = future;
    }

    void startRunning() {
        this.state = SessionState.RUNNING;
        this.startTime = new Date();
    }

    @Override // com.arthenica.ffmpegkit.u
    public boolean thereAreAsynchronousMessagesInTransmit() {
        return FFmpegKitConfig.messagesInTransmit(this.sessionId) != 0;
    }

    protected void waitForAsynchronousMessagesInTransmit(int i8) {
        long currentTimeMillis = System.currentTimeMillis();
        while (thereAreAsynchronousMessagesInTransmit() && System.currentTimeMillis() < i8 + currentTimeMillis) {
            synchronized (this) {
                try {
                    wait(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Override // com.arthenica.ffmpegkit.u
    public List<l> getAllLogs() {
        return getAllLogs(5000);
    }

    @Override // com.arthenica.ffmpegkit.u
    public String getAllLogsAsString() {
        return getAllLogsAsString(5000);
    }
}
