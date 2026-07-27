package com.onesignal.core.internal.config;

import com.onesignal.debug.internal.crash.AnrConstants;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class ConfigModel$opRepoExecutionInterval$1 extends j implements InterfaceC1430a {
    public static final ConfigModel$opRepoExecutionInterval$1 INSTANCE = new ConfigModel$opRepoExecutionInterval$1();

    public ConfigModel$opRepoExecutionInterval$1() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final Long invoke() {
        return Long.valueOf(AnrConstants.DEFAULT_ANR_THRESHOLD_MS);
    }
}
