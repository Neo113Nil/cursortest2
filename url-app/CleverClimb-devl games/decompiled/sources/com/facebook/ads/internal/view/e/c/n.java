package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public class n extends View implements com.facebook.ads.internal.view.e.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f5790a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f5791b;

    /* renamed from: c, reason: collision with root package name */
    private float f5792c;

    /* renamed from: d, reason: collision with root package name */
    private final com.facebook.ads.internal.view.e.b.o f5793d;
    private final com.facebook.ads.internal.view.e.b.c e;
    private com.facebook.ads.internal.view.e.b f;

    public n(Context context) {
        super(context);
        this.f5793d = new com.facebook.ads.internal.view.e.b.o() { // from class: com.facebook.ads.internal.view.e.c.n.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.n nVar) {
                if (n.this.f != null) {
                    int duration = n.this.f.getDuration();
                    if (duration > 0) {
                        n.this.f5792c = n.this.f.getCurrentPosition() / duration;
                    } else {
                        n.this.f5792c = 0.0f;
                    }
                    n.this.postInvalidate();
                }
            }
        };
        this.e = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.e.c.n.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                if (n.this.f != null) {
                    n.this.f5792c = 0.0f;
                    n.this.postInvalidate();
                }
            }
        };
        this.f5790a = new Paint();
        this.f5790a.setStyle(Paint.Style.FILL);
        this.f5790a.setColor(-9528840);
        this.f5791b = new Rect();
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void a(com.facebook.ads.internal.view.e.b bVar) {
        this.f = bVar;
        bVar.getEventBus().a(this.f5793d, this.e);
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void b(com.facebook.ads.internal.view.e.b bVar) {
        bVar.getEventBus().b(this.e, this.f5793d);
        this.f = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.f5791b.set(0, 0, (int) (getWidth() * this.f5792c), getHeight());
        canvas.drawRect(this.f5791b, this.f5790a);
        super.draw(canvas);
    }
}
