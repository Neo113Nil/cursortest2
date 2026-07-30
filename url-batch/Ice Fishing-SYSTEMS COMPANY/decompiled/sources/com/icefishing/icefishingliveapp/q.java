package com.icefishing.icefishingliveapp;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import g1.C4523c;

/* loaded from: classes2.dex */
public final class q implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37093n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Dialog f37094u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MWebActivity f37095v;

    public /* synthetic */ q(MWebActivity mWebActivity, Dialog dialog, int i) {
        this.f37093n = i;
        this.f37095v = mWebActivity;
        this.f37094u = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f37093n) {
            case 0:
                MWebActivity mWebActivity = this.f37095v;
                view.startAnimation(AnimationUtils.loadAnimation(mWebActivity.getApplicationContext(), C5284R.anim.button_push));
                this.f37094u.dismiss();
                mWebActivity.f36969v.reload();
                break;
            case 1:
                view.startAnimation(AnimationUtils.loadAnimation(this.f37095v.getApplicationContext(), C5284R.anim.button_push));
                this.f37094u.dismiss();
                break;
            default:
                MWebActivity mWebActivity2 = this.f37095v;
                view.startAnimation(AnimationUtils.loadAnimation(mWebActivity2.getApplicationContext(), C5284R.anim.button_push));
                try {
                    k4.m.e(mWebActivity2.f36967n).j(mWebActivity2, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new C4523c(20, this));
                    break;
                } catch (ActivityNotFoundException e6) {
                    e6.printStackTrace();
                }
        }
    }
}
