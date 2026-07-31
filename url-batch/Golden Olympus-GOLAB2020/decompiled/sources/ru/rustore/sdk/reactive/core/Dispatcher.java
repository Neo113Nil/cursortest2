package ru.rustore.sdk.reactive.core;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface Dispatcher {
    void execute(@NotNull Function0<Unit> function0);

    @NotNull
    Disposable executeDelayed(long j4, @NotNull TimeUnit timeUnit, @NotNull Function0<Unit> function0);
}
