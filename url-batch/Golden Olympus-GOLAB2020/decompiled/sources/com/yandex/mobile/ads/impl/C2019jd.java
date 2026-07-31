package com.yandex.mobile.ads.impl;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.jd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2019jd extends Handler {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2019jd f27635a = new C2019jd();

    private C2019jd() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(@NotNull LogRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        int i4 = C1996id.f27156c;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "getLoggerName(...)");
        int intValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i5 = intValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        C1996id.a(loggerName, i5, message, record.getThrown());
    }
}
