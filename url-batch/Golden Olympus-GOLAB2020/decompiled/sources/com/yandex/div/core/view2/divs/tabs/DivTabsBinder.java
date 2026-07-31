package com.yandex.div.core.view2.divs.tabs;

import O1.C0735b4;
import O1.C0754c5;
import O1.C1013qd;
import O1.EnumC0779dc;
import O1.S5;
import O1.Z;
import V1.a;
import W1.m;
import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.b;
import com.yandex.div.DivDataTag;
import com.yandex.div.R$id;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.DynamicCardHeightCalculator;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.MaxCardHeightCalculator;
import com.yandex.div.internal.widget.tabs.TabItemLayout;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivTabsBinder extends DivViewBinder<Z.q, C1013qd, DivTabsLayout> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final C1013qd.e DEFAULT_TAB_TITLE_STYLE = new C1013qd.e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);

    @NotNull
    private final DivActionBinder actionBinder;

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final Context context;

    @NotNull
    private final Div2Logger div2Logger;

    @NotNull
    private final a divBinder;

    @NotNull
    private final DivPatchCache divPatchCache;

    @NotNull
    private final DivImageLoader imageLoader;

    @Nullable
    private Long oldDivSelectedTab;

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final TabsStateCache tabsStateCache;

    @NotNull
    private final TabTextStyleProvider textStyleProvider;

    @NotNull
    private final DivViewCreator viewCreator;

    @NotNull
    private final ViewPool viewPool;

    @NotNull
    private final DivVisibilityActionTracker visibilityActionTracker;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C1013qd.e.a.values().length];
            try {
                iArr[C1013qd.e.a.SLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1013qd.e.a.FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1013qd.e.a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivTabsBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivViewCreator viewCreator, @NotNull a divBinder, @NotNull ViewPool viewPool, @NotNull TabTextStyleProvider textStyleProvider, @NotNull DivActionBinder actionBinder, @NotNull Div2Logger div2Logger, @NotNull DivImageLoader imageLoader, @NotNull DivVisibilityActionTracker visibilityActionTracker, @NotNull DivPatchCache divPatchCache, @NotNull Context context, @NotNull DivRuntimeVisitor runtimeVisitor, @NotNull TabsStateCache tabsStateCache) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        Intrinsics.checkNotNullParameter(viewPool, "viewPool");
        Intrinsics.checkNotNullParameter(textStyleProvider, "textStyleProvider");
        Intrinsics.checkNotNullParameter(actionBinder, "actionBinder");
        Intrinsics.checkNotNullParameter(div2Logger, "div2Logger");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(visibilityActionTracker, "visibilityActionTracker");
        Intrinsics.checkNotNullParameter(divPatchCache, "divPatchCache");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runtimeVisitor, "runtimeVisitor");
        Intrinsics.checkNotNullParameter(tabsStateCache, "tabsStateCache");
        this.baseBinder = baseBinder;
        this.viewCreator = viewCreator;
        this.divBinder = divBinder;
        this.viewPool = viewPool;
        this.textStyleProvider = textStyleProvider;
        this.actionBinder = actionBinder;
        this.div2Logger = div2Logger;
        this.imageLoader = imageLoader;
        this.visibilityActionTracker = visibilityActionTracker;
        this.divPatchCache = divPatchCache;
        this.context = context;
        this.runtimeVisitor = runtimeVisitor;
        this.tabsStateCache = tabsStateCache;
        viewPool.register("DIV2.TAB_HEADER_VIEW", new TabTitlesLayoutView.TabViewFactory(context), 12);
        viewPool.register("DIV2.TAB_ITEM_VIEW", new ViewFactory() { // from class: z1.c
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                TabItemLayout _init_$lambda$0;
                _init_$lambda$0 = DivTabsBinder._init_$lambda$0(DivTabsBinder.this);
                return _init_$lambda$0;
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabItemLayout _init_$lambda$0(DivTabsBinder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new TabItemLayout(this$0.context, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyDelimiterStyle(final TabTitlesLayoutView<?> tabTitlesLayoutView, ExpressionResolver expressionResolver, C1013qd.d dVar, BindingContext bindingContext) {
        DisplayMetrics metrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        S5 s5 = dVar.f7654c;
        long longValue = ((Number) s5.f4715b.evaluate(expressionResolver)).longValue();
        EnumC0779dc enumC0779dc = (EnumC0779dc) s5.f4714a.evaluate(expressionResolver);
        Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
        final int px = BaseDivViewExtensionsKt.toPx(longValue, enumC0779dc, metrics);
        S5 s52 = dVar.f7652a;
        final int px2 = BaseDivViewExtensionsKt.toPx(((Number) s52.f4715b.evaluate(expressionResolver)).longValue(), (EnumC0779dc) s52.f4714a.evaluate(expressionResolver), metrics);
        DivImageLoader divImageLoader = this.imageLoader;
        String uri = ((Uri) dVar.f7653b.evaluate(expressionResolver)).toString();
        final Div2View divView = bindingContext.getDivView();
        LoadReference loadImage = divImageLoader.loadImage(uri, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$applyDelimiterStyle$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                tabTitlesLayoutView.setTabDelimiter(null, 0, 0);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                Intrinsics.checkNotNullParameter(cachedBitmap, "cachedBitmap");
                super.onSuccess(cachedBitmap);
                tabTitlesLayoutView.setTabDelimiter(cachedBitmap.getBitmap(), px, px2);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
                Intrinsics.checkNotNullParameter(pictureDrawable, "pictureDrawable");
                super.onSuccess(pictureDrawable);
                tabTitlesLayoutView.setTabDelimiter(b.b(pictureDrawable, 0, 0, null, 7, null), px, px2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(loadImage, "TabTitlesLayoutView<*>.a…}\n            }\n        )");
        bindingContext.getDivView().addLoadReference(loadImage, tabTitlesLayoutView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStyle(TabTitlesLayoutView<?> tabTitlesLayoutView, ExpressionResolver expressionResolver, C1013qd.e eVar) {
        BaseIndicatorTabLayout.AnimationType animationType;
        int intValue = ((Number) eVar.f7673d.evaluate(expressionResolver)).intValue();
        int intValue2 = ((Number) eVar.f7670a.evaluate(expressionResolver)).intValue();
        int intValue3 = ((Number) eVar.f7685p.evaluate(expressionResolver)).intValue();
        Expression expression = eVar.f7682m;
        tabTitlesLayoutView.setTabColors(intValue, intValue2, intValue3, expression != null ? ((Number) expression.evaluate(expressionResolver)).intValue() : 0);
        DisplayMetrics metrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
        tabTitlesLayoutView.setTabIndicatorCornersRadii(getCornerRadii(eVar, metrics, expressionResolver));
        tabTitlesLayoutView.setTabItemSpacing(BaseDivViewExtensionsKt.dpToPx((Long) eVar.f7686q.evaluate(expressionResolver), metrics));
        int i4 = WhenMappings.$EnumSwitchMapping$0[((C1013qd.e.a) eVar.f7675f.evaluate(expressionResolver)).ordinal()];
        if (i4 == 1) {
            animationType = BaseIndicatorTabLayout.AnimationType.SLIDE;
        } else if (i4 == 2) {
            animationType = BaseIndicatorTabLayout.AnimationType.FADE;
        } else {
            if (i4 != 3) {
                throw new m();
            }
            animationType = BaseIndicatorTabLayout.AnimationType.NONE;
        }
        tabTitlesLayoutView.setAnimationType(animationType);
        tabTitlesLayoutView.setAnimationDuration(((Number) eVar.f7674e.evaluate(expressionResolver)).longValue());
        tabTitlesLayoutView.setTabTitleStyle(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(DivTabsBinder this$0, BindingContext bindingContext) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bindingContext, "$bindingContext");
        this$0.div2Logger.logTabTitlesScroll(bindingContext.getDivView());
    }

    private final void bindAdapter(DivStatePath divStatePath, BindingContext bindingContext, DivTabsLayout divTabsLayout, C1013qd c1013qd, C1013qd c1013qd2, DivBinder divBinder, ExpressionSubscriber expressionSubscriber) {
        DivTabsAdapter tryReuse;
        int i4;
        DivTabsBinder divTabsBinder;
        DivTabsLayout divTabsLayout2;
        Long l4;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<C1013qd.c> list = c1013qd2.f7630q;
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (C1013qd.c cVar : list) {
            DisplayMetrics displayMetrics = divTabsLayout.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "view.resources.displayMetrics");
            arrayList.add(new DivSimpleTab(cVar, displayMetrics, expressionResolver));
        }
        tryReuse = DivTabsBinderKt.tryReuse(divTabsLayout.getDivTabsAdapter(), c1013qd2, expressionResolver);
        if (tryReuse != null) {
            tryReuse.setBindingContext(bindingContext);
            tryReuse.setStatePath(divStatePath);
            tryReuse.getDivTabsEventManager().setDiv(c1013qd2);
            tryReuse.getActiveStateTracker().setDiv(c1013qd2);
            if (c1013qd == c1013qd2) {
                tryReuse.notifyStateChanged();
            } else {
                tryReuse.setData(new BaseDivTabbedCardUi.Input() { // from class: z1.b
                    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
                    public final List getTabs() {
                        List bindAdapter$lambda$5;
                        bindAdapter$lambda$5 = DivTabsBinder.bindAdapter$lambda$5(arrayList);
                        return bindAdapter$lambda$5;
                    }
                }, expressionResolver, expressionSubscriber);
            }
            divTabsBinder = this;
            divTabsLayout2 = divTabsLayout;
        } else {
            long longValue = ((Number) c1013qd2.f7638y.evaluate(expressionResolver)).longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i4 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            int i5 = i4;
            divTabsBinder = this;
            bindAdapter$setupNewAdapter(divTabsBinder, bindingContext, c1013qd2, divTabsLayout, divBinder, divStatePath, arrayList, i5);
            divTabsLayout2 = divTabsLayout;
        }
        DivTabsBinderKt.observeFixedHeightChange(c1013qd2.f7630q, expressionResolver, expressionSubscriber, new DivTabsBinder$bindAdapter$2(divTabsLayout2));
        DivTabsBinder$bindAdapter$selectTab$1 divTabsBinder$bindAdapter$selectTab$1 = new DivTabsBinder$bindAdapter$selectTab$1(divTabsBinder, divTabsLayout2);
        expressionSubscriber.addSubscription(c1013qd2.f7623j.observe(expressionResolver, new DivTabsBinder$bindAdapter$3(divTabsLayout2, c1013qd2, expressionResolver, this, bindingContext, divBinder, divStatePath, arrayList)));
        expressionSubscriber.addSubscription(c1013qd2.f7638y.observe(expressionResolver, divTabsBinder$bindAdapter$selectTab$1));
        Div2View divView = bindingContext.getDivView();
        boolean z4 = Intrinsics.areEqual(divView.getPrevDataTag(), DivDataTag.INVALID) || Intrinsics.areEqual(divView.getDataTag(), divView.getPrevDataTag());
        long longValue2 = ((Number) c1013qd2.f7638y.evaluate(expressionResolver)).longValue();
        if (!z4 || (l4 = this.oldDivSelectedTab) == null || l4.longValue() != longValue2) {
            divTabsBinder$bindAdapter$selectTab$1.invoke(Long.valueOf(longValue2));
        }
        expressionSubscriber.addSubscription(c1013qd2.f7596B.observeAndGet(expressionResolver, new DivTabsBinder$bindAdapter$4(divTabsLayout2, this, c1013qd2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List bindAdapter$lambda$5(List list) {
        Intrinsics.checkNotNullParameter(list, "$list");
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindAdapter$setupNewAdapter(DivTabsBinder divTabsBinder, BindingContext bindingContext, C1013qd c1013qd, DivTabsLayout divTabsLayout, DivBinder divBinder, DivStatePath divStatePath, final List<DivSimpleTab> list, int i4) {
        DivTabsAdapter createAdapter = divTabsBinder.createAdapter(bindingContext, c1013qd, divTabsLayout, divBinder, divStatePath);
        createAdapter.setData(new BaseDivTabbedCardUi.Input() { // from class: z1.d
            @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
            public final List getTabs() {
                List bindAdapter$setupNewAdapter$lambda$4;
                bindAdapter$setupNewAdapter$lambda$4 = DivTabsBinder.bindAdapter$setupNewAdapter$lambda$4(list);
                return bindAdapter$setupNewAdapter$lambda$4;
            }
        }, i4);
        divTabsLayout.setDivTabsAdapter(createAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List bindAdapter$setupNewAdapter$lambda$4(List list) {
        Intrinsics.checkNotNullParameter(list, "$list");
        return list;
    }

    private final DivTabsAdapter createAdapter(BindingContext bindingContext, C1013qd c1013qd, DivTabsLayout divTabsLayout, DivBinder divBinder, DivStatePath divStatePath) {
        DivTabsEventManager divTabsEventManager = new DivTabsEventManager(bindingContext, this.actionBinder, this.div2Logger, this.visibilityActionTracker, divTabsLayout, c1013qd);
        boolean booleanValue = ((Boolean) c1013qd.f7623j.evaluate(bindingContext.getExpressionResolver())).booleanValue();
        HeightCalculatorFactory heightCalculatorFactory = booleanValue ? new HeightCalculatorFactory() { // from class: z1.e
            @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory
            public final ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(ViewGroup viewGroup, HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
                return new DynamicCardHeightCalculator(viewGroup, measureTabHeightFn, getTabCountFn);
            }
        } : new HeightCalculatorFactory() { // from class: z1.f
            @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory
            public final ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(ViewGroup viewGroup, HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
                return new MaxCardHeightCalculator(viewGroup, measureTabHeightFn, getTabCountFn);
            }
        };
        int currentItem = divTabsLayout.getViewPager().getCurrentItem();
        int currentItem2 = divTabsLayout.getViewPager().getCurrentItem();
        if (currentItem2 == currentItem) {
            UiThreadHandler.INSTANCE.postOnMainThread(new DivTabsBinder$createAdapter$1(divTabsEventManager, currentItem2));
        }
        return new DivTabsAdapter(this.viewPool, divTabsLayout, getTabbedCardLayoutIds(), heightCalculatorFactory, booleanValue, bindingContext, this.textStyleProvider, this.viewCreator, divBinder, divTabsEventManager, new DivTabsActiveStateTracker(bindingContext, divStatePath, this.div2Logger, this.tabsStateCache, this.runtimeVisitor, c1013qd), divStatePath, this.divPatchCache);
    }

    private final float[] getCornerRadii(C1013qd.e eVar, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5 = eVar.f7676g;
        float cornerRadii$toCornerRadii = expression5 != null ? getCornerRadii$toCornerRadii(expression5, expressionResolver, displayMetrics) : eVar.f7677h == null ? -1.0f : 0.0f;
        C0735b4 c0735b4 = eVar.f7677h;
        float cornerRadii$toCornerRadii2 = (c0735b4 == null || (expression4 = c0735b4.f5779c) == null) ? cornerRadii$toCornerRadii : getCornerRadii$toCornerRadii(expression4, expressionResolver, displayMetrics);
        C0735b4 c0735b42 = eVar.f7677h;
        float cornerRadii$toCornerRadii3 = (c0735b42 == null || (expression3 = c0735b42.f5780d) == null) ? cornerRadii$toCornerRadii : getCornerRadii$toCornerRadii(expression3, expressionResolver, displayMetrics);
        C0735b4 c0735b43 = eVar.f7677h;
        float cornerRadii$toCornerRadii4 = (c0735b43 == null || (expression2 = c0735b43.f5777a) == null) ? cornerRadii$toCornerRadii : getCornerRadii$toCornerRadii(expression2, expressionResolver, displayMetrics);
        C0735b4 c0735b44 = eVar.f7677h;
        if (c0735b44 != null && (expression = c0735b44.f5778b) != null) {
            cornerRadii$toCornerRadii = getCornerRadii$toCornerRadii(expression, expressionResolver, displayMetrics);
        }
        return new float[]{cornerRadii$toCornerRadii2, cornerRadii$toCornerRadii2, cornerRadii$toCornerRadii3, cornerRadii$toCornerRadii3, cornerRadii$toCornerRadii, cornerRadii$toCornerRadii, cornerRadii$toCornerRadii4, cornerRadii$toCornerRadii4};
    }

    private static final float getCornerRadii$toCornerRadii(Expression<Long> expression, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt.dpToPx(expression.evaluate(expressionResolver), displayMetrics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Integer> getDisabledScrollPages(int i4, boolean z4) {
        return z4 ? new LinkedHashSet() : CollectionsKt.toMutableSet(new IntRange(0, i4));
    }

    private final BaseDivTabbedCardUi.TabbedCardConfig getTabbedCardLayoutIds() {
        return new BaseDivTabbedCardUi.TabbedCardConfig(R$id.base_tabbed_title_container_scroller, R$id.div_tabs_pager_container, R$id.div_tabs_container_helper, true, false, "DIV2.TAB_HEADER_VIEW", "DIV2.TAB_ITEM_VIEW");
    }

    private final void observeDividerStyle(DivTabsLayout divTabsLayout, ExpressionResolver expressionResolver, C1013qd.d dVar, BindingContext bindingContext) {
        if (dVar == null) {
            return;
        }
        applyDelimiterStyle(divTabsLayout.getTitleLayout(), expressionResolver, dVar, bindingContext);
        DivTabsBinder$observeDividerStyle$callback$1 divTabsBinder$observeDividerStyle$callback$1 = new DivTabsBinder$observeDividerStyle$callback$1(this, divTabsLayout, expressionResolver, dVar, bindingContext);
        dVar.f7654c.f4715b.observe(expressionResolver, divTabsBinder$observeDividerStyle$callback$1);
        dVar.f7654c.f4714a.observe(expressionResolver, divTabsBinder$observeDividerStyle$callback$1);
        dVar.f7652a.f4715b.observe(expressionResolver, divTabsBinder$observeDividerStyle$callback$1);
        dVar.f7652a.f4714a.observe(expressionResolver, divTabsBinder$observeDividerStyle$callback$1);
        dVar.f7653b.observe(expressionResolver, divTabsBinder$observeDividerStyle$callback$1);
    }

    private final void observeHeight(TabTitlesLayoutView<?> tabTitlesLayoutView, C1013qd c1013qd, ExpressionResolver expressionResolver) {
        C0754c5 c0754c5;
        Expression expression;
        C0754c5 c0754c52;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        DivTabsBinder$observeHeight$applyHeight$1 divTabsBinder$observeHeight$applyHeight$1 = new DivTabsBinder$observeHeight$applyHeight$1(c1013qd, expressionResolver, tabTitlesLayoutView);
        Disposable disposable = null;
        divTabsBinder$observeHeight$applyHeight$1.invoke((Object) null);
        ExpressionSubscriber expressionSubscriber = ReleasablesKt.getExpressionSubscriber(tabTitlesLayoutView);
        C1013qd.e eVar = c1013qd.f7598D;
        expressionSubscriber.addSubscription((eVar == null || (expression4 = eVar.f7688s) == null) ? null : expression4.observe(expressionResolver, divTabsBinder$observeHeight$applyHeight$1));
        C1013qd.e eVar2 = c1013qd.f7598D;
        expressionSubscriber.addSubscription((eVar2 == null || (expression3 = eVar2.f7679j) == null) ? null : expression3.observe(expressionResolver, divTabsBinder$observeHeight$applyHeight$1));
        C1013qd.e eVar3 = c1013qd.f7598D;
        expressionSubscriber.addSubscription((eVar3 == null || (c0754c52 = eVar3.f7689t) == null || (expression2 = c0754c52.f5855f) == null) ? null : expression2.observe(expressionResolver, divTabsBinder$observeHeight$applyHeight$1));
        C1013qd.e eVar4 = c1013qd.f7598D;
        if (eVar4 != null && (c0754c5 = eVar4.f7689t) != null && (expression = c0754c5.f5850a) != null) {
            disposable = expression.observe(expressionResolver, divTabsBinder$observeHeight$applyHeight$1);
        }
        expressionSubscriber.addSubscription(disposable);
        expressionSubscriber.addSubscription(c1013qd.f7599E.f5855f.observe(expressionResolver, divTabsBinder$observeHeight$applyHeight$1));
        expressionSubscriber.addSubscription(c1013qd.f7599E.f5850a.observe(expressionResolver, divTabsBinder$observeHeight$applyHeight$1));
    }

    private final void observeStyle(DivTabsLayout divTabsLayout, ExpressionResolver expressionResolver, C1013qd.e eVar) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        C0735b4 c0735b4;
        Expression expression4;
        C0735b4 c0735b42;
        Expression expression5;
        C0735b4 c0735b43;
        Expression expression6;
        C0735b4 c0735b44;
        Expression expression7;
        Expression expression8;
        Expression expression9;
        Expression expression10;
        Expression expression11;
        Expression expression12;
        applyStyle(divTabsLayout.getTitleLayout(), expressionResolver, eVar == null ? DEFAULT_TAB_TITLE_STYLE : eVar);
        DivTabsBinder$observeStyle$callback$1 divTabsBinder$observeStyle$callback$1 = new DivTabsBinder$observeStyle$callback$1(this, divTabsLayout, expressionResolver, eVar);
        if (eVar != null && (expression12 = eVar.f7673d) != null) {
            expression12.observe(expressionResolver, divTabsBinder$observeStyle$callback$1);
        }
        if (eVar != null && (expression11 = eVar.f7670a) != null) {
            expression11.observe(expressionResolver, divTabsBinder$observeStyle$callback$1);
        }
        if (eVar != null && (expression10 = eVar.f7685p) != null) {
            expression10.observe(expressionResolver, divTabsBinder$observeStyle$callback$1);
        }
        if (eVar != null && (expression9 = eVar.f7682m) != null) {
            expression9.observe(expressionResolver, divTabsBinder$observeStyle$callback$1);
        }
        if (eVar != null && (expression8 = eVar.f7676g) != null) {
            expression8.observe(expressionResolver, divTabsBinder$observeStyle$callback$1);
        }
        if (eVar != null && (c0735b44 = eVar.f7677h) != null && (expression7 = c0735b44.f5779c) != null) {
            expression7.observe(expressionResolver, divTabsBinder$observeStyle$callback$1);
        }
        if (eVar != null && (c0735b43 = eVar.f7677h) != null && (expression6 = c0735b43.f5780d) != null) {
            expression6.observe(expressionResolver, divTabsBinder$observeStyle$callback$1);
        }
        if (eVar != null && (c0735b42 = eVar.f7677h) != null && (expression5 = c0735b42.f5778b) != null) {
            expression5.observe(expressionResolver, divTabsBinder$observeStyle$callback$1);
        }
        if (eVar != null && (c0735b4 = eVar.f7677h) != null && (expression4 = c0735b4.f5777a) != null) {
            expression4.observe(expressionResolver, divTabsBinder$observeStyle$callback$1);
        }
        if (eVar != null && (expression3 = eVar.f7686q) != null) {
            expression3.observe(expressionResolver, divTabsBinder$observeStyle$callback$1);
        }
        if (eVar != null && (expression2 = eVar.f7675f) != null) {
            expression2.observe(expressionResolver, divTabsBinder$observeStyle$callback$1);
        }
        if (eVar == null || (expression = eVar.f7674e) == null) {
            return;
        }
        expression.observe(expressionResolver, divTabsBinder$observeStyle$callback$1);
    }

    public void bindView(@NotNull BindingContext context, @NotNull DivTabsLayout view, @NotNull Z.q div, @NotNull DivStatePath path) {
        Z.q applyPatch;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        Z.q div2 = view.getDiv();
        if (div2 == div) {
            DivTabsAdapter divTabsAdapter = view.getDivTabsAdapter();
            if (divTabsAdapter != null && (applyPatch = divTabsAdapter.applyPatch(context.getExpressionResolver(), div)) != null) {
                view.setDiv(applyPatch);
                return;
            }
        } else {
            this.baseBinder.bindView(context, view, div, div2);
            bind(view, context, div.c(), div2 != null ? div2.c() : null);
        }
        C1013qd c4 = div2 != null ? div2.c() : null;
        C1013qd c5 = div.c();
        Object obj = this.divBinder.get();
        Intrinsics.checkNotNullExpressionValue(obj, "divBinder.get()");
        bindAdapter(path, context, view, c4, c5, (DivBinder) obj, view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivTabsLayout divTabsLayout, @NotNull final BindingContext bindingContext, @NotNull C1013qd div, @Nullable C1013qd c1013qd) {
        Intrinsics.checkNotNullParameter(divTabsLayout, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divTabsLayout.setClipToPadding(false);
        DivTabsBinder$bind$applyPaddings$1 divTabsBinder$bind$applyPaddings$1 = new DivTabsBinder$bind$applyPaddings$1(divTabsLayout, div, expressionResolver);
        divTabsBinder$bind$applyPaddings$1.invoke((Object) null);
        divTabsLayout.addSubscription(div.f7599E.f5852c.observe(expressionResolver, divTabsBinder$bind$applyPaddings$1));
        divTabsLayout.addSubscription(div.f7599E.f5853d.observe(expressionResolver, divTabsBinder$bind$applyPaddings$1));
        divTabsLayout.addSubscription(div.f7599E.f5855f.observe(expressionResolver, divTabsBinder$bind$applyPaddings$1));
        divTabsLayout.addSubscription(div.f7599E.f5850a.observe(expressionResolver, divTabsBinder$bind$applyPaddings$1));
        observeHeight(divTabsLayout.getTitleLayout(), div, expressionResolver);
        observeStyle(divTabsLayout, expressionResolver, div.f7598D);
        observeDividerStyle(divTabsLayout, expressionResolver, div.f7597C, bindingContext);
        divTabsLayout.getPagerLayout().setClipToPadding(false);
        DivTabsBinderKt.observe(div.f7595A, expressionResolver, divTabsLayout, new DivTabsBinder$bind$1(divTabsLayout, div, expressionResolver));
        divTabsLayout.addSubscription(div.f7639z.observeAndGet(expressionResolver, new DivTabsBinder$bind$2(divTabsLayout)));
        divTabsLayout.addSubscription(div.f7627n.observeAndGet(expressionResolver, new DivTabsBinder$bind$3(divTabsLayout)));
        divTabsLayout.getTitleLayout().setOnScrollChangedListener(new TabTitlesLayoutView.OnScrollChangedListener() { // from class: z1.a
            @Override // com.yandex.div.internal.widget.tabs.TabTitlesLayoutView.OnScrollChangedListener
            public final void onScrolled() {
                DivTabsBinder.bind$lambda$2(DivTabsBinder.this, bindingContext);
            }
        });
        divTabsLayout.getTitleLayout().setFocusTracker(bindingContext.getDivView().getInputFocusTracker$div_release());
        divTabsLayout.addSubscription(div.f7634u.observeAndGet(expressionResolver, new DivTabsBinder$bind$5(divTabsLayout)));
    }
}
