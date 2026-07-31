package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class v2 extends r3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.chartboost.sdk.impl.r3, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.chartboost.sdk.impl.r3, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(@NotNull WebViewClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        super.setWebViewClient(client);
        final hh a = client instanceof w2 ? ((w2) client).a() : null;
        setOnTouchListener(new View.OnTouchListener() { // from class: com.chartboost.sdk.impl.v2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return v2.a(hh.this, view, motionEvent);
            }
        });
    }

    public static final boolean a(hh hhVar, View view, MotionEvent motionEvent) {
        if (hhVar != null) {
            Intrinsics.checkNotNull(motionEvent);
            hhVar.a(motionEvent);
        }
        return motionEvent.getAction() == 2;
    }
}
