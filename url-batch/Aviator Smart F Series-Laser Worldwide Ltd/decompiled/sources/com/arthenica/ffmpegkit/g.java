package com.arthenica.ffmpegkit;

import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class g {
    private g() {
    }

    public static void cancel() {
        FFmpegKitConfig.nativeFFmpegCancel(0L);
    }

    public static h execute(String str) {
        return executeWithArguments(FFmpegKitConfig.parseArguments(str));
    }

    public static h executeAsync(String str, i iVar) {
        return executeWithArgumentsAsync(FFmpegKitConfig.parseArguments(str), iVar);
    }

    public static h executeWithArguments(String[] strArr) {
        h create = h.create(strArr);
        FFmpegKitConfig.ffmpegExecute(create);
        return create;
    }

    public static h executeWithArgumentsAsync(String[] strArr, i iVar) {
        h create = h.create(strArr, iVar);
        FFmpegKitConfig.asyncFFmpegExecute(create);
        return create;
    }

    public static List<h> listSessions() {
        return FFmpegKitConfig.getFFmpegSessions();
    }

    public static void cancel(long j8) {
        FFmpegKitConfig.nativeFFmpegCancel(j8);
    }

    public static h executeAsync(String str, i iVar, m mVar, w wVar) {
        return executeWithArgumentsAsync(FFmpegKitConfig.parseArguments(str), iVar, mVar, wVar);
    }

    public static h executeAsync(String str, i iVar, ExecutorService executorService) {
        h create = h.create(FFmpegKitConfig.parseArguments(str), iVar);
        FFmpegKitConfig.asyncFFmpegExecute(create, executorService);
        return create;
    }

    public static h executeWithArgumentsAsync(String[] strArr, i iVar, m mVar, w wVar) {
        h create = h.create(strArr, iVar, mVar, wVar);
        FFmpegKitConfig.asyncFFmpegExecute(create);
        return create;
    }

    public static h executeAsync(String str, i iVar, m mVar, w wVar, ExecutorService executorService) {
        h create = h.create(FFmpegKitConfig.parseArguments(str), iVar, mVar, wVar);
        FFmpegKitConfig.asyncFFmpegExecute(create, executorService);
        return create;
    }

    public static h executeWithArgumentsAsync(String[] strArr, i iVar, ExecutorService executorService) {
        h create = h.create(strArr, iVar);
        FFmpegKitConfig.asyncFFmpegExecute(create, executorService);
        return create;
    }

    public static h executeWithArgumentsAsync(String[] strArr, i iVar, m mVar, w wVar, ExecutorService executorService) {
        h create = h.create(strArr, iVar, mVar, wVar);
        FFmpegKitConfig.asyncFFmpegExecute(create, executorService);
        return create;
    }
}
