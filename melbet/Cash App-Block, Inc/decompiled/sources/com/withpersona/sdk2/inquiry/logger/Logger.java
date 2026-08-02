package com.withpersona.sdk2.inquiry.logger;

import android.content.Context;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;

/* loaded from: classes9.dex */
public final class Logger {
    public final ContextScope coroutineScope;
    public final SimpleDateFormat dateFormat;
    public final File errorLogsDir;
    public final CoroutineDispatcher loggerContext;

    public Logger(Context context) {
        context.getClass();
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        this.coroutineScope = JobKt.CoroutineScope(Dispatchers.Default.plus(JobKt.Job$default()));
        this.loggerContext = DefaultIoScheduler.INSTANCE.limitedParallelism(1);
        this.errorLogsDir = new File(context.getCacheDir(), "error_logs");
    }

    public static final File access$getLogFile(Logger logger, String str) {
        logger.getClass();
        String substringAfterLast$default = StringsKt.substringAfterLast$default(str, ".");
        File file = logger.errorLogsDir;
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            }
            return new File(file, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("persona_log_", substringAfterLast$default, ".csv"));
        }
        file.mkdirs();
        return new File(file, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("persona_log_", substringAfterLast$default, ".csv"));
    }
}
