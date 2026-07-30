package com.just.agentweb;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public class LollipopFixedWebView extends WebView {
    public LollipopFixedWebView(Context context) {
        super(getFixedContext(context));
    }

    public static Context getFixedContext(Context context) {
        return Build.VERSION.SDK_INT < 23 ? context.createConfigurationContext(new Configuration()) : context;
    }

    public LollipopFixedWebView(Context context, AttributeSet attributeSet) {
        super(getFixedContext(context), attributeSet);
    }

    public LollipopFixedWebView(Context context, AttributeSet attributeSet, int i8) {
        super(getFixedContext(context), attributeSet, i8);
    }

    public LollipopFixedWebView(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(getFixedContext(context), attributeSet, i8, i9);
    }

    public LollipopFixedWebView(Context context, AttributeSet attributeSet, int i8, boolean z7) {
        super(getFixedContext(context), attributeSet, i8, z7);
    }
}
