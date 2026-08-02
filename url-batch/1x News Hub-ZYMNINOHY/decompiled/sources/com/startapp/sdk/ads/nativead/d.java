package com.startapp.sdk.ads.nativead;

import android.view.View;

/* loaded from: classes.dex */
public final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f3125a;

    public d(NativeAdDetails nativeAdDetails) {
        this.f3125a = nativeAdDetails;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3125a.handleClickOnView(view);
    }
}
