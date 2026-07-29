package com.cmplay.internalpush.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.c.a.g;
import com.c.a.i;
import com.cmplay.base.util.h;
import com.cmplay.internalpush.R;
import com.cmplay.internalpush.data.e;
import com.cmplay.internalpush.j;

/* loaded from: classes.dex */
public class InsertScreenActivity extends Activity implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    g f4302a;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f4303b = null;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f4304c = null;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f4305d = null;
    private ImageView e = null;
    private ImageView f = null;
    private e g = null;
    private Bitmap h = null;
    private Bitmap i = null;

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
    }

    public void a(ImageView imageView, ImageView imageView2, boolean z, int i, float f) {
        int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
        float f2 = intrinsicWidth;
        float width = imageView.getWidth() / f2;
        float height = imageView.getHeight() / imageView.getDrawable().getIntrinsicHeight();
        if (width < height) {
            height = width;
        }
        int i2 = (int) ((f2 * height) + 0.5f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        if (z) {
            if (layoutParams.width < 0 || layoutParams.height < 0) {
                layoutParams.width = imageView2.getMeasuredWidth();
                layoutParams.height = imageView2.getMeasuredHeight();
            }
            layoutParams.width = (int) ((layoutParams.width * height) + 0.5f);
            layoutParams.height = (int) ((layoutParams.height * height) + 0.5f);
        }
        float width2 = (imageView.getWidth() * 0.5f) + 0.5f;
        if (i == 1) {
            imageView2.setX(((width2 + ((i2 * 0.5f) + 0.5f)) - imageView2.getMeasuredWidth()) - layoutParams.rightMargin);
        } else if (i == 2) {
            imageView2.setX(width2 - (imageView2.getMeasuredWidth() * 0.5f));
        }
        if (f > 0.0f) {
            imageView2.setY(imageView.getHeight() * f);
        }
    }

    @SuppressLint({"NewApi"})
    private void a(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("info_for_show");
            h.b("internal_push", "InsertScreenActivity.parseIntent strInfoForShow:" + stringExtra);
            if (!TextUtils.isEmpty(stringExtra)) {
                this.g = new e(stringExtra);
            }
            if (this.g != null) {
                if (!TextUtils.isEmpty(this.g.n())) {
                    this.h = BitmapFactory.decodeFile(this.g.n());
                    if (this.h != null) {
                        this.f4305d.setImageBitmap(this.h);
                    }
                }
                if (!TextUtils.isEmpty(this.g.o())) {
                    this.i = BitmapFactory.decodeFile(this.g.o());
                    if (this.i != null) {
                        this.e.setImageBitmap(this.i);
                        a(this.e, 1000);
                    }
                }
                this.f4305d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.cmplay.internalpush.ui.InsertScreenActivity.1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        InsertScreenActivity.this.f4305d.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        InsertScreenActivity.this.a(InsertScreenActivity.this.f4305d, InsertScreenActivity.this.e, true, 2, InsertScreenActivity.this.g != null ? (float) InsertScreenActivity.this.g.p() : 0.79f);
                        InsertScreenActivity.this.a(InsertScreenActivity.this.f4305d, InsertScreenActivity.this.f, false, 1, 0.0f);
                    }
                });
                if (this.g.g() == 4) {
                    this.e.setOnClickListener(this);
                } else {
                    this.f4303b.setOnClickListener(this);
                    this.f4304c.setOnClickListener(this);
                    this.f4305d.setOnClickListener(this);
                    this.e.setOnClickListener(this);
                }
            }
        }
        a();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(this).inflate(R.layout.activity_insert_screen, (ViewGroup) null));
        this.f4303b = (RelativeLayout) findViewById(R.id.root_view);
        this.f4303b.setId(1);
        this.f4303b.setOnClickListener(this);
        this.f4304c = (RelativeLayout) findViewById(R.id.bg_layout);
        this.f4304c.setId(5);
        this.f4304c.setOnClickListener(this);
        this.f4305d = (ImageView) findViewById(R.id.ad_bg_image);
        this.f4305d.setId(3);
        this.f4305d.setOnClickListener(this);
        this.e = (ImageView) findViewById(R.id.try_btn);
        this.e.setId(4);
        this.e.setOnClickListener(this);
        this.f = (ImageView) findViewById(R.id.close_btn);
        this.f.setId(2);
        this.f.setOnClickListener(this);
        a(getIntent());
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.f4302a != null) {
            this.f4302a.b();
        }
        if (this.h != null && !this.h.isRecycled()) {
            this.h.recycle();
            this.h = null;
            System.gc();
        }
        if (this.i != null && !this.i.isRecycled()) {
            this.i.recycle();
            this.i = null;
            System.gc();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    @SuppressLint({"NewApi"})
    public void onBackPressed() {
        super.onBackPressed();
        j.a().b(getApplicationContext(), this.g);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case 1:
            case 3:
            case 4:
            case 5:
                j.a().a(getApplicationContext(), this.g);
                finish();
                break;
            case 2:
                j.a().c(getApplicationContext(), this.g);
                finish();
                break;
        }
    }

    @SuppressLint({"NewApi"})
    public void a(View view, int i) {
        this.f4302a = g.a(view, i.a("scaleX", 1.0f, 0.7f, 1.0f), i.a("scaleY", 1.0f, 0.7f, 1.0f), i.a("alpha", 1.0f, 0.5f, 1.0f));
        this.f4302a.a(-1);
        this.f4302a.b(-1);
        this.f4302a.b(i);
        this.f4302a.a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }

    private void a() {
        if (this.g != null) {
            h.a("mInfoForShow.getDisplayType() =" + this.g.h());
            setRequestedOrientation(12 == this.g.h() ? 0 : 1);
        }
    }
}
