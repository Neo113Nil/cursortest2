package com.onesignal.inAppMessages.internal.display.impl;

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
import com.onesignal.inAppMessages.internal.display.impl.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import t.C0899a;
import u6.C0953e;

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
    private final m.c displayPosition;
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

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends AnimatorListenerAdapter {
        final /* synthetic */ com.onesignal.common.threading.d $waiter;

        public b(com.onesignal.common.threading.d dVar) {
            this.$waiter = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            d.this.cleanupViewsAfterDismiss();
            this.$waiter.wake();
        }
    }

    public static final class c implements Animation.AnimationListener {
        final /* synthetic */ C0899a $messageViewCardView;
        final /* synthetic */ d this$0;

        public c(C0899a c0899a, d dVar) {
            this.$messageViewCardView = c0899a;
            this.this$0 = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (this.this$0.messageController != null) {
                com.onesignal.inAppMessages.internal.display.impl.e eVar = this.this$0.messageController;
                Intrinsics.b(eVar);
                eVar.onMessageWasDisplayed();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.d$d, reason: collision with other inner class name */
    public static final class C0035d extends X5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0035d(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.delayShowUntilAvailable(null, this);
        }
    }

    public static final class e extends X5.j implements Function2 {
        int label;

        public e(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return d.this.new e(bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        
            if (r6.animateAndDismissLayout(r1, r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
        
            if (n6.AbstractC0792z.d(600, r5) == r0) goto L19;
         */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                this.label = 1;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return Unit.f6114a;
                }
                V6.b.P(obj);
            }
            if (!d.this.hasBackground || d.this.parentRelativeLayout == null) {
                d.this.cleanupViewsAfterDismiss();
            } else {
                d dVar = d.this;
                RelativeLayout relativeLayout = dVar.parentRelativeLayout;
                Intrinsics.b(relativeLayout);
                this.label = 2;
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((e) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

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

    public static final class g implements com.onesignal.inAppMessages.internal.display.impl.b {

        public static final class a extends X5.j implements Function1 {
            int label;
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, V5.b bVar) {
                super(1, bVar);
                this.this$0 = dVar;
            }

            @Override // X5.a
            public final V5.b create(V5.b bVar) {
                return new a(this.this$0, bVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(V5.b bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
            }

            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                W5.a aVar = W5.a.f2787d;
                int i2 = this.label;
                if (i2 == 0) {
                    V6.b.P(obj);
                    d dVar = this.this$0;
                    this.label = 1;
                    if (dVar.finishAfterDelay(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                return Unit.f6114a;
            }
        }

        public g() {
        }

        @Override // com.onesignal.inAppMessages.internal.display.impl.b
        public void onDismiss() {
            if (d.this.messageController != null) {
                com.onesignal.inAppMessages.internal.display.impl.e eVar = d.this.messageController;
                Intrinsics.b(eVar);
                eVar.onMessageWillDismiss();
            }
            com.onesignal.common.threading.b.suspendifyOnIO(new a(d.this, null));
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

    public static final class h extends X5.j implements Function2 {
        final /* synthetic */ m.c $displayLocation;
        final /* synthetic */ RelativeLayout.LayoutParams $draggableRelativeLayoutParams;
        final /* synthetic */ RelativeLayout.LayoutParams $relativeLayoutParams;
        final /* synthetic */ a.b $webViewLayoutParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, a.b bVar, m.c cVar, V5.b bVar2) {
            super(2, bVar2);
            this.$relativeLayoutParams = layoutParams;
            this.$draggableRelativeLayoutParams = layoutParams2;
            this.$webViewLayoutParams = bVar;
            this.$displayLocation = cVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return d.this.new h(this.$relativeLayoutParams, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams, this.$displayLocation, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                if (d.this.webView == null) {
                    return Unit.f6114a;
                }
                WebView webView = d.this.webView;
                Intrinsics.b(webView);
                webView.setLayoutParams(this.$relativeLayoutParams);
                d dVar = d.this;
                Activity activity = dVar.currentActivity;
                Intrinsics.b(activity);
                dVar.setUpDraggableLayout(activity, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams);
                d dVar2 = d.this;
                Activity activity2 = dVar2.currentActivity;
                Intrinsics.b(activity2);
                dVar2.setUpParentRelativeLayout(activity2);
                d dVar3 = d.this;
                RelativeLayout relativeLayout = dVar3.parentRelativeLayout;
                Intrinsics.b(relativeLayout);
                dVar3.createPopupWindow(relativeLayout);
                if (d.this.messageController != null) {
                    d dVar4 = d.this;
                    m.c cVar = this.$displayLocation;
                    com.onesignal.inAppMessages.internal.display.impl.a aVar2 = dVar4.draggableRelativeLayout;
                    Intrinsics.b(aVar2);
                    RelativeLayout relativeLayout2 = d.this.parentRelativeLayout;
                    Intrinsics.b(relativeLayout2);
                    dVar4.animateInAppMessage(cVar, aVar2, relativeLayout2);
                }
                d dVar5 = d.this;
                this.label = 1;
                if (dVar5.startDismissTimerIfNeeded(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((h) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class i extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public i(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.startDismissTimerIfNeeded(this);
        }
    }

    public static final class j extends X5.j implements Function2 {
        final /* synthetic */ int $pageHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i2, V5.b bVar) {
            super(2, bVar);
            this.$pageHeight = i2;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return d.this.new j(this.$pageHeight, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            if (d.this.webView == null) {
                com.onesignal.debug.internal.logging.b.warn$default("WebView height update skipped, new height will be used once it is displayed.", null, 2, null);
                return Unit.f6114a;
            }
            WebView webView = d.this.webView;
            Intrinsics.b(webView);
            ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
            if (layoutParams == null) {
                com.onesignal.debug.internal.logging.b.warn$default("WebView height update skipped because of null layoutParams, new height will be used once it is displayed.", null, 2, null);
                return Unit.f6114a;
            }
            layoutParams.height = this.$pageHeight;
            WebView webView2 = d.this.webView;
            Intrinsics.b(webView2);
            webView2.setLayoutParams(layoutParams);
            if (d.this.draggableRelativeLayout != null) {
                com.onesignal.inAppMessages.internal.display.impl.a aVar2 = d.this.draggableRelativeLayout;
                Intrinsics.b(aVar2);
                d dVar = d.this;
                aVar2.setParams(dVar.createDraggableLayoutParams(this.$pageHeight, dVar.getDisplayPosition(), d.this.disableDragDismiss));
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((j) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public d(WebView webView, com.onesignal.inAppMessages.internal.d messageContent, boolean z7, boolean z8) {
        double doubleValue;
        Intrinsics.checkNotNullParameter(messageContent, "messageContent");
        this.webView = webView;
        this.messageContent = messageContent;
        this.disableDragDismiss = z7;
        this.hideGrayOverlay = z8;
        this.pageWidth = -1;
        this.pageHeight = messageContent.getPageHeight();
        com.onesignal.common.m mVar = com.onesignal.common.m.INSTANCE;
        this.marginPxSizeLeft = mVar.dpToPx(24);
        this.marginPxSizeRight = mVar.dpToPx(24);
        this.marginPxSizeTop = mVar.dpToPx(24);
        this.marginPxSizeBottom = mVar.dpToPx(24);
        m.c displayLocation = messageContent.getDisplayLocation();
        Intrinsics.b(displayLocation);
        this.displayPosition = displayLocation;
        if (messageContent.getDisplayDuration() == null) {
            doubleValue = 0.0d;
        } else {
            Double displayDuration = messageContent.getDisplayDuration();
            Intrinsics.b(displayDuration);
            doubleValue = displayDuration.doubleValue();
        }
        this.displayDuration = doubleValue;
        this.hasBackground = !displayLocation.isBanner();
        this.popupWindowListener = new f();
        setMarginsFromContent(messageContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateAndDismissLayout(View view, V5.b bVar) {
        com.onesignal.common.threading.d dVar = new com.onesignal.common.threading.d();
        animateBackgroundColor(view, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, getOverlayColor(), 0, new b(dVar)).start();
        Object waitForWake = dVar.waitForWake(bVar);
        return waitForWake == W5.a.f2787d ? waitForWake : Unit.f6114a;
    }

    private final ValueAnimator animateBackgroundColor(View view, int i2, int i5, int i7, Animator.AnimatorListener animatorListener) {
        return com.onesignal.inAppMessages.internal.display.impl.j.INSTANCE.animateViewColor(view, i2, i5, i7, animatorListener);
    }

    private final void animateBottom(View view, int i2, Animation.AnimationListener animationListener) {
        com.onesignal.inAppMessages.internal.display.impl.j.INSTANCE.animateViewByTranslation(view, i2 + this.marginPxSizeBottom, 0.0f, 1000, new k(0.1d, 8.0d), animationListener).start();
    }

    private final void animateCenter(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animateViewSmallToLarge = com.onesignal.inAppMessages.internal.display.impl.j.INSTANCE.animateViewSmallToLarge(view, 1000, new k(0.1d, 8.0d), animationListener);
        ValueAnimator animateBackgroundColor = animateBackgroundColor(view2, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, 0, getOverlayColor(), animatorListener);
        animateViewSmallToLarge.start();
        animateBackgroundColor.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateInAppMessage(m.c cVar, View view, View view2) {
        Intrinsics.b(view);
        C0899a c0899a = (C0899a) view.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        Intrinsics.b(c0899a);
        Animation.AnimationListener createAnimationListener = createAnimationListener(c0899a);
        int i2 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i2 == 1) {
            WebView webView = this.webView;
            Intrinsics.b(webView);
            animateTop(c0899a, webView.getHeight(), createAnimationListener);
        } else if (i2 == 2) {
            WebView webView2 = this.webView;
            Intrinsics.b(webView2);
            animateBottom(c0899a, webView2.getHeight(), createAnimationListener);
        } else if (i2 == 3 || i2 == 4) {
            animateCenter(view, view2, createAnimationListener, null);
        }
    }

    private final void animateTop(View view, int i2, Animation.AnimationListener animationListener) {
        com.onesignal.inAppMessages.internal.display.impl.j.INSTANCE.animateViewByTranslation(view, (-i2) - this.marginPxSizeTop, 0.0f, 1000, new k(0.1d, 8.0d), animationListener).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupViewsAfterDismiss() {
        removeAllViews();
        com.onesignal.inAppMessages.internal.display.impl.e eVar = this.messageController;
        if (eVar != null) {
            eVar.onMessageWasDismissed();
        }
    }

    private final Animation.AnimationListener createAnimationListener(C0899a c0899a) {
        return new c(c0899a, this);
    }

    private final C0899a createCardView(Context context) {
        C0899a c0899a = new C0899a(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.displayPosition == m.c.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        c0899a.setLayoutParams(layoutParams);
        if (getHideDropShadow(context)) {
            c0899a.setCardElevation(0.0f);
        } else {
            c0899a.setCardElevation(com.onesignal.common.m.INSTANCE.dpToPx(5));
        }
        c0899a.setRadius(com.onesignal.common.m.INSTANCE.dpToPx(8));
        c0899a.setClipChildren(false);
        c0899a.setClipToPadding(false);
        c0899a.setPreventCornerOverlap(false);
        c0899a.setCardBackgroundColor(0);
        return c0899a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.b createDraggableLayoutParams(int i2, m.c cVar, boolean z7) {
        a.b bVar = new a.b();
        bVar.setMaxXPos(this.marginPxSizeRight);
        bVar.setMaxYPos(this.marginPxSizeTop);
        bVar.setDraggingDisabled(z7);
        bVar.setMessageHeight(i2);
        bVar.setHeight(getDisplayYSize());
        int i5 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i5 == 1) {
            bVar.setDragThresholdY(this.marginPxSizeTop - DRAG_THRESHOLD_PX_SIZE);
        } else if (i5 == 2) {
            bVar.setPosY(getDisplayYSize() - i2);
            bVar.setDragThresholdY(this.marginPxSizeBottom + DRAG_THRESHOLD_PX_SIZE);
        } else if (i5 == 3) {
            int displayYSize = (getDisplayYSize() / 2) - (i2 / 2);
            bVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize);
            bVar.setMaxYPos(displayYSize);
            bVar.setPosY(displayYSize);
        } else if (i5 == 4) {
            int displayYSize2 = getDisplayYSize() - (this.marginPxSizeBottom + this.marginPxSizeTop);
            bVar.setMessageHeight(displayYSize2);
            int displayYSize3 = (getDisplayYSize() / 2) - (displayYSize2 / 2);
            bVar.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize3);
            bVar.setMaxYPos(displayYSize3);
            bVar.setPosY(displayYSize3);
        }
        bVar.setDragDirection(cVar == m.c.TOP_BANNER ? 0 : 1);
        return bVar;
    }

    private final RelativeLayout.LayoutParams createParentRelativeLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.pageWidth, -1);
        int i2 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
        if (i2 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i2 != 3 && i2 != 4) {
            return layoutParams;
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPopupWindow(RelativeLayout relativeLayout) {
        boolean z7 = this.hasBackground;
        com.onesignal.inAppMessages.internal.display.impl.h hVar = new com.onesignal.inAppMessages.internal.display.impl.h(relativeLayout, z7 ? -1 : this.pageWidth, z7 ? -1 : -2, false, this.popupWindowListener);
        this.popupWindow = hVar;
        hVar.setBackgroundDrawable(new ColorDrawable(0));
        com.onesignal.inAppMessages.internal.display.impl.h hVar2 = this.popupWindow;
        int i2 = 1;
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
            i2 = 0;
        } else {
            int i5 = com.onesignal.inAppMessages.internal.display.impl.f.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
            if (i5 == 1) {
                i2 = 49;
            } else if (i5 == 2) {
                i2 = 81;
            } else if (i5 != 3 && i5 != 4) {
                throw new R5.k();
            }
        }
        int i7 = this.messageContent.isFullBleed() ? 1000 : 1003;
        com.onesignal.inAppMessages.internal.display.impl.h hVar5 = this.popupWindow;
        Intrinsics.b(hVar5);
        hVar5.setWindowLayoutType(i7);
        com.onesignal.inAppMessages.internal.display.impl.h hVar6 = this.popupWindow;
        if (hVar6 != null) {
            Activity activity = this.currentActivity;
            Intrinsics.b(activity);
            hVar6.showAtLocation(activity.getWindow().getDecorView().getRootView(), i2, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r2.delayShowUntilAvailable(r7, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (showInAppMessageView(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayShowUntilAvailable(Activity activity, V5.b bVar) {
        C0035d c0035d;
        int i2;
        d dVar;
        if (bVar instanceof C0035d) {
            c0035d = (C0035d) bVar;
            int i5 = c0035d.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0035d.label = i5 - Integer.MIN_VALUE;
                Object obj = c0035d.result;
                W5.a aVar = W5.a.f2787d;
                i2 = c0035d.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    if (AndroidUtils.INSTANCE.isActivityFullyReady(activity) && this.parentRelativeLayout == null) {
                        c0035d.label = 1;
                    } else {
                        c0035d.L$0 = this;
                        c0035d.L$1 = activity;
                        c0035d.label = 2;
                        if (AbstractC0792z.d(200L, c0035d) != aVar) {
                            dVar = this;
                            c0035d.L$0 = null;
                            c0035d.L$1 = null;
                            c0035d.label = 3;
                        }
                    }
                    return aVar;
                }
                if (i2 == 1) {
                    V6.b.P(obj);
                    return Unit.f6114a;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                    return Unit.f6114a;
                }
                activity = (Activity) c0035d.L$1;
                dVar = (d) c0035d.L$0;
                V6.b.P(obj);
                c0035d.L$0 = null;
                c0035d.L$1 = null;
                c0035d.label = 3;
            }
        }
        c0035d = new C0035d(bVar);
        Object obj2 = c0035d.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0035d.label;
        if (i2 != 0) {
        }
    }

    private final void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishAfterDelay(V5.b bVar) {
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(s6.n.f7850a, new e(null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    private final int getDisplayYSize() {
        com.onesignal.common.m mVar = com.onesignal.common.m.INSTANCE;
        Activity activity = this.currentActivity;
        Intrinsics.b(activity);
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
        Intrinsics.b(aVar2);
        aVar2.setParams(bVar);
        com.onesignal.inAppMessages.internal.display.impl.a aVar3 = this.draggableRelativeLayout;
        Intrinsics.b(aVar3);
        aVar3.setListener(new g());
        WebView webView = this.webView;
        Intrinsics.b(webView);
        if (webView.getParent() != null) {
            WebView webView2 = this.webView;
            Intrinsics.b(webView2);
            ViewParent parent = webView2.getParent();
            Intrinsics.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
        }
        C0899a createCardView = createCardView(context);
        createCardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        createCardView.addView(this.webView);
        com.onesignal.inAppMessages.internal.display.impl.a aVar4 = this.draggableRelativeLayout;
        Intrinsics.b(aVar4);
        aVar4.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        com.onesignal.inAppMessages.internal.display.impl.a aVar5 = this.draggableRelativeLayout;
        Intrinsics.b(aVar5);
        aVar5.setClipChildren(false);
        com.onesignal.inAppMessages.internal.display.impl.a aVar6 = this.draggableRelativeLayout;
        Intrinsics.b(aVar6);
        aVar6.setClipToPadding(false);
        com.onesignal.inAppMessages.internal.display.impl.a aVar7 = this.draggableRelativeLayout;
        Intrinsics.b(aVar7);
        aVar7.addView(createCardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpParentRelativeLayout(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout2 = this.parentRelativeLayout;
        Intrinsics.b(relativeLayout2);
        relativeLayout2.setClipChildren(false);
        RelativeLayout relativeLayout3 = this.parentRelativeLayout;
        Intrinsics.b(relativeLayout3);
        relativeLayout3.setClipToPadding(false);
        RelativeLayout relativeLayout4 = this.parentRelativeLayout;
        Intrinsics.b(relativeLayout4);
        relativeLayout4.addView(this.draggableRelativeLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showDraggableView(m.c cVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, a.b bVar, V5.b bVar2) {
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(s6.n.f7850a, new h(layoutParams, layoutParams2, bVar, cVar, null), bVar2);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startDismissTimerIfNeeded(V5.b bVar) {
        i iVar;
        int i2;
        d dVar;
        d dVar2;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i5 = iVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iVar.label = i5 - Integer.MIN_VALUE;
                Object obj = iVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = iVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    double d7 = this.displayDuration;
                    if (d7 <= 0.0d || this.isDismissTimerSet) {
                        return Unit.f6114a;
                    }
                    this.isDismissTimerSet = true;
                    iVar.L$0 = this;
                    iVar.label = 1;
                    if (AbstractC0792z.d(((long) d7) * 1000, iVar) != aVar) {
                        dVar = this;
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar2 = (d) iVar.L$0;
                    V6.b.P(obj);
                    dVar2.isDismissTimerSet = false;
                    return Unit.f6114a;
                }
                dVar = (d) iVar.L$0;
                V6.b.P(obj);
                if (!dVar.cancelDismissTimer) {
                    dVar.cancelDismissTimer = false;
                    return Unit.f6114a;
                }
                com.onesignal.inAppMessages.internal.display.impl.e eVar = dVar.messageController;
                if (eVar != null) {
                    Intrinsics.b(eVar);
                    eVar.onMessageWillDismiss();
                }
                if (dVar.currentActivity == null) {
                    dVar.shouldDismissWhenActive = true;
                    return Unit.f6114a;
                }
                iVar.L$0 = dVar;
                iVar.label = 2;
                if (dVar.dismissAndAwaitNextMessage(iVar) != aVar) {
                    dVar2 = dVar;
                    dVar2.isDismissTimerSet = false;
                    return Unit.f6114a;
                }
                return aVar;
            }
        }
        iVar = new i(bVar);
        Object obj2 = iVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = iVar.label;
        if (i2 != 0) {
        }
        if (!dVar.cancelDismissTimer) {
        }
    }

    public final Object checkIfShouldDismiss(V5.b bVar) {
        if (!this.shouldDismissWhenActive) {
            return Unit.f6114a;
        }
        this.shouldDismissWhenActive = false;
        Object finishAfterDelay = finishAfterDelay(bVar);
        return finishAfterDelay == W5.a.f2787d ? finishAfterDelay : Unit.f6114a;
    }

    public final Object dismissAndAwaitNextMessage(V5.b bVar) {
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.draggableRelativeLayout;
        if (aVar == null) {
            com.onesignal.debug.internal.logging.b.info$default("No host presenter to trigger dismiss animation, counting as dismissed already", null, 2, null);
            dereferenceViews();
            return Unit.f6114a;
        }
        Intrinsics.b(aVar);
        aVar.dismiss();
        Object finishAfterDelay = finishAfterDelay(bVar);
        return finishAfterDelay == W5.a.f2787d ? finishAfterDelay : Unit.f6114a;
    }

    public final m.c getDisplayPosition() {
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
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
    }

    public final Object showInAppMessageView(Activity activity, V5.b bVar) {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams createParentRelativeLayoutParams = this.hasBackground ? createParentRelativeLayoutParams() : null;
        m.c cVar = this.displayPosition;
        Object showDraggableView = showDraggableView(cVar, layoutParams, createParentRelativeLayoutParams, createDraggableLayoutParams(this.pageHeight, cVar, this.disableDragDismiss), bVar);
        return showDraggableView == W5.a.f2787d ? showDraggableView : Unit.f6114a;
    }

    public final Object showView(Activity activity, V5.b bVar) {
        Object delayShowUntilAvailable = delayShowUntilAvailable(activity, bVar);
        return delayShowUntilAvailable == W5.a.f2787d ? delayShowUntilAvailable : Unit.f6114a;
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.currentActivity + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", displayDuration=" + this.displayDuration + ", hasBackground=" + this.hasBackground + ", shouldDismissWhenActive=" + this.shouldDismissWhenActive + ", isDragging=" + this.isDragging + ", disableDragDismiss=" + this.disableDragDismiss + ", displayLocation=" + this.displayPosition + ", webView=" + this.webView + '}';
    }

    public final Object updateHeight(int i2, V5.b bVar) {
        this.pageHeight = i2;
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(s6.n.f7850a, new j(i2, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }
}
