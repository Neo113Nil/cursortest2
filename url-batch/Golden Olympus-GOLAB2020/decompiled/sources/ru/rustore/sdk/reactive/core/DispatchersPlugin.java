package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class DispatchersPlugin {

    @NotNull
    public static final DispatchersPlugin INSTANCE = new DispatchersPlugin();

    /* renamed from: io, reason: collision with root package name */
    @Nullable
    private static Dispatcher f45849io;

    @Nullable
    private static Dispatcher main;

    private DispatchersPlugin() {
    }

    @Nullable
    public final Dispatcher getIo() {
        Dispatcher dispatcher;
        synchronized (this) {
            dispatcher = f45849io;
        }
        return dispatcher;
    }

    @Nullable
    public final Dispatcher getMain() {
        Dispatcher dispatcher;
        synchronized (this) {
            dispatcher = main;
        }
        return dispatcher;
    }

    public final void setIo(@Nullable Dispatcher dispatcher) {
        synchronized (this) {
            f45849io = dispatcher;
            Unit unit = Unit.f41027a;
        }
    }

    public final void setMain(@Nullable Dispatcher dispatcher) {
        synchronized (this) {
            main = dispatcher;
            Unit unit = Unit.f41027a;
        }
    }
}
