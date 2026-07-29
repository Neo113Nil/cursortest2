package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.ImageView;
import com.facebook.ads.internal.q.a.v;

/* loaded from: classes.dex */
public class e extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private static final int f5600a = (int) (v.f5438b * 8.0f);

    /* renamed from: b, reason: collision with root package name */
    private final Path f5601b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f5602c;

    /* renamed from: d, reason: collision with root package name */
    private int f5603d;

    public e(Context context) {
        super(context);
        this.f5603d = f5600a;
        this.f5601b = new Path();
        this.f5602c = new RectF();
        v.a(this, 0);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        this.f5602c.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f5601b.reset();
        this.f5601b.addRoundRect(this.f5602c, this.f5603d, this.f5603d, Path.Direction.CW);
        canvas.clipPath(this.f5601b);
        super.onDraw(canvas);
    }

    public void setRadius(int i) {
        this.f5603d = (int) (i * v.f5438b);
    }
}
