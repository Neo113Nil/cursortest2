package com.yandex.div.core.view2.divs.tabs;

import O1.C0892k0;
import O1.Z;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.ScrollableViewPager;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivTabsAdapter extends BaseDivTabbedCardUi<DivSimpleTab, ViewGroup, C0892k0> {

    @NotNull
    private final DivTabsActiveStateTracker activeStateTracker;

    @NotNull
    private BindingContext bindingContext;

    @NotNull
    private final Map<Integer, DivStatePath> childStates;

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final DivTabsEventManager divTabsEventManager;
    private final boolean isDynamicHeight;

    @NotNull
    private final PagerController pager;

    @NotNull
    private DivStatePath path;

    @NotNull
    private final Map<ViewGroup, TabModel> tabModels;

    @NotNull
    private final View view;

    @NotNull
    private final DivViewCreator viewCreator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivTabsAdapter(@NotNull ViewPool viewPool, @NotNull View view, @NotNull BaseDivTabbedCardUi.TabbedCardConfig tabbedCardConfig, @NotNull HeightCalculatorFactory heightCalculatorFactory, boolean z4, @NotNull BindingContext bindingContext, @NotNull TabTextStyleProvider textStyleProvider, @NotNull DivViewCreator viewCreator, @NotNull DivBinder divBinder, @NotNull DivTabsEventManager divTabsEventManager, @NotNull DivTabsActiveStateTracker activeStateTracker, @NotNull DivStatePath path, @NotNull DivPatchCache divPatchCache) {
        super(viewPool, view, tabbedCardConfig, heightCalculatorFactory, textStyleProvider, divTabsEventManager, divTabsEventManager, activeStateTracker);
        Intrinsics.checkNotNullParameter(viewPool, "viewPool");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tabbedCardConfig, "tabbedCardConfig");
        Intrinsics.checkNotNullParameter(heightCalculatorFactory, "heightCalculatorFactory");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(textStyleProvider, "textStyleProvider");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        Intrinsics.checkNotNullParameter(divTabsEventManager, "divTabsEventManager");
        Intrinsics.checkNotNullParameter(activeStateTracker, "activeStateTracker");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(divPatchCache, "divPatchCache");
        this.view = view;
        this.isDynamicHeight = z4;
        this.bindingContext = bindingContext;
        this.viewCreator = viewCreator;
        this.divBinder = divBinder;
        this.divTabsEventManager = divTabsEventManager;
        this.activeStateTracker = activeStateTracker;
        this.path = path;
        this.divPatchCache = divPatchCache;
        this.tabModels = new LinkedHashMap();
        this.childStates = new LinkedHashMap();
        ScrollableViewPager mPager = this.mPager;
        Intrinsics.checkNotNullExpressionValue(mPager, "mPager");
        this.pager = new PagerController(mPager);
    }

    private final View createItemView(Z z4, ExpressionResolver expressionResolver, int i4) {
        View create = this.viewCreator.create(z4, expressionResolver);
        create.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.divBinder.bind(this.bindingContext, create, z4, getChildPath(i4, z4));
        return create;
    }

    private final DivStatePath getChildPath(int i4, Z z4) {
        Map<Integer, DivStatePath> map = this.childStates;
        Integer valueOf = Integer.valueOf(i4);
        DivStatePath divStatePath = map.get(valueOf);
        if (divStatePath == null) {
            divStatePath = BaseDivViewExtensionsKt.resolvePath(z4.b(), i4, this.path);
            map.put(valueOf, divStatePath);
        }
        return divStatePath;
    }

    @Nullable
    public final Z.q applyPatch(@NotNull ExpressionResolver resolver, @NotNull Z.q div) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(div, "div");
        this.divPatchCache.getPatch(this.bindingContext.getDivView().getDataTag());
        return null;
    }

    @NotNull
    public final DivTabsActiveStateTracker getActiveStateTracker() {
        return this.activeStateTracker;
    }

    @NotNull
    public final DivTabsEventManager getDivTabsEventManager() {
        return this.divTabsEventManager;
    }

    @NotNull
    public final PagerController getPager() {
        return this.pager;
    }

    public final boolean isDynamicHeight() {
        return this.isDynamicHeight;
    }

    public final void notifyStateChanged() {
        for (Map.Entry<ViewGroup, TabModel> entry : this.tabModels.entrySet()) {
            ViewGroup key = entry.getKey();
            TabModel value = entry.getValue();
            this.divBinder.bind(this.bindingContext, value.getView(), value.getDiv(), getChildPath(value.getIndex(), value.getDiv()));
            key.requestLayout();
        }
    }

    public final void setBindingContext(@NotNull BindingContext bindingContext) {
        Intrinsics.checkNotNullParameter(bindingContext, "<set-?>");
        this.bindingContext = bindingContext;
    }

    public final void setData(@NotNull BaseDivTabbedCardUi.Input<DivSimpleTab> data, int i4) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.setData(data, this.bindingContext.getExpressionResolver(), ReleasablesKt.getExpressionSubscriber(this.view));
        this.tabModels.clear();
        this.mPager.setCurrentItem(i4, true);
    }

    public final void setStatePath(@NotNull DivStatePath value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.path = value;
        this.childStates.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    @NotNull
    public ViewGroup bindTabData(@NotNull ViewGroup tabView, @NotNull DivSimpleTab tab, int i4) {
        Intrinsics.checkNotNullParameter(tabView, "tabView");
        Intrinsics.checkNotNullParameter(tab, "tab");
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(tabView, this.bindingContext.getDivView());
        Z z4 = tab.getItem().f7643a;
        View createItemView = createItemView(z4, this.bindingContext.getExpressionResolver(), i4);
        this.tabModels.put(tabView, new TabModel(i4, z4, createItemView));
        tabView.addView(createItemView);
        return tabView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    public void unbindTabData(@NotNull ViewGroup tabView) {
        Intrinsics.checkNotNullParameter(tabView, "tabView");
        this.tabModels.remove(tabView);
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(tabView, this.bindingContext.getDivView());
    }
}
