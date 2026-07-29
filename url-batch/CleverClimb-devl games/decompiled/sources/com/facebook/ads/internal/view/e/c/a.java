package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class a extends com.facebook.ads.internal.view.e.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final C0357a f5689a;

    /* renamed from: com.facebook.ads.internal.view.e.c.a$a, reason: collision with other inner class name */
    public static class C0357a extends RelativeLayout {

        /* renamed from: a, reason: collision with root package name */
        private final String f5690a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5691b;

        /* renamed from: c, reason: collision with root package name */
        private final String f5692c;

        /* renamed from: d, reason: collision with root package name */
        private final DisplayMetrics f5693d;
        private ImageView e;
        private TextView f;
        private boolean g;

        /* renamed from: com.facebook.ads.internal.view.e.c.a$a$3, reason: invalid class name */
        class AnonymousClass3 implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f5698a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f5699b;

            AnonymousClass3(int i, int i2) {
                this.f5698a = i;
                this.f5699b = i2;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                new Handler().postDelayed(new Runnable() { // from class: com.facebook.ads.internal.view.e.c.a.a.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C0357a.this.g) {
                            C0357a.this.g = false;
                            Animation animation2 = new Animation() { // from class: com.facebook.ads.internal.view.e.c.a.a.3.1.1
                                @Override // android.view.animation.Animation
                                protected void applyTransformation(float f, Transformation transformation) {
                                    int i = (int) (AnonymousClass3.this.f5698a + ((AnonymousClass3.this.f5699b - AnonymousClass3.this.f5698a) * f));
                                    C0357a.this.getLayoutParams().width = i;
                                    C0357a.this.requestLayout();
                                    C0357a.this.f.getLayoutParams().width = i - AnonymousClass3.this.f5699b;
                                    C0357a.this.f.requestLayout();
                                }

                                @Override // android.view.animation.Animation
                                public boolean willChangeBounds() {
                                    return true;
                                }
                            };
                            animation2.setDuration(300L);
                            animation2.setFillAfter(true);
                            C0357a.this.startAnimation(animation2);
                        }
                    }
                }, 3000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        public C0357a(Context context, String str, String str2, float[] fArr, String str3) {
            super(context);
            this.g = false;
            this.f5690a = str;
            this.f5691b = str2;
            this.f5692c = str3;
            this.f5693d = context.getResources().getDisplayMetrics();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-16777216);
            gradientDrawable.setAlpha(178);
            gradientDrawable.setCornerRadii(new float[]{fArr[0] * this.f5693d.density, fArr[0] * this.f5693d.density, fArr[1] * this.f5693d.density, fArr[1] * this.f5693d.density, fArr[2] * this.f5693d.density, fArr[2] * this.f5693d.density, fArr[3] * this.f5693d.density, fArr[3] * this.f5693d.density});
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(gradientDrawable);
            } else {
                setBackgroundDrawable(gradientDrawable);
            }
            a();
            b();
            c();
            setMinimumWidth(Math.round(this.f5693d.density * 20.0f));
            setMinimumHeight(Math.round(this.f5693d.density * 18.0f));
        }

        private void a() {
            setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.c.a.a.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    if (!C0357a.this.g) {
                        C0357a.this.d();
                        return true;
                    }
                    if (TextUtils.isEmpty(C0357a.this.f5691b)) {
                        return true;
                    }
                    com.facebook.ads.internal.q.c.g.a(new com.facebook.ads.internal.q.c.g(), C0357a.this.getContext(), Uri.parse(C0357a.this.f5691b), C0357a.this.f5692c);
                    return true;
                }
            });
        }

        private void b() {
            this.e = new ImageView(getContext());
            this.e.setImageBitmap(com.facebook.ads.internal.q.b.c.a(com.facebook.ads.internal.q.b.b.IC_AD_CHOICES));
            addView(this.e);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(this.f5693d.density * 16.0f), Math.round(this.f5693d.density * 16.0f));
            layoutParams.addRule(9);
            layoutParams.addRule(15, -1);
            layoutParams.setMargins(Math.round(this.f5693d.density * 4.0f), Math.round(this.f5693d.density * 2.0f), Math.round(this.f5693d.density * 2.0f), Math.round(this.f5693d.density * 2.0f));
            this.e.setLayoutParams(layoutParams);
        }

        private void c() {
            this.f = new TextView(getContext());
            addView(this.f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.width = 0;
            layoutParams.leftMargin = (int) (this.f5693d.density * 20.0f);
            layoutParams.addRule(9);
            layoutParams.addRule(15, -1);
            this.f.setLayoutParams(layoutParams);
            this.f.setSingleLine();
            this.f.setText(this.f5690a);
            this.f.setTextSize(10.0f);
            this.f.setTextColor(-4341303);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            Paint paint = new Paint();
            paint.setTextSize(this.f.getTextSize());
            int round = Math.round(paint.measureText(this.f5690a) + (this.f5693d.density * 4.0f));
            final int width = getWidth();
            final int i = round + width;
            this.g = true;
            Animation animation = new Animation() { // from class: com.facebook.ads.internal.view.e.c.a.a.2
                @Override // android.view.animation.Animation
                protected void applyTransformation(float f, Transformation transformation) {
                    int i2 = (int) (width + ((i - width) * f));
                    C0357a.this.getLayoutParams().width = i2;
                    C0357a.this.requestLayout();
                    C0357a.this.f.getLayoutParams().width = i2 - width;
                    C0357a.this.f.requestLayout();
                }

                @Override // android.view.animation.Animation
                public boolean willChangeBounds() {
                    return true;
                }
            };
            animation.setAnimationListener(new AnonymousClass3(i, width));
            animation.setDuration(300L);
            animation.setFillAfter(true);
            startAnimation(animation);
        }
    }

    public a(Context context, String str, String str2, float[] fArr) {
        super(context);
        this.f5689a = new C0357a(context, "AdChoices", str, fArr, str2);
        addView(this.f5689a);
    }
}
