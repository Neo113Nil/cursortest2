package com.aiming.mdt.adt.interactive;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.aiming.mdt.adt.ActivityC0232;
import com.aiming.mdt.utils.webview.C0265;

/* renamed from: com.aiming.mdt.adt.interactive.ʻʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0203 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ InteractiveActivity f707;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ String f708;

    RunnableC0203(InteractiveActivity interactiveActivity, String str) {
        this.f707 = interactiveActivity;
        this.f708 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RelativeLayout relativeLayout;
        C0265 c0265;
        RelativeLayout relativeLayout2;
        relativeLayout = this.f707.titleRLayout;
        if (relativeLayout != null) {
            c0265 = ((ActivityC0232) this.f707).mAdView;
            if (c0265 != null) {
                relativeLayout2 = this.f707.titleRLayout;
                View findViewWithTag = relativeLayout2.findViewWithTag("interactive_title");
                if (findViewWithTag instanceof TextView) {
                    ((TextView) findViewWithTag).setText(this.f708);
                }
            }
        }
    }
}
