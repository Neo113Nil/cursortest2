package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class AbstractUndirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    final Map<E, N> incidentEdgeMap;

    AbstractUndirectedNetworkConnections(Map<E, N> map) {
        this.incidentEdgeMap = (Map) Preconditions.checkNotNull(map);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e8, N n8, boolean z7) {
        if (z7) {
            return;
        }
        addOutEdge(e8, n8);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e8, N n8) {
        Preconditions.checkState(this.incidentEdgeMap.put(e8, n8) == null);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e8) {
        N n8 = this.incidentEdgeMap.get(e8);
        Objects.requireNonNull(n8);
        return n8;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return Collections.unmodifiableSet(this.incidentEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.NetworkConnections
    @CheckForNull
    public N removeInEdge(E e8, boolean z7) {
        if (z7) {
            return null;
        }
        return removeOutEdge(e8);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e8) {
        N remove = this.incidentEdgeMap.remove(e8);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
        return adjacentNodes();
    }
}
