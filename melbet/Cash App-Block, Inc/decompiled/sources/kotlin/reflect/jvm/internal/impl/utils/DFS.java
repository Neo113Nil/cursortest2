package kotlin.reflect.jvm.internal.impl.utils;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public class DFS {

    public static abstract class AbstractNodeHandler<N, R> implements NodeHandler<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public void afterChildren(N n) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public boolean beforeChildren(N n) {
            return true;
        }
    }

    public static abstract class CollectingNodeHandler<N, R, C extends Iterable<R>> extends AbstractNodeHandler<N, C> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
        public C result() {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler", "result"));
        }
    }

    public interface Neighbors<N> {
        Iterable<? extends N> getNeighbors(N n);
    }

    public interface NodeHandler<N, R> {
        void afterChildren(N n);

        boolean beforeChildren(N n);

        R result();
    }

    public static abstract class NodeHandlerWithListResult<N, R> extends CollectingNodeHandler<N, R, LinkedList<R>> {
    }

    public interface Visited<N> {
        boolean checkAndMarkVisited(N n);
    }

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R dfs(Collection<N> collection, Neighbors<N> neighbors, Visited<N> visited, NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (neighbors == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        if (visited == null) {
            $$$reportNull$$$0(2);
            throw null;
        }
        if (nodeHandler == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            doDfs(it.next(), neighbors, visited, nodeHandler);
        }
        return nodeHandler.result();
    }

    public static <N> void doDfs(N n, Neighbors<N> neighbors, Visited<N> visited, NodeHandler<N, ?> nodeHandler) {
        if (n == null) {
            $$$reportNull$$$0(22);
            throw null;
        }
        if (neighbors == null) {
            $$$reportNull$$$0(23);
            throw null;
        }
        if (visited == null) {
            $$$reportNull$$$0(24);
            throw null;
        }
        if (nodeHandler == null) {
            $$$reportNull$$$0(25);
            throw null;
        }
        if (visited.checkAndMarkVisited(n) && nodeHandler.beforeChildren(n)) {
            Iterator<? extends N> it = neighbors.getNeighbors(n).iterator();
            while (it.hasNext()) {
                doDfs(it.next(), neighbors, visited, nodeHandler);
            }
            nodeHandler.afterChildren(n);
        }
    }

    public static <N> Boolean ifAny(Collection<N> collection, Neighbors<N> neighbors, final Function1<N, Boolean> function1) {
        if (collection == null) {
            $$$reportNull$$$0(7);
            throw null;
        }
        if (neighbors == null) {
            $$$reportNull$$$0(8);
            throw null;
        }
        if (function1 != null) {
            final boolean[] zArr = new boolean[1];
            return (Boolean) dfs(collection, neighbors, new AbstractNodeHandler() { // from class: kotlin.reflect.jvm.internal.impl.utils.DFS.1
                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public final boolean beforeChildren(Object obj) {
                    boolean booleanValue = ((Boolean) Function1.this.invoke(obj)).booleanValue();
                    boolean[] zArr2 = zArr;
                    if (booleanValue) {
                        zArr2[0] = true;
                    }
                    return !zArr2[0];
                }

                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public final Object result() {
                    return Boolean.valueOf(zArr[0]);
                }
            });
        }
        $$$reportNull$$$0(9);
        throw null;
    }

    public static class VisitedWithSet<N> implements Visited<N> {
        public final Set visited;

        public VisitedWithSet(Set<N> set) {
            if (set != null) {
                this.visited = set;
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("Argument for @NotNull parameter 'visited' of kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet.<init> must not be null");
                throw null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Visited
        public boolean checkAndMarkVisited(N n) {
            return this.visited.add(n);
        }

        public VisitedWithSet() {
            this(new HashSet());
        }
    }

    public static <N, R> R dfs(Collection<N> collection, Neighbors<N> neighbors, NodeHandler<N, R> nodeHandler) {
        if (collection == null) {
            $$$reportNull$$$0(4);
            throw null;
        }
        if (neighbors == null) {
            $$$reportNull$$$0(5);
            throw null;
        }
        if (nodeHandler != null) {
            return (R) dfs(collection, neighbors, new VisitedWithSet(), nodeHandler);
        }
        $$$reportNull$$$0(6);
        throw null;
    }
}
