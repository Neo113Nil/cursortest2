package com.aiming.mdt.adt.interactive;

import android.view.View;

/* renamed from: com.aiming.mdt.adt.interactive.ʻʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0205 implements View.OnClickListener {

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ InteractiveActivity f710;

    ViewOnClickListenerC0205(InteractiveActivity interactiveActivity) {
        this.f710 = interactiveActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f710.onBackPressed();
    }
}
