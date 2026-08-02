package com.startapp.sdk.ads.nativead;

import android.view.View;

/* loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f6209a;

    public e(NativeAdDetails nativeAdDetails) {
        this.f6209a = nativeAdDetails;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f6209a.handleClickOnView(view);
    }
}
