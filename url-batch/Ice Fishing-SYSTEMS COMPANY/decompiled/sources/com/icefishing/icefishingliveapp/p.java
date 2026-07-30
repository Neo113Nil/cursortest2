package com.icefishing.icefishingliveapp;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

/* loaded from: classes2.dex */
public final class p implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37091n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LanguageActivity f37092u;

    public /* synthetic */ p(LanguageActivity languageActivity, int i) {
        this.f37091n = i;
        this.f37092u = languageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f37091n) {
            case 0:
                LanguageActivity.e(this.f37092u, "US");
                break;
            case 1:
                LanguageActivity.e(this.f37092u, "SPAIN");
                break;
            case 2:
                LanguageActivity.e(this.f37092u, "INDIA");
                break;
            case 3:
                LanguageActivity.e(this.f37092u, "FRANCE");
                break;
            case 4:
                LanguageActivity.e(this.f37092u, "GERMANY");
                break;
            case 5:
                LanguageActivity.e(this.f37092u, "ITALY");
                break;
            case 6:
                LanguageActivity.e(this.f37092u, "ARABIA");
                break;
            case 7:
                LanguageActivity.e(this.f37092u, "OTHER");
                break;
            default:
                LanguageActivity languageActivity = this.f37092u;
                view.startAnimation(AnimationUtils.loadAnimation(languageActivity.getApplicationContext(), C5284R.anim.button_push));
                if (!languageActivity.f36960n) {
                    Toast.makeText(languageActivity, "Please select an option before proceeding.", 0).show();
                    break;
                } else {
                    try {
                        k4.m.e(languageActivity.f36951L).j(languageActivity, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new I0.j(23, this));
                        break;
                    } catch (ActivityNotFoundException e6) {
                        e6.printStackTrace();
                        return;
                    }
                }
        }
    }
}
