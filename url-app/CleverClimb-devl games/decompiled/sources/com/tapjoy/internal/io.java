package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public final class io extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8391a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f8392b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f8393c;

    /* renamed from: d, reason: collision with root package name */
    private Rect f8394d;
    private Rect e;
    private Rect f;

    public io(Context context) {
        super(context);
        this.f8391a = false;
        this.f8392b = null;
        this.f8393c = null;
        this.f8394d = null;
        this.e = null;
        this.f = new Rect();
    }

    public final void setImageBitmap(Bitmap bitmap) {
        this.f8392b = bitmap;
        int width = this.f8392b.getWidth();
        int height = this.f8392b.getHeight();
        int i = width / 2;
        this.f8394d = new Rect(0, 0, i, height);
        this.f8393c = new Rect(i, 0, width, height);
        a();
    }

    final void a() {
        if (this.f8391a) {
            this.e = this.f8393c;
        } else {
            this.e = this.f8394d;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e == null || this.f8392b == null) {
            return;
        }
        getDrawingRect(this.f);
        canvas.drawBitmap(this.f8392b, this.e, this.f, (Paint) null);
    }
}
