package com.yandex.div.core.view2.errors;

import O1.C1165z4;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class ErrorCollector {

    @NotNull
    private final Set<Function2<List<? extends Throwable>, List<? extends Throwable>, Unit>> observers = new LinkedHashSet();

    @NotNull
    private final List<Throwable> runtimeErrors = new ArrayList();

    @NotNull
    private List<? extends Throwable> parsingErrors = CollectionsKt.emptyList();

    @NotNull
    private List<Throwable> warnings = new ArrayList();

    @NotNull
    private List<Throwable> errors = new ArrayList();
    private boolean errorsAreValid = true;

    private void notifyObservers() {
        this.errorsAreValid = false;
        if (this.observers.isEmpty()) {
            return;
        }
        rebuildErrors();
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(this.errors, this.warnings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeAndGet$lambda$1(ErrorCollector this$0, Function2 observer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        this$0.observers.remove(observer);
    }

    private void rebuildErrors() {
        if (this.errorsAreValid) {
            return;
        }
        this.errors.clear();
        this.errors.addAll(this.parsingErrors);
        this.errors.addAll(this.runtimeErrors);
        this.errorsAreValid = true;
    }

    public void attachParsingErrors(@Nullable C1165z4 c1165z4) {
        List<? extends Throwable> emptyList;
        if (c1165z4 == null || (emptyList = c1165z4.f8716h) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        this.parsingErrors = emptyList;
        notifyObservers();
    }

    public void cleanRuntimeWarningsAndErrors() {
        this.warnings.clear();
        this.runtimeErrors.clear();
        notifyObservers();
    }

    @NotNull
    public Iterator<Throwable> getWarnings() {
        return this.warnings.listIterator();
    }

    public void logError(@NotNull Throwable e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.runtimeErrors.add(e4);
        notifyObservers();
    }

    public void logWarning(@NotNull Throwable warning) {
        Intrinsics.checkNotNullParameter(warning, "warning");
        this.warnings.add(warning);
        notifyObservers();
    }

    @NotNull
    public Disposable observeAndGet(@NotNull final Function2<? super List<? extends Throwable>, ? super List<? extends Throwable>, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.add(observer);
        rebuildErrors();
        observer.invoke(this.errors, this.warnings);
        return new Disposable() { // from class: A1.a
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ErrorCollector.observeAndGet$lambda$1(ErrorCollector.this, observer);
            }
        };
    }
}
