package com.icefishing.icefishingliveapp;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

/* renamed from: com.icefishing.icefishingliveapp.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4414c implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37066n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ GameCategoriesActivity f37067u;

    public /* synthetic */ ViewOnClickListenerC4414c(GameCategoriesActivity gameCategoriesActivity, int i) {
        this.f37066n = i;
        this.f37067u = gameCategoriesActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f37066n) {
            case 0:
                GameCategoriesActivity.e(this.f37067u, "horror");
                break;
            case 1:
                GameCategoriesActivity gameCategoriesActivity = this.f37067u;
                view.startAnimation(AnimationUtils.loadAnimation(gameCategoriesActivity.getApplicationContext(), C5284R.anim.button_push));
                if (!gameCategoriesActivity.f36581n) {
                    Toast.makeText(gameCategoriesActivity, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    try {
                        k4.m.e(gameCategoriesActivity.f36571P).j(gameCategoriesActivity, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new I0.j(22, this));
                        break;
                    } catch (ActivityNotFoundException e6) {
                        e6.printStackTrace();
                        return;
                    }
                }
            case 2:
                GameCategoriesActivity.e(this.f37067u, "US");
                break;
            case 3:
                GameCategoriesActivity.e(this.f37067u, "SPAIN");
                break;
            case 4:
                GameCategoriesActivity.e(this.f37067u, "INDIA");
                break;
            case 5:
                GameCategoriesActivity.e(this.f37067u, "FRANCE");
                break;
            case 6:
                GameCategoriesActivity.e(this.f37067u, "GERMANY");
                break;
            case 7:
                GameCategoriesActivity.e(this.f37067u, "ITALY");
                break;
            case 8:
                GameCategoriesActivity.e(this.f37067u, "ARABIA");
                break;
            case 9:
                GameCategoriesActivity.e(this.f37067u, "lifestyle");
                break;
            default:
                GameCategoriesActivity.e(this.f37067u, "photo");
                break;
        }
    }
}
