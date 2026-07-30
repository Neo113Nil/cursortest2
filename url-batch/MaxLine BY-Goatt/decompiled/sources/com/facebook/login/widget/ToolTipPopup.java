package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.R;
import defpackage.f7;
import defpackage.ja0;
import defpackage.k3;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ToolTipPopup {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_POPUP_DISPLAY_TIME = 6000;
    private final WeakReference<View> anchorViewRef;
    private final Context context;
    private long nuxDisplayTime;
    private PopupContentView popupContent;
    private PopupWindow popupWindow;
    private final ViewTreeObserver.OnScrollChangedListener scrollListener;
    private Style style;
    private final String text;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class PopupContentView extends FrameLayout {
        private final View bodyFrame;
        private final ImageView bottomArrow;
        final /* synthetic */ ToolTipPopup this$0;
        private final ImageView topArrow;
        private final ImageView xOut;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PopupContentView(ToolTipPopup toolTipPopup, Context context) {
            super(context);
            context.getClass();
            this.this$0 = toolTipPopup;
            LayoutInflater.from(context).inflate(R.layout.com_facebook_tooltip_bubble, this);
            View findViewById = findViewById(R.id.com_facebook_tooltip_bubble_view_top_pointer);
            findViewById.getClass();
            this.topArrow = (ImageView) findViewById;
            View findViewById2 = findViewById(R.id.com_facebook_tooltip_bubble_view_bottom_pointer);
            findViewById2.getClass();
            this.bottomArrow = (ImageView) findViewById2;
            View findViewById3 = findViewById(R.id.com_facebook_body_frame);
            findViewById3.getClass();
            this.bodyFrame = findViewById3;
            View findViewById4 = findViewById(R.id.com_facebook_button_xout);
            findViewById4.getClass();
            this.xOut = (ImageView) findViewById4;
        }

        public final View getBodyFrame() {
            return this.bodyFrame;
        }

        public final ImageView getBottomArrow() {
            return this.bottomArrow;
        }

        public final ImageView getTopArrow() {
            return this.topArrow;
        }

        public final ImageView getXOut() {
            return this.xOut;
        }

        public final void showBottomArrow() {
            this.topArrow.setVisibility(4);
            this.bottomArrow.setVisibility(0);
        }

        public final void showTopArrow() {
            this.topArrow.setVisibility(0);
            this.bottomArrow.setVisibility(4);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum Style {
        BLUE,
        BLACK
    }

    public ToolTipPopup(String str, View view) {
        str.getClass();
        view.getClass();
        this.text = str;
        this.anchorViewRef = new WeakReference<>(view);
        Context context = view.getContext();
        context.getClass();
        this.context = context;
        this.style = Style.BLUE;
        this.nuxDisplayTime = DEFAULT_POPUP_DISPLAY_TIME;
        this.scrollListener = new f7(1, this);
    }

    private final void registerObserver() {
        ViewTreeObserver viewTreeObserver;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            unregisterObserver();
            View view = this.anchorViewRef.get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnScrollChangedListener(this.scrollListener);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollListener$lambda$1(ToolTipPopup toolTipPopup) {
        PopupWindow popupWindow;
        if (CrashShieldHandler.isObjectCrashing(ToolTipPopup.class)) {
            return;
        }
        try {
            toolTipPopup.getClass();
            if (toolTipPopup.anchorViewRef.get() == null || (popupWindow = toolTipPopup.popupWindow) == null || !popupWindow.isShowing()) {
                return;
            }
            boolean isAboveAnchor = popupWindow.isAboveAnchor();
            PopupContentView popupContentView = toolTipPopup.popupContent;
            if (isAboveAnchor) {
                if (popupContentView != null) {
                    popupContentView.showBottomArrow();
                }
            } else if (popupContentView != null) {
                popupContentView.showTopArrow();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ToolTipPopup.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(ToolTipPopup toolTipPopup) {
        if (CrashShieldHandler.isObjectCrashing(ToolTipPopup.class)) {
            return;
        }
        try {
            toolTipPopup.getClass();
            toolTipPopup.dismiss();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ToolTipPopup.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$3(ToolTipPopup toolTipPopup, View view) {
        if (CrashShieldHandler.isObjectCrashing(ToolTipPopup.class)) {
            return;
        }
        try {
            toolTipPopup.getClass();
            toolTipPopup.dismiss();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ToolTipPopup.class);
        }
    }

    private final void unregisterObserver() {
        ViewTreeObserver viewTreeObserver;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            View view = this.anchorViewRef.get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnScrollChangedListener(this.scrollListener);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void updateArrows() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            PopupWindow popupWindow = this.popupWindow;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            boolean isAboveAnchor = popupWindow.isAboveAnchor();
            PopupContentView popupContentView = this.popupContent;
            if (isAboveAnchor) {
                if (popupContentView != null) {
                    popupContentView.showBottomArrow();
                }
            } else if (popupContentView != null) {
                popupContentView.showTopArrow();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void dismiss() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            unregisterObserver();
            PopupWindow popupWindow = this.popupWindow;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setNuxDisplayTime(long j) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.nuxDisplayTime = j;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setStyle(Style style) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            style.getClass();
            this.style = style;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void show() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.anchorViewRef.get() != null) {
                PopupContentView popupContentView = new PopupContentView(this, this.context);
                this.popupContent = popupContentView;
                View findViewById = popupContentView.findViewById(R.id.com_facebook_tooltip_bubble_view_text_body);
                findViewById.getClass();
                ((TextView) findViewById).setText(this.text);
                if (this.style == Style.BLUE) {
                    popupContentView.getBodyFrame().setBackgroundResource(R.drawable.com_facebook_tooltip_blue_background);
                    popupContentView.getBottomArrow().setImageResource(R.drawable.com_facebook_tooltip_blue_bottomnub);
                    popupContentView.getTopArrow().setImageResource(R.drawable.com_facebook_tooltip_blue_topnub);
                    popupContentView.getXOut().setImageResource(R.drawable.com_facebook_tooltip_blue_xout);
                } else {
                    popupContentView.getBodyFrame().setBackgroundResource(R.drawable.com_facebook_tooltip_black_background);
                    popupContentView.getBottomArrow().setImageResource(R.drawable.com_facebook_tooltip_black_bottomnub);
                    popupContentView.getTopArrow().setImageResource(R.drawable.com_facebook_tooltip_black_topnub);
                    popupContentView.getXOut().setImageResource(R.drawable.com_facebook_tooltip_black_xout);
                }
                Context context = this.context;
                context.getClass();
                View decorView = ((Activity) context).getWindow().getDecorView();
                decorView.getClass();
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                registerObserver();
                popupContentView.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                PopupWindow popupWindow = new PopupWindow(popupContentView, popupContentView.getMeasuredWidth(), popupContentView.getMeasuredHeight());
                this.popupWindow = popupWindow;
                popupWindow.showAsDropDown(this.anchorViewRef.get());
                updateArrows();
                long j = this.nuxDisplayTime;
                if (j > 0) {
                    popupContentView.postDelayed(new k3(25, this), j);
                }
                popupWindow.setTouchable(true);
                popupContentView.setOnClickListener(new ja0(3, this));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
