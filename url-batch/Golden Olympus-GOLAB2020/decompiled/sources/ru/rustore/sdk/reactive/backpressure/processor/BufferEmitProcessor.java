package ru.rustore.sdk.reactive.backpressure.processor;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.reactive.backpressure.buffer.Buffer;
import ru.rustore.sdk.reactive.backpressure.buffer.BufferItemType;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.ObservableObserver;

@Metadata
/* loaded from: classes3.dex */
public abstract class BufferEmitProcessor<T> implements Disposable {

    @NotNull
    private final Buffer<T> buffer;
    private final int bufferSize;

    @Nullable
    private final Dispatcher dispatcher;

    @NotNull
    private final ObservableObserver<T> downStream;
    private boolean isDrainActive;

    @NotNull
    private final Object monitor;
    private boolean streamDone;

    public BufferEmitProcessor(@NotNull ObservableObserver<T> downStream, int i4, @Nullable Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(downStream, "downStream");
        this.downStream = downStream;
        this.bufferSize = i4;
        this.dispatcher = dispatcher;
        Object obj = new Object();
        this.monitor = obj;
        this.buffer = new Buffer<>(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void loop() {
        BufferItemType popFirstOrNull;
        while (true) {
            synchronized (this.monitor) {
                popFirstOrNull = this.buffer.popFirstOrNull();
                if (popFirstOrNull == null) {
                    this.isDrainActive = false;
                    return;
                }
            }
            if (popFirstOrNull instanceof BufferItemType.Item) {
                this.downStream.onNext(((BufferItemType.Item) popFirstOrNull).getItem());
            } else if (popFirstOrNull instanceof BufferItemType.Error) {
                this.downStream.onError(((BufferItemType.Error) popFirstOrNull).getE());
            } else if (Intrinsics.areEqual(popFirstOrNull, BufferItemType.Complete.INSTANCE)) {
                this.downStream.onComplete();
            }
        }
    }

    public final void complete() {
        synchronized (this.monitor) {
            if (this.streamDone) {
                return;
            }
            this.streamDone = true;
            this.buffer.offer(BufferItemType.Complete.INSTANCE);
            Unit unit = Unit.f41027a;
        }
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
        synchronized (this.monitor) {
            this.streamDone = true;
            this.buffer.clear();
            Unit unit = Unit.f41027a;
        }
    }

    public final void drain() {
        synchronized (this.monitor) {
            if (this.isDrainActive) {
                return;
            }
            this.isDrainActive = true;
            Unit unit = Unit.f41027a;
            Dispatcher dispatcher = this.dispatcher;
            if (dispatcher != null) {
                dispatcher.execute(new BufferEmitProcessor$drain$2(this));
            } else {
                loop();
            }
        }
    }

    public final void emit(T t4) {
        synchronized (this.monitor) {
            try {
                if (this.streamDone) {
                    return;
                }
                if (this.buffer.size() >= this.bufferSize) {
                    onOverflow(this.buffer, new BufferItemType.Item<>(t4));
                } else {
                    this.buffer.offer(new BufferItemType.Item(t4));
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void emitAll(@NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        synchronized (this.monitor) {
            try {
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    emit(it.next());
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void error(@NotNull Throwable e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        synchronized (this.monitor) {
            if (this.streamDone) {
                return;
            }
            this.streamDone = true;
            this.buffer.clear();
            this.buffer.offer(new BufferItemType.Error(e4));
            Unit unit = Unit.f41027a;
        }
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public boolean isDisposed() {
        boolean z4;
        synchronized (this.monitor) {
            z4 = this.streamDone;
        }
        return z4;
    }

    public abstract void onOverflow(@NotNull Buffer<T> buffer, @NotNull BufferItemType.Item<T> item);
}
