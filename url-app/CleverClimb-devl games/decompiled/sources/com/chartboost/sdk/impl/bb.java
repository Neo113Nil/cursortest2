package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes.dex */
public abstract class bb extends View {

    /* renamed from: a, reason: collision with root package name */
    private Bitmap f3770a;

    /* renamed from: b, reason: collision with root package name */
    private Canvas f3771b;

    protected abstract void a(Canvas canvas);

    public bb(Context context) {
        super(context);
        this.f3770a = null;
        this.f3771b = null;
        a(context);
    }

    private void a(Context context) {
        try {
            getClass().getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this, 1, null);
        } catch (Exception unused) {
        }
    }

    private boolean b(Canvas canvas) {
        try {
            return ((Boolean) Canvas.class.getMethod("isHardwareAccelerated", new Class[0]).invoke(canvas, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean b2 = b(canvas);
        if (b2) {
            if (this.f3770a == null || this.f3770a.getWidth() != canvas.getWidth() || this.f3770a.getHeight() != canvas.getHeight()) {
                if (this.f3770a != null && !this.f3770a.isRecycled()) {
                    this.f3770a.recycle();
                }
                try {
                    this.f3770a = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                    this.f3771b = new Canvas(this.f3770a);
                } catch (Throwable unused) {
                    return;
                }
            }
            this.f3770a.eraseColor(0);
            canvas2 = canvas;
            canvas = this.f3771b;
        } else {
            canvas2 = null;
        }
        a(canvas);
        if (b2) {
            canvas2.drawBitmap(this.f3770a, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3770a != null && !this.f3770a.isRecycled()) {
            this.f3770a.recycle();
        }
        this.f3770a = null;
    }
}
