package com.yandex.div.core.expression.local;

import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.ExpressionsRuntime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class RuntimeTree {

    @NotNull
    private final Map<ExpressionsRuntime, RuntimeNode> runtimesToNodes = new LinkedHashMap();

    @NotNull
    private final Map<String, RuntimeNode> pathToNodes = new LinkedHashMap();

    private final void invokeRecursively(RuntimeNode runtimeNode, Function1<? super RuntimeNode, Unit> function1) {
        function1.invoke(runtimeNode);
        Iterator<T> it = runtimeNode.getChildren().iterator();
        while (it.hasNext()) {
            invokeRecursively((RuntimeNode) it.next(), function1);
        }
    }

    @NotNull
    public final Map<String, ExpressionsRuntime> getPathToRuntimes() {
        Map<String, RuntimeNode> map = this.pathToNodes;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, RuntimeNode> entry : map.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue().getRuntime()));
        }
        return MapsKt.toMap(arrayList);
    }

    public final void removeRuntimeAndCleanup(@Nullable DivViewFacade divViewFacade, @NotNull ExpressionsRuntime runtime, @NotNull String path) {
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        Intrinsics.checkNotNullParameter(path, "path");
        invokeRecursively(runtime, path, new RuntimeTree$removeRuntimeAndCleanup$1(this, divViewFacade));
    }

    public final void storeRuntime(@NotNull ExpressionsRuntime runtime, @Nullable ExpressionsRuntime expressionsRuntime, @NotNull String path) {
        RuntimeNode runtimeNode;
        List<RuntimeNode> children;
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        Intrinsics.checkNotNullParameter(path, "path");
        RuntimeNode runtimeNode2 = new RuntimeNode(runtime, path, null, 4, null);
        this.pathToNodes.put(path, runtimeNode2);
        this.runtimesToNodes.put(runtime, runtimeNode2);
        if (expressionsRuntime == null || (runtimeNode = this.runtimesToNodes.get(expressionsRuntime)) == null || (children = runtimeNode.getChildren()) == null) {
            return;
        }
        children.add(runtimeNode2);
    }

    @Metadata
    public static final class RuntimeNode {

        @NotNull
        private final List<RuntimeNode> children;

        @NotNull
        private final String path;

        @NotNull
        private final ExpressionsRuntime runtime;

        public RuntimeNode(@NotNull ExpressionsRuntime runtime, @NotNull String path, @NotNull List<RuntimeNode> children) {
            Intrinsics.checkNotNullParameter(runtime, "runtime");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(children, "children");
            this.runtime = runtime;
            this.path = path;
            this.children = children;
        }

        @NotNull
        public final List<RuntimeNode> getChildren() {
            return this.children;
        }

        @NotNull
        public final String getPath() {
            return this.path;
        }

        @NotNull
        public final ExpressionsRuntime getRuntime() {
            return this.runtime;
        }

        public /* synthetic */ RuntimeNode(ExpressionsRuntime expressionsRuntime, String str, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(expressionsRuntime, str, (i4 & 4) != 0 ? new ArrayList() : list);
        }
    }

    public final void invokeRecursively(@NotNull ExpressionsRuntime expressionsRuntime, @NotNull String path, @NotNull Function1<? super RuntimeNode, Unit> callback) {
        Intrinsics.checkNotNullParameter(expressionsRuntime, "expressionsRuntime");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        RuntimeNode runtimeNode = this.runtimesToNodes.get(expressionsRuntime);
        if (runtimeNode == null) {
            return;
        }
        if (StringsKt.K(runtimeNode.getPath(), path, false, 2, null)) {
            invokeRecursively(runtimeNode, callback);
            return;
        }
        for (RuntimeNode runtimeNode2 : runtimeNode.getChildren()) {
            if (StringsKt.K(runtimeNode2.getPath(), path, false, 2, null)) {
                invokeRecursively(runtimeNode2, callback);
            }
        }
    }
}
