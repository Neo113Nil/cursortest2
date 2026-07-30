package com.icefishing.icefishingliveapp;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import g1.C4523c;

/* renamed from: com.icefishing.icefishingliveapp.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4412a implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37060n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AgeSelection f37061u;

    public /* synthetic */ ViewOnClickListenerC4412a(AgeSelection ageSelection, int i) {
        this.f37060n = i;
        this.f37061u = ageSelection;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f37060n) {
            case 0:
                AgeSelection.e(this.f37061u, "US");
                break;
            case 1:
                AgeSelection.e(this.f37061u, "SPAIN");
                break;
            case 2:
                AgeSelection.e(this.f37061u, "INDIA");
                break;
            case 3:
                AgeSelection.e(this.f37061u, "FRANCE");
                break;
            default:
                AgeSelection ageSelection = this.f37061u;
                view.startAnimation(AnimationUtils.loadAnimation(ageSelection.getApplicationContext(), C5284R.anim.button_push));
                if (!ageSelection.f36508n) {
                    Toast.makeText(ageSelection, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    try {
                        k4.m.e(ageSelection.f36503D).j(ageSelection, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new C4523c(18, this));
                        break;
                    } catch (ActivityNotFoundException e6) {
                        e6.printStackTrace();
                        return;
                    }
                }
        }
    }
}
