package ru.rustore.sdk.reactive.observable;

import h2.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata
/* loaded from: classes3.dex */
final class ObservableCombineLatestKt$combineLatest$2<R> extends s implements Function1<Object[], R> {
    final /* synthetic */ n $mapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObservableCombineLatestKt$combineLatest$2(n nVar) {
        super(1);
        this.$mapper = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final R invoke(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (R) this.$mapper.invoke(array[0], array[1], array[2]);
    }
}
