package com.squareup.cash.treehouse.android.platform;

import com.squareup.cash.treehouse.logger.LogMessage;
import com.squareup.cash.treehouse.logger.RawLoggerService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealRawLoggerService implements RawLoggerService {
    public final String appName;

    /* loaded from: classes.dex */
    public final class Factory {

        public final class MetroFactory implements dev.zacsweers.metro.internal.Factory {
            public static final MetroFactory INSTANCE = new MetroFactory();

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new Factory();
            }
        }
    }

    public RealRawLoggerService(String str) {
        str.getClass();
        this.appName = str;
    }

    @Override // com.squareup.cash.treehouse.logger.RawLoggerService
    public final void log(LogMessage logMessage) {
        int i;
        int ordinal = logMessage.logLevel.ordinal();
        if (ordinal == 0) {
            i = 4;
        } else if (ordinal == 1) {
            i = 5;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i = 6;
        }
        Timber.Forest forest = Timber.Forest;
        String str = logMessage.tag;
        if (str == null) {
            str = this.appName;
        }
        forest.tag(str);
        forest.log(logMessage.message, i, new Object[0]);
    }
}
