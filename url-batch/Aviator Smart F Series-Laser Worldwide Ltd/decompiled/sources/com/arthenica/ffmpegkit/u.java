package com.arthenica.ffmpegkit;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public interface u {
    void addLog(l lVar);

    void cancel();

    List<l> getAllLogs();

    List<l> getAllLogs(int i8);

    String getAllLogsAsString();

    String getAllLogsAsString(int i8);

    String[] getArguments();

    String getCommand();

    Date getCreateTime();

    long getDuration();

    Date getEndTime();

    String getFailStackTrace();

    Future<?> getFuture();

    m getLogCallback();

    LogRedirectionStrategy getLogRedirectionStrategy();

    List<l> getLogs();

    String getLogsAsString();

    String getOutput();

    t getReturnCode();

    long getSessionId();

    Date getStartTime();

    SessionState getState();

    boolean isFFmpeg();

    boolean isFFprobe();

    boolean isMediaInformation();

    boolean thereAreAsynchronousMessagesInTransmit();
}
