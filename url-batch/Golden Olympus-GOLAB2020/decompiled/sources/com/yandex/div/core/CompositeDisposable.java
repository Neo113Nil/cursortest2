package com.yandex.div.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class CompositeDisposable implements Disposable {
    private boolean closed;

    @NotNull
    private final List<Disposable> disposables = new ArrayList();

    public final void add(@NotNull Disposable disposable) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        if (this.closed) {
            throw new IllegalArgumentException("close() method was called");
        }
        if (disposable != Disposable.NULL) {
            this.disposables.add(disposable);
        }
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        Iterator<T> it = this.disposables.iterator();
        while (it.hasNext()) {
            ((Disposable) it.next()).close();
        }
        this.disposables.clear();
        this.closed = true;
    }
}
