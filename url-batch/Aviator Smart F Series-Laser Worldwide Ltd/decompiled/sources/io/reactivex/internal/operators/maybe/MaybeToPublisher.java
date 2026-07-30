package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import p7.b;

/* loaded from: classes3.dex */
public enum MaybeToPublisher implements Function<MaybeSource<Object>, b> {
    INSTANCE;

    public static <T> Function<MaybeSource<T>, b> instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.functions.Function
    public b apply(MaybeSource<Object> maybeSource) {
        return new MaybeToFlowable(maybeSource);
    }
}
