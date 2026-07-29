package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class l extends com.facebook.ads.internal.view.e.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.facebook.ads.internal.view.e.b.i f5775a;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.ads.internal.view.e.b.k f5776b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.ads.internal.view.e.b.c f5777c;

    /* renamed from: d, reason: collision with root package name */
    private final m f5778d;
    private final Paint e;

    /* renamed from: com.facebook.ads.internal.view.e.c.l$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5783a = new int[com.facebook.ads.internal.view.e.d.d.values().length];

        static {
            try {
                f5783a[com.facebook.ads.internal.view.e.d.d.PREPARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5783a[com.facebook.ads.internal.view.e.d.d.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5783a[com.facebook.ads.internal.view.e.d.d.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5783a[com.facebook.ads.internal.view.e.d.d.PLAYBACK_COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5783a[com.facebook.ads.internal.view.e.d.d.STARTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(Context context) {
        this(context, false);
    }

    public l(Context context, boolean z) {
        super(context);
        this.f5775a = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.e.c.l.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                l.this.f5778d.setChecked(true);
            }
        };
        this.f5776b = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.e.c.l.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                l.this.f5778d.setChecked(false);
            }
        };
        this.f5777c = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.e.c.l.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                l.this.f5778d.setChecked(true);
            }
        };
        this.f5778d = new m(context, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        double d2 = displayMetrics.density;
        Double.isNaN(d2);
        double d3 = displayMetrics.density;
        Double.isNaN(d3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (d2 * 23.76d), (int) (d3 * 23.76d));
        layoutParams.addRule(13);
        this.f5778d.setLayoutParams(layoutParams);
        this.f5778d.setChecked(true);
        this.e = new Paint();
        this.e.setStyle(Paint.Style.FILL);
        if (z) {
            this.e.setColor(-1728053248);
        } else {
            this.e.setColor(-1);
            this.e.setAlpha(204);
        }
        setBackgroundColor(0);
        addView(this.f5778d);
        setGravity(17);
        double d4 = displayMetrics.density;
        Double.isNaN(d4);
        int i = (int) (d4 * 72.0d);
        double d5 = displayMetrics.density;
        Double.isNaN(d5);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, (int) (d5 * 72.0d));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    protected void a() {
        super.a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().a(this.f5775a, this.f5776b, this.f5777c);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.facebook.ads.internal.view.e.c.l.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (l.this.getVideoView() == null) {
                }
                switch (AnonymousClass5.f5783a[l.this.getVideoView().getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        l.this.getVideoView().a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
                        break;
                    case 5:
                        l.this.getVideoView().a(true);
                        break;
                }
            }
        };
        this.f5778d.setClickable(false);
        setOnClickListener(onClickListener);
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    protected void b() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().b(this.f5777c, this.f5776b, this.f5775a);
        }
        super.b();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(getPaddingLeft() + r0, getPaddingTop() + r0, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2, this.e);
        super.onDraw(canvas);
    }
}
