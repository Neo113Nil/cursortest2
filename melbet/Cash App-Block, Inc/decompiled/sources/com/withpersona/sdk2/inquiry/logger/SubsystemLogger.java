package com.withpersona.sdk2.inquiry.logger;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobKt;

/* loaded from: classes9.dex */
public final class SubsystemLogger {
    public final Logger logger;
    public final String subsystem;

    public interface Factory {
    }

    public SubsystemLogger(Logger logger, String str) {
        logger.getClass();
        this.logger = logger;
        this.subsystem = str;
    }

    public final void error(String str) {
        LogLevel logLevel = LogLevel.Error;
        Logger logger = this.logger;
        logger.getClass();
        JobKt.launch$default(logger.coroutineScope, null, null, new Logger$log$1(logger, str, this.subsystem, (Continuation) null), 3);
    }
}
