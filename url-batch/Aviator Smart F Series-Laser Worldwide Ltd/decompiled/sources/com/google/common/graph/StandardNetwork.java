package com.google.common.graph;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
class StandardNetwork<N, E> extends AbstractNetwork<N, E> {
    private final boolean allowsParallelEdges;
    private final boolean allowsSelfLoops;
    private final ElementOrder<E> edgeOrder;
    final MapIteratorCache<E, N> edgeToReferenceNode;
    private final boolean isDirected;
    final MapIteratorCache<N, NetworkConnections<N, E>> nodeConnections;
    private final ElementOrder<N> nodeOrder;

    StandardNetwork(NetworkBuilder<? super N, ? super E> networkBuilder) {
        this(networkBuilder, networkBuilder.nodeOrder.createMap(networkBuilder.expectedNodeCount.or((Optional<Integer>) 10).intValue()), networkBuilder.edgeOrder.createMap(networkBuilder.expectedEdgeCount.or((Optional<Integer>) 20).intValue()));
    }

    @Override // com.google.common.graph.Network
    public Set<N> adjacentNodes(N n8) {
        return checkedConnections(n8).adjacentNodes();
    }

    @Override // com.google.common.graph.Network
    public boolean allowsParallelEdges() {
        return this.allowsParallelEdges;
    }

    @Override // com.google.common.graph.Network
    public boolean allowsSelfLoops() {
        return this.allowsSelfLoops;
    }

    final NetworkConnections<N, E> checkedConnections(N n8) {
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n8);
        if (networkConnections != null) {
            return networkConnections;
        }
        Preconditions.checkNotNull(n8);
        throw new IllegalArgumentException(String.format("Node %s is not an element of this graph.", n8));
    }

    final N checkedReferenceNode(E e8) {
        N n8 = this.edgeToReferenceNode.get(e8);
        if (n8 != null) {
            return n8;
        }
        Preconditions.checkNotNull(e8);
        throw new IllegalArgumentException(String.format("Edge %s is not an element of this graph.", e8));
    }

    final boolean containsEdge(E e8) {
        return this.edgeToReferenceNode.containsKey(e8);
    }

    final boolean containsNode(N n8) {
        return this.nodeConnections.containsKey(n8);
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<E> edgeOrder() {
        return this.edgeOrder;
    }

    @Override // com.google.common.graph.Network
    public Set<E> edges() {
        return this.edgeToReferenceNode.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
    public Set<E> edgesConnecting(N n8, N n9) {
        NetworkConnections<N, E> checkedConnections = checkedConnections(n8);
        if (!this.allowsSelfLoops && n8 == n9) {
            return ImmutableSet.of();
        }
        Preconditions.checkArgument(containsNode(n9), "Node %s is not an element of this graph.", n9);
        return checkedConnections.edgesConnecting(n9);
    }

    @Override // com.google.common.graph.Network
    public Set<E> inEdges(N n8) {
        return checkedConnections(n8).inEdges();
    }

    @Override // com.google.common.graph.Network
    public Set<E> incidentEdges(N n8) {
        return checkedConnections(n8).incidentEdges();
    }

    @Override // com.google.common.graph.Network
    public EndpointPair<N> incidentNodes(E e8) {
        N checkedReferenceNode = checkedReferenceNode(e8);
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(checkedReferenceNode);
        Objects.requireNonNull(networkConnections);
        return EndpointPair.of(this, checkedReferenceNode, networkConnections.adjacentNode(e8));
    }

    @Override // com.google.common.graph.Network
    public boolean isDirected() {
        return this.isDirected;
    }

    @Override // com.google.common.graph.Network
    public ElementOrder<N> nodeOrder() {
        return this.nodeOrder;
    }

    @Override // com.google.common.graph.Network
    public Set<N> nodes() {
        return this.nodeConnections.unmodifiableKeySet();
    }

    @Override // com.google.common.graph.Network
    public Set<E> outEdges(N n8) {
        return checkedConnections(n8).outEdges();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
        return predecessors((StandardNetwork<N, E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
        return successors((StandardNetwork<N, E>) obj);
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
    public Set<N> predecessors(N n8) {
        return checkedConnections(n8).predecessors();
    }

    @Override // com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
    public Set<N> successors(N n8) {
        return checkedConnections(n8).successors();
    }

    StandardNetwork(NetworkBuilder<? super N, ? super E> networkBuilder, Map<N, NetworkConnections<N, E>> map, Map<E, N> map2) {
        MapIteratorCache<N, NetworkConnections<N, E>> mapIteratorCache;
        this.isDirected = networkBuilder.directed;
        this.allowsParallelEdges = networkBuilder.allowsParallelEdges;
        this.allowsSelfLoops = networkBuilder.allowsSelfLoops;
        this.nodeOrder = (ElementOrder<N>) networkBuilder.nodeOrder.cast();
        this.edgeOrder = (ElementOrder<E>) networkBuilder.edgeOrder.cast();
        if (map instanceof TreeMap) {
            mapIteratorCache = new MapRetrievalCache<>(map);
        } else {
            mapIteratorCache = new MapIteratorCache<>(map);
        }
        this.nodeConnections = mapIteratorCache;
        this.edgeToReferenceNode = new MapIteratorCache<>(map2);
    }
}
