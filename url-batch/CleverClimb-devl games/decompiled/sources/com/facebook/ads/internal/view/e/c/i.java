package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class i extends com.facebook.ads.internal.view.e.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final a f5754a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5755b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5756c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5757d;
    private final AtomicBoolean e;
    private final com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.n> f;

    private static class a extends TextView {

        /* renamed from: a, reason: collision with root package name */
        private final Paint f5760a;

        /* renamed from: b, reason: collision with root package name */
        private final Paint f5761b;

        /* renamed from: c, reason: collision with root package name */
        private final RectF f5762c;

        public a(Context context) {
            super(context);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            setBackgroundColor(0);
            setTextColor(-3355444);
            setPadding((int) (displayMetrics.density * 9.0f), (int) (displayMetrics.density * 5.0f), (int) (displayMetrics.density * 9.0f), (int) (displayMetrics.density * 5.0f));
            setTextSize(18.0f);
            this.f5760a = new Paint();
            this.f5760a.setStyle(Paint.Style.STROKE);
            this.f5760a.setColor(-10066330);
            this.f5760a.setStrokeWidth(1.0f);
            this.f5760a.setAntiAlias(true);
            this.f5761b = new Paint();
            this.f5761b.setStyle(Paint.Style.FILL);
            this.f5761b.setColor(-1895825408);
            this.f5762c = new RectF();
        }

        @Override // android.widget.TextView, android.view.View
        protected void onDraw(Canvas canvas) {
            if (getText().length() == 0) {
                return;
            }
            float f = 0;
            this.f5762c.set(f, f, getWidth(), getHeight());
            canvas.drawRoundRect(this.f5762c, 6.0f, 6.0f, this.f5761b);
            float f2 = 2;
            this.f5762c.set(f2, f2, r1 - 2, r2 - 2);
            canvas.drawRoundRect(this.f5762c, 6.0f, 6.0f, this.f5760a);
            super.onDraw(canvas);
        }
    }

    public i(Context context, int i, String str, String str2) {
        super(context);
        this.f = new com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.n>() { // from class: com.facebook.ads.internal.view.e.c.i.1
            @Override // com.facebook.ads.internal.j.f
            public Class<com.facebook.ads.internal.view.e.b.n> a() {
                return com.facebook.ads.internal.view.e.b.n.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.n nVar) {
                if (i.this.e.get() || i.this.getVideoView() == null) {
                    return;
                }
                int currentPosition = i.this.f5755b - (i.this.getVideoView().getCurrentPosition() / 1000);
                if (currentPosition <= 0) {
                    i.this.f5754a.setText(i.this.f5757d);
                    i.this.e.set(true);
                    return;
                }
                i.this.f5754a.setText(i.this.f5756c + ' ' + currentPosition);
            }
        };
        this.f5755b = i;
        this.f5756c = str;
        this.f5757d = str2;
        this.e = new AtomicBoolean(false);
        this.f5754a = new a(context);
        this.f5754a.setText(this.f5756c + ' ' + i);
        addView(this.f5754a, new RelativeLayout.LayoutParams(-2, -2));
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    public void a() {
        super.a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().a((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) this.f);
        }
        this.f5754a.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.e.c.i.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!i.this.e.get()) {
                    Log.i("SkipPlugin", "User clicked skip before the ads is allowed to skip.");
                } else if (i.this.getVideoView() != null) {
                    i.this.getVideoView().e();
                }
            }
        });
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    public void b() {
        if (getVideoView() != null) {
            this.f5754a.setOnClickListener(null);
            getVideoView().getEventBus().b((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) this.f);
        }
        super.b();
    }
}
