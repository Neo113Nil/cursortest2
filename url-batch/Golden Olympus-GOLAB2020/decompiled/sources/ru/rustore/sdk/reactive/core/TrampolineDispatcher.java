package ru.rustore.sdk.reactive.core;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C3218h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class TrampolineDispatcher implements Dispatcher {
    private static boolean drainActive;

    @NotNull
    public static final TrampolineDispatcher INSTANCE = new TrampolineDispatcher();

    @NotNull
    private static final C3218h taskQueue = new C3218h();

    private TrampolineDispatcher() {
    }

    private final void drain() {
        Function0 function0;
        synchronized (this) {
            if (drainActive) {
                return;
            }
            drainActive = true;
            Unit unit = Unit.f41027a;
            while (true) {
                synchronized (this) {
                    function0 = (Function0) taskQueue.p();
                    if (function0 == null) {
                        drainActive = false;
                        return;
                    }
                }
                function0.invoke();
            }
        }
    }

    @Override // ru.rustore.sdk.reactive.core.Dispatcher
    public void execute(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this) {
            taskQueue.addLast(block);
            Unit unit = Unit.f41027a;
        }
        drain();
    }

    @Override // ru.rustore.sdk.reactive.core.Dispatcher
    @NotNull
    public Disposable executeDelayed(long j4, @NotNull TimeUnit timeUnit, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(block, "block");
        timeUnit.sleep(j4);
        synchronized (this) {
            taskQueue.addLast(block);
            Unit unit = Unit.f41027a;
        }
        drain();
        return EmptyDisposable.INSTANCE;
    }
}
