package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ay extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    protected TextView f3757a;

    /* renamed from: b, reason: collision with root package name */
    private com.chartboost.sdk.Libraries.h f3758b;

    public ay(Context context) {
        super(context);
        this.f3758b = null;
        this.f3757a = null;
    }

    public void a(com.chartboost.sdk.Libraries.h hVar) {
        if (hVar == null || !hVar.c() || this.f3758b == hVar) {
            return;
        }
        this.f3758b = hVar;
        setImageDrawable(new BitmapDrawable(hVar.d()));
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f3758b = null;
        setImageDrawable(new BitmapDrawable(bitmap));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
    }

    protected void a(Canvas canvas) {
        if (this.f3757a != null) {
            this.f3757a.layout(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f3757a.setEnabled(isEnabled());
            this.f3757a.setSelected(isSelected());
            if (isFocused()) {
                this.f3757a.requestFocus();
            } else {
                this.f3757a.clearFocus();
            }
            this.f3757a.setPressed(isPressed());
            this.f3757a.draw(canvas);
        }
    }
}
