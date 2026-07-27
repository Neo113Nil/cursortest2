package com.onesignal.inAppMessages.internal.display.impl;

import D4.AbstractC0024y;
import D4.E;
import I.k;
import I4.o;
import K4.d;
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
import com.onesignal.common.ViewUtils;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.common.threading.Waiter;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessageContent;
import com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout;
import com.onesignal.inAppMessages.internal.display.impl.InAppMessageView;
import com.onesignal.inAppMessages.internal.display.impl.OSPopupWindow;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.yandex.varioqub.config.model.ConfigValue;
import e5.g;
import f4.v;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import q.C1385a;

/* loaded from: classes.dex */
public final class InAppMessageView {
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
    private final WebViewManager.Position displayPosition;
    private DraggableRelativeLayout draggableRelativeLayout;
    private final boolean hasBackground;
    private final boolean hideGrayOverlay;
    private boolean isDismissTimerSet;
    private boolean isDragging;
    private int marginPxSizeBottom;
    private int marginPxSizeLeft;
    private int marginPxSizeRight;
    private int marginPxSizeTop;
    private final InAppMessageContent messageContent;
    private InAppMessageViewListener messageController;
    private int pageHeight;
    private final int pageWidth;
    private RelativeLayout parentRelativeLayout;
    private OSPopupWindow popupWindow;
    private final InAppMessageView$popupWindowListener$1 popupWindowListener;
    private boolean shouldDismissWhenActive;
    private WebView webView;
    public static final Companion Companion = new Companion(null);
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor("#BB000000");
    private static final int DRAG_THRESHOLD_PX_SIZE = ViewUtils.INSTANCE.dpToPx(4);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public interface InAppMessageViewListener {
        void onMessageWasDismissed();

        void onMessageWasDisplayed();

        void onMessageWillDismiss();
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebViewManager.Position.values().length];
            try {
                iArr[WebViewManager.Position.TOP_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebViewManager.Position.BOTTOM_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebViewManager.Position.CENTER_MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WebViewManager.Position.FULL_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$popupWindowListener$1] */
    public InAppMessageView(WebView webView, InAppMessageContent messageContent, boolean z, boolean z5) {
        double doubleValue;
        i.e(messageContent, "messageContent");
        this.webView = webView;
        this.messageContent = messageContent;
        this.disableDragDismiss = z;
        this.hideGrayOverlay = z5;
        this.pageWidth = -1;
        this.pageHeight = messageContent.getPageHeight();
        ViewUtils viewUtils = ViewUtils.INSTANCE;
        this.marginPxSizeLeft = viewUtils.dpToPx(24);
        this.marginPxSizeRight = viewUtils.dpToPx(24);
        this.marginPxSizeTop = viewUtils.dpToPx(24);
        this.marginPxSizeBottom = viewUtils.dpToPx(24);
        WebViewManager.Position displayLocation = messageContent.getDisplayLocation();
        i.b(displayLocation);
        this.displayPosition = displayLocation;
        if (messageContent.getDisplayDuration() == null) {
            doubleValue = ConfigValue.DOUBLE_DEFAULT_VALUE;
        } else {
            Double displayDuration = messageContent.getDisplayDuration();
            i.b(displayDuration);
            doubleValue = displayDuration.doubleValue();
        }
        this.displayDuration = doubleValue;
        this.hasBackground = !displayLocation.isBanner();
        this.popupWindowListener = new OSPopupWindow.PopupWindowListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$popupWindowListener$1
            @Override // com.onesignal.inAppMessages.internal.display.impl.OSPopupWindow.PopupWindowListener
            public void onDismiss(Boolean bool) {
                InAppMessageView.InAppMessageViewListener inAppMessageViewListener;
                if (i.a(bool, Boolean.TRUE)) {
                    return;
                }
                Logging.debug$default("PopupWindowListener.onDismiss called by the system.", null, 2, null);
                inAppMessageViewListener = InAppMessageView.this.messageController;
                if (inAppMessageViewListener != null) {
                    inAppMessageViewListener.onMessageWasDismissed();
                }
            }
        };
        setMarginsFromContent(messageContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateAndDismissLayout(View view, InterfaceC1218d interfaceC1218d) {
        final Waiter waiter = new Waiter();
        animateBackgroundColor(view, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, getOverlayColor(), 0, new AnimatorListenerAdapter() { // from class: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$animateAndDismissLayout$animCallback$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                i.e(animation, "animation");
                InAppMessageView.this.cleanupViewsAfterDismiss();
                waiter.wake();
            }
        }).start();
        Object waitForWake = waiter.waitForWake(interfaceC1218d);
        return waitForWake == EnumC1260a.f11058a ? waitForWake : v.f5689a;
    }

    private final ValueAnimator animateBackgroundColor(View view, int i2, int i3, int i6, Animator.AnimatorListener animatorListener) {
        return OneSignalAnimate.INSTANCE.animateViewColor(view, i2, i3, i6, animatorListener);
    }

    private final void animateBottom(View view, int i2, Animation.AnimationListener animationListener) {
        OneSignalAnimate.INSTANCE.animateViewByTranslation(view, i2 + this.marginPxSizeBottom, 0.0f, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, new OneSignalBounceInterpolator(0.1d, 8.0d), animationListener).start();
    }

    private final void animateCenter(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animateViewSmallToLarge = OneSignalAnimate.INSTANCE.animateViewSmallToLarge(view, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, new OneSignalBounceInterpolator(0.1d, 8.0d), animationListener);
        ValueAnimator animateBackgroundColor = animateBackgroundColor(view2, IN_APP_BACKGROUND_ANIMATION_DURATION_MS, 0, getOverlayColor(), animatorListener);
        animateViewSmallToLarge.start();
        animateBackgroundColor.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateInAppMessage(WebViewManager.Position position, View view, View view2) {
        i.b(view);
        C1385a c1385a = (C1385a) view.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        i.b(c1385a);
        Animation.AnimationListener createAnimationListener = createAnimationListener(c1385a);
        int i2 = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i2 == 1) {
            WebView webView = this.webView;
            i.b(webView);
            animateTop(c1385a, webView.getHeight(), createAnimationListener);
        } else if (i2 == 2) {
            WebView webView2 = this.webView;
            i.b(webView2);
            animateBottom(c1385a, webView2.getHeight(), createAnimationListener);
        } else if (i2 == 3 || i2 == 4) {
            animateCenter(view, view2, createAnimationListener, null);
        }
    }

    private final void animateTop(View view, int i2, Animation.AnimationListener animationListener) {
        OneSignalAnimate.INSTANCE.animateViewByTranslation(view, (-i2) - this.marginPxSizeTop, 0.0f, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, new OneSignalBounceInterpolator(0.1d, 8.0d), animationListener).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupViewsAfterDismiss() {
        removeAllViews();
        InAppMessageViewListener inAppMessageViewListener = this.messageController;
        if (inAppMessageViewListener != null) {
            inAppMessageViewListener.onMessageWasDismissed();
        }
    }

    private final Animation.AnimationListener createAnimationListener(final C1385a c1385a) {
        return new Animation.AnimationListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$createAnimationListener$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                InAppMessageView.InAppMessageViewListener inAppMessageViewListener;
                InAppMessageView.InAppMessageViewListener inAppMessageViewListener2;
                i.e(animation, "animation");
                inAppMessageViewListener = this.messageController;
                if (inAppMessageViewListener != null) {
                    inAppMessageViewListener2 = this.messageController;
                    i.b(inAppMessageViewListener2);
                    inAppMessageViewListener2.onMessageWasDisplayed();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                i.e(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                i.e(animation, "animation");
            }
        };
    }

    private final C1385a createCardView(Context context) {
        C1385a c1385a = new C1385a(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.displayPosition == WebViewManager.Position.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        c1385a.setLayoutParams(layoutParams);
        if (getHideDropShadow(context)) {
            c1385a.setCardElevation(0.0f);
        } else {
            c1385a.setCardElevation(ViewUtils.INSTANCE.dpToPx(5));
        }
        c1385a.setRadius(ViewUtils.INSTANCE.dpToPx(8));
        c1385a.setClipChildren(false);
        c1385a.setClipToPadding(false);
        c1385a.setPreventCornerOverlap(false);
        c1385a.setCardBackgroundColor(0);
        return c1385a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DraggableRelativeLayout.Params createDraggableLayoutParams(int i2, WebViewManager.Position position, boolean z) {
        DraggableRelativeLayout.Params params = new DraggableRelativeLayout.Params();
        params.setMaxXPos(this.marginPxSizeRight);
        params.setMaxYPos(this.marginPxSizeTop);
        params.setDraggingDisabled(z);
        params.setMessageHeight(i2);
        params.setHeight(getDisplayYSize());
        int i3 = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i3 == 1) {
            params.setDragThresholdY(this.marginPxSizeTop - DRAG_THRESHOLD_PX_SIZE);
        } else if (i3 == 2) {
            params.setPosY(getDisplayYSize() - i2);
            params.setDragThresholdY(this.marginPxSizeBottom + DRAG_THRESHOLD_PX_SIZE);
        } else if (i3 == 3) {
            int displayYSize = (getDisplayYSize() / 2) - (i2 / 2);
            params.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize);
            params.setMaxYPos(displayYSize);
            params.setPosY(displayYSize);
        } else if (i3 == 4) {
            int displayYSize2 = getDisplayYSize() - (this.marginPxSizeBottom + this.marginPxSizeTop);
            params.setMessageHeight(displayYSize2);
            int displayYSize3 = (getDisplayYSize() / 2) - (displayYSize2 / 2);
            params.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize3);
            params.setMaxYPos(displayYSize3);
            params.setPosY(displayYSize3);
        }
        params.setDragDirection(position == WebViewManager.Position.TOP_BANNER ? 0 : 1);
        return params;
    }

    private final RelativeLayout.LayoutParams createParentRelativeLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.pageWidth, -1);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
        if (i2 == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
        } else if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
        } else if (i2 == 3 || i2 == 4) {
            layoutParams.addRule(13);
        }
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPopupWindow(RelativeLayout relativeLayout) {
        boolean z = this.hasBackground;
        OSPopupWindow oSPopupWindow = new OSPopupWindow(relativeLayout, z ? -1 : this.pageWidth, z ? -1 : -2, false, this.popupWindowListener);
        this.popupWindow = oSPopupWindow;
        oSPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
        OSPopupWindow oSPopupWindow2 = this.popupWindow;
        int i2 = 1;
        if (oSPopupWindow2 != null) {
            oSPopupWindow2.setTouchable(true);
        }
        OSPopupWindow oSPopupWindow3 = this.popupWindow;
        if (oSPopupWindow3 != null) {
            oSPopupWindow3.setFocusable(!this.displayPosition.isBanner());
        }
        OSPopupWindow oSPopupWindow4 = this.popupWindow;
        if (oSPopupWindow4 != null) {
            oSPopupWindow4.setClippingEnabled(false);
        }
        if (this.hasBackground) {
            i2 = 0;
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
            if (i3 == 1) {
                i2 = 49;
            } else if (i3 == 2) {
                i2 = 81;
            } else if (i3 != 3 && i3 != 4) {
                throw new C1.b();
            }
        }
        int i6 = this.messageContent.isFullBleed() ? AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT : 1003;
        OSPopupWindow oSPopupWindow5 = this.popupWindow;
        i.b(oSPopupWindow5);
        k.d(oSPopupWindow5, i6);
        OSPopupWindow oSPopupWindow6 = this.popupWindow;
        if (oSPopupWindow6 != null) {
            Activity activity = this.currentActivity;
            i.b(activity);
            oSPopupWindow6.showAtLocation(activity.getWindow().getDecorView().getRootView(), i2, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayShowUntilAvailable(Activity activity, InterfaceC1218d interfaceC1218d) {
        InAppMessageView$delayShowUntilAvailable$1 inAppMessageView$delayShowUntilAvailable$1;
        int i2;
        InAppMessageView inAppMessageView;
        if (interfaceC1218d instanceof InAppMessageView$delayShowUntilAvailable$1) {
            inAppMessageView$delayShowUntilAvailable$1 = (InAppMessageView$delayShowUntilAvailable$1) interfaceC1218d;
            int i3 = inAppMessageView$delayShowUntilAvailable$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessageView$delayShowUntilAvailable$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppMessageView$delayShowUntilAvailable$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessageView$delayShowUntilAvailable$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    if (AndroidUtils.INSTANCE.isActivityFullyReady(activity) && this.parentRelativeLayout == null) {
                        inAppMessageView$delayShowUntilAvailable$1.label = 1;
                        return showInAppMessageView(activity, inAppMessageView$delayShowUntilAvailable$1) == enumC1260a ? enumC1260a : vVar;
                    }
                    inAppMessageView$delayShowUntilAvailable$1.L$0 = this;
                    inAppMessageView$delayShowUntilAvailable$1.L$1 = activity;
                    inAppMessageView$delayShowUntilAvailable$1.label = 2;
                    if (AbstractC0024y.d(200L, inAppMessageView$delayShowUntilAvailable$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    inAppMessageView = this;
                    inAppMessageView$delayShowUntilAvailable$1.L$0 = null;
                    inAppMessageView$delayShowUntilAvailable$1.L$1 = null;
                    inAppMessageView$delayShowUntilAvailable$1.label = 3;
                    if (inAppMessageView.delayShowUntilAvailable(activity, inAppMessageView$delayShowUntilAvailable$1) != enumC1260a) {
                    }
                } else {
                    if (i2 == 1) {
                        g.y(obj);
                    }
                    if (i2 == 2) {
                        activity = (Activity) inAppMessageView$delayShowUntilAvailable$1.L$1;
                        inAppMessageView = (InAppMessageView) inAppMessageView$delayShowUntilAvailable$1.L$0;
                        g.y(obj);
                        inAppMessageView$delayShowUntilAvailable$1.L$0 = null;
                        inAppMessageView$delayShowUntilAvailable$1.L$1 = null;
                        inAppMessageView$delayShowUntilAvailable$1.label = 3;
                        if (inAppMessageView.delayShowUntilAvailable(activity, inAppMessageView$delayShowUntilAvailable$1) != enumC1260a) {
                            return enumC1260a;
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g.y(obj);
                    }
                }
                return vVar;
            }
        }
        inAppMessageView$delayShowUntilAvailable$1 = new InAppMessageView$delayShowUntilAvailable$1(this, interfaceC1218d);
        Object obj2 = inAppMessageView$delayShowUntilAvailable$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessageView$delayShowUntilAvailable$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        return vVar2;
    }

    private final void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishAfterDelay(InterfaceC1218d interfaceC1218d) {
        d dVar = E.f459a;
        Object w3 = AbstractC0024y.w(o.f1316a, new InAppMessageView$finishAfterDelay$2(this, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    private final int getDisplayYSize() {
        ViewUtils viewUtils = ViewUtils.INSTANCE;
        Activity activity = this.currentActivity;
        i.b(activity);
        return viewUtils.getWindowHeight(activity);
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

    private final void setMarginsFromContent(InAppMessageContent inAppMessageContent) {
        this.marginPxSizeTop = inAppMessageContent.getUseHeightMargin() ? ViewUtils.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeBottom = inAppMessageContent.getUseHeightMargin() ? ViewUtils.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeLeft = inAppMessageContent.getUseWidthMargin() ? ViewUtils.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeRight = inAppMessageContent.getUseWidthMargin() ? ViewUtils.INSTANCE.dpToPx(24) : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpDraggableLayout(Context context, RelativeLayout.LayoutParams layoutParams, DraggableRelativeLayout.Params params) {
        DraggableRelativeLayout draggableRelativeLayout = new DraggableRelativeLayout(context);
        this.draggableRelativeLayout = draggableRelativeLayout;
        if (layoutParams != null) {
            draggableRelativeLayout.setLayoutParams(layoutParams);
        }
        DraggableRelativeLayout draggableRelativeLayout2 = this.draggableRelativeLayout;
        i.b(draggableRelativeLayout2);
        draggableRelativeLayout2.setParams(params);
        DraggableRelativeLayout draggableRelativeLayout3 = this.draggableRelativeLayout;
        i.b(draggableRelativeLayout3);
        draggableRelativeLayout3.setListener(new DraggableRelativeLayout.DraggableListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$setUpDraggableLayout$1
            @Override // com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout.DraggableListener
            public void onDismiss() {
                InAppMessageView.InAppMessageViewListener inAppMessageViewListener;
                InAppMessageView.InAppMessageViewListener inAppMessageViewListener2;
                inAppMessageViewListener = InAppMessageView.this.messageController;
                if (inAppMessageViewListener != null) {
                    inAppMessageViewListener2 = InAppMessageView.this.messageController;
                    i.b(inAppMessageViewListener2);
                    inAppMessageViewListener2.onMessageWillDismiss();
                }
                ThreadUtilsKt.suspendifyOnIO(new InAppMessageView$setUpDraggableLayout$1$onDismiss$1(InAppMessageView.this, null));
            }

            @Override // com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout.DraggableListener
            public void onDragEnd() {
                InAppMessageView.this.isDragging = false;
            }

            @Override // com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout.DraggableListener
            public void onDragStart() {
                InAppMessageView.this.isDragging = true;
            }
        });
        WebView webView = this.webView;
        i.b(webView);
        if (webView.getParent() != null) {
            WebView webView2 = this.webView;
            i.b(webView2);
            ViewParent parent = webView2.getParent();
            i.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
        }
        C1385a createCardView = createCardView(context);
        createCardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        createCardView.addView(this.webView);
        DraggableRelativeLayout draggableRelativeLayout4 = this.draggableRelativeLayout;
        i.b(draggableRelativeLayout4);
        draggableRelativeLayout4.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        DraggableRelativeLayout draggableRelativeLayout5 = this.draggableRelativeLayout;
        i.b(draggableRelativeLayout5);
        draggableRelativeLayout5.setClipChildren(false);
        DraggableRelativeLayout draggableRelativeLayout6 = this.draggableRelativeLayout;
        i.b(draggableRelativeLayout6);
        draggableRelativeLayout6.setClipToPadding(false);
        DraggableRelativeLayout draggableRelativeLayout7 = this.draggableRelativeLayout;
        i.b(draggableRelativeLayout7);
        draggableRelativeLayout7.addView(createCardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpParentRelativeLayout(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout2 = this.parentRelativeLayout;
        i.b(relativeLayout2);
        relativeLayout2.setClipChildren(false);
        RelativeLayout relativeLayout3 = this.parentRelativeLayout;
        i.b(relativeLayout3);
        relativeLayout3.setClipToPadding(false);
        RelativeLayout relativeLayout4 = this.parentRelativeLayout;
        i.b(relativeLayout4);
        relativeLayout4.addView(this.draggableRelativeLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showDraggableView(WebViewManager.Position position, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, DraggableRelativeLayout.Params params, InterfaceC1218d interfaceC1218d) {
        d dVar = E.f459a;
        Object w3 = AbstractC0024y.w(o.f1316a, new InAppMessageView$showDraggableView$2(this, layoutParams, layoutParams2, params, position, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startDismissTimerIfNeeded(InterfaceC1218d interfaceC1218d) {
        InAppMessageView$startDismissTimerIfNeeded$1 inAppMessageView$startDismissTimerIfNeeded$1;
        int i2;
        InAppMessageView inAppMessageView;
        InAppMessageView inAppMessageView2;
        if (interfaceC1218d instanceof InAppMessageView$startDismissTimerIfNeeded$1) {
            inAppMessageView$startDismissTimerIfNeeded$1 = (InAppMessageView$startDismissTimerIfNeeded$1) interfaceC1218d;
            int i3 = inAppMessageView$startDismissTimerIfNeeded$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                inAppMessageView$startDismissTimerIfNeeded$1.label = i3 - Integer.MIN_VALUE;
                Object obj = inAppMessageView$startDismissTimerIfNeeded$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = inAppMessageView$startDismissTimerIfNeeded$1.label;
                v vVar = v.f5689a;
                if (i2 != 0) {
                    g.y(obj);
                    double d6 = this.displayDuration;
                    if (d6 > ConfigValue.DOUBLE_DEFAULT_VALUE && !this.isDismissTimerSet) {
                        this.isDismissTimerSet = true;
                        long j2 = ((long) d6) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                        inAppMessageView$startDismissTimerIfNeeded$1.L$0 = this;
                        inAppMessageView$startDismissTimerIfNeeded$1.label = 1;
                        if (AbstractC0024y.d(j2, inAppMessageView$startDismissTimerIfNeeded$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        inAppMessageView = this;
                    }
                    return vVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppMessageView2 = (InAppMessageView) inAppMessageView$startDismissTimerIfNeeded$1.L$0;
                    g.y(obj);
                    inAppMessageView2.isDismissTimerSet = false;
                    return vVar;
                }
                inAppMessageView = (InAppMessageView) inAppMessageView$startDismissTimerIfNeeded$1.L$0;
                g.y(obj);
                if (!inAppMessageView.cancelDismissTimer) {
                    inAppMessageView.cancelDismissTimer = false;
                    return vVar;
                }
                InAppMessageViewListener inAppMessageViewListener = inAppMessageView.messageController;
                if (inAppMessageViewListener != null) {
                    i.b(inAppMessageViewListener);
                    inAppMessageViewListener.onMessageWillDismiss();
                }
                if (inAppMessageView.currentActivity == null) {
                    inAppMessageView.shouldDismissWhenActive = true;
                    return vVar;
                }
                inAppMessageView$startDismissTimerIfNeeded$1.L$0 = inAppMessageView;
                inAppMessageView$startDismissTimerIfNeeded$1.label = 2;
                if (inAppMessageView.dismissAndAwaitNextMessage(inAppMessageView$startDismissTimerIfNeeded$1) == enumC1260a) {
                    return enumC1260a;
                }
                inAppMessageView2 = inAppMessageView;
                inAppMessageView2.isDismissTimerSet = false;
                return vVar;
            }
        }
        inAppMessageView$startDismissTimerIfNeeded$1 = new InAppMessageView$startDismissTimerIfNeeded$1(this, interfaceC1218d);
        Object obj2 = inAppMessageView$startDismissTimerIfNeeded$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = inAppMessageView$startDismissTimerIfNeeded$1.label;
        v vVar2 = v.f5689a;
        if (i2 != 0) {
        }
        if (!inAppMessageView.cancelDismissTimer) {
        }
    }

    public final Object checkIfShouldDismiss(InterfaceC1218d interfaceC1218d) {
        boolean z = this.shouldDismissWhenActive;
        v vVar = v.f5689a;
        if (z) {
            this.shouldDismissWhenActive = false;
            Object finishAfterDelay = finishAfterDelay(interfaceC1218d);
            if (finishAfterDelay == EnumC1260a.f11058a) {
                return finishAfterDelay;
            }
        }
        return vVar;
    }

    public final Object dismissAndAwaitNextMessage(InterfaceC1218d interfaceC1218d) {
        DraggableRelativeLayout draggableRelativeLayout = this.draggableRelativeLayout;
        v vVar = v.f5689a;
        if (draggableRelativeLayout == null) {
            Logging.info$default("No host presenter to trigger dismiss animation, counting as dismissed already", null, 2, null);
            dereferenceViews();
            return vVar;
        }
        i.b(draggableRelativeLayout);
        draggableRelativeLayout.dismiss();
        Object finishAfterDelay = finishAfterDelay(interfaceC1218d);
        return finishAfterDelay == EnumC1260a.f11058a ? finishAfterDelay : vVar;
    }

    public final WebViewManager.Position getDisplayPosition() {
        return this.displayPosition;
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public final void removeAllViews() {
        Logging.debug$default("InAppMessageView.removeAllViews()", null, 2, null);
        OSPopupWindow oSPopupWindow = this.popupWindow;
        if (oSPopupWindow != null) {
            oSPopupWindow.setWasDismissedManually(Boolean.TRUE);
        }
        if (this.isDismissTimerSet) {
            this.cancelDismissTimer = true;
        }
        DraggableRelativeLayout draggableRelativeLayout = this.draggableRelativeLayout;
        if (draggableRelativeLayout != null) {
            draggableRelativeLayout.removeAllViews();
        }
        OSPopupWindow oSPopupWindow2 = this.popupWindow;
        if (oSPopupWindow2 != null) {
            oSPopupWindow2.dismiss();
        }
        dereferenceViews();
    }

    public final void setMessageController(InAppMessageViewListener inAppMessageViewListener) {
        this.messageController = inAppMessageViewListener;
    }

    public final void setWebView(WebView webView) {
        i.e(webView, "webView");
        this.webView = webView;
        webView.setBackgroundColor(0);
    }

    public final Object showInAppMessageView(Activity activity, InterfaceC1218d interfaceC1218d) {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams createParentRelativeLayoutParams = this.hasBackground ? createParentRelativeLayoutParams() : null;
        WebViewManager.Position position = this.displayPosition;
        Object showDraggableView = showDraggableView(position, layoutParams, createParentRelativeLayoutParams, createDraggableLayoutParams(this.pageHeight, position, this.disableDragDismiss), interfaceC1218d);
        return showDraggableView == EnumC1260a.f11058a ? showDraggableView : v.f5689a;
    }

    public final Object showView(Activity activity, InterfaceC1218d interfaceC1218d) {
        Object delayShowUntilAvailable = delayShowUntilAvailable(activity, interfaceC1218d);
        return delayShowUntilAvailable == EnumC1260a.f11058a ? delayShowUntilAvailable : v.f5689a;
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.currentActivity + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", displayDuration=" + this.displayDuration + ", hasBackground=" + this.hasBackground + ", shouldDismissWhenActive=" + this.shouldDismissWhenActive + ", isDragging=" + this.isDragging + ", disableDragDismiss=" + this.disableDragDismiss + ", displayLocation=" + this.displayPosition + ", webView=" + this.webView + '}';
    }

    public final Object updateHeight(int i2, InterfaceC1218d interfaceC1218d) {
        this.pageHeight = i2;
        d dVar = E.f459a;
        Object w3 = AbstractC0024y.w(o.f1316a, new InAppMessageView$updateHeight$2(this, i2, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }
}
