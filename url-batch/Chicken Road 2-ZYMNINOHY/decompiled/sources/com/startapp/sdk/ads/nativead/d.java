package com.startapp.sdk.ads.nativead;

import android.view.View;

/* loaded from: classes.dex */
public final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f6208a;

    public d(NativeAdDetails nativeAdDetails) {
        this.f6208a = nativeAdDetails;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f6208a.handleClickOnView(view);
    }
}
