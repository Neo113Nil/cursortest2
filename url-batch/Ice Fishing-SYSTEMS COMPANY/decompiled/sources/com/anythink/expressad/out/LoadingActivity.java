package com.anythink.expressad.out;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.widget.ATImageView;

/* loaded from: classes.dex */
public class LoadingActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f20162b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f20163c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f20164d;

    /* renamed from: e, reason: collision with root package name */
    private a f20165e;

    /* renamed from: f, reason: collision with root package name */
    private String f20166f;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f20168h;
    private RelativeLayout i;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.d.c f20167g = new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.out.LoadingActivity.1
        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (LoadingActivity.this.f20163c == null || bitmap == null || bitmap.isRecycled() || !((String) LoadingActivity.this.f20163c.getTag()).equals(str)) {
                return;
            }
            LoadingActivity.this.f20163c.setImageBitmap(bitmap);
            LoadingActivity.this.f20164d = bitmap;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    BroadcastReceiver f20161a = new BroadcastReceiver() { // from class: com.anythink.expressad.out.LoadingActivity.2
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            LoadingActivity.this.finish();
        }
    };

    public interface a {
        void a();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("icon_url")) {
            this.f20166f = getIntent().getStringExtra("icon_url");
        }
        if (this.f20162b == null) {
            this.f20162b = new RelativeLayout(this);
            this.i = new RelativeLayout(this);
            int b9 = v.b(this, 15.0f);
            this.i.setPadding(b9, b9, b9, b9);
            this.i.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(this, "anythink_native_bg_loading_camera", com.anythink.expressad.foundation.h.k.f19790c));
            this.i.addView(new TextView(this), new RelativeLayout.LayoutParams(v.b(this, 140.0f), v.b(this, 31.5f)));
            ATImageView aTImageView = new ATImageView(this);
            this.f20163c = aTImageView;
            aTImageView.setId(v.a());
            this.f20163c.setTag(this.f20166f);
            if (!TextUtils.isEmpty(this.f20166f)) {
                com.anythink.expressad.foundation.g.d.b.a(getApplicationContext()).a(this.f20166f, this.f20167g);
            }
            int b10 = v.b(this, 64.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b10, b10);
            layoutParams.addRule(13, -1);
            this.i.addView(this.f20163c, layoutParams);
            TextView textView = new TextView(this);
            textView.setSingleLine();
            textView.setTextColor(-1);
            textView.setTextSize(16.0f);
            textView.setText("Relax while loading....");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(3, this.f20163c.getId());
            layoutParams2.addRule(14, -1);
            this.i.addView(textView, layoutParams2);
            this.f20162b.addView(this.i, new RelativeLayout.LayoutParams(-1, -1));
        }
        setContentView(this.f20162b);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.f20161a != null) {
            com.anythink.core.common.d.n.a(this).a(this.f20161a);
        }
        ImageView imageView = this.f20163c;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.f20163c = null;
        this.f20162b = null;
        this.f20167g = null;
        this.f20168h = null;
        RelativeLayout relativeLayout = this.i;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundDrawable(null);
        }
        this.i = null;
        Bitmap bitmap = this.f20164d;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f20164d = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ExitApp");
        if (this.f20161a != null) {
            com.anythink.core.common.d.n.a(this).a(this.f20161a, intentFilter);
        }
    }

    private View a() {
        if (this.f20162b == null) {
            this.f20162b = new RelativeLayout(this);
            this.i = new RelativeLayout(this);
            int b9 = v.b(this, 15.0f);
            this.i.setPadding(b9, b9, b9, b9);
            this.i.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(this, "anythink_native_bg_loading_camera", com.anythink.expressad.foundation.h.k.f19790c));
            this.i.addView(new TextView(this), new RelativeLayout.LayoutParams(v.b(this, 140.0f), v.b(this, 31.5f)));
            ATImageView aTImageView = new ATImageView(this);
            this.f20163c = aTImageView;
            aTImageView.setId(v.a());
            this.f20163c.setTag(this.f20166f);
            if (!TextUtils.isEmpty(this.f20166f)) {
                com.anythink.expressad.foundation.g.d.b.a(getApplicationContext()).a(this.f20166f, this.f20167g);
            }
            int b10 = v.b(this, 64.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b10, b10);
            layoutParams.addRule(13, -1);
            this.i.addView(this.f20163c, layoutParams);
            TextView textView = new TextView(this);
            textView.setSingleLine();
            textView.setTextColor(-1);
            textView.setTextSize(16.0f);
            textView.setText("Relax while loading....");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(3, this.f20163c.getId());
            layoutParams2.addRule(14, -1);
            this.i.addView(textView, layoutParams2);
            this.f20162b.addView(this.i, new RelativeLayout.LayoutParams(-1, -1));
        }
        return this.f20162b;
    }
}
