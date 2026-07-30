package com.icefishing.icefishingliveapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anythink.expressad.foundation.d.d;
import h.AbstractActivityC4553l;

/* loaded from: classes2.dex */
public class PlaygamesActivity extends AbstractActivityC4553l {

    /* renamed from: n, reason: collision with root package name */
    public ImageView f37040n;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f37041u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f37042v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f37043w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f37044x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f37045y;

    /* renamed from: z, reason: collision with root package name */
    public PlaygamesActivity f37046z;

    public PlaygamesActivity() {
        new Intent();
        this.f37041u = new Intent();
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5284R.layout.playgames);
        this.f37046z = this;
        k4.m.i(this, k4.m.f38802s, k4.m.f38794k, k4.m.f38775H, k4.m.f38778L, (ViewGroup) findViewById(C5284R.id.banner_container));
        k4.m.k(this.f37046z, k4.m.f38804u, k4.m.f38796m, k4.m.f38777K, (ViewGroup) findViewById(C5284R.id.native_ad_container));
        this.f37040n = (ImageView) findViewById(C5284R.id.imageview_down);
        this.f37042v = (TextView) findViewById(C5284R.id.text_game_title);
        this.f37044x = (TextView) findViewById(C5284R.id.tv_description);
        this.f37045y = (TextView) findViewById(C5284R.id.textview_url);
        this.f37043w = (TextView) findViewById(C5284R.id.textview_back);
        ((CardView) findViewById(C5284R.id.accept)).setOnClickListener(new z(this, 1));
        this.f37042v.setSelected(true);
        this.f37042v.setSingleLine(true);
        ((com.bumptech.glide.n) com.bumptech.glide.c.c(getApplicationContext()).k(Uri.parse(getIntent().getStringExtra(d.c.f18793e))).o()).E(this.f37040n);
        this.f37042v.setText(getIntent().getStringExtra(com.anythink.basead.exoplayer.k.o.f8603c));
        this.f37045y.setText(getIntent().getStringExtra("url"));
        this.f37043w.setText(getIntent().getStringExtra("back"));
        this.f37044x.setText(getIntent().getStringExtra("des"));
        findViewById(C5284R.id.back).setOnClickListener(new z(this, 0));
    }
}
