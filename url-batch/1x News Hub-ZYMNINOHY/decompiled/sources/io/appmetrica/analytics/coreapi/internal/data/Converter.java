package io.appmetrica.analytics.coreapi.internal.data;

/* loaded from: classes.dex */
public interface Converter<S, P> {
    P fromModel(S s3);

    S toModel(P p3);
}
