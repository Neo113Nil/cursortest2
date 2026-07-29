package com.facebook.ads.internal.view.e.c;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.q.a.v;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class o extends RelativeLayout implements com.facebook.ads.internal.view.e.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f5796a = (int) (v.f5438b * 6.0f);

    /* renamed from: b, reason: collision with root package name */
    private ObjectAnimator f5797b;

    /* renamed from: c, reason: collision with root package name */
    private AtomicInteger f5798c;

    /* renamed from: d, reason: collision with root package name */
    private ProgressBar f5799d;
    private com.facebook.ads.internal.view.e.b e;
    private com.facebook.ads.internal.j.f f;
    private com.facebook.ads.internal.j.f g;
    private com.facebook.ads.internal.j.f h;
    private com.facebook.ads.internal.j.f i;

    public o(Context context) {
        this(context, f5796a, -12549889);
    }

    public o(Context context, int i, int i2) {
        super(context);
        this.f = new com.facebook.ads.internal.view.e.b.o() { // from class: com.facebook.ads.internal.view.e.c.o.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.n nVar) {
                if (o.this.e != null) {
                    o.this.a(o.this.e.getDuration(), o.this.e.getCurrentPosition());
                }
            }
        };
        this.g = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.e.c.o.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                o.this.b();
            }
        };
        this.h = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.e.c.o.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                if (o.this.e != null) {
                    o.this.a(o.this.e.getDuration(), o.this.e.getCurrentPosition());
                }
            }
        };
        this.i = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.e.c.o.4
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                if (o.this.e != null) {
                    o.this.c();
                }
            }
        };
        this.f5798c = new AtomicInteger(-1);
        this.f5799d = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        this.f5799d.setLayoutParams(new RelativeLayout.LayoutParams(-1, i));
        setProgressBarColor(i2);
        this.f5799d.setMax(10000);
        addView(this.f5799d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        b();
        if (this.f5798c.get() >= i2 || i <= i2) {
            return;
        }
        this.f5797b = ObjectAnimator.ofInt(this.f5799d, NotificationCompat.CATEGORY_PROGRESS, (i2 * 10000) / i, (Math.min(i2 + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, i) * 10000) / i);
        this.f5797b.setDuration(Math.min(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, i - i2));
        this.f5797b.setInterpolator(new LinearInterpolator());
        this.f5797b.start();
        this.f5798c.set(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f5797b != null) {
            this.f5797b.cancel();
            this.f5797b.setTarget(null);
            this.f5797b = null;
            this.f5799d.clearAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b();
        this.f5797b = ObjectAnimator.ofInt(this.f5799d, NotificationCompat.CATEGORY_PROGRESS, 0, 0);
        this.f5797b.setDuration(0L);
        this.f5797b.setInterpolator(new LinearInterpolator());
        this.f5797b.start();
        this.f5798c.set(0);
    }

    public void a() {
        b();
        this.f5799d = null;
        this.e = null;
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void a(com.facebook.ads.internal.view.e.b bVar) {
        this.e = bVar;
        bVar.getEventBus().a(this.g, this.h, this.f, this.i);
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void b(com.facebook.ads.internal.view.e.b bVar) {
        bVar.getEventBus().b(this.f, this.h, this.g, this.i);
        this.e = null;
    }

    public void setProgressBarColor(int i) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(0), new ColorDrawable(0), new ScaleDrawable(new ColorDrawable(i), GravityCompat.START, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        this.f5799d.setProgressDrawable(layerDrawable);
    }
}
