package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
interface NetworkConnections<N, E> {
    void addInEdge(E e8, N n8, boolean z7);

    void addOutEdge(E e8, N n8);

    N adjacentNode(E e8);

    Set<N> adjacentNodes();

    Set<E> edgesConnecting(N n8);

    Set<E> inEdges();

    Set<E> incidentEdges();

    Set<E> outEdges();

    Set<N> predecessors();

    @CanIgnoreReturnValue
    @CheckForNull
    N removeInEdge(E e8, boolean z7);

    @CanIgnoreReturnValue
    N removeOutEdge(E e8);

    Set<N> successors();
}
