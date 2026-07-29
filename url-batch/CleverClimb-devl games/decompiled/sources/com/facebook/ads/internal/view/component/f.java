package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.q.a.v;

/* loaded from: classes.dex */
public class f extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private static final int f5604a = (int) (v.f5438b * 4.0f);

    /* renamed from: b, reason: collision with root package name */
    private final Path f5605b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f5606c;

    public f(Context context) {
        super(context);
        this.f5605b = new Path();
        this.f5606c = new RectF();
        v.a(this, 0);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f5606c.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f5605b.reset();
        this.f5605b.addRoundRect(this.f5606c, f5604a, f5604a, Path.Direction.CW);
        canvas.clipPath(this.f5605b);
        super.onDraw(canvas);
    }
}
