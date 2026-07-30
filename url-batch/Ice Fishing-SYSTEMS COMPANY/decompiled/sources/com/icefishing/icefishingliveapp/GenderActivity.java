package com.icefishing.icefishingliveapp;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4553l;

/* loaded from: classes2.dex */
public class GenderActivity extends AbstractActivityC4553l {

    /* renamed from: A, reason: collision with root package name */
    public ImageView f36588A;

    /* renamed from: B, reason: collision with root package name */
    public ImageView f36589B;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36590n = false;

    /* renamed from: u, reason: collision with root package name */
    public GenderActivity f36591u = this;

    /* renamed from: v, reason: collision with root package name */
    public CardView f36592v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f36593w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f36594x;

    /* renamed from: y, reason: collision with root package name */
    public View f36595y;

    /* renamed from: z, reason: collision with root package name */
    public View f36596z;

    public static void e(GenderActivity genderActivity, String str) {
        genderActivity.f36595y.setVisibility(8);
        genderActivity.f36596z.setVisibility(8);
        genderActivity.f36588A.setImageResource(C5284R.drawable.ic_unselelct);
        genderActivity.f36589B.setImageResource(C5284R.drawable.ic_unselelct);
        genderActivity.f36590n = true;
        char c4 = !str.equals("US") ? !str.equals("SPAIN") ? (char) 65535 : (char) 1 : (char) 0;
        if (c4 == 0) {
            genderActivity.f36595y.setVisibility(0);
            genderActivity.f36588A.setImageResource(C5284R.drawable.ic_selelct);
        } else {
            if (c4 != 1) {
                return;
            }
            genderActivity.f36596z.setVisibility(0);
            genderActivity.f36589B.setImageResource(C5284R.drawable.ic_selelct);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5284R.layout.activity_gender);
        k4.m.i(this.f36591u, k4.m.f38802s, k4.m.f38794k, k4.m.f38775H, k4.m.f38778L, (ViewGroup) findViewById(C5284R.id.banner_container));
        k4.m.k(this.f36591u, k4.m.f38804u, k4.m.f38796m, k4.m.f38777K, (ViewGroup) findViewById(C5284R.id.native_ad_container));
        this.f36595y = findViewById(C5284R.id.v_us);
        this.f36596z = findViewById(C5284R.id.v_spain);
        this.f36591u = this;
        this.f36593w = (CardView) findViewById(C5284R.id.card_us);
        this.f36594x = (CardView) findViewById(C5284R.id.card_spain);
        this.f36592v = (CardView) findViewById(C5284R.id.accept);
        this.f36588A = (ImageView) findViewById(C5284R.id.iv_us_select);
        this.f36589B = (ImageView) findViewById(C5284R.id.iv_spain_select);
        this.f36593w.setOnClickListener(new ViewOnClickListenerC4415d(this, 0));
        this.f36594x.setOnClickListener(new ViewOnClickListenerC4415d(this, 1));
        this.f36592v.setOnClickListener(new ViewOnClickListenerC4415d(this, 2));
    }
}
