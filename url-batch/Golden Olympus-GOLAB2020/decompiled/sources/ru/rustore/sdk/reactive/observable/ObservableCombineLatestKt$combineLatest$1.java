package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata
/* loaded from: classes3.dex */
final class ObservableCombineLatestKt$combineLatest$1<R> extends s implements Function1<Object[], R> {
    final /* synthetic */ Function2<T1, T2, R> $mapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ObservableCombineLatestKt$combineLatest$1(Function2<? super T1, ? super T2, ? extends R> function2) {
        super(1);
        this.$mapper = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final R invoke(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (R) this.$mapper.invoke(array[0], array[1]);
    }
}
