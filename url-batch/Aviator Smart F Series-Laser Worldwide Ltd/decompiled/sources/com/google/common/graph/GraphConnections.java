package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
interface GraphConnections<N, V> {
    void addPredecessor(N n8, V v7);

    @CanIgnoreReturnValue
    @CheckForNull
    V addSuccessor(N n8, V v7);

    Set<N> adjacentNodes();

    Iterator<EndpointPair<N>> incidentEdgeIterator(N n8);

    Set<N> predecessors();

    void removePredecessor(N n8);

    @CanIgnoreReturnValue
    @CheckForNull
    V removeSuccessor(N n8);

    Set<N> successors();

    @CheckForNull
    V value(N n8);
}
