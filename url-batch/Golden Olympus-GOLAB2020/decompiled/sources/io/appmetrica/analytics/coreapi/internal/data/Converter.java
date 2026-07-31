package io.appmetrica.analytics.coreapi.internal.data;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public interface Converter<S, P> {
    P fromModel(S s4);

    S toModel(P p4);
}
