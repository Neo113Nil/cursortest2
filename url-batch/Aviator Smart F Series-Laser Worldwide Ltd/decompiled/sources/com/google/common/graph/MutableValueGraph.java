package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public interface MutableValueGraph<N, V> extends ValueGraph<N, V> {
    @CanIgnoreReturnValue
    boolean addNode(N n8);

    @CanIgnoreReturnValue
    @CheckForNull
    V putEdgeValue(EndpointPair<N> endpointPair, V v7);

    @CanIgnoreReturnValue
    @CheckForNull
    V putEdgeValue(N n8, N n9, V v7);

    @CanIgnoreReturnValue
    @CheckForNull
    V removeEdge(EndpointPair<N> endpointPair);

    @CanIgnoreReturnValue
    @CheckForNull
    V removeEdge(N n8, N n9);

    @CanIgnoreReturnValue
    boolean removeNode(N n8);
}
