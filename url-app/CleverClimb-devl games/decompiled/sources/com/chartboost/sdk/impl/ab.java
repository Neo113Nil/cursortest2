package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.impl.av;
import com.chartboost.sdk.impl.v;
import java.util.Locale;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class ab extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    private static final CharSequence k = "00:00";

    /* renamed from: a, reason: collision with root package name */
    final RelativeLayout f3688a;

    /* renamed from: b, reason: collision with root package name */
    final aa f3689b;

    /* renamed from: c, reason: collision with root package name */
    final aa f3690c;

    /* renamed from: d, reason: collision with root package name */
    final az f3691d;
    final TextView e;
    final x f;
    final av g;
    final v h;
    final Handler i;
    final Runnable j;
    private boolean l;
    private boolean m;
    private final Runnable n;
    private final Runnable o;

    public ab(Context context, v vVar) {
        super(context);
        this.l = false;
        this.m = false;
        this.n = new Runnable() { // from class: com.chartboost.sdk.impl.ab.2
            @Override // java.lang.Runnable
            public void run() {
                ab.this.a(false);
            }
        };
        this.o = new Runnable() { // from class: com.chartboost.sdk.impl.ab.3
            @Override // java.lang.Runnable
            public void run() {
                if (ab.this.f3689b != null) {
                    ab.this.f3689b.setVisibility(8);
                }
                if (ab.this.h.M) {
                    ab.this.f.setVisibility(8);
                }
                ab.this.f3690c.setVisibility(8);
                if (ab.this.f3691d != null) {
                    ab.this.f3691d.setEnabled(false);
                }
            }
        };
        this.j = new Runnable() { // from class: com.chartboost.sdk.impl.ab.4

            /* renamed from: b, reason: collision with root package name */
            private int f3696b = 0;

            @Override // java.lang.Runnable
            public void run() {
                v.a e = ab.this.h.e();
                if (e != null) {
                    if (ab.this.g.a().e()) {
                        int d2 = ab.this.g.a().d();
                        if (d2 > 0) {
                            ab.this.h.v = d2;
                            if (ab.this.h.v / 1000.0f > 0.0f && !ab.this.h.t()) {
                                ab.this.h.r();
                                ab.this.h.a(true);
                            }
                        }
                        float c2 = d2 / ab.this.g.a().c();
                        if (ab.this.h.M) {
                            ab.this.f.a(c2);
                        }
                        int i = d2 / 1000;
                        if (this.f3696b != i) {
                            this.f3696b = i;
                            ab.this.e.setText(String.format(Locale.US, "%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(i % 60)));
                        }
                    }
                    if (e.f()) {
                        az d3 = e.d(true);
                        if (d3.getVisibility() == 8) {
                            ab.this.h.a(true, d3);
                            d3.setEnabled(true);
                        }
                    }
                    ab.this.i.removeCallbacks(ab.this.j);
                    ab.this.i.postDelayed(ab.this.j, 16L);
                }
            }
        };
        this.h = vVar;
        this.i = vVar.f3650a;
        JSONObject g = vVar.g();
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = 10.0f * f;
        int round = Math.round(f2);
        com.chartboost.sdk.g a2 = com.chartboost.sdk.g.a();
        this.g = (av) a2.a(new av(context));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        addView(this.g, layoutParams);
        this.f3688a = (RelativeLayout) a2.a(new RelativeLayout(context));
        if (g != null && !g.isNull("video-click-button")) {
            this.f3689b = (aa) a2.a(new aa(context));
            this.f3689b.setVisibility(8);
            this.f3691d = new az(context) { // from class: com.chartboost.sdk.impl.ab.1
                @Override // com.chartboost.sdk.impl.az
                protected void a(MotionEvent motionEvent) {
                    ab.this.h.b(com.chartboost.sdk.Libraries.e.a(com.chartboost.sdk.Libraries.e.a("x", Float.valueOf(motionEvent.getX())), com.chartboost.sdk.Libraries.e.a("y", Float.valueOf(motionEvent.getY())), com.chartboost.sdk.Libraries.e.a("w", Integer.valueOf(ab.this.f3691d.getWidth())), com.chartboost.sdk.Libraries.e.a("h", Integer.valueOf(ab.this.f3691d.getHeight()))));
                }
            };
            this.f3691d.a(ImageView.ScaleType.FIT_CENTER);
            com.chartboost.sdk.Libraries.h hVar = vVar.I;
            Point b2 = vVar.b("video-click-button");
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = Math.round(b2.x / hVar.e());
            layoutParams2.topMargin = Math.round(b2.y / hVar.e());
            vVar.a(layoutParams2, hVar, 1.0f);
            this.f3691d.a(hVar);
            this.f3689b.addView(this.f3691d, layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, Math.round(layoutParams2.height + f2));
            layoutParams3.addRule(10);
            this.f3688a.addView(this.f3689b, layoutParams3);
        } else {
            this.f3689b = null;
            this.f3691d = null;
        }
        this.f3690c = (aa) a2.a(new aa(context));
        this.f3690c.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, Math.round(f * 32.5f));
        layoutParams4.addRule(12);
        this.f3688a.addView(this.f3690c, layoutParams4);
        this.f3690c.setGravity(16);
        this.f3690c.setPadding(round, round, round, round);
        this.e = (TextView) a2.a(new TextView(context));
        this.e.setTextColor(-1);
        this.e.setTextSize(2, 11.0f);
        this.e.setText(k);
        this.e.setPadding(0, 0, round, 0);
        this.e.setSingleLine();
        this.e.measure(0, 0);
        int measuredWidth = this.e.getMeasuredWidth();
        this.e.setGravity(17);
        this.f3690c.addView(this.e, new LinearLayout.LayoutParams(measuredWidth, -1));
        this.f = (x) a2.a(new x(context));
        this.f.setVisibility(8);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, Math.round(f2));
        layoutParams5.setMargins(0, CBUtility.a(1, context), 0, 0);
        this.f3690c.addView(this.f, layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams6.addRule(6, this.g.getId());
        layoutParams6.addRule(8, this.g.getId());
        layoutParams6.addRule(5, this.g.getId());
        layoutParams6.addRule(7, this.g.getId());
        addView(this.f3688a, layoutParams6);
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f3691d != null) {
            this.f3691d.setEnabled(z);
        }
        if (z) {
            b(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i.removeCallbacks(this.j);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.g.a().e() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        if (this.h != null) {
            a(true);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.h.v = this.g.a().c();
        if (this.h.e() != null) {
            this.h.e().e();
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.h.w = this.g.a().c();
        this.h.e().a(true);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.h.v();
        return false;
    }

    void a(boolean z) {
        a(!this.l, z);
    }

    protected void a(boolean z, boolean z2) {
        this.i.removeCallbacks(this.n);
        this.i.removeCallbacks(this.o);
        if (this.h.y && this.h.p() && z != this.l) {
            this.l = z;
            AlphaAnimation alphaAnimation = this.l ? new AlphaAnimation(0.0f, 1.0f) : new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(z2 ? 100L : 200L);
            alphaAnimation.setFillAfter(true);
            if (!this.m && this.f3689b != null) {
                this.f3689b.setVisibility(0);
                this.f3689b.startAnimation(alphaAnimation);
                if (this.f3691d != null) {
                    this.f3691d.setEnabled(true);
                }
            }
            if (this.h.M) {
                this.f.setVisibility(0);
            }
            this.f3690c.setVisibility(0);
            this.f3690c.startAnimation(alphaAnimation);
            if (this.l) {
                this.i.postDelayed(this.n, 3000L);
            } else {
                this.i.postDelayed(this.o, alphaAnimation.getDuration());
            }
        }
    }

    public void b(boolean z) {
        this.i.removeCallbacks(this.n);
        this.i.removeCallbacks(this.o);
        if (z) {
            if (!this.m && this.f3689b != null) {
                this.f3689b.setVisibility(0);
            }
            if (this.h.M) {
                this.f.setVisibility(0);
            }
            this.f3690c.setVisibility(0);
            if (this.f3691d != null) {
                this.f3691d.setEnabled(true);
            }
        } else {
            if (this.f3689b != null) {
                this.f3689b.clearAnimation();
                this.f3689b.setVisibility(8);
            }
            this.f3690c.clearAnimation();
            if (this.h.M) {
                this.f.setVisibility(8);
            }
            this.f3690c.setVisibility(8);
            if (this.f3691d != null) {
                this.f3691d.setEnabled(false);
            }
        }
        this.l = z;
    }

    public void c(boolean z) {
        setBackgroundColor(z ? -16777216 : 0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (!z) {
            layoutParams.addRule(6, this.g.getId());
            layoutParams.addRule(8, this.g.getId());
            layoutParams.addRule(5, this.g.getId());
            layoutParams.addRule(7, this.g.getId());
        }
        this.f3688a.setLayoutParams(layoutParams);
        if (this.f3689b != null) {
            this.f3689b.setGravity(8388627);
            this.f3689b.requestLayout();
        }
    }

    public void a() {
        c(CBUtility.a(CBUtility.a()));
    }

    public av.a b() {
        return this.g.a();
    }

    public x c() {
        return this.f;
    }

    public void a(int i) {
        if (this.f3689b != null) {
            this.f3689b.setBackgroundColor(i);
        }
        this.f3690c.setBackgroundColor(i);
    }

    public void d() {
        if (this.f3689b != null) {
            this.f3689b.setVisibility(8);
        }
        this.m = true;
        if (this.f3691d != null) {
            this.f3691d.setEnabled(false);
        }
    }

    public void d(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
    }

    public void a(String str) {
        this.g.a().a((MediaPlayer.OnCompletionListener) this);
        this.g.a().a((MediaPlayer.OnErrorListener) this);
        this.g.a().a((MediaPlayer.OnPreparedListener) this);
        this.g.a().a(Uri.parse(str));
    }

    public void e() {
        this.i.postDelayed(new Runnable() { // from class: com.chartboost.sdk.impl.ab.5
            @Override // java.lang.Runnable
            public void run() {
                ab.this.g.setVisibility(0);
            }
        }, 500L);
        this.g.a().a();
        this.i.removeCallbacks(this.j);
        this.i.postDelayed(this.j, 16L);
    }

    public void f() {
        if (this.g.a().e()) {
            this.h.v = this.g.a().d();
            this.g.a().b();
        }
        if (this.h.e().e.getVisibility() == 0) {
            this.h.e().e.postInvalidate();
        }
        this.i.removeCallbacks(this.j);
    }

    public void g() {
        if (this.g.a().e()) {
            this.h.v = this.g.a().d();
        }
        this.g.a().b();
        this.i.removeCallbacks(this.j);
    }

    public void h() {
        this.g.setVisibility(8);
        invalidate();
    }
}
