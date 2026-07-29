package com.cmplay.internalpush.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.c.a.g;
import com.c.a.i;
import com.cmplay.base.util.gif.GifDrawable;
import com.cmplay.base.util.gif.GifIOException;
import com.cmplay.base.util.gif.GifImageView;
import com.cmplay.base.util.h;
import com.cmplay.internalpush.R;
import com.cmplay.internalpush.data.f;
import com.cmplay.internalpush.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class OpenScreenActivity extends Activity implements View.OnClickListener {
    private static WeakReference<Activity> o;

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f4307a = null;

    /* renamed from: b, reason: collision with root package name */
    private RelativeLayout f4308b = null;

    /* renamed from: c, reason: collision with root package name */
    private GifImageView f4309c = null;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f4310d = null;
    private ImageView e = null;
    private ImageView f = null;
    private ImageView g = null;
    private LinearLayout h = null;
    private f i = null;
    private GifDrawable j = null;
    private Bitmap k = null;
    private Bitmap l = null;
    private Bitmap m = null;
    private List<g> n = new ArrayList();

    public static void a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) OpenScreenActivity.class);
        intent.putExtra("info_for_show", str);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
    
        if (r2 > r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        r4 = r3 - com.cmplay.base.util.m.a(r8, 15.0f);
        r2 = r1 - com.cmplay.base.util.m.a(r8, 15.0f);
        com.cmplay.base.util.h.a("internal_push", "parseIntent  \tmInfoForShow.getDisplayType():" + r8.i.h() + "\tbmWidth:" + r9 + "  bmHeight:" + r0 + "  screenWidth:" + r3 + "  screenHeight:" + r1 + "  bgLayoutWidth:" + r4 + "  bgLayoutHeight:" + r2);
        r1 = (r4 / r9) * r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0125, code lost:
    
        if (r1 <= r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
    
        r4 = r9 * (r2 / r0);
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012e, code lost:
    
        r9 = r8.f4308b.getLayoutParams();
        r1 = (int) r4;
        r9.width = r1;
        r2 = (int) r0;
        r9.height = r2;
        r8.f4308b.setLayoutParams(r9);
        r9 = r8.f4309c.getLayoutParams();
        r9.width = r1;
        r9.height = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
    
        if (r8.j == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014d, code lost:
    
        r8.f4309c.setImageDrawable(r8.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0157, code lost:
    
        if (r8.k == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0159, code lost:
    
        r8.f4309c.setImageBitmap(r8.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012d, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c0, code lost:
    
        if (r2 > r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(Intent intent) {
        float f;
        int i;
        double d2;
        double t;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("info_for_show");
            h.a("internal_push", "OpenScreenActivity.parseIntent strInfoForShow:" + stringExtra);
            if (!TextUtils.isEmpty(stringExtra)) {
                this.i = new f(stringExtra);
            }
            if (this.i != null) {
                float f2 = 0.0f;
                if (!TextUtils.isEmpty(this.i.q())) {
                    try {
                        this.j = new GifDrawable(this.i.q());
                        this.j.reset();
                        this.j.start();
                        f = this.j.getIntrinsicWidth();
                    } catch (GifIOException unused) {
                        f = 0.0f;
                    } catch (Exception e) {
                        e = e;
                        f = 0.0f;
                    }
                    try {
                        f2 = this.j.getIntrinsicHeight();
                    } catch (GifIOException unused2) {
                        this.k = BitmapFactory.decodeFile(this.i.q());
                        if (this.k != null) {
                            f = this.k.getWidth();
                            f2 = this.k.getHeight();
                        } else if (!isFinishing()) {
                            finish();
                        }
                        int i2 = getResources().getDisplayMetrics().widthPixels;
                        int i3 = getResources().getDisplayMetrics().heightPixels;
                        if (12 == this.i.h()) {
                        }
                        d2 = 0.21d;
                        t = this.i.t();
                        if (t > 0.0d) {
                            d2 = 1.0d - t;
                        }
                        double d3 = f2;
                        Double.isNaN(d3);
                        ((RelativeLayout.LayoutParams) this.h.getLayoutParams()).setMargins(0, 0, 0, (int) (d3 * d2));
                        if (!TextUtils.isEmpty(this.i.r())) {
                        }
                        if (!TextUtils.isEmpty(this.i.s())) {
                        }
                        if (this.i.g() == 4) {
                        }
                        this.g.setVisibility(this.i.u() ? 0 : 8);
                        b();
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        int i22 = getResources().getDisplayMetrics().widthPixels;
                        int i32 = getResources().getDisplayMetrics().heightPixels;
                        if (12 == this.i.h()) {
                        }
                        d2 = 0.21d;
                        t = this.i.t();
                        if (t > 0.0d) {
                        }
                        double d32 = f2;
                        Double.isNaN(d32);
                        ((RelativeLayout.LayoutParams) this.h.getLayoutParams()).setMargins(0, 0, 0, (int) (d32 * d2));
                        if (!TextUtils.isEmpty(this.i.r())) {
                        }
                        if (!TextUtils.isEmpty(this.i.s())) {
                        }
                        if (this.i.g() == 4) {
                        }
                        this.g.setVisibility(this.i.u() ? 0 : 8);
                        b();
                    }
                    int i222 = getResources().getDisplayMetrics().widthPixels;
                    int i322 = getResources().getDisplayMetrics().heightPixels;
                    if (12 == this.i.h()) {
                        i = i322 > i222 ? i322 : i222;
                    } else {
                        i = i322 > i222 ? i222 : i322;
                    }
                }
                d2 = 0.21d;
                t = this.i.t();
                if (t > 0.0d && t <= 1.0d) {
                    d2 = 1.0d - t;
                }
                double d322 = f2;
                Double.isNaN(d322);
                ((RelativeLayout.LayoutParams) this.h.getLayoutParams()).setMargins(0, 0, 0, (int) (d322 * d2));
                if (!TextUtils.isEmpty(this.i.r())) {
                    this.l = BitmapFactory.decodeFile(this.i.r());
                    if (this.l != null) {
                        if (this.i.k() == 3) {
                            a(f2 * 0.7f, this.f4310d, this.l);
                        } else {
                            a(f2, this.f4310d, this.l);
                        }
                        if (this.i.a()) {
                            a(this.f4310d, 1000);
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.i.s())) {
                    this.m = BitmapFactory.decodeFile(this.i.s());
                    if (this.m != null) {
                        a(f2 * 0.7f, this.e, this.m);
                        if (this.i.a()) {
                            a(this.e, 1000);
                        }
                    }
                }
                if (this.i.g() == 4) {
                    this.f4310d.setOnClickListener(this);
                } else {
                    this.f4307a.setOnClickListener(this);
                    this.f4308b.setOnClickListener(this);
                    this.f4309c.setOnClickListener(this);
                    this.f4310d.setOnClickListener(this);
                    this.e.setOnClickListener(this);
                }
                this.g.setVisibility(this.i.u() ? 0 : 8);
            }
        }
        b();
    }

    private void a(float f, ImageView imageView, Bitmap bitmap) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        double d2 = f;
        Double.isNaN(d2);
        float f2 = (float) (d2 * 0.12d);
        float f3 = width * (f2 / height);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = (int) f3;
        layoutParams.height = (int) f2;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(bitmap);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        o = new WeakReference<>(this);
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(this).inflate(R.layout.activity_open_screen, (ViewGroup) null));
        this.f4307a = (RelativeLayout) findViewById(R.id.root_view);
        this.f4307a.setId(1);
        this.f4307a.setOnClickListener(this);
        this.f4308b = (RelativeLayout) findViewById(R.id.bg_layout);
        this.f4308b.setId(5);
        this.f4308b.setOnClickListener(this);
        this.f4309c = (GifImageView) findViewById(R.id.ad_bg_image);
        this.f4309c.setId(3);
        this.f4309c.setOnClickListener(this);
        this.h = (LinearLayout) findViewById(R.id.try_parent);
        this.f4310d = (ImageView) findViewById(R.id.try_btn);
        this.f4310d.setId(4);
        this.f4310d.setOnClickListener(this);
        this.e = (ImageView) findViewById(R.id.try_btn2);
        this.e.setId(6);
        this.e.setOnClickListener(this);
        this.f = (ImageView) findViewById(R.id.close_btn);
        this.f.setId(2);
        this.f.setOnClickListener(this);
        this.g = (ImageView) findViewById(R.id.ad_tag);
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
        for (g gVar : this.n) {
            if (gVar != null) {
                gVar.b();
            }
        }
        this.n.clear();
        if (this.k != null && !this.k.isRecycled()) {
            this.k.recycle();
            this.k = null;
            System.gc();
        }
        if (this.j != null && !this.j.isRecycled()) {
            this.j.stop();
            this.j.recycle();
            this.j = null;
            System.gc();
        }
        if (this.l != null && !this.l.isRecycled()) {
            this.l.recycle();
            this.l = null;
            System.gc();
        }
        if (this.m != null && !this.m.isRecycled()) {
            this.m.recycle();
            this.m = null;
            System.gc();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    @SuppressLint({"NewApi"})
    public void onBackPressed() {
        n.a().c(getApplicationContext(), this.i);
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case 1:
            case 3:
            case 4:
            case 5:
                n.a().a(getApplicationContext(), this.i);
                finish();
                break;
            case 2:
                a();
                break;
            case 6:
                n.a().b(this, this.i);
                break;
        }
    }

    public void a() {
        n.a().d(getApplicationContext(), this.i);
        finish();
    }

    @SuppressLint({"NewApi"})
    public void a(View view, int i) {
        g a2 = g.a(view, i.a("scaleX", 1.0f, 0.7f, 1.0f), i.a("scaleY", 1.0f, 0.7f, 1.0f), i.a("alpha", 1.0f, 0.5f, 1.0f));
        a2.a(-1);
        a2.b(-1);
        a2.b(i);
        a2.a();
        this.n.add(a2);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    private void b() {
        if (this.i != null) {
            setRequestedOrientation(12 == this.i.h() ? 0 : 1);
        }
    }
}
