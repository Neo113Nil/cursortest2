package com.yandex.div.core.view2.divs;

import O1.Z;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.reuse.util.RebindUtilsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivCollectionViewHolder extends RecyclerView.E {

    @NotNull
    private final Map<String, DivStatePath> childrenPaths;

    @NotNull
    private final DivBinder divBinder;

    @Nullable
    private Z oldDiv;

    @NotNull
    private final BindingContext parentContext;

    @NotNull
    private final DivStatePath path;

    @NotNull
    private final DivViewCreator viewCreator;

    @NotNull
    private final DivViewWrapper viewWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivCollectionViewHolder(@NotNull DivViewWrapper viewWrapper, @NotNull BindingContext parentContext, @NotNull DivBinder divBinder, @NotNull DivViewCreator viewCreator, @NotNull DivStatePath path) {
        super(viewWrapper);
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(path, "path");
        this.viewWrapper = viewWrapper;
        this.parentContext = parentContext;
        this.divBinder = divBinder;
        this.viewCreator = viewCreator;
        this.path = path;
        this.childrenPaths = new LinkedHashMap();
    }

    private final View createChildView(BindingContext bindingContext, Z z4) {
        if (this.oldDiv != null) {
            logReuseError();
        }
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this.viewWrapper, bindingContext.getDivView());
        View create = this.viewCreator.create(z4, bindingContext.getExpressionResolver());
        this.viewWrapper.addView(create);
        return create;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r9 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void bind(@NotNull BindingContext bindingContext, @NotNull Z div, int i4) {
        Z z4;
        View view;
        BindingContext bindingContext2;
        ExpressionResolver expressionResolver;
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        ExpressionResolver expressionResolver2 = bindingContext.getExpressionResolver();
        if (RebindUtilsKt.tryRebindRecycleContainerChildren(this.viewWrapper, bindingContext.getDivView(), div)) {
            this.oldDiv = div;
            return;
        }
        View child = this.viewWrapper.getChild();
        if (child != null) {
            view = null;
            if (this.oldDiv == null) {
                child = null;
            }
            if (child != null) {
                DivHolderView divHolderView = child instanceof DivHolderView ? (DivHolderView) child : null;
                if (divHolderView == null || (bindingContext2 = divHolderView.getBindingContext()) == null || (expressionResolver = bindingContext2.getExpressionResolver()) == null) {
                    z4 = div;
                } else {
                    z4 = div;
                    if (DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, this.oldDiv, z4, expressionResolver, expressionResolver2, null, 16, null)) {
                        view = child;
                    }
                }
            }
        }
        z4 = div;
        view = createChildView(bindingContext, z4);
        this.oldDiv = z4;
        String childPathUnit = BaseDivViewExtensionsKt.getChildPathUnit(z4.b(), i4);
        Map<String, DivStatePath> map = this.childrenPaths;
        DivStatePath divStatePath = map.get(childPathUnit);
        if (divStatePath == null) {
            divStatePath = this.path.appendDiv(childPathUnit);
            map.put(childPathUnit, divStatePath);
        }
        DivStatePath divStatePath2 = divStatePath;
        RuntimeStore runtimeStore = bindingContext.getRuntimeStore();
        if (runtimeStore != null) {
            Z z5 = z4;
            runtimeStore.resolveRuntimeWith$div_release(bindingContext.getDivView(), divStatePath2.getFullPath$div_release(), z5, expressionResolver2, this.parentContext.getExpressionResolver());
            z4 = z5;
        }
        this.divBinder.bind(bindingContext, view, z4, divStatePath2);
        RuntimeStore runtimeStore2 = bindingContext.getRuntimeStore();
        if (runtimeStore2 != null) {
            runtimeStore2.showWarningIfNeeded$div_release(z4.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final Z getOldDiv() {
        return this.oldDiv;
    }

    protected abstract void logReuseError();

    public final void updateState() {
        BindingContext bindingContext;
        View child = this.viewWrapper.getChild();
        if (child == null || (bindingContext = BaseDivViewExtensionsKt.getBindingContext(child)) == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindStates(child, bindingContext, this.divBinder);
    }
}
