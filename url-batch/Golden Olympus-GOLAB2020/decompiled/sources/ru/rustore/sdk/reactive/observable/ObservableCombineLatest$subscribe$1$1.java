package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class ObservableCombineLatest$subscribe$1$1 extends s implements Function1<Object, Pair<? extends Integer, ? extends Object>> {
    final /* synthetic */ int $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObservableCombineLatest$subscribe$1$1(int i4) {
        super(1);
        this.$index = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pair<Integer, Object> invoke(Object obj) {
        return TuplesKt.to(Integer.valueOf(this.$index), obj);
    }
}
