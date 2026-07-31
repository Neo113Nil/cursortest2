package com.yandex.div.core.view2;

import O1.InterfaceC0752c3;
import O1.Z;
import W1.m;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivSwitchBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.pager.DivPagerBinder;
import com.yandex.div.core.view2.divs.pager.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.internal.core.DivTreeVisitorKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class DivBinder {

    @NotNull
    private final DivContainerBinder containerBinder;

    @NotNull
    private final DivCustomBinder customBinder;

    @NotNull
    private final DivExtensionController extensionController;

    @NotNull
    private final DivGalleryBinder galleryBinder;

    @NotNull
    private final DivGifImageBinder gifImageBinder;

    @NotNull
    private final DivGridBinder gridBinder;

    @NotNull
    private final DivImageBinder imageBinder;

    @NotNull
    private final DivIndicatorBinder indicatorBinder;

    @NotNull
    private final DivInputBinder inputBinder;

    @NotNull
    private final DivPagerBinder pagerBinder;

    @NotNull
    private final PagerIndicatorConnector pagerIndicatorConnector;

    @NotNull
    private final DivSelectBinder selectBinder;

    @NotNull
    private final DivSeparatorBinder separatorBinder;

    @NotNull
    private final DivSliderBinder sliderBinder;

    @NotNull
    private final DivStateBinder stateBinder;

    @NotNull
    private final DivSwitchBinder switchBinder;

    @NotNull
    private final DivTabsBinder tabsBinder;

    @NotNull
    private final DivTextBinder textBinder;

    @NotNull
    private final DivValidator validator;

    @NotNull
    private final DivVideoBinder videoBinder;

    public DivBinder(@NotNull DivValidator validator, @NotNull DivTextBinder textBinder, @NotNull DivContainerBinder containerBinder, @NotNull DivSeparatorBinder separatorBinder, @NotNull DivImageBinder imageBinder, @NotNull DivGifImageBinder gifImageBinder, @NotNull DivGridBinder gridBinder, @NotNull DivGalleryBinder galleryBinder, @NotNull DivPagerBinder pagerBinder, @NotNull DivTabsBinder tabsBinder, @NotNull DivStateBinder stateBinder, @NotNull DivCustomBinder customBinder, @NotNull DivIndicatorBinder indicatorBinder, @NotNull DivSliderBinder sliderBinder, @NotNull DivInputBinder inputBinder, @NotNull DivSelectBinder selectBinder, @NotNull DivVideoBinder videoBinder, @NotNull DivExtensionController extensionController, @NotNull PagerIndicatorConnector pagerIndicatorConnector, @NotNull DivSwitchBinder switchBinder) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(textBinder, "textBinder");
        Intrinsics.checkNotNullParameter(containerBinder, "containerBinder");
        Intrinsics.checkNotNullParameter(separatorBinder, "separatorBinder");
        Intrinsics.checkNotNullParameter(imageBinder, "imageBinder");
        Intrinsics.checkNotNullParameter(gifImageBinder, "gifImageBinder");
        Intrinsics.checkNotNullParameter(gridBinder, "gridBinder");
        Intrinsics.checkNotNullParameter(galleryBinder, "galleryBinder");
        Intrinsics.checkNotNullParameter(pagerBinder, "pagerBinder");
        Intrinsics.checkNotNullParameter(tabsBinder, "tabsBinder");
        Intrinsics.checkNotNullParameter(stateBinder, "stateBinder");
        Intrinsics.checkNotNullParameter(customBinder, "customBinder");
        Intrinsics.checkNotNullParameter(indicatorBinder, "indicatorBinder");
        Intrinsics.checkNotNullParameter(sliderBinder, "sliderBinder");
        Intrinsics.checkNotNullParameter(inputBinder, "inputBinder");
        Intrinsics.checkNotNullParameter(selectBinder, "selectBinder");
        Intrinsics.checkNotNullParameter(videoBinder, "videoBinder");
        Intrinsics.checkNotNullParameter(extensionController, "extensionController");
        Intrinsics.checkNotNullParameter(pagerIndicatorConnector, "pagerIndicatorConnector");
        Intrinsics.checkNotNullParameter(switchBinder, "switchBinder");
        this.validator = validator;
        this.textBinder = textBinder;
        this.containerBinder = containerBinder;
        this.separatorBinder = separatorBinder;
        this.imageBinder = imageBinder;
        this.gifImageBinder = gifImageBinder;
        this.gridBinder = gridBinder;
        this.galleryBinder = galleryBinder;
        this.pagerBinder = pagerBinder;
        this.tabsBinder = tabsBinder;
        this.stateBinder = stateBinder;
        this.customBinder = customBinder;
        this.indicatorBinder = indicatorBinder;
        this.sliderBinder = sliderBinder;
        this.inputBinder = inputBinder;
        this.selectBinder = selectBinder;
        this.videoBinder = videoBinder;
        this.extensionController = extensionController;
        this.pagerIndicatorConnector = pagerIndicatorConnector;
        this.switchBinder = switchBinder;
    }

    private void bindContainer(BindingContext bindingContext, View view, Z.c cVar, DivStatePath divStatePath) {
        DivContainerBinder divContainerBinder = this.containerBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        divContainerBinder.bindView(bindingContext, (ViewGroup) view, cVar, divStatePath);
    }

    private void bindCustom(BindingContext bindingContext, View view, Z.d dVar, DivStatePath divStatePath) {
        DivCustomBinder divCustomBinder = this.customBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCustomWrapper");
        divCustomBinder.bindView(bindingContext, (DivCustomWrapper) view, dVar, divStatePath);
    }

    private void bindGallery(BindingContext bindingContext, View view, Z.e eVar, DivStatePath divStatePath) {
        DivGalleryBinder divGalleryBinder = this.galleryBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivRecyclerView");
        divGalleryBinder.bindView(bindingContext, (DivRecyclerView) view, eVar, divStatePath);
    }

    private void bindGifImage(BindingContext bindingContext, View view, Z.f fVar) {
        DivGifImageBinder divGifImageBinder = this.gifImageBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivGifImageView");
        divGifImageBinder.bindView(bindingContext, (DivGifImageView) view, fVar);
    }

    private void bindGrid(BindingContext bindingContext, View view, Z.g gVar, DivStatePath divStatePath) {
        DivGridBinder divGridBinder = this.gridBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivGridLayout");
        divGridBinder.bindView(bindingContext, (DivGridLayout) view, gVar, divStatePath);
    }

    private void bindImage(BindingContext bindingContext, View view, Z.h hVar) {
        DivImageBinder divImageBinder = this.imageBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivImageView");
        divImageBinder.bindView(bindingContext, (DivImageView) view, hVar);
    }

    private void bindIndicator(BindingContext bindingContext, View view, Z.i iVar) {
        DivIndicatorBinder divIndicatorBinder = this.indicatorBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView");
        divIndicatorBinder.bindView(bindingContext, (DivPagerIndicatorView) view, iVar);
    }

    private void bindInput(BindingContext bindingContext, View view, Z.j jVar, DivStatePath divStatePath) {
        DivInputBinder divInputBinder = this.inputBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivInputView");
        divInputBinder.bindView(bindingContext, (DivInputView) view, jVar, divStatePath);
    }

    private void bindLayoutParams(View view, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt.applyMargins(view, interfaceC0752c3.g(), expressionResolver);
    }

    private void bindPager(BindingContext bindingContext, View view, Z.k kVar, DivStatePath divStatePath) {
        DivPagerBinder divPagerBinder = this.pagerBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivPagerView");
        divPagerBinder.bindView(bindingContext, (DivPagerView) view, kVar, divStatePath);
    }

    private void bindSelect(BindingContext bindingContext, View view, Z.l lVar, DivStatePath divStatePath) {
        DivSelectBinder divSelectBinder = this.selectBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSelectView");
        divSelectBinder.bindView(bindingContext, (DivSelectView) view, lVar, divStatePath);
    }

    private void bindSeparator(BindingContext bindingContext, View view, Z.m mVar) {
        DivSeparatorBinder divSeparatorBinder = this.separatorBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSeparatorView");
        divSeparatorBinder.bindView(bindingContext, (DivSeparatorView) view, mVar);
    }

    private void bindSlider(BindingContext bindingContext, View view, Z.n nVar, DivStatePath divStatePath) {
        DivSliderBinder divSliderBinder = this.sliderBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSliderView");
        divSliderBinder.bindView(bindingContext, (DivSliderView) view, nVar, divStatePath);
    }

    private void bindState(BindingContext bindingContext, View view, Z.o oVar, DivStatePath divStatePath) {
        DivStateBinder divStateBinder = this.stateBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivStateLayout");
        divStateBinder.bindView(bindingContext, (DivStateLayout) view, oVar, divStatePath);
    }

    private void bindSwitch(BindingContext bindingContext, View view, Z.p pVar, DivStatePath divStatePath) {
        DivSwitchBinder divSwitchBinder = this.switchBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivSwitchView");
        divSwitchBinder.bindView(bindingContext, (DivSwitchView) view, pVar, divStatePath);
    }

    private void bindTabs(BindingContext bindingContext, View view, Z.q qVar, DivStatePath divStatePath) {
        DivTabsBinder divTabsBinder = this.tabsBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivTabsLayout");
        divTabsBinder.bindView(bindingContext, (DivTabsLayout) view, qVar, divStatePath);
    }

    private void bindText(BindingContext bindingContext, View view, Z.r rVar) {
        DivTextBinder divTextBinder = this.textBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView");
        divTextBinder.bindView(bindingContext, (DivLineHeightTextView) view, rVar);
    }

    private void bindVideo(BindingContext bindingContext, View view, Z.s sVar, DivStatePath divStatePath) {
        DivVideoBinder divVideoBinder = this.videoBinder;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivVideoView");
        divVideoBinder.bindView(bindingContext, (DivVideoView) view, sVar, divStatePath);
    }

    public void attachIndicators$div_release() {
        this.pagerIndicatorConnector.attach$div_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bind(@NotNull BindingContext parentContext, @NotNull View view, @NotNull Z div, @NotNull DivStatePath path) {
        boolean isExpressionResolveFail;
        Z div2;
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            BindingContext childContext = DivTreeVisitorKt.getChildContext(parentContext, div, path);
            Div2View divView = childContext.getDivView();
            ExpressionResolver expressionResolver = childContext.getExpressionResolver();
            ReusableTokenList currentRebindReusableList$div_release = divView.getCurrentRebindReusableList$div_release();
            if (currentRebindReusableList$div_release == null || currentRebindReusableList$div_release.pop(div) == null) {
                if (!this.validator.validate(div, expressionResolver)) {
                    bindLayoutParams(view, div.b(), expressionResolver);
                    return;
                }
                this.extensionController.beforeBindView(divView, expressionResolver, view, div.b());
                if (!(div instanceof Z.d) && (div2 = ((DivHolderView) view).getDiv()) != null) {
                    this.extensionController.unbindView(divView, expressionResolver, view, div2.b());
                }
                if (div instanceof Z.r) {
                    bindText(childContext, view, (Z.r) div);
                } else if (div instanceof Z.h) {
                    bindImage(childContext, view, (Z.h) div);
                } else if (div instanceof Z.f) {
                    bindGifImage(childContext, view, (Z.f) div);
                } else if (div instanceof Z.m) {
                    bindSeparator(childContext, view, (Z.m) div);
                } else if (div instanceof Z.c) {
                    bindContainer(childContext, view, (Z.c) div, path);
                } else if (div instanceof Z.g) {
                    bindGrid(childContext, view, (Z.g) div, path);
                } else if (div instanceof Z.e) {
                    bindGallery(childContext, view, (Z.e) div, path);
                } else if (div instanceof Z.k) {
                    bindPager(childContext, view, (Z.k) div, path);
                } else if (div instanceof Z.q) {
                    bindTabs(childContext, view, (Z.q) div, path);
                } else if (div instanceof Z.o) {
                    bindState(childContext, view, (Z.o) div, path);
                } else if (div instanceof Z.d) {
                    bindCustom(childContext, view, (Z.d) div, path);
                } else if (div instanceof Z.i) {
                    bindIndicator(childContext, view, (Z.i) div);
                } else if (div instanceof Z.n) {
                    bindSlider(childContext, view, (Z.n) div, path);
                } else if (div instanceof Z.j) {
                    bindInput(childContext, view, (Z.j) div, path);
                } else if (div instanceof Z.l) {
                    bindSelect(childContext, view, (Z.l) div, path);
                } else if (div instanceof Z.s) {
                    bindVideo(childContext, view, (Z.s) div, path);
                } else {
                    if (!(div instanceof Z.p)) {
                        throw new m();
                    }
                    bindSwitch(childContext, view, (Z.p) div, path);
                }
                Unit unit = Unit.f41027a;
                if (div instanceof Z.d) {
                    return;
                }
                this.extensionController.bindView(divView, expressionResolver, view, div.b());
            }
        } catch (ParsingException e4) {
            isExpressionResolveFail = ExpressionFallbacksHelperKt.isExpressionResolveFail(e4);
            if (!isExpressionResolveFail) {
                throw e4;
            }
        }
    }
}
