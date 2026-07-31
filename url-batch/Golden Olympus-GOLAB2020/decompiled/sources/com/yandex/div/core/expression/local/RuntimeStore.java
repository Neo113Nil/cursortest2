package com.yandex.div.core.expression.local;

import O1.C1165z4;
import O1.InterfaceC0752c3;
import O1.Z;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class RuntimeStore {

    @NotNull
    private final ObserverList<ExpressionsRuntime> allRuntimes;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Map<String, ExpressionResolver> itemBuilderResolvers;

    @NotNull
    private final Map<String, ExpressionsRuntime> pathToRuntime;

    @NotNull
    private final Map<ExpressionResolver, ExpressionsRuntime> resolverToRuntime;

    @NotNull
    private final ExpressionsRuntime rootRuntime;

    @NotNull
    private final ExpressionsRuntimeProvider runtimeProvider;

    @NotNull
    private final RuntimeTree tree;
    private boolean warningShown;

    public RuntimeStore(@NotNull C1165z4 data, @NotNull ExpressionsRuntimeProvider runtimeProvider, @NotNull ErrorCollector errorCollector) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(runtimeProvider, "runtimeProvider");
        Intrinsics.checkNotNullParameter(errorCollector, "errorCollector");
        this.runtimeProvider = runtimeProvider;
        this.errorCollector = errorCollector;
        this.resolverToRuntime = new LinkedHashMap();
        this.pathToRuntime = new LinkedHashMap();
        this.allRuntimes = new ObserverList<>();
        this.tree = new RuntimeTree();
        this.itemBuilderResolvers = new LinkedHashMap();
        ExpressionsRuntime createRootRuntime = runtimeProvider.createRootRuntime(data, errorCollector, this);
        putRuntime$div_release(createRootRuntime, "", null);
        this.rootRuntime = createRootRuntime;
    }

    private final boolean getNeedLocalRuntime(Z z4) {
        List o4;
        List r4;
        InterfaceC0752c3 b4 = z4.b();
        List f4 = b4.f();
        return !((f4 == null || f4.isEmpty()) && ((o4 = b4.o()) == null || o4.isEmpty()) && ((r4 = b4.r()) == null || r4.isEmpty()));
    }

    private final void reportParentRuntimeError(String str) {
        L l4 = L.f41137a;
        String format = String.format("Parent runtime for path '%s' is not stored.", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail(format);
        }
        this.errorCollector.logError(new AssertionError(format));
    }

    public final void cleanup$div_release(@NotNull DivViewFacade divView) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        this.warningShown = false;
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().cleanup$div_release(divView);
        }
    }

    public final void clearBindings$div_release(@NotNull DivViewFacade divView) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().clearBinding(divView);
        }
    }

    @NotNull
    public final ExpressionsRuntime getOrCreateRuntime$div_release(@NotNull String path, @NotNull Z div, @NotNull ExpressionResolver parentResolver) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(parentResolver, "parentResolver");
        ExpressionsRuntime expressionsRuntime = this.pathToRuntime.get(path);
        if (expressionsRuntime != null) {
            return expressionsRuntime;
        }
        if (!(parentResolver instanceof ExpressionResolverImpl)) {
            return this.rootRuntime;
        }
        ExpressionsRuntime runtimeWithOrNull$div_release = getRuntimeWithOrNull$div_release(parentResolver);
        if (runtimeWithOrNull$div_release == null) {
            reportParentRuntimeError(path);
            return this.rootRuntime;
        }
        if (!getNeedLocalRuntime(div)) {
            this.pathToRuntime.put(path, runtimeWithOrNull$div_release);
            return runtimeWithOrNull$div_release;
        }
        ExpressionsRuntime createChildRuntime = this.runtimeProvider.createChildRuntime(path, div.b(), (ExpressionResolverImpl) parentResolver, this.errorCollector);
        putRuntime$div_release(createChildRuntime, path, runtimeWithOrNull$div_release);
        return createChildRuntime;
    }

    @NotNull
    public final ExpressionResolver getOrPutItemBuilderResolver(@NotNull String path, @NotNull ExpressionResolver parentResolver, @NotNull Function0<? extends ExpressionResolver> createResolver) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(parentResolver, "parentResolver");
        Intrinsics.checkNotNullParameter(createResolver, "createResolver");
        Map<String, ExpressionResolver> map = this.itemBuilderResolvers;
        ExpressionResolver expressionResolver = map.get(path);
        if (expressionResolver == null) {
            expressionResolver = (ExpressionResolver) createResolver.invoke();
            ExpressionsRuntime runtimeWithOrNull$div_release = getRuntimeWithOrNull$div_release(parentResolver);
            if (runtimeWithOrNull$div_release != null) {
                this.resolverToRuntime.put(expressionResolver, runtimeWithOrNull$div_release);
            }
            map.put(path, expressionResolver);
        }
        return expressionResolver;
    }

    @NotNull
    public final ExpressionsRuntime getRootRuntime() {
        return this.rootRuntime;
    }

    @Nullable
    public final ExpressionsRuntime getRuntimeWithOrNull$div_release(@NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return this.resolverToRuntime.get(resolver);
    }

    @NotNull
    public final RuntimeTree getTree$div_release() {
        return this.tree;
    }

    @NotNull
    public final Map<String, ExpressionsRuntime> getUniquePathsAndRuntimes$div_release() {
        return this.tree.getPathToRuntimes();
    }

    public final void putRuntime$div_release(@NotNull ExpressionsRuntime runtime, @NotNull String path, @Nullable ExpressionsRuntime expressionsRuntime) {
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        Intrinsics.checkNotNullParameter(path, "path");
        this.pathToRuntime.put(path, runtime);
        this.resolverToRuntime.put(runtime.getExpressionResolver(), runtime);
        this.allRuntimes.addObserver(runtime);
        this.tree.storeRuntime(runtime, expressionsRuntime, path);
        runtime.updateSubscriptions();
    }

    @Nullable
    public final ExpressionsRuntime resolveRuntimeWith$div_release(@Nullable DivViewFacade divViewFacade, @NotNull String path, @NotNull Z div, @NotNull ExpressionResolver resolver, @NotNull ExpressionResolver parentResolver) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(parentResolver, "parentResolver");
        ExpressionsRuntime expressionsRuntime = this.pathToRuntime.get(path);
        if (expressionsRuntime != null && (Intrinsics.areEqual(resolver, expressionsRuntime.getExpressionResolver()) || getNeedLocalRuntime(div))) {
            return expressionsRuntime;
        }
        if (expressionsRuntime != null) {
            this.tree.removeRuntimeAndCleanup(divViewFacade, expressionsRuntime, path);
        }
        if (!(resolver instanceof ExpressionResolverImpl)) {
            return null;
        }
        ExpressionsRuntime runtimeWithOrNull$div_release = getRuntimeWithOrNull$div_release(parentResolver);
        if (runtimeWithOrNull$div_release == null) {
            reportParentRuntimeError(path);
            return null;
        }
        if (getNeedLocalRuntime(div)) {
            ExpressionsRuntime createChildRuntime = this.runtimeProvider.createChildRuntime(path, div.b(), (ExpressionResolverImpl) resolver, this.errorCollector);
            putRuntime$div_release(createChildRuntime, path, runtimeWithOrNull$div_release);
            return createChildRuntime;
        }
        if (Intrinsics.areEqual(resolver, parentResolver)) {
            this.pathToRuntime.put(path, runtimeWithOrNull$div_release);
            return runtimeWithOrNull$div_release;
        }
        ExpressionsRuntime expressionsRuntime2 = new ExpressionsRuntime((ExpressionResolverImpl) resolver, null);
        putRuntime$div_release(expressionsRuntime2, path, runtimeWithOrNull$div_release);
        return expressionsRuntime2;
    }

    public final void showWarningIfNeeded$div_release(@NotNull InterfaceC0752c3 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.warningShown || child.f() == null) {
            return;
        }
        this.warningShown = true;
        this.errorCollector.logWarning(new Throwable("You are using local variables. Please ensure that all elements that use local variables and all of their parents recursively have an 'id' attribute."));
    }

    public final void updateSubscriptions$div_release() {
        Iterator<ExpressionsRuntime> it = this.allRuntimes.iterator();
        while (it.hasNext()) {
            it.next().updateSubscriptions();
        }
    }
}
