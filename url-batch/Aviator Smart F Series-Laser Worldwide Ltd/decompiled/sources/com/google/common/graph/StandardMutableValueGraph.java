package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class StandardMutableValueGraph<N, V> extends StandardValueGraph<N, V> implements MutableValueGraph<N, V> {
    private final ElementOrder<N> incidentEdgeOrder;

    StandardMutableValueGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder) {
        super(abstractGraphBuilder);
        this.incidentEdgeOrder = (ElementOrder<N>) abstractGraphBuilder.incidentEdgeOrder.cast();
    }

    @CanIgnoreReturnValue
    private GraphConnections<N, V> addNodeInternal(N n8) {
        GraphConnections<N, V> newConnections = newConnections();
        Preconditions.checkState(this.nodeConnections.put(n8, newConnections) == null);
        return newConnections;
    }

    private GraphConnections<N, V> newConnections() {
        return isDirected() ? DirectedGraphConnections.of(this.incidentEdgeOrder) : UndirectedGraphConnections.of(this.incidentEdgeOrder);
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public boolean addNode(N n8) {
        Preconditions.checkNotNull(n8, "node");
        if (containsNode(n8)) {
            return false;
        }
        addNodeInternal(n8);
        return true;
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return this.incidentEdgeOrder;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    @CheckForNull
    public V putEdgeValue(N n8, N n9, V v7) {
        Preconditions.checkNotNull(n8, "nodeU");
        Preconditions.checkNotNull(n9, "nodeV");
        Preconditions.checkNotNull(v7, "value");
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!n8.equals(n9), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n8);
        }
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n8);
        if (graphConnections == null) {
            graphConnections = addNodeInternal(n8);
        }
        V addSuccessor = graphConnections.addSuccessor(n9, v7);
        GraphConnections<N, V> graphConnections2 = this.nodeConnections.get(n9);
        if (graphConnections2 == null) {
            graphConnections2 = addNodeInternal(n9);
        }
        graphConnections2.addPredecessor(n8, v7);
        if (addSuccessor == null) {
            long j8 = this.edgeCount + 1;
            this.edgeCount = j8;
            Graphs.checkPositive(j8);
        }
        return addSuccessor;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    @CheckForNull
    public V removeEdge(N n8, N n9) {
        Preconditions.checkNotNull(n8, "nodeU");
        Preconditions.checkNotNull(n9, "nodeV");
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n8);
        GraphConnections<N, V> graphConnections2 = this.nodeConnections.get(n9);
        if (graphConnections == null || graphConnections2 == null) {
            return null;
        }
        V removeSuccessor = graphConnections.removeSuccessor(n9);
        if (removeSuccessor != null) {
            graphConnections2.removePredecessor(n8);
            long j8 = this.edgeCount - 1;
            this.edgeCount = j8;
            Graphs.checkNonNegative(j8);
        }
        return removeSuccessor;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    public boolean removeNode(N n8) {
        Preconditions.checkNotNull(n8, "node");
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n8);
        if (graphConnections == null) {
            return false;
        }
        if (allowsSelfLoops() && graphConnections.removeSuccessor(n8) != null) {
            graphConnections.removePredecessor(n8);
            this.edgeCount--;
        }
        Iterator<N> it = graphConnections.successors().iterator();
        while (it.hasNext()) {
            GraphConnections<N, V> withoutCaching = this.nodeConnections.getWithoutCaching(it.next());
            Objects.requireNonNull(withoutCaching);
            withoutCaching.removePredecessor(n8);
            this.edgeCount--;
        }
        if (isDirected()) {
            Iterator<N> it2 = graphConnections.predecessors().iterator();
            while (it2.hasNext()) {
                GraphConnections<N, V> withoutCaching2 = this.nodeConnections.getWithoutCaching(it2.next());
                Objects.requireNonNull(withoutCaching2);
                Preconditions.checkState(withoutCaching2.removeSuccessor(n8) != null);
                this.edgeCount--;
            }
        }
        this.nodeConnections.remove(n8);
        Graphs.checkNonNegative(this.edgeCount);
        return true;
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    @CheckForNull
    public V removeEdge(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return removeEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.MutableValueGraph
    @CanIgnoreReturnValue
    @CheckForNull
    public V putEdgeValue(EndpointPair<N> endpointPair, V v7) {
        validateEndpoints(endpointPair);
        return putEdgeValue(endpointPair.nodeU(), endpointPair.nodeV(), v7);
    }
}
