package com.startapp.sdk.ads.nativead;

import android.view.View;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f97a;

    public e(NativeAdDetails nativeAdDetails) {
        this.f97a = nativeAdDetails;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f97a.handleClickOnView(view);
    }
}
