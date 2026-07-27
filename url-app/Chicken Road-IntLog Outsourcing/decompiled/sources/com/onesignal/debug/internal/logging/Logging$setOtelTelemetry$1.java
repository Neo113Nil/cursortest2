package com.onesignal.debug.internal.logging;

import com.onesignal.debug.LogLevel;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class Logging$setOtelTelemetry$1 extends j implements InterfaceC1441l {
    public static final Logging$setOtelTelemetry$1 INSTANCE = new Logging$setOtelTelemetry$1();

    public Logging$setOtelTelemetry$1() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public final Boolean invoke(LogLevel it) {
        i.e(it, "it");
        return Boolean.FALSE;
    }
}
