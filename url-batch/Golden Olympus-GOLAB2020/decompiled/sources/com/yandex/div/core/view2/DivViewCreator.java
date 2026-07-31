package com.yandex.div.core.view2;

import O1.R3;
import O1.Z;
import W1.m;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
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
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.drawable.NoOpDrawable;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3335j;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class DivViewCreator extends DivVisitor<View> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String[] TAGS = {"DIV2.TEXT_VIEW", "DIV2.IMAGE_VIEW", "DIV2.IMAGE_GIF_VIEW", "DIV2.OVERLAP_CONTAINER_VIEW", "DIV2.LINEAR_CONTAINER_VIEW", "DIV2.WRAP_CONTAINER_VIEW", "DIV2.GRID_VIEW", "DIV2.GALLERY_VIEW", "DIV2.PAGER_VIEW", "DIV2.TAB_VIEW", "DIV2.STATE", "DIV2.CUSTOM", "DIV2.INDICATOR", "DIV2.SLIDER", "DIV2.INPUT", "DIV2.SELECT", "DIV2.VIDEO", "DIV2.SWITCH"};

    @NotNull
    private final Context context;

    @NotNull
    private final DivValidator validator;

    @NotNull
    private final ViewPool viewPool;

    @NotNull
    private ViewPreCreationProfile viewPreCreationProfile;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getTag(Z z4, ExpressionResolver expressionResolver) {
            if (z4 instanceof Z.c) {
                Z.c cVar = (Z.c) z4;
                return BaseDivViewExtensionsKt.isWrapContainer(cVar.c(), expressionResolver) ? "DIV2.WRAP_CONTAINER_VIEW" : cVar.c().f4516G.evaluate(expressionResolver) == R3.d.OVERLAP ? "DIV2.OVERLAP_CONTAINER_VIEW" : "DIV2.LINEAR_CONTAINER_VIEW";
            }
            if (z4 instanceof Z.d) {
                return "DIV2.CUSTOM";
            }
            if (z4 instanceof Z.e) {
                return "DIV2.GALLERY_VIEW";
            }
            if (z4 instanceof Z.f) {
                return "DIV2.IMAGE_GIF_VIEW";
            }
            if (z4 instanceof Z.g) {
                return "DIV2.GRID_VIEW";
            }
            if (z4 instanceof Z.h) {
                return "DIV2.IMAGE_VIEW";
            }
            if (z4 instanceof Z.i) {
                return "DIV2.INDICATOR";
            }
            if (z4 instanceof Z.j) {
                return "DIV2.INPUT";
            }
            if (z4 instanceof Z.k) {
                return "DIV2.PAGER_VIEW";
            }
            if (z4 instanceof Z.l) {
                return "DIV2.SELECT";
            }
            if (z4 instanceof Z.n) {
                return "DIV2.SLIDER";
            }
            if (z4 instanceof Z.p) {
                return "DIV2.SWITCH";
            }
            if (z4 instanceof Z.o) {
                return "DIV2.STATE";
            }
            if (z4 instanceof Z.q) {
                return "DIV2.TAB_VIEW";
            }
            if (z4 instanceof Z.r) {
                return "DIV2.TEXT_VIEW";
            }
            if (z4 instanceof Z.s) {
                return "DIV2.VIDEO";
            }
            if (z4 instanceof Z.m) {
                return "";
            }
            throw new m();
        }

        private Companion() {
        }
    }

    public DivViewCreator(@NotNull Context context, @NotNull ViewPool viewPool, @NotNull DivValidator validator, @NotNull ViewPreCreationProfile viewPreCreationProfile, @NotNull ViewPreCreationProfileRepository repository) {
        Object b4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewPool, "viewPool");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(viewPreCreationProfile, "viewPreCreationProfile");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.context = context;
        this.viewPool = viewPool;
        this.validator = validator;
        String id = viewPreCreationProfile.getId();
        if (id != null) {
            b4 = AbstractC3335j.b(null, new DivViewCreator$viewPreCreationProfile$1$1(repository, id, null), 1, null);
            ViewPreCreationProfile viewPreCreationProfile2 = (ViewPreCreationProfile) b4;
            if (viewPreCreationProfile2 != null) {
                viewPreCreationProfile = viewPreCreationProfile2;
            }
        }
        this.viewPreCreationProfile = viewPreCreationProfile;
        ViewPreCreationProfile viewPreCreationProfile3 = getViewPreCreationProfile();
        viewPool.register("DIV2.TEXT_VIEW", new ViewFactory() { // from class: w1.c
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.j(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getText().getCapacity());
        viewPool.register("DIV2.IMAGE_VIEW", new ViewFactory() { // from class: w1.t
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.a(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getImage().getCapacity());
        viewPool.register("DIV2.IMAGE_GIF_VIEW", new ViewFactory() { // from class: w1.d
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.q(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getGifImage().getCapacity());
        viewPool.register("DIV2.OVERLAP_CONTAINER_VIEW", new ViewFactory() { // from class: w1.e
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.f(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getOverlapContainer().getCapacity());
        viewPool.register("DIV2.LINEAR_CONTAINER_VIEW", new ViewFactory() { // from class: w1.f
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.p(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getLinearContainer().getCapacity());
        viewPool.register("DIV2.WRAP_CONTAINER_VIEW", new ViewFactory() { // from class: w1.g
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.r(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getWrapContainer().getCapacity());
        viewPool.register("DIV2.GRID_VIEW", new ViewFactory() { // from class: w1.h
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.k(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getGrid().getCapacity());
        viewPool.register("DIV2.GALLERY_VIEW", new ViewFactory() { // from class: w1.i
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.i(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getGallery().getCapacity());
        viewPool.register("DIV2.PAGER_VIEW", new ViewFactory() { // from class: w1.j
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.b(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getPager().getCapacity());
        viewPool.register("DIV2.TAB_VIEW", new ViewFactory() { // from class: w1.k
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.g(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getTab().getCapacity());
        viewPool.register("DIV2.STATE", new ViewFactory() { // from class: w1.l
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.l(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getState().getCapacity());
        viewPool.register("DIV2.CUSTOM", new ViewFactory() { // from class: w1.m
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.c(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getCustom().getCapacity());
        viewPool.register("DIV2.INDICATOR", new ViewFactory() { // from class: w1.n
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.h(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getIndicator().getCapacity());
        viewPool.register("DIV2.SLIDER", new ViewFactory() { // from class: w1.o
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.n(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getSlider().getCapacity());
        viewPool.register("DIV2.INPUT", new ViewFactory() { // from class: w1.p
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.e(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getInput().getCapacity());
        viewPool.register("DIV2.SELECT", new ViewFactory() { // from class: w1.q
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.m(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getSelect().getCapacity());
        viewPool.register("DIV2.VIDEO", new ViewFactory() { // from class: w1.r
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.d(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getVideo().getCapacity());
        viewPool.register("DIV2.SWITCH", new ViewFactory() { // from class: w1.s
            @Override // com.yandex.div.internal.viewpool.ViewFactory
            public final View createView() {
                return DivViewCreator.o(DivViewCreator.this);
            }
        }, viewPreCreationProfile3.getSwitch().getCapacity());
    }

    public static DivImageView a(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivImageView(this$0.context, null, 0, 6, null);
    }

    public static DivPagerView b(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivPagerView(this$0.context, null, 0, 6, null);
    }

    public static DivCustomWrapper c(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivCustomWrapper(this$0.context, null, 0, 6, null);
    }

    public static DivVideoView d(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivVideoView(this$0.context, null, 0, 6, null);
    }

    public static DivInputView e(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivInputView(this$0.context, null, 0, 6, null);
    }

    public static DivFrameLayout f(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivFrameLayout(this$0.context, null, 0, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DivTabsLayout g(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivTabsLayout(this$0.context, null, 2, 0 == true ? 1 : 0);
    }

    public static DivPagerIndicatorView h(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivPagerIndicatorView(this$0.context, null, 0, 6, null);
    }

    public static DivRecyclerView i(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivRecyclerView(this$0.context, null, 0, 6, null);
    }

    public static DivLineHeightTextView j(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivLineHeightTextView(this$0.context, null, 0, 6, null);
    }

    public static DivGridLayout k(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivGridLayout(this$0.context, null, 0, 6, null);
    }

    public static DivStateLayout l(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivStateLayout(this$0.context, null, 0, 6, null);
    }

    public static DivSelectView m(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivSelectView(this$0.context);
    }

    public static DivSliderView n(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivSliderView(this$0.context, null, 0, 6, null);
    }

    public static DivSwitchView o(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivSwitchView(this$0.context);
    }

    public static DivLinearLayout p(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivLinearLayout(this$0.context, null, 0, 6, null);
    }

    public static DivGifImageView q(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivGifImageView(this$0.context, null, 0, 6, null);
    }

    public static DivWrapLayout r(DivViewCreator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DivWrapLayout(this$0.context);
    }

    @NotNull
    public View create(@NotNull Z div, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!this.validator.validate(div, resolver)) {
            return new Space(this.context);
        }
        View visit = visit(div, resolver);
        visit.setBackground(NoOpDrawable.INSTANCE);
        return visit;
    }

    @NotNull
    public ViewPreCreationProfile getViewPreCreationProfile() {
        return this.viewPreCreationProfile;
    }

    public void setViewPreCreationProfile(@NotNull ViewPreCreationProfile value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ViewPool viewPool = this.viewPool;
        viewPool.changeCapacity("DIV2.TEXT_VIEW", value.getText().getCapacity());
        viewPool.changeCapacity("DIV2.IMAGE_VIEW", value.getImage().getCapacity());
        viewPool.changeCapacity("DIV2.IMAGE_GIF_VIEW", value.getGifImage().getCapacity());
        viewPool.changeCapacity("DIV2.OVERLAP_CONTAINER_VIEW", value.getOverlapContainer().getCapacity());
        viewPool.changeCapacity("DIV2.LINEAR_CONTAINER_VIEW", value.getLinearContainer().getCapacity());
        viewPool.changeCapacity("DIV2.WRAP_CONTAINER_VIEW", value.getWrapContainer().getCapacity());
        viewPool.changeCapacity("DIV2.GRID_VIEW", value.getGrid().getCapacity());
        viewPool.changeCapacity("DIV2.GALLERY_VIEW", value.getGallery().getCapacity());
        viewPool.changeCapacity("DIV2.PAGER_VIEW", value.getPager().getCapacity());
        viewPool.changeCapacity("DIV2.TAB_VIEW", value.getTab().getCapacity());
        viewPool.changeCapacity("DIV2.STATE", value.getState().getCapacity());
        viewPool.changeCapacity("DIV2.CUSTOM", value.getCustom().getCapacity());
        viewPool.changeCapacity("DIV2.INDICATOR", value.getIndicator().getCapacity());
        viewPool.changeCapacity("DIV2.SLIDER", value.getSlider().getCapacity());
        viewPool.changeCapacity("DIV2.INPUT", value.getInput().getCapacity());
        viewPool.changeCapacity("DIV2.SELECT", value.getSelect().getCapacity());
        viewPool.changeCapacity("DIV2.VIDEO", value.getVideo().getCapacity());
        viewPool.changeCapacity("DIV2.SWITCH", value.getSwitch().getCapacity());
        this.viewPreCreationProfile = value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public View defaultVisit(@NotNull Z data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return this.viewPool.obtain(Companion.getTag(data, resolver));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public View visit(@NotNull Z.m data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return new DivSeparatorView(this.context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public View visit(@NotNull Z.g data, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        View defaultVisit = defaultVisit((Z) data, resolver);
        Intrinsics.checkNotNull(defaultVisit, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) defaultVisit;
        Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(data.c()).iterator();
        while (it.hasNext()) {
            viewGroup.addView(create((Z) it.next(), resolver));
        }
        return viewGroup;
    }
}
