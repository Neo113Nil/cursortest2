package com.yandex.div.core.util;

import O1.Z;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC3212b;
import kotlin.collections.C3218h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivTreeWalk implements Sequence<DivItemBuilderResult> {
    private final int maxDepth;

    @Nullable
    private final Function1<Z, Boolean> onEnter;

    @Nullable
    private final Function1<Z, Unit> onLeave;

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final Z root;

    @Metadata
    private static final class BranchNode implements Node {
        private int childIndex;

        @Nullable
        private List<DivItemBuilderResult> children;

        @NotNull
        private final DivItemBuilderResult item;

        @Nullable
        private final Function1<Z, Boolean> onEnter;

        @Nullable
        private final Function1<Z, Unit> onLeave;
        private boolean rootVisited;

        /* JADX WARN: Multi-variable type inference failed */
        public BranchNode(@NotNull DivItemBuilderResult item, @Nullable Function1<? super Z, Boolean> function1, @Nullable Function1<? super Z, Unit> function12) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.onEnter = function1;
            this.onLeave = function12;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @NotNull
        public DivItemBuilderResult getItem() {
            return this.item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @Nullable
        public DivItemBuilderResult step() {
            if (!this.rootVisited) {
                Function1<Z, Boolean> function1 = this.onEnter;
                if (function1 != null && !((Boolean) function1.invoke(getItem().getDiv())).booleanValue()) {
                    return null;
                }
                this.rootVisited = true;
                return getItem();
            }
            List<DivItemBuilderResult> list = this.children;
            if (list == null) {
                list = DivTreeWalkKt.getItems(getItem().getDiv(), getItem().getExpressionResolver());
                this.children = list;
            }
            if (this.childIndex < list.size()) {
                int i4 = this.childIndex;
                this.childIndex = i4 + 1;
                return list.get(i4);
            }
            Function1<Z, Unit> function12 = this.onLeave;
            if (function12 != null) {
                function12.invoke(getItem().getDiv());
            }
            return null;
        }
    }

    @Metadata
    private final class DivTreeWalkIterator extends AbstractC3212b {

        @NotNull
        private final ExpressionResolver resolver;

        @NotNull
        private final Z root;

        @NotNull
        private final C3218h stack;
        final /* synthetic */ DivTreeWalk this$0;

        public DivTreeWalkIterator(@NotNull DivTreeWalk divTreeWalk, @NotNull Z root, ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            this.this$0 = divTreeWalk;
            this.root = root;
            this.resolver = resolver;
            C3218h c3218h = new C3218h();
            c3218h.addLast(node(DivCollectionExtensionsKt.toItemBuilderResult(root, resolver)));
            this.stack = c3218h;
        }

        private final DivItemBuilderResult nextItem() {
            Node node = (Node) this.stack.m();
            if (node == null) {
                return null;
            }
            DivItemBuilderResult step = node.step();
            if (step == null) {
                this.stack.removeLast();
                return nextItem();
            }
            if (step == node.getItem() || DivUtilKt.isLeaf(step.getDiv()) || this.stack.size() >= this.this$0.maxDepth) {
                return step;
            }
            this.stack.addLast(node(step));
            return nextItem();
        }

        private final Node node(DivItemBuilderResult divItemBuilderResult) {
            return DivUtilKt.isBranch(divItemBuilderResult.getDiv()) ? new BranchNode(divItemBuilderResult, this.this$0.onEnter, this.this$0.onLeave) : new LeafNode(divItemBuilderResult);
        }

        @Override // kotlin.collections.AbstractC3212b
        protected void computeNext() {
            DivItemBuilderResult nextItem = nextItem();
            if (nextItem != null) {
                setNext(nextItem);
            } else {
                done();
            }
        }
    }

    @Metadata
    private static final class LeafNode implements Node {

        @NotNull
        private final DivItemBuilderResult item;
        private boolean visited;

        public LeafNode(@NotNull DivItemBuilderResult item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @NotNull
        public DivItemBuilderResult getItem() {
            return this.item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @Nullable
        public DivItemBuilderResult step() {
            if (this.visited) {
                return null;
            }
            this.visited = true;
            return getItem();
        }
    }

    @Metadata
    private interface Node {
        @NotNull
        DivItemBuilderResult getItem();

        @Nullable
        DivItemBuilderResult step();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DivTreeWalk(Z z4, ExpressionResolver expressionResolver, Function1<? super Z, Boolean> function1, Function1<? super Z, Unit> function12, int i4) {
        this.root = z4;
        this.resolver = expressionResolver;
        this.onEnter = function1;
        this.onLeave = function12;
        this.maxDepth = i4;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<DivItemBuilderResult> iterator() {
        return new DivTreeWalkIterator(this, this.root, this.resolver);
    }

    @NotNull
    public final DivTreeWalk onEnter(@NotNull Function1<? super Z, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new DivTreeWalk(this.root, this.resolver, predicate, this.onLeave, this.maxDepth);
    }

    @NotNull
    public final DivTreeWalk onLeave(@NotNull Function1<? super Z, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new DivTreeWalk(this.root, this.resolver, this.onEnter, function, this.maxDepth);
    }

    /* synthetic */ DivTreeWalk(Z z4, ExpressionResolver expressionResolver, Function1 function1, Function1 function12, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, expressionResolver, function1, function12, (i5 & 16) != 0 ? Integer.MAX_VALUE : i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DivTreeWalk(@NotNull Z root, @NotNull ExpressionResolver resolver) {
        this(root, resolver, null, null, 0, 16, null);
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
    }
}
