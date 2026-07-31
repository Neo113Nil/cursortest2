package com.startapp.sdk.ads.nativead;

import android.view.View;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f96a;

    public d(NativeAdDetails nativeAdDetails) {
        this.f96a = nativeAdDetails;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f96a.handleClickOnView(view);
    }
}
