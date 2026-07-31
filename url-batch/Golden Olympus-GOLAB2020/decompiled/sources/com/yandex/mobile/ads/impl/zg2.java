package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zg2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final View f35591a;

    public zg2(@Nullable TextView textView) {
        this.f35591a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        View view2 = this.f35591a;
        if (view2 != null) {
            view2.performClick();
        }
    }
}
