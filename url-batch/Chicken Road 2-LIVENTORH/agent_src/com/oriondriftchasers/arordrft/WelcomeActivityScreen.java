package com.oriondriftchasers.arordrft;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.datepicker.n;
import f3.d;
import g.j;
import u2.a;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class WelcomeActivityScreen extends j {
    public static final /* synthetic */ int F = 0;
    public a E;

    @Override // g.j, a.m, c0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_welcome_screen, (ViewGroup) null, false);
        int i = R.id.app_logo_image;
        if (((ImageView) h.a.s(inflate, R.id.app_logo_image)) != null) {
            i = R.id.start_adventure_button;
            Button button = (Button) h.a.s(inflate, R.id.start_adventure_button);
            if (button != null) {
                i = R.id.welcome_subtitle_text;
                if (((TextView) h.a.s(inflate, R.id.welcome_subtitle_text)) != null) {
                    i = R.id.welcome_title_text;
                    if (((TextView) h.a.s(inflate, R.id.welcome_title_text)) != null) {
                        ScrollView scrollView = (ScrollView) inflate;
                        this.E = new a(scrollView, button);
                        setContentView(scrollView);
                        a aVar = this.E;
                        if (aVar != null) {
                            ((Button) aVar.f3355a).setOnClickListener(new n(4, this));
                            return;
                        } else {
                            d.g("bindingWelcome");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
