package com.yandex.mobile.ads.unity.wrapper.banner;

import android.content.Context;
import android.os.Build;
import android.view.WindowInsets;
import android.widget.RelativeLayout;

/* loaded from: classes3.dex */
final class e extends RelativeLayout {
    public e(Context context) {
        super(context);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 35) {
            setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return super.onApplyWindowInsets(windowInsets);
    }
}
