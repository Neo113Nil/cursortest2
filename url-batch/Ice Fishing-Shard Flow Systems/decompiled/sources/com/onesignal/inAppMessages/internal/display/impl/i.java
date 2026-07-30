package com.onesignal.inAppMessages.internal.display.impl;

import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        Intrinsics.b(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.view.View
    public boolean overScrollBy(int i2, int i5, int i7, int i8, int i9, int i10, int i11, int i12, boolean z7) {
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i5) {
    }
}
