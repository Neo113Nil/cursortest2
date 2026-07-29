package com.facebook.ads.internal.view.b;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class c extends Drawable {
    private int f;
    private int g;
    private String h;
    private int i;
    private boolean j;
    private String k;
    private String l;
    private long m;
    private WeakReference<com.facebook.ads.internal.r.a> o;

    /* renamed from: a, reason: collision with root package name */
    private final Paint f5546a = new Paint();

    /* renamed from: b, reason: collision with root package name */
    private final Paint f5547b = new Paint();

    /* renamed from: c, reason: collision with root package name */
    private final Path f5548c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final TextPaint f5549d = new TextPaint();
    private final Paint e = new Paint();
    private final Handler n = new Handler();
    private final Runnable p = new Runnable() { // from class: com.facebook.ads.internal.view.b.c.1
        @Override // java.lang.Runnable
        public void run() {
            c.this.c();
            if (c.this.j) {
                c.this.n.postDelayed(c.this.p, 250L);
            }
        }
    };

    public c() {
        this.f5546a.setColor(Color.argb(127, 36, 36, 36));
        this.f5546a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f5547b.setAntiAlias(true);
        this.f5547b.setColor(Color.argb(191, 0, 255, 0));
        this.f5547b.setStrokeWidth(20.0f);
        this.f5547b.setStyle(Paint.Style.STROKE);
        this.f5549d.setAntiAlias(true);
        this.f5549d.setColor(-1);
        this.f5549d.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f5549d.setTextSize(30.0f);
        this.e.setColor(Color.argb(212, 0, 0, 0));
        this.e.setStyle(Paint.Style.FILL_AND_STROKE);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f <= 0) {
            if (!TextUtils.isEmpty(this.k)) {
                sb.append(this.k);
                sb.append("\n");
            }
            if (!TextUtils.isEmpty(this.l)) {
                sb.append(this.l);
                sb.append("\n");
            }
            sb.append("Sdk ");
            sb.append("4.28.2");
            sb.append(", Loaded ");
            if (this.m > 0) {
                long max = Math.max(0L, System.currentTimeMillis() - this.m);
                int i = (int) (max / 3600000);
                long j = max % 3600000;
                int i2 = (int) (j / 60000);
                int i3 = (int) ((j % 60000) / 1000);
                if (i > 0) {
                    sb.append(i);
                    sb.append("h ");
                }
                if (i > 0 || i2 > 0) {
                    sb.append(i2);
                    sb.append("m ");
                }
                sb.append(i3);
                str = "s ago";
            } else {
                str = "Unknown";
            }
            sb.append(str);
        } else {
            sb.append("Card ");
            sb.append(this.g + 1);
            sb.append(" of ");
            sb.append(this.f);
        }
        sb.append("\nView: ");
        sb.append((this.o == null || this.o.get() == null) ? "Viewability Checker not set" : this.o.get().c());
        this.h = sb.toString();
        float f = -2.1474836E9f;
        for (String str2 : this.h.split("\n")) {
            f = Math.max(f, this.f5549d.measureText(str2, 0, str2.length()));
        }
        this.i = (int) (f + 0.5f);
        invalidateSelf();
    }

    public void a(int i, int i2) {
        this.f = i;
        this.g = i2;
        c();
    }

    public void a(long j) {
        this.m = j;
        c();
    }

    public void a(com.facebook.ads.internal.r.a aVar) {
        this.o = new WeakReference<>(aVar);
        c();
    }

    public void a(String str) {
        this.k = str;
        c();
    }

    public void a(boolean z) {
        this.j = z;
        if (this.j) {
            this.n.post(this.p);
        } else {
            this.n.removeCallbacks(this.p);
        }
        invalidateSelf();
    }

    public boolean a() {
        return this.j;
    }

    public void b() {
        this.f = 0;
        this.g = -1;
        this.h = "Initializing...";
        this.i = 100;
        this.k = null;
        this.m = -1L;
        this.o = null;
        a(false);
    }

    public void b(String str) {
        this.l = str;
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.j) {
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            canvas.drawRect(0.0f, 0.0f, width, height, this.f5546a);
            StaticLayout staticLayout = new StaticLayout(this.h, this.f5549d, this.i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            float width2 = staticLayout.getWidth() / 2.0f;
            float height2 = staticLayout.getHeight() / 2.0f;
            float f3 = f - width2;
            float f4 = f2 - height2;
            canvas.drawRect(f3 - 40.0f, f4 - 40.0f, f + width2 + 40.0f, f2 + height2 + 40.0f, this.e);
            canvas.save();
            canvas.translate(f3, f4);
            staticLayout.draw(canvas);
            canvas.restore();
            this.f5548c.reset();
            this.f5548c.moveTo(0.0f, 0.0f);
            this.f5548c.lineTo(width, 0.0f);
            this.f5548c.lineTo(width, height);
            this.f5548c.lineTo(0.0f, height);
            this.f5548c.lineTo(0.0f, 0.0f);
            canvas.drawPath(this.f5548c, this.f5547b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
