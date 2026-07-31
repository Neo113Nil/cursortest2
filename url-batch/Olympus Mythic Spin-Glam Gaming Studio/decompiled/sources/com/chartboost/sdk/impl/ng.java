package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public abstract class ng extends v4 {

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

    public static final class b extends Lambda implements Function1 {
        public final /* synthetic */ pd b;
        public final /* synthetic */ sl c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pd pdVar, sl slVar) {
            super(1);
            this.b = pdVar;
            this.c = slVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebChromeClient invoke(View container) {
            Intrinsics.checkNotNullParameter(container, "container");
            return new l3(container, this.b, this.c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(Context context, String html, x5 callback, oa impressionInterface, String str, pd nativeBridgeCommand, sl webViewCorsErrorHandler, p7 eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, eventTracker, cbWebViewFactory, new b(nativeBridgeCommand, webViewCorsErrorHandler), null, 256, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(webViewCorsErrorHandler, "webViewCorsErrorHandler");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
    }

    @Override // com.chartboost.sdk.impl.v4, com.chartboost.sdk.impl.cl, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.chartboost.sdk.impl.v4, com.chartboost.sdk.impl.cl, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ ng(Context context, String str, x5 x5Var, oa oaVar, String str2, pd pdVar, sl slVar, p7 p7Var, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, x5Var, oaVar, str2, pdVar, (i & 64) != 0 ? new sl() : slVar, p7Var, (i & 256) != 0 ? a.b : function1);
    }
}
