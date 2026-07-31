package com.yandex.div.internal.core;

import O1.Z;
import W1.m;
import W1.q;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivTreeVisitor<T> {

    @Nullable
    private final Function1<T, Boolean> returnCondition;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTreeVisitor(@Nullable Function1<? super T, Boolean> function1) {
        this.returnCondition = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<q> mapDivWithContext(List<? extends Z> list, BindingContext bindingContext, DivStatePath divStatePath) {
        List<? extends Z> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i4 = 0;
        for (T t4 : list2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Z z4 = (Z) t4;
            arrayList.add(new q(z4, bindingContext, BaseDivViewExtensionsKt.resolvePath(z4.b(), i4, divStatePath)));
            i4 = i5;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<q> mapItemWithContext(List<DivItemBuilderResult> list, BindingContext bindingContext, DivStatePath divStatePath) {
        ExpressionResolverImpl expressionResolver;
        RuntimeStore runtimeStore;
        List<DivItemBuilderResult> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i4 = 0;
        for (T t4 : list2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) t4;
            Z div = divItemBuilderResult.getDiv();
            DivStatePath resolvePath = BaseDivViewExtensionsKt.resolvePath(div.b(), i4, divStatePath);
            ExpressionResolver expressionResolver2 = divItemBuilderResult.getExpressionResolver();
            ExpressionResolverImpl asImpl = UtilsKt.getAsImpl(expressionResolver2);
            ExpressionsRuntime resolveRuntimeWith$div_release = (asImpl == null || (runtimeStore = asImpl.getRuntimeStore()) == null) ? null : runtimeStore.resolveRuntimeWith$div_release(bindingContext.getDivView(), resolvePath.getFullPath$div_release(), div, expressionResolver2, bindingContext.getExpressionResolver());
            if (resolveRuntimeWith$div_release != null && (expressionResolver = resolveRuntimeWith$div_release.getExpressionResolver()) != null) {
                expressionResolver2 = expressionResolver;
            }
            arrayList.add(new q(div, bindingContext.getFor(expressionResolver2), resolvePath));
            i4 = i5;
        }
        return arrayList;
    }

    protected abstract T defaultVisit(@NotNull Z z4, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath);

    protected T defaultVisitCollection(@NotNull Z data, @NotNull BindingContext context, @NotNull DivStatePath path, @NotNull Function0<? extends List<? extends q>> items) {
        Function1<T, Boolean> function1;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(items, "items");
        T defaultVisit = defaultVisit(data, context, path);
        Function1<T, Boolean> function12 = this.returnCondition;
        if (function12 != null && ((Boolean) function12.invoke(defaultVisit)).booleanValue()) {
            return defaultVisit;
        }
        for (q qVar : (Iterable) items.invoke()) {
            T visit = visit((Z) qVar.c(), (BindingContext) qVar.d(), (DivStatePath) qVar.e());
            if (visit != null && (function1 = this.returnCondition) != null && ((Boolean) function1.invoke(visit)).booleanValue()) {
                return visit;
            }
        }
        return defaultVisit;
    }

    protected final T visit(@NotNull Z div, @NotNull BindingContext parentContext, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(path, "path");
        BindingContext childContext = DivTreeVisitorKt.getChildContext(parentContext, div, path);
        if (div instanceof Z.r) {
            return visit((Z.r) div, childContext, path);
        }
        if (div instanceof Z.h) {
            return visit((Z.h) div, childContext, path);
        }
        if (div instanceof Z.f) {
            return visit((Z.f) div, childContext, path);
        }
        if (div instanceof Z.m) {
            return visit((Z.m) div, childContext, path);
        }
        if (div instanceof Z.c) {
            return visit((Z.c) div, childContext, path);
        }
        if (div instanceof Z.g) {
            return visit((Z.g) div, childContext, path);
        }
        if (div instanceof Z.e) {
            return visit((Z.e) div, childContext, path);
        }
        if (div instanceof Z.k) {
            return visit((Z.k) div, childContext, path);
        }
        if (div instanceof Z.q) {
            return visit((Z.q) div, childContext, path);
        }
        if (div instanceof Z.o) {
            return visit((Z.o) div, childContext, path);
        }
        if (div instanceof Z.d) {
            return visit((Z.d) div, childContext, path);
        }
        if (div instanceof Z.i) {
            return visit((Z.i) div, childContext, path);
        }
        if (div instanceof Z.n) {
            return visit((Z.n) div, childContext, path);
        }
        if (div instanceof Z.j) {
            return visit((Z.j) div, childContext, path);
        }
        if (div instanceof Z.l) {
            return visit((Z.l) div, childContext, path);
        }
        if (div instanceof Z.s) {
            return visit((Z.s) div, childContext, path);
        }
        if (div instanceof Z.p) {
            return visit((Z.p) div, childContext, path);
        }
        throw new m();
    }

    public /* synthetic */ DivTreeVisitor(Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : function1);
    }

    protected T visit(@NotNull Z.c data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisitCollection(data, context, path, new DivTreeVisitor$visit$1(this, data, context, path));
    }

    protected T visit(@NotNull Z.g data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisitCollection(data, context, path, new DivTreeVisitor$visit$2(this, data, context, path));
    }

    protected T visit(@NotNull Z.e data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisitCollection(data, context, path, new DivTreeVisitor$visit$3(this, data, context, path));
    }

    protected T visit(@NotNull Z.k data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisitCollection(data, context, path, new DivTreeVisitor$visit$4(this, data, context, path));
    }

    protected T visit(@NotNull Z.q data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisitCollection(data, context, path, new DivTreeVisitor$visit$5(data, context, path));
    }

    protected T visit(@NotNull Z.o data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisitCollection(data, context, path, new DivTreeVisitor$visit$6(data, context, path));
    }

    protected T visit(@NotNull Z.d data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisitCollection(data, context, path, new DivTreeVisitor$visit$7(this, data, context, path));
    }

    protected T visit(@NotNull Z.r data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Z.h data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Z.f data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Z.m data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Z.i data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Z.n data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Z.j data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Z.l data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Z.s data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisit(data, context, path);
    }

    protected T visit(@NotNull Z.p data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        return defaultVisit(data, context, path);
    }
}
