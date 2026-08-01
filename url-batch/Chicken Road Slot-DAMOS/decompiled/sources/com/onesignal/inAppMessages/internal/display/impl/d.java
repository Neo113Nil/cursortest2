package com.onesignal.inAppMessages.internal.display.impl;

import a2.r;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.onesignal.common.AndroidUtils;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.onesignal.inAppMessages.internal.display.impl.n;
import ge.a0;
import ge.k0;
import ge.x;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {
    private static final int ACTIVITY_BACKGROUND_COLOR_EMPTY = 0;
    private static final int ACTIVITY_FINISH_AFTER_DISMISS_DELAY_MS = 600;
    private static final int ACTIVITY_INIT_DELAY = 200;
    private static final int IN_APP_BACKGROUND_ANIMATION_DURATION_MS = 400;
    private static final int IN_APP_BANNER_ANIMATION_DURATION_MS = 1000;
    private static final int IN_APP_CENTER_ANIMATION_DURATION_MS = 1000;
    private static final String IN_APP_MESSAGE_CARD_VIEW_TAG = "IN_APP_MESSAGE_CARD_VIEW_TAG";
    private boolean cancelDismissTimer;
    private Activity currentActivity;
    private final boolean disableDragDismiss;
    private final double displayDuration;
    private final n.c displayPosition;
    private com.onesignal.inAppMessages.internal.display.impl.a draggableRelativeLayout;
    private final boolean hasBackground;
    private final boolean hideGrayOverlay;
    private boolean isDismissTimerSet;
    private boolean isDragging;
    private int marginPxSizeBottom;
    private int marginPxSizeLeft;
    private int marginPxSizeRight;
    private int marginPxSizeTop;
    private final com.onesignal.inAppMessages.internal.d messageContent;
    private com.onesignal.inAppMessages.internal.display.impl.e messageController;
    private int pageHeight;
    private final int pageWidth;
    private RelativeLayout parentRelativeLayout;
    private com.onesignal.inAppMessages.internal.display.impl.h popupWindow;
    private final f popupWindowListener;
    private boolean shouldDismissWhenActive;
    private WebView webView;
    public static final a Companion = new a(null);
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor("#BB000000");
    private static final int DRAG_THRESHOLD_PX_SIZE = com.onesignal.common.m.INSTANCE.dpToPx(4);

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ com.onesignal.common.threading.c $waiter;

        public b(com.onesignal.common.threading.c cVar) {
            this.$waiter = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            animator.getClass();
            d.this.cleanupViewsAfterDismiss();
            this.$waiter.wake();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c implements Animation.AnimationListener {
        final /* synthetic */ r.a $messageViewCardView;
        final /* synthetic */ d this$0;

        public c(r.a aVar, d dVar) {
            this.$messageViewCardView = aVar;
            this.this$0 = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            animation.getClass();
            if (this.this$0.messageController != null) {
                com.onesignal.inAppMessages.internal.display.impl.e eVar = this.this$0.messageController;
                eVar.getClass();
                eVar.onMessageWasDisplayed();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            animation.getClass();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            animation.getClass();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.d$d, reason: collision with other inner class name */
    public static final class C0028d extends nd.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0028d(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.delayShowUntilAvailable(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.i implements Function2 {
        int label;

        public e(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return d.this.new e(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((e) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            if (r6.animateAndDismissLayout(r1, r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
        
            if (ge.a0.i(600, r5) == r0) goto L19;
         */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                this.label = 1;
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            if (!d.this.hasBackground || d.this.parentRelativeLayout == null) {
                d.this.cleanupViewsAfterDismiss();
            } else {
                d dVar = d.this;
                RelativeLayout relativeLayout = dVar.parentRelativeLayout;
                relativeLayout.getClass();
                this.label = 2;
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f implements com.onesignal.inAppMessages.internal.display.impl.g {
        public f() {
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.g
        public void onDismiss(Boolean bool) {
            if (Intrinsics.a(bool, Boolean.TRUE)) {
                return;
            }
            com.onesignal.debug.internal.logging.b.debug$default("PopupWindowListener.onDismiss called by the system.", null, 2, null);
            com.onesignal.inAppMessages.internal.display.impl.e eVar = d.this.messageController;
            if (eVar != null) {
                eVar.onMessageWasDismissed();
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g implements com.onesignal.inAppMessages.internal.display.impl.b {

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends nd.i implements Function1 {
            int label;
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, ld.a aVar) {
                super(1, aVar);
                this.this$0 = dVar;
            }

            @Override // nd.a
            public final ld.a create(ld.a aVar) {
                return new a(this.this$0, aVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(ld.a aVar) {
                return ((a) create(aVar)).invokeSuspend(Unit.f5554a);
            }

            @Override // nd.a
            public final Object invokeSuspend(Object obj) {
                md.a aVar = md.a.f6622d;
                int i3 = this.label;
                if (i3 == 0) {
                    cf.c.M(obj);
                    d dVar = this.this$0;
                    this.label = 1;
                    if (dVar.finishAfterDelay(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            }
        }

        public g() {
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.b
        public void onDismiss() {
            if (d.this.messageController != null) {
                com.onesignal.inAppMessages.internal.display.impl.e eVar = d.this.messageController;
                eVar.getClass();
                eVar.onMessageWillDismiss();
            }
            com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(d.this, null), 1, null);
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.b
        public void onDragEnd() {
            d.this.isDragging = false;
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.b
        public void onDragStart() {
            d.this.isDragging = true;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends nd.i implements Function2 {
        final /* synthetic */ n.c $displayLocation;
        final /* synthetic */ RelativeLayout.LayoutParams $draggableRelativeLayoutParams;
        final /* synthetic */ RelativeLayout.LayoutParams $relativeLayoutParams;
        final /* synthetic */ a.b $webViewLayoutParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, a.b bVar, n.c cVar, ld.a aVar) {
            super(2, aVar);
            this.$relativeLayoutParams = layoutParams;
            this.$draggableRelativeLayoutParams = layoutParams2;
            this.$webViewLayoutParams = bVar;
            this.$displayLocation = cVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return d.this.new h(this.$relativeLayoutParams, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams, this.$displayLocation, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((h) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                if (d.this.webView == null) {
                    return Unit.f5554a;
                }
                WebView webView = d.this.webView;
                webView.getClass();
                webView.setLayoutParams(this.$relativeLayoutParams);
                d dVar = d.this;
                Activity activity = dVar.currentActivity;
                activity.getClass();
                dVar.setUpDraggableLayout(activity, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams);
                d dVar2 = d.this;
                Activity activity2 = dVar2.currentActivity;
                activity2.getClass();
                dVar2.setUpParentRelativeLayout(activity2);
                d dVar3 = d.this;
                RelativeLayout relativeLayout = dVar3.parentRelativeLayout;
                relativeLayout.getClass();
                dVar3.createPopupWindow(relativeLayout);
                if (d.this.messageController != null) {
                    d dVar4 = d.this;
                    n.c cVar = this.$displayLocation;
                    com.onesignal.inAppMessages.internal.display.impl.a aVar2 = dVar4.draggableRelativeLayout;
                    aVar2.getClass();
                    RelativeLayout relativeLayout2 = d.this.parentRelativeLayout;
                    relativeLayout2.getClass();
                    dVar4.animateInAppMessage(cVar, aVar2, relativeLayout2);
                }
                d dVar5 = d.this;
                this.label = 1;
                if (dVar5.startDismissTimerIfNeeded(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class i extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public i(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.startDismissTimerIfNeeded(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class j extends nd.i implements Function2 {
        final /* synthetic */ int $pageHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i3, ld.a aVar) {
            super(2, aVar);
            this.$pageHeight = i3;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return d.this.new j(this.$pageHeight, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((j) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            if (d.this.webView == null) {
                com.onesignal.debug.internal.logging.b.warn$default("WebView height update skipped, new height will be used once it is displayed.", null, 2, null);
                return Unit.f5554a;
            }
            WebView webView = d.this.webView;
            webView.getClass();
            ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
            if (layoutParams == null) {
                com.onesignal.debug.internal.logging.b.warn$default("WebView height update skipped because of null layoutParams, new height will be used once it is displayed.", null, 2, null);
                return Unit.f5554a;
            }
            layoutParams.height = this.$pageHeight;
            WebView webView2 = d.this.webView;
            webView2.getClass();
            webView2.setLayoutParams(layoutParams);
            if (d.this.draggableRelativeLayout != null) {
                com.onesignal.inAppMessages.internal.display.impl.a aVar2 = d.this.draggableRelativeLayout;
                aVar2.getClass();
                d dVar = d.this;
                aVar2.setParams(dVar.createDraggableLayoutParams(this.$pageHeight, dVar.getDisplayPosition(), d.this.disableDragDismiss));
            }
            return Unit.f5554a;
        }
    }

    public d(WebView webView, com.onesignal.inAppMessages.internal.d dVar, boolean z10, boolean z11) {
        double doubleValue;
        dVar.getClass();
        this.webView = webView;
        this.messageContent = dVar;
        this.disableDragDismiss = z10;
        this.hideGrayOverlay = z11;
        this.pageWidth = -1;
        this.pageHeight = dVar.getPageHeight();
        com.onesignal.common.m mVar = com.onesignal.common.m.INSTANCE;
        this.marginPxSizeLeft = mVar.dpToPx(24);
        this.marginPxSizeRight = mVar.dpToPx(24);
        this.marginPxSizeTop = mVar.dpToPx(24);
        this.marginPxSizeBottom = mVar.dpToPx(24);
        n.c displayLocation = dVar.getDisplayLocation();
        displayLocation.getClass();
        this.displayPosition = displayLocation;
        if (dVar.getDisplayDuration() == null) {
            doubleValue = 0.0d;
        } else {
            Double displayDuration = dVar.getDisplayDuration();
            displayDuration.getClass();
            doubleValue = displayDuration.doubleValue();
        }
        this.displayDuration = doubleValue;
        this.hasBackground = !displayLocation.isBanner();
        this.popupWindowListener = new f();
        setMarginsFromContent(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateAndDismissLayout(View view, ld.a aVar) {
        com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
        animateBackgroundColor(view, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, getOverlayColor(), 0, new b(cVar)).start();
        Object waitForWake = cVar.waitForWake(aVar);
        return waitForWake == md.a.f6622d ? waitForWake : Unit.f5554a;
    }

    private final ValueAnimator animateBackgroundColor(View view, int i3, int i10, int i11, Animator.AnimatorListener animatorListener) {
        return k.INSTANCE.animateViewColor(view, i3, i10, i11, animatorListener);
    }

    private final void animateBottom(View view, int i3, Animation.AnimationListener animationListener) {
        k.INSTANCE.animateViewByTranslation(view, i3 + this.marginPxSizeBottom, 0.0f, 1000, new l(0.1d, 8.0d), animationListener).start();
    }

    private final void animateCenter(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animateViewSmallToLarge = k.INSTANCE.animateViewSmallToLarge(view, 1000, new l(0.1d, 8.0d), animationListener);
        ValueAnimator animateBackgroundColor = animateBackgroundColor(view2, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, 0, getOverlayColor(), animatorListener);
        animateViewSmallToLarge.start();
        animateBackgroundColor.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateInAppMessage(n.c cVar, View view, View view2) {
        view.getClass();
        r.a aVar = (r.a) view.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        aVar.getClass();
        Animation.AnimationListener createAnimationListener = createAnimationListener(aVar);
        int i3 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i3 == 1) {
            WebView webView = this.webView;
            webView.getClass();
            animateTop(aVar, webView.getHeight(), createAnimationListener);
        } else if (i3 == 2) {
            WebView webView2 = this.webView;
            webView2.getClass();
            animateBottom(aVar, webView2.getHeight(), createAnimationListener);
        } else if (i3 == 3 || i3 == 4) {
            animateCenter(view, view2, createAnimationListener, null);
        }
    }

    private final void animateTop(View view, int i3, Animation.AnimationListener animationListener) {
        k.INSTANCE.animateViewByTranslation(view, (-i3) - this.marginPxSizeTop, 0.0f, 1000, new l(0.1d, 8.0d), animationListener).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupViewsAfterDismiss() {
        removeAllViews();
        com.onesignal.inAppMessages.internal.display.impl.e eVar = this.messageController;
        if (eVar != null) {
            eVar.onMessageWasDismissed();
        }
    }

    private final Animation.AnimationListener createAnimationListener(r.a aVar) {
        return new c(aVar, this);
    }

    private final r.a createCardView(Context context) {
        r.a aVar = new r.a(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.displayPosition == n.c.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        aVar.setLayoutParams(layoutParams);
        if (getHideDropShadow(context)) {
            aVar.setCardElevation(0.0f);
        } else {
            aVar.setCardElevation(com.onesignal.common.m.INSTANCE.dpToPx(5));
        }
        aVar.setRadius(com.onesignal.common.m.INSTANCE.dpToPx(8));
        aVar.setClipChildren(false);
        aVar.setClipToPadding(false);
        aVar.setPreventCornerOverlap(false);
        aVar.setCardBackgroundColor(0);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.b createDraggableLayoutParams(int i3, n.c cVar, boolean z10) {
        a.b bVar = new a.b();
        bVar.setMaxXPos(this.marginPxSizeRight);
        bVar.setMaxYPos(this.marginPxSizeTop);
        bVar.setDraggingDisabled(z10);
        bVar.setMessageHeight(i3);
        bVar.setHeight(getDisplayYSize());
        int i10 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i10 == 1) {
            bVar.setDragThresholdY(this.marginPxSizeTop - DRAG_THRESHOLD_PX_SIZE);
        } else if (i10 == 2) {
            bVar.setPosY(getDisplayYSize() - i3);
            bVar.setDragThresholdY(this.marginPxSizeBottom + DRAG_THRESHOLD_PX_SIZE);
        } else if (i10 == 3) {
            int displayYSize = (getDisplayYSize() / 2) - (i3 / 2);
            bVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize);
            bVar.setMaxYPos(displayYSize);
            bVar.setPosY(displayYSize);
        } else if (i10 == 4) {
            int displayYSize2 = getDisplayYSize() - (this.marginPxSizeBottom + this.marginPxSizeTop);
            bVar.setMessageHeight(displayYSize2);
            int displayYSize3 = (getDisplayYSize() / 2) - (displayYSize2 / 2);
            bVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize3);
            bVar.setMaxYPos(displayYSize3);
            bVar.setPosY(displayYSize3);
        }
        bVar.setDragDirection(cVar == n.c.TOP_BANNER ? 0 : 1);
        return bVar;
    }

    private final RelativeLayout.LayoutParams createParentRelativeLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.pageWidth, -1);
        int i3 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
        if (i3 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i3 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i3 != 3 && i3 != 4) {
            return layoutParams;
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPopupWindow(RelativeLayout relativeLayout) {
        boolean z10 = this.hasBackground;
        com.onesignal.inAppMessages.internal.display.impl.h hVar = new com.onesignal.inAppMessages.internal.display.impl.h(relativeLayout, z10 ? -1 : this.pageWidth, z10 ? -1 : -2, false, this.popupWindowListener);
        this.popupWindow = hVar;
        hVar.setBackgroundDrawable(new ColorDrawable(0));
        com.onesignal.inAppMessages.internal.display.impl.h hVar2 = this.popupWindow;
        int i3 = 1;
        if (hVar2 != null) {
            hVar2.setTouchable(true);
        }
        com.onesignal.inAppMessages.internal.display.impl.h hVar3 = this.popupWindow;
        if (hVar3 != null) {
            hVar3.setFocusable(!this.displayPosition.isBanner());
        }
        com.onesignal.inAppMessages.internal.display.impl.h hVar4 = this.popupWindow;
        if (hVar4 != null) {
            hVar4.setClippingEnabled(false);
        }
        if (this.hasBackground) {
            i3 = 0;
        } else {
            int i10 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
            if (i10 == 1) {
                i3 = 49;
            } else if (i10 == 2) {
                i3 = 81;
            } else if (i10 != 3 && i10 != 4) {
                r.p();
                return;
            }
        }
        int i11 = this.messageContent.isFullBleed() ? 1000 : 1003;
        com.onesignal.inAppMessages.internal.display.impl.h hVar5 = this.popupWindow;
        hVar5.getClass();
        hVar5.setWindowLayoutType(i11);
        com.onesignal.inAppMessages.internal.display.impl.h hVar6 = this.popupWindow;
        if (hVar6 != null) {
            Activity activity = this.currentActivity;
            activity.getClass();
            hVar6.showAtLocation(activity.getWindow().getDecorView().getRootView(), i3, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r2.delayShowUntilAvailable(r7, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (showInAppMessageView(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayShowUntilAvailable(Activity activity, ld.a aVar) {
        C0028d c0028d;
        int i3;
        d dVar;
        if (aVar instanceof C0028d) {
            c0028d = (C0028d) aVar;
            int i10 = c0028d.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0028d.label = i10 - Integer.MIN_VALUE;
                Object obj = c0028d.result;
                md.a aVar2 = md.a.f6622d;
                i3 = c0028d.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    if (AndroidUtils.INSTANCE.isActivityFullyReady(activity) && this.parentRelativeLayout == null) {
                        c0028d.label = 1;
                    } else {
                        c0028d.L$0 = this;
                        c0028d.L$1 = activity;
                        c0028d.label = 2;
                        if (a0.i(200L, c0028d) != aVar2) {
                            dVar = this;
                            c0028d.L$0 = null;
                            c0028d.L$1 = null;
                            c0028d.label = 3;
                        }
                    }
                    return aVar2;
                }
                if (i3 == 1) {
                    cf.c.M(obj);
                    return Unit.f5554a;
                }
                if (i3 != 2) {
                    if (i3 == 3) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                activity = (Activity) c0028d.L$1;
                dVar = (d) c0028d.L$0;
                cf.c.M(obj);
                c0028d.L$0 = null;
                c0028d.L$1 = null;
                c0028d.label = 3;
            }
        }
        c0028d = new C0028d(aVar);
        Object obj2 = c0028d.result;
        md.a aVar22 = md.a.f6622d;
        i3 = c0028d.label;
        if (i3 != 0) {
        }
    }

    private final void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishAfterDelay(ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(le.o.f5995a, new e(null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    private final int getDisplayYSize() {
        com.onesignal.common.m mVar = com.onesignal.common.m.INSTANCE;
        Activity activity = this.currentActivity;
        activity.getClass();
        return mVar.getWindowHeight(activity);
    }

    private final boolean getHideDropShadow(Context context) {
        return AndroidUtils.INSTANCE.getManifestMetaBoolean(context, "com.onesignal.inAppMessageHideDropShadow");
    }

    private final int getOverlayColor() {
        if (this.hideGrayOverlay) {
            return 0;
        }
        return ACTIVITY_BACKGROUND_COLOR_FULL;
    }

    private final void setMarginsFromContent(com.onesignal.inAppMessages.internal.d dVar) {
        this.marginPxSizeTop = dVar.getUseHeightMargin() ? com.onesignal.common.m.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeBottom = dVar.getUseHeightMargin() ? com.onesignal.common.m.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeLeft = dVar.getUseWidthMargin() ? com.onesignal.common.m.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeRight = dVar.getUseWidthMargin() ? com.onesignal.common.m.INSTANCE.dpToPx(24) : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpDraggableLayout(Context context, RelativeLayout.LayoutParams layoutParams, a.b bVar) {
        com.onesignal.inAppMessages.internal.display.impl.a aVar = new com.onesignal.inAppMessages.internal.display.impl.a(context);
        this.draggableRelativeLayout = aVar;
        if (layoutParams != null) {
            aVar.setLayoutParams(layoutParams);
        }
        com.onesignal.inAppMessages.internal.display.impl.a aVar2 = this.draggableRelativeLayout;
        aVar2.getClass();
        aVar2.setParams(bVar);
        com.onesignal.inAppMessages.internal.display.impl.a aVar3 = this.draggableRelativeLayout;
        aVar3.getClass();
        aVar3.setListener(new g());
        WebView webView = this.webView;
        webView.getClass();
        if (webView.getParent() != null) {
            WebView webView2 = this.webView;
            webView2.getClass();
            ViewParent parent = webView2.getParent();
            parent.getClass();
            ((ViewGroup) parent).removeAllViews();
        }
        r.a createCardView = createCardView(context);
        createCardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        createCardView.addView(this.webView);
        com.onesignal.inAppMessages.internal.display.impl.a aVar4 = this.draggableRelativeLayout;
        aVar4.getClass();
        aVar4.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        com.onesignal.inAppMessages.internal.display.impl.a aVar5 = this.draggableRelativeLayout;
        aVar5.getClass();
        aVar5.setClipChildren(false);
        com.onesignal.inAppMessages.internal.display.impl.a aVar6 = this.draggableRelativeLayout;
        aVar6.getClass();
        aVar6.setClipToPadding(false);
        com.onesignal.inAppMessages.internal.display.impl.a aVar7 = this.draggableRelativeLayout;
        aVar7.getClass();
        aVar7.addView(createCardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpParentRelativeLayout(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout2 = this.parentRelativeLayout;
        relativeLayout2.getClass();
        relativeLayout2.setClipChildren(false);
        RelativeLayout relativeLayout3 = this.parentRelativeLayout;
        relativeLayout3.getClass();
        relativeLayout3.setClipToPadding(false);
        RelativeLayout relativeLayout4 = this.parentRelativeLayout;
        relativeLayout4.getClass();
        relativeLayout4.addView(this.draggableRelativeLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showDraggableView(n.c cVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, a.b bVar, ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(le.o.f5995a, new h(layoutParams, layoutParams2, bVar, cVar, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startDismissTimerIfNeeded(ld.a aVar) {
        i iVar;
        int i3;
        d dVar;
        d dVar2;
        if (aVar instanceof i) {
            iVar = (i) aVar;
            int i10 = iVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.label = i10 - Integer.MIN_VALUE;
                Object obj = iVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = iVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    double d10 = this.displayDuration;
                    if (d10 <= 0.0d || this.isDismissTimerSet) {
                        return Unit.f5554a;
                    }
                    this.isDismissTimerSet = true;
                    iVar.L$0 = this;
                    iVar.label = 1;
                    if (a0.i(((long) d10) * 1000, iVar) != aVar2) {
                        dVar = this;
                    }
                    return aVar2;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar2 = (d) iVar.L$0;
                    cf.c.M(obj);
                    dVar2.isDismissTimerSet = false;
                    return Unit.f5554a;
                }
                dVar = (d) iVar.L$0;
                cf.c.M(obj);
                if (!dVar.cancelDismissTimer) {
                    dVar.cancelDismissTimer = false;
                    return Unit.f5554a;
                }
                com.onesignal.inAppMessages.internal.display.impl.e eVar = dVar.messageController;
                if (eVar != null) {
                    eVar.getClass();
                    eVar.onMessageWillDismiss();
                }
                if (dVar.currentActivity == null) {
                    dVar.shouldDismissWhenActive = true;
                    return Unit.f5554a;
                }
                iVar.L$0 = dVar;
                iVar.label = 2;
                if (dVar.dismissAndAwaitNextMessage(iVar) != aVar2) {
                    dVar2 = dVar;
                    dVar2.isDismissTimerSet = false;
                    return Unit.f5554a;
                }
                return aVar2;
            }
        }
        iVar = new i(aVar);
        Object obj2 = iVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = iVar.label;
        if (i3 != 0) {
        }
        if (!dVar.cancelDismissTimer) {
        }
    }

    public final Object checkIfShouldDismiss(ld.a aVar) {
        if (!this.shouldDismissWhenActive) {
            return Unit.f5554a;
        }
        this.shouldDismissWhenActive = false;
        Object finishAfterDelay = finishAfterDelay(aVar);
        return finishAfterDelay == md.a.f6622d ? finishAfterDelay : Unit.f5554a;
    }

    public final Object dismissAndAwaitNextMessage(ld.a aVar) {
        com.onesignal.inAppMessages.internal.display.impl.a aVar2 = this.draggableRelativeLayout;
        if (aVar2 == null) {
            com.onesignal.debug.internal.logging.b.error$default("No host presenter to trigger dismiss animation, counting as dismissed already", null, 2, null);
            dereferenceViews();
            return Unit.f5554a;
        }
        aVar2.getClass();
        aVar2.dismiss();
        Object finishAfterDelay = finishAfterDelay(aVar);
        return finishAfterDelay == md.a.f6622d ? finishAfterDelay : Unit.f5554a;
    }

    public final n.c getDisplayPosition() {
        return this.displayPosition;
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public final void removeAllViews() {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessageView.removeAllViews()", null, 2, null);
        com.onesignal.inAppMessages.internal.display.impl.h hVar = this.popupWindow;
        if (hVar != null) {
            hVar.setWasDismissedManually(Boolean.TRUE);
        }
        if (this.isDismissTimerSet) {
            this.cancelDismissTimer = true;
        }
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.draggableRelativeLayout;
        if (aVar != null) {
            aVar.removeAllViews();
        }
        com.onesignal.inAppMessages.internal.display.impl.h hVar2 = this.popupWindow;
        if (hVar2 != null) {
            hVar2.dismiss();
        }
        dereferenceViews();
    }

    public final void setMessageController(com.onesignal.inAppMessages.internal.display.impl.e eVar) {
        this.messageController = eVar;
    }

    public final void setWebView(WebView webView) {
        webView.getClass();
        this.webView = webView;
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
    }

    public final Object showInAppMessageView(Activity activity, ld.a aVar) {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams createParentRelativeLayoutParams = this.hasBackground ? createParentRelativeLayoutParams() : null;
        n.c cVar = this.displayPosition;
        Object showDraggableView = showDraggableView(cVar, layoutParams, createParentRelativeLayoutParams, createDraggableLayoutParams(this.pageHeight, cVar, this.disableDragDismiss), aVar);
        return showDraggableView == md.a.f6622d ? showDraggableView : Unit.f5554a;
    }

    public final Object showView(Activity activity, ld.a aVar) {
        Object delayShowUntilAvailable = delayShowUntilAvailable(activity, aVar);
        return delayShowUntilAvailable == md.a.f6622d ? delayShowUntilAvailable : Unit.f5554a;
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.currentActivity + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", displayDuration=" + this.displayDuration + ", hasBackground=" + this.hasBackground + ", shouldDismissWhenActive=" + this.shouldDismissWhenActive + ", isDragging=" + this.isDragging + ", disableDragDismiss=" + this.disableDragDismiss + ", displayLocation=" + this.displayPosition + ", webView=" + this.webView + '}';
    }

    public final Object updateHeight(int i3, ld.a aVar) {
        this.pageHeight = i3;
        ne.e eVar = k0.f4372a;
        Object B = a0.B(le.o.f5995a, new j(i3, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
