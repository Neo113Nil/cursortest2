package com.aiming.mdt.adt.interstitial;

import android.view.View;

/* renamed from: com.aiming.mdt.adt.interstitial.ʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0219 implements View.OnClickListener {

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ InterstitialActivity f726;

    ViewOnClickListenerC0219(InterstitialActivity interstitialActivity) {
        this.f726 = interstitialActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f726.onBackPressed();
    }
}
