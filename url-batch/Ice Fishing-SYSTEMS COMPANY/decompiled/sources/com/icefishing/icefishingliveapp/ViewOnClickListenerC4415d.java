package com.icefishing.icefishingliveapp;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import g1.C4523c;

/* renamed from: com.icefishing.icefishingliveapp.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4415d implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37068n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ GenderActivity f37069u;

    public /* synthetic */ ViewOnClickListenerC4415d(GenderActivity genderActivity, int i) {
        this.f37068n = i;
        this.f37069u = genderActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f37068n) {
            case 0:
                GenderActivity.e(this.f37069u, "US");
                break;
            case 1:
                GenderActivity.e(this.f37069u, "SPAIN");
                break;
            default:
                GenderActivity genderActivity = this.f37069u;
                if (!genderActivity.f36590n) {
                    Toast.makeText(genderActivity, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    view.startAnimation(AnimationUtils.loadAnimation(genderActivity.getApplicationContext(), C5284R.anim.button_push));
                    try {
                        k4.m.e(genderActivity.f36591u).j(genderActivity, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new C4523c(19, this));
                        break;
                    } catch (ActivityNotFoundException e6) {
                        e6.printStackTrace();
                        return;
                    }
                }
        }
    }
}
