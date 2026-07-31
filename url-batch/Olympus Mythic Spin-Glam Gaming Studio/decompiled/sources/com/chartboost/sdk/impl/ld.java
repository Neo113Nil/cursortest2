package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class ld extends ng {

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r3 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new r3(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(Context context, String html, x5 callback, oa impressionInterface, String str, pd nativeBridgeCommand, p7 eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, nativeBridgeCommand, null, eventTracker, cbWebViewFactory, 64, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        addView(getWebViewContainer());
        callback.a();
        callback.d();
    }

    @Override // com.chartboost.sdk.impl.ng, com.chartboost.sdk.impl.v4, com.chartboost.sdk.impl.cl, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.chartboost.sdk.impl.ng, com.chartboost.sdk.impl.v4, com.chartboost.sdk.impl.cl, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ ld(Context context, String str, x5 x5Var, oa oaVar, String str2, pd pdVar, p7 p7Var, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, x5Var, oaVar, str2, pdVar, p7Var, (i & 128) != 0 ? a.b : function1);
    }
}
