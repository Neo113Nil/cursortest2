package com.startapp.sdk.ads.nativead;

import android.view.View;

/* loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f3126a;

    public e(NativeAdDetails nativeAdDetails) {
        this.f3126a = nativeAdDetails;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3126a.handleClickOnView(view);
    }
}
