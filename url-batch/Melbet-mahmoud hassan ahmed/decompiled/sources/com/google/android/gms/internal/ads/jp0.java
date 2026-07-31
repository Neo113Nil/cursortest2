package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class jp0 {
    public static final void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new lp0(view, onGlobalLayoutListener).d();
    }

    public static final void b(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new mp0(view, onScrollChangedListener).d();
    }
}
