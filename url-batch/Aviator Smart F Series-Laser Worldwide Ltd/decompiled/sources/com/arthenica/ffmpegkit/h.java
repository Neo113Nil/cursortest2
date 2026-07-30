package com.arthenica.ffmpegkit;

import android.util.Log;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class h extends a {
    private final i completeCallback;
    private final List<v> statistics;
    private final w statisticsCallback;
    private final Object statisticsLock;

    private h(String[] strArr, i iVar, m mVar, w wVar, LogRedirectionStrategy logRedirectionStrategy) {
        super(strArr, mVar, logRedirectionStrategy);
        this.completeCallback = iVar;
        this.statisticsCallback = wVar;
        this.statistics = new LinkedList();
        this.statisticsLock = new Object();
    }

    public static h create(String[] strArr) {
        return new h(strArr, null, null, null, FFmpegKitConfig.getLogRedirectionStrategy());
    }

    public void addStatistics(v vVar) {
        synchronized (this.statisticsLock) {
            this.statistics.add(vVar);
        }
    }

    public List<v> getAllStatistics(int i8) {
        waitForAsynchronousMessagesInTransmit(i8);
        if (thereAreAsynchronousMessagesInTransmit()) {
            Log.i("ffmpeg-kit", String.format("getAllStatistics was called to return all statistics but there are still statistics being transmitted for session id %d.", Long.valueOf(this.sessionId)));
        }
        return getStatistics();
    }

    public i getCompleteCallback() {
        return this.completeCallback;
    }

    public v getLastReceivedStatistics() {
        synchronized (this.statisticsLock) {
            try {
                if (this.statistics.size() <= 0) {
                    return null;
                }
                return this.statistics.get(r1.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<v> getStatistics() {
        List<v> list;
        synchronized (this.statisticsLock) {
            list = this.statistics;
        }
        return list;
    }

    public w getStatisticsCallback() {
        return this.statisticsCallback;
    }

    @Override // com.arthenica.ffmpegkit.a, com.arthenica.ffmpegkit.u
    public boolean isFFmpeg() {
        return true;
    }

    @Override // com.arthenica.ffmpegkit.a, com.arthenica.ffmpegkit.u
    public boolean isFFprobe() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.a, com.arthenica.ffmpegkit.u
    public boolean isMediaInformation() {
        return false;
    }

    public String toString() {
        return "FFmpegSession{sessionId=" + this.sessionId + ", createTime=" + this.createTime + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", arguments=" + FFmpegKitConfig.argumentsToString(this.arguments) + ", logs=" + getLogsAsString() + ", state=" + this.state + ", returnCode=" + this.returnCode + ", failStackTrace='" + this.failStackTrace + "'}";
    }

    public static h create(String[] strArr, i iVar) {
        return new h(strArr, iVar, null, null, FFmpegKitConfig.getLogRedirectionStrategy());
    }

    public static h create(String[] strArr, i iVar, m mVar, w wVar) {
        return new h(strArr, iVar, mVar, wVar, FFmpegKitConfig.getLogRedirectionStrategy());
    }

    public static h create(String[] strArr, i iVar, m mVar, w wVar, LogRedirectionStrategy logRedirectionStrategy) {
        return new h(strArr, iVar, mVar, wVar, logRedirectionStrategy);
    }

    public List<v> getAllStatistics() {
        return getAllStatistics(5000);
    }
}
