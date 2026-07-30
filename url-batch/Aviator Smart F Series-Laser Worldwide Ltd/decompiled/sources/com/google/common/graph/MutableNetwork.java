package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public interface MutableNetwork<N, E> extends Network<N, E> {
    @CanIgnoreReturnValue
    boolean addEdge(EndpointPair<N> endpointPair, E e8);

    @CanIgnoreReturnValue
    boolean addEdge(N n8, N n9, E e8);

    @CanIgnoreReturnValue
    boolean addNode(N n8);

    @CanIgnoreReturnValue
    boolean removeEdge(E e8);

    @CanIgnoreReturnValue
    boolean removeNode(N n8);
}
