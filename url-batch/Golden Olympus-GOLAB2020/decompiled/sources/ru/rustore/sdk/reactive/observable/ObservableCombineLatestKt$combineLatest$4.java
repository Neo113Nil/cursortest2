package ru.rustore.sdk.reactive.observable;

import h2.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata
/* loaded from: classes3.dex */
final class ObservableCombineLatestKt$combineLatest$4<R> extends s implements Function1<Object[], R> {
    final /* synthetic */ p $mapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObservableCombineLatestKt$combineLatest$4(p pVar) {
        super(1);
        this.$mapper = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final R invoke(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (R) this.$mapper.invoke(array[0], array[1], array[2], array[3], array[4]);
    }
}
