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
import androidx.cardview.widget.CardView;
import androidx.core.view.PointerIconCompat;
import androidx.core.widget.PopupWindowCompat;
import com.facebook.common.util.UriUtil;
import com.facebook.react.uimanager.ViewProps;
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
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: InAppMessageView.kt */
@Metadata(d1 = {"\u0000©\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001+\b\u0000\u0018\u0000 o2\u00020\u0001:\u0002opB'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0082@¢\u0006\u0002\u00102J2\u00103\u001a\u0002042\u0006\u00100\u001a\u0002012\u0006\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u00142\b\u00108\u001a\u0004\u0018\u000109H\u0002J \u0010:\u001a\u00020/2\u0006\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020>H\u0002J*\u0010?\u001a\u00020/2\u0006\u0010;\u001a\u0002012\u0006\u00100\u001a\u0002012\u0006\u0010=\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u000109H\u0002J \u0010A\u001a\u00020/2\u0006\u0010B\u001a\u00020\u00102\u0006\u0010;\u001a\u0002012\u0006\u00100\u001a\u000201H\u0002J \u0010C\u001a\u00020/2\u0006\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020>H\u0002J\u000e\u0010D\u001a\u00020/H\u0086@¢\u0006\u0002\u0010EJ\b\u0010F\u001a\u00020/H\u0002J\u0010\u0010G\u001a\u00020>2\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020LH\u0002J \u0010M\u001a\u00020N2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u00102\u0006\u0010O\u001a\u00020\u0007H\u0002J\b\u0010P\u001a\u00020QH\u0002J\u0010\u0010R\u001a\u00020/2\u0006\u0010&\u001a\u00020'H\u0002J\u0016\u0010S\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020/H\u0002J\u000e\u0010V\u001a\u00020/H\u0086@¢\u0006\u0002\u0010EJ\u000e\u0010W\u001a\u00020/H\u0082@¢\u0006\u0002\u0010EJ\u0010\u0010X\u001a\u00020\u00072\u0006\u0010K\u001a\u00020LH\u0002J\b\u0010Y\u001a\u00020\u0014H\u0002J\u0006\u0010Z\u001a\u00020/J\u0010\u0010[\u001a\u00020/2\u0006\u0010\\\u001a\u00020\u0005H\u0002J\u0010\u0010]\u001a\u00020/2\b\u0010\"\u001a\u0004\u0018\u00010#J\"\u0010^\u001a\u00020/2\u0006\u0010K\u001a\u00020L2\b\u0010_\u001a\u0004\u0018\u00010Q2\u0006\u0010`\u001a\u00020NH\u0002J\u0010\u0010a\u001a\u00020/2\u0006\u0010K\u001a\u00020LH\u0002J\u000e\u0010b\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u0003J0\u0010c\u001a\u00020/2\u0006\u0010B\u001a\u00020\u00102\u0006\u0010_\u001a\u00020Q2\b\u0010d\u001a\u0004\u0018\u00010Q2\u0006\u0010e\u001a\u00020NH\u0082@¢\u0006\u0002\u0010fJ\u0018\u0010g\u001a\u00020/2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010TJ\u0016\u0010h\u001a\u00020/2\u0006\u0010i\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010TJ\u000e\u0010j\u001a\u00020/H\u0082@¢\u0006\u0002\u0010EJ\b\u0010k\u001a\u00020lH\u0016J\u0016\u0010m\u001a\u00020/2\u0006\u0010$\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010nR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0004\n\u0002\u0010,R\u000e\u0010-\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006q"}, d2 = {"Lcom/onesignal/inAppMessages/internal/display/impl/InAppMessageView;", "", "webView", "Landroid/webkit/WebView;", "messageContent", "Lcom/onesignal/inAppMessages/internal/InAppMessageContent;", "disableDragDismiss", "", "hideGrayOverlay", "(Landroid/webkit/WebView;Lcom/onesignal/inAppMessages/internal/InAppMessageContent;ZZ)V", "cancelDismissTimer", "currentActivity", "Landroid/app/Activity;", "displayDuration", "", "displayPosition", "Lcom/onesignal/inAppMessages/internal/display/impl/WebViewManager$Position;", "getDisplayPosition", "()Lcom/onesignal/inAppMessages/internal/display/impl/WebViewManager$Position;", "displayYSize", "", "getDisplayYSize", "()I", "draggableRelativeLayout", "Lcom/onesignal/inAppMessages/internal/display/impl/DraggableRelativeLayout;", "hasBackground", "isDismissTimerSet", "<set-?>", "isDragging", "()Z", "marginPxSizeBottom", "marginPxSizeLeft", "marginPxSizeRight", "marginPxSizeTop", "messageController", "Lcom/onesignal/inAppMessages/internal/display/impl/InAppMessageView$InAppMessageViewListener;", "pageHeight", "pageWidth", "parentRelativeLayout", "Landroid/widget/RelativeLayout;", "popupWindow", "Lcom/onesignal/inAppMessages/internal/display/impl/OSPopupWindow;", "popupWindowListener", "com/onesignal/inAppMessages/internal/display/impl/InAppMessageView$popupWindowListener$1", "Lcom/onesignal/inAppMessages/internal/display/impl/InAppMessageView$popupWindowListener$1;", "shouldDismissWhenActive", "animateAndDismissLayout", "", "backgroundView", "Landroid/view/View;", "(Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateBackgroundColor", "Landroid/animation/ValueAnimator;", "duration", "startColor", "endColor", "animCallback", "Landroid/animation/Animator$AnimatorListener;", "animateBottom", "messageView", ViewProps.HEIGHT, "cardViewAnimCallback", "Landroid/view/animation/Animation$AnimationListener;", "animateCenter", "backgroundAnimCallback", "animateInAppMessage", WebViewManager.IAM_DISPLAY_LOCATION_KEY, "animateTop", "checkIfShouldDismiss", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanupViewsAfterDismiss", "createAnimationListener", "messageViewCardView", "Landroidx/cardview/widget/CardView;", "createCardView", "context", "Landroid/content/Context;", "createDraggableLayoutParams", "Lcom/onesignal/inAppMessages/internal/display/impl/DraggableRelativeLayout$Params;", "disableDragging", "createParentRelativeLayoutParams", "Landroid/widget/RelativeLayout$LayoutParams;", "createPopupWindow", "delayShowUntilAvailable", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dereferenceViews", "dismissAndAwaitNextMessage", "finishAfterDelay", "getHideDropShadow", "getOverlayColor", "removeAllViews", "setMarginsFromContent", UriUtil.LOCAL_CONTENT_SCHEME, "setMessageController", "setUpDraggableLayout", "relativeLayoutParams", "draggableParams", "setUpParentRelativeLayout", "setWebView", "showDraggableView", "draggableRelativeLayoutParams", "webViewLayoutParams", "(Lcom/onesignal/inAppMessages/internal/display/impl/WebViewManager$Position;Landroid/widget/RelativeLayout$LayoutParams;Landroid/widget/RelativeLayout$LayoutParams;Lcom/onesignal/inAppMessages/internal/display/impl/DraggableRelativeLayout$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showInAppMessageView", "showView", "activity", "startDismissTimerIfNeeded", "toString", "", "updateHeight", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "InAppMessageViewListener", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
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
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor("#BB000000");
    private static final int DRAG_THRESHOLD_PX_SIZE = ViewUtils.INSTANCE.dpToPx(4);

    /* compiled from: InAppMessageView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/onesignal/inAppMessages/internal/display/impl/InAppMessageView$InAppMessageViewListener;", "", "onMessageWasDismissed", "", "onMessageWasDisplayed", "onMessageWillDismiss", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InAppMessageViewListener {
        void onMessageWasDismissed();

        void onMessageWasDisplayed();

        void onMessageWillDismiss();
    }

    /* compiled from: InAppMessageView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
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

    /* JADX WARN: Type inference failed for: r2v14, types: [com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$popupWindowListener$1] */
    public InAppMessageView(WebView webView, InAppMessageContent messageContent, boolean z, boolean z2) {
        double doubleValue;
        Intrinsics.checkNotNullParameter(messageContent, "messageContent");
        this.webView = webView;
        this.messageContent = messageContent;
        this.disableDragDismiss = z;
        this.hideGrayOverlay = z2;
        this.pageWidth = -1;
        this.pageHeight = messageContent.getPageHeight();
        this.marginPxSizeLeft = ViewUtils.INSTANCE.dpToPx(24);
        this.marginPxSizeRight = ViewUtils.INSTANCE.dpToPx(24);
        this.marginPxSizeTop = ViewUtils.INSTANCE.dpToPx(24);
        this.marginPxSizeBottom = ViewUtils.INSTANCE.dpToPx(24);
        WebViewManager.Position displayLocation = messageContent.getDisplayLocation();
        Intrinsics.checkNotNull(displayLocation);
        this.displayPosition = displayLocation;
        if (messageContent.getDisplayDuration() == null) {
            doubleValue = 0.0d;
        } else {
            Double displayDuration = messageContent.getDisplayDuration();
            Intrinsics.checkNotNull(displayDuration);
            doubleValue = displayDuration.doubleValue();
        }
        this.displayDuration = doubleValue;
        this.hasBackground = !displayLocation.isBanner();
        this.popupWindowListener = new OSPopupWindow.PopupWindowListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$popupWindowListener$1
            @Override // com.onesignal.inAppMessages.internal.display.impl.OSPopupWindow.PopupWindowListener
            public void onDismiss(Boolean wasDismissedManually) {
                InAppMessageView.InAppMessageViewListener inAppMessageViewListener;
                if (Intrinsics.areEqual((Object) wasDismissedManually, (Object) true)) {
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

    public final WebViewManager.Position getDisplayPosition() {
        return this.displayPosition;
    }

    /* renamed from: isDragging, reason: from getter */
    public final boolean getIsDragging() {
        return this.isDragging;
    }

    private final void setMarginsFromContent(InAppMessageContent content) {
        this.marginPxSizeTop = content.getUseHeightMargin() ? ViewUtils.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeBottom = content.getUseHeightMargin() ? ViewUtils.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeLeft = content.getUseWidthMargin() ? ViewUtils.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeRight = content.getUseWidthMargin() ? ViewUtils.INSTANCE.dpToPx(24) : 0;
    }

    public final void setWebView(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
    }

    public final void setMessageController(InAppMessageViewListener messageController) {
        this.messageController = messageController;
    }

    public final Object showView(Activity activity, Continuation<? super Unit> continuation) {
        Object delayShowUntilAvailable = delayShowUntilAvailable(activity, continuation);
        return delayShowUntilAvailable == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delayShowUntilAvailable : Unit.INSTANCE;
    }

    public final Object checkIfShouldDismiss(Continuation<? super Unit> continuation) {
        if (this.shouldDismissWhenActive) {
            this.shouldDismissWhenActive = false;
            Object finishAfterDelay = finishAfterDelay(continuation);
            return finishAfterDelay == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? finishAfterDelay : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final Object updateHeight(int i, Continuation<? super Unit> continuation) {
        this.pageHeight = i;
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new InAppMessageView$updateHeight$2(this, i, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object showInAppMessageView(Activity activity, Continuation<? super Unit> continuation) {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams createParentRelativeLayoutParams = this.hasBackground ? createParentRelativeLayoutParams() : null;
        WebViewManager.Position position = this.displayPosition;
        Object showDraggableView = showDraggableView(position, layoutParams, createParentRelativeLayoutParams, createDraggableLayoutParams(this.pageHeight, position, this.disableDragDismiss), continuation);
        return showDraggableView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? showDraggableView : Unit.INSTANCE;
    }

    private final int getDisplayYSize() {
        ViewUtils viewUtils = ViewUtils.INSTANCE;
        Activity activity = this.currentActivity;
        Intrinsics.checkNotNull(activity);
        return viewUtils.getWindowHeight(activity);
    }

    private final RelativeLayout.LayoutParams createParentRelativeLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.pageWidth, -1);
        int i = WhenMappings.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
        if (i == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            return layoutParams;
        }
        if (i != 3 && i != 4) {
            return layoutParams;
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DraggableRelativeLayout.Params createDraggableLayoutParams(int pageHeight, WebViewManager.Position displayLocation, boolean disableDragging) {
        DraggableRelativeLayout.Params params = new DraggableRelativeLayout.Params();
        params.setMaxXPos(this.marginPxSizeRight);
        params.setMaxYPos(this.marginPxSizeTop);
        params.setDraggingDisabled(disableDragging);
        params.setMessageHeight(pageHeight);
        params.setHeight(getDisplayYSize());
        int i = WhenMappings.$EnumSwitchMapping$0[displayLocation.ordinal()];
        if (i == 1) {
            params.setDragThresholdY(this.marginPxSizeTop - DRAG_THRESHOLD_PX_SIZE);
        } else if (i == 2) {
            params.setPosY(getDisplayYSize() - pageHeight);
            params.setDragThresholdY(this.marginPxSizeBottom + DRAG_THRESHOLD_PX_SIZE);
        } else if (i == 3) {
            int displayYSize = (getDisplayYSize() / 2) - (pageHeight / 2);
            params.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize);
            params.setMaxYPos(displayYSize);
            params.setPosY(displayYSize);
        } else if (i == 4) {
            int displayYSize2 = getDisplayYSize() - (this.marginPxSizeBottom + this.marginPxSizeTop);
            params.setMessageHeight(displayYSize2);
            int displayYSize3 = (getDisplayYSize() / 2) - (displayYSize2 / 2);
            params.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize3);
            params.setMaxYPos(displayYSize3);
            params.setPosY(displayYSize3);
        }
        params.setDragDirection(displayLocation == WebViewManager.Position.TOP_BANNER ? 0 : 1);
        return params;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showDraggableView(WebViewManager.Position position, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, DraggableRelativeLayout.Params params, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new InAppMessageView$showDraggableView$2(this, layoutParams, layoutParams2, params, position, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPopupWindow(RelativeLayout parentRelativeLayout) {
        RelativeLayout relativeLayout = parentRelativeLayout;
        boolean z = this.hasBackground;
        OSPopupWindow oSPopupWindow = new OSPopupWindow(relativeLayout, z ? -1 : this.pageWidth, z ? -1 : -2, false, this.popupWindowListener);
        this.popupWindow = oSPopupWindow;
        oSPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
        OSPopupWindow oSPopupWindow2 = this.popupWindow;
        int i = 1;
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
            i = 0;
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
            if (i2 == 1) {
                i = 49;
            } else if (i2 == 2) {
                i = 81;
            } else if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        int i3 = this.messageContent.getIsFullBleed() ? 1000 : PointerIconCompat.TYPE_HELP;
        OSPopupWindow oSPopupWindow5 = this.popupWindow;
        Intrinsics.checkNotNull(oSPopupWindow5);
        PopupWindowCompat.setWindowLayoutType(oSPopupWindow5, i3);
        OSPopupWindow oSPopupWindow6 = this.popupWindow;
        if (oSPopupWindow6 != null) {
            Activity activity = this.currentActivity;
            Intrinsics.checkNotNull(activity);
            oSPopupWindow6.showAtLocation(activity.getWindow().getDecorView().getRootView(), i, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpParentRelativeLayout(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        Intrinsics.checkNotNull(relativeLayout);
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout2 = this.parentRelativeLayout;
        Intrinsics.checkNotNull(relativeLayout2);
        relativeLayout2.setClipChildren(false);
        RelativeLayout relativeLayout3 = this.parentRelativeLayout;
        Intrinsics.checkNotNull(relativeLayout3);
        relativeLayout3.setClipToPadding(false);
        RelativeLayout relativeLayout4 = this.parentRelativeLayout;
        Intrinsics.checkNotNull(relativeLayout4);
        relativeLayout4.addView(this.draggableRelativeLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpDraggableLayout(Context context, RelativeLayout.LayoutParams relativeLayoutParams, DraggableRelativeLayout.Params draggableParams) {
        DraggableRelativeLayout draggableRelativeLayout = new DraggableRelativeLayout(context);
        this.draggableRelativeLayout = draggableRelativeLayout;
        if (relativeLayoutParams != null) {
            Intrinsics.checkNotNull(draggableRelativeLayout);
            draggableRelativeLayout.setLayoutParams(relativeLayoutParams);
        }
        DraggableRelativeLayout draggableRelativeLayout2 = this.draggableRelativeLayout;
        Intrinsics.checkNotNull(draggableRelativeLayout2);
        draggableRelativeLayout2.setParams(draggableParams);
        DraggableRelativeLayout draggableRelativeLayout3 = this.draggableRelativeLayout;
        Intrinsics.checkNotNull(draggableRelativeLayout3);
        draggableRelativeLayout3.setListener(new DraggableRelativeLayout.DraggableListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$setUpDraggableLayout$1
            @Override // com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout.DraggableListener
            public void onDismiss() {
                InAppMessageView.InAppMessageViewListener inAppMessageViewListener;
                InAppMessageView.InAppMessageViewListener inAppMessageViewListener2;
                inAppMessageViewListener = InAppMessageView.this.messageController;
                if (inAppMessageViewListener != null) {
                    inAppMessageViewListener2 = InAppMessageView.this.messageController;
                    Intrinsics.checkNotNull(inAppMessageViewListener2);
                    inAppMessageViewListener2.onMessageWillDismiss();
                }
                ThreadUtilsKt.suspendifyOnIO(new InAppMessageView$setUpDraggableLayout$1$onDismiss$1(InAppMessageView.this, null));
            }

            @Override // com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout.DraggableListener
            public void onDragStart() {
                InAppMessageView.this.isDragging = true;
            }

            @Override // com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout.DraggableListener
            public void onDragEnd() {
                InAppMessageView.this.isDragging = false;
            }
        });
        WebView webView = this.webView;
        Intrinsics.checkNotNull(webView);
        if (webView.getParent() != null) {
            WebView webView2 = this.webView;
            Intrinsics.checkNotNull(webView2);
            ViewParent parent = webView2.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
        }
        CardView createCardView = createCardView(context);
        createCardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        createCardView.addView(this.webView);
        DraggableRelativeLayout draggableRelativeLayout4 = this.draggableRelativeLayout;
        Intrinsics.checkNotNull(draggableRelativeLayout4);
        draggableRelativeLayout4.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        DraggableRelativeLayout draggableRelativeLayout5 = this.draggableRelativeLayout;
        Intrinsics.checkNotNull(draggableRelativeLayout5);
        draggableRelativeLayout5.setClipChildren(false);
        DraggableRelativeLayout draggableRelativeLayout6 = this.draggableRelativeLayout;
        Intrinsics.checkNotNull(draggableRelativeLayout6);
        draggableRelativeLayout6.setClipToPadding(false);
        DraggableRelativeLayout draggableRelativeLayout7 = this.draggableRelativeLayout;
        Intrinsics.checkNotNull(draggableRelativeLayout7);
        draggableRelativeLayout7.addView(createCardView);
    }

    private final CardView createCardView(Context context) {
        CardView cardView = new CardView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.displayPosition == WebViewManager.Position.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        cardView.setLayoutParams(layoutParams);
        if (getHideDropShadow(context)) {
            cardView.setCardElevation(0.0f);
        } else {
            cardView.setCardElevation(ViewUtils.INSTANCE.dpToPx(5));
        }
        cardView.setRadius(ViewUtils.INSTANCE.dpToPx(8));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        cardView.setCardBackgroundColor(0);
        return cardView;
    }

    private final boolean getHideDropShadow(Context context) {
        return AndroidUtils.INSTANCE.getManifestMetaBoolean(context, "com.onesignal.inAppMessageHideDropShadow");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startDismissTimerIfNeeded(Continuation<? super Unit> continuation) {
        InAppMessageView$startDismissTimerIfNeeded$1 inAppMessageView$startDismissTimerIfNeeded$1;
        int i;
        InAppMessageView inAppMessageView;
        InAppMessageView inAppMessageView2;
        if (continuation instanceof InAppMessageView$startDismissTimerIfNeeded$1) {
            inAppMessageView$startDismissTimerIfNeeded$1 = (InAppMessageView$startDismissTimerIfNeeded$1) continuation;
            if ((inAppMessageView$startDismissTimerIfNeeded$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessageView$startDismissTimerIfNeeded$1.label -= Integer.MIN_VALUE;
                Object obj = inAppMessageView$startDismissTimerIfNeeded$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessageView$startDismissTimerIfNeeded$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    double d = this.displayDuration;
                    if (d <= 0.0d || this.isDismissTimerSet) {
                        return Unit.INSTANCE;
                    }
                    this.isDismissTimerSet = true;
                    inAppMessageView$startDismissTimerIfNeeded$1.L$0 = this;
                    inAppMessageView$startDismissTimerIfNeeded$1.label = 1;
                    if (DelayKt.delay(((long) d) * 1000, inAppMessageView$startDismissTimerIfNeeded$1) != coroutine_suspended) {
                        inAppMessageView = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    inAppMessageView2 = (InAppMessageView) inAppMessageView$startDismissTimerIfNeeded$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    inAppMessageView2.isDismissTimerSet = false;
                    return Unit.INSTANCE;
                }
                inAppMessageView = (InAppMessageView) inAppMessageView$startDismissTimerIfNeeded$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (!inAppMessageView.cancelDismissTimer) {
                    inAppMessageView.cancelDismissTimer = false;
                    return Unit.INSTANCE;
                }
                InAppMessageViewListener inAppMessageViewListener = inAppMessageView.messageController;
                if (inAppMessageViewListener != null) {
                    Intrinsics.checkNotNull(inAppMessageViewListener);
                    inAppMessageViewListener.onMessageWillDismiss();
                }
                if (inAppMessageView.currentActivity != null) {
                    inAppMessageView$startDismissTimerIfNeeded$1.L$0 = inAppMessageView;
                    inAppMessageView$startDismissTimerIfNeeded$1.label = 2;
                    if (inAppMessageView.dismissAndAwaitNextMessage(inAppMessageView$startDismissTimerIfNeeded$1) != coroutine_suspended) {
                        inAppMessageView2 = inAppMessageView;
                        inAppMessageView2.isDismissTimerSet = false;
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                inAppMessageView.shouldDismissWhenActive = true;
                return Unit.INSTANCE;
            }
        }
        inAppMessageView$startDismissTimerIfNeeded$1 = new InAppMessageView$startDismissTimerIfNeeded$1(this, continuation);
        Object obj2 = inAppMessageView$startDismissTimerIfNeeded$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessageView$startDismissTimerIfNeeded$1.label;
        if (i != 0) {
        }
        if (!inAppMessageView.cancelDismissTimer) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r2.delayShowUntilAvailable(r7, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (showInAppMessageView(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayShowUntilAvailable(Activity activity, Continuation<? super Unit> continuation) {
        InAppMessageView$delayShowUntilAvailable$1 inAppMessageView$delayShowUntilAvailable$1;
        int i;
        InAppMessageView inAppMessageView;
        if (continuation instanceof InAppMessageView$delayShowUntilAvailable$1) {
            inAppMessageView$delayShowUntilAvailable$1 = (InAppMessageView$delayShowUntilAvailable$1) continuation;
            if ((inAppMessageView$delayShowUntilAvailable$1.label & Integer.MIN_VALUE) != 0) {
                inAppMessageView$delayShowUntilAvailable$1.label -= Integer.MIN_VALUE;
                Object obj = inAppMessageView$delayShowUntilAvailable$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inAppMessageView$delayShowUntilAvailable$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (AndroidUtils.INSTANCE.isActivityFullyReady(activity) && this.parentRelativeLayout == null) {
                        inAppMessageView$delayShowUntilAvailable$1.label = 1;
                    } else {
                        inAppMessageView$delayShowUntilAvailable$1.L$0 = this;
                        inAppMessageView$delayShowUntilAvailable$1.L$1 = activity;
                        inAppMessageView$delayShowUntilAvailable$1.label = 2;
                        if (DelayKt.delay(200L, inAppMessageView$delayShowUntilAvailable$1) != coroutine_suspended) {
                            inAppMessageView = this;
                            inAppMessageView$delayShowUntilAvailable$1.L$0 = null;
                            inAppMessageView$delayShowUntilAvailable$1.L$1 = null;
                            inAppMessageView$delayShowUntilAvailable$1.label = 3;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                activity = (Activity) inAppMessageView$delayShowUntilAvailable$1.L$1;
                inAppMessageView = (InAppMessageView) inAppMessageView$delayShowUntilAvailable$1.L$0;
                ResultKt.throwOnFailure(obj);
                inAppMessageView$delayShowUntilAvailable$1.L$0 = null;
                inAppMessageView$delayShowUntilAvailable$1.L$1 = null;
                inAppMessageView$delayShowUntilAvailable$1.label = 3;
            }
        }
        inAppMessageView$delayShowUntilAvailable$1 = new InAppMessageView$delayShowUntilAvailable$1(this, continuation);
        Object obj2 = inAppMessageView$delayShowUntilAvailable$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inAppMessageView$delayShowUntilAvailable$1.label;
        if (i != 0) {
        }
    }

    public final Object dismissAndAwaitNextMessage(Continuation<? super Unit> continuation) {
        DraggableRelativeLayout draggableRelativeLayout = this.draggableRelativeLayout;
        if (draggableRelativeLayout == null) {
            Logging.info$default("No host presenter to trigger dismiss animation, counting as dismissed already", null, 2, null);
            dereferenceViews();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(draggableRelativeLayout);
        draggableRelativeLayout.dismiss();
        Object finishAfterDelay = finishAfterDelay(continuation);
        return finishAfterDelay == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? finishAfterDelay : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishAfterDelay(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new InAppMessageView$finishAfterDelay$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupViewsAfterDismiss() {
        removeAllViews();
        InAppMessageViewListener inAppMessageViewListener = this.messageController;
        if (inAppMessageViewListener != null) {
            inAppMessageViewListener.onMessageWasDismissed();
        }
    }

    public final void removeAllViews() {
        Logging.debug$default("InAppMessageView.removeAllViews()", null, 2, null);
        OSPopupWindow oSPopupWindow = this.popupWindow;
        if (oSPopupWindow != null) {
            oSPopupWindow.setWasDismissedManually(true);
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

    private final void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateInAppMessage(WebViewManager.Position displayLocation, View messageView, View backgroundView) {
        Intrinsics.checkNotNull(messageView);
        CardView cardView = (CardView) messageView.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        Intrinsics.checkNotNull(cardView);
        Animation.AnimationListener createAnimationListener = createAnimationListener(cardView);
        int i = WhenMappings.$EnumSwitchMapping$0[displayLocation.ordinal()];
        if (i == 1) {
            WebView webView = this.webView;
            Intrinsics.checkNotNull(webView);
            animateTop(cardView, webView.getHeight(), createAnimationListener);
        } else if (i == 2) {
            WebView webView2 = this.webView;
            Intrinsics.checkNotNull(webView2);
            animateBottom(cardView, webView2.getHeight(), createAnimationListener);
        } else if (i == 3 || i == 4) {
            animateCenter(messageView, backgroundView, createAnimationListener, null);
        }
    }

    private final Animation.AnimationListener createAnimationListener(final CardView messageViewCardView) {
        return new Animation.AnimationListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$createAnimationListener$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                InAppMessageView.InAppMessageViewListener inAppMessageViewListener;
                InAppMessageView.InAppMessageViewListener inAppMessageViewListener2;
                Intrinsics.checkNotNullParameter(animation, "animation");
                inAppMessageViewListener = this.messageController;
                if (inAppMessageViewListener != null) {
                    inAppMessageViewListener2 = this.messageController;
                    Intrinsics.checkNotNull(inAppMessageViewListener2);
                    inAppMessageViewListener2.onMessageWasDisplayed();
                }
            }
        };
    }

    private final void animateTop(View messageView, int height, Animation.AnimationListener cardViewAnimCallback) {
        OneSignalAnimate.INSTANCE.animateViewByTranslation(messageView, (-height) - this.marginPxSizeTop, 0.0f, 1000, new OneSignalBounceInterpolator(0.1d, 8.0d), cardViewAnimCallback).start();
    }

    private final void animateBottom(View messageView, int height, Animation.AnimationListener cardViewAnimCallback) {
        OneSignalAnimate.INSTANCE.animateViewByTranslation(messageView, height + this.marginPxSizeBottom, 0.0f, 1000, new OneSignalBounceInterpolator(0.1d, 8.0d), cardViewAnimCallback).start();
    }

    private final void animateCenter(View messageView, View backgroundView, Animation.AnimationListener cardViewAnimCallback, Animator.AnimatorListener backgroundAnimCallback) {
        Animation animateViewSmallToLarge = OneSignalAnimate.INSTANCE.animateViewSmallToLarge(messageView, 1000, new OneSignalBounceInterpolator(0.1d, 8.0d), cardViewAnimCallback);
        ValueAnimator animateBackgroundColor = animateBackgroundColor(backgroundView, 400, 0, getOverlayColor(), backgroundAnimCallback);
        animateViewSmallToLarge.start();
        animateBackgroundColor.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateAndDismissLayout(View view, Continuation<? super Unit> continuation) {
        final Waiter waiter = new Waiter();
        animateBackgroundColor(view, 400, getOverlayColor(), 0, new AnimatorListenerAdapter() { // from class: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$animateAndDismissLayout$animCallback$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                InAppMessageView.this.cleanupViewsAfterDismiss();
                waiter.wake();
            }
        }).start();
        Object waitForWake = waiter.waitForWake(continuation);
        return waitForWake == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? waitForWake : Unit.INSTANCE;
    }

    private final ValueAnimator animateBackgroundColor(View backgroundView, int duration, int startColor, int endColor, Animator.AnimatorListener animCallback) {
        return OneSignalAnimate.INSTANCE.animateViewColor(backgroundView, duration, startColor, endColor, animCallback);
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.currentActivity + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", displayDuration=" + this.displayDuration + ", hasBackground=" + this.hasBackground + ", shouldDismissWhenActive=" + this.shouldDismissWhenActive + ", isDragging=" + this.isDragging + ", disableDragDismiss=" + this.disableDragDismiss + ", displayLocation=" + this.displayPosition + ", webView=" + this.webView + AbstractJsonLexerKt.END_OBJ;
    }

    private final int getOverlayColor() {
        if (this.hideGrayOverlay) {
            return 0;
        }
        return ACTIVITY_BACKGROUND_COLOR_FULL;
    }
}
