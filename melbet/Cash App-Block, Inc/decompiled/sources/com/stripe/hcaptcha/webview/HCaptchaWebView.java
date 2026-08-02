package com.stripe.hcaptcha.webview;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class HCaptchaWebView extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCaptchaWebView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onCheckIsTextEditor() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return super.onCheckIsTextEditor();
        }
        return false;
    }

    @Override // android.view.View
    public final ContentInfo onReceiveContent(ContentInfo contentInfo) {
        contentInfo.getClass();
        Log.d("TEST", "got content");
        return super.onReceiveContent(contentInfo);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCaptchaWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCaptchaWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCaptchaWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
    }
}
