package com.yandex.div.core.view2.divs;

import O1.C0839h0;
import O1.C0892k0;
import O1.C1127x2;
import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.N;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.C1280a;
import com.ironsource.C1435b4;
import com.ironsource.c9;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.AccessibilityDelegateWrapper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivActionBinder {
    private final boolean accessibilityEnabled;

    @NotNull
    private final DivActionHandler actionHandler;

    @NotNull
    private final DivActionBeaconSender divActionBeaconSender;

    @NotNull
    private final Div2Logger logger;
    private final boolean longtapActionsPassToChild;

    @NotNull
    private final Function1<View, Boolean> passToParentLongClickListener;
    private final boolean shouldIgnoreActionMenuItems;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    final class MenuWrapperListener extends OverflowMenuWrapper.Listener.Simple {

        @NotNull
        private final BindingContext context;

        @NotNull
        private final List<C0892k0.c> items;
        final /* synthetic */ DivActionBinder this$0;

        public MenuWrapperListener(@NotNull DivActionBinder divActionBinder, @NotNull BindingContext context, List<C0892k0.c> items) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(items, "items");
            this.this$0 = divActionBinder;
            this.context = context;
            this.items = items;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onMenuCreated$lambda$0(Div2View divView, C0892k0.c itemData, ExpressionResolver expressionResolver, DivActionBinder this$0, int i4, MenuItem it) {
            Intrinsics.checkNotNullParameter(divView, "$divView");
            Intrinsics.checkNotNullParameter(itemData, "$itemData");
            Intrinsics.checkNotNullParameter(expressionResolver, "$expressionResolver");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            D d4 = new D();
            divView.bulkActions$div_release(new DivActionBinder$MenuWrapperListener$onMenuCreated$1$1(itemData, expressionResolver, d4, this$0, divView, i4));
            return d4.f41129b;
        }

        @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
        public void onMenuCreated(@NotNull N popupMenu) {
            Intrinsics.checkNotNullParameter(popupMenu, "popupMenu");
            final Div2View divView = this.context.getDivView();
            final ExpressionResolver expressionResolver = this.context.getExpressionResolver();
            Menu a4 = popupMenu.a();
            Intrinsics.checkNotNullExpressionValue(a4, "popupMenu.menu");
            for (final C0892k0.c cVar : this.items) {
                final int size = a4.size();
                MenuItem add = a4.add((CharSequence) cVar.f6769c.evaluate(expressionResolver));
                final DivActionBinder divActionBinder = this.this$0;
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.yandex.div.core.view2.divs.a
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        boolean onMenuCreated$lambda$0;
                        onMenuCreated$lambda$0 = DivActionBinder.MenuWrapperListener.onMenuCreated$lambda$0(Div2View.this, cVar, expressionResolver, divActionBinder, size, menuItem);
                        return onMenuCreated$lambda$0;
                    }
                });
            }
        }
    }

    public DivActionBinder(@NotNull DivActionHandler actionHandler, @NotNull Div2Logger logger, @NotNull DivActionBeaconSender divActionBeaconSender, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(divActionBeaconSender, "divActionBeaconSender");
        this.actionHandler = actionHandler;
        this.logger = logger;
        this.divActionBeaconSender = divActionBeaconSender;
        this.longtapActionsPassToChild = z4;
        this.shouldIgnoreActionMenuItems = z5;
        this.accessibilityEnabled = z6;
        this.passToParentLongClickListener = DivActionBinder$passToParentLongClickListener$1.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyDivActions(BindingContext bindingContext, View view, List<C0892k0> list, List<C0892k0> list2, List<C0892k0> list3, List<C0892k0> list4, List<C0892k0> list5, List<C0892k0> list6, List<C0892k0> list7, C1127x2 c1127x2, C0839h0 c0839h0, Expression<Boolean> expression) {
        boolean z4;
        boolean parentIsLongClickable;
        boolean isClickable = view.isClickable();
        boolean isLongClickable = view.isLongClickable();
        List<C0892k0> list8 = list2;
        if (list8.isEmpty()) {
            parentIsLongClickable = DivActionBinderKt.parentIsLongClickable(view);
            if (!parentIsLongClickable) {
                z4 = false;
                DivGestureListener divGestureListener = new DivGestureListener(z4);
                bindLongTapActions(bindingContext, view, list2, list.isEmpty(), expression);
                bindDoubleTapActions(bindingContext, view, divGestureListener, list3, expression);
                bindTapActions(bindingContext, view, divGestureListener, list, this.shouldIgnoreActionMenuItems, expression, list8.isEmpty() || !list3.isEmpty());
                Function2<View, MotionEvent, Boolean> createAnimatedTouchListener = BaseDivViewExtensionsKt.createAnimatedTouchListener(view, bindingContext, CollectionsKt.allIsNullOrEmpty(list, list2, list3) ? c1127x2 : null, divGestureListener);
                Function2<View, MotionEvent, Boolean> createPressTouchListener = createPressTouchListener(bindingContext, view, list6, list7);
                bindHoverActions(bindingContext, view, list4, list5);
                attachTouchListeners(view, createAnimatedTouchListener, createPressTouchListener);
                if (this.accessibilityEnabled) {
                    return;
                }
                if (C0839h0.c.MERGE == bindingContext.getDivView().getPropagatedAccessibilityMode$div_release(view) && bindingContext.getDivView().isDescendantAccessibilityMode$div_release(view)) {
                    view.setClickable(isClickable);
                    view.setLongClickable(isLongClickable);
                }
                bindAccessibilityDelegate(view, list, list2, c0839h0);
                return;
            }
        }
        z4 = true;
        DivGestureListener divGestureListener2 = new DivGestureListener(z4);
        bindLongTapActions(bindingContext, view, list2, list.isEmpty(), expression);
        bindDoubleTapActions(bindingContext, view, divGestureListener2, list3, expression);
        bindTapActions(bindingContext, view, divGestureListener2, list, this.shouldIgnoreActionMenuItems, expression, list8.isEmpty() || !list3.isEmpty());
        Function2<View, MotionEvent, Boolean> createAnimatedTouchListener2 = BaseDivViewExtensionsKt.createAnimatedTouchListener(view, bindingContext, CollectionsKt.allIsNullOrEmpty(list, list2, list3) ? c1127x2 : null, divGestureListener2);
        Function2<View, MotionEvent, Boolean> createPressTouchListener2 = createPressTouchListener(bindingContext, view, list6, list7);
        bindHoverActions(bindingContext, view, list4, list5);
        attachTouchListeners(view, createAnimatedTouchListener2, createPressTouchListener2);
        if (this.accessibilityEnabled) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void attachTouchListeners(View view, Function2<? super View, ? super MotionEvent, Boolean>... function2Arr) {
        final List C4 = AbstractC3219i.C(function2Arr);
        if (C4.isEmpty()) {
            view.setOnTouchListener(null);
        } else {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: y1.d
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean attachTouchListeners$lambda$17;
                    attachTouchListeners$lambda$17 = DivActionBinder.attachTouchListeners$lambda$17(C4, view2, motionEvent);
                    return attachTouchListeners$lambda$17;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachTouchListeners$lambda$17(List nnListeners, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(nnListeners, "$nnListeners");
        Iterator it = nnListeners.iterator();
        while (true) {
            boolean z4 = false;
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                Intrinsics.checkNotNullExpressionValue(view, "view");
                Intrinsics.checkNotNullExpressionValue(motionEvent, "motionEvent");
                if (((Boolean) function2.invoke(view, motionEvent)).booleanValue() || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    private void bindAccessibilityDelegate(View view, List<C0892k0> list, List<C0892k0> list2, C0839h0 c0839h0) {
        AccessibilityDelegateWrapper accessibilityDelegateWrapper;
        C1280a n4 = AbstractC1281a0.n(view);
        DivActionBinder$bindAccessibilityDelegate$action$1 divActionBinder$bindAccessibilityDelegate$action$1 = new DivActionBinder$bindAccessibilityDelegate$action$1(list, list2, view, c0839h0);
        if (n4 instanceof AccessibilityDelegateWrapper) {
            accessibilityDelegateWrapper = (AccessibilityDelegateWrapper) n4;
            accessibilityDelegateWrapper.setActionsAccessibilityNodeInfo(divActionBinder$bindAccessibilityDelegate$action$1);
        } else {
            accessibilityDelegateWrapper = new AccessibilityDelegateWrapper(n4, null, divActionBinder$bindAccessibilityDelegate$action$1, 2, null);
        }
        AbstractC1281a0.o0(view, accessibilityDelegateWrapper);
    }

    private void bindDoubleTapActions(BindingContext bindingContext, View view, DivGestureListener divGestureListener, List<C0892k0> list, Expression<Boolean> expression) {
        Object obj = null;
        if (list.isEmpty()) {
            divGestureListener.setOnDoubleTapListener(null);
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List list2 = ((C0892k0) next).f6756e;
            if (list2 != null && !list2.isEmpty() && !this.shouldIgnoreActionMenuItems) {
                obj = next;
                break;
            }
        }
        C0892k0 c0892k0 = (C0892k0) obj;
        if (c0892k0 == null) {
            divGestureListener.setOnDoubleTapListener(new DivActionBinder$bindDoubleTapActions$2(view, expression, bindingContext, this, list));
            return;
        }
        List list3 = c0892k0.f6756e;
        if (list3 != null) {
            OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(this, bindingContext, list3)).overflowGravity(53);
            Intrinsics.checkNotNullExpressionValue(overflowGravity, "OverflowMenuWrapper(\n   …ity.RIGHT or Gravity.TOP)");
            Div2View divView = bindingContext.getDivView();
            divView.clearSubscriptions();
            divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
            divGestureListener.setOnDoubleTapListener(new DivActionBinder$bindDoubleTapActions$1$1(this, bindingContext, view, c0892k0, expression, overflowGravity));
            return;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable to bind empty menu action: " + c0892k0.f6754c);
        }
    }

    private void bindHoverActions(final BindingContext bindingContext, final View view, final List<C0892k0> list, final List<C0892k0> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            view.setOnHoverListener(null);
        } else {
            view.setOnHoverListener(new View.OnHoverListener() { // from class: y1.e
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view2, MotionEvent motionEvent) {
                    boolean bindHoverActions$lambda$15;
                    bindHoverActions$lambda$15 = DivActionBinder.bindHoverActions$lambda$15(DivActionBinder.this, bindingContext, view, list, list2, view2, motionEvent);
                    return bindHoverActions$lambda$15;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindHoverActions$lambda$15(DivActionBinder this$0, BindingContext context, View target, List startActions, List endActions, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(target, "$target");
        Intrinsics.checkNotNullParameter(startActions, "$startActions");
        Intrinsics.checkNotNullParameter(endActions, "$endActions");
        int action = motionEvent.getAction();
        if (action == 9) {
            this$0.handleBulkActions$div_release(context, target, startActions, "hover");
            return false;
        }
        if (action != 10) {
            return false;
        }
        this$0.handleBulkActions$div_release(context, target, endActions, "unhover");
        return false;
    }

    private void bindLongTapActions(final BindingContext bindingContext, final View view, final List<C0892k0> list, boolean z4, final Expression<Boolean> expression) {
        Object obj;
        if (list.isEmpty()) {
            clearLongClickListener(view, this.longtapActionsPassToChild, z4);
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List list2 = ((C0892k0) obj).f6756e;
            if (list2 != null && !list2.isEmpty() && !this.shouldIgnoreActionMenuItems) {
                break;
            }
        }
        final C0892k0 c0892k0 = (C0892k0) obj;
        if (c0892k0 != null) {
            List list3 = c0892k0.f6756e;
            if (list3 == null) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to bind empty menu action: " + c0892k0.f6754c);
                }
            } else {
                final OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(this, bindingContext, list3)).overflowGravity(53);
                Intrinsics.checkNotNullExpressionValue(overflowGravity, "OverflowMenuWrapper(\n   …ity.RIGHT or Gravity.TOP)");
                Div2View divView = bindingContext.getDivView();
                divView.clearSubscriptions();
                divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: y1.f
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        boolean bindLongTapActions$lambda$10$lambda$9;
                        bindLongTapActions$lambda$10$lambda$9 = DivActionBinder.bindLongTapActions$lambda$10$lambda$9(DivActionBinder.this, c0892k0, bindingContext, expression, overflowGravity, view, list, view2);
                        return bindLongTapActions$lambda$10$lambda$9;
                    }
                });
            }
        } else {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: y1.g
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean bindLongTapActions$lambda$11;
                    bindLongTapActions$lambda$11 = DivActionBinder.bindLongTapActions$lambda$11(Expression.this, bindingContext, this, view, list, view2);
                    return bindLongTapActions$lambda$11;
                }
            });
        }
        if (this.longtapActionsPassToChild) {
            DivActionBinderKt.setPenetratingLongClickable$default(view, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLongTapActions$lambda$10$lambda$9(DivActionBinder this$0, C0892k0 c0892k0, BindingContext context, Expression captureFocusOnAction, OverflowMenuWrapper overflowMenuWrapper, View target, List actions, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(captureFocusOnAction, "$captureFocusOnAction");
        Intrinsics.checkNotNullParameter(overflowMenuWrapper, "$overflowMenuWrapper");
        Intrinsics.checkNotNullParameter(target, "$target");
        Intrinsics.checkNotNullParameter(actions, "$actions");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this$0.divActionBeaconSender.sendTapActionBeacon(c0892k0, context.getExpressionResolver());
        Intrinsics.checkNotNullExpressionValue(it, "it");
        DivActionBinderKt.captureFocusIfNeeded(it, captureFocusOnAction, context.getDivView().getInputFocusTracker$div_release(), context.getExpressionResolver());
        overflowMenuWrapper.getOnMenuClickListener().onClick(target);
        Iterator it2 = actions.iterator();
        while (it2.hasNext()) {
            this$0.logger.logLongClick(context.getDivView(), context.getExpressionResolver(), target, (C0892k0) it2.next(), uuid);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLongTapActions$lambda$11(Expression captureFocusOnAction, BindingContext context, DivActionBinder this$0, View target, List actions, View it) {
        Intrinsics.checkNotNullParameter(captureFocusOnAction, "$captureFocusOnAction");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(target, "$target");
        Intrinsics.checkNotNullParameter(actions, "$actions");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        DivActionBinderKt.captureFocusIfNeeded(it, captureFocusOnAction, context.getDivView().getInputFocusTracker$div_release(), context.getExpressionResolver());
        this$0.handleBulkActions$div_release(context, target, actions, "long_click");
        return true;
    }

    private void bindTapActions(final BindingContext bindingContext, final View view, DivGestureListener divGestureListener, final List<C0892k0> list, boolean z4, final Expression<Boolean> expression, boolean z5) {
        Object obj = null;
        if (list.isEmpty()) {
            if (z5) {
                bindTapActions$setTapListener(divGestureListener, view, new View.OnClickListener() { // from class: y1.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        DivActionBinder.bindTapActions$lambda$2(Expression.this, bindingContext, view2);
                    }
                });
                return;
            }
            divGestureListener.setOnSingleTapListener(null);
            view.setOnClickListener(null);
            view.setClickable(false);
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List list2 = ((C0892k0) next).f6756e;
            if (list2 != null && !list2.isEmpty() && !z4) {
                obj = next;
                break;
            }
        }
        final C0892k0 c0892k0 = (C0892k0) obj;
        if (c0892k0 == null) {
            bindTapActions$setTapListener(divGestureListener, view, new View.OnClickListener() { // from class: y1.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DivActionBinder.bindTapActions$lambda$6(Expression.this, bindingContext, this, view, list, view2);
                }
            });
            return;
        }
        List list3 = c0892k0.f6756e;
        if (list3 != null) {
            final OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(this, bindingContext, list3)).overflowGravity(53);
            Intrinsics.checkNotNullExpressionValue(overflowGravity, "OverflowMenuWrapper(\n   …ity.RIGHT or Gravity.TOP)");
            Div2View divView = bindingContext.getDivView();
            divView.clearSubscriptions();
            divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
            bindTapActions$setTapListener(divGestureListener, view, new View.OnClickListener() { // from class: y1.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DivActionBinder.bindTapActions$lambda$5$lambda$4(DivActionBinder.this, bindingContext, view, c0892k0, expression, overflowGravity, view2);
                }
            });
            return;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable to bind empty menu action: " + c0892k0.f6754c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$2(Expression captureFocusOnAction, BindingContext context, View it) {
        Intrinsics.checkNotNullParameter(captureFocusOnAction, "$captureFocusOnAction");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        DivActionBinderKt.clearFocusIfNeeded(it, captureFocusOnAction, context.getDivView().getInputFocusTracker$div_release(), context.getExpressionResolver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$5$lambda$4(DivActionBinder this$0, BindingContext context, View target, C0892k0 c0892k0, Expression captureFocusOnAction, OverflowMenuWrapper overflowMenuWrapper, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(target, "$target");
        Intrinsics.checkNotNullParameter(captureFocusOnAction, "$captureFocusOnAction");
        Intrinsics.checkNotNullParameter(overflowMenuWrapper, "$overflowMenuWrapper");
        this$0.logger.logClick(context.getDivView(), context.getExpressionResolver(), target, c0892k0);
        this$0.divActionBeaconSender.sendTapActionBeacon(c0892k0, context.getExpressionResolver());
        Intrinsics.checkNotNullExpressionValue(it, "it");
        DivActionBinderKt.captureFocusIfNeeded(it, captureFocusOnAction, context.getDivView().getInputFocusTracker$div_release(), context.getExpressionResolver());
        overflowMenuWrapper.getOnMenuClickListener().onClick(target);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$6(Expression captureFocusOnAction, BindingContext context, DivActionBinder this$0, View target, List actions, View it) {
        Intrinsics.checkNotNullParameter(captureFocusOnAction, "$captureFocusOnAction");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(target, "$target");
        Intrinsics.checkNotNullParameter(actions, "$actions");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        DivActionBinderKt.captureFocusIfNeeded(it, captureFocusOnAction, context.getDivView().getInputFocusTracker$div_release(), context.getExpressionResolver());
        handleBulkActions$div_release$default(this$0, context, target, actions, null, 8, null);
    }

    private static final void bindTapActions$setTapListener(DivGestureListener divGestureListener, View view, View.OnClickListener onClickListener) {
        if (divGestureListener.getOnDoubleTapListener() != null) {
            divGestureListener.setOnSingleTapListener(new DivActionBinder$bindTapActions$setTapListener$1(onClickListener, view));
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    private void clearLongClickListener(View view, boolean z4, boolean z5) {
        boolean parentIsLongClickable;
        if (!z4 || z5) {
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            return;
        }
        parentIsLongClickable = DivActionBinderKt.parentIsLongClickable(view);
        if (parentIsLongClickable) {
            final Function1<View, Boolean> function1 = this.passToParentLongClickListener;
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: y1.k
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean clearLongClickListener$lambda$12;
                    clearLongClickListener$lambda$12 = DivActionBinder.clearLongClickListener$lambda$12(Function1.this, view2);
                    return clearLongClickListener$lambda$12;
                }
            });
            DivActionBinderKt.setPenetratingLongClickable$default(view, null, 1, null);
        } else {
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            DivActionBinderKt.setPenetratingLongClickable(view, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearLongClickListener$lambda$12(Function1 tmp0, View view) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(view)).booleanValue();
    }

    private Function2<View, MotionEvent, Boolean> createPressTouchListener(BindingContext bindingContext, View view, List<C0892k0> list, List<C0892k0> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        return new DivActionBinder$createPressTouchListener$1(this, bindingContext, view, list, list2);
    }

    public static /* synthetic */ boolean handleAction$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, C0892k0 c0892k0, String str, String str2, DivActionHandler divActionHandler, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAction");
        }
        if ((i4 & 16) != 0) {
            str2 = null;
        }
        if ((i4 & 32) != 0) {
            Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            divActionHandler = div2View != null ? div2View.getActionHandler() : null;
        }
        return divActionBinder.handleAction$div_release(divViewFacade, expressionResolver, c0892k0, str, str2, divActionHandler);
    }

    public static /* synthetic */ boolean handleActionWithoutEnableCheck$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, C0892k0 c0892k0, String str, String str2, DivActionHandler divActionHandler, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActionWithoutEnableCheck");
        }
        if ((i4 & 16) != 0) {
            str2 = null;
        }
        if ((i4 & 32) != 0) {
            Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            divActionHandler = div2View != null ? div2View.getActionHandler() : null;
        }
        return divActionBinder.handleActionWithoutEnableCheck$div_release(divViewFacade, expressionResolver, c0892k0, str, str2, divActionHandler);
    }

    public static /* synthetic */ void handleActions$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, List list, String str, Function1 function1, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActions");
        }
        if ((i4 & 16) != 0) {
            function1 = null;
        }
        divActionBinder.handleActions$div_release(divViewFacade, expressionResolver, list, str, function1);
    }

    public static /* synthetic */ void handleBulkActions$div_release$default(DivActionBinder divActionBinder, BindingContext bindingContext, View view, List list, String str, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleBulkActions");
        }
        if ((i4 & 8) != 0) {
            str = c9.f15700d;
        }
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String toDivActionReason(String str) {
        switch (str.hashCode()) {
            case -338877947:
                return !str.equals("long_click") ? C1435b4.f15254e : "long_click";
            case -287575485:
                return !str.equals("unhover") ? C1435b4.f15254e : "unhover";
            case 3027047:
                return !str.equals("blur") ? C1435b4.f15254e : "blur";
            case 94750088:
                return !str.equals(c9.f15700d) ? C1435b4.f15254e : c9.f15700d;
            case 96667352:
                return !str.equals("enter") ? C1435b4.f15254e : "enter";
            case 97604824:
                return !str.equals("focus") ? C1435b4.f15254e : "focus";
            case 99469628:
                return !str.equals("hover") ? C1435b4.f15254e : "hover";
            case 106931267:
                return !str.equals("press") ? C1435b4.f15254e : "press";
            case 1090594823:
                return !str.equals("release") ? C1435b4.f15254e : "release";
            case 1374143386:
                return !str.equals("double_click") ? C1435b4.f15254e : "double_click";
            default:
                return C1435b4.f15254e;
        }
    }

    public void bindDivActions(@NotNull BindingContext context, @NotNull View target, @Nullable List<C0892k0> list, @Nullable List<C0892k0> list2, @Nullable List<C0892k0> list3, @Nullable List<C0892k0> list4, @Nullable List<C0892k0> list5, @Nullable List<C0892k0> list6, @Nullable List<C0892k0> list7, @NotNull C1127x2 actionAnimation, @Nullable C0839h0 c0839h0, @NotNull Expression<Boolean> captureFocusOnAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(actionAnimation, "actionAnimation");
        Intrinsics.checkNotNullParameter(captureFocusOnAction, "captureFocusOnAction");
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        DivActionBinder$bindDivActions$onApply$1 divActionBinder$bindDivActions$onApply$1 = new DivActionBinder$bindDivActions$onApply$1(list, expressionResolver, list3, list2, list4, list5, list6, list7, this, context, target, actionAnimation, c0839h0, captureFocusOnAction);
        DivActionBinderKt.observe(target, (List<C0892k0>) list, expressionResolver, (Function1<Object, Unit>) new DivActionBinder$bindDivActions$1$1(divActionBinder$bindDivActions$onApply$1));
        DivActionBinderKt.observe(target, (List<C0892k0>) list2, expressionResolver, (Function1<Object, Unit>) new DivActionBinder$bindDivActions$1$2(divActionBinder$bindDivActions$onApply$1));
        DivActionBinderKt.observe(target, (List<C0892k0>) list3, expressionResolver, (Function1<Object, Unit>) new DivActionBinder$bindDivActions$1$3(divActionBinder$bindDivActions$onApply$1));
        DivActionBinderKt.observe(target, (Expression<Boolean>) captureFocusOnAction, expressionResolver, (Function1<Object, Unit>) new DivActionBinder$bindDivActions$1$4(divActionBinder$bindDivActions$onApply$1));
        divActionBinder$bindDivActions$onApply$1.invoke();
    }

    public boolean handleAction$div_release(@NotNull DivViewFacade divView, @NotNull ExpressionResolver resolver, @NotNull C0892k0 action, @NotNull String reason, @Nullable String str, @Nullable DivActionHandler divActionHandler) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (((Boolean) action.f6753b.evaluate(resolver)).booleanValue()) {
            return handleActionWithoutEnableCheck$div_release(divView, resolver, action, reason, str, divActionHandler);
        }
        return false;
    }

    public boolean handleActionWithoutEnableCheck$div_release(@NotNull DivViewFacade divView, @NotNull ExpressionResolver resolver, @NotNull C0892k0 action, @NotNull String reason, @Nullable String str, @Nullable DivActionHandler divActionHandler) {
        String str2;
        ExpressionResolver expressionResolver;
        C0892k0 c0892k0;
        DivViewFacade divViewFacade;
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (!this.actionHandler.getUseActionUid() || str == null) {
            if (divActionHandler == null || !divActionHandler.handleActionWithReason(action, divView, resolver, reason)) {
                return this.actionHandler.handleActionWithReason(action, divView, resolver, reason);
            }
            return true;
        }
        if (divActionHandler != null) {
            divViewFacade = divView;
            str2 = reason;
            expressionResolver = resolver;
            c0892k0 = action;
            if (divActionHandler.handleActionWithReason(c0892k0, divViewFacade, expressionResolver, str, str2)) {
                return true;
            }
        } else {
            str2 = reason;
            expressionResolver = resolver;
            c0892k0 = action;
            divViewFacade = divView;
        }
        return this.actionHandler.handleActionWithReason(c0892k0, divViewFacade, expressionResolver, str, str2);
    }

    public void handleActions$div_release(@NotNull DivViewFacade divView, @NotNull ExpressionResolver resolver, @Nullable List<C0892k0> list, @NotNull String reason, @Nullable Function1<? super C0892k0, Unit> function1) {
        List<C0892k0> onlyEnabled;
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (list == null) {
            return;
        }
        onlyEnabled = DivActionBinderKt.onlyEnabled(list, resolver);
        for (C0892k0 c0892k0 : onlyEnabled) {
            DivViewFacade divViewFacade = divView;
            ExpressionResolver expressionResolver = resolver;
            String str = reason;
            handleActionWithoutEnableCheck$div_release$default(this, divViewFacade, expressionResolver, c0892k0, str, null, null, 48, null);
            if (function1 != null) {
                function1.invoke(c0892k0);
            }
            divView = divViewFacade;
            resolver = expressionResolver;
            reason = str;
        }
    }

    public void handleBulkActions$div_release(@NotNull BindingContext context, @NotNull View target, @NotNull List<C0892k0> actions, @NotNull String actionLogType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(actionLogType, "actionLogType");
        Div2View divView = context.getDivView();
        divView.bulkActions$div_release(new DivActionBinder$handleBulkActions$1(actions, context.getExpressionResolver(), actionLogType, this, divView, target));
    }

    public void handleTapClick$div_release(@NotNull BindingContext context, @NotNull View target, @NotNull List<C0892k0> actions) {
        List onlyEnabled;
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(actions, "actions");
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        onlyEnabled = DivActionBinderKt.onlyEnabled(actions, expressionResolver);
        Iterator it = onlyEnabled.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List list = ((C0892k0) obj).f6756e;
            if (!(list == null || list.isEmpty())) {
                break;
            }
        }
        C0892k0 c0892k0 = (C0892k0) obj;
        if (c0892k0 == null) {
            handleBulkActions$div_release$default(this, context, target, onlyEnabled, null, 8, null);
            return;
        }
        List list2 = c0892k0.f6756e;
        if (list2 == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable to bind empty menu action: " + c0892k0.f6754c);
                return;
            }
            return;
        }
        OverflowMenuWrapper overflowGravity = new OverflowMenuWrapper(target.getContext(), target, context.getDivView()).listener(new MenuWrapperListener(this, context, list2)).overflowGravity(53);
        Intrinsics.checkNotNullExpressionValue(overflowGravity, "OverflowMenuWrapper(\n   …ity.RIGHT or Gravity.TOP)");
        Div2View divView = context.getDivView();
        divView.clearSubscriptions();
        divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowGravity));
        this.logger.logClick(context.getDivView(), expressionResolver, target, c0892k0);
        this.divActionBeaconSender.sendTapActionBeacon(c0892k0, expressionResolver);
        overflowGravity.getOnMenuClickListener().onClick(target);
    }
}
