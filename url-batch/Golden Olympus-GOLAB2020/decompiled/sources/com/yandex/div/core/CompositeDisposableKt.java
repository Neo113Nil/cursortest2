package com.yandex.div.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class CompositeDisposableKt {
    public static final void plusAssign(@NotNull CompositeDisposable compositeDisposable, @NotNull Disposable disposable) {
        Intrinsics.checkNotNullParameter(compositeDisposable, "<this>");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        compositeDisposable.add(disposable);
    }
}
