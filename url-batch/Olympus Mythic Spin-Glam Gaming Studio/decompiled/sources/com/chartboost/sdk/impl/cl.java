package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.ChartboostNetworkBridge;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public abstract class cl extends RelativeLayout {
    public r3 a;
    public WebChromeClient b;
    public RelativeLayout c;
    public pe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setFocusableInTouchMode(true);
        requestFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Nullable
    public final r3 getWebView() {
        return this.a;
    }

    public final void setWebView(@Nullable r3 r3Var) {
        this.a = r3Var;
    }

    @Nullable
    public final WebChromeClient getWebChromeClient() {
        return this.b;
    }

    public final void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        this.b = webChromeClient;
    }

    @Nullable
    public final RelativeLayout getWebViewContainer() {
        return this.c;
    }

    public final void setWebViewContainer(@Nullable RelativeLayout relativeLayout) {
        this.c = relativeLayout;
    }

    @Nullable
    public final pe getLastOrientation() {
        return this.d;
    }

    public final void setLastOrientation(@Nullable pe peVar) {
        this.d = peVar;
    }

    public void a() {
        Unit unit;
        r3 r3Var = this.a;
        if (r3Var == null) {
            xb.a("Webview is null on destroyWebview", (Throwable) null, 2, (Object) null);
            return;
        }
        RelativeLayout relativeLayout = this.c;
        if (relativeLayout != null) {
            relativeLayout.removeView(r3Var);
            removeView(relativeLayout);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.a("webViewContainer is null destroyWebview", (Throwable) null, 2, (Object) null);
        }
        r3 r3Var2 = this.a;
        if (r3Var2 != null) {
            ChartboostNetworkBridge.webviewLoadUrl(r3Var2, AndroidWebViewClient.BLANK_PAGE);
            r3Var2.onPause();
            r3Var2.removeAllViews();
            r3Var2.destroy();
        }
        removeAllViews();
    }
}
