package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class StandardMutableNetwork<N, E> extends StandardNetwork<N, E> implements MutableNetwork<N, E> {
    StandardMutableNetwork(NetworkBuilder<? super N, ? super E> networkBuilder) {
        super(networkBuilder);
    }

    @CanIgnoreReturnValue
    private NetworkConnections<N, E> addNodeInternal(N n8) {
        NetworkConnections<N, E> newConnections = newConnections();
        Preconditions.checkState(this.nodeConnections.put(n8, newConnections) == null);
        return newConnections;
    }

    private NetworkConnections<N, E> newConnections() {
        return isDirected() ? allowsParallelEdges() ? DirectedMultiNetworkConnections.of() : DirectedNetworkConnections.of() : allowsParallelEdges() ? UndirectedMultiNetworkConnections.of() : UndirectedNetworkConnections.of();
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(N n8, N n9, E e8) {
        Preconditions.checkNotNull(n8, "nodeU");
        Preconditions.checkNotNull(n9, "nodeV");
        Preconditions.checkNotNull(e8, "edge");
        if (containsEdge(e8)) {
            EndpointPair<N> incidentNodes = incidentNodes(e8);
            EndpointPair of = EndpointPair.of(this, n8, n9);
            Preconditions.checkArgument(incidentNodes.equals(of), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", e8, incidentNodes, of);
            return false;
        }
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n8);
        if (!allowsParallelEdges()) {
            Preconditions.checkArgument(networkConnections == null || !networkConnections.successors().contains(n9), "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", n8, n9);
        }
        boolean equals = n8.equals(n9);
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!equals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n8);
        }
        if (networkConnections == null) {
            networkConnections = addNodeInternal(n8);
        }
        networkConnections.addOutEdge(e8, n9);
        NetworkConnections<N, E> networkConnections2 = this.nodeConnections.get(n9);
        if (networkConnections2 == null) {
            networkConnections2 = addNodeInternal(n9);
        }
        networkConnections2.addInEdge(e8, n8, equals);
        this.edgeToReferenceNode.put(e8, n8);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addNode(N n8) {
        Preconditions.checkNotNull(n8, "node");
        if (containsNode(n8)) {
            return false;
        }
        addNodeInternal(n8);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeEdge(E e8) {
        Preconditions.checkNotNull(e8, "edge");
        N n8 = this.edgeToReferenceNode.get(e8);
        boolean z7 = false;
        if (n8 == null) {
            return false;
        }
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n8);
        Objects.requireNonNull(networkConnections);
        NetworkConnections<N, E> networkConnections2 = networkConnections;
        N adjacentNode = networkConnections2.adjacentNode(e8);
        NetworkConnections<N, E> networkConnections3 = this.nodeConnections.get(adjacentNode);
        Objects.requireNonNull(networkConnections3);
        NetworkConnections<N, E> networkConnections4 = networkConnections3;
        networkConnections2.removeOutEdge(e8);
        if (allowsSelfLoops() && n8.equals(adjacentNode)) {
            z7 = true;
        }
        networkConnections4.removeInEdge(e8, z7);
        this.edgeToReferenceNode.remove(e8);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeNode(N n8) {
        Preconditions.checkNotNull(n8, "node");
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n8);
        if (networkConnections == null) {
            return false;
        }
        UnmodifiableIterator<E> it = ImmutableList.copyOf((Collection) networkConnections.incidentEdges()).iterator();
        while (it.hasNext()) {
            removeEdge(it.next());
        }
        this.nodeConnections.remove(n8);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(EndpointPair<N> endpointPair, E e8) {
        validateEndpoints(endpointPair);
        return addEdge(endpointPair.nodeU(), endpointPair.nodeV(), e8);
    }
}
