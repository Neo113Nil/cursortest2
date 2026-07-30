package com.icefishing.icefishingliveapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.viewpager.widget.ViewPager;
import g1.C4524d;

/* loaded from: classes2.dex */
public final class n implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37088n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IntroActivity f37089u;

    public /* synthetic */ n(IntroActivity introActivity, int i) {
        this.f37088n = i;
        this.f37089u = introActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f37088n) {
            case 0:
                IntroActivity introActivity = this.f37089u;
                view.startAnimation(AnimationUtils.loadAnimation(introActivity.getApplicationContext(), C5284R.anim.button_push));
                if (introActivity.f36938v.getCurrentItem() != 2) {
                    ViewPager viewPager = introActivity.f36938v;
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                    break;
                } else {
                    introActivity.f36940x = new Intent(introActivity, (Class<?>) StartActivity.class);
                    try {
                        k4.m.e(introActivity.f36937u).j(introActivity, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new C4524d(13, this));
                        break;
                    } catch (ActivityNotFoundException e6) {
                        e6.printStackTrace();
                        return;
                    }
                }
            default:
                IntroActivity introActivity2 = this.f37089u;
                view.startAnimation(AnimationUtils.loadAnimation(introActivity2.getApplicationContext(), C5284R.anim.button_push));
                introActivity2.f36940x = new Intent(introActivity2, (Class<?>) StartActivity.class);
                try {
                    k4.m.e(introActivity2.f36937u).j(introActivity2, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new h4.c(21, this));
                    break;
                } catch (ActivityNotFoundException e9) {
                    e9.printStackTrace();
                }
        }
    }
}
