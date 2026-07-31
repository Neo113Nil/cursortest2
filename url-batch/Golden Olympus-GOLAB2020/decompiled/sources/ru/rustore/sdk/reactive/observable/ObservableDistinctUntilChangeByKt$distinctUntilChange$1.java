package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
final class ObservableDistinctUntilChangeByKt$distinctUntilChange$1<T> extends s implements Function2<T, T, Boolean> {
    public static final ObservableDistinctUntilChangeByKt$distinctUntilChange$1 INSTANCE = new ObservableDistinctUntilChangeByKt$distinctUntilChange$1();

    ObservableDistinctUntilChangeByKt$distinctUntilChange$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(T t4, T t5) {
        return Boolean.valueOf(Intrinsics.areEqual(t4, t5));
    }
}
