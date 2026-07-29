package com.facebook.ads.internal.view.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.ads.internal.q.a.i;

/* loaded from: classes.dex */
public class b extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f5542a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f5543b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f5544c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f5545d;
    private Bitmap e;
    private Bitmap f;
    private Bitmap g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private double n;
    private double o;

    public b(Context context) {
        super(context);
        this.f5542a = new ImageView(context);
        this.f5543b = new ImageView(context);
        this.f5544c = new ImageView(context);
        a();
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5542a = new ImageView(context, attributeSet);
        this.f5543b = new ImageView(context, attributeSet);
        this.f5544c = new ImageView(context, attributeSet);
        a();
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5542a = new ImageView(context, attributeSet, i);
        this.f5543b = new ImageView(context, attributeSet, i);
        this.f5544c = new ImageView(context, attributeSet, i);
        a();
    }

    @TargetApi(21)
    public b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5542a = new ImageView(context, attributeSet, i, i2);
        this.f5543b = new ImageView(context, attributeSet, i, i2);
        this.f5544c = new ImageView(context, attributeSet, i, i2);
        a();
    }

    private void a() {
        setOrientation(1);
        this.f5542a.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(this.f5542a);
        this.f5543b.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f5543b.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(this.f5543b);
        this.f5544c.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(this.f5544c);
        i.a(this.f5542a, i.INTERNAL_AD_MEDIA);
        i.a(this.f5543b, i.INTERNAL_AD_MEDIA);
        i.a(this.f5544c, i.INTERNAL_AD_MEDIA);
    }

    private void b() {
        if (getHeight() <= 0 || getWidth() <= 0) {
            return;
        }
        double measuredWidth = getMeasuredWidth();
        double measuredHeight = getMeasuredHeight();
        Double.isNaN(measuredWidth);
        Double.isNaN(measuredHeight);
        this.o = measuredWidth / measuredHeight;
        double width = this.f5545d.getWidth();
        double height = this.f5545d.getHeight();
        Double.isNaN(width);
        Double.isNaN(height);
        this.n = width / height;
        if (this.n > this.o) {
            c();
        } else {
            d();
        }
    }

    private void c() {
        double width = getWidth();
        double d2 = this.n;
        Double.isNaN(width);
        this.j = (int) Math.round(width / d2);
        this.k = getWidth();
        this.h = (int) Math.ceil((getHeight() - this.j) / 2.0f);
        if (this.e == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        this.i = (int) Math.floor((getHeight() - this.j) / 2.0f);
        float height = this.f5545d.getHeight() / this.j;
        int min = Math.min(Math.round(this.h * height), this.e.getHeight());
        if (min > 0) {
            this.f = Bitmap.createBitmap(this.e, 0, 0, this.e.getWidth(), min, matrix, true);
            this.f5542a.setImageBitmap(this.f);
        }
        int min2 = Math.min(Math.round(this.i * height), this.e.getHeight());
        if (min2 > 0) {
            this.g = Bitmap.createBitmap(this.e, 0, this.e.getHeight() - min2, this.e.getWidth(), min2, matrix, true);
            this.f5544c.setImageBitmap(this.g);
        }
    }

    private void d() {
        double height = getHeight();
        double d2 = this.n;
        Double.isNaN(height);
        this.k = (int) Math.round(height * d2);
        this.j = getHeight();
        this.l = (int) Math.ceil((getWidth() - this.k) / 2.0f);
        if (this.e == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        this.m = (int) Math.floor((getWidth() - this.k) / 2.0f);
        float width = this.f5545d.getWidth() / this.k;
        int min = Math.min(Math.round(this.l * width), this.e.getWidth());
        if (min > 0) {
            this.f = Bitmap.createBitmap(this.e, 0, 0, min, this.e.getHeight(), matrix, true);
            this.f5542a.setImageBitmap(this.f);
        }
        int min2 = Math.min(Math.round(this.m * width), this.e.getWidth());
        if (min2 > 0) {
            this.g = Bitmap.createBitmap(this.e, this.e.getWidth() - min2, 0, min2, this.e.getHeight(), matrix, true);
            this.f5544c.setImageBitmap(this.g);
        }
    }

    private boolean e() {
        return ((this.h + this.j) + this.i == getMeasuredHeight() && (this.l + this.k) + this.m == getMeasuredWidth()) ? false : true;
    }

    public void a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 == null) {
            this.f5542a.setImageDrawable(null);
            this.f5544c.setImageDrawable(null);
        }
        if (bitmap == null) {
            this.f5543b.setImageDrawable(null);
            return;
        }
        this.f5543b.setImageBitmap(Bitmap.createBitmap(bitmap));
        this.f5545d = bitmap;
        this.e = bitmap2;
        b();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        if (this.f5545d == null) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        if (this.f == null || e()) {
            b();
        }
        if (this.n > this.o) {
            this.f5542a.layout(i, i2, i3, this.h);
            this.f5543b.layout(i, this.h + i2, i3, this.h + this.j);
            imageView = this.f5544c;
            i2 = i2 + this.h + this.j;
        } else {
            this.f5542a.layout(i, i2, this.l, i4);
            this.f5543b.layout(this.l + i, i2, this.l + this.k, i4);
            imageView = this.f5544c;
            i = i + this.l + this.k;
        }
        imageView.layout(i, i2, i3, i4);
    }
}
