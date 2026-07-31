package com.yandex.div.core.tooltip;

import O1.Se;
import O1.Yb;
import O1.Z;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.activity.B;
import androidx.activity.v;
import androidx.activity.w;
import androidx.activity.y;
import androidx.core.view.AbstractC1293g0;
import com.yandex.div.R$id;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import h2.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivTooltipController {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;

    @NotNull
    private final n createPopup;

    @NotNull
    private final DivPreloader divPreloader;

    @NotNull
    private final DivTooltipViewBuilder divTooltipViewBuilder;

    @NotNull
    private final DivVisibilityActionTracker divVisibilityActionTracker;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final Handler mainThreadHandler;

    @NotNull
    private final DivTooltipRestrictor tooltipRestrictor;

    @NotNull
    private final Map<String, TooltipData> tooltips;

    @Metadata
    /* renamed from: com.yandex.div.core.tooltip.DivTooltipController$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements n {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3);
        }

        @NotNull
        public final SafePopupWindow invoke(@NotNull View c4, int i4, int i5) {
            Intrinsics.checkNotNullParameter(c4, "c");
            return new DivTooltipWindow(c4, i4, i5, false, 8, null);
        }

        @Override // h2.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    public DivTooltipController(@NotNull DivTooltipRestrictor tooltipRestrictor, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull DivPreloader divPreloader, @NotNull ErrorCollectors errorCollectors, @NotNull DivTooltipViewBuilder divTooltipViewBuilder, @NotNull AccessibilityStateProvider accessibilityStateProvider, @NotNull n createPopup) {
        Intrinsics.checkNotNullParameter(tooltipRestrictor, "tooltipRestrictor");
        Intrinsics.checkNotNullParameter(divVisibilityActionTracker, "divVisibilityActionTracker");
        Intrinsics.checkNotNullParameter(divPreloader, "divPreloader");
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
        Intrinsics.checkNotNullParameter(divTooltipViewBuilder, "divTooltipViewBuilder");
        Intrinsics.checkNotNullParameter(accessibilityStateProvider, "accessibilityStateProvider");
        Intrinsics.checkNotNullParameter(createPopup, "createPopup");
        this.tooltipRestrictor = tooltipRestrictor;
        this.divVisibilityActionTracker = divVisibilityActionTracker;
        this.divPreloader = divPreloader;
        this.errorCollectors = errorCollectors;
        this.divTooltipViewBuilder = divTooltipViewBuilder;
        this.accessibilityStateProvider = accessibilityStateProvider;
        this.createPopup = createPopup;
        this.tooltips = new LinkedHashMap();
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.activity.v, com.yandex.div.core.tooltip.DivTooltipController$createOnBackPressCallback$1] */
    private DivTooltipController$createOnBackPressCallback$1 createOnBackPressCallback(final Se se, final Div2View div2View) {
        w onBackPressedDispatcher;
        AccessibilityStateProvider accessibilityStateProvider = this.accessibilityStateProvider;
        Context context = div2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "divView.getContext()");
        if (!accessibilityStateProvider.isAccessibilityEnabled(context)) {
            return null;
        }
        ?? r02 = new v() { // from class: com.yandex.div.core.tooltip.DivTooltipController$createOnBackPressCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // androidx.activity.v
            public void handleOnBackPressed() {
                DivTooltipController.this.hideTooltip(se.f4818g, div2View);
            }
        };
        y a4 = B.a(div2View);
        if (a4 != null && (onBackPressedDispatcher = a4.getOnBackPressedDispatcher()) != 0) {
            onBackPressedDispatcher.h(r02);
            return r02;
        }
        DivActionTypedUtilsKt.logError(div2View, new AssertionError("Can't find onBackPressedDispatcher to set on back press listener on tooltip."));
        Assert.fail("Can't find onBackPressedDispatcher to set on back press listener on tooltip.");
        Unit unit = Unit.f41027a;
        return r02;
    }

    private String dismissTooltip(Se se) {
        TooltipData tooltipData = this.tooltips.get(se.f4818g);
        if (tooltipData == null) {
            return null;
        }
        return dismissTooltip(tooltipData);
    }

    public static /* synthetic */ void showTooltip$default(DivTooltipController divTooltipController, String str, BindingContext bindingContext, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTooltip");
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        divTooltipController.showTooltip(str, bindingContext, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startVisibilityTracking(BindingContext bindingContext, Z z4, View view) {
        stopVisibilityTracking(bindingContext, z4);
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, z4, null, null, 48, null);
    }

    private void stopVisibilityTracking(BindingContext bindingContext, Z z4) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, bindingContext.getDivView(), bindingContext.getExpressionResolver(), null, z4, null, null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryShowTooltip(final View view, final Se se, final BindingContext bindingContext, final boolean z4) {
        boolean shouldDismissByOutsideTouch;
        boolean isModal;
        boolean isModal2;
        boolean isModal3;
        final Div2View divView = bindingContext.getDivView();
        if (this.tooltipRestrictor.canShowTooltip(divView, view, se, z4)) {
            final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
            final Z z5 = se.f4816e;
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            Yb width = se.f4816e.b().getWidth();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
            int layoutParamsSize$default = BaseDivViewExtensionsKt.toLayoutParamsSize$default(width, displayMetrics, expressionResolver, null, 4, null);
            int layoutParamsSize$default2 = BaseDivViewExtensionsKt.toLayoutParamsSize$default(se.f4816e.b().getHeight(), displayMetrics, expressionResolver, null, 4, null);
            final DivTooltipContainer buildTooltipView = this.divTooltipViewBuilder.buildTooltipView(bindingContext, z5, layoutParamsSize$default, layoutParamsSize$default2);
            final View tooltipView = buildTooltipView.getTooltipView();
            if (tooltipView == null) {
                return;
            }
            final SafePopupWindow safePopupWindow = (SafePopupWindow) this.createPopup.invoke(buildTooltipView, Integer.valueOf(layoutParamsSize$default), Integer.valueOf(layoutParamsSize$default2));
            safePopupWindow.setTouchable(true);
            shouldDismissByOutsideTouch = DivTooltipControllerKt.shouldDismissByOutsideTouch(se, expressionResolver);
            safePopupWindow.setOutsideTouchable(shouldDismissByOutsideTouch);
            if (Build.VERSION.SDK_INT >= 29) {
                safePopupWindow.setFocusable(true);
                isModal3 = DivTooltipControllerKt.isModal(se);
                safePopupWindow.setTouchModal(isModal3);
            } else {
                isModal = DivTooltipControllerKt.isModal(se);
                safePopupWindow.setFocusable(isModal);
            }
            isModal2 = DivTooltipControllerKt.isModal(se);
            safePopupWindow.setTouchInterceptor(new PopupWindowTouchListener(safePopupWindow, tooltipView, isModal2, safePopupWindow.isOutsideTouchable(), se.f4822k, bindingContext));
            DivTooltipAnimationKt.setupAnimation(safePopupWindow, se, expressionResolver);
            DivPreloader.Ticket ticket = null;
            final TooltipData tooltipData = new TooltipData(se.f4818g, bindingContext, z5, safePopupWindow, ticket, createOnBackPressCallback(se, divView), false, 64, null);
            safePopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.yandex.div.core.tooltip.a
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    DivTooltipController.tryShowTooltip$lambda$15(DivTooltipController.this, se, bindingContext, buildTooltipView, divView, view, safePopupWindow, tooltipData);
                }
            });
            this.tooltips.put(se.f4818g, tooltipData);
            DivPreloader.Ticket preload = this.divPreloader.preload(z5, expressionResolver, new DivPreloader.Callback() { // from class: com.yandex.div.core.tooltip.b
                @Override // com.yandex.div.core.DivPreloader.Callback
                public final void finish(boolean z6) {
                    DivTooltipController.tryShowTooltip$lambda$18(TooltipData.this, view, this, divView, se, z4, buildTooltipView, safePopupWindow, tooltipView, expressionResolver, bindingContext, z5, z6);
                }
            });
            TooltipData tooltipData2 = this.tooltips.get(se.f4818g);
            if (tooltipData2 == null) {
                return;
            }
            tooltipData2.setTicket(preload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryShowTooltip$lambda$15(DivTooltipController this$0, Se divTooltip, BindingContext context, DivTooltipContainer tooltipContainer, Div2View div2View, View anchor, SafePopupWindow popup, TooltipData tooltipData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(divTooltip, "$divTooltip");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(tooltipContainer, "$tooltipContainer");
        Intrinsics.checkNotNullParameter(div2View, "$div2View");
        Intrinsics.checkNotNullParameter(anchor, "$anchor");
        Intrinsics.checkNotNullParameter(popup, "$popup");
        Intrinsics.checkNotNullParameter(tooltipData, "$tooltipData");
        this$0.tooltips.remove(divTooltip.f4818g);
        this$0.stopVisibilityTracking(context, divTooltip.f4816e);
        Z z4 = this$0.divVisibilityActionTracker.getDivWithWaitingDisappearActions().get(tooltipContainer);
        if (z4 != null) {
            this$0.divVisibilityActionTracker.trackDetachedView(context, tooltipContainer, z4);
        }
        this$0.tooltipRestrictor.getTooltipShownCallback();
        DivTooltipControllerKt.removeBackPressedCallback(popup, tooltipData, this$0.accessibilityStateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryShowTooltip$lambda$18(TooltipData tooltipData, final View anchor, final DivTooltipController this$0, final Div2View div2View, final Se divTooltip, boolean z4, final DivTooltipContainer tooltipContainer, final SafePopupWindow popup, final View tooltipView, final ExpressionResolver resolver, final BindingContext context, final Z div, boolean z5) {
        Rect windowFrame;
        Intrinsics.checkNotNullParameter(tooltipData, "$tooltipData");
        Intrinsics.checkNotNullParameter(anchor, "$anchor");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(div2View, "$div2View");
        Intrinsics.checkNotNullParameter(divTooltip, "$divTooltip");
        Intrinsics.checkNotNullParameter(tooltipContainer, "$tooltipContainer");
        Intrinsics.checkNotNullParameter(popup, "$popup");
        Intrinsics.checkNotNullParameter(tooltipView, "$tooltipView");
        Intrinsics.checkNotNullParameter(resolver, "$resolver");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(div, "$div");
        if (z5 || tooltipData.getDismissed() || !anchor.isAttachedToWindow() || !this$0.tooltipRestrictor.canShowTooltip(div2View, anchor, divTooltip, z4)) {
            return;
        }
        if (!ViewsKt.isActuallyLaidOut(tooltipContainer) || tooltipContainer.isLayoutRequested()) {
            tooltipContainer.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda$18$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    Rect windowFrame2;
                    view.removeOnLayoutChangeListener(this);
                    windowFrame2 = DivTooltipControllerKt.getWindowFrame(Div2View.this);
                    Point calcPopupLocation = DivTooltipControllerKt.calcPopupLocation(tooltipView, anchor, divTooltip, resolver);
                    int min = Math.min(tooltipView.getWidth(), windowFrame2.width());
                    int min2 = Math.min(tooltipView.getHeight(), windowFrame2.height());
                    if (min < tooltipView.getWidth()) {
                        this$0.errorCollectors.getOrCreate(Div2View.this.getDataTag(), Div2View.this.getDivData()).logWarning(new Throwable("Tooltip width > screen size, width was changed"));
                    }
                    if (min2 < tooltipView.getHeight()) {
                        this$0.errorCollectors.getOrCreate(Div2View.this.getDataTag(), Div2View.this.getDivData()).logWarning(new Throwable("Tooltip height > screen size, height was changed"));
                    }
                    popup.update(calcPopupLocation.x, calcPopupLocation.y, min, min2);
                    this$0.startVisibilityTracking(context, div, tooltipContainer);
                    this$0.tooltipRestrictor.getTooltipShownCallback();
                }
            });
        } else {
            windowFrame = DivTooltipControllerKt.getWindowFrame(div2View);
            Point calcPopupLocation = DivTooltipControllerKt.calcPopupLocation(tooltipView, anchor, divTooltip, resolver);
            int min = Math.min(tooltipView.getWidth(), windowFrame.width());
            int min2 = Math.min(tooltipView.getHeight(), windowFrame.height());
            if (min < tooltipView.getWidth()) {
                this$0.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip width > screen size, width was changed"));
            }
            if (min2 < tooltipView.getHeight()) {
                this$0.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip height > screen size, height was changed"));
            }
            popup.update(calcPopupLocation.x, calcPopupLocation.y, min, min2);
            this$0.startVisibilityTracking(context, div, tooltipContainer);
            this$0.tooltipRestrictor.getTooltipShownCallback();
        }
        popup.showAtLocation(anchor, 0, 0, 0);
        BaseDivViewExtensionsKt.sendAccessibilityEventUnchecked(32, tooltipView, this$0.accessibilityStateProvider);
        if (((Number) divTooltip.f4817f.evaluate(resolver)).longValue() != 0) {
            this$0.mainThreadHandler.postDelayed(new Runnable() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda$18$$inlined$postDelayed$default$1
                @Override // java.lang.Runnable
                public final void run() {
                    DivTooltipController.this.hideTooltip(divTooltip.f4818g, div2View);
                }
            }, ((Number) divTooltip.f4817f.evaluate(resolver)).longValue());
        }
    }

    public boolean cancelAllTooltips() {
        if (this.tooltips.isEmpty()) {
            return false;
        }
        Iterator it = CollectionsKt.toList(this.tooltips.values()).iterator();
        while (it.hasNext()) {
            dismissTooltip((TooltipData) it.next());
        }
        this.tooltips.clear();
        return true;
    }

    public void cancelTooltips(@NotNull Div2View divView) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        cancelTooltips((View) divView);
    }

    @Nullable
    public View findViewWithTag(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Set<Map.Entry<String, TooltipData>> entrySet = this.tooltips.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            View contentView = ((TooltipData) ((Map.Entry) it.next()).getValue()).getPopupWindow().getContentView();
            if (contentView != null) {
                arrayList.add(contentView);
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            View findViewWithTag = ((View) obj).findViewWithTag(id);
            if (findViewWithTag != null) {
                Intrinsics.checkNotNullExpressionValue(findViewWithTag, "findViewWithTag<View>(id)");
                return findViewWithTag;
            }
        }
        return null;
    }

    public void hideTooltip(@NotNull String id, @NotNull Div2View div2View) {
        SafePopupWindow popupWindow;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        TooltipData tooltipData = this.tooltips.get(id);
        if (tooltipData == null || (popupWindow = tooltipData.getPopupWindow()) == null) {
            return;
        }
        popupWindow.dismiss();
    }

    public void mapTooltip(@NotNull View view, @Nullable List<Se> list) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(R$id.div_tooltips_tag, list);
    }

    public void showTooltip(@NotNull String tooltipId, @NotNull BindingContext context, boolean z4) {
        Pair findChildWithTooltip;
        Unit unit;
        Intrinsics.checkNotNullParameter(tooltipId, "tooltipId");
        Intrinsics.checkNotNullParameter(context, "context");
        findChildWithTooltip = DivTooltipControllerKt.findChildWithTooltip(tooltipId, context.getDivView());
        if (findChildWithTooltip != null) {
            showTooltip(context, (Se) findChildWithTooltip.component1(), (View) findChildWithTooltip.component2(), z4);
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            DivActionTypedUtilsKt.logError(context.getDivView(), new IllegalStateException("Unable to find view for tooltip '" + tooltipId + '\''));
        }
    }

    private void cancelTooltips(View view) {
        Object tag = view.getTag(R$id.div_tooltips_tag);
        List list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String dismissTooltip = dismissTooltip((Se) it.next());
                if (dismissTooltip != null) {
                    arrayList.add(dismissTooltip);
                }
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                this.tooltips.remove((String) obj);
            }
        }
        if (view instanceof ViewGroup) {
            Iterator it2 = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it2.hasNext()) {
                cancelTooltips((View) it2.next());
            }
        }
    }

    private String dismissTooltip(TooltipData tooltipData) {
        tooltipData.setDismissed(true);
        DivPreloader.Ticket ticket = tooltipData.getTicket();
        if (ticket != null) {
            ticket.cancel();
        }
        if (tooltipData.getPopupWindow().isShowing()) {
            DivTooltipAnimationKt.clearAnimation(tooltipData.getPopupWindow());
            tooltipData.getPopupWindow().dismiss();
            return null;
        }
        stopVisibilityTracking(tooltipData.getBindingContext(), tooltipData.getDiv());
        return tooltipData.getId();
    }

    private void showTooltip(final BindingContext bindingContext, final Se se, View view, final boolean z4) {
        final View view2;
        if (this.tooltips.containsKey(se.f4818g)) {
            return;
        }
        if (ViewsKt.isActuallyLaidOut(view) && !view.isLayoutRequested()) {
            tryShowTooltip(view, se, bindingContext, z4);
            view2 = view;
        } else {
            view2 = view;
            view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$showTooltip$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    view3.removeOnLayoutChangeListener(this);
                    DivTooltipController.this.tryShowTooltip(view2, se, bindingContext, z4);
                }
            });
        }
        if (ViewsKt.isActuallyLaidOut(view2) || view2.isLayoutRequested()) {
            return;
        }
        view2.requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DivTooltipController(@NotNull DivTooltipRestrictor tooltipRestrictor, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull DivPreloader divPreloader, @NotNull DivTooltipViewBuilder divTooltipViewBuilder, @NotNull AccessibilityStateProvider accessibilityStateProvider, @NotNull ErrorCollectors errorCollectors) {
        this(tooltipRestrictor, divVisibilityActionTracker, divPreloader, errorCollectors, divTooltipViewBuilder, accessibilityStateProvider, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(tooltipRestrictor, "tooltipRestrictor");
        Intrinsics.checkNotNullParameter(divVisibilityActionTracker, "divVisibilityActionTracker");
        Intrinsics.checkNotNullParameter(divPreloader, "divPreloader");
        Intrinsics.checkNotNullParameter(divTooltipViewBuilder, "divTooltipViewBuilder");
        Intrinsics.checkNotNullParameter(accessibilityStateProvider, "accessibilityStateProvider");
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
    }
}
