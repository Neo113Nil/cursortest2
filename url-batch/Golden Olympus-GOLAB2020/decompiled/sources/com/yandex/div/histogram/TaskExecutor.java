package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface TaskExecutor {
    void post(@NotNull Function0<Unit> function0);
}
