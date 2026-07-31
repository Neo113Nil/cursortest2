package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class kd extends WebView {
    public final GestureDetector a;
    public boolean b;

    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            kd.this.b = true;
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = new GestureDetector(context, new a());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    public final boolean getGestureDetected() {
        return this.b;
    }

    public final void a() {
        this.b = false;
    }
}
