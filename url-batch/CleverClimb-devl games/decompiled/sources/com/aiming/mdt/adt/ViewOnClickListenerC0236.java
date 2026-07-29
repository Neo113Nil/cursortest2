package com.aiming.mdt.adt;

import android.view.View;

/* renamed from: com.aiming.mdt.adt.ʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnClickListenerC0236 implements View.OnClickListener {

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ AdtActivity f749;

    ViewOnClickListenerC0236(AdtActivity adtActivity) {
        this.f749 = adtActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f749.finish();
    }
}
