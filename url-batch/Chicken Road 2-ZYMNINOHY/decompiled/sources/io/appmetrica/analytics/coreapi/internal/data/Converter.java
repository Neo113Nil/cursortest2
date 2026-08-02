package io.appmetrica.analytics.coreapi.internal.data;

/* loaded from: classes.dex */
public interface Converter<S, P> {
    P fromModel(S s4);

    S toModel(P p2);
}
