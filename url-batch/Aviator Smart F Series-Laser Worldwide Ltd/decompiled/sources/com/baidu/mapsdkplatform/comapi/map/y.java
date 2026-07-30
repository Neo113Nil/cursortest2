package com.baidu.mapsdkplatform.comapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.baidu.mapapi.common.SysOSUtil;

/* loaded from: classes2.dex */
public class y extends LinearLayout implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f8177a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f8178b;

    /* renamed from: c, reason: collision with root package name */
    private Context f8179c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f8180d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f8181e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f8182f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f8183g;

    /* renamed from: h, reason: collision with root package name */
    private Bitmap f8184h;

    /* renamed from: i, reason: collision with root package name */
    private Bitmap f8185i;

    /* renamed from: j, reason: collision with root package name */
    private Bitmap f8186j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f8187k;

    /* renamed from: l, reason: collision with root package name */
    private int f8188l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8189m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f8190n;

    @Deprecated
    public y(Context context) {
        super(context);
        this.f8189m = false;
        this.f8190n = false;
        this.f8179c = context;
        a();
        if (this.f8180d == null || this.f8181e == null || this.f8182f == null || this.f8183g == null) {
            return;
        }
        this.f8177a = new ImageView(this.f8179c);
        this.f8178b = new ImageView(this.f8179c);
        this.f8177a.setImageBitmap(this.f8180d);
        this.f8178b.setImageBitmap(this.f8182f);
        this.f8188l = a(this.f8182f.getHeight() / 6);
        a(this.f8177a, "main_topbtn_up.9.png");
        a(this.f8178b, "main_bottombtn_up.9.png");
        this.f8177a.setTag("BMap_ZoomIn");
        this.f8178b.setTag("BMap_ZoomOut");
        this.f8177a.setClickable(true);
        this.f8178b.setClickable(true);
        this.f8177a.setOnTouchListener(this);
        this.f8178b.setOnTouchListener(this);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(this.f8177a);
        addView(this.f8178b);
        this.f8190n = true;
    }

    private void a() {
        this.f8180d = a("main_icon_zoomin.png");
        this.f8181e = a("main_icon_zoomin_dis.png");
        this.f8182f = a("main_icon_zoomout.png");
        this.f8183g = a("main_icon_zoomout_dis.png");
    }

    private void b() {
        this.f8184h = a("wear_zoom_in.png");
        this.f8185i = a("wear_zoom_in_pressed.png");
        this.f8186j = a("wear_zoon_out.png");
        this.f8187k = a("wear_zoom_out_pressed.png");
    }

    public boolean c() {
        return this.f8190n;
    }

    public void d() {
        Bitmap bitmap = this.f8180d;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f8180d.recycle();
            this.f8180d = null;
        }
        Bitmap bitmap2 = this.f8181e;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f8181e.recycle();
            this.f8181e = null;
        }
        Bitmap bitmap3 = this.f8182f;
        if (bitmap3 != null && !bitmap3.isRecycled()) {
            this.f8182f.recycle();
            this.f8182f = null;
        }
        Bitmap bitmap4 = this.f8183g;
        if (bitmap4 != null && !bitmap4.isRecycled()) {
            this.f8183g.recycle();
            this.f8183g = null;
        }
        Bitmap bitmap5 = this.f8184h;
        if (bitmap5 != null && !bitmap5.isRecycled()) {
            this.f8184h.recycle();
            this.f8184h = null;
        }
        Bitmap bitmap6 = this.f8185i;
        if (bitmap6 != null && !bitmap6.isRecycled()) {
            this.f8185i.recycle();
            this.f8185i = null;
        }
        Bitmap bitmap7 = this.f8186j;
        if (bitmap7 != null && !bitmap7.isRecycled()) {
            this.f8186j.recycle();
            this.f8186j = null;
        }
        Bitmap bitmap8 = this.f8187k;
        if (bitmap8 == null || bitmap8.isRecycled()) {
            return;
        }
        this.f8187k.recycle();
        this.f8187k = null;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!(view instanceof ImageView)) {
            return false;
        }
        String str = (String) ((ImageView) view).getTag();
        str.hashCode();
        if (str.equals("BMap_ZoomIn")) {
            if (motionEvent.getAction() == 0) {
                if (this.f8189m) {
                    this.f8177a.setImageBitmap(this.f8185i);
                    return false;
                }
                a(this.f8177a, "main_topbtn_down.9.png");
                return false;
            }
            if (motionEvent.getAction() != 1) {
                return false;
            }
            if (this.f8189m) {
                this.f8177a.setImageBitmap(this.f8184h);
                return false;
            }
            a(this.f8177a, "main_topbtn_up.9.png");
            return false;
        }
        if (!str.equals("BMap_ZoomOut")) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            if (this.f8189m) {
                this.f8178b.setImageBitmap(this.f8187k);
                return false;
            }
            a(this.f8178b, "main_bottombtn_down.9.png");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            return false;
        }
        if (this.f8189m) {
            this.f8178b.setImageBitmap(this.f8186j);
            return false;
        }
        a(this.f8178b, "main_bottombtn_up.9.png");
        return false;
    }

    public void setIsZoomInEnabled(boolean z7) {
        ImageView imageView = this.f8177a;
        if (imageView == null) {
            return;
        }
        imageView.setEnabled(z7);
        if (z7) {
            this.f8177a.setImageBitmap(this.f8180d);
        } else {
            this.f8177a.setImageBitmap(this.f8181e);
        }
    }

    public void setIsZoomOutEnabled(boolean z7) {
        ImageView imageView = this.f8178b;
        if (imageView == null) {
            return;
        }
        imageView.setEnabled(z7);
        if (z7) {
            this.f8178b.setImageBitmap(this.f8182f);
        } else {
            this.f8178b.setImageBitmap(this.f8183g);
        }
    }

    public void setOnZoomInClickListener(View.OnClickListener onClickListener) {
        this.f8177a.setOnClickListener(onClickListener);
    }

    public void setOnZoomOutClickListener(View.OnClickListener onClickListener) {
        this.f8178b.setOnClickListener(onClickListener);
    }

    private void a(View view, String str) {
        Bitmap a8 = com.baidu.mapsdkplatform.comapi.commonutils.a.a(str, this.f8179c);
        byte[] ninePatchChunk = a8.getNinePatchChunk();
        NinePatch.isNinePatchChunk(ninePatchChunk);
        view.setBackgroundDrawable(new NinePatchDrawable(a8, ninePatchChunk, new Rect(), null));
        int i8 = this.f8188l;
        view.setPadding(i8, i8, i8, i8);
    }

    private Bitmap a(String str) {
        Matrix matrix = new Matrix();
        int densityDpi = SysOSUtil.getDensityDpi();
        if (densityDpi > 480) {
            matrix.postScale(1.8f, 1.8f);
        } else if (densityDpi > 320 && densityDpi <= 480) {
            matrix.postScale(1.5f, 1.5f);
        } else {
            matrix.postScale(1.2f, 1.2f);
        }
        Bitmap a8 = com.baidu.mapsdkplatform.comapi.commonutils.a.a(str, this.f8179c);
        if (a8 == null) {
            return null;
        }
        return Bitmap.createBitmap(a8, 0, 0, a8.getWidth(), a8.getHeight(), matrix, true);
    }

    private int a(int i8) {
        return (int) ((this.f8179c.getResources().getDisplayMetrics().density * i8) + 0.5f);
    }

    public y(Context context, boolean z7) {
        super(context);
        this.f8190n = false;
        this.f8179c = context;
        this.f8189m = z7;
        this.f8177a = new ImageView(this.f8179c);
        this.f8178b = new ImageView(this.f8179c);
        if (z7) {
            b();
            if (this.f8184h == null || this.f8185i == null || this.f8186j == null || this.f8187k == null) {
                return;
            }
            this.f8177a.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            this.f8178b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            this.f8177a.setImageBitmap(this.f8184h);
            this.f8178b.setImageBitmap(this.f8186j);
            setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            setOrientation(0);
        } else {
            a();
            Bitmap bitmap = this.f8180d;
            if (bitmap == null || this.f8181e == null || this.f8182f == null || this.f8183g == null) {
                return;
            }
            this.f8177a.setImageBitmap(bitmap);
            this.f8178b.setImageBitmap(this.f8182f);
            this.f8188l = a(this.f8182f.getHeight() / 6);
            a(this.f8177a, "main_topbtn_up.9.png");
            a(this.f8178b, "main_bottombtn_up.9.png");
            setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            setOrientation(1);
        }
        this.f8177a.setTag("BMap_ZoomIn");
        this.f8178b.setTag("BMap_ZoomOut");
        this.f8177a.setClickable(true);
        this.f8178b.setClickable(true);
        this.f8177a.setOnTouchListener(this);
        this.f8178b.setOnTouchListener(this);
        addView(this.f8177a);
        addView(this.f8178b);
        this.f8190n = true;
    }
}
